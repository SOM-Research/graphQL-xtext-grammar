/*
 * generated by Xtext 2.10.0
 */
package oda.graphql.language.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GraphqlidlAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("oda/graphql/language/parser/antlr/internal/InternalGraphqlidl.tokens");
	}
}
