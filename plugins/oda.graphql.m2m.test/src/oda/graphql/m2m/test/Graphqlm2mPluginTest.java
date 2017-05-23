package oda.graphql.m2m.test;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runners.JUnit4;

import oda.graphql.m2m.Graphqlm2mPlugin;

public class Graphqlm2mPluginTest {

	@Test
	public void testTransform() {
		URI inputUri = URI.createURI("platform:/plugin/oda.graphql.m2m.test/models/inputModel-A.uml", true);
		URI outputUri = URI.createFileURI("C:\\Users\\jcanovasi\\Desktop\\outputModel-A.xmi");
		
		Graphqlm2mPlugin.getDefault().transform(inputUri, outputUri);
	}

}
