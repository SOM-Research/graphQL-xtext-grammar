package oda.graphql.m2m.test;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import oda.graphql.m2m.Graphqlm2mPlugin;

/**
 * Tests the main functions of the oda.graphql.m2m plugin (basically, the model-to-model
 * transformations)
 *
 */
public class Graphqlm2mPluginTest {
	
	/**
	 * File path for the output of the transformation
	 */
	public static String OUTPUT = "C:\\Users\\jcanovasi\\Desktop\\outputModel-A.xmi";

	@Test
	public void testTransform() {
		URI inputUri = URI.createURI("platform:/plugin/oda.graphql.m2m.test/models/inputModel-A.uml", true);
		URI outputUri = URI.createFileURI(OUTPUT);
		
		Graphqlm2mPlugin.getDefault().transform(inputUri, outputUri);
	}

}
