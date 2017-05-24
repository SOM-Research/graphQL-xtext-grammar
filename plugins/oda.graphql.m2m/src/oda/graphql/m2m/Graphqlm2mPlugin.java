package oda.graphql.m2m;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;
import org.eclipse.uml2.uml.UMLPackage;
import org.osgi.framework.BundleContext;

import oda.graphql.language.graphqlidl.GraphqlidlPackage;

/**
 * Main plugin class to execute the GraphQL transformations
 *
 */
public class Graphqlm2mPlugin extends Plugin {
	/**
	 * The plugin ID
	 */
	public static final String PLUGIN_ID = "oda.graphql.m2m"; //$NON-NLS-1$
	
	/**
	 * Singleton
	 */
	private static Graphqlm2mPlugin plugin;

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		plugin = null;
		super.stop(bundleContext);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Graphqlm2mPlugin getDefault() {
		return plugin;
	}

	/**
	 * Executes a model-to-model transformation to obtain a graphql idl instance out of a 
	 * UML model 
	 * 
	 * @param inputModel The UML model
	 * @param outputModel The GraphQL IDL model
	 */
	public void transform(URI inputModel, URI outputModel) {
		ResourceSet resourceSet = new ResourceSetImpl();
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();

		// Input Metamodel
		Metamodel mm = EmftvmFactory.eINSTANCE.createMetamodel();
		mm.setResource(resourceSet.getResource(URI.createURI(UMLPackage.eNS_URI), true));
		env.registerMetaModel("MM", mm);
		
		// Input Model
		Model input = EmftvmFactory.eINSTANCE.createModel();
		input.setResource(resourceSet.getResource(inputModel, true));
		env.registerInputModel("IN", input);

		// Output Metamodel
		Metamodel mm1 = EmftvmFactory.eINSTANCE.createMetamodel();
		mm1.setResource(resourceSet.getResource(URI.createURI(GraphqlidlPackage.eNS_URI), true));
		env.registerMetaModel("MM1", mm1);
		
		// Output Model
		Model output = EmftvmFactory.eINSTANCE.createModel();
		output.setResource(resourceSet.createResource(outputModel));
		env.registerOutputModel("OUT", output);

		//URI transfo = URI.createPlatformPluginURI("/oda.graphql.m2m/transformations/uml2graphqlidl.emftvm", true);
		ModuleResolver mr = new DefaultModuleResolver("platform:/plugin/oda.graphql.m2m/transformations/", new ResourceSetImpl());

		TimingData td = new TimingData();
		env.loadModule(mr, "uml2graphqlidl");
		td.finishLoading();
		env.run(td);
		td.finish();

		try {
			for (Model model : env.getOutputModels().values()) {
				model.getResource().save(Collections.emptyMap());
			}
		} catch(IOException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
}
