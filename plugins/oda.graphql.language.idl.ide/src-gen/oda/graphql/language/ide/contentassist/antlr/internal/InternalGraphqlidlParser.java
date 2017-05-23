package oda.graphql.language.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import oda.graphql.language.services.GraphqlidlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGraphqlidlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NONZERODIGIT", "RULE_INT", "RULE_STRING", "RULE_NAME", "RULE_SCALAR", "RULE_BOOLEANVALUE", "RULE_NULLVALUE", "RULE_ENUM_VALUE", "RULE_COMMA", "RULE_COMMENT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'e'", "'E'", "'+'", "'{'", "'}'", "'mutation'", "':'", "'subscription'", "'type'", "'implements'", "'interface'", "'scalar'", "'enum'", "'union'", "'='", "'|'", "'input'", "'('", "')'", "'['", "']'", "'0'", "'.'", "'\"'", "'schema'", "'query'", "'!'"
    };
    public static final int RULE_ENUM_VALUE=11;
    public static final int RULE_SCALAR=8;
    public static final int T__19=19;
    public static final int RULE_NULLVALUE=10;
    public static final int RULE_NONZERODIGIT=4;
    public static final int RULE_ID=14;
    public static final int RULE_COMMA=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NAME=7;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=17;
    public static final int RULE_COMMENT=13;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_BOOLEANVALUE=9;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGraphqlidlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphqlidlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphqlidlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGraphqlidl.g"; }


    	private GraphqlidlGrammarAccess grammarAccess;

    	public void setGrammarAccess(GraphqlidlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGraphqlSchema"
    // InternalGraphqlidl.g:53:1: entryRuleGraphqlSchema : ruleGraphqlSchema EOF ;
    public final void entryRuleGraphqlSchema() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:54:1: ( ruleGraphqlSchema EOF )
            // InternalGraphqlidl.g:55:1: ruleGraphqlSchema EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlSchema();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlSchema"


    // $ANTLR start "ruleGraphqlSchema"
    // InternalGraphqlidl.g:62:1: ruleGraphqlSchema : ( ( rule__GraphqlSchema__UnorderedGroup ) ) ;
    public final void ruleGraphqlSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:66:2: ( ( ( rule__GraphqlSchema__UnorderedGroup ) ) )
            // InternalGraphqlidl.g:67:2: ( ( rule__GraphqlSchema__UnorderedGroup ) )
            {
            // InternalGraphqlidl.g:67:2: ( ( rule__GraphqlSchema__UnorderedGroup ) )
            // InternalGraphqlidl.g:68:3: ( rule__GraphqlSchema__UnorderedGroup )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup()); 
            }
            // InternalGraphqlidl.g:69:3: ( rule__GraphqlSchema__UnorderedGroup )
            // InternalGraphqlidl.g:69:4: rule__GraphqlSchema__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlSchema__UnorderedGroup();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlSchema"


    // $ANTLR start "entryRuleGraphqlSchemaDefinition"
    // InternalGraphqlidl.g:78:1: entryRuleGraphqlSchemaDefinition : ruleGraphqlSchemaDefinition EOF ;
    public final void entryRuleGraphqlSchemaDefinition() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:79:1: ( ruleGraphqlSchemaDefinition EOF )
            // InternalGraphqlidl.g:80:1: ruleGraphqlSchemaDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlSchemaDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlSchemaDefinition"


    // $ANTLR start "ruleGraphqlSchemaDefinition"
    // InternalGraphqlidl.g:87:1: ruleGraphqlSchemaDefinition : ( ( rule__GraphqlSchemaDefinition__Group__0 ) ) ;
    public final void ruleGraphqlSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:91:2: ( ( ( rule__GraphqlSchemaDefinition__Group__0 ) ) )
            // InternalGraphqlidl.g:92:2: ( ( rule__GraphqlSchemaDefinition__Group__0 ) )
            {
            // InternalGraphqlidl.g:92:2: ( ( rule__GraphqlSchemaDefinition__Group__0 ) )
            // InternalGraphqlidl.g:93:3: ( rule__GraphqlSchemaDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:94:3: ( rule__GraphqlSchemaDefinition__Group__0 )
            // InternalGraphqlidl.g:94:4: rule__GraphqlSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlSchemaDefinition"


    // $ANTLR start "entryRuleGraphqlRootQuery"
    // InternalGraphqlidl.g:103:1: entryRuleGraphqlRootQuery : ruleGraphqlRootQuery EOF ;
    public final void entryRuleGraphqlRootQuery() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:104:1: ( ruleGraphqlRootQuery EOF )
            // InternalGraphqlidl.g:105:1: ruleGraphqlRootQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlRootQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlRootQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlRootQueryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlRootQuery"


    // $ANTLR start "ruleGraphqlRootQuery"
    // InternalGraphqlidl.g:112:1: ruleGraphqlRootQuery : ( ( rule__GraphqlRootQuery__Group__0 ) ) ;
    public final void ruleGraphqlRootQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:116:2: ( ( ( rule__GraphqlRootQuery__Group__0 ) ) )
            // InternalGraphqlidl.g:117:2: ( ( rule__GraphqlRootQuery__Group__0 ) )
            {
            // InternalGraphqlidl.g:117:2: ( ( rule__GraphqlRootQuery__Group__0 ) )
            // InternalGraphqlidl.g:118:3: ( rule__GraphqlRootQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlRootQueryAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:119:3: ( rule__GraphqlRootQuery__Group__0 )
            // InternalGraphqlidl.g:119:4: rule__GraphqlRootQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlRootQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlRootQueryAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlRootQuery"


    // $ANTLR start "entryRuleGraphqlTypeDefinition"
    // InternalGraphqlidl.g:128:1: entryRuleGraphqlTypeDefinition : ruleGraphqlTypeDefinition EOF ;
    public final void entryRuleGraphqlTypeDefinition() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:129:1: ( ruleGraphqlTypeDefinition EOF )
            // InternalGraphqlidl.g:130:1: ruleGraphqlTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlTypeDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlTypeDefinition"


    // $ANTLR start "ruleGraphqlTypeDefinition"
    // InternalGraphqlidl.g:137:1: ruleGraphqlTypeDefinition : ( ( rule__GraphqlTypeDefinition__Alternatives ) ) ;
    public final void ruleGraphqlTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:141:2: ( ( ( rule__GraphqlTypeDefinition__Alternatives ) ) )
            // InternalGraphqlidl.g:142:2: ( ( rule__GraphqlTypeDefinition__Alternatives ) )
            {
            // InternalGraphqlidl.g:142:2: ( ( rule__GraphqlTypeDefinition__Alternatives ) )
            // InternalGraphqlidl.g:143:3: ( rule__GraphqlTypeDefinition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeDefinitionAccess().getAlternatives()); 
            }
            // InternalGraphqlidl.g:144:3: ( rule__GraphqlTypeDefinition__Alternatives )
            // InternalGraphqlidl.g:144:4: rule__GraphqlTypeDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlTypeDefinition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeDefinitionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlTypeDefinition"


    // $ANTLR start "entryRuleGraphqlObjectTypeDefinition"
    // InternalGraphqlidl.g:153:1: entryRuleGraphqlObjectTypeDefinition : ruleGraphqlObjectTypeDefinition EOF ;
    public final void entryRuleGraphqlObjectTypeDefinition() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:154:1: ( ruleGraphqlObjectTypeDefinition EOF )
            // InternalGraphqlidl.g:155:1: ruleGraphqlObjectTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlObjectTypeDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlObjectTypeDefinition"


    // $ANTLR start "ruleGraphqlObjectTypeDefinition"
    // InternalGraphqlidl.g:162:1: ruleGraphqlObjectTypeDefinition : ( ( rule__GraphqlObjectTypeDefinition__Group__0 ) ) ;
    public final void ruleGraphqlObjectTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:166:2: ( ( ( rule__GraphqlObjectTypeDefinition__Group__0 ) ) )
            // InternalGraphqlidl.g:167:2: ( ( rule__GraphqlObjectTypeDefinition__Group__0 ) )
            {
            // InternalGraphqlidl.g:167:2: ( ( rule__GraphqlObjectTypeDefinition__Group__0 ) )
            // InternalGraphqlidl.g:168:3: ( rule__GraphqlObjectTypeDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:169:3: ( rule__GraphqlObjectTypeDefinition__Group__0 )
            // InternalGraphqlidl.g:169:4: rule__GraphqlObjectTypeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlObjectTypeDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlObjectTypeDefinition"


    // $ANTLR start "entryRuleGraphqlInterfaceTypeDefinition"
    // InternalGraphqlidl.g:178:1: entryRuleGraphqlInterfaceTypeDefinition : ruleGraphqlInterfaceTypeDefinition EOF ;
    public final void entryRuleGraphqlInterfaceTypeDefinition() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:179:1: ( ruleGraphqlInterfaceTypeDefinition EOF )
            // InternalGraphqlidl.g:180:1: ruleGraphqlInterfaceTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInterfaceTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlInterfaceTypeDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInterfaceTypeDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlInterfaceTypeDefinition"


    // $ANTLR start "ruleGraphqlInterfaceTypeDefinition"
    // InternalGraphqlidl.g:187:1: ruleGraphqlInterfaceTypeDefinition : ( ( rule__GraphqlInterfaceTypeDefinition__Group__0 ) ) ;
    public final void ruleGraphqlInterfaceTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:191:2: ( ( ( rule__GraphqlInterfaceTypeDefinition__Group__0 ) ) )
            // InternalGraphqlidl.g:192:2: ( ( rule__GraphqlInterfaceTypeDefinition__Group__0 ) )
            {
            // InternalGraphqlidl.g:192:2: ( ( rule__GraphqlInterfaceTypeDefinition__Group__0 ) )
            // InternalGraphqlidl.g:193:3: ( rule__GraphqlInterfaceTypeDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:194:3: ( rule__GraphqlInterfaceTypeDefinition__Group__0 )
            // InternalGraphqlidl.g:194:4: rule__GraphqlInterfaceTypeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInterfaceTypeDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlInterfaceTypeDefinition"


    // $ANTLR start "entryRuleGraphqlScalarTypeDefinition"
    // InternalGraphqlidl.g:203:1: entryRuleGraphqlScalarTypeDefinition : ruleGraphqlScalarTypeDefinition EOF ;
    public final void entryRuleGraphqlScalarTypeDefinition() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:204:1: ( ruleGraphqlScalarTypeDefinition EOF )
            // InternalGraphqlidl.g:205:1: ruleGraphqlScalarTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlScalarTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlScalarTypeDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlScalarTypeDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlScalarTypeDefinition"


    // $ANTLR start "ruleGraphqlScalarTypeDefinition"
    // InternalGraphqlidl.g:212:1: ruleGraphqlScalarTypeDefinition : ( ( rule__GraphqlScalarTypeDefinition__Group__0 ) ) ;
    public final void ruleGraphqlScalarTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:216:2: ( ( ( rule__GraphqlScalarTypeDefinition__Group__0 ) ) )
            // InternalGraphqlidl.g:217:2: ( ( rule__GraphqlScalarTypeDefinition__Group__0 ) )
            {
            // InternalGraphqlidl.g:217:2: ( ( rule__GraphqlScalarTypeDefinition__Group__0 ) )
            // InternalGraphqlidl.g:218:3: ( rule__GraphqlScalarTypeDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlScalarTypeDefinitionAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:219:3: ( rule__GraphqlScalarTypeDefinition__Group__0 )
            // InternalGraphqlidl.g:219:4: rule__GraphqlScalarTypeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlScalarTypeDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlScalarTypeDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlScalarTypeDefinition"


    // $ANTLR start "entryRuleGraphqlEmunTypeDefinition"
    // InternalGraphqlidl.g:228:1: entryRuleGraphqlEmunTypeDefinition : ruleGraphqlEmunTypeDefinition EOF ;
    public final void entryRuleGraphqlEmunTypeDefinition() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:229:1: ( ruleGraphqlEmunTypeDefinition EOF )
            // InternalGraphqlidl.g:230:1: ruleGraphqlEmunTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlEmunTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlEmunTypeDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlEmunTypeDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlEmunTypeDefinition"


    // $ANTLR start "ruleGraphqlEmunTypeDefinition"
    // InternalGraphqlidl.g:237:1: ruleGraphqlEmunTypeDefinition : ( ( rule__GraphqlEmunTypeDefinition__Group__0 ) ) ;
    public final void ruleGraphqlEmunTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:241:2: ( ( ( rule__GraphqlEmunTypeDefinition__Group__0 ) ) )
            // InternalGraphqlidl.g:242:2: ( ( rule__GraphqlEmunTypeDefinition__Group__0 ) )
            {
            // InternalGraphqlidl.g:242:2: ( ( rule__GraphqlEmunTypeDefinition__Group__0 ) )
            // InternalGraphqlidl.g:243:3: ( rule__GraphqlEmunTypeDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:244:3: ( rule__GraphqlEmunTypeDefinition__Group__0 )
            // InternalGraphqlidl.g:244:4: rule__GraphqlEmunTypeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlEmunTypeDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlEmunTypeDefinition"


    // $ANTLR start "entryRuleGraphqlUnionTypeDefinition"
    // InternalGraphqlidl.g:253:1: entryRuleGraphqlUnionTypeDefinition : ruleGraphqlUnionTypeDefinition EOF ;
    public final void entryRuleGraphqlUnionTypeDefinition() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:254:1: ( ruleGraphqlUnionTypeDefinition EOF )
            // InternalGraphqlidl.g:255:1: ruleGraphqlUnionTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlUnionTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlUnionTypeDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlUnionTypeDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlUnionTypeDefinition"


    // $ANTLR start "ruleGraphqlUnionTypeDefinition"
    // InternalGraphqlidl.g:262:1: ruleGraphqlUnionTypeDefinition : ( ( rule__GraphqlUnionTypeDefinition__Group__0 ) ) ;
    public final void ruleGraphqlUnionTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:266:2: ( ( ( rule__GraphqlUnionTypeDefinition__Group__0 ) ) )
            // InternalGraphqlidl.g:267:2: ( ( rule__GraphqlUnionTypeDefinition__Group__0 ) )
            {
            // InternalGraphqlidl.g:267:2: ( ( rule__GraphqlUnionTypeDefinition__Group__0 ) )
            // InternalGraphqlidl.g:268:3: ( rule__GraphqlUnionTypeDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:269:3: ( rule__GraphqlUnionTypeDefinition__Group__0 )
            // InternalGraphqlidl.g:269:4: rule__GraphqlUnionTypeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlUnionTypeDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlUnionTypeDefinition"


    // $ANTLR start "entryRuleGraphqlInputTypeDefinition"
    // InternalGraphqlidl.g:278:1: entryRuleGraphqlInputTypeDefinition : ruleGraphqlInputTypeDefinition EOF ;
    public final void entryRuleGraphqlInputTypeDefinition() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:279:1: ( ruleGraphqlInputTypeDefinition EOF )
            // InternalGraphqlidl.g:280:1: ruleGraphqlInputTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlInputTypeDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlInputTypeDefinition"


    // $ANTLR start "ruleGraphqlInputTypeDefinition"
    // InternalGraphqlidl.g:287:1: ruleGraphqlInputTypeDefinition : ( ( rule__GraphqlInputTypeDefinition__Group__0 ) ) ;
    public final void ruleGraphqlInputTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:291:2: ( ( ( rule__GraphqlInputTypeDefinition__Group__0 ) ) )
            // InternalGraphqlidl.g:292:2: ( ( rule__GraphqlInputTypeDefinition__Group__0 ) )
            {
            // InternalGraphqlidl.g:292:2: ( ( rule__GraphqlInputTypeDefinition__Group__0 ) )
            // InternalGraphqlidl.g:293:3: ( rule__GraphqlInputTypeDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeDefinitionAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:294:3: ( rule__GraphqlInputTypeDefinition__Group__0 )
            // InternalGraphqlidl.g:294:4: rule__GraphqlInputTypeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInputTypeDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlInputTypeDefinition"


    // $ANTLR start "entryRuleGraphqlInputField"
    // InternalGraphqlidl.g:303:1: entryRuleGraphqlInputField : ruleGraphqlInputField EOF ;
    public final void entryRuleGraphqlInputField() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:304:1: ( ruleGraphqlInputField EOF )
            // InternalGraphqlidl.g:305:1: ruleGraphqlInputField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlInputField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlInputField"


    // $ANTLR start "ruleGraphqlInputField"
    // InternalGraphqlidl.g:312:1: ruleGraphqlInputField : ( ( rule__GraphqlInputField__Group__0 ) ) ;
    public final void ruleGraphqlInputField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:316:2: ( ( ( rule__GraphqlInputField__Group__0 ) ) )
            // InternalGraphqlidl.g:317:2: ( ( rule__GraphqlInputField__Group__0 ) )
            {
            // InternalGraphqlidl.g:317:2: ( ( rule__GraphqlInputField__Group__0 ) )
            // InternalGraphqlidl.g:318:3: ( rule__GraphqlInputField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputFieldAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:319:3: ( rule__GraphqlInputField__Group__0 )
            // InternalGraphqlidl.g:319:4: rule__GraphqlInputField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInputField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlInputField"


    // $ANTLR start "entryRuleGraphqlField"
    // InternalGraphqlidl.g:328:1: entryRuleGraphqlField : ruleGraphqlField EOF ;
    public final void entryRuleGraphqlField() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:329:1: ( ruleGraphqlField EOF )
            // InternalGraphqlidl.g:330:1: ruleGraphqlField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlField"


    // $ANTLR start "ruleGraphqlField"
    // InternalGraphqlidl.g:337:1: ruleGraphqlField : ( ( rule__GraphqlField__Group__0 ) ) ;
    public final void ruleGraphqlField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:341:2: ( ( ( rule__GraphqlField__Group__0 ) ) )
            // InternalGraphqlidl.g:342:2: ( ( rule__GraphqlField__Group__0 ) )
            {
            // InternalGraphqlidl.g:342:2: ( ( rule__GraphqlField__Group__0 ) )
            // InternalGraphqlidl.g:343:3: ( rule__GraphqlField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlFieldAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:344:3: ( rule__GraphqlField__Group__0 )
            // InternalGraphqlidl.g:344:4: rule__GraphqlField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlField"


    // $ANTLR start "entryRuleGraphqlType"
    // InternalGraphqlidl.g:353:1: entryRuleGraphqlType : ruleGraphqlType EOF ;
    public final void entryRuleGraphqlType() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:354:1: ( ruleGraphqlType EOF )
            // InternalGraphqlidl.g:355:1: ruleGraphqlType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlType"


    // $ANTLR start "ruleGraphqlType"
    // InternalGraphqlidl.g:362:1: ruleGraphqlType : ( ( rule__GraphqlType__Alternatives ) ) ;
    public final void ruleGraphqlType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:366:2: ( ( ( rule__GraphqlType__Alternatives ) ) )
            // InternalGraphqlidl.g:367:2: ( ( rule__GraphqlType__Alternatives ) )
            {
            // InternalGraphqlidl.g:367:2: ( ( rule__GraphqlType__Alternatives ) )
            // InternalGraphqlidl.g:368:3: ( rule__GraphqlType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getAlternatives()); 
            }
            // InternalGraphqlidl.g:369:3: ( rule__GraphqlType__Alternatives )
            // InternalGraphqlidl.g:369:4: rule__GraphqlType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlType"


    // $ANTLR start "entryRuleGraphqlNamedType"
    // InternalGraphqlidl.g:378:1: entryRuleGraphqlNamedType : ruleGraphqlNamedType EOF ;
    public final void entryRuleGraphqlNamedType() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:379:1: ( ruleGraphqlNamedType EOF )
            // InternalGraphqlidl.g:380:1: ruleGraphqlNamedType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlNamedTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlNamedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlNamedTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlNamedType"


    // $ANTLR start "ruleGraphqlNamedType"
    // InternalGraphqlidl.g:387:1: ruleGraphqlNamedType : ( ( rule__GraphqlNamedType__NameAssignment ) ) ;
    public final void ruleGraphqlNamedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:391:2: ( ( ( rule__GraphqlNamedType__NameAssignment ) ) )
            // InternalGraphqlidl.g:392:2: ( ( rule__GraphqlNamedType__NameAssignment ) )
            {
            // InternalGraphqlidl.g:392:2: ( ( rule__GraphqlNamedType__NameAssignment ) )
            // InternalGraphqlidl.g:393:3: ( rule__GraphqlNamedType__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlNamedTypeAccess().getNameAssignment()); 
            }
            // InternalGraphqlidl.g:394:3: ( rule__GraphqlNamedType__NameAssignment )
            // InternalGraphqlidl.g:394:4: rule__GraphqlNamedType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlNamedType__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlNamedTypeAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlNamedType"


    // $ANTLR start "entryRuleGraphqlListType"
    // InternalGraphqlidl.g:403:1: entryRuleGraphqlListType : ruleGraphqlListType EOF ;
    public final void entryRuleGraphqlListType() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:404:1: ( ruleGraphqlListType EOF )
            // InternalGraphqlidl.g:405:1: ruleGraphqlListType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlListTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlListType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlListTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlListType"


    // $ANTLR start "ruleGraphqlListType"
    // InternalGraphqlidl.g:412:1: ruleGraphqlListType : ( ( rule__GraphqlListType__Group__0 ) ) ;
    public final void ruleGraphqlListType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:416:2: ( ( ( rule__GraphqlListType__Group__0 ) ) )
            // InternalGraphqlidl.g:417:2: ( ( rule__GraphqlListType__Group__0 ) )
            {
            // InternalGraphqlidl.g:417:2: ( ( rule__GraphqlListType__Group__0 ) )
            // InternalGraphqlidl.g:418:3: ( rule__GraphqlListType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlListTypeAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:419:3: ( rule__GraphqlListType__Group__0 )
            // InternalGraphqlidl.g:419:4: rule__GraphqlListType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlListType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlListTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlListType"


    // $ANTLR start "entryRuleGraphqlInputType"
    // InternalGraphqlidl.g:428:1: entryRuleGraphqlInputType : ruleGraphqlInputType EOF ;
    public final void entryRuleGraphqlInputType() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:429:1: ( ruleGraphqlInputType EOF )
            // InternalGraphqlidl.g:430:1: ruleGraphqlInputType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlInputType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlInputType"


    // $ANTLR start "ruleGraphqlInputType"
    // InternalGraphqlidl.g:437:1: ruleGraphqlInputType : ( ( rule__GraphqlInputType__Alternatives ) ) ;
    public final void ruleGraphqlInputType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:441:2: ( ( ( rule__GraphqlInputType__Alternatives ) ) )
            // InternalGraphqlidl.g:442:2: ( ( rule__GraphqlInputType__Alternatives ) )
            {
            // InternalGraphqlidl.g:442:2: ( ( rule__GraphqlInputType__Alternatives ) )
            // InternalGraphqlidl.g:443:3: ( rule__GraphqlInputType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getAlternatives()); 
            }
            // InternalGraphqlidl.g:444:3: ( rule__GraphqlInputType__Alternatives )
            // InternalGraphqlidl.g:444:4: rule__GraphqlInputType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInputType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlInputType"


    // $ANTLR start "entryRuleGraphqlListInputType"
    // InternalGraphqlidl.g:453:1: entryRuleGraphqlListInputType : ruleGraphqlListInputType EOF ;
    public final void entryRuleGraphqlListInputType() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:454:1: ( ruleGraphqlListInputType EOF )
            // InternalGraphqlidl.g:455:1: ruleGraphqlListInputType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlListInputTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlListInputType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlListInputTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlListInputType"


    // $ANTLR start "ruleGraphqlListInputType"
    // InternalGraphqlidl.g:462:1: ruleGraphqlListInputType : ( ( rule__GraphqlListInputType__Group__0 ) ) ;
    public final void ruleGraphqlListInputType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:466:2: ( ( ( rule__GraphqlListInputType__Group__0 ) ) )
            // InternalGraphqlidl.g:467:2: ( ( rule__GraphqlListInputType__Group__0 ) )
            {
            // InternalGraphqlidl.g:467:2: ( ( rule__GraphqlListInputType__Group__0 ) )
            // InternalGraphqlidl.g:468:3: ( rule__GraphqlListInputType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlListInputTypeAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:469:3: ( rule__GraphqlListInputType__Group__0 )
            // InternalGraphqlidl.g:469:4: rule__GraphqlListInputType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlListInputType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlListInputTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlListInputType"


    // $ANTLR start "entryRuleArgument"
    // InternalGraphqlidl.g:478:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:479:1: ( ruleArgument EOF )
            // InternalGraphqlidl.g:480:1: ruleArgument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalGraphqlidl.g:487:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:491:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalGraphqlidl.g:492:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalGraphqlidl.g:492:2: ( ( rule__Argument__Group__0 ) )
            // InternalGraphqlidl.g:493:3: ( rule__Argument__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:494:3: ( rule__Argument__Group__0 )
            // InternalGraphqlidl.g:494:4: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleGraphqlValue"
    // InternalGraphqlidl.g:503:1: entryRuleGraphqlValue : ruleGraphqlValue EOF ;
    public final void entryRuleGraphqlValue() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:504:1: ( ruleGraphqlValue EOF )
            // InternalGraphqlidl.g:505:1: ruleGraphqlValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGraphqlValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphqlValue"


    // $ANTLR start "ruleGraphqlValue"
    // InternalGraphqlidl.g:512:1: ruleGraphqlValue : ( ( rule__GraphqlValue__Alternatives ) ) ;
    public final void ruleGraphqlValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:516:2: ( ( ( rule__GraphqlValue__Alternatives ) ) )
            // InternalGraphqlidl.g:517:2: ( ( rule__GraphqlValue__Alternatives ) )
            {
            // InternalGraphqlidl.g:517:2: ( ( rule__GraphqlValue__Alternatives ) )
            // InternalGraphqlidl.g:518:3: ( rule__GraphqlValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlValueAccess().getAlternatives()); 
            }
            // InternalGraphqlidl.g:519:3: ( rule__GraphqlValue__Alternatives )
            // InternalGraphqlidl.g:519:4: rule__GraphqlValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphqlValue"


    // $ANTLR start "entryRuleSingleValue"
    // InternalGraphqlidl.g:528:1: entryRuleSingleValue : ruleSingleValue EOF ;
    public final void entryRuleSingleValue() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:529:1: ( ruleSingleValue EOF )
            // InternalGraphqlidl.g:530:1: ruleSingleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSingleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleValue"


    // $ANTLR start "ruleSingleValue"
    // InternalGraphqlidl.g:537:1: ruleSingleValue : ( ( rule__SingleValue__Alternatives ) ) ;
    public final void ruleSingleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:541:2: ( ( ( rule__SingleValue__Alternatives ) ) )
            // InternalGraphqlidl.g:542:2: ( ( rule__SingleValue__Alternatives ) )
            {
            // InternalGraphqlidl.g:542:2: ( ( rule__SingleValue__Alternatives ) )
            // InternalGraphqlidl.g:543:3: ( rule__SingleValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleValueAccess().getAlternatives()); 
            }
            // InternalGraphqlidl.g:544:3: ( rule__SingleValue__Alternatives )
            // InternalGraphqlidl.g:544:4: rule__SingleValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SingleValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleValue"


    // $ANTLR start "entryRuleComplexValue"
    // InternalGraphqlidl.g:553:1: entryRuleComplexValue : ruleComplexValue EOF ;
    public final void entryRuleComplexValue() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:554:1: ( ruleComplexValue EOF )
            // InternalGraphqlidl.g:555:1: ruleComplexValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComplexValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexValue"


    // $ANTLR start "ruleComplexValue"
    // InternalGraphqlidl.g:562:1: ruleComplexValue : ( ( rule__ComplexValue__Alternatives ) ) ;
    public final void ruleComplexValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:566:2: ( ( ( rule__ComplexValue__Alternatives ) ) )
            // InternalGraphqlidl.g:567:2: ( ( rule__ComplexValue__Alternatives ) )
            {
            // InternalGraphqlidl.g:567:2: ( ( rule__ComplexValue__Alternatives ) )
            // InternalGraphqlidl.g:568:3: ( rule__ComplexValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexValueAccess().getAlternatives()); 
            }
            // InternalGraphqlidl.g:569:3: ( rule__ComplexValue__Alternatives )
            // InternalGraphqlidl.g:569:4: rule__ComplexValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComplexValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexValue"


    // $ANTLR start "entryRuleEnumValue"
    // InternalGraphqlidl.g:578:1: entryRuleEnumValue : ruleEnumValue EOF ;
    public final void entryRuleEnumValue() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:579:1: ( ruleEnumValue EOF )
            // InternalGraphqlidl.g:580:1: ruleEnumValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnumValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalGraphqlidl.g:587:1: ruleEnumValue : ( ( rule__EnumValue__Group__0 ) ) ;
    public final void ruleEnumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:591:2: ( ( ( rule__EnumValue__Group__0 ) ) )
            // InternalGraphqlidl.g:592:2: ( ( rule__EnumValue__Group__0 ) )
            {
            // InternalGraphqlidl.g:592:2: ( ( rule__EnumValue__Group__0 ) )
            // InternalGraphqlidl.g:593:3: ( rule__EnumValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValueAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:594:3: ( rule__EnumValue__Group__0 )
            // InternalGraphqlidl.g:594:4: rule__EnumValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleListValue"
    // InternalGraphqlidl.g:603:1: entryRuleListValue : ruleListValue EOF ;
    public final void entryRuleListValue() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:604:1: ( ruleListValue EOF )
            // InternalGraphqlidl.g:605:1: ruleListValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // InternalGraphqlidl.g:612:1: ruleListValue : ( ( rule__ListValue__Group__0 ) ) ;
    public final void ruleListValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:616:2: ( ( ( rule__ListValue__Group__0 ) ) )
            // InternalGraphqlidl.g:617:2: ( ( rule__ListValue__Group__0 ) )
            {
            // InternalGraphqlidl.g:617:2: ( ( rule__ListValue__Group__0 ) )
            // InternalGraphqlidl.g:618:3: ( rule__ListValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:619:3: ( rule__ListValue__Group__0 )
            // InternalGraphqlidl.g:619:4: rule__ListValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListValue"


    // $ANTLR start "entryRuleObjectValue"
    // InternalGraphqlidl.g:628:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:629:1: ( ruleObjectValue EOF )
            // InternalGraphqlidl.g:630:1: ruleObjectValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleObjectValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectValue"


    // $ANTLR start "ruleObjectValue"
    // InternalGraphqlidl.g:637:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:641:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalGraphqlidl.g:642:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalGraphqlidl.g:642:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalGraphqlidl.g:643:3: ( rule__ObjectValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:644:3: ( rule__ObjectValue__Group__0 )
            // InternalGraphqlidl.g:644:4: rule__ObjectValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectValue"


    // $ANTLR start "entryRuleObjectField"
    // InternalGraphqlidl.g:653:1: entryRuleObjectField : ruleObjectField EOF ;
    public final void entryRuleObjectField() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:654:1: ( ruleObjectField EOF )
            // InternalGraphqlidl.g:655:1: ruleObjectField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleObjectField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectField"


    // $ANTLR start "ruleObjectField"
    // InternalGraphqlidl.g:662:1: ruleObjectField : ( ( rule__ObjectField__Group__0 ) ) ;
    public final void ruleObjectField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:666:2: ( ( ( rule__ObjectField__Group__0 ) ) )
            // InternalGraphqlidl.g:667:2: ( ( rule__ObjectField__Group__0 ) )
            {
            // InternalGraphqlidl.g:667:2: ( ( rule__ObjectField__Group__0 ) )
            // InternalGraphqlidl.g:668:3: ( rule__ObjectField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectFieldAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:669:3: ( rule__ObjectField__Group__0 )
            // InternalGraphqlidl.g:669:4: rule__ObjectField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectField"


    // $ANTLR start "entryRuleIntValue"
    // InternalGraphqlidl.g:678:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:679:1: ( ruleIntValue EOF )
            // InternalGraphqlidl.g:680:1: ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalGraphqlidl.g:687:1: ruleIntValue : ( ruleIntegerPart ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:691:2: ( ( ruleIntegerPart ) )
            // InternalGraphqlidl.g:692:2: ( ruleIntegerPart )
            {
            // InternalGraphqlidl.g:692:2: ( ruleIntegerPart )
            // InternalGraphqlidl.g:693:3: ruleIntegerPart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getIntegerPartParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntegerPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueAccess().getIntegerPartParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleIntegerPart"
    // InternalGraphqlidl.g:703:1: entryRuleIntegerPart : ruleIntegerPart EOF ;
    public final void entryRuleIntegerPart() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:704:1: ( ruleIntegerPart EOF )
            // InternalGraphqlidl.g:705:1: ruleIntegerPart EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerPartRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntegerPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerPartRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerPart"


    // $ANTLR start "ruleIntegerPart"
    // InternalGraphqlidl.g:712:1: ruleIntegerPart : ( ( rule__IntegerPart__Alternatives ) ) ;
    public final void ruleIntegerPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:716:2: ( ( ( rule__IntegerPart__Alternatives ) ) )
            // InternalGraphqlidl.g:717:2: ( ( rule__IntegerPart__Alternatives ) )
            {
            // InternalGraphqlidl.g:717:2: ( ( rule__IntegerPart__Alternatives ) )
            // InternalGraphqlidl.g:718:3: ( rule__IntegerPart__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerPartAccess().getAlternatives()); 
            }
            // InternalGraphqlidl.g:719:3: ( rule__IntegerPart__Alternatives )
            // InternalGraphqlidl.g:719:4: rule__IntegerPart__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IntegerPart__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerPartAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerPart"


    // $ANTLR start "entryRuleNegativeSign"
    // InternalGraphqlidl.g:728:1: entryRuleNegativeSign : ruleNegativeSign EOF ;
    public final void entryRuleNegativeSign() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:729:1: ( ruleNegativeSign EOF )
            // InternalGraphqlidl.g:730:1: ruleNegativeSign EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeSignRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNegativeSign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeSignRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegativeSign"


    // $ANTLR start "ruleNegativeSign"
    // InternalGraphqlidl.g:737:1: ruleNegativeSign : ( '-' ) ;
    public final void ruleNegativeSign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:741:2: ( ( '-' ) )
            // InternalGraphqlidl.g:742:2: ( '-' )
            {
            // InternalGraphqlidl.g:742:2: ( '-' )
            // InternalGraphqlidl.g:743:3: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeSignAccess().getHyphenMinusKeyword()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeSignAccess().getHyphenMinusKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegativeSign"


    // $ANTLR start "entryRuleFloatValue"
    // InternalGraphqlidl.g:753:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:754:1: ( ruleFloatValue EOF )
            // InternalGraphqlidl.g:755:1: ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFloatValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalGraphqlidl.g:762:1: ruleFloatValue : ( ( rule__FloatValue__Alternatives ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:766:2: ( ( ( rule__FloatValue__Alternatives ) ) )
            // InternalGraphqlidl.g:767:2: ( ( rule__FloatValue__Alternatives ) )
            {
            // InternalGraphqlidl.g:767:2: ( ( rule__FloatValue__Alternatives ) )
            // InternalGraphqlidl.g:768:3: ( rule__FloatValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getAlternatives()); 
            }
            // InternalGraphqlidl.g:769:3: ( rule__FloatValue__Alternatives )
            // InternalGraphqlidl.g:769:4: rule__FloatValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FloatValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleFractionalPart"
    // InternalGraphqlidl.g:778:1: entryRuleFractionalPart : ruleFractionalPart EOF ;
    public final void entryRuleFractionalPart() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:779:1: ( ruleFractionalPart EOF )
            // InternalGraphqlidl.g:780:1: ruleFractionalPart EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFractionalPartRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFractionalPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFractionalPartRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFractionalPart"


    // $ANTLR start "ruleFractionalPart"
    // InternalGraphqlidl.g:787:1: ruleFractionalPart : ( ( rule__FractionalPart__Group__0 ) ) ;
    public final void ruleFractionalPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:791:2: ( ( ( rule__FractionalPart__Group__0 ) ) )
            // InternalGraphqlidl.g:792:2: ( ( rule__FractionalPart__Group__0 ) )
            {
            // InternalGraphqlidl.g:792:2: ( ( rule__FractionalPart__Group__0 ) )
            // InternalGraphqlidl.g:793:3: ( rule__FractionalPart__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFractionalPartAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:794:3: ( rule__FractionalPart__Group__0 )
            // InternalGraphqlidl.g:794:4: rule__FractionalPart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FractionalPart__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFractionalPartAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFractionalPart"


    // $ANTLR start "entryRuleExponentPart"
    // InternalGraphqlidl.g:803:1: entryRuleExponentPart : ruleExponentPart EOF ;
    public final void entryRuleExponentPart() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:804:1: ( ruleExponentPart EOF )
            // InternalGraphqlidl.g:805:1: ruleExponentPart EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentPartRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExponentPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentPartRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExponentPart"


    // $ANTLR start "ruleExponentPart"
    // InternalGraphqlidl.g:812:1: ruleExponentPart : ( ( rule__ExponentPart__Group__0 ) ) ;
    public final void ruleExponentPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:816:2: ( ( ( rule__ExponentPart__Group__0 ) ) )
            // InternalGraphqlidl.g:817:2: ( ( rule__ExponentPart__Group__0 ) )
            {
            // InternalGraphqlidl.g:817:2: ( ( rule__ExponentPart__Group__0 ) )
            // InternalGraphqlidl.g:818:3: ( rule__ExponentPart__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentPartAccess().getGroup()); 
            }
            // InternalGraphqlidl.g:819:3: ( rule__ExponentPart__Group__0 )
            // InternalGraphqlidl.g:819:4: rule__ExponentPart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExponentPart__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentPartAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExponentPart"


    // $ANTLR start "entryRuleExponentIndicator"
    // InternalGraphqlidl.g:828:1: entryRuleExponentIndicator : ruleExponentIndicator EOF ;
    public final void entryRuleExponentIndicator() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:829:1: ( ruleExponentIndicator EOF )
            // InternalGraphqlidl.g:830:1: ruleExponentIndicator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentIndicatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExponentIndicator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentIndicatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExponentIndicator"


    // $ANTLR start "ruleExponentIndicator"
    // InternalGraphqlidl.g:837:1: ruleExponentIndicator : ( ( rule__ExponentIndicator__Alternatives ) ) ;
    public final void ruleExponentIndicator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:841:2: ( ( ( rule__ExponentIndicator__Alternatives ) ) )
            // InternalGraphqlidl.g:842:2: ( ( rule__ExponentIndicator__Alternatives ) )
            {
            // InternalGraphqlidl.g:842:2: ( ( rule__ExponentIndicator__Alternatives ) )
            // InternalGraphqlidl.g:843:3: ( rule__ExponentIndicator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentIndicatorAccess().getAlternatives()); 
            }
            // InternalGraphqlidl.g:844:3: ( rule__ExponentIndicator__Alternatives )
            // InternalGraphqlidl.g:844:4: rule__ExponentIndicator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExponentIndicator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentIndicatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExponentIndicator"


    // $ANTLR start "entryRuleSign"
    // InternalGraphqlidl.g:853:1: entryRuleSign : ruleSign EOF ;
    public final void entryRuleSign() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:854:1: ( ruleSign EOF )
            // InternalGraphqlidl.g:855:1: ruleSign EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSign"


    // $ANTLR start "ruleSign"
    // InternalGraphqlidl.g:862:1: ruleSign : ( ( rule__Sign__Alternatives ) ) ;
    public final void ruleSign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:866:2: ( ( ( rule__Sign__Alternatives ) ) )
            // InternalGraphqlidl.g:867:2: ( ( rule__Sign__Alternatives ) )
            {
            // InternalGraphqlidl.g:867:2: ( ( rule__Sign__Alternatives ) )
            // InternalGraphqlidl.g:868:3: ( rule__Sign__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignAccess().getAlternatives()); 
            }
            // InternalGraphqlidl.g:869:3: ( rule__Sign__Alternatives )
            // InternalGraphqlidl.g:869:4: rule__Sign__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sign__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSign"


    // $ANTLR start "entryRuleStringValue"
    // InternalGraphqlidl.g:878:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalGraphqlidl.g:879:1: ( ruleStringValue EOF )
            // InternalGraphqlidl.g:880:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalGraphqlidl.g:887:1: ruleStringValue : ( ( rule__StringValue__Alternatives ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:891:2: ( ( ( rule__StringValue__Alternatives ) ) )
            // InternalGraphqlidl.g:892:2: ( ( rule__StringValue__Alternatives ) )
            {
            // InternalGraphqlidl.g:892:2: ( ( rule__StringValue__Alternatives ) )
            // InternalGraphqlidl.g:893:3: ( rule__StringValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getAlternatives()); 
            }
            // InternalGraphqlidl.g:894:3: ( rule__StringValue__Alternatives )
            // InternalGraphqlidl.g:894:4: rule__StringValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "rule__GraphqlTypeDefinition__Alternatives"
    // InternalGraphqlidl.g:902:1: rule__GraphqlTypeDefinition__Alternatives : ( ( ruleGraphqlObjectTypeDefinition ) | ( ruleGraphqlScalarTypeDefinition ) | ( ruleGraphqlInterfaceTypeDefinition ) | ( ruleGraphqlUnionTypeDefinition ) | ( ruleGraphqlEmunTypeDefinition ) | ( ruleGraphqlInputTypeDefinition ) );
    public final void rule__GraphqlTypeDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:906:1: ( ( ruleGraphqlObjectTypeDefinition ) | ( ruleGraphqlScalarTypeDefinition ) | ( ruleGraphqlInterfaceTypeDefinition ) | ( ruleGraphqlUnionTypeDefinition ) | ( ruleGraphqlEmunTypeDefinition ) | ( ruleGraphqlInputTypeDefinition ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case 31:
                {
                alt1=2;
                }
                break;
            case 30:
                {
                alt1=3;
                }
                break;
            case 33:
                {
                alt1=4;
                }
                break;
            case 32:
                {
                alt1=5;
                }
                break;
            case 36:
                {
                alt1=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGraphqlidl.g:907:2: ( ruleGraphqlObjectTypeDefinition )
                    {
                    // InternalGraphqlidl.g:907:2: ( ruleGraphqlObjectTypeDefinition )
                    // InternalGraphqlidl.g:908:3: ruleGraphqlObjectTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlObjectTypeDefinitionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGraphqlObjectTypeDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlObjectTypeDefinitionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:913:2: ( ruleGraphqlScalarTypeDefinition )
                    {
                    // InternalGraphqlidl.g:913:2: ( ruleGraphqlScalarTypeDefinition )
                    // InternalGraphqlidl.g:914:3: ruleGraphqlScalarTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlScalarTypeDefinitionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGraphqlScalarTypeDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlScalarTypeDefinitionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphqlidl.g:919:2: ( ruleGraphqlInterfaceTypeDefinition )
                    {
                    // InternalGraphqlidl.g:919:2: ( ruleGraphqlInterfaceTypeDefinition )
                    // InternalGraphqlidl.g:920:3: ruleGraphqlInterfaceTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlInterfaceTypeDefinitionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGraphqlInterfaceTypeDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlInterfaceTypeDefinitionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGraphqlidl.g:925:2: ( ruleGraphqlUnionTypeDefinition )
                    {
                    // InternalGraphqlidl.g:925:2: ( ruleGraphqlUnionTypeDefinition )
                    // InternalGraphqlidl.g:926:3: ruleGraphqlUnionTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlUnionTypeDefinitionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGraphqlUnionTypeDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlUnionTypeDefinitionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGraphqlidl.g:931:2: ( ruleGraphqlEmunTypeDefinition )
                    {
                    // InternalGraphqlidl.g:931:2: ( ruleGraphqlEmunTypeDefinition )
                    // InternalGraphqlidl.g:932:3: ruleGraphqlEmunTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlEmunTypeDefinitionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGraphqlEmunTypeDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlEmunTypeDefinitionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGraphqlidl.g:937:2: ( ruleGraphqlInputTypeDefinition )
                    {
                    // InternalGraphqlidl.g:937:2: ( ruleGraphqlInputTypeDefinition )
                    // InternalGraphqlidl.g:938:3: ruleGraphqlInputTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlInputTypeDefinitionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGraphqlInputTypeDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlInputTypeDefinitionParserRuleCall_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlTypeDefinition__Alternatives"


    // $ANTLR start "rule__GraphqlType__Alternatives"
    // InternalGraphqlidl.g:947:1: rule__GraphqlType__Alternatives : ( ( ( rule__GraphqlType__Group_0__0 ) ) | ( ( rule__GraphqlType__Group_1__0 ) ) | ( ( rule__GraphqlType__Group_2__0 ) ) );
    public final void rule__GraphqlType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:951:1: ( ( ( rule__GraphqlType__Group_0__0 ) ) | ( ( rule__GraphqlType__Group_1__0 ) ) | ( ( rule__GraphqlType__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_NAME:
                {
                alt2=1;
                }
                break;
            case RULE_SCALAR:
                {
                alt2=2;
                }
                break;
            case 39:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGraphqlidl.g:952:2: ( ( rule__GraphqlType__Group_0__0 ) )
                    {
                    // InternalGraphqlidl.g:952:2: ( ( rule__GraphqlType__Group_0__0 ) )
                    // InternalGraphqlidl.g:953:3: ( rule__GraphqlType__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlTypeAccess().getGroup_0()); 
                    }
                    // InternalGraphqlidl.g:954:3: ( rule__GraphqlType__Group_0__0 )
                    // InternalGraphqlidl.g:954:4: rule__GraphqlType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlType__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlTypeAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:958:2: ( ( rule__GraphqlType__Group_1__0 ) )
                    {
                    // InternalGraphqlidl.g:958:2: ( ( rule__GraphqlType__Group_1__0 ) )
                    // InternalGraphqlidl.g:959:3: ( rule__GraphqlType__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlTypeAccess().getGroup_1()); 
                    }
                    // InternalGraphqlidl.g:960:3: ( rule__GraphqlType__Group_1__0 )
                    // InternalGraphqlidl.g:960:4: rule__GraphqlType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlType__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlTypeAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphqlidl.g:964:2: ( ( rule__GraphqlType__Group_2__0 ) )
                    {
                    // InternalGraphqlidl.g:964:2: ( ( rule__GraphqlType__Group_2__0 ) )
                    // InternalGraphqlidl.g:965:3: ( rule__GraphqlType__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlTypeAccess().getGroup_2()); 
                    }
                    // InternalGraphqlidl.g:966:3: ( rule__GraphqlType__Group_2__0 )
                    // InternalGraphqlidl.g:966:4: rule__GraphqlType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlType__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlTypeAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__Alternatives"


    // $ANTLR start "rule__GraphqlInputType__Alternatives"
    // InternalGraphqlidl.g:974:1: rule__GraphqlInputType__Alternatives : ( ( ( rule__GraphqlInputType__Group_0__0 ) ) | ( ( rule__GraphqlInputType__Group_1__0 ) ) | ( ( rule__GraphqlInputType__Group_2__0 ) ) );
    public final void rule__GraphqlInputType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:978:1: ( ( ( rule__GraphqlInputType__Group_0__0 ) ) | ( ( rule__GraphqlInputType__Group_1__0 ) ) | ( ( rule__GraphqlInputType__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_NAME:
                {
                alt3=1;
                }
                break;
            case RULE_SCALAR:
                {
                alt3=2;
                }
                break;
            case 39:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGraphqlidl.g:979:2: ( ( rule__GraphqlInputType__Group_0__0 ) )
                    {
                    // InternalGraphqlidl.g:979:2: ( ( rule__GraphqlInputType__Group_0__0 ) )
                    // InternalGraphqlidl.g:980:3: ( rule__GraphqlInputType__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlInputTypeAccess().getGroup_0()); 
                    }
                    // InternalGraphqlidl.g:981:3: ( rule__GraphqlInputType__Group_0__0 )
                    // InternalGraphqlidl.g:981:4: rule__GraphqlInputType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlInputType__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlInputTypeAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:985:2: ( ( rule__GraphqlInputType__Group_1__0 ) )
                    {
                    // InternalGraphqlidl.g:985:2: ( ( rule__GraphqlInputType__Group_1__0 ) )
                    // InternalGraphqlidl.g:986:3: ( rule__GraphqlInputType__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlInputTypeAccess().getGroup_1()); 
                    }
                    // InternalGraphqlidl.g:987:3: ( rule__GraphqlInputType__Group_1__0 )
                    // InternalGraphqlidl.g:987:4: rule__GraphqlInputType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlInputType__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlInputTypeAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphqlidl.g:991:2: ( ( rule__GraphqlInputType__Group_2__0 ) )
                    {
                    // InternalGraphqlidl.g:991:2: ( ( rule__GraphqlInputType__Group_2__0 ) )
                    // InternalGraphqlidl.g:992:3: ( rule__GraphqlInputType__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlInputTypeAccess().getGroup_2()); 
                    }
                    // InternalGraphqlidl.g:993:3: ( rule__GraphqlInputType__Group_2__0 )
                    // InternalGraphqlidl.g:993:4: rule__GraphqlInputType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlInputType__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlInputTypeAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__Alternatives"


    // $ANTLR start "rule__GraphqlValue__Alternatives"
    // InternalGraphqlidl.g:1001:1: rule__GraphqlValue__Alternatives : ( ( ( rule__GraphqlValue__SvAssignment_0 ) ) | ( ( rule__GraphqlValue__EvAssignment_1 ) ) | ( ( rule__GraphqlValue__CvAssignment_2 ) ) );
    public final void rule__GraphqlValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1005:1: ( ( ( rule__GraphqlValue__SvAssignment_0 ) ) | ( ( rule__GraphqlValue__EvAssignment_1 ) ) | ( ( rule__GraphqlValue__CvAssignment_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_NONZERODIGIT:
            case RULE_BOOLEANVALUE:
            case RULE_NULLVALUE:
            case 19:
            case 41:
            case 43:
                {
                alt4=1;
                }
                break;
            case RULE_NAME:
                {
                alt4=2;
                }
                break;
            case 23:
            case 39:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGraphqlidl.g:1006:2: ( ( rule__GraphqlValue__SvAssignment_0 ) )
                    {
                    // InternalGraphqlidl.g:1006:2: ( ( rule__GraphqlValue__SvAssignment_0 ) )
                    // InternalGraphqlidl.g:1007:3: ( rule__GraphqlValue__SvAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlValueAccess().getSvAssignment_0()); 
                    }
                    // InternalGraphqlidl.g:1008:3: ( rule__GraphqlValue__SvAssignment_0 )
                    // InternalGraphqlidl.g:1008:4: rule__GraphqlValue__SvAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlValue__SvAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlValueAccess().getSvAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:1012:2: ( ( rule__GraphqlValue__EvAssignment_1 ) )
                    {
                    // InternalGraphqlidl.g:1012:2: ( ( rule__GraphqlValue__EvAssignment_1 ) )
                    // InternalGraphqlidl.g:1013:3: ( rule__GraphqlValue__EvAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlValueAccess().getEvAssignment_1()); 
                    }
                    // InternalGraphqlidl.g:1014:3: ( rule__GraphqlValue__EvAssignment_1 )
                    // InternalGraphqlidl.g:1014:4: rule__GraphqlValue__EvAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlValue__EvAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlValueAccess().getEvAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphqlidl.g:1018:2: ( ( rule__GraphqlValue__CvAssignment_2 ) )
                    {
                    // InternalGraphqlidl.g:1018:2: ( ( rule__GraphqlValue__CvAssignment_2 ) )
                    // InternalGraphqlidl.g:1019:3: ( rule__GraphqlValue__CvAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlValueAccess().getCvAssignment_2()); 
                    }
                    // InternalGraphqlidl.g:1020:3: ( rule__GraphqlValue__CvAssignment_2 )
                    // InternalGraphqlidl.g:1020:4: rule__GraphqlValue__CvAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlValue__CvAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlValueAccess().getCvAssignment_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlValue__Alternatives"


    // $ANTLR start "rule__SingleValue__Alternatives"
    // InternalGraphqlidl.g:1028:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__ValueAssignment_0 ) ) | ( ( rule__SingleValue__ValueAssignment_1 ) ) | ( ( rule__SingleValue__ValueAssignment_2 ) ) | ( ( rule__SingleValue__ValueAssignment_3 ) ) | ( ( rule__SingleValue__ValueAssignment_4 ) ) );
    public final void rule__SingleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1032:1: ( ( ( rule__SingleValue__ValueAssignment_0 ) ) | ( ( rule__SingleValue__ValueAssignment_1 ) ) | ( ( rule__SingleValue__ValueAssignment_2 ) ) | ( ( rule__SingleValue__ValueAssignment_3 ) ) | ( ( rule__SingleValue__ValueAssignment_4 ) ) )
            int alt5=5;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalGraphqlidl.g:1033:2: ( ( rule__SingleValue__ValueAssignment_0 ) )
                    {
                    // InternalGraphqlidl.g:1033:2: ( ( rule__SingleValue__ValueAssignment_0 ) )
                    // InternalGraphqlidl.g:1034:3: ( rule__SingleValue__ValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleValueAccess().getValueAssignment_0()); 
                    }
                    // InternalGraphqlidl.g:1035:3: ( rule__SingleValue__ValueAssignment_0 )
                    // InternalGraphqlidl.g:1035:4: rule__SingleValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__ValueAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleValueAccess().getValueAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:1039:2: ( ( rule__SingleValue__ValueAssignment_1 ) )
                    {
                    // InternalGraphqlidl.g:1039:2: ( ( rule__SingleValue__ValueAssignment_1 ) )
                    // InternalGraphqlidl.g:1040:3: ( rule__SingleValue__ValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleValueAccess().getValueAssignment_1()); 
                    }
                    // InternalGraphqlidl.g:1041:3: ( rule__SingleValue__ValueAssignment_1 )
                    // InternalGraphqlidl.g:1041:4: rule__SingleValue__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__ValueAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleValueAccess().getValueAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphqlidl.g:1045:2: ( ( rule__SingleValue__ValueAssignment_2 ) )
                    {
                    // InternalGraphqlidl.g:1045:2: ( ( rule__SingleValue__ValueAssignment_2 ) )
                    // InternalGraphqlidl.g:1046:3: ( rule__SingleValue__ValueAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleValueAccess().getValueAssignment_2()); 
                    }
                    // InternalGraphqlidl.g:1047:3: ( rule__SingleValue__ValueAssignment_2 )
                    // InternalGraphqlidl.g:1047:4: rule__SingleValue__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__ValueAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleValueAccess().getValueAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGraphqlidl.g:1051:2: ( ( rule__SingleValue__ValueAssignment_3 ) )
                    {
                    // InternalGraphqlidl.g:1051:2: ( ( rule__SingleValue__ValueAssignment_3 ) )
                    // InternalGraphqlidl.g:1052:3: ( rule__SingleValue__ValueAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleValueAccess().getValueAssignment_3()); 
                    }
                    // InternalGraphqlidl.g:1053:3: ( rule__SingleValue__ValueAssignment_3 )
                    // InternalGraphqlidl.g:1053:4: rule__SingleValue__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__ValueAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleValueAccess().getValueAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGraphqlidl.g:1057:2: ( ( rule__SingleValue__ValueAssignment_4 ) )
                    {
                    // InternalGraphqlidl.g:1057:2: ( ( rule__SingleValue__ValueAssignment_4 ) )
                    // InternalGraphqlidl.g:1058:3: ( rule__SingleValue__ValueAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleValueAccess().getValueAssignment_4()); 
                    }
                    // InternalGraphqlidl.g:1059:3: ( rule__SingleValue__ValueAssignment_4 )
                    // InternalGraphqlidl.g:1059:4: rule__SingleValue__ValueAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__ValueAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleValueAccess().getValueAssignment_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Alternatives"


    // $ANTLR start "rule__ComplexValue__Alternatives"
    // InternalGraphqlidl.g:1067:1: rule__ComplexValue__Alternatives : ( ( ( rule__ComplexValue__ValueAssignment_0 ) ) | ( ( rule__ComplexValue__ValueAssignment_1 ) ) );
    public final void rule__ComplexValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1071:1: ( ( ( rule__ComplexValue__ValueAssignment_0 ) ) | ( ( rule__ComplexValue__ValueAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==39) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGraphqlidl.g:1072:2: ( ( rule__ComplexValue__ValueAssignment_0 ) )
                    {
                    // InternalGraphqlidl.g:1072:2: ( ( rule__ComplexValue__ValueAssignment_0 ) )
                    // InternalGraphqlidl.g:1073:3: ( rule__ComplexValue__ValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexValueAccess().getValueAssignment_0()); 
                    }
                    // InternalGraphqlidl.g:1074:3: ( rule__ComplexValue__ValueAssignment_0 )
                    // InternalGraphqlidl.g:1074:4: rule__ComplexValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexValue__ValueAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComplexValueAccess().getValueAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:1078:2: ( ( rule__ComplexValue__ValueAssignment_1 ) )
                    {
                    // InternalGraphqlidl.g:1078:2: ( ( rule__ComplexValue__ValueAssignment_1 ) )
                    // InternalGraphqlidl.g:1079:3: ( rule__ComplexValue__ValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexValueAccess().getValueAssignment_1()); 
                    }
                    // InternalGraphqlidl.g:1080:3: ( rule__ComplexValue__ValueAssignment_1 )
                    // InternalGraphqlidl.g:1080:4: rule__ComplexValue__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexValue__ValueAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComplexValueAccess().getValueAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexValue__Alternatives"


    // $ANTLR start "rule__IntegerPart__Alternatives"
    // InternalGraphqlidl.g:1088:1: rule__IntegerPart__Alternatives : ( ( ( rule__IntegerPart__Group_0__0 ) ) | ( ( rule__IntegerPart__Group_1__0 ) ) );
    public final void rule__IntegerPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1092:1: ( ( ( rule__IntegerPart__Group_0__0 ) ) | ( ( rule__IntegerPart__Group_1__0 ) ) )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 19:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==41) ) {
                    alt7=1;
                }
                else if ( (LA7_1==RULE_NONZERODIGIT) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt7=1;
                }
                break;
            case RULE_NONZERODIGIT:
                {
                alt7=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGraphqlidl.g:1093:2: ( ( rule__IntegerPart__Group_0__0 ) )
                    {
                    // InternalGraphqlidl.g:1093:2: ( ( rule__IntegerPart__Group_0__0 ) )
                    // InternalGraphqlidl.g:1094:3: ( rule__IntegerPart__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntegerPartAccess().getGroup_0()); 
                    }
                    // InternalGraphqlidl.g:1095:3: ( rule__IntegerPart__Group_0__0 )
                    // InternalGraphqlidl.g:1095:4: rule__IntegerPart__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerPart__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIntegerPartAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:1099:2: ( ( rule__IntegerPart__Group_1__0 ) )
                    {
                    // InternalGraphqlidl.g:1099:2: ( ( rule__IntegerPart__Group_1__0 ) )
                    // InternalGraphqlidl.g:1100:3: ( rule__IntegerPart__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntegerPartAccess().getGroup_1()); 
                    }
                    // InternalGraphqlidl.g:1101:3: ( rule__IntegerPart__Group_1__0 )
                    // InternalGraphqlidl.g:1101:4: rule__IntegerPart__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerPart__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIntegerPartAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerPart__Alternatives"


    // $ANTLR start "rule__FloatValue__Alternatives"
    // InternalGraphqlidl.g:1109:1: rule__FloatValue__Alternatives : ( ( ( rule__FloatValue__Group_0__0 ) ) | ( ( rule__FloatValue__Group_1__0 ) ) | ( ( rule__FloatValue__Group_2__0 ) ) );
    public final void rule__FloatValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1113:1: ( ( ( rule__FloatValue__Group_0__0 ) ) | ( ( rule__FloatValue__Group_1__0 ) ) | ( ( rule__FloatValue__Group_2__0 ) ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalGraphqlidl.g:1114:2: ( ( rule__FloatValue__Group_0__0 ) )
                    {
                    // InternalGraphqlidl.g:1114:2: ( ( rule__FloatValue__Group_0__0 ) )
                    // InternalGraphqlidl.g:1115:3: ( rule__FloatValue__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFloatValueAccess().getGroup_0()); 
                    }
                    // InternalGraphqlidl.g:1116:3: ( rule__FloatValue__Group_0__0 )
                    // InternalGraphqlidl.g:1116:4: rule__FloatValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FloatValue__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFloatValueAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:1120:2: ( ( rule__FloatValue__Group_1__0 ) )
                    {
                    // InternalGraphqlidl.g:1120:2: ( ( rule__FloatValue__Group_1__0 ) )
                    // InternalGraphqlidl.g:1121:3: ( rule__FloatValue__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFloatValueAccess().getGroup_1()); 
                    }
                    // InternalGraphqlidl.g:1122:3: ( rule__FloatValue__Group_1__0 )
                    // InternalGraphqlidl.g:1122:4: rule__FloatValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FloatValue__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFloatValueAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphqlidl.g:1126:2: ( ( rule__FloatValue__Group_2__0 ) )
                    {
                    // InternalGraphqlidl.g:1126:2: ( ( rule__FloatValue__Group_2__0 ) )
                    // InternalGraphqlidl.g:1127:3: ( rule__FloatValue__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFloatValueAccess().getGroup_2()); 
                    }
                    // InternalGraphqlidl.g:1128:3: ( rule__FloatValue__Group_2__0 )
                    // InternalGraphqlidl.g:1128:4: rule__FloatValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FloatValue__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFloatValueAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Alternatives"


    // $ANTLR start "rule__ExponentIndicator__Alternatives"
    // InternalGraphqlidl.g:1136:1: rule__ExponentIndicator__Alternatives : ( ( 'e' ) | ( 'E' ) );
    public final void rule__ExponentIndicator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1140:1: ( ( 'e' ) | ( 'E' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGraphqlidl.g:1141:2: ( 'e' )
                    {
                    // InternalGraphqlidl.g:1141:2: ( 'e' )
                    // InternalGraphqlidl.g:1142:3: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExponentIndicatorAccess().getEKeyword_0()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExponentIndicatorAccess().getEKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:1147:2: ( 'E' )
                    {
                    // InternalGraphqlidl.g:1147:2: ( 'E' )
                    // InternalGraphqlidl.g:1148:3: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExponentIndicatorAccess().getEKeyword_1()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExponentIndicatorAccess().getEKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentIndicator__Alternatives"


    // $ANTLR start "rule__Sign__Alternatives"
    // InternalGraphqlidl.g:1157:1: rule__Sign__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__Sign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1161:1: ( ( '+' ) | ( '-' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphqlidl.g:1162:2: ( '+' )
                    {
                    // InternalGraphqlidl.g:1162:2: ( '+' )
                    // InternalGraphqlidl.g:1163:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:1168:2: ( '-' )
                    {
                    // InternalGraphqlidl.g:1168:2: ( '-' )
                    // InternalGraphqlidl.g:1169:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sign__Alternatives"


    // $ANTLR start "rule__StringValue__Alternatives"
    // InternalGraphqlidl.g:1178:1: rule__StringValue__Alternatives : ( ( ( rule__StringValue__Group_0__0 ) ) | ( ( rule__StringValue__Group_1__0 ) ) );
    public final void rule__StringValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1182:1: ( ( ( rule__StringValue__Group_0__0 ) ) | ( ( rule__StringValue__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_STRING) ) {
                    alt11=2;
                }
                else if ( (LA11_1==43) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGraphqlidl.g:1183:2: ( ( rule__StringValue__Group_0__0 ) )
                    {
                    // InternalGraphqlidl.g:1183:2: ( ( rule__StringValue__Group_0__0 ) )
                    // InternalGraphqlidl.g:1184:3: ( rule__StringValue__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStringValueAccess().getGroup_0()); 
                    }
                    // InternalGraphqlidl.g:1185:3: ( rule__StringValue__Group_0__0 )
                    // InternalGraphqlidl.g:1185:4: rule__StringValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringValue__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStringValueAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:1189:2: ( ( rule__StringValue__Group_1__0 ) )
                    {
                    // InternalGraphqlidl.g:1189:2: ( ( rule__StringValue__Group_1__0 ) )
                    // InternalGraphqlidl.g:1190:3: ( rule__StringValue__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStringValueAccess().getGroup_1()); 
                    }
                    // InternalGraphqlidl.g:1191:3: ( rule__StringValue__Group_1__0 )
                    // InternalGraphqlidl.g:1191:4: rule__StringValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringValue__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStringValueAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Alternatives"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group__0"
    // InternalGraphqlidl.g:1199:1: rule__GraphqlSchemaDefinition__Group__0 : rule__GraphqlSchemaDefinition__Group__0__Impl rule__GraphqlSchemaDefinition__Group__1 ;
    public final void rule__GraphqlSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1203:1: ( rule__GraphqlSchemaDefinition__Group__0__Impl rule__GraphqlSchemaDefinition__Group__1 )
            // InternalGraphqlidl.g:1204:2: rule__GraphqlSchemaDefinition__Group__0__Impl rule__GraphqlSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GraphqlSchemaDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group__0"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group__0__Impl"
    // InternalGraphqlidl.g:1211:1: rule__GraphqlSchemaDefinition__Group__0__Impl : ( ( rule__GraphqlSchemaDefinition__NameAssignment_0 ) ) ;
    public final void rule__GraphqlSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1215:1: ( ( ( rule__GraphqlSchemaDefinition__NameAssignment_0 ) ) )
            // InternalGraphqlidl.g:1216:1: ( ( rule__GraphqlSchemaDefinition__NameAssignment_0 ) )
            {
            // InternalGraphqlidl.g:1216:1: ( ( rule__GraphqlSchemaDefinition__NameAssignment_0 ) )
            // InternalGraphqlidl.g:1217:2: ( rule__GraphqlSchemaDefinition__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getNameAssignment_0()); 
            }
            // InternalGraphqlidl.g:1218:2: ( rule__GraphqlSchemaDefinition__NameAssignment_0 )
            // InternalGraphqlidl.g:1218:3: rule__GraphqlSchemaDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group__1"
    // InternalGraphqlidl.g:1226:1: rule__GraphqlSchemaDefinition__Group__1 : rule__GraphqlSchemaDefinition__Group__1__Impl rule__GraphqlSchemaDefinition__Group__2 ;
    public final void rule__GraphqlSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1230:1: ( rule__GraphqlSchemaDefinition__Group__1__Impl rule__GraphqlSchemaDefinition__Group__2 )
            // InternalGraphqlidl.g:1231:2: rule__GraphqlSchemaDefinition__Group__1__Impl rule__GraphqlSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GraphqlSchemaDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group__1"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group__1__Impl"
    // InternalGraphqlidl.g:1238:1: rule__GraphqlSchemaDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__GraphqlSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1242:1: ( ( '{' ) )
            // InternalGraphqlidl.g:1243:1: ( '{' )
            {
            // InternalGraphqlidl.g:1243:1: ( '{' )
            // InternalGraphqlidl.g:1244:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group__2"
    // InternalGraphqlidl.g:1253:1: rule__GraphqlSchemaDefinition__Group__2 : rule__GraphqlSchemaDefinition__Group__2__Impl rule__GraphqlSchemaDefinition__Group__3 ;
    public final void rule__GraphqlSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1257:1: ( rule__GraphqlSchemaDefinition__Group__2__Impl rule__GraphqlSchemaDefinition__Group__3 )
            // InternalGraphqlidl.g:1258:2: rule__GraphqlSchemaDefinition__Group__2__Impl rule__GraphqlSchemaDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__GraphqlSchemaDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group__2"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group__2__Impl"
    // InternalGraphqlidl.g:1265:1: rule__GraphqlSchemaDefinition__Group__2__Impl : ( ( rule__GraphqlSchemaDefinition__RootQueryAssignment_2 ) ) ;
    public final void rule__GraphqlSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1269:1: ( ( ( rule__GraphqlSchemaDefinition__RootQueryAssignment_2 ) ) )
            // InternalGraphqlidl.g:1270:1: ( ( rule__GraphqlSchemaDefinition__RootQueryAssignment_2 ) )
            {
            // InternalGraphqlidl.g:1270:1: ( ( rule__GraphqlSchemaDefinition__RootQueryAssignment_2 ) )
            // InternalGraphqlidl.g:1271:2: ( rule__GraphqlSchemaDefinition__RootQueryAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getRootQueryAssignment_2()); 
            }
            // InternalGraphqlidl.g:1272:2: ( rule__GraphqlSchemaDefinition__RootQueryAssignment_2 )
            // InternalGraphqlidl.g:1272:3: rule__GraphqlSchemaDefinition__RootQueryAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__RootQueryAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getRootQueryAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group__3"
    // InternalGraphqlidl.g:1280:1: rule__GraphqlSchemaDefinition__Group__3 : rule__GraphqlSchemaDefinition__Group__3__Impl rule__GraphqlSchemaDefinition__Group__4 ;
    public final void rule__GraphqlSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1284:1: ( rule__GraphqlSchemaDefinition__Group__3__Impl rule__GraphqlSchemaDefinition__Group__4 )
            // InternalGraphqlidl.g:1285:2: rule__GraphqlSchemaDefinition__Group__3__Impl rule__GraphqlSchemaDefinition__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__GraphqlSchemaDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group__3"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group__3__Impl"
    // InternalGraphqlidl.g:1292:1: rule__GraphqlSchemaDefinition__Group__3__Impl : ( ( rule__GraphqlSchemaDefinition__Group_3__0 )? ) ;
    public final void rule__GraphqlSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1296:1: ( ( ( rule__GraphqlSchemaDefinition__Group_3__0 )? ) )
            // InternalGraphqlidl.g:1297:1: ( ( rule__GraphqlSchemaDefinition__Group_3__0 )? )
            {
            // InternalGraphqlidl.g:1297:1: ( ( rule__GraphqlSchemaDefinition__Group_3__0 )? )
            // InternalGraphqlidl.g:1298:2: ( rule__GraphqlSchemaDefinition__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getGroup_3()); 
            }
            // InternalGraphqlidl.g:1299:2: ( rule__GraphqlSchemaDefinition__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGraphqlidl.g:1299:3: rule__GraphqlSchemaDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlSchemaDefinition__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group__3__Impl"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group__4"
    // InternalGraphqlidl.g:1307:1: rule__GraphqlSchemaDefinition__Group__4 : rule__GraphqlSchemaDefinition__Group__4__Impl rule__GraphqlSchemaDefinition__Group__5 ;
    public final void rule__GraphqlSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1311:1: ( rule__GraphqlSchemaDefinition__Group__4__Impl rule__GraphqlSchemaDefinition__Group__5 )
            // InternalGraphqlidl.g:1312:2: rule__GraphqlSchemaDefinition__Group__4__Impl rule__GraphqlSchemaDefinition__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__GraphqlSchemaDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group__4"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group__4__Impl"
    // InternalGraphqlidl.g:1319:1: rule__GraphqlSchemaDefinition__Group__4__Impl : ( ( rule__GraphqlSchemaDefinition__Group_4__0 )? ) ;
    public final void rule__GraphqlSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1323:1: ( ( ( rule__GraphqlSchemaDefinition__Group_4__0 )? ) )
            // InternalGraphqlidl.g:1324:1: ( ( rule__GraphqlSchemaDefinition__Group_4__0 )? )
            {
            // InternalGraphqlidl.g:1324:1: ( ( rule__GraphqlSchemaDefinition__Group_4__0 )? )
            // InternalGraphqlidl.g:1325:2: ( rule__GraphqlSchemaDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getGroup_4()); 
            }
            // InternalGraphqlidl.g:1326:2: ( rule__GraphqlSchemaDefinition__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGraphqlidl.g:1326:3: rule__GraphqlSchemaDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlSchemaDefinition__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group__4__Impl"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group__5"
    // InternalGraphqlidl.g:1334:1: rule__GraphqlSchemaDefinition__Group__5 : rule__GraphqlSchemaDefinition__Group__5__Impl ;
    public final void rule__GraphqlSchemaDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1338:1: ( rule__GraphqlSchemaDefinition__Group__5__Impl )
            // InternalGraphqlidl.g:1339:2: rule__GraphqlSchemaDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group__5"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group__5__Impl"
    // InternalGraphqlidl.g:1345:1: rule__GraphqlSchemaDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__GraphqlSchemaDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1349:1: ( ( '}' ) )
            // InternalGraphqlidl.g:1350:1: ( '}' )
            {
            // InternalGraphqlidl.g:1350:1: ( '}' )
            // InternalGraphqlidl.g:1351:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group__5__Impl"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group_3__0"
    // InternalGraphqlidl.g:1361:1: rule__GraphqlSchemaDefinition__Group_3__0 : rule__GraphqlSchemaDefinition__Group_3__0__Impl rule__GraphqlSchemaDefinition__Group_3__1 ;
    public final void rule__GraphqlSchemaDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1365:1: ( rule__GraphqlSchemaDefinition__Group_3__0__Impl rule__GraphqlSchemaDefinition__Group_3__1 )
            // InternalGraphqlidl.g:1366:2: rule__GraphqlSchemaDefinition__Group_3__0__Impl rule__GraphqlSchemaDefinition__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__GraphqlSchemaDefinition__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group_3__0"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group_3__0__Impl"
    // InternalGraphqlidl.g:1373:1: rule__GraphqlSchemaDefinition__Group_3__0__Impl : ( 'mutation' ) ;
    public final void rule__GraphqlSchemaDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1377:1: ( ( 'mutation' ) )
            // InternalGraphqlidl.g:1378:1: ( 'mutation' )
            {
            // InternalGraphqlidl.g:1378:1: ( 'mutation' )
            // InternalGraphqlidl.g:1379:2: 'mutation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getMutationKeyword_3_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getMutationKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group_3__1"
    // InternalGraphqlidl.g:1388:1: rule__GraphqlSchemaDefinition__Group_3__1 : rule__GraphqlSchemaDefinition__Group_3__1__Impl rule__GraphqlSchemaDefinition__Group_3__2 ;
    public final void rule__GraphqlSchemaDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1392:1: ( rule__GraphqlSchemaDefinition__Group_3__1__Impl rule__GraphqlSchemaDefinition__Group_3__2 )
            // InternalGraphqlidl.g:1393:2: rule__GraphqlSchemaDefinition__Group_3__1__Impl rule__GraphqlSchemaDefinition__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlSchemaDefinition__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group_3__1"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group_3__1__Impl"
    // InternalGraphqlidl.g:1400:1: rule__GraphqlSchemaDefinition__Group_3__1__Impl : ( ':' ) ;
    public final void rule__GraphqlSchemaDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1404:1: ( ( ':' ) )
            // InternalGraphqlidl.g:1405:1: ( ':' )
            {
            // InternalGraphqlidl.g:1405:1: ( ':' )
            // InternalGraphqlidl.g:1406:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getColonKeyword_3_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getColonKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group_3__2"
    // InternalGraphqlidl.g:1415:1: rule__GraphqlSchemaDefinition__Group_3__2 : rule__GraphqlSchemaDefinition__Group_3__2__Impl ;
    public final void rule__GraphqlSchemaDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1419:1: ( rule__GraphqlSchemaDefinition__Group_3__2__Impl )
            // InternalGraphqlidl.g:1420:2: rule__GraphqlSchemaDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group_3__2"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group_3__2__Impl"
    // InternalGraphqlidl.g:1426:1: rule__GraphqlSchemaDefinition__Group_3__2__Impl : ( ( rule__GraphqlSchemaDefinition__MutationAssignment_3_2 ) ) ;
    public final void rule__GraphqlSchemaDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1430:1: ( ( ( rule__GraphqlSchemaDefinition__MutationAssignment_3_2 ) ) )
            // InternalGraphqlidl.g:1431:1: ( ( rule__GraphqlSchemaDefinition__MutationAssignment_3_2 ) )
            {
            // InternalGraphqlidl.g:1431:1: ( ( rule__GraphqlSchemaDefinition__MutationAssignment_3_2 ) )
            // InternalGraphqlidl.g:1432:2: ( rule__GraphqlSchemaDefinition__MutationAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getMutationAssignment_3_2()); 
            }
            // InternalGraphqlidl.g:1433:2: ( rule__GraphqlSchemaDefinition__MutationAssignment_3_2 )
            // InternalGraphqlidl.g:1433:3: rule__GraphqlSchemaDefinition__MutationAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__MutationAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getMutationAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group_4__0"
    // InternalGraphqlidl.g:1442:1: rule__GraphqlSchemaDefinition__Group_4__0 : rule__GraphqlSchemaDefinition__Group_4__0__Impl rule__GraphqlSchemaDefinition__Group_4__1 ;
    public final void rule__GraphqlSchemaDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1446:1: ( rule__GraphqlSchemaDefinition__Group_4__0__Impl rule__GraphqlSchemaDefinition__Group_4__1 )
            // InternalGraphqlidl.g:1447:2: rule__GraphqlSchemaDefinition__Group_4__0__Impl rule__GraphqlSchemaDefinition__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__GraphqlSchemaDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group_4__0"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group_4__0__Impl"
    // InternalGraphqlidl.g:1454:1: rule__GraphqlSchemaDefinition__Group_4__0__Impl : ( 'subscription' ) ;
    public final void rule__GraphqlSchemaDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1458:1: ( ( 'subscription' ) )
            // InternalGraphqlidl.g:1459:1: ( 'subscription' )
            {
            // InternalGraphqlidl.g:1459:1: ( 'subscription' )
            // InternalGraphqlidl.g:1460:2: 'subscription'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getSubscriptionKeyword_4_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getSubscriptionKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group_4__1"
    // InternalGraphqlidl.g:1469:1: rule__GraphqlSchemaDefinition__Group_4__1 : rule__GraphqlSchemaDefinition__Group_4__1__Impl rule__GraphqlSchemaDefinition__Group_4__2 ;
    public final void rule__GraphqlSchemaDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1473:1: ( rule__GraphqlSchemaDefinition__Group_4__1__Impl rule__GraphqlSchemaDefinition__Group_4__2 )
            // InternalGraphqlidl.g:1474:2: rule__GraphqlSchemaDefinition__Group_4__1__Impl rule__GraphqlSchemaDefinition__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlSchemaDefinition__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group_4__1"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group_4__1__Impl"
    // InternalGraphqlidl.g:1481:1: rule__GraphqlSchemaDefinition__Group_4__1__Impl : ( ':' ) ;
    public final void rule__GraphqlSchemaDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1485:1: ( ( ':' ) )
            // InternalGraphqlidl.g:1486:1: ( ':' )
            {
            // InternalGraphqlidl.g:1486:1: ( ':' )
            // InternalGraphqlidl.g:1487:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getColonKeyword_4_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getColonKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group_4__2"
    // InternalGraphqlidl.g:1496:1: rule__GraphqlSchemaDefinition__Group_4__2 : rule__GraphqlSchemaDefinition__Group_4__2__Impl ;
    public final void rule__GraphqlSchemaDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1500:1: ( rule__GraphqlSchemaDefinition__Group_4__2__Impl )
            // InternalGraphqlidl.g:1501:2: rule__GraphqlSchemaDefinition__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group_4__2"


    // $ANTLR start "rule__GraphqlSchemaDefinition__Group_4__2__Impl"
    // InternalGraphqlidl.g:1507:1: rule__GraphqlSchemaDefinition__Group_4__2__Impl : ( ( rule__GraphqlSchemaDefinition__SubcriptionAssignment_4_2 ) ) ;
    public final void rule__GraphqlSchemaDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1511:1: ( ( ( rule__GraphqlSchemaDefinition__SubcriptionAssignment_4_2 ) ) )
            // InternalGraphqlidl.g:1512:1: ( ( rule__GraphqlSchemaDefinition__SubcriptionAssignment_4_2 ) )
            {
            // InternalGraphqlidl.g:1512:1: ( ( rule__GraphqlSchemaDefinition__SubcriptionAssignment_4_2 ) )
            // InternalGraphqlidl.g:1513:2: ( rule__GraphqlSchemaDefinition__SubcriptionAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getSubcriptionAssignment_4_2()); 
            }
            // InternalGraphqlidl.g:1514:2: ( rule__GraphqlSchemaDefinition__SubcriptionAssignment_4_2 )
            // InternalGraphqlidl.g:1514:3: rule__GraphqlSchemaDefinition__SubcriptionAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlSchemaDefinition__SubcriptionAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getSubcriptionAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__GraphqlRootQuery__Group__0"
    // InternalGraphqlidl.g:1523:1: rule__GraphqlRootQuery__Group__0 : rule__GraphqlRootQuery__Group__0__Impl rule__GraphqlRootQuery__Group__1 ;
    public final void rule__GraphqlRootQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1527:1: ( rule__GraphqlRootQuery__Group__0__Impl rule__GraphqlRootQuery__Group__1 )
            // InternalGraphqlidl.g:1528:2: rule__GraphqlRootQuery__Group__0__Impl rule__GraphqlRootQuery__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__GraphqlRootQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlRootQuery__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlRootQuery__Group__0"


    // $ANTLR start "rule__GraphqlRootQuery__Group__0__Impl"
    // InternalGraphqlidl.g:1535:1: rule__GraphqlRootQuery__Group__0__Impl : ( ( rule__GraphqlRootQuery__NameAssignment_0 ) ) ;
    public final void rule__GraphqlRootQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1539:1: ( ( ( rule__GraphqlRootQuery__NameAssignment_0 ) ) )
            // InternalGraphqlidl.g:1540:1: ( ( rule__GraphqlRootQuery__NameAssignment_0 ) )
            {
            // InternalGraphqlidl.g:1540:1: ( ( rule__GraphqlRootQuery__NameAssignment_0 ) )
            // InternalGraphqlidl.g:1541:2: ( rule__GraphqlRootQuery__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlRootQueryAccess().getNameAssignment_0()); 
            }
            // InternalGraphqlidl.g:1542:2: ( rule__GraphqlRootQuery__NameAssignment_0 )
            // InternalGraphqlidl.g:1542:3: rule__GraphqlRootQuery__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlRootQuery__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlRootQueryAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlRootQuery__Group__0__Impl"


    // $ANTLR start "rule__GraphqlRootQuery__Group__1"
    // InternalGraphqlidl.g:1550:1: rule__GraphqlRootQuery__Group__1 : rule__GraphqlRootQuery__Group__1__Impl rule__GraphqlRootQuery__Group__2 ;
    public final void rule__GraphqlRootQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1554:1: ( rule__GraphqlRootQuery__Group__1__Impl rule__GraphqlRootQuery__Group__2 )
            // InternalGraphqlidl.g:1555:2: rule__GraphqlRootQuery__Group__1__Impl rule__GraphqlRootQuery__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlRootQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlRootQuery__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlRootQuery__Group__1"


    // $ANTLR start "rule__GraphqlRootQuery__Group__1__Impl"
    // InternalGraphqlidl.g:1562:1: rule__GraphqlRootQuery__Group__1__Impl : ( ':' ) ;
    public final void rule__GraphqlRootQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1566:1: ( ( ':' ) )
            // InternalGraphqlidl.g:1567:1: ( ':' )
            {
            // InternalGraphqlidl.g:1567:1: ( ':' )
            // InternalGraphqlidl.g:1568:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlRootQueryAccess().getColonKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlRootQueryAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlRootQuery__Group__1__Impl"


    // $ANTLR start "rule__GraphqlRootQuery__Group__2"
    // InternalGraphqlidl.g:1577:1: rule__GraphqlRootQuery__Group__2 : rule__GraphqlRootQuery__Group__2__Impl ;
    public final void rule__GraphqlRootQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1581:1: ( rule__GraphqlRootQuery__Group__2__Impl )
            // InternalGraphqlidl.g:1582:2: rule__GraphqlRootQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlRootQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlRootQuery__Group__2"


    // $ANTLR start "rule__GraphqlRootQuery__Group__2__Impl"
    // InternalGraphqlidl.g:1588:1: rule__GraphqlRootQuery__Group__2__Impl : ( ( rule__GraphqlRootQuery__QueryAssignment_2 ) ) ;
    public final void rule__GraphqlRootQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1592:1: ( ( ( rule__GraphqlRootQuery__QueryAssignment_2 ) ) )
            // InternalGraphqlidl.g:1593:1: ( ( rule__GraphqlRootQuery__QueryAssignment_2 ) )
            {
            // InternalGraphqlidl.g:1593:1: ( ( rule__GraphqlRootQuery__QueryAssignment_2 ) )
            // InternalGraphqlidl.g:1594:2: ( rule__GraphqlRootQuery__QueryAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlRootQueryAccess().getQueryAssignment_2()); 
            }
            // InternalGraphqlidl.g:1595:2: ( rule__GraphqlRootQuery__QueryAssignment_2 )
            // InternalGraphqlidl.g:1595:3: rule__GraphqlRootQuery__QueryAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlRootQuery__QueryAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlRootQueryAccess().getQueryAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlRootQuery__Group__2__Impl"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group__0"
    // InternalGraphqlidl.g:1604:1: rule__GraphqlObjectTypeDefinition__Group__0 : rule__GraphqlObjectTypeDefinition__Group__0__Impl rule__GraphqlObjectTypeDefinition__Group__1 ;
    public final void rule__GraphqlObjectTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1608:1: ( rule__GraphqlObjectTypeDefinition__Group__0__Impl rule__GraphqlObjectTypeDefinition__Group__1 )
            // InternalGraphqlidl.g:1609:2: rule__GraphqlObjectTypeDefinition__Group__0__Impl rule__GraphqlObjectTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlObjectTypeDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlObjectTypeDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group__0"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group__0__Impl"
    // InternalGraphqlidl.g:1616:1: rule__GraphqlObjectTypeDefinition__Group__0__Impl : ( 'type' ) ;
    public final void rule__GraphqlObjectTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1620:1: ( ( 'type' ) )
            // InternalGraphqlidl.g:1621:1: ( 'type' )
            {
            // InternalGraphqlidl.g:1621:1: ( 'type' )
            // InternalGraphqlidl.g:1622:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getTypeKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getTypeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group__1"
    // InternalGraphqlidl.g:1631:1: rule__GraphqlObjectTypeDefinition__Group__1 : rule__GraphqlObjectTypeDefinition__Group__1__Impl rule__GraphqlObjectTypeDefinition__Group__2 ;
    public final void rule__GraphqlObjectTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1635:1: ( rule__GraphqlObjectTypeDefinition__Group__1__Impl rule__GraphqlObjectTypeDefinition__Group__2 )
            // InternalGraphqlidl.g:1636:2: rule__GraphqlObjectTypeDefinition__Group__1__Impl rule__GraphqlObjectTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__GraphqlObjectTypeDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlObjectTypeDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group__1"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group__1__Impl"
    // InternalGraphqlidl.g:1643:1: rule__GraphqlObjectTypeDefinition__Group__1__Impl : ( ( rule__GraphqlObjectTypeDefinition__NameAssignment_1 ) ) ;
    public final void rule__GraphqlObjectTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1647:1: ( ( ( rule__GraphqlObjectTypeDefinition__NameAssignment_1 ) ) )
            // InternalGraphqlidl.g:1648:1: ( ( rule__GraphqlObjectTypeDefinition__NameAssignment_1 ) )
            {
            // InternalGraphqlidl.g:1648:1: ( ( rule__GraphqlObjectTypeDefinition__NameAssignment_1 ) )
            // InternalGraphqlidl.g:1649:2: ( rule__GraphqlObjectTypeDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getNameAssignment_1()); 
            }
            // InternalGraphqlidl.g:1650:2: ( rule__GraphqlObjectTypeDefinition__NameAssignment_1 )
            // InternalGraphqlidl.g:1650:3: rule__GraphqlObjectTypeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlObjectTypeDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group__2"
    // InternalGraphqlidl.g:1658:1: rule__GraphqlObjectTypeDefinition__Group__2 : rule__GraphqlObjectTypeDefinition__Group__2__Impl rule__GraphqlObjectTypeDefinition__Group__3 ;
    public final void rule__GraphqlObjectTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1662:1: ( rule__GraphqlObjectTypeDefinition__Group__2__Impl rule__GraphqlObjectTypeDefinition__Group__3 )
            // InternalGraphqlidl.g:1663:2: rule__GraphqlObjectTypeDefinition__Group__2__Impl rule__GraphqlObjectTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__GraphqlObjectTypeDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlObjectTypeDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group__2"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group__2__Impl"
    // InternalGraphqlidl.g:1670:1: rule__GraphqlObjectTypeDefinition__Group__2__Impl : ( ( rule__GraphqlObjectTypeDefinition__Group_2__0 )? ) ;
    public final void rule__GraphqlObjectTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1674:1: ( ( ( rule__GraphqlObjectTypeDefinition__Group_2__0 )? ) )
            // InternalGraphqlidl.g:1675:1: ( ( rule__GraphqlObjectTypeDefinition__Group_2__0 )? )
            {
            // InternalGraphqlidl.g:1675:1: ( ( rule__GraphqlObjectTypeDefinition__Group_2__0 )? )
            // InternalGraphqlidl.g:1676:2: ( rule__GraphqlObjectTypeDefinition__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getGroup_2()); 
            }
            // InternalGraphqlidl.g:1677:2: ( rule__GraphqlObjectTypeDefinition__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGraphqlidl.g:1677:3: rule__GraphqlObjectTypeDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlObjectTypeDefinition__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group__3"
    // InternalGraphqlidl.g:1685:1: rule__GraphqlObjectTypeDefinition__Group__3 : rule__GraphqlObjectTypeDefinition__Group__3__Impl rule__GraphqlObjectTypeDefinition__Group__4 ;
    public final void rule__GraphqlObjectTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1689:1: ( rule__GraphqlObjectTypeDefinition__Group__3__Impl rule__GraphqlObjectTypeDefinition__Group__4 )
            // InternalGraphqlidl.g:1690:2: rule__GraphqlObjectTypeDefinition__Group__3__Impl rule__GraphqlObjectTypeDefinition__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlObjectTypeDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlObjectTypeDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group__3"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group__3__Impl"
    // InternalGraphqlidl.g:1697:1: rule__GraphqlObjectTypeDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__GraphqlObjectTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1701:1: ( ( '{' ) )
            // InternalGraphqlidl.g:1702:1: ( '{' )
            {
            // InternalGraphqlidl.g:1702:1: ( '{' )
            // InternalGraphqlidl.g:1703:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group__3__Impl"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group__4"
    // InternalGraphqlidl.g:1712:1: rule__GraphqlObjectTypeDefinition__Group__4 : rule__GraphqlObjectTypeDefinition__Group__4__Impl rule__GraphqlObjectTypeDefinition__Group__5 ;
    public final void rule__GraphqlObjectTypeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1716:1: ( rule__GraphqlObjectTypeDefinition__Group__4__Impl rule__GraphqlObjectTypeDefinition__Group__5 )
            // InternalGraphqlidl.g:1717:2: rule__GraphqlObjectTypeDefinition__Group__4__Impl rule__GraphqlObjectTypeDefinition__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__GraphqlObjectTypeDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlObjectTypeDefinition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group__4"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group__4__Impl"
    // InternalGraphqlidl.g:1724:1: rule__GraphqlObjectTypeDefinition__Group__4__Impl : ( ( ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 ) ) ( ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 )* ) ) ;
    public final void rule__GraphqlObjectTypeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1728:1: ( ( ( ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 ) ) ( ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 )* ) ) )
            // InternalGraphqlidl.g:1729:1: ( ( ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 ) ) ( ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 )* ) )
            {
            // InternalGraphqlidl.g:1729:1: ( ( ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 ) ) ( ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 )* ) )
            // InternalGraphqlidl.g:1730:2: ( ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 ) ) ( ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 )* )
            {
            // InternalGraphqlidl.g:1730:2: ( ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 ) )
            // InternalGraphqlidl.g:1731:3: ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getFieldsAssignment_4()); 
            }
            // InternalGraphqlidl.g:1732:3: ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 )
            // InternalGraphqlidl.g:1732:4: rule__GraphqlObjectTypeDefinition__FieldsAssignment_4
            {
            pushFollow(FOLLOW_10);
            rule__GraphqlObjectTypeDefinition__FieldsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getFieldsAssignment_4()); 
            }

            }

            // InternalGraphqlidl.g:1735:2: ( ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 )* )
            // InternalGraphqlidl.g:1736:3: ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getFieldsAssignment_4()); 
            }
            // InternalGraphqlidl.g:1737:3: ( rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_NAME) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGraphqlidl.g:1737:4: rule__GraphqlObjectTypeDefinition__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__GraphqlObjectTypeDefinition__FieldsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getFieldsAssignment_4()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group__4__Impl"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group__5"
    // InternalGraphqlidl.g:1746:1: rule__GraphqlObjectTypeDefinition__Group__5 : rule__GraphqlObjectTypeDefinition__Group__5__Impl ;
    public final void rule__GraphqlObjectTypeDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1750:1: ( rule__GraphqlObjectTypeDefinition__Group__5__Impl )
            // InternalGraphqlidl.g:1751:2: rule__GraphqlObjectTypeDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlObjectTypeDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group__5"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group__5__Impl"
    // InternalGraphqlidl.g:1757:1: rule__GraphqlObjectTypeDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__GraphqlObjectTypeDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1761:1: ( ( '}' ) )
            // InternalGraphqlidl.g:1762:1: ( '}' )
            {
            // InternalGraphqlidl.g:1762:1: ( '}' )
            // InternalGraphqlidl.g:1763:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group__5__Impl"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group_2__0"
    // InternalGraphqlidl.g:1773:1: rule__GraphqlObjectTypeDefinition__Group_2__0 : rule__GraphqlObjectTypeDefinition__Group_2__0__Impl rule__GraphqlObjectTypeDefinition__Group_2__1 ;
    public final void rule__GraphqlObjectTypeDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1777:1: ( rule__GraphqlObjectTypeDefinition__Group_2__0__Impl rule__GraphqlObjectTypeDefinition__Group_2__1 )
            // InternalGraphqlidl.g:1778:2: rule__GraphqlObjectTypeDefinition__Group_2__0__Impl rule__GraphqlObjectTypeDefinition__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlObjectTypeDefinition__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlObjectTypeDefinition__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group_2__0"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group_2__0__Impl"
    // InternalGraphqlidl.g:1785:1: rule__GraphqlObjectTypeDefinition__Group_2__0__Impl : ( 'implements' ) ;
    public final void rule__GraphqlObjectTypeDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1789:1: ( ( 'implements' ) )
            // InternalGraphqlidl.g:1790:1: ( 'implements' )
            {
            // InternalGraphqlidl.g:1790:1: ( 'implements' )
            // InternalGraphqlidl.g:1791:2: 'implements'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getImplementsKeyword_2_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getImplementsKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group_2__1"
    // InternalGraphqlidl.g:1800:1: rule__GraphqlObjectTypeDefinition__Group_2__1 : rule__GraphqlObjectTypeDefinition__Group_2__1__Impl ;
    public final void rule__GraphqlObjectTypeDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1804:1: ( rule__GraphqlObjectTypeDefinition__Group_2__1__Impl )
            // InternalGraphqlidl.g:1805:2: rule__GraphqlObjectTypeDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlObjectTypeDefinition__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group_2__1"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__Group_2__1__Impl"
    // InternalGraphqlidl.g:1811:1: rule__GraphqlObjectTypeDefinition__Group_2__1__Impl : ( ( ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 ) ) ( ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 )* ) ) ;
    public final void rule__GraphqlObjectTypeDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1815:1: ( ( ( ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 ) ) ( ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 )* ) ) )
            // InternalGraphqlidl.g:1816:1: ( ( ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 ) ) ( ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 )* ) )
            {
            // InternalGraphqlidl.g:1816:1: ( ( ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 ) ) ( ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 )* ) )
            // InternalGraphqlidl.g:1817:2: ( ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 ) ) ( ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 )* )
            {
            // InternalGraphqlidl.g:1817:2: ( ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 ) )
            // InternalGraphqlidl.g:1818:3: ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getInterfacesAssignment_2_1()); 
            }
            // InternalGraphqlidl.g:1819:3: ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 )
            // InternalGraphqlidl.g:1819:4: rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1
            {
            pushFollow(FOLLOW_10);
            rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getInterfacesAssignment_2_1()); 
            }

            }

            // InternalGraphqlidl.g:1822:2: ( ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 )* )
            // InternalGraphqlidl.g:1823:3: ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getInterfacesAssignment_2_1()); 
            }
            // InternalGraphqlidl.g:1824:3: ( rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_NAME) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGraphqlidl.g:1824:4: rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getInterfacesAssignment_2_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__GraphqlInterfaceTypeDefinition__Group__0"
    // InternalGraphqlidl.g:1834:1: rule__GraphqlInterfaceTypeDefinition__Group__0 : rule__GraphqlInterfaceTypeDefinition__Group__0__Impl rule__GraphqlInterfaceTypeDefinition__Group__1 ;
    public final void rule__GraphqlInterfaceTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1838:1: ( rule__GraphqlInterfaceTypeDefinition__Group__0__Impl rule__GraphqlInterfaceTypeDefinition__Group__1 )
            // InternalGraphqlidl.g:1839:2: rule__GraphqlInterfaceTypeDefinition__Group__0__Impl rule__GraphqlInterfaceTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlInterfaceTypeDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlInterfaceTypeDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInterfaceTypeDefinition__Group__0"


    // $ANTLR start "rule__GraphqlInterfaceTypeDefinition__Group__0__Impl"
    // InternalGraphqlidl.g:1846:1: rule__GraphqlInterfaceTypeDefinition__Group__0__Impl : ( 'interface' ) ;
    public final void rule__GraphqlInterfaceTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1850:1: ( ( 'interface' ) )
            // InternalGraphqlidl.g:1851:1: ( 'interface' )
            {
            // InternalGraphqlidl.g:1851:1: ( 'interface' )
            // InternalGraphqlidl.g:1852:2: 'interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getInterfaceKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getInterfaceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInterfaceTypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__GraphqlInterfaceTypeDefinition__Group__1"
    // InternalGraphqlidl.g:1861:1: rule__GraphqlInterfaceTypeDefinition__Group__1 : rule__GraphqlInterfaceTypeDefinition__Group__1__Impl rule__GraphqlInterfaceTypeDefinition__Group__2 ;
    public final void rule__GraphqlInterfaceTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1865:1: ( rule__GraphqlInterfaceTypeDefinition__Group__1__Impl rule__GraphqlInterfaceTypeDefinition__Group__2 )
            // InternalGraphqlidl.g:1866:2: rule__GraphqlInterfaceTypeDefinition__Group__1__Impl rule__GraphqlInterfaceTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__GraphqlInterfaceTypeDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlInterfaceTypeDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInterfaceTypeDefinition__Group__1"


    // $ANTLR start "rule__GraphqlInterfaceTypeDefinition__Group__1__Impl"
    // InternalGraphqlidl.g:1873:1: rule__GraphqlInterfaceTypeDefinition__Group__1__Impl : ( ( rule__GraphqlInterfaceTypeDefinition__NameAssignment_1 ) ) ;
    public final void rule__GraphqlInterfaceTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1877:1: ( ( ( rule__GraphqlInterfaceTypeDefinition__NameAssignment_1 ) ) )
            // InternalGraphqlidl.g:1878:1: ( ( rule__GraphqlInterfaceTypeDefinition__NameAssignment_1 ) )
            {
            // InternalGraphqlidl.g:1878:1: ( ( rule__GraphqlInterfaceTypeDefinition__NameAssignment_1 ) )
            // InternalGraphqlidl.g:1879:2: ( rule__GraphqlInterfaceTypeDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getNameAssignment_1()); 
            }
            // InternalGraphqlidl.g:1880:2: ( rule__GraphqlInterfaceTypeDefinition__NameAssignment_1 )
            // InternalGraphqlidl.g:1880:3: rule__GraphqlInterfaceTypeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInterfaceTypeDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInterfaceTypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__GraphqlInterfaceTypeDefinition__Group__2"
    // InternalGraphqlidl.g:1888:1: rule__GraphqlInterfaceTypeDefinition__Group__2 : rule__GraphqlInterfaceTypeDefinition__Group__2__Impl rule__GraphqlInterfaceTypeDefinition__Group__3 ;
    public final void rule__GraphqlInterfaceTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1892:1: ( rule__GraphqlInterfaceTypeDefinition__Group__2__Impl rule__GraphqlInterfaceTypeDefinition__Group__3 )
            // InternalGraphqlidl.g:1893:2: rule__GraphqlInterfaceTypeDefinition__Group__2__Impl rule__GraphqlInterfaceTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlInterfaceTypeDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlInterfaceTypeDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInterfaceTypeDefinition__Group__2"


    // $ANTLR start "rule__GraphqlInterfaceTypeDefinition__Group__2__Impl"
    // InternalGraphqlidl.g:1900:1: rule__GraphqlInterfaceTypeDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__GraphqlInterfaceTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1904:1: ( ( '{' ) )
            // InternalGraphqlidl.g:1905:1: ( '{' )
            {
            // InternalGraphqlidl.g:1905:1: ( '{' )
            // InternalGraphqlidl.g:1906:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInterfaceTypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__GraphqlInterfaceTypeDefinition__Group__3"
    // InternalGraphqlidl.g:1915:1: rule__GraphqlInterfaceTypeDefinition__Group__3 : rule__GraphqlInterfaceTypeDefinition__Group__3__Impl rule__GraphqlInterfaceTypeDefinition__Group__4 ;
    public final void rule__GraphqlInterfaceTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1919:1: ( rule__GraphqlInterfaceTypeDefinition__Group__3__Impl rule__GraphqlInterfaceTypeDefinition__Group__4 )
            // InternalGraphqlidl.g:1920:2: rule__GraphqlInterfaceTypeDefinition__Group__3__Impl rule__GraphqlInterfaceTypeDefinition__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__GraphqlInterfaceTypeDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlInterfaceTypeDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInterfaceTypeDefinition__Group__3"


    // $ANTLR start "rule__GraphqlInterfaceTypeDefinition__Group__3__Impl"
    // InternalGraphqlidl.g:1927:1: rule__GraphqlInterfaceTypeDefinition__Group__3__Impl : ( ( ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 ) ) ( ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 )* ) ) ;
    public final void rule__GraphqlInterfaceTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1931:1: ( ( ( ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 ) ) ( ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 )* ) ) )
            // InternalGraphqlidl.g:1932:1: ( ( ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 ) ) ( ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 )* ) )
            {
            // InternalGraphqlidl.g:1932:1: ( ( ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 ) ) ( ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 )* ) )
            // InternalGraphqlidl.g:1933:2: ( ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 ) ) ( ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 )* )
            {
            // InternalGraphqlidl.g:1933:2: ( ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 ) )
            // InternalGraphqlidl.g:1934:3: ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getFieldsAssignment_3()); 
            }
            // InternalGraphqlidl.g:1935:3: ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 )
            // InternalGraphqlidl.g:1935:4: rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getFieldsAssignment_3()); 
            }

            }

            // InternalGraphqlidl.g:1938:2: ( ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 )* )
            // InternalGraphqlidl.g:1939:3: ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getFieldsAssignment_3()); 
            }
            // InternalGraphqlidl.g:1940:3: ( rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_NAME) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGraphqlidl.g:1940:4: rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getFieldsAssignment_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInterfaceTypeDefinition__Group__3__Impl"


    // $ANTLR start "rule__GraphqlInterfaceTypeDefinition__Group__4"
    // InternalGraphqlidl.g:1949:1: rule__GraphqlInterfaceTypeDefinition__Group__4 : rule__GraphqlInterfaceTypeDefinition__Group__4__Impl ;
    public final void rule__GraphqlInterfaceTypeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1953:1: ( rule__GraphqlInterfaceTypeDefinition__Group__4__Impl )
            // InternalGraphqlidl.g:1954:2: rule__GraphqlInterfaceTypeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInterfaceTypeDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInterfaceTypeDefinition__Group__4"


    // $ANTLR start "rule__GraphqlInterfaceTypeDefinition__Group__4__Impl"
    // InternalGraphqlidl.g:1960:1: rule__GraphqlInterfaceTypeDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__GraphqlInterfaceTypeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1964:1: ( ( '}' ) )
            // InternalGraphqlidl.g:1965:1: ( '}' )
            {
            // InternalGraphqlidl.g:1965:1: ( '}' )
            // InternalGraphqlidl.g:1966:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInterfaceTypeDefinition__Group__4__Impl"


    // $ANTLR start "rule__GraphqlScalarTypeDefinition__Group__0"
    // InternalGraphqlidl.g:1976:1: rule__GraphqlScalarTypeDefinition__Group__0 : rule__GraphqlScalarTypeDefinition__Group__0__Impl rule__GraphqlScalarTypeDefinition__Group__1 ;
    public final void rule__GraphqlScalarTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1980:1: ( rule__GraphqlScalarTypeDefinition__Group__0__Impl rule__GraphqlScalarTypeDefinition__Group__1 )
            // InternalGraphqlidl.g:1981:2: rule__GraphqlScalarTypeDefinition__Group__0__Impl rule__GraphqlScalarTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlScalarTypeDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlScalarTypeDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlScalarTypeDefinition__Group__0"


    // $ANTLR start "rule__GraphqlScalarTypeDefinition__Group__0__Impl"
    // InternalGraphqlidl.g:1988:1: rule__GraphqlScalarTypeDefinition__Group__0__Impl : ( 'scalar' ) ;
    public final void rule__GraphqlScalarTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:1992:1: ( ( 'scalar' ) )
            // InternalGraphqlidl.g:1993:1: ( 'scalar' )
            {
            // InternalGraphqlidl.g:1993:1: ( 'scalar' )
            // InternalGraphqlidl.g:1994:2: 'scalar'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlScalarTypeDefinitionAccess().getScalarKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlScalarTypeDefinitionAccess().getScalarKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlScalarTypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__GraphqlScalarTypeDefinition__Group__1"
    // InternalGraphqlidl.g:2003:1: rule__GraphqlScalarTypeDefinition__Group__1 : rule__GraphqlScalarTypeDefinition__Group__1__Impl ;
    public final void rule__GraphqlScalarTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2007:1: ( rule__GraphqlScalarTypeDefinition__Group__1__Impl )
            // InternalGraphqlidl.g:2008:2: rule__GraphqlScalarTypeDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlScalarTypeDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlScalarTypeDefinition__Group__1"


    // $ANTLR start "rule__GraphqlScalarTypeDefinition__Group__1__Impl"
    // InternalGraphqlidl.g:2014:1: rule__GraphqlScalarTypeDefinition__Group__1__Impl : ( ( rule__GraphqlScalarTypeDefinition__NameAssignment_1 ) ) ;
    public final void rule__GraphqlScalarTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2018:1: ( ( ( rule__GraphqlScalarTypeDefinition__NameAssignment_1 ) ) )
            // InternalGraphqlidl.g:2019:1: ( ( rule__GraphqlScalarTypeDefinition__NameAssignment_1 ) )
            {
            // InternalGraphqlidl.g:2019:1: ( ( rule__GraphqlScalarTypeDefinition__NameAssignment_1 ) )
            // InternalGraphqlidl.g:2020:2: ( rule__GraphqlScalarTypeDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlScalarTypeDefinitionAccess().getNameAssignment_1()); 
            }
            // InternalGraphqlidl.g:2021:2: ( rule__GraphqlScalarTypeDefinition__NameAssignment_1 )
            // InternalGraphqlidl.g:2021:3: rule__GraphqlScalarTypeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlScalarTypeDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlScalarTypeDefinitionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlScalarTypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__GraphqlEmunTypeDefinition__Group__0"
    // InternalGraphqlidl.g:2030:1: rule__GraphqlEmunTypeDefinition__Group__0 : rule__GraphqlEmunTypeDefinition__Group__0__Impl rule__GraphqlEmunTypeDefinition__Group__1 ;
    public final void rule__GraphqlEmunTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2034:1: ( rule__GraphqlEmunTypeDefinition__Group__0__Impl rule__GraphqlEmunTypeDefinition__Group__1 )
            // InternalGraphqlidl.g:2035:2: rule__GraphqlEmunTypeDefinition__Group__0__Impl rule__GraphqlEmunTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlEmunTypeDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlEmunTypeDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlEmunTypeDefinition__Group__0"


    // $ANTLR start "rule__GraphqlEmunTypeDefinition__Group__0__Impl"
    // InternalGraphqlidl.g:2042:1: rule__GraphqlEmunTypeDefinition__Group__0__Impl : ( 'enum' ) ;
    public final void rule__GraphqlEmunTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2046:1: ( ( 'enum' ) )
            // InternalGraphqlidl.g:2047:1: ( 'enum' )
            {
            // InternalGraphqlidl.g:2047:1: ( 'enum' )
            // InternalGraphqlidl.g:2048:2: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getEnumKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getEnumKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlEmunTypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__GraphqlEmunTypeDefinition__Group__1"
    // InternalGraphqlidl.g:2057:1: rule__GraphqlEmunTypeDefinition__Group__1 : rule__GraphqlEmunTypeDefinition__Group__1__Impl rule__GraphqlEmunTypeDefinition__Group__2 ;
    public final void rule__GraphqlEmunTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2061:1: ( rule__GraphqlEmunTypeDefinition__Group__1__Impl rule__GraphqlEmunTypeDefinition__Group__2 )
            // InternalGraphqlidl.g:2062:2: rule__GraphqlEmunTypeDefinition__Group__1__Impl rule__GraphqlEmunTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__GraphqlEmunTypeDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlEmunTypeDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlEmunTypeDefinition__Group__1"


    // $ANTLR start "rule__GraphqlEmunTypeDefinition__Group__1__Impl"
    // InternalGraphqlidl.g:2069:1: rule__GraphqlEmunTypeDefinition__Group__1__Impl : ( ( rule__GraphqlEmunTypeDefinition__NameAssignment_1 ) ) ;
    public final void rule__GraphqlEmunTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2073:1: ( ( ( rule__GraphqlEmunTypeDefinition__NameAssignment_1 ) ) )
            // InternalGraphqlidl.g:2074:1: ( ( rule__GraphqlEmunTypeDefinition__NameAssignment_1 ) )
            {
            // InternalGraphqlidl.g:2074:1: ( ( rule__GraphqlEmunTypeDefinition__NameAssignment_1 ) )
            // InternalGraphqlidl.g:2075:2: ( rule__GraphqlEmunTypeDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getNameAssignment_1()); 
            }
            // InternalGraphqlidl.g:2076:2: ( rule__GraphqlEmunTypeDefinition__NameAssignment_1 )
            // InternalGraphqlidl.g:2076:3: rule__GraphqlEmunTypeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlEmunTypeDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlEmunTypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__GraphqlEmunTypeDefinition__Group__2"
    // InternalGraphqlidl.g:2084:1: rule__GraphqlEmunTypeDefinition__Group__2 : rule__GraphqlEmunTypeDefinition__Group__2__Impl rule__GraphqlEmunTypeDefinition__Group__3 ;
    public final void rule__GraphqlEmunTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2088:1: ( rule__GraphqlEmunTypeDefinition__Group__2__Impl rule__GraphqlEmunTypeDefinition__Group__3 )
            // InternalGraphqlidl.g:2089:2: rule__GraphqlEmunTypeDefinition__Group__2__Impl rule__GraphqlEmunTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__GraphqlEmunTypeDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlEmunTypeDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlEmunTypeDefinition__Group__2"


    // $ANTLR start "rule__GraphqlEmunTypeDefinition__Group__2__Impl"
    // InternalGraphqlidl.g:2096:1: rule__GraphqlEmunTypeDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__GraphqlEmunTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2100:1: ( ( '{' ) )
            // InternalGraphqlidl.g:2101:1: ( '{' )
            {
            // InternalGraphqlidl.g:2101:1: ( '{' )
            // InternalGraphqlidl.g:2102:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlEmunTypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__GraphqlEmunTypeDefinition__Group__3"
    // InternalGraphqlidl.g:2111:1: rule__GraphqlEmunTypeDefinition__Group__3 : rule__GraphqlEmunTypeDefinition__Group__3__Impl rule__GraphqlEmunTypeDefinition__Group__4 ;
    public final void rule__GraphqlEmunTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2115:1: ( rule__GraphqlEmunTypeDefinition__Group__3__Impl rule__GraphqlEmunTypeDefinition__Group__4 )
            // InternalGraphqlidl.g:2116:2: rule__GraphqlEmunTypeDefinition__Group__3__Impl rule__GraphqlEmunTypeDefinition__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__GraphqlEmunTypeDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlEmunTypeDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlEmunTypeDefinition__Group__3"


    // $ANTLR start "rule__GraphqlEmunTypeDefinition__Group__3__Impl"
    // InternalGraphqlidl.g:2123:1: rule__GraphqlEmunTypeDefinition__Group__3__Impl : ( ( ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 ) ) ( ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 )* ) ) ;
    public final void rule__GraphqlEmunTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2127:1: ( ( ( ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 ) ) ( ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 )* ) ) )
            // InternalGraphqlidl.g:2128:1: ( ( ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 ) ) ( ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 )* ) )
            {
            // InternalGraphqlidl.g:2128:1: ( ( ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 ) ) ( ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 )* ) )
            // InternalGraphqlidl.g:2129:2: ( ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 ) ) ( ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 )* )
            {
            // InternalGraphqlidl.g:2129:2: ( ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 ) )
            // InternalGraphqlidl.g:2130:3: ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getValuesAssignment_3()); 
            }
            // InternalGraphqlidl.g:2131:3: ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 )
            // InternalGraphqlidl.g:2131:4: rule__GraphqlEmunTypeDefinition__ValuesAssignment_3
            {
            pushFollow(FOLLOW_12);
            rule__GraphqlEmunTypeDefinition__ValuesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getValuesAssignment_3()); 
            }

            }

            // InternalGraphqlidl.g:2134:2: ( ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 )* )
            // InternalGraphqlidl.g:2135:3: ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getValuesAssignment_3()); 
            }
            // InternalGraphqlidl.g:2136:3: ( rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ENUM_VALUE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGraphqlidl.g:2136:4: rule__GraphqlEmunTypeDefinition__ValuesAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__GraphqlEmunTypeDefinition__ValuesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getValuesAssignment_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlEmunTypeDefinition__Group__3__Impl"


    // $ANTLR start "rule__GraphqlEmunTypeDefinition__Group__4"
    // InternalGraphqlidl.g:2145:1: rule__GraphqlEmunTypeDefinition__Group__4 : rule__GraphqlEmunTypeDefinition__Group__4__Impl ;
    public final void rule__GraphqlEmunTypeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2149:1: ( rule__GraphqlEmunTypeDefinition__Group__4__Impl )
            // InternalGraphqlidl.g:2150:2: rule__GraphqlEmunTypeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlEmunTypeDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlEmunTypeDefinition__Group__4"


    // $ANTLR start "rule__GraphqlEmunTypeDefinition__Group__4__Impl"
    // InternalGraphqlidl.g:2156:1: rule__GraphqlEmunTypeDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__GraphqlEmunTypeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2160:1: ( ( '}' ) )
            // InternalGraphqlidl.g:2161:1: ( '}' )
            {
            // InternalGraphqlidl.g:2161:1: ( '}' )
            // InternalGraphqlidl.g:2162:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlEmunTypeDefinition__Group__4__Impl"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__Group__0"
    // InternalGraphqlidl.g:2172:1: rule__GraphqlUnionTypeDefinition__Group__0 : rule__GraphqlUnionTypeDefinition__Group__0__Impl rule__GraphqlUnionTypeDefinition__Group__1 ;
    public final void rule__GraphqlUnionTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2176:1: ( rule__GraphqlUnionTypeDefinition__Group__0__Impl rule__GraphqlUnionTypeDefinition__Group__1 )
            // InternalGraphqlidl.g:2177:2: rule__GraphqlUnionTypeDefinition__Group__0__Impl rule__GraphqlUnionTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlUnionTypeDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlUnionTypeDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__Group__0"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__Group__0__Impl"
    // InternalGraphqlidl.g:2184:1: rule__GraphqlUnionTypeDefinition__Group__0__Impl : ( 'union' ) ;
    public final void rule__GraphqlUnionTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2188:1: ( ( 'union' ) )
            // InternalGraphqlidl.g:2189:1: ( 'union' )
            {
            // InternalGraphqlidl.g:2189:1: ( 'union' )
            // InternalGraphqlidl.g:2190:2: 'union'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getUnionKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getUnionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__Group__1"
    // InternalGraphqlidl.g:2199:1: rule__GraphqlUnionTypeDefinition__Group__1 : rule__GraphqlUnionTypeDefinition__Group__1__Impl rule__GraphqlUnionTypeDefinition__Group__2 ;
    public final void rule__GraphqlUnionTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2203:1: ( rule__GraphqlUnionTypeDefinition__Group__1__Impl rule__GraphqlUnionTypeDefinition__Group__2 )
            // InternalGraphqlidl.g:2204:2: rule__GraphqlUnionTypeDefinition__Group__1__Impl rule__GraphqlUnionTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__GraphqlUnionTypeDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlUnionTypeDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__Group__1"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__Group__1__Impl"
    // InternalGraphqlidl.g:2211:1: rule__GraphqlUnionTypeDefinition__Group__1__Impl : ( ( rule__GraphqlUnionTypeDefinition__NameAssignment_1 ) ) ;
    public final void rule__GraphqlUnionTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2215:1: ( ( ( rule__GraphqlUnionTypeDefinition__NameAssignment_1 ) ) )
            // InternalGraphqlidl.g:2216:1: ( ( rule__GraphqlUnionTypeDefinition__NameAssignment_1 ) )
            {
            // InternalGraphqlidl.g:2216:1: ( ( rule__GraphqlUnionTypeDefinition__NameAssignment_1 ) )
            // InternalGraphqlidl.g:2217:2: ( rule__GraphqlUnionTypeDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getNameAssignment_1()); 
            }
            // InternalGraphqlidl.g:2218:2: ( rule__GraphqlUnionTypeDefinition__NameAssignment_1 )
            // InternalGraphqlidl.g:2218:3: rule__GraphqlUnionTypeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlUnionTypeDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__Group__2"
    // InternalGraphqlidl.g:2226:1: rule__GraphqlUnionTypeDefinition__Group__2 : rule__GraphqlUnionTypeDefinition__Group__2__Impl rule__GraphqlUnionTypeDefinition__Group__3 ;
    public final void rule__GraphqlUnionTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2230:1: ( rule__GraphqlUnionTypeDefinition__Group__2__Impl rule__GraphqlUnionTypeDefinition__Group__3 )
            // InternalGraphqlidl.g:2231:2: rule__GraphqlUnionTypeDefinition__Group__2__Impl rule__GraphqlUnionTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlUnionTypeDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlUnionTypeDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__Group__2"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__Group__2__Impl"
    // InternalGraphqlidl.g:2238:1: rule__GraphqlUnionTypeDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__GraphqlUnionTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2242:1: ( ( '=' ) )
            // InternalGraphqlidl.g:2243:1: ( '=' )
            {
            // InternalGraphqlidl.g:2243:1: ( '=' )
            // InternalGraphqlidl.g:2244:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__Group__3"
    // InternalGraphqlidl.g:2253:1: rule__GraphqlUnionTypeDefinition__Group__3 : rule__GraphqlUnionTypeDefinition__Group__3__Impl rule__GraphqlUnionTypeDefinition__Group__4 ;
    public final void rule__GraphqlUnionTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2257:1: ( rule__GraphqlUnionTypeDefinition__Group__3__Impl rule__GraphqlUnionTypeDefinition__Group__4 )
            // InternalGraphqlidl.g:2258:2: rule__GraphqlUnionTypeDefinition__Group__3__Impl rule__GraphqlUnionTypeDefinition__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__GraphqlUnionTypeDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlUnionTypeDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__Group__3"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__Group__3__Impl"
    // InternalGraphqlidl.g:2265:1: rule__GraphqlUnionTypeDefinition__Group__3__Impl : ( ( rule__GraphqlUnionTypeDefinition__MembersAssignment_3 ) ) ;
    public final void rule__GraphqlUnionTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2269:1: ( ( ( rule__GraphqlUnionTypeDefinition__MembersAssignment_3 ) ) )
            // InternalGraphqlidl.g:2270:1: ( ( rule__GraphqlUnionTypeDefinition__MembersAssignment_3 ) )
            {
            // InternalGraphqlidl.g:2270:1: ( ( rule__GraphqlUnionTypeDefinition__MembersAssignment_3 ) )
            // InternalGraphqlidl.g:2271:2: ( rule__GraphqlUnionTypeDefinition__MembersAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getMembersAssignment_3()); 
            }
            // InternalGraphqlidl.g:2272:2: ( rule__GraphqlUnionTypeDefinition__MembersAssignment_3 )
            // InternalGraphqlidl.g:2272:3: rule__GraphqlUnionTypeDefinition__MembersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlUnionTypeDefinition__MembersAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getMembersAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__Group__3__Impl"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__Group__4"
    // InternalGraphqlidl.g:2280:1: rule__GraphqlUnionTypeDefinition__Group__4 : rule__GraphqlUnionTypeDefinition__Group__4__Impl ;
    public final void rule__GraphqlUnionTypeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2284:1: ( rule__GraphqlUnionTypeDefinition__Group__4__Impl )
            // InternalGraphqlidl.g:2285:2: rule__GraphqlUnionTypeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlUnionTypeDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__Group__4"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__Group__4__Impl"
    // InternalGraphqlidl.g:2291:1: rule__GraphqlUnionTypeDefinition__Group__4__Impl : ( ( rule__GraphqlUnionTypeDefinition__Group_4__0 )* ) ;
    public final void rule__GraphqlUnionTypeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2295:1: ( ( ( rule__GraphqlUnionTypeDefinition__Group_4__0 )* ) )
            // InternalGraphqlidl.g:2296:1: ( ( rule__GraphqlUnionTypeDefinition__Group_4__0 )* )
            {
            // InternalGraphqlidl.g:2296:1: ( ( rule__GraphqlUnionTypeDefinition__Group_4__0 )* )
            // InternalGraphqlidl.g:2297:2: ( rule__GraphqlUnionTypeDefinition__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getGroup_4()); 
            }
            // InternalGraphqlidl.g:2298:2: ( rule__GraphqlUnionTypeDefinition__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGraphqlidl.g:2298:3: rule__GraphqlUnionTypeDefinition__Group_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__GraphqlUnionTypeDefinition__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__Group__4__Impl"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__Group_4__0"
    // InternalGraphqlidl.g:2307:1: rule__GraphqlUnionTypeDefinition__Group_4__0 : rule__GraphqlUnionTypeDefinition__Group_4__0__Impl rule__GraphqlUnionTypeDefinition__Group_4__1 ;
    public final void rule__GraphqlUnionTypeDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2311:1: ( rule__GraphqlUnionTypeDefinition__Group_4__0__Impl rule__GraphqlUnionTypeDefinition__Group_4__1 )
            // InternalGraphqlidl.g:2312:2: rule__GraphqlUnionTypeDefinition__Group_4__0__Impl rule__GraphqlUnionTypeDefinition__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlUnionTypeDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlUnionTypeDefinition__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__Group_4__0"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__Group_4__0__Impl"
    // InternalGraphqlidl.g:2319:1: rule__GraphqlUnionTypeDefinition__Group_4__0__Impl : ( '|' ) ;
    public final void rule__GraphqlUnionTypeDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2323:1: ( ( '|' ) )
            // InternalGraphqlidl.g:2324:1: ( '|' )
            {
            // InternalGraphqlidl.g:2324:1: ( '|' )
            // InternalGraphqlidl.g:2325:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getVerticalLineKeyword_4_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getVerticalLineKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__Group_4__1"
    // InternalGraphqlidl.g:2334:1: rule__GraphqlUnionTypeDefinition__Group_4__1 : rule__GraphqlUnionTypeDefinition__Group_4__1__Impl ;
    public final void rule__GraphqlUnionTypeDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2338:1: ( rule__GraphqlUnionTypeDefinition__Group_4__1__Impl )
            // InternalGraphqlidl.g:2339:2: rule__GraphqlUnionTypeDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlUnionTypeDefinition__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__Group_4__1"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__Group_4__1__Impl"
    // InternalGraphqlidl.g:2345:1: rule__GraphqlUnionTypeDefinition__Group_4__1__Impl : ( ( rule__GraphqlUnionTypeDefinition__MembersAssignment_4_1 ) ) ;
    public final void rule__GraphqlUnionTypeDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2349:1: ( ( ( rule__GraphqlUnionTypeDefinition__MembersAssignment_4_1 ) ) )
            // InternalGraphqlidl.g:2350:1: ( ( rule__GraphqlUnionTypeDefinition__MembersAssignment_4_1 ) )
            {
            // InternalGraphqlidl.g:2350:1: ( ( rule__GraphqlUnionTypeDefinition__MembersAssignment_4_1 ) )
            // InternalGraphqlidl.g:2351:2: ( rule__GraphqlUnionTypeDefinition__MembersAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getMembersAssignment_4_1()); 
            }
            // InternalGraphqlidl.g:2352:2: ( rule__GraphqlUnionTypeDefinition__MembersAssignment_4_1 )
            // InternalGraphqlidl.g:2352:3: rule__GraphqlUnionTypeDefinition__MembersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlUnionTypeDefinition__MembersAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getMembersAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__GraphqlInputTypeDefinition__Group__0"
    // InternalGraphqlidl.g:2361:1: rule__GraphqlInputTypeDefinition__Group__0 : rule__GraphqlInputTypeDefinition__Group__0__Impl rule__GraphqlInputTypeDefinition__Group__1 ;
    public final void rule__GraphqlInputTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2365:1: ( rule__GraphqlInputTypeDefinition__Group__0__Impl rule__GraphqlInputTypeDefinition__Group__1 )
            // InternalGraphqlidl.g:2366:2: rule__GraphqlInputTypeDefinition__Group__0__Impl rule__GraphqlInputTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlInputTypeDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlInputTypeDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputTypeDefinition__Group__0"


    // $ANTLR start "rule__GraphqlInputTypeDefinition__Group__0__Impl"
    // InternalGraphqlidl.g:2373:1: rule__GraphqlInputTypeDefinition__Group__0__Impl : ( 'input' ) ;
    public final void rule__GraphqlInputTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2377:1: ( ( 'input' ) )
            // InternalGraphqlidl.g:2378:1: ( 'input' )
            {
            // InternalGraphqlidl.g:2378:1: ( 'input' )
            // InternalGraphqlidl.g:2379:2: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeDefinitionAccess().getInputKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeDefinitionAccess().getInputKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputTypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__GraphqlInputTypeDefinition__Group__1"
    // InternalGraphqlidl.g:2388:1: rule__GraphqlInputTypeDefinition__Group__1 : rule__GraphqlInputTypeDefinition__Group__1__Impl rule__GraphqlInputTypeDefinition__Group__2 ;
    public final void rule__GraphqlInputTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2392:1: ( rule__GraphqlInputTypeDefinition__Group__1__Impl rule__GraphqlInputTypeDefinition__Group__2 )
            // InternalGraphqlidl.g:2393:2: rule__GraphqlInputTypeDefinition__Group__1__Impl rule__GraphqlInputTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__GraphqlInputTypeDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlInputTypeDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputTypeDefinition__Group__1"


    // $ANTLR start "rule__GraphqlInputTypeDefinition__Group__1__Impl"
    // InternalGraphqlidl.g:2400:1: rule__GraphqlInputTypeDefinition__Group__1__Impl : ( ( rule__GraphqlInputTypeDefinition__NameAssignment_1 ) ) ;
    public final void rule__GraphqlInputTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2404:1: ( ( ( rule__GraphqlInputTypeDefinition__NameAssignment_1 ) ) )
            // InternalGraphqlidl.g:2405:1: ( ( rule__GraphqlInputTypeDefinition__NameAssignment_1 ) )
            {
            // InternalGraphqlidl.g:2405:1: ( ( rule__GraphqlInputTypeDefinition__NameAssignment_1 ) )
            // InternalGraphqlidl.g:2406:2: ( rule__GraphqlInputTypeDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeDefinitionAccess().getNameAssignment_1()); 
            }
            // InternalGraphqlidl.g:2407:2: ( rule__GraphqlInputTypeDefinition__NameAssignment_1 )
            // InternalGraphqlidl.g:2407:3: rule__GraphqlInputTypeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInputTypeDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeDefinitionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputTypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__GraphqlInputTypeDefinition__Group__2"
    // InternalGraphqlidl.g:2415:1: rule__GraphqlInputTypeDefinition__Group__2 : rule__GraphqlInputTypeDefinition__Group__2__Impl rule__GraphqlInputTypeDefinition__Group__3 ;
    public final void rule__GraphqlInputTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2419:1: ( rule__GraphqlInputTypeDefinition__Group__2__Impl rule__GraphqlInputTypeDefinition__Group__3 )
            // InternalGraphqlidl.g:2420:2: rule__GraphqlInputTypeDefinition__Group__2__Impl rule__GraphqlInputTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlInputTypeDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlInputTypeDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputTypeDefinition__Group__2"


    // $ANTLR start "rule__GraphqlInputTypeDefinition__Group__2__Impl"
    // InternalGraphqlidl.g:2427:1: rule__GraphqlInputTypeDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__GraphqlInputTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2431:1: ( ( '{' ) )
            // InternalGraphqlidl.g:2432:1: ( '{' )
            {
            // InternalGraphqlidl.g:2432:1: ( '{' )
            // InternalGraphqlidl.g:2433:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputTypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__GraphqlInputTypeDefinition__Group__3"
    // InternalGraphqlidl.g:2442:1: rule__GraphqlInputTypeDefinition__Group__3 : rule__GraphqlInputTypeDefinition__Group__3__Impl rule__GraphqlInputTypeDefinition__Group__4 ;
    public final void rule__GraphqlInputTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2446:1: ( rule__GraphqlInputTypeDefinition__Group__3__Impl rule__GraphqlInputTypeDefinition__Group__4 )
            // InternalGraphqlidl.g:2447:2: rule__GraphqlInputTypeDefinition__Group__3__Impl rule__GraphqlInputTypeDefinition__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__GraphqlInputTypeDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlInputTypeDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputTypeDefinition__Group__3"


    // $ANTLR start "rule__GraphqlInputTypeDefinition__Group__3__Impl"
    // InternalGraphqlidl.g:2454:1: rule__GraphqlInputTypeDefinition__Group__3__Impl : ( ( ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 ) ) ( ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 )* ) ) ;
    public final void rule__GraphqlInputTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2458:1: ( ( ( ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 ) ) ( ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 )* ) ) )
            // InternalGraphqlidl.g:2459:1: ( ( ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 ) ) ( ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 )* ) )
            {
            // InternalGraphqlidl.g:2459:1: ( ( ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 ) ) ( ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 )* ) )
            // InternalGraphqlidl.g:2460:2: ( ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 ) ) ( ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 )* )
            {
            // InternalGraphqlidl.g:2460:2: ( ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 ) )
            // InternalGraphqlidl.g:2461:3: ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeDefinitionAccess().getFieldsAssignment_3()); 
            }
            // InternalGraphqlidl.g:2462:3: ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 )
            // InternalGraphqlidl.g:2462:4: rule__GraphqlInputTypeDefinition__FieldsAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__GraphqlInputTypeDefinition__FieldsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeDefinitionAccess().getFieldsAssignment_3()); 
            }

            }

            // InternalGraphqlidl.g:2465:2: ( ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 )* )
            // InternalGraphqlidl.g:2466:3: ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeDefinitionAccess().getFieldsAssignment_3()); 
            }
            // InternalGraphqlidl.g:2467:3: ( rule__GraphqlInputTypeDefinition__FieldsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_NAME) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGraphqlidl.g:2467:4: rule__GraphqlInputTypeDefinition__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__GraphqlInputTypeDefinition__FieldsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeDefinitionAccess().getFieldsAssignment_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputTypeDefinition__Group__3__Impl"


    // $ANTLR start "rule__GraphqlInputTypeDefinition__Group__4"
    // InternalGraphqlidl.g:2476:1: rule__GraphqlInputTypeDefinition__Group__4 : rule__GraphqlInputTypeDefinition__Group__4__Impl ;
    public final void rule__GraphqlInputTypeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2480:1: ( rule__GraphqlInputTypeDefinition__Group__4__Impl )
            // InternalGraphqlidl.g:2481:2: rule__GraphqlInputTypeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInputTypeDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputTypeDefinition__Group__4"


    // $ANTLR start "rule__GraphqlInputTypeDefinition__Group__4__Impl"
    // InternalGraphqlidl.g:2487:1: rule__GraphqlInputTypeDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__GraphqlInputTypeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2491:1: ( ( '}' ) )
            // InternalGraphqlidl.g:2492:1: ( '}' )
            {
            // InternalGraphqlidl.g:2492:1: ( '}' )
            // InternalGraphqlidl.g:2493:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputTypeDefinition__Group__4__Impl"


    // $ANTLR start "rule__GraphqlInputField__Group__0"
    // InternalGraphqlidl.g:2503:1: rule__GraphqlInputField__Group__0 : rule__GraphqlInputField__Group__0__Impl rule__GraphqlInputField__Group__1 ;
    public final void rule__GraphqlInputField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2507:1: ( rule__GraphqlInputField__Group__0__Impl rule__GraphqlInputField__Group__1 )
            // InternalGraphqlidl.g:2508:2: rule__GraphqlInputField__Group__0__Impl rule__GraphqlInputField__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__GraphqlInputField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlInputField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputField__Group__0"


    // $ANTLR start "rule__GraphqlInputField__Group__0__Impl"
    // InternalGraphqlidl.g:2515:1: rule__GraphqlInputField__Group__0__Impl : ( ( rule__GraphqlInputField__NameAssignment_0 ) ) ;
    public final void rule__GraphqlInputField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2519:1: ( ( ( rule__GraphqlInputField__NameAssignment_0 ) ) )
            // InternalGraphqlidl.g:2520:1: ( ( rule__GraphqlInputField__NameAssignment_0 ) )
            {
            // InternalGraphqlidl.g:2520:1: ( ( rule__GraphqlInputField__NameAssignment_0 ) )
            // InternalGraphqlidl.g:2521:2: ( rule__GraphqlInputField__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputFieldAccess().getNameAssignment_0()); 
            }
            // InternalGraphqlidl.g:2522:2: ( rule__GraphqlInputField__NameAssignment_0 )
            // InternalGraphqlidl.g:2522:3: rule__GraphqlInputField__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInputField__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputFieldAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputField__Group__0__Impl"


    // $ANTLR start "rule__GraphqlInputField__Group__1"
    // InternalGraphqlidl.g:2530:1: rule__GraphqlInputField__Group__1 : rule__GraphqlInputField__Group__1__Impl rule__GraphqlInputField__Group__2 ;
    public final void rule__GraphqlInputField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2534:1: ( rule__GraphqlInputField__Group__1__Impl rule__GraphqlInputField__Group__2 )
            // InternalGraphqlidl.g:2535:2: rule__GraphqlInputField__Group__1__Impl rule__GraphqlInputField__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__GraphqlInputField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlInputField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputField__Group__1"


    // $ANTLR start "rule__GraphqlInputField__Group__1__Impl"
    // InternalGraphqlidl.g:2542:1: rule__GraphqlInputField__Group__1__Impl : ( ':' ) ;
    public final void rule__GraphqlInputField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2546:1: ( ( ':' ) )
            // InternalGraphqlidl.g:2547:1: ( ':' )
            {
            // InternalGraphqlidl.g:2547:1: ( ':' )
            // InternalGraphqlidl.g:2548:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputFieldAccess().getColonKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputFieldAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputField__Group__1__Impl"


    // $ANTLR start "rule__GraphqlInputField__Group__2"
    // InternalGraphqlidl.g:2557:1: rule__GraphqlInputField__Group__2 : rule__GraphqlInputField__Group__2__Impl ;
    public final void rule__GraphqlInputField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2561:1: ( rule__GraphqlInputField__Group__2__Impl )
            // InternalGraphqlidl.g:2562:2: rule__GraphqlInputField__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInputField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputField__Group__2"


    // $ANTLR start "rule__GraphqlInputField__Group__2__Impl"
    // InternalGraphqlidl.g:2568:1: rule__GraphqlInputField__Group__2__Impl : ( ( rule__GraphqlInputField__TypeAssignment_2 ) ) ;
    public final void rule__GraphqlInputField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2572:1: ( ( ( rule__GraphqlInputField__TypeAssignment_2 ) ) )
            // InternalGraphqlidl.g:2573:1: ( ( rule__GraphqlInputField__TypeAssignment_2 ) )
            {
            // InternalGraphqlidl.g:2573:1: ( ( rule__GraphqlInputField__TypeAssignment_2 ) )
            // InternalGraphqlidl.g:2574:2: ( rule__GraphqlInputField__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputFieldAccess().getTypeAssignment_2()); 
            }
            // InternalGraphqlidl.g:2575:2: ( rule__GraphqlInputField__TypeAssignment_2 )
            // InternalGraphqlidl.g:2575:3: rule__GraphqlInputField__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInputField__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputFieldAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputField__Group__2__Impl"


    // $ANTLR start "rule__GraphqlField__Group__0"
    // InternalGraphqlidl.g:2584:1: rule__GraphqlField__Group__0 : rule__GraphqlField__Group__0__Impl rule__GraphqlField__Group__1 ;
    public final void rule__GraphqlField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2588:1: ( rule__GraphqlField__Group__0__Impl rule__GraphqlField__Group__1 )
            // InternalGraphqlidl.g:2589:2: rule__GraphqlField__Group__0__Impl rule__GraphqlField__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__GraphqlField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__Group__0"


    // $ANTLR start "rule__GraphqlField__Group__0__Impl"
    // InternalGraphqlidl.g:2596:1: rule__GraphqlField__Group__0__Impl : ( ( rule__GraphqlField__NameAssignment_0 ) ) ;
    public final void rule__GraphqlField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2600:1: ( ( ( rule__GraphqlField__NameAssignment_0 ) ) )
            // InternalGraphqlidl.g:2601:1: ( ( rule__GraphqlField__NameAssignment_0 ) )
            {
            // InternalGraphqlidl.g:2601:1: ( ( rule__GraphqlField__NameAssignment_0 ) )
            // InternalGraphqlidl.g:2602:2: ( rule__GraphqlField__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlFieldAccess().getNameAssignment_0()); 
            }
            // InternalGraphqlidl.g:2603:2: ( rule__GraphqlField__NameAssignment_0 )
            // InternalGraphqlidl.g:2603:3: rule__GraphqlField__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlField__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlFieldAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__Group__0__Impl"


    // $ANTLR start "rule__GraphqlField__Group__1"
    // InternalGraphqlidl.g:2611:1: rule__GraphqlField__Group__1 : rule__GraphqlField__Group__1__Impl rule__GraphqlField__Group__2 ;
    public final void rule__GraphqlField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2615:1: ( rule__GraphqlField__Group__1__Impl rule__GraphqlField__Group__2 )
            // InternalGraphqlidl.g:2616:2: rule__GraphqlField__Group__1__Impl rule__GraphqlField__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__GraphqlField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__Group__1"


    // $ANTLR start "rule__GraphqlField__Group__1__Impl"
    // InternalGraphqlidl.g:2623:1: rule__GraphqlField__Group__1__Impl : ( ( rule__GraphqlField__Group_1__0 )* ) ;
    public final void rule__GraphqlField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2627:1: ( ( ( rule__GraphqlField__Group_1__0 )* ) )
            // InternalGraphqlidl.g:2628:1: ( ( rule__GraphqlField__Group_1__0 )* )
            {
            // InternalGraphqlidl.g:2628:1: ( ( rule__GraphqlField__Group_1__0 )* )
            // InternalGraphqlidl.g:2629:2: ( rule__GraphqlField__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlFieldAccess().getGroup_1()); 
            }
            // InternalGraphqlidl.g:2630:2: ( rule__GraphqlField__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGraphqlidl.g:2630:3: rule__GraphqlField__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__GraphqlField__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlFieldAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__Group__1__Impl"


    // $ANTLR start "rule__GraphqlField__Group__2"
    // InternalGraphqlidl.g:2638:1: rule__GraphqlField__Group__2 : rule__GraphqlField__Group__2__Impl rule__GraphqlField__Group__3 ;
    public final void rule__GraphqlField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2642:1: ( rule__GraphqlField__Group__2__Impl rule__GraphqlField__Group__3 )
            // InternalGraphqlidl.g:2643:2: rule__GraphqlField__Group__2__Impl rule__GraphqlField__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__GraphqlField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__Group__2"


    // $ANTLR start "rule__GraphqlField__Group__2__Impl"
    // InternalGraphqlidl.g:2650:1: rule__GraphqlField__Group__2__Impl : ( ':' ) ;
    public final void rule__GraphqlField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2654:1: ( ( ':' ) )
            // InternalGraphqlidl.g:2655:1: ( ':' )
            {
            // InternalGraphqlidl.g:2655:1: ( ':' )
            // InternalGraphqlidl.g:2656:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlFieldAccess().getColonKeyword_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlFieldAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__Group__2__Impl"


    // $ANTLR start "rule__GraphqlField__Group__3"
    // InternalGraphqlidl.g:2665:1: rule__GraphqlField__Group__3 : rule__GraphqlField__Group__3__Impl ;
    public final void rule__GraphqlField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2669:1: ( rule__GraphqlField__Group__3__Impl )
            // InternalGraphqlidl.g:2670:2: rule__GraphqlField__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__Group__3"


    // $ANTLR start "rule__GraphqlField__Group__3__Impl"
    // InternalGraphqlidl.g:2676:1: rule__GraphqlField__Group__3__Impl : ( ( rule__GraphqlField__TypeAssignment_3 ) ) ;
    public final void rule__GraphqlField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2680:1: ( ( ( rule__GraphqlField__TypeAssignment_3 ) ) )
            // InternalGraphqlidl.g:2681:1: ( ( rule__GraphqlField__TypeAssignment_3 ) )
            {
            // InternalGraphqlidl.g:2681:1: ( ( rule__GraphqlField__TypeAssignment_3 ) )
            // InternalGraphqlidl.g:2682:2: ( rule__GraphqlField__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlFieldAccess().getTypeAssignment_3()); 
            }
            // InternalGraphqlidl.g:2683:2: ( rule__GraphqlField__TypeAssignment_3 )
            // InternalGraphqlidl.g:2683:3: rule__GraphqlField__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlField__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlFieldAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__Group__3__Impl"


    // $ANTLR start "rule__GraphqlField__Group_1__0"
    // InternalGraphqlidl.g:2692:1: rule__GraphqlField__Group_1__0 : rule__GraphqlField__Group_1__0__Impl rule__GraphqlField__Group_1__1 ;
    public final void rule__GraphqlField__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2696:1: ( rule__GraphqlField__Group_1__0__Impl rule__GraphqlField__Group_1__1 )
            // InternalGraphqlidl.g:2697:2: rule__GraphqlField__Group_1__0__Impl rule__GraphqlField__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__GraphqlField__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlField__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__Group_1__0"


    // $ANTLR start "rule__GraphqlField__Group_1__0__Impl"
    // InternalGraphqlidl.g:2704:1: rule__GraphqlField__Group_1__0__Impl : ( '(' ) ;
    public final void rule__GraphqlField__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2708:1: ( ( '(' ) )
            // InternalGraphqlidl.g:2709:1: ( '(' )
            {
            // InternalGraphqlidl.g:2709:1: ( '(' )
            // InternalGraphqlidl.g:2710:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlFieldAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlFieldAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__Group_1__0__Impl"


    // $ANTLR start "rule__GraphqlField__Group_1__1"
    // InternalGraphqlidl.g:2719:1: rule__GraphqlField__Group_1__1 : rule__GraphqlField__Group_1__1__Impl rule__GraphqlField__Group_1__2 ;
    public final void rule__GraphqlField__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2723:1: ( rule__GraphqlField__Group_1__1__Impl rule__GraphqlField__Group_1__2 )
            // InternalGraphqlidl.g:2724:2: rule__GraphqlField__Group_1__1__Impl rule__GraphqlField__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__GraphqlField__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlField__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__Group_1__1"


    // $ANTLR start "rule__GraphqlField__Group_1__1__Impl"
    // InternalGraphqlidl.g:2731:1: rule__GraphqlField__Group_1__1__Impl : ( ( rule__GraphqlField__ArgsAssignment_1_1 ) ) ;
    public final void rule__GraphqlField__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2735:1: ( ( ( rule__GraphqlField__ArgsAssignment_1_1 ) ) )
            // InternalGraphqlidl.g:2736:1: ( ( rule__GraphqlField__ArgsAssignment_1_1 ) )
            {
            // InternalGraphqlidl.g:2736:1: ( ( rule__GraphqlField__ArgsAssignment_1_1 ) )
            // InternalGraphqlidl.g:2737:2: ( rule__GraphqlField__ArgsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlFieldAccess().getArgsAssignment_1_1()); 
            }
            // InternalGraphqlidl.g:2738:2: ( rule__GraphqlField__ArgsAssignment_1_1 )
            // InternalGraphqlidl.g:2738:3: rule__GraphqlField__ArgsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlField__ArgsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlFieldAccess().getArgsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__Group_1__1__Impl"


    // $ANTLR start "rule__GraphqlField__Group_1__2"
    // InternalGraphqlidl.g:2746:1: rule__GraphqlField__Group_1__2 : rule__GraphqlField__Group_1__2__Impl ;
    public final void rule__GraphqlField__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2750:1: ( rule__GraphqlField__Group_1__2__Impl )
            // InternalGraphqlidl.g:2751:2: rule__GraphqlField__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlField__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__Group_1__2"


    // $ANTLR start "rule__GraphqlField__Group_1__2__Impl"
    // InternalGraphqlidl.g:2757:1: rule__GraphqlField__Group_1__2__Impl : ( ')' ) ;
    public final void rule__GraphqlField__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2761:1: ( ( ')' ) )
            // InternalGraphqlidl.g:2762:1: ( ')' )
            {
            // InternalGraphqlidl.g:2762:1: ( ')' )
            // InternalGraphqlidl.g:2763:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlFieldAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlFieldAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__Group_1__2__Impl"


    // $ANTLR start "rule__GraphqlType__Group_0__0"
    // InternalGraphqlidl.g:2773:1: rule__GraphqlType__Group_0__0 : rule__GraphqlType__Group_0__0__Impl rule__GraphqlType__Group_0__1 ;
    public final void rule__GraphqlType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2777:1: ( rule__GraphqlType__Group_0__0__Impl rule__GraphqlType__Group_0__1 )
            // InternalGraphqlidl.g:2778:2: rule__GraphqlType__Group_0__0__Impl rule__GraphqlType__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__GraphqlType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlType__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__Group_0__0"


    // $ANTLR start "rule__GraphqlType__Group_0__0__Impl"
    // InternalGraphqlidl.g:2785:1: rule__GraphqlType__Group_0__0__Impl : ( ( rule__GraphqlType__DtypeAssignment_0_0 ) ) ;
    public final void rule__GraphqlType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2789:1: ( ( ( rule__GraphqlType__DtypeAssignment_0_0 ) ) )
            // InternalGraphqlidl.g:2790:1: ( ( rule__GraphqlType__DtypeAssignment_0_0 ) )
            {
            // InternalGraphqlidl.g:2790:1: ( ( rule__GraphqlType__DtypeAssignment_0_0 ) )
            // InternalGraphqlidl.g:2791:2: ( rule__GraphqlType__DtypeAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getDtypeAssignment_0_0()); 
            }
            // InternalGraphqlidl.g:2792:2: ( rule__GraphqlType__DtypeAssignment_0_0 )
            // InternalGraphqlidl.g:2792:3: rule__GraphqlType__DtypeAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlType__DtypeAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getDtypeAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__Group_0__0__Impl"


    // $ANTLR start "rule__GraphqlType__Group_0__1"
    // InternalGraphqlidl.g:2800:1: rule__GraphqlType__Group_0__1 : rule__GraphqlType__Group_0__1__Impl ;
    public final void rule__GraphqlType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2804:1: ( rule__GraphqlType__Group_0__1__Impl )
            // InternalGraphqlidl.g:2805:2: rule__GraphqlType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlType__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__Group_0__1"


    // $ANTLR start "rule__GraphqlType__Group_0__1__Impl"
    // InternalGraphqlidl.g:2811:1: rule__GraphqlType__Group_0__1__Impl : ( ( rule__GraphqlType__NonNullAssignment_0_1 )? ) ;
    public final void rule__GraphqlType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2815:1: ( ( ( rule__GraphqlType__NonNullAssignment_0_1 )? ) )
            // InternalGraphqlidl.g:2816:1: ( ( rule__GraphqlType__NonNullAssignment_0_1 )? )
            {
            // InternalGraphqlidl.g:2816:1: ( ( rule__GraphqlType__NonNullAssignment_0_1 )? )
            // InternalGraphqlidl.g:2817:2: ( rule__GraphqlType__NonNullAssignment_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getNonNullAssignment_0_1()); 
            }
            // InternalGraphqlidl.g:2818:2: ( rule__GraphqlType__NonNullAssignment_0_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGraphqlidl.g:2818:3: rule__GraphqlType__NonNullAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlType__NonNullAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getNonNullAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__Group_0__1__Impl"


    // $ANTLR start "rule__GraphqlType__Group_1__0"
    // InternalGraphqlidl.g:2827:1: rule__GraphqlType__Group_1__0 : rule__GraphqlType__Group_1__0__Impl rule__GraphqlType__Group_1__1 ;
    public final void rule__GraphqlType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2831:1: ( rule__GraphqlType__Group_1__0__Impl rule__GraphqlType__Group_1__1 )
            // InternalGraphqlidl.g:2832:2: rule__GraphqlType__Group_1__0__Impl rule__GraphqlType__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__GraphqlType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlType__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__Group_1__0"


    // $ANTLR start "rule__GraphqlType__Group_1__0__Impl"
    // InternalGraphqlidl.g:2839:1: rule__GraphqlType__Group_1__0__Impl : ( ( rule__GraphqlType__NtypeAssignment_1_0 ) ) ;
    public final void rule__GraphqlType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2843:1: ( ( ( rule__GraphqlType__NtypeAssignment_1_0 ) ) )
            // InternalGraphqlidl.g:2844:1: ( ( rule__GraphqlType__NtypeAssignment_1_0 ) )
            {
            // InternalGraphqlidl.g:2844:1: ( ( rule__GraphqlType__NtypeAssignment_1_0 ) )
            // InternalGraphqlidl.g:2845:2: ( rule__GraphqlType__NtypeAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getNtypeAssignment_1_0()); 
            }
            // InternalGraphqlidl.g:2846:2: ( rule__GraphqlType__NtypeAssignment_1_0 )
            // InternalGraphqlidl.g:2846:3: rule__GraphqlType__NtypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlType__NtypeAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getNtypeAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__Group_1__0__Impl"


    // $ANTLR start "rule__GraphqlType__Group_1__1"
    // InternalGraphqlidl.g:2854:1: rule__GraphqlType__Group_1__1 : rule__GraphqlType__Group_1__1__Impl ;
    public final void rule__GraphqlType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2858:1: ( rule__GraphqlType__Group_1__1__Impl )
            // InternalGraphqlidl.g:2859:2: rule__GraphqlType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__Group_1__1"


    // $ANTLR start "rule__GraphqlType__Group_1__1__Impl"
    // InternalGraphqlidl.g:2865:1: rule__GraphqlType__Group_1__1__Impl : ( ( rule__GraphqlType__NonNullAssignment_1_1 )? ) ;
    public final void rule__GraphqlType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2869:1: ( ( ( rule__GraphqlType__NonNullAssignment_1_1 )? ) )
            // InternalGraphqlidl.g:2870:1: ( ( rule__GraphqlType__NonNullAssignment_1_1 )? )
            {
            // InternalGraphqlidl.g:2870:1: ( ( rule__GraphqlType__NonNullAssignment_1_1 )? )
            // InternalGraphqlidl.g:2871:2: ( rule__GraphqlType__NonNullAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getNonNullAssignment_1_1()); 
            }
            // InternalGraphqlidl.g:2872:2: ( rule__GraphqlType__NonNullAssignment_1_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGraphqlidl.g:2872:3: rule__GraphqlType__NonNullAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlType__NonNullAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getNonNullAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__Group_1__1__Impl"


    // $ANTLR start "rule__GraphqlType__Group_2__0"
    // InternalGraphqlidl.g:2881:1: rule__GraphqlType__Group_2__0 : rule__GraphqlType__Group_2__0__Impl rule__GraphqlType__Group_2__1 ;
    public final void rule__GraphqlType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2885:1: ( rule__GraphqlType__Group_2__0__Impl rule__GraphqlType__Group_2__1 )
            // InternalGraphqlidl.g:2886:2: rule__GraphqlType__Group_2__0__Impl rule__GraphqlType__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__GraphqlType__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlType__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__Group_2__0"


    // $ANTLR start "rule__GraphqlType__Group_2__0__Impl"
    // InternalGraphqlidl.g:2893:1: rule__GraphqlType__Group_2__0__Impl : ( ( rule__GraphqlType__LtypeAssignment_2_0 ) ) ;
    public final void rule__GraphqlType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2897:1: ( ( ( rule__GraphqlType__LtypeAssignment_2_0 ) ) )
            // InternalGraphqlidl.g:2898:1: ( ( rule__GraphqlType__LtypeAssignment_2_0 ) )
            {
            // InternalGraphqlidl.g:2898:1: ( ( rule__GraphqlType__LtypeAssignment_2_0 ) )
            // InternalGraphqlidl.g:2899:2: ( rule__GraphqlType__LtypeAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getLtypeAssignment_2_0()); 
            }
            // InternalGraphqlidl.g:2900:2: ( rule__GraphqlType__LtypeAssignment_2_0 )
            // InternalGraphqlidl.g:2900:3: rule__GraphqlType__LtypeAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlType__LtypeAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getLtypeAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__Group_2__0__Impl"


    // $ANTLR start "rule__GraphqlType__Group_2__1"
    // InternalGraphqlidl.g:2908:1: rule__GraphqlType__Group_2__1 : rule__GraphqlType__Group_2__1__Impl ;
    public final void rule__GraphqlType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2912:1: ( rule__GraphqlType__Group_2__1__Impl )
            // InternalGraphqlidl.g:2913:2: rule__GraphqlType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlType__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__Group_2__1"


    // $ANTLR start "rule__GraphqlType__Group_2__1__Impl"
    // InternalGraphqlidl.g:2919:1: rule__GraphqlType__Group_2__1__Impl : ( ( rule__GraphqlType__NonNullAssignment_2_1 )? ) ;
    public final void rule__GraphqlType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2923:1: ( ( ( rule__GraphqlType__NonNullAssignment_2_1 )? ) )
            // InternalGraphqlidl.g:2924:1: ( ( rule__GraphqlType__NonNullAssignment_2_1 )? )
            {
            // InternalGraphqlidl.g:2924:1: ( ( rule__GraphqlType__NonNullAssignment_2_1 )? )
            // InternalGraphqlidl.g:2925:2: ( rule__GraphqlType__NonNullAssignment_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getNonNullAssignment_2_1()); 
            }
            // InternalGraphqlidl.g:2926:2: ( rule__GraphqlType__NonNullAssignment_2_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGraphqlidl.g:2926:3: rule__GraphqlType__NonNullAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlType__NonNullAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getNonNullAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__Group_2__1__Impl"


    // $ANTLR start "rule__GraphqlListType__Group__0"
    // InternalGraphqlidl.g:2935:1: rule__GraphqlListType__Group__0 : rule__GraphqlListType__Group__0__Impl rule__GraphqlListType__Group__1 ;
    public final void rule__GraphqlListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2939:1: ( rule__GraphqlListType__Group__0__Impl rule__GraphqlListType__Group__1 )
            // InternalGraphqlidl.g:2940:2: rule__GraphqlListType__Group__0__Impl rule__GraphqlListType__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__GraphqlListType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlListType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlListType__Group__0"


    // $ANTLR start "rule__GraphqlListType__Group__0__Impl"
    // InternalGraphqlidl.g:2947:1: rule__GraphqlListType__Group__0__Impl : ( '[' ) ;
    public final void rule__GraphqlListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2951:1: ( ( '[' ) )
            // InternalGraphqlidl.g:2952:1: ( '[' )
            {
            // InternalGraphqlidl.g:2952:1: ( '[' )
            // InternalGraphqlidl.g:2953:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlListTypeAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlListTypeAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlListType__Group__0__Impl"


    // $ANTLR start "rule__GraphqlListType__Group__1"
    // InternalGraphqlidl.g:2962:1: rule__GraphqlListType__Group__1 : rule__GraphqlListType__Group__1__Impl rule__GraphqlListType__Group__2 ;
    public final void rule__GraphqlListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2966:1: ( rule__GraphqlListType__Group__1__Impl rule__GraphqlListType__Group__2 )
            // InternalGraphqlidl.g:2967:2: rule__GraphqlListType__Group__1__Impl rule__GraphqlListType__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__GraphqlListType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlListType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlListType__Group__1"


    // $ANTLR start "rule__GraphqlListType__Group__1__Impl"
    // InternalGraphqlidl.g:2974:1: rule__GraphqlListType__Group__1__Impl : ( ruleGraphqlType ) ;
    public final void rule__GraphqlListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2978:1: ( ( ruleGraphqlType ) )
            // InternalGraphqlidl.g:2979:1: ( ruleGraphqlType )
            {
            // InternalGraphqlidl.g:2979:1: ( ruleGraphqlType )
            // InternalGraphqlidl.g:2980:2: ruleGraphqlType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlListTypeAccess().getGraphqlTypeParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlListTypeAccess().getGraphqlTypeParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlListType__Group__1__Impl"


    // $ANTLR start "rule__GraphqlListType__Group__2"
    // InternalGraphqlidl.g:2989:1: rule__GraphqlListType__Group__2 : rule__GraphqlListType__Group__2__Impl ;
    public final void rule__GraphqlListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:2993:1: ( rule__GraphqlListType__Group__2__Impl )
            // InternalGraphqlidl.g:2994:2: rule__GraphqlListType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlListType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlListType__Group__2"


    // $ANTLR start "rule__GraphqlListType__Group__2__Impl"
    // InternalGraphqlidl.g:3000:1: rule__GraphqlListType__Group__2__Impl : ( ']' ) ;
    public final void rule__GraphqlListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3004:1: ( ( ']' ) )
            // InternalGraphqlidl.g:3005:1: ( ']' )
            {
            // InternalGraphqlidl.g:3005:1: ( ']' )
            // InternalGraphqlidl.g:3006:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlListTypeAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlListTypeAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlListType__Group__2__Impl"


    // $ANTLR start "rule__GraphqlInputType__Group_0__0"
    // InternalGraphqlidl.g:3016:1: rule__GraphqlInputType__Group_0__0 : rule__GraphqlInputType__Group_0__0__Impl rule__GraphqlInputType__Group_0__1 ;
    public final void rule__GraphqlInputType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3020:1: ( rule__GraphqlInputType__Group_0__0__Impl rule__GraphqlInputType__Group_0__1 )
            // InternalGraphqlidl.g:3021:2: rule__GraphqlInputType__Group_0__0__Impl rule__GraphqlInputType__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__GraphqlInputType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlInputType__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__Group_0__0"


    // $ANTLR start "rule__GraphqlInputType__Group_0__0__Impl"
    // InternalGraphqlidl.g:3028:1: rule__GraphqlInputType__Group_0__0__Impl : ( ( rule__GraphqlInputType__DtypeAssignment_0_0 ) ) ;
    public final void rule__GraphqlInputType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3032:1: ( ( ( rule__GraphqlInputType__DtypeAssignment_0_0 ) ) )
            // InternalGraphqlidl.g:3033:1: ( ( rule__GraphqlInputType__DtypeAssignment_0_0 ) )
            {
            // InternalGraphqlidl.g:3033:1: ( ( rule__GraphqlInputType__DtypeAssignment_0_0 ) )
            // InternalGraphqlidl.g:3034:2: ( rule__GraphqlInputType__DtypeAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getDtypeAssignment_0_0()); 
            }
            // InternalGraphqlidl.g:3035:2: ( rule__GraphqlInputType__DtypeAssignment_0_0 )
            // InternalGraphqlidl.g:3035:3: rule__GraphqlInputType__DtypeAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInputType__DtypeAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getDtypeAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__Group_0__0__Impl"


    // $ANTLR start "rule__GraphqlInputType__Group_0__1"
    // InternalGraphqlidl.g:3043:1: rule__GraphqlInputType__Group_0__1 : rule__GraphqlInputType__Group_0__1__Impl ;
    public final void rule__GraphqlInputType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3047:1: ( rule__GraphqlInputType__Group_0__1__Impl )
            // InternalGraphqlidl.g:3048:2: rule__GraphqlInputType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInputType__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__Group_0__1"


    // $ANTLR start "rule__GraphqlInputType__Group_0__1__Impl"
    // InternalGraphqlidl.g:3054:1: rule__GraphqlInputType__Group_0__1__Impl : ( ( rule__GraphqlInputType__NonNullAssignment_0_1 )? ) ;
    public final void rule__GraphqlInputType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3058:1: ( ( ( rule__GraphqlInputType__NonNullAssignment_0_1 )? ) )
            // InternalGraphqlidl.g:3059:1: ( ( rule__GraphqlInputType__NonNullAssignment_0_1 )? )
            {
            // InternalGraphqlidl.g:3059:1: ( ( rule__GraphqlInputType__NonNullAssignment_0_1 )? )
            // InternalGraphqlidl.g:3060:2: ( rule__GraphqlInputType__NonNullAssignment_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getNonNullAssignment_0_1()); 
            }
            // InternalGraphqlidl.g:3061:2: ( rule__GraphqlInputType__NonNullAssignment_0_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGraphqlidl.g:3061:3: rule__GraphqlInputType__NonNullAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlInputType__NonNullAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getNonNullAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__Group_0__1__Impl"


    // $ANTLR start "rule__GraphqlInputType__Group_1__0"
    // InternalGraphqlidl.g:3070:1: rule__GraphqlInputType__Group_1__0 : rule__GraphqlInputType__Group_1__0__Impl rule__GraphqlInputType__Group_1__1 ;
    public final void rule__GraphqlInputType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3074:1: ( rule__GraphqlInputType__Group_1__0__Impl rule__GraphqlInputType__Group_1__1 )
            // InternalGraphqlidl.g:3075:2: rule__GraphqlInputType__Group_1__0__Impl rule__GraphqlInputType__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__GraphqlInputType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlInputType__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__Group_1__0"


    // $ANTLR start "rule__GraphqlInputType__Group_1__0__Impl"
    // InternalGraphqlidl.g:3082:1: rule__GraphqlInputType__Group_1__0__Impl : ( ( rule__GraphqlInputType__NtypeAssignment_1_0 ) ) ;
    public final void rule__GraphqlInputType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3086:1: ( ( ( rule__GraphqlInputType__NtypeAssignment_1_0 ) ) )
            // InternalGraphqlidl.g:3087:1: ( ( rule__GraphqlInputType__NtypeAssignment_1_0 ) )
            {
            // InternalGraphqlidl.g:3087:1: ( ( rule__GraphqlInputType__NtypeAssignment_1_0 ) )
            // InternalGraphqlidl.g:3088:2: ( rule__GraphqlInputType__NtypeAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getNtypeAssignment_1_0()); 
            }
            // InternalGraphqlidl.g:3089:2: ( rule__GraphqlInputType__NtypeAssignment_1_0 )
            // InternalGraphqlidl.g:3089:3: rule__GraphqlInputType__NtypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInputType__NtypeAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getNtypeAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__Group_1__0__Impl"


    // $ANTLR start "rule__GraphqlInputType__Group_1__1"
    // InternalGraphqlidl.g:3097:1: rule__GraphqlInputType__Group_1__1 : rule__GraphqlInputType__Group_1__1__Impl ;
    public final void rule__GraphqlInputType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3101:1: ( rule__GraphqlInputType__Group_1__1__Impl )
            // InternalGraphqlidl.g:3102:2: rule__GraphqlInputType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInputType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__Group_1__1"


    // $ANTLR start "rule__GraphqlInputType__Group_1__1__Impl"
    // InternalGraphqlidl.g:3108:1: rule__GraphqlInputType__Group_1__1__Impl : ( ( rule__GraphqlInputType__NonNullAssignment_1_1 )? ) ;
    public final void rule__GraphqlInputType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3112:1: ( ( ( rule__GraphqlInputType__NonNullAssignment_1_1 )? ) )
            // InternalGraphqlidl.g:3113:1: ( ( rule__GraphqlInputType__NonNullAssignment_1_1 )? )
            {
            // InternalGraphqlidl.g:3113:1: ( ( rule__GraphqlInputType__NonNullAssignment_1_1 )? )
            // InternalGraphqlidl.g:3114:2: ( rule__GraphqlInputType__NonNullAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getNonNullAssignment_1_1()); 
            }
            // InternalGraphqlidl.g:3115:2: ( rule__GraphqlInputType__NonNullAssignment_1_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGraphqlidl.g:3115:3: rule__GraphqlInputType__NonNullAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlInputType__NonNullAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getNonNullAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__Group_1__1__Impl"


    // $ANTLR start "rule__GraphqlInputType__Group_2__0"
    // InternalGraphqlidl.g:3124:1: rule__GraphqlInputType__Group_2__0 : rule__GraphqlInputType__Group_2__0__Impl rule__GraphqlInputType__Group_2__1 ;
    public final void rule__GraphqlInputType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3128:1: ( rule__GraphqlInputType__Group_2__0__Impl rule__GraphqlInputType__Group_2__1 )
            // InternalGraphqlidl.g:3129:2: rule__GraphqlInputType__Group_2__0__Impl rule__GraphqlInputType__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__GraphqlInputType__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlInputType__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__Group_2__0"


    // $ANTLR start "rule__GraphqlInputType__Group_2__0__Impl"
    // InternalGraphqlidl.g:3136:1: rule__GraphqlInputType__Group_2__0__Impl : ( ( rule__GraphqlInputType__LtypeAssignment_2_0 ) ) ;
    public final void rule__GraphqlInputType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3140:1: ( ( ( rule__GraphqlInputType__LtypeAssignment_2_0 ) ) )
            // InternalGraphqlidl.g:3141:1: ( ( rule__GraphqlInputType__LtypeAssignment_2_0 ) )
            {
            // InternalGraphqlidl.g:3141:1: ( ( rule__GraphqlInputType__LtypeAssignment_2_0 ) )
            // InternalGraphqlidl.g:3142:2: ( rule__GraphqlInputType__LtypeAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getLtypeAssignment_2_0()); 
            }
            // InternalGraphqlidl.g:3143:2: ( rule__GraphqlInputType__LtypeAssignment_2_0 )
            // InternalGraphqlidl.g:3143:3: rule__GraphqlInputType__LtypeAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInputType__LtypeAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getLtypeAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__Group_2__0__Impl"


    // $ANTLR start "rule__GraphqlInputType__Group_2__1"
    // InternalGraphqlidl.g:3151:1: rule__GraphqlInputType__Group_2__1 : rule__GraphqlInputType__Group_2__1__Impl ;
    public final void rule__GraphqlInputType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3155:1: ( rule__GraphqlInputType__Group_2__1__Impl )
            // InternalGraphqlidl.g:3156:2: rule__GraphqlInputType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlInputType__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__Group_2__1"


    // $ANTLR start "rule__GraphqlInputType__Group_2__1__Impl"
    // InternalGraphqlidl.g:3162:1: rule__GraphqlInputType__Group_2__1__Impl : ( ( rule__GraphqlInputType__NonNullAssignment_2_1 )? ) ;
    public final void rule__GraphqlInputType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3166:1: ( ( ( rule__GraphqlInputType__NonNullAssignment_2_1 )? ) )
            // InternalGraphqlidl.g:3167:1: ( ( rule__GraphqlInputType__NonNullAssignment_2_1 )? )
            {
            // InternalGraphqlidl.g:3167:1: ( ( rule__GraphqlInputType__NonNullAssignment_2_1 )? )
            // InternalGraphqlidl.g:3168:2: ( rule__GraphqlInputType__NonNullAssignment_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getNonNullAssignment_2_1()); 
            }
            // InternalGraphqlidl.g:3169:2: ( rule__GraphqlInputType__NonNullAssignment_2_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGraphqlidl.g:3169:3: rule__GraphqlInputType__NonNullAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlInputType__NonNullAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getNonNullAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__Group_2__1__Impl"


    // $ANTLR start "rule__GraphqlListInputType__Group__0"
    // InternalGraphqlidl.g:3178:1: rule__GraphqlListInputType__Group__0 : rule__GraphqlListInputType__Group__0__Impl rule__GraphqlListInputType__Group__1 ;
    public final void rule__GraphqlListInputType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3182:1: ( rule__GraphqlListInputType__Group__0__Impl rule__GraphqlListInputType__Group__1 )
            // InternalGraphqlidl.g:3183:2: rule__GraphqlListInputType__Group__0__Impl rule__GraphqlListInputType__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__GraphqlListInputType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlListInputType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlListInputType__Group__0"


    // $ANTLR start "rule__GraphqlListInputType__Group__0__Impl"
    // InternalGraphqlidl.g:3190:1: rule__GraphqlListInputType__Group__0__Impl : ( '[' ) ;
    public final void rule__GraphqlListInputType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3194:1: ( ( '[' ) )
            // InternalGraphqlidl.g:3195:1: ( '[' )
            {
            // InternalGraphqlidl.g:3195:1: ( '[' )
            // InternalGraphqlidl.g:3196:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlListInputTypeAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlListInputTypeAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlListInputType__Group__0__Impl"


    // $ANTLR start "rule__GraphqlListInputType__Group__1"
    // InternalGraphqlidl.g:3205:1: rule__GraphqlListInputType__Group__1 : rule__GraphqlListInputType__Group__1__Impl rule__GraphqlListInputType__Group__2 ;
    public final void rule__GraphqlListInputType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3209:1: ( rule__GraphqlListInputType__Group__1__Impl rule__GraphqlListInputType__Group__2 )
            // InternalGraphqlidl.g:3210:2: rule__GraphqlListInputType__Group__1__Impl rule__GraphqlListInputType__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__GraphqlListInputType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GraphqlListInputType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlListInputType__Group__1"


    // $ANTLR start "rule__GraphqlListInputType__Group__1__Impl"
    // InternalGraphqlidl.g:3217:1: rule__GraphqlListInputType__Group__1__Impl : ( ruleGraphqlInputType ) ;
    public final void rule__GraphqlListInputType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3221:1: ( ( ruleGraphqlInputType ) )
            // InternalGraphqlidl.g:3222:1: ( ruleGraphqlInputType )
            {
            // InternalGraphqlidl.g:3222:1: ( ruleGraphqlInputType )
            // InternalGraphqlidl.g:3223:2: ruleGraphqlInputType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlListInputTypeAccess().getGraphqlInputTypeParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlInputType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlListInputTypeAccess().getGraphqlInputTypeParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlListInputType__Group__1__Impl"


    // $ANTLR start "rule__GraphqlListInputType__Group__2"
    // InternalGraphqlidl.g:3232:1: rule__GraphqlListInputType__Group__2 : rule__GraphqlListInputType__Group__2__Impl ;
    public final void rule__GraphqlListInputType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3236:1: ( rule__GraphqlListInputType__Group__2__Impl )
            // InternalGraphqlidl.g:3237:2: rule__GraphqlListInputType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlListInputType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlListInputType__Group__2"


    // $ANTLR start "rule__GraphqlListInputType__Group__2__Impl"
    // InternalGraphqlidl.g:3243:1: rule__GraphqlListInputType__Group__2__Impl : ( ']' ) ;
    public final void rule__GraphqlListInputType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3247:1: ( ( ']' ) )
            // InternalGraphqlidl.g:3248:1: ( ']' )
            {
            // InternalGraphqlidl.g:3248:1: ( ']' )
            // InternalGraphqlidl.g:3249:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlListInputTypeAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlListInputTypeAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlListInputType__Group__2__Impl"


    // $ANTLR start "rule__Argument__Group__0"
    // InternalGraphqlidl.g:3259:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3263:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalGraphqlidl.g:3264:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Argument__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Argument__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0"


    // $ANTLR start "rule__Argument__Group__0__Impl"
    // InternalGraphqlidl.g:3271:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__NameAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3275:1: ( ( ( rule__Argument__NameAssignment_0 ) ) )
            // InternalGraphqlidl.g:3276:1: ( ( rule__Argument__NameAssignment_0 ) )
            {
            // InternalGraphqlidl.g:3276:1: ( ( rule__Argument__NameAssignment_0 ) )
            // InternalGraphqlidl.g:3277:2: ( rule__Argument__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getNameAssignment_0()); 
            }
            // InternalGraphqlidl.g:3278:2: ( rule__Argument__NameAssignment_0 )
            // InternalGraphqlidl.g:3278:3: rule__Argument__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0__Impl"


    // $ANTLR start "rule__Argument__Group__1"
    // InternalGraphqlidl.g:3286:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3290:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // InternalGraphqlidl.g:3291:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Argument__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Argument__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1"


    // $ANTLR start "rule__Argument__Group__1__Impl"
    // InternalGraphqlidl.g:3298:1: rule__Argument__Group__1__Impl : ( ':' ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3302:1: ( ( ':' ) )
            // InternalGraphqlidl.g:3303:1: ( ':' )
            {
            // InternalGraphqlidl.g:3303:1: ( ':' )
            // InternalGraphqlidl.g:3304:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getColonKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1__Impl"


    // $ANTLR start "rule__Argument__Group__2"
    // InternalGraphqlidl.g:3313:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl rule__Argument__Group__3 ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3317:1: ( rule__Argument__Group__2__Impl rule__Argument__Group__3 )
            // InternalGraphqlidl.g:3318:2: rule__Argument__Group__2__Impl rule__Argument__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Argument__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Argument__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__2"


    // $ANTLR start "rule__Argument__Group__2__Impl"
    // InternalGraphqlidl.g:3325:1: rule__Argument__Group__2__Impl : ( ( rule__Argument__TypeAssignment_2 ) ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3329:1: ( ( ( rule__Argument__TypeAssignment_2 ) ) )
            // InternalGraphqlidl.g:3330:1: ( ( rule__Argument__TypeAssignment_2 ) )
            {
            // InternalGraphqlidl.g:3330:1: ( ( rule__Argument__TypeAssignment_2 ) )
            // InternalGraphqlidl.g:3331:2: ( rule__Argument__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getTypeAssignment_2()); 
            }
            // InternalGraphqlidl.g:3332:2: ( rule__Argument__TypeAssignment_2 )
            // InternalGraphqlidl.g:3332:3: rule__Argument__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Argument__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__2__Impl"


    // $ANTLR start "rule__Argument__Group__3"
    // InternalGraphqlidl.g:3340:1: rule__Argument__Group__3 : rule__Argument__Group__3__Impl ;
    public final void rule__Argument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3344:1: ( rule__Argument__Group__3__Impl )
            // InternalGraphqlidl.g:3345:2: rule__Argument__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__3"


    // $ANTLR start "rule__Argument__Group__3__Impl"
    // InternalGraphqlidl.g:3351:1: rule__Argument__Group__3__Impl : ( ( rule__Argument__Group_3__0 )? ) ;
    public final void rule__Argument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3355:1: ( ( ( rule__Argument__Group_3__0 )? ) )
            // InternalGraphqlidl.g:3356:1: ( ( rule__Argument__Group_3__0 )? )
            {
            // InternalGraphqlidl.g:3356:1: ( ( rule__Argument__Group_3__0 )? )
            // InternalGraphqlidl.g:3357:2: ( rule__Argument__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getGroup_3()); 
            }
            // InternalGraphqlidl.g:3358:2: ( rule__Argument__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGraphqlidl.g:3358:3: rule__Argument__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Argument__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__3__Impl"


    // $ANTLR start "rule__Argument__Group_3__0"
    // InternalGraphqlidl.g:3367:1: rule__Argument__Group_3__0 : rule__Argument__Group_3__0__Impl rule__Argument__Group_3__1 ;
    public final void rule__Argument__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3371:1: ( rule__Argument__Group_3__0__Impl rule__Argument__Group_3__1 )
            // InternalGraphqlidl.g:3372:2: rule__Argument__Group_3__0__Impl rule__Argument__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__Argument__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Argument__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_3__0"


    // $ANTLR start "rule__Argument__Group_3__0__Impl"
    // InternalGraphqlidl.g:3379:1: rule__Argument__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Argument__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3383:1: ( ( '=' ) )
            // InternalGraphqlidl.g:3384:1: ( '=' )
            {
            // InternalGraphqlidl.g:3384:1: ( '=' )
            // InternalGraphqlidl.g:3385:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getEqualsSignKeyword_3_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getEqualsSignKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_3__0__Impl"


    // $ANTLR start "rule__Argument__Group_3__1"
    // InternalGraphqlidl.g:3394:1: rule__Argument__Group_3__1 : rule__Argument__Group_3__1__Impl ;
    public final void rule__Argument__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3398:1: ( rule__Argument__Group_3__1__Impl )
            // InternalGraphqlidl.g:3399:2: rule__Argument__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_3__1"


    // $ANTLR start "rule__Argument__Group_3__1__Impl"
    // InternalGraphqlidl.g:3405:1: rule__Argument__Group_3__1__Impl : ( ( rule__Argument__DefValueAssignment_3_1 ) ) ;
    public final void rule__Argument__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3409:1: ( ( ( rule__Argument__DefValueAssignment_3_1 ) ) )
            // InternalGraphqlidl.g:3410:1: ( ( rule__Argument__DefValueAssignment_3_1 ) )
            {
            // InternalGraphqlidl.g:3410:1: ( ( rule__Argument__DefValueAssignment_3_1 ) )
            // InternalGraphqlidl.g:3411:2: ( rule__Argument__DefValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getDefValueAssignment_3_1()); 
            }
            // InternalGraphqlidl.g:3412:2: ( rule__Argument__DefValueAssignment_3_1 )
            // InternalGraphqlidl.g:3412:3: rule__Argument__DefValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Argument__DefValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getDefValueAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_3__1__Impl"


    // $ANTLR start "rule__EnumValue__Group__0"
    // InternalGraphqlidl.g:3421:1: rule__EnumValue__Group__0 : rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1 ;
    public final void rule__EnumValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3425:1: ( rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1 )
            // InternalGraphqlidl.g:3426:2: rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__EnumValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__0"


    // $ANTLR start "rule__EnumValue__Group__0__Impl"
    // InternalGraphqlidl.g:3433:1: rule__EnumValue__Group__0__Impl : ( () ) ;
    public final void rule__EnumValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3437:1: ( ( () ) )
            // InternalGraphqlidl.g:3438:1: ( () )
            {
            // InternalGraphqlidl.g:3438:1: ( () )
            // InternalGraphqlidl.g:3439:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValueAccess().getEnumValueAction_0()); 
            }
            // InternalGraphqlidl.g:3440:2: ()
            // InternalGraphqlidl.g:3440:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValueAccess().getEnumValueAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__0__Impl"


    // $ANTLR start "rule__EnumValue__Group__1"
    // InternalGraphqlidl.g:3448:1: rule__EnumValue__Group__1 : rule__EnumValue__Group__1__Impl ;
    public final void rule__EnumValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3452:1: ( rule__EnumValue__Group__1__Impl )
            // InternalGraphqlidl.g:3453:2: rule__EnumValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__1"


    // $ANTLR start "rule__EnumValue__Group__1__Impl"
    // InternalGraphqlidl.g:3459:1: rule__EnumValue__Group__1__Impl : ( ( rule__EnumValue__NameAssignment_1 ) ) ;
    public final void rule__EnumValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3463:1: ( ( ( rule__EnumValue__NameAssignment_1 ) ) )
            // InternalGraphqlidl.g:3464:1: ( ( rule__EnumValue__NameAssignment_1 ) )
            {
            // InternalGraphqlidl.g:3464:1: ( ( rule__EnumValue__NameAssignment_1 ) )
            // InternalGraphqlidl.g:3465:2: ( rule__EnumValue__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValueAccess().getNameAssignment_1()); 
            }
            // InternalGraphqlidl.g:3466:2: ( rule__EnumValue__NameAssignment_1 )
            // InternalGraphqlidl.g:3466:3: rule__EnumValue__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValueAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__1__Impl"


    // $ANTLR start "rule__ListValue__Group__0"
    // InternalGraphqlidl.g:3475:1: rule__ListValue__Group__0 : rule__ListValue__Group__0__Impl rule__ListValue__Group__1 ;
    public final void rule__ListValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3479:1: ( rule__ListValue__Group__0__Impl rule__ListValue__Group__1 )
            // InternalGraphqlidl.g:3480:2: rule__ListValue__Group__0__Impl rule__ListValue__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ListValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__0"


    // $ANTLR start "rule__ListValue__Group__0__Impl"
    // InternalGraphqlidl.g:3487:1: rule__ListValue__Group__0__Impl : ( () ) ;
    public final void rule__ListValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3491:1: ( ( () ) )
            // InternalGraphqlidl.g:3492:1: ( () )
            {
            // InternalGraphqlidl.g:3492:1: ( () )
            // InternalGraphqlidl.g:3493:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getListValueAction_0()); 
            }
            // InternalGraphqlidl.g:3494:2: ()
            // InternalGraphqlidl.g:3494:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListValueAccess().getListValueAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__0__Impl"


    // $ANTLR start "rule__ListValue__Group__1"
    // InternalGraphqlidl.g:3502:1: rule__ListValue__Group__1 : rule__ListValue__Group__1__Impl rule__ListValue__Group__2 ;
    public final void rule__ListValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3506:1: ( rule__ListValue__Group__1__Impl rule__ListValue__Group__2 )
            // InternalGraphqlidl.g:3507:2: rule__ListValue__Group__1__Impl rule__ListValue__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ListValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__1"


    // $ANTLR start "rule__ListValue__Group__1__Impl"
    // InternalGraphqlidl.g:3514:1: rule__ListValue__Group__1__Impl : ( '[' ) ;
    public final void rule__ListValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3518:1: ( ( '[' ) )
            // InternalGraphqlidl.g:3519:1: ( '[' )
            {
            // InternalGraphqlidl.g:3519:1: ( '[' )
            // InternalGraphqlidl.g:3520:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__1__Impl"


    // $ANTLR start "rule__ListValue__Group__2"
    // InternalGraphqlidl.g:3529:1: rule__ListValue__Group__2 : rule__ListValue__Group__2__Impl rule__ListValue__Group__3 ;
    public final void rule__ListValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3533:1: ( rule__ListValue__Group__2__Impl rule__ListValue__Group__3 )
            // InternalGraphqlidl.g:3534:2: rule__ListValue__Group__2__Impl rule__ListValue__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ListValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListValue__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__2"


    // $ANTLR start "rule__ListValue__Group__2__Impl"
    // InternalGraphqlidl.g:3541:1: rule__ListValue__Group__2__Impl : ( ( rule__ListValue__ValuesAssignment_2 )* ) ;
    public final void rule__ListValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3545:1: ( ( ( rule__ListValue__ValuesAssignment_2 )* ) )
            // InternalGraphqlidl.g:3546:1: ( ( rule__ListValue__ValuesAssignment_2 )* )
            {
            // InternalGraphqlidl.g:3546:1: ( ( rule__ListValue__ValuesAssignment_2 )* )
            // InternalGraphqlidl.g:3547:2: ( rule__ListValue__ValuesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getValuesAssignment_2()); 
            }
            // InternalGraphqlidl.g:3548:2: ( rule__ListValue__ValuesAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_NONZERODIGIT||LA29_0==RULE_NAME||(LA29_0>=RULE_BOOLEANVALUE && LA29_0<=RULE_NULLVALUE)||LA29_0==19||LA29_0==23||LA29_0==39||LA29_0==41||LA29_0==43) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGraphqlidl.g:3548:3: rule__ListValue__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__ListValue__ValuesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListValueAccess().getValuesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__2__Impl"


    // $ANTLR start "rule__ListValue__Group__3"
    // InternalGraphqlidl.g:3556:1: rule__ListValue__Group__3 : rule__ListValue__Group__3__Impl ;
    public final void rule__ListValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3560:1: ( rule__ListValue__Group__3__Impl )
            // InternalGraphqlidl.g:3561:2: rule__ListValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__3"


    // $ANTLR start "rule__ListValue__Group__3__Impl"
    // InternalGraphqlidl.g:3567:1: rule__ListValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ListValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3571:1: ( ( ']' ) )
            // InternalGraphqlidl.g:3572:1: ( ']' )
            {
            // InternalGraphqlidl.g:3572:1: ( ']' )
            // InternalGraphqlidl.g:3573:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__3__Impl"


    // $ANTLR start "rule__ObjectValue__Group__0"
    // InternalGraphqlidl.g:3583:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3587:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalGraphqlidl.g:3588:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ObjectValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__0"


    // $ANTLR start "rule__ObjectValue__Group__0__Impl"
    // InternalGraphqlidl.g:3595:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3599:1: ( ( () ) )
            // InternalGraphqlidl.g:3600:1: ( () )
            {
            // InternalGraphqlidl.g:3600:1: ( () )
            // InternalGraphqlidl.g:3601:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            }
            // InternalGraphqlidl.g:3602:2: ()
            // InternalGraphqlidl.g:3602:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__0__Impl"


    // $ANTLR start "rule__ObjectValue__Group__1"
    // InternalGraphqlidl.g:3610:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3614:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalGraphqlidl.g:3615:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ObjectValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__1"


    // $ANTLR start "rule__ObjectValue__Group__1__Impl"
    // InternalGraphqlidl.g:3622:1: rule__ObjectValue__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3626:1: ( ( '{' ) )
            // InternalGraphqlidl.g:3627:1: ( '{' )
            {
            // InternalGraphqlidl.g:3627:1: ( '{' )
            // InternalGraphqlidl.g:3628:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__1__Impl"


    // $ANTLR start "rule__ObjectValue__Group__2"
    // InternalGraphqlidl.g:3637:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3641:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalGraphqlidl.g:3642:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__ObjectValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__2"


    // $ANTLR start "rule__ObjectValue__Group__2__Impl"
    // InternalGraphqlidl.g:3649:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__FieldsAssignment_2 )* ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3653:1: ( ( ( rule__ObjectValue__FieldsAssignment_2 )* ) )
            // InternalGraphqlidl.g:3654:1: ( ( rule__ObjectValue__FieldsAssignment_2 )* )
            {
            // InternalGraphqlidl.g:3654:1: ( ( rule__ObjectValue__FieldsAssignment_2 )* )
            // InternalGraphqlidl.g:3655:2: ( rule__ObjectValue__FieldsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getFieldsAssignment_2()); 
            }
            // InternalGraphqlidl.g:3656:2: ( rule__ObjectValue__FieldsAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_NAME) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGraphqlidl.g:3656:3: rule__ObjectValue__FieldsAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ObjectValue__FieldsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getFieldsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__2__Impl"


    // $ANTLR start "rule__ObjectValue__Group__3"
    // InternalGraphqlidl.g:3664:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3668:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalGraphqlidl.g:3669:2: rule__ObjectValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__3"


    // $ANTLR start "rule__ObjectValue__Group__3__Impl"
    // InternalGraphqlidl.g:3675:1: rule__ObjectValue__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3679:1: ( ( '}' ) )
            // InternalGraphqlidl.g:3680:1: ( '}' )
            {
            // InternalGraphqlidl.g:3680:1: ( '}' )
            // InternalGraphqlidl.g:3681:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__3__Impl"


    // $ANTLR start "rule__ObjectField__Group__0"
    // InternalGraphqlidl.g:3691:1: rule__ObjectField__Group__0 : rule__ObjectField__Group__0__Impl rule__ObjectField__Group__1 ;
    public final void rule__ObjectField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3695:1: ( rule__ObjectField__Group__0__Impl rule__ObjectField__Group__1 )
            // InternalGraphqlidl.g:3696:2: rule__ObjectField__Group__0__Impl rule__ObjectField__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ObjectField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__0"


    // $ANTLR start "rule__ObjectField__Group__0__Impl"
    // InternalGraphqlidl.g:3703:1: rule__ObjectField__Group__0__Impl : ( ( rule__ObjectField__NameAssignment_0 ) ) ;
    public final void rule__ObjectField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3707:1: ( ( ( rule__ObjectField__NameAssignment_0 ) ) )
            // InternalGraphqlidl.g:3708:1: ( ( rule__ObjectField__NameAssignment_0 ) )
            {
            // InternalGraphqlidl.g:3708:1: ( ( rule__ObjectField__NameAssignment_0 ) )
            // InternalGraphqlidl.g:3709:2: ( rule__ObjectField__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectFieldAccess().getNameAssignment_0()); 
            }
            // InternalGraphqlidl.g:3710:2: ( rule__ObjectField__NameAssignment_0 )
            // InternalGraphqlidl.g:3710:3: rule__ObjectField__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectField__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectFieldAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__0__Impl"


    // $ANTLR start "rule__ObjectField__Group__1"
    // InternalGraphqlidl.g:3718:1: rule__ObjectField__Group__1 : rule__ObjectField__Group__1__Impl rule__ObjectField__Group__2 ;
    public final void rule__ObjectField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3722:1: ( rule__ObjectField__Group__1__Impl rule__ObjectField__Group__2 )
            // InternalGraphqlidl.g:3723:2: rule__ObjectField__Group__1__Impl rule__ObjectField__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ObjectField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__1"


    // $ANTLR start "rule__ObjectField__Group__1__Impl"
    // InternalGraphqlidl.g:3730:1: rule__ObjectField__Group__1__Impl : ( ':' ) ;
    public final void rule__ObjectField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3734:1: ( ( ':' ) )
            // InternalGraphqlidl.g:3735:1: ( ':' )
            {
            // InternalGraphqlidl.g:3735:1: ( ':' )
            // InternalGraphqlidl.g:3736:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectFieldAccess().getColonKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectFieldAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__1__Impl"


    // $ANTLR start "rule__ObjectField__Group__2"
    // InternalGraphqlidl.g:3745:1: rule__ObjectField__Group__2 : rule__ObjectField__Group__2__Impl ;
    public final void rule__ObjectField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3749:1: ( rule__ObjectField__Group__2__Impl )
            // InternalGraphqlidl.g:3750:2: rule__ObjectField__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__2"


    // $ANTLR start "rule__ObjectField__Group__2__Impl"
    // InternalGraphqlidl.g:3756:1: rule__ObjectField__Group__2__Impl : ( ( rule__ObjectField__ValueAssignment_2 ) ) ;
    public final void rule__ObjectField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3760:1: ( ( ( rule__ObjectField__ValueAssignment_2 ) ) )
            // InternalGraphqlidl.g:3761:1: ( ( rule__ObjectField__ValueAssignment_2 ) )
            {
            // InternalGraphqlidl.g:3761:1: ( ( rule__ObjectField__ValueAssignment_2 ) )
            // InternalGraphqlidl.g:3762:2: ( rule__ObjectField__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectFieldAccess().getValueAssignment_2()); 
            }
            // InternalGraphqlidl.g:3763:2: ( rule__ObjectField__ValueAssignment_2 )
            // InternalGraphqlidl.g:3763:3: rule__ObjectField__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjectField__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectFieldAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__Group__2__Impl"


    // $ANTLR start "rule__IntegerPart__Group_0__0"
    // InternalGraphqlidl.g:3772:1: rule__IntegerPart__Group_0__0 : rule__IntegerPart__Group_0__0__Impl rule__IntegerPart__Group_0__1 ;
    public final void rule__IntegerPart__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3776:1: ( rule__IntegerPart__Group_0__0__Impl rule__IntegerPart__Group_0__1 )
            // InternalGraphqlidl.g:3777:2: rule__IntegerPart__Group_0__0__Impl rule__IntegerPart__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__IntegerPart__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IntegerPart__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerPart__Group_0__0"


    // $ANTLR start "rule__IntegerPart__Group_0__0__Impl"
    // InternalGraphqlidl.g:3784:1: rule__IntegerPart__Group_0__0__Impl : ( ( ruleNegativeSign )? ) ;
    public final void rule__IntegerPart__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3788:1: ( ( ( ruleNegativeSign )? ) )
            // InternalGraphqlidl.g:3789:1: ( ( ruleNegativeSign )? )
            {
            // InternalGraphqlidl.g:3789:1: ( ( ruleNegativeSign )? )
            // InternalGraphqlidl.g:3790:2: ( ruleNegativeSign )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerPartAccess().getNegativeSignParserRuleCall_0_0()); 
            }
            // InternalGraphqlidl.g:3791:2: ( ruleNegativeSign )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==19) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGraphqlidl.g:3791:3: ruleNegativeSign
                    {
                    pushFollow(FOLLOW_2);
                    ruleNegativeSign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerPartAccess().getNegativeSignParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerPart__Group_0__0__Impl"


    // $ANTLR start "rule__IntegerPart__Group_0__1"
    // InternalGraphqlidl.g:3799:1: rule__IntegerPart__Group_0__1 : rule__IntegerPart__Group_0__1__Impl ;
    public final void rule__IntegerPart__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3803:1: ( rule__IntegerPart__Group_0__1__Impl )
            // InternalGraphqlidl.g:3804:2: rule__IntegerPart__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerPart__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerPart__Group_0__1"


    // $ANTLR start "rule__IntegerPart__Group_0__1__Impl"
    // InternalGraphqlidl.g:3810:1: rule__IntegerPart__Group_0__1__Impl : ( '0' ) ;
    public final void rule__IntegerPart__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3814:1: ( ( '0' ) )
            // InternalGraphqlidl.g:3815:1: ( '0' )
            {
            // InternalGraphqlidl.g:3815:1: ( '0' )
            // InternalGraphqlidl.g:3816:2: '0'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerPartAccess().getDigitZeroKeyword_0_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerPartAccess().getDigitZeroKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerPart__Group_0__1__Impl"


    // $ANTLR start "rule__IntegerPart__Group_1__0"
    // InternalGraphqlidl.g:3826:1: rule__IntegerPart__Group_1__0 : rule__IntegerPart__Group_1__0__Impl rule__IntegerPart__Group_1__1 ;
    public final void rule__IntegerPart__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3830:1: ( rule__IntegerPart__Group_1__0__Impl rule__IntegerPart__Group_1__1 )
            // InternalGraphqlidl.g:3831:2: rule__IntegerPart__Group_1__0__Impl rule__IntegerPart__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__IntegerPart__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IntegerPart__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerPart__Group_1__0"


    // $ANTLR start "rule__IntegerPart__Group_1__0__Impl"
    // InternalGraphqlidl.g:3838:1: rule__IntegerPart__Group_1__0__Impl : ( ( ruleNegativeSign )? ) ;
    public final void rule__IntegerPart__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3842:1: ( ( ( ruleNegativeSign )? ) )
            // InternalGraphqlidl.g:3843:1: ( ( ruleNegativeSign )? )
            {
            // InternalGraphqlidl.g:3843:1: ( ( ruleNegativeSign )? )
            // InternalGraphqlidl.g:3844:2: ( ruleNegativeSign )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerPartAccess().getNegativeSignParserRuleCall_1_0()); 
            }
            // InternalGraphqlidl.g:3845:2: ( ruleNegativeSign )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==19) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGraphqlidl.g:3845:3: ruleNegativeSign
                    {
                    pushFollow(FOLLOW_2);
                    ruleNegativeSign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerPartAccess().getNegativeSignParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerPart__Group_1__0__Impl"


    // $ANTLR start "rule__IntegerPart__Group_1__1"
    // InternalGraphqlidl.g:3853:1: rule__IntegerPart__Group_1__1 : rule__IntegerPart__Group_1__1__Impl rule__IntegerPart__Group_1__2 ;
    public final void rule__IntegerPart__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3857:1: ( rule__IntegerPart__Group_1__1__Impl rule__IntegerPart__Group_1__2 )
            // InternalGraphqlidl.g:3858:2: rule__IntegerPart__Group_1__1__Impl rule__IntegerPart__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__IntegerPart__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IntegerPart__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerPart__Group_1__1"


    // $ANTLR start "rule__IntegerPart__Group_1__1__Impl"
    // InternalGraphqlidl.g:3865:1: rule__IntegerPart__Group_1__1__Impl : ( RULE_NONZERODIGIT ) ;
    public final void rule__IntegerPart__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3869:1: ( ( RULE_NONZERODIGIT ) )
            // InternalGraphqlidl.g:3870:1: ( RULE_NONZERODIGIT )
            {
            // InternalGraphqlidl.g:3870:1: ( RULE_NONZERODIGIT )
            // InternalGraphqlidl.g:3871:2: RULE_NONZERODIGIT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerPartAccess().getNONZERODIGITTerminalRuleCall_1_1()); 
            }
            match(input,RULE_NONZERODIGIT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerPartAccess().getNONZERODIGITTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerPart__Group_1__1__Impl"


    // $ANTLR start "rule__IntegerPart__Group_1__2"
    // InternalGraphqlidl.g:3880:1: rule__IntegerPart__Group_1__2 : rule__IntegerPart__Group_1__2__Impl ;
    public final void rule__IntegerPart__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3884:1: ( rule__IntegerPart__Group_1__2__Impl )
            // InternalGraphqlidl.g:3885:2: rule__IntegerPart__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerPart__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerPart__Group_1__2"


    // $ANTLR start "rule__IntegerPart__Group_1__2__Impl"
    // InternalGraphqlidl.g:3891:1: rule__IntegerPart__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__IntegerPart__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3895:1: ( ( RULE_INT ) )
            // InternalGraphqlidl.g:3896:1: ( RULE_INT )
            {
            // InternalGraphqlidl.g:3896:1: ( RULE_INT )
            // InternalGraphqlidl.g:3897:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerPartAccess().getINTTerminalRuleCall_1_2()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerPartAccess().getINTTerminalRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerPart__Group_1__2__Impl"


    // $ANTLR start "rule__FloatValue__Group_0__0"
    // InternalGraphqlidl.g:3907:1: rule__FloatValue__Group_0__0 : rule__FloatValue__Group_0__0__Impl rule__FloatValue__Group_0__1 ;
    public final void rule__FloatValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3911:1: ( rule__FloatValue__Group_0__0__Impl rule__FloatValue__Group_0__1 )
            // InternalGraphqlidl.g:3912:2: rule__FloatValue__Group_0__0__Impl rule__FloatValue__Group_0__1
            {
            pushFollow(FOLLOW_30);
            rule__FloatValue__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FloatValue__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group_0__0"


    // $ANTLR start "rule__FloatValue__Group_0__0__Impl"
    // InternalGraphqlidl.g:3919:1: rule__FloatValue__Group_0__0__Impl : ( ruleIntegerPart ) ;
    public final void rule__FloatValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3923:1: ( ( ruleIntegerPart ) )
            // InternalGraphqlidl.g:3924:1: ( ruleIntegerPart )
            {
            // InternalGraphqlidl.g:3924:1: ( ruleIntegerPart )
            // InternalGraphqlidl.g:3925:2: ruleIntegerPart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getIntegerPartParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntegerPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getIntegerPartParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group_0__0__Impl"


    // $ANTLR start "rule__FloatValue__Group_0__1"
    // InternalGraphqlidl.g:3934:1: rule__FloatValue__Group_0__1 : rule__FloatValue__Group_0__1__Impl ;
    public final void rule__FloatValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3938:1: ( rule__FloatValue__Group_0__1__Impl )
            // InternalGraphqlidl.g:3939:2: rule__FloatValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatValue__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group_0__1"


    // $ANTLR start "rule__FloatValue__Group_0__1__Impl"
    // InternalGraphqlidl.g:3945:1: rule__FloatValue__Group_0__1__Impl : ( ruleFractionalPart ) ;
    public final void rule__FloatValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3949:1: ( ( ruleFractionalPart ) )
            // InternalGraphqlidl.g:3950:1: ( ruleFractionalPart )
            {
            // InternalGraphqlidl.g:3950:1: ( ruleFractionalPart )
            // InternalGraphqlidl.g:3951:2: ruleFractionalPart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getFractionalPartParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFractionalPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getFractionalPartParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group_0__1__Impl"


    // $ANTLR start "rule__FloatValue__Group_1__0"
    // InternalGraphqlidl.g:3961:1: rule__FloatValue__Group_1__0 : rule__FloatValue__Group_1__0__Impl rule__FloatValue__Group_1__1 ;
    public final void rule__FloatValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3965:1: ( rule__FloatValue__Group_1__0__Impl rule__FloatValue__Group_1__1 )
            // InternalGraphqlidl.g:3966:2: rule__FloatValue__Group_1__0__Impl rule__FloatValue__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__FloatValue__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FloatValue__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group_1__0"


    // $ANTLR start "rule__FloatValue__Group_1__0__Impl"
    // InternalGraphqlidl.g:3973:1: rule__FloatValue__Group_1__0__Impl : ( ruleIntegerPart ) ;
    public final void rule__FloatValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3977:1: ( ( ruleIntegerPart ) )
            // InternalGraphqlidl.g:3978:1: ( ruleIntegerPart )
            {
            // InternalGraphqlidl.g:3978:1: ( ruleIntegerPart )
            // InternalGraphqlidl.g:3979:2: ruleIntegerPart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getIntegerPartParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntegerPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getIntegerPartParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group_1__0__Impl"


    // $ANTLR start "rule__FloatValue__Group_1__1"
    // InternalGraphqlidl.g:3988:1: rule__FloatValue__Group_1__1 : rule__FloatValue__Group_1__1__Impl ;
    public final void rule__FloatValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:3992:1: ( rule__FloatValue__Group_1__1__Impl )
            // InternalGraphqlidl.g:3993:2: rule__FloatValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatValue__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group_1__1"


    // $ANTLR start "rule__FloatValue__Group_1__1__Impl"
    // InternalGraphqlidl.g:3999:1: rule__FloatValue__Group_1__1__Impl : ( ruleExponentPart ) ;
    public final void rule__FloatValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4003:1: ( ( ruleExponentPart ) )
            // InternalGraphqlidl.g:4004:1: ( ruleExponentPart )
            {
            // InternalGraphqlidl.g:4004:1: ( ruleExponentPart )
            // InternalGraphqlidl.g:4005:2: ruleExponentPart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getExponentPartParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExponentPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getExponentPartParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group_1__1__Impl"


    // $ANTLR start "rule__FloatValue__Group_2__0"
    // InternalGraphqlidl.g:4015:1: rule__FloatValue__Group_2__0 : rule__FloatValue__Group_2__0__Impl rule__FloatValue__Group_2__1 ;
    public final void rule__FloatValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4019:1: ( rule__FloatValue__Group_2__0__Impl rule__FloatValue__Group_2__1 )
            // InternalGraphqlidl.g:4020:2: rule__FloatValue__Group_2__0__Impl rule__FloatValue__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__FloatValue__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FloatValue__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group_2__0"


    // $ANTLR start "rule__FloatValue__Group_2__0__Impl"
    // InternalGraphqlidl.g:4027:1: rule__FloatValue__Group_2__0__Impl : ( ruleIntegerPart ) ;
    public final void rule__FloatValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4031:1: ( ( ruleIntegerPart ) )
            // InternalGraphqlidl.g:4032:1: ( ruleIntegerPart )
            {
            // InternalGraphqlidl.g:4032:1: ( ruleIntegerPart )
            // InternalGraphqlidl.g:4033:2: ruleIntegerPart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getIntegerPartParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntegerPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getIntegerPartParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group_2__0__Impl"


    // $ANTLR start "rule__FloatValue__Group_2__1"
    // InternalGraphqlidl.g:4042:1: rule__FloatValue__Group_2__1 : rule__FloatValue__Group_2__1__Impl rule__FloatValue__Group_2__2 ;
    public final void rule__FloatValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4046:1: ( rule__FloatValue__Group_2__1__Impl rule__FloatValue__Group_2__2 )
            // InternalGraphqlidl.g:4047:2: rule__FloatValue__Group_2__1__Impl rule__FloatValue__Group_2__2
            {
            pushFollow(FOLLOW_31);
            rule__FloatValue__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FloatValue__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group_2__1"


    // $ANTLR start "rule__FloatValue__Group_2__1__Impl"
    // InternalGraphqlidl.g:4054:1: rule__FloatValue__Group_2__1__Impl : ( ruleFractionalPart ) ;
    public final void rule__FloatValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4058:1: ( ( ruleFractionalPart ) )
            // InternalGraphqlidl.g:4059:1: ( ruleFractionalPart )
            {
            // InternalGraphqlidl.g:4059:1: ( ruleFractionalPart )
            // InternalGraphqlidl.g:4060:2: ruleFractionalPart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getFractionalPartParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFractionalPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getFractionalPartParserRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group_2__1__Impl"


    // $ANTLR start "rule__FloatValue__Group_2__2"
    // InternalGraphqlidl.g:4069:1: rule__FloatValue__Group_2__2 : rule__FloatValue__Group_2__2__Impl ;
    public final void rule__FloatValue__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4073:1: ( rule__FloatValue__Group_2__2__Impl )
            // InternalGraphqlidl.g:4074:2: rule__FloatValue__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatValue__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group_2__2"


    // $ANTLR start "rule__FloatValue__Group_2__2__Impl"
    // InternalGraphqlidl.g:4080:1: rule__FloatValue__Group_2__2__Impl : ( ruleExponentPart ) ;
    public final void rule__FloatValue__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4084:1: ( ( ruleExponentPart ) )
            // InternalGraphqlidl.g:4085:1: ( ruleExponentPart )
            {
            // InternalGraphqlidl.g:4085:1: ( ruleExponentPart )
            // InternalGraphqlidl.g:4086:2: ruleExponentPart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getExponentPartParserRuleCall_2_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleExponentPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getExponentPartParserRuleCall_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__Group_2__2__Impl"


    // $ANTLR start "rule__FractionalPart__Group__0"
    // InternalGraphqlidl.g:4096:1: rule__FractionalPart__Group__0 : rule__FractionalPart__Group__0__Impl rule__FractionalPart__Group__1 ;
    public final void rule__FractionalPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4100:1: ( rule__FractionalPart__Group__0__Impl rule__FractionalPart__Group__1 )
            // InternalGraphqlidl.g:4101:2: rule__FractionalPart__Group__0__Impl rule__FractionalPart__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__FractionalPart__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FractionalPart__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FractionalPart__Group__0"


    // $ANTLR start "rule__FractionalPart__Group__0__Impl"
    // InternalGraphqlidl.g:4108:1: rule__FractionalPart__Group__0__Impl : ( '.' ) ;
    public final void rule__FractionalPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4112:1: ( ( '.' ) )
            // InternalGraphqlidl.g:4113:1: ( '.' )
            {
            // InternalGraphqlidl.g:4113:1: ( '.' )
            // InternalGraphqlidl.g:4114:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFractionalPartAccess().getFullStopKeyword_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFractionalPartAccess().getFullStopKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FractionalPart__Group__0__Impl"


    // $ANTLR start "rule__FractionalPart__Group__1"
    // InternalGraphqlidl.g:4123:1: rule__FractionalPart__Group__1 : rule__FractionalPart__Group__1__Impl ;
    public final void rule__FractionalPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4127:1: ( rule__FractionalPart__Group__1__Impl )
            // InternalGraphqlidl.g:4128:2: rule__FractionalPart__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FractionalPart__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FractionalPart__Group__1"


    // $ANTLR start "rule__FractionalPart__Group__1__Impl"
    // InternalGraphqlidl.g:4134:1: rule__FractionalPart__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__FractionalPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4138:1: ( ( RULE_INT ) )
            // InternalGraphqlidl.g:4139:1: ( RULE_INT )
            {
            // InternalGraphqlidl.g:4139:1: ( RULE_INT )
            // InternalGraphqlidl.g:4140:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFractionalPartAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFractionalPartAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FractionalPart__Group__1__Impl"


    // $ANTLR start "rule__ExponentPart__Group__0"
    // InternalGraphqlidl.g:4150:1: rule__ExponentPart__Group__0 : rule__ExponentPart__Group__0__Impl rule__ExponentPart__Group__1 ;
    public final void rule__ExponentPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4154:1: ( rule__ExponentPart__Group__0__Impl rule__ExponentPart__Group__1 )
            // InternalGraphqlidl.g:4155:2: rule__ExponentPart__Group__0__Impl rule__ExponentPart__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__ExponentPart__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExponentPart__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentPart__Group__0"


    // $ANTLR start "rule__ExponentPart__Group__0__Impl"
    // InternalGraphqlidl.g:4162:1: rule__ExponentPart__Group__0__Impl : ( ruleExponentIndicator ) ;
    public final void rule__ExponentPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4166:1: ( ( ruleExponentIndicator ) )
            // InternalGraphqlidl.g:4167:1: ( ruleExponentIndicator )
            {
            // InternalGraphqlidl.g:4167:1: ( ruleExponentIndicator )
            // InternalGraphqlidl.g:4168:2: ruleExponentIndicator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentPartAccess().getExponentIndicatorParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExponentIndicator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentPartAccess().getExponentIndicatorParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentPart__Group__0__Impl"


    // $ANTLR start "rule__ExponentPart__Group__1"
    // InternalGraphqlidl.g:4177:1: rule__ExponentPart__Group__1 : rule__ExponentPart__Group__1__Impl rule__ExponentPart__Group__2 ;
    public final void rule__ExponentPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4181:1: ( rule__ExponentPart__Group__1__Impl rule__ExponentPart__Group__2 )
            // InternalGraphqlidl.g:4182:2: rule__ExponentPart__Group__1__Impl rule__ExponentPart__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__ExponentPart__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExponentPart__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentPart__Group__1"


    // $ANTLR start "rule__ExponentPart__Group__1__Impl"
    // InternalGraphqlidl.g:4189:1: rule__ExponentPart__Group__1__Impl : ( ( ruleSign )? ) ;
    public final void rule__ExponentPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4193:1: ( ( ( ruleSign )? ) )
            // InternalGraphqlidl.g:4194:1: ( ( ruleSign )? )
            {
            // InternalGraphqlidl.g:4194:1: ( ( ruleSign )? )
            // InternalGraphqlidl.g:4195:2: ( ruleSign )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentPartAccess().getSignParserRuleCall_1()); 
            }
            // InternalGraphqlidl.g:4196:2: ( ruleSign )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==19||LA33_0==22) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGraphqlidl.g:4196:3: ruleSign
                    {
                    pushFollow(FOLLOW_2);
                    ruleSign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentPartAccess().getSignParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentPart__Group__1__Impl"


    // $ANTLR start "rule__ExponentPart__Group__2"
    // InternalGraphqlidl.g:4204:1: rule__ExponentPart__Group__2 : rule__ExponentPart__Group__2__Impl ;
    public final void rule__ExponentPart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4208:1: ( rule__ExponentPart__Group__2__Impl )
            // InternalGraphqlidl.g:4209:2: rule__ExponentPart__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExponentPart__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentPart__Group__2"


    // $ANTLR start "rule__ExponentPart__Group__2__Impl"
    // InternalGraphqlidl.g:4215:1: rule__ExponentPart__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__ExponentPart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4219:1: ( ( RULE_INT ) )
            // InternalGraphqlidl.g:4220:1: ( RULE_INT )
            {
            // InternalGraphqlidl.g:4220:1: ( RULE_INT )
            // InternalGraphqlidl.g:4221:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExponentPartAccess().getINTTerminalRuleCall_2()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExponentPartAccess().getINTTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExponentPart__Group__2__Impl"


    // $ANTLR start "rule__StringValue__Group_0__0"
    // InternalGraphqlidl.g:4231:1: rule__StringValue__Group_0__0 : rule__StringValue__Group_0__0__Impl rule__StringValue__Group_0__1 ;
    public final void rule__StringValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4235:1: ( rule__StringValue__Group_0__0__Impl rule__StringValue__Group_0__1 )
            // InternalGraphqlidl.g:4236:2: rule__StringValue__Group_0__0__Impl rule__StringValue__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__StringValue__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StringValue__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_0__0"


    // $ANTLR start "rule__StringValue__Group_0__0__Impl"
    // InternalGraphqlidl.g:4243:1: rule__StringValue__Group_0__0__Impl : ( '\"' ) ;
    public final void rule__StringValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4247:1: ( ( '\"' ) )
            // InternalGraphqlidl.g:4248:1: ( '\"' )
            {
            // InternalGraphqlidl.g:4248:1: ( '\"' )
            // InternalGraphqlidl.g:4249:2: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getQuotationMarkKeyword_0_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getQuotationMarkKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_0__0__Impl"


    // $ANTLR start "rule__StringValue__Group_0__1"
    // InternalGraphqlidl.g:4258:1: rule__StringValue__Group_0__1 : rule__StringValue__Group_0__1__Impl ;
    public final void rule__StringValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4262:1: ( rule__StringValue__Group_0__1__Impl )
            // InternalGraphqlidl.g:4263:2: rule__StringValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_0__1"


    // $ANTLR start "rule__StringValue__Group_0__1__Impl"
    // InternalGraphqlidl.g:4269:1: rule__StringValue__Group_0__1__Impl : ( '\"' ) ;
    public final void rule__StringValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4273:1: ( ( '\"' ) )
            // InternalGraphqlidl.g:4274:1: ( '\"' )
            {
            // InternalGraphqlidl.g:4274:1: ( '\"' )
            // InternalGraphqlidl.g:4275:2: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getQuotationMarkKeyword_0_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getQuotationMarkKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_0__1__Impl"


    // $ANTLR start "rule__StringValue__Group_1__0"
    // InternalGraphqlidl.g:4285:1: rule__StringValue__Group_1__0 : rule__StringValue__Group_1__0__Impl rule__StringValue__Group_1__1 ;
    public final void rule__StringValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4289:1: ( rule__StringValue__Group_1__0__Impl rule__StringValue__Group_1__1 )
            // InternalGraphqlidl.g:4290:2: rule__StringValue__Group_1__0__Impl rule__StringValue__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__StringValue__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StringValue__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_1__0"


    // $ANTLR start "rule__StringValue__Group_1__0__Impl"
    // InternalGraphqlidl.g:4297:1: rule__StringValue__Group_1__0__Impl : ( '\"' ) ;
    public final void rule__StringValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4301:1: ( ( '\"' ) )
            // InternalGraphqlidl.g:4302:1: ( '\"' )
            {
            // InternalGraphqlidl.g:4302:1: ( '\"' )
            // InternalGraphqlidl.g:4303:2: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getQuotationMarkKeyword_1_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getQuotationMarkKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_1__0__Impl"


    // $ANTLR start "rule__StringValue__Group_1__1"
    // InternalGraphqlidl.g:4312:1: rule__StringValue__Group_1__1 : rule__StringValue__Group_1__1__Impl rule__StringValue__Group_1__2 ;
    public final void rule__StringValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4316:1: ( rule__StringValue__Group_1__1__Impl rule__StringValue__Group_1__2 )
            // InternalGraphqlidl.g:4317:2: rule__StringValue__Group_1__1__Impl rule__StringValue__Group_1__2
            {
            pushFollow(FOLLOW_33);
            rule__StringValue__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StringValue__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_1__1"


    // $ANTLR start "rule__StringValue__Group_1__1__Impl"
    // InternalGraphqlidl.g:4324:1: rule__StringValue__Group_1__1__Impl : ( RULE_STRING ) ;
    public final void rule__StringValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4328:1: ( ( RULE_STRING ) )
            // InternalGraphqlidl.g:4329:1: ( RULE_STRING )
            {
            // InternalGraphqlidl.g:4329:1: ( RULE_STRING )
            // InternalGraphqlidl.g:4330:2: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getSTRINGTerminalRuleCall_1_1()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getSTRINGTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_1__1__Impl"


    // $ANTLR start "rule__StringValue__Group_1__2"
    // InternalGraphqlidl.g:4339:1: rule__StringValue__Group_1__2 : rule__StringValue__Group_1__2__Impl ;
    public final void rule__StringValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4343:1: ( rule__StringValue__Group_1__2__Impl )
            // InternalGraphqlidl.g:4344:2: rule__StringValue__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_1__2"


    // $ANTLR start "rule__StringValue__Group_1__2__Impl"
    // InternalGraphqlidl.g:4350:1: rule__StringValue__Group_1__2__Impl : ( '\"' ) ;
    public final void rule__StringValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4354:1: ( ( '\"' ) )
            // InternalGraphqlidl.g:4355:1: ( '\"' )
            {
            // InternalGraphqlidl.g:4355:1: ( '\"' )
            // InternalGraphqlidl.g:4356:2: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getQuotationMarkKeyword_1_2()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getQuotationMarkKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_1__2__Impl"


    // $ANTLR start "rule__GraphqlSchema__UnorderedGroup"
    // InternalGraphqlidl.g:4366:1: rule__GraphqlSchema__UnorderedGroup : rule__GraphqlSchema__UnorderedGroup__0 {...}?;
    public final void rule__GraphqlSchema__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup());
        	
        try {
            // InternalGraphqlidl.g:4371:1: ( rule__GraphqlSchema__UnorderedGroup__0 {...}?)
            // InternalGraphqlidl.g:4372:2: rule__GraphqlSchema__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlSchema__UnorderedGroup__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__GraphqlSchema__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchema__UnorderedGroup"


    // $ANTLR start "rule__GraphqlSchema__UnorderedGroup__Impl"
    // InternalGraphqlidl.g:4380:1: rule__GraphqlSchema__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__GraphqlSchema__SchemaAssignment_0 ) ) ) ) | ({...}? => ( ( ( ( rule__GraphqlSchema__TypesAssignment_1 ) ) ( ( ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1 )* ) ) ) ) ) ;
    public final void rule__GraphqlSchema__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalGraphqlidl.g:4385:1: ( ( ({...}? => ( ( ( rule__GraphqlSchema__SchemaAssignment_0 ) ) ) ) | ({...}? => ( ( ( ( rule__GraphqlSchema__TypesAssignment_1 ) ) ( ( ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1 )* ) ) ) ) ) )
            // InternalGraphqlidl.g:4386:3: ( ({...}? => ( ( ( rule__GraphqlSchema__SchemaAssignment_0 ) ) ) ) | ({...}? => ( ( ( ( rule__GraphqlSchema__TypesAssignment_1 ) ) ( ( ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1 )* ) ) ) ) )
            {
            // InternalGraphqlidl.g:4386:3: ( ({...}? => ( ( ( rule__GraphqlSchema__SchemaAssignment_0 ) ) ) ) | ({...}? => ( ( ( ( rule__GraphqlSchema__TypesAssignment_1 ) ) ( ( ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1 )* ) ) ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( LA35_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 0) ) {
                alt35=1;
            }
            else if ( ( LA35_0 == 28 || LA35_0 >= 30 && LA35_0 <= 33 || LA35_0 == 36 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 1) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalGraphqlidl.g:4387:3: ({...}? => ( ( ( rule__GraphqlSchema__SchemaAssignment_0 ) ) ) )
                    {
                    // InternalGraphqlidl.g:4387:3: ({...}? => ( ( ( rule__GraphqlSchema__SchemaAssignment_0 ) ) ) )
                    // InternalGraphqlidl.g:4388:4: {...}? => ( ( ( rule__GraphqlSchema__SchemaAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GraphqlSchema__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalGraphqlidl.g:4388:107: ( ( ( rule__GraphqlSchema__SchemaAssignment_0 ) ) )
                    // InternalGraphqlidl.g:4389:5: ( ( rule__GraphqlSchema__SchemaAssignment_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // InternalGraphqlidl.g:4395:5: ( ( rule__GraphqlSchema__SchemaAssignment_0 ) )
                    // InternalGraphqlidl.g:4396:6: ( rule__GraphqlSchema__SchemaAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlSchemaAccess().getSchemaAssignment_0()); 
                    }
                    // InternalGraphqlidl.g:4397:6: ( rule__GraphqlSchema__SchemaAssignment_0 )
                    // InternalGraphqlidl.g:4397:7: rule__GraphqlSchema__SchemaAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlSchema__SchemaAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlSchemaAccess().getSchemaAssignment_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:4402:3: ({...}? => ( ( ( ( rule__GraphqlSchema__TypesAssignment_1 ) ) ( ( ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1 )* ) ) ) )
                    {
                    // InternalGraphqlidl.g:4402:3: ({...}? => ( ( ( ( rule__GraphqlSchema__TypesAssignment_1 ) ) ( ( ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1 )* ) ) ) )
                    // InternalGraphqlidl.g:4403:4: {...}? => ( ( ( ( rule__GraphqlSchema__TypesAssignment_1 ) ) ( ( ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GraphqlSchema__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalGraphqlidl.g:4403:107: ( ( ( ( rule__GraphqlSchema__TypesAssignment_1 ) ) ( ( ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1 )* ) ) )
                    // InternalGraphqlidl.g:4404:5: ( ( ( rule__GraphqlSchema__TypesAssignment_1 ) ) ( ( ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // InternalGraphqlidl.g:4410:5: ( ( ( rule__GraphqlSchema__TypesAssignment_1 ) ) ( ( ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1 )* ) )
                    // InternalGraphqlidl.g:4411:6: ( ( rule__GraphqlSchema__TypesAssignment_1 ) ) ( ( ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1 )* )
                    {
                    // InternalGraphqlidl.g:4411:6: ( ( rule__GraphqlSchema__TypesAssignment_1 ) )
                    // InternalGraphqlidl.g:4412:7: ( rule__GraphqlSchema__TypesAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlSchemaAccess().getTypesAssignment_1()); 
                    }
                    // InternalGraphqlidl.g:4413:7: ( rule__GraphqlSchema__TypesAssignment_1 )
                    // InternalGraphqlidl.g:4413:8: rule__GraphqlSchema__TypesAssignment_1
                    {
                    pushFollow(FOLLOW_35);
                    rule__GraphqlSchema__TypesAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlSchemaAccess().getTypesAssignment_1()); 
                    }

                    }

                    // InternalGraphqlidl.g:4416:6: ( ( ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1 )* )
                    // InternalGraphqlidl.g:4417:7: ( ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphqlSchemaAccess().getTypesAssignment_1()); 
                    }
                    // InternalGraphqlidl.g:4418:7: ( ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1 )*
                    loop34:
                    do {
                        int alt34=2;
                        alt34 = dfa34.predict(input);
                        switch (alt34) {
                    	case 1 :
                    	    // InternalGraphqlidl.g:4418:8: ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_35);
                    	    rule__GraphqlSchema__TypesAssignment_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphqlSchemaAccess().getTypesAssignment_1()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchema__UnorderedGroup__Impl"


    // $ANTLR start "rule__GraphqlSchema__UnorderedGroup__0"
    // InternalGraphqlidl.g:4432:1: rule__GraphqlSchema__UnorderedGroup__0 : rule__GraphqlSchema__UnorderedGroup__Impl ( rule__GraphqlSchema__UnorderedGroup__1 )? ;
    public final void rule__GraphqlSchema__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4436:1: ( rule__GraphqlSchema__UnorderedGroup__Impl ( rule__GraphqlSchema__UnorderedGroup__1 )? )
            // InternalGraphqlidl.g:4437:2: rule__GraphqlSchema__UnorderedGroup__Impl ( rule__GraphqlSchema__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_36);
            rule__GraphqlSchema__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalGraphqlidl.g:4438:2: ( rule__GraphqlSchema__UnorderedGroup__1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( LA36_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 0) ) {
                alt36=1;
            }
            else if ( ( LA36_0 == 28 || LA36_0 >= 30 && LA36_0 <= 33 || LA36_0 == 36 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 1) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGraphqlidl.g:4438:2: rule__GraphqlSchema__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphqlSchema__UnorderedGroup__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchema__UnorderedGroup__0"


    // $ANTLR start "rule__GraphqlSchema__UnorderedGroup__1"
    // InternalGraphqlidl.g:4444:1: rule__GraphqlSchema__UnorderedGroup__1 : rule__GraphqlSchema__UnorderedGroup__Impl ;
    public final void rule__GraphqlSchema__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4448:1: ( rule__GraphqlSchema__UnorderedGroup__Impl )
            // InternalGraphqlidl.g:4449:2: rule__GraphqlSchema__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphqlSchema__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchema__UnorderedGroup__1"


    // $ANTLR start "rule__GraphqlSchema__SchemaAssignment_0"
    // InternalGraphqlidl.g:4456:1: rule__GraphqlSchema__SchemaAssignment_0 : ( ruleGraphqlSchemaDefinition ) ;
    public final void rule__GraphqlSchema__SchemaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4460:1: ( ( ruleGraphqlSchemaDefinition ) )
            // InternalGraphqlidl.g:4461:2: ( ruleGraphqlSchemaDefinition )
            {
            // InternalGraphqlidl.g:4461:2: ( ruleGraphqlSchemaDefinition )
            // InternalGraphqlidl.g:4462:3: ruleGraphqlSchemaDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaAccess().getSchemaGraphqlSchemaDefinitionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlSchemaDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaAccess().getSchemaGraphqlSchemaDefinitionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchema__SchemaAssignment_0"


    // $ANTLR start "rule__GraphqlSchema__TypesAssignment_1"
    // InternalGraphqlidl.g:4471:1: rule__GraphqlSchema__TypesAssignment_1 : ( ruleGraphqlTypeDefinition ) ;
    public final void rule__GraphqlSchema__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4475:1: ( ( ruleGraphqlTypeDefinition ) )
            // InternalGraphqlidl.g:4476:2: ( ruleGraphqlTypeDefinition )
            {
            // InternalGraphqlidl.g:4476:2: ( ruleGraphqlTypeDefinition )
            // InternalGraphqlidl.g:4477:3: ruleGraphqlTypeDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaAccess().getTypesGraphqlTypeDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlTypeDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaAccess().getTypesGraphqlTypeDefinitionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchema__TypesAssignment_1"


    // $ANTLR start "rule__GraphqlSchemaDefinition__NameAssignment_0"
    // InternalGraphqlidl.g:4486:1: rule__GraphqlSchemaDefinition__NameAssignment_0 : ( ( 'schema' ) ) ;
    public final void rule__GraphqlSchemaDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4490:1: ( ( ( 'schema' ) ) )
            // InternalGraphqlidl.g:4491:2: ( ( 'schema' ) )
            {
            // InternalGraphqlidl.g:4491:2: ( ( 'schema' ) )
            // InternalGraphqlidl.g:4492:3: ( 'schema' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getNameSchemaKeyword_0_0()); 
            }
            // InternalGraphqlidl.g:4493:3: ( 'schema' )
            // InternalGraphqlidl.g:4494:4: 'schema'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getNameSchemaKeyword_0_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getNameSchemaKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getNameSchemaKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__NameAssignment_0"


    // $ANTLR start "rule__GraphqlSchemaDefinition__RootQueryAssignment_2"
    // InternalGraphqlidl.g:4505:1: rule__GraphqlSchemaDefinition__RootQueryAssignment_2 : ( ruleGraphqlRootQuery ) ;
    public final void rule__GraphqlSchemaDefinition__RootQueryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4509:1: ( ( ruleGraphqlRootQuery ) )
            // InternalGraphqlidl.g:4510:2: ( ruleGraphqlRootQuery )
            {
            // InternalGraphqlidl.g:4510:2: ( ruleGraphqlRootQuery )
            // InternalGraphqlidl.g:4511:3: ruleGraphqlRootQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getRootQueryGraphqlRootQueryParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlRootQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getRootQueryGraphqlRootQueryParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__RootQueryAssignment_2"


    // $ANTLR start "rule__GraphqlSchemaDefinition__MutationAssignment_3_2"
    // InternalGraphqlidl.g:4520:1: rule__GraphqlSchemaDefinition__MutationAssignment_3_2 : ( ( RULE_NAME ) ) ;
    public final void rule__GraphqlSchemaDefinition__MutationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4524:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphqlidl.g:4525:2: ( ( RULE_NAME ) )
            {
            // InternalGraphqlidl.g:4525:2: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:4526:3: ( RULE_NAME )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getMutationGraphqlObjectTypeDefinitionCrossReference_3_2_0()); 
            }
            // InternalGraphqlidl.g:4527:3: ( RULE_NAME )
            // InternalGraphqlidl.g:4528:4: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getMutationGraphqlObjectTypeDefinitionNAMETerminalRuleCall_3_2_0_1()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getMutationGraphqlObjectTypeDefinitionNAMETerminalRuleCall_3_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getMutationGraphqlObjectTypeDefinitionCrossReference_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__MutationAssignment_3_2"


    // $ANTLR start "rule__GraphqlSchemaDefinition__SubcriptionAssignment_4_2"
    // InternalGraphqlidl.g:4539:1: rule__GraphqlSchemaDefinition__SubcriptionAssignment_4_2 : ( ( RULE_NAME ) ) ;
    public final void rule__GraphqlSchemaDefinition__SubcriptionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4543:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphqlidl.g:4544:2: ( ( RULE_NAME ) )
            {
            // InternalGraphqlidl.g:4544:2: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:4545:3: ( RULE_NAME )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getSubcriptionGraphqlObjectTypeDefinitionCrossReference_4_2_0()); 
            }
            // InternalGraphqlidl.g:4546:3: ( RULE_NAME )
            // InternalGraphqlidl.g:4547:4: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlSchemaDefinitionAccess().getSubcriptionGraphqlObjectTypeDefinitionNAMETerminalRuleCall_4_2_0_1()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getSubcriptionGraphqlObjectTypeDefinitionNAMETerminalRuleCall_4_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlSchemaDefinitionAccess().getSubcriptionGraphqlObjectTypeDefinitionCrossReference_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlSchemaDefinition__SubcriptionAssignment_4_2"


    // $ANTLR start "rule__GraphqlRootQuery__NameAssignment_0"
    // InternalGraphqlidl.g:4558:1: rule__GraphqlRootQuery__NameAssignment_0 : ( ( 'query' ) ) ;
    public final void rule__GraphqlRootQuery__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4562:1: ( ( ( 'query' ) ) )
            // InternalGraphqlidl.g:4563:2: ( ( 'query' ) )
            {
            // InternalGraphqlidl.g:4563:2: ( ( 'query' ) )
            // InternalGraphqlidl.g:4564:3: ( 'query' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlRootQueryAccess().getNameQueryKeyword_0_0()); 
            }
            // InternalGraphqlidl.g:4565:3: ( 'query' )
            // InternalGraphqlidl.g:4566:4: 'query'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlRootQueryAccess().getNameQueryKeyword_0_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlRootQueryAccess().getNameQueryKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlRootQueryAccess().getNameQueryKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlRootQuery__NameAssignment_0"


    // $ANTLR start "rule__GraphqlRootQuery__QueryAssignment_2"
    // InternalGraphqlidl.g:4577:1: rule__GraphqlRootQuery__QueryAssignment_2 : ( ( RULE_NAME ) ) ;
    public final void rule__GraphqlRootQuery__QueryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4581:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphqlidl.g:4582:2: ( ( RULE_NAME ) )
            {
            // InternalGraphqlidl.g:4582:2: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:4583:3: ( RULE_NAME )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlRootQueryAccess().getQueryGraphqlObjectTypeDefinitionCrossReference_2_0()); 
            }
            // InternalGraphqlidl.g:4584:3: ( RULE_NAME )
            // InternalGraphqlidl.g:4585:4: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlRootQueryAccess().getQueryGraphqlObjectTypeDefinitionNAMETerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlRootQueryAccess().getQueryGraphqlObjectTypeDefinitionNAMETerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlRootQueryAccess().getQueryGraphqlObjectTypeDefinitionCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlRootQuery__QueryAssignment_2"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__NameAssignment_1"
    // InternalGraphqlidl.g:4596:1: rule__GraphqlObjectTypeDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__GraphqlObjectTypeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4600:1: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:4601:2: ( RULE_NAME )
            {
            // InternalGraphqlidl.g:4601:2: ( RULE_NAME )
            // InternalGraphqlidl.g:4602:3: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__NameAssignment_1"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1"
    // InternalGraphqlidl.g:4611:1: rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1 : ( ( RULE_NAME ) ) ;
    public final void rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4615:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphqlidl.g:4616:2: ( ( RULE_NAME ) )
            {
            // InternalGraphqlidl.g:4616:2: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:4617:3: ( RULE_NAME )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getInterfacesGraphqlInterfaceTypeDefinitionCrossReference_2_1_0()); 
            }
            // InternalGraphqlidl.g:4618:3: ( RULE_NAME )
            // InternalGraphqlidl.g:4619:4: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getInterfacesGraphqlInterfaceTypeDefinitionNAMETerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getInterfacesGraphqlInterfaceTypeDefinitionNAMETerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getInterfacesGraphqlInterfaceTypeDefinitionCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__InterfacesAssignment_2_1"


    // $ANTLR start "rule__GraphqlObjectTypeDefinition__FieldsAssignment_4"
    // InternalGraphqlidl.g:4630:1: rule__GraphqlObjectTypeDefinition__FieldsAssignment_4 : ( ruleGraphqlField ) ;
    public final void rule__GraphqlObjectTypeDefinition__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4634:1: ( ( ruleGraphqlField ) )
            // InternalGraphqlidl.g:4635:2: ( ruleGraphqlField )
            {
            // InternalGraphqlidl.g:4635:2: ( ruleGraphqlField )
            // InternalGraphqlidl.g:4636:3: ruleGraphqlField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getFieldsGraphqlFieldParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getFieldsGraphqlFieldParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlObjectTypeDefinition__FieldsAssignment_4"


    // $ANTLR start "rule__GraphqlInterfaceTypeDefinition__NameAssignment_1"
    // InternalGraphqlidl.g:4645:1: rule__GraphqlInterfaceTypeDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__GraphqlInterfaceTypeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4649:1: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:4650:2: ( RULE_NAME )
            {
            // InternalGraphqlidl.g:4650:2: ( RULE_NAME )
            // InternalGraphqlidl.g:4651:3: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInterfaceTypeDefinition__NameAssignment_1"


    // $ANTLR start "rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3"
    // InternalGraphqlidl.g:4660:1: rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3 : ( ruleGraphqlField ) ;
    public final void rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4664:1: ( ( ruleGraphqlField ) )
            // InternalGraphqlidl.g:4665:2: ( ruleGraphqlField )
            {
            // InternalGraphqlidl.g:4665:2: ( ruleGraphqlField )
            // InternalGraphqlidl.g:4666:3: ruleGraphqlField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getFieldsGraphqlFieldParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getFieldsGraphqlFieldParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInterfaceTypeDefinition__FieldsAssignment_3"


    // $ANTLR start "rule__GraphqlScalarTypeDefinition__NameAssignment_1"
    // InternalGraphqlidl.g:4675:1: rule__GraphqlScalarTypeDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__GraphqlScalarTypeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4679:1: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:4680:2: ( RULE_NAME )
            {
            // InternalGraphqlidl.g:4680:2: ( RULE_NAME )
            // InternalGraphqlidl.g:4681:3: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlScalarTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlScalarTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlScalarTypeDefinition__NameAssignment_1"


    // $ANTLR start "rule__GraphqlEmunTypeDefinition__NameAssignment_1"
    // InternalGraphqlidl.g:4690:1: rule__GraphqlEmunTypeDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__GraphqlEmunTypeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4694:1: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:4695:2: ( RULE_NAME )
            {
            // InternalGraphqlidl.g:4695:2: ( RULE_NAME )
            // InternalGraphqlidl.g:4696:3: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlEmunTypeDefinition__NameAssignment_1"


    // $ANTLR start "rule__GraphqlEmunTypeDefinition__ValuesAssignment_3"
    // InternalGraphqlidl.g:4705:1: rule__GraphqlEmunTypeDefinition__ValuesAssignment_3 : ( ruleEnumValue ) ;
    public final void rule__GraphqlEmunTypeDefinition__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4709:1: ( ( ruleEnumValue ) )
            // InternalGraphqlidl.g:4710:2: ( ruleEnumValue )
            {
            // InternalGraphqlidl.g:4710:2: ( ruleEnumValue )
            // InternalGraphqlidl.g:4711:3: ruleEnumValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getValuesEnumValueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEnumValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getValuesEnumValueParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlEmunTypeDefinition__ValuesAssignment_3"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__NameAssignment_1"
    // InternalGraphqlidl.g:4720:1: rule__GraphqlUnionTypeDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__GraphqlUnionTypeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4724:1: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:4725:2: ( RULE_NAME )
            {
            // InternalGraphqlidl.g:4725:2: ( RULE_NAME )
            // InternalGraphqlidl.g:4726:3: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__NameAssignment_1"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__MembersAssignment_3"
    // InternalGraphqlidl.g:4735:1: rule__GraphqlUnionTypeDefinition__MembersAssignment_3 : ( ( RULE_NAME ) ) ;
    public final void rule__GraphqlUnionTypeDefinition__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4739:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphqlidl.g:4740:2: ( ( RULE_NAME ) )
            {
            // InternalGraphqlidl.g:4740:2: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:4741:3: ( RULE_NAME )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getMembersGraphqlObjectTypeDefinitionCrossReference_3_0()); 
            }
            // InternalGraphqlidl.g:4742:3: ( RULE_NAME )
            // InternalGraphqlidl.g:4743:4: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getMembersGraphqlObjectTypeDefinitionNAMETerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getMembersGraphqlObjectTypeDefinitionNAMETerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getMembersGraphqlObjectTypeDefinitionCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__MembersAssignment_3"


    // $ANTLR start "rule__GraphqlUnionTypeDefinition__MembersAssignment_4_1"
    // InternalGraphqlidl.g:4754:1: rule__GraphqlUnionTypeDefinition__MembersAssignment_4_1 : ( ( RULE_NAME ) ) ;
    public final void rule__GraphqlUnionTypeDefinition__MembersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4758:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphqlidl.g:4759:2: ( ( RULE_NAME ) )
            {
            // InternalGraphqlidl.g:4759:2: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:4760:3: ( RULE_NAME )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getMembersGraphqlObjectTypeDefinitionCrossReference_4_1_0()); 
            }
            // InternalGraphqlidl.g:4761:3: ( RULE_NAME )
            // InternalGraphqlidl.g:4762:4: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getMembersGraphqlObjectTypeDefinitionNAMETerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getMembersGraphqlObjectTypeDefinitionNAMETerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlUnionTypeDefinitionAccess().getMembersGraphqlObjectTypeDefinitionCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlUnionTypeDefinition__MembersAssignment_4_1"


    // $ANTLR start "rule__GraphqlInputTypeDefinition__NameAssignment_1"
    // InternalGraphqlidl.g:4773:1: rule__GraphqlInputTypeDefinition__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__GraphqlInputTypeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4777:1: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:4778:2: ( RULE_NAME )
            {
            // InternalGraphqlidl.g:4778:2: ( RULE_NAME )
            // InternalGraphqlidl.g:4779:3: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputTypeDefinition__NameAssignment_1"


    // $ANTLR start "rule__GraphqlInputTypeDefinition__FieldsAssignment_3"
    // InternalGraphqlidl.g:4788:1: rule__GraphqlInputTypeDefinition__FieldsAssignment_3 : ( ruleGraphqlInputField ) ;
    public final void rule__GraphqlInputTypeDefinition__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4792:1: ( ( ruleGraphqlInputField ) )
            // InternalGraphqlidl.g:4793:2: ( ruleGraphqlInputField )
            {
            // InternalGraphqlidl.g:4793:2: ( ruleGraphqlInputField )
            // InternalGraphqlidl.g:4794:3: ruleGraphqlInputField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeDefinitionAccess().getFieldsGraphqlInputFieldParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlInputField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeDefinitionAccess().getFieldsGraphqlInputFieldParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputTypeDefinition__FieldsAssignment_3"


    // $ANTLR start "rule__GraphqlInputField__NameAssignment_0"
    // InternalGraphqlidl.g:4803:1: rule__GraphqlInputField__NameAssignment_0 : ( RULE_NAME ) ;
    public final void rule__GraphqlInputField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4807:1: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:4808:2: ( RULE_NAME )
            {
            // InternalGraphqlidl.g:4808:2: ( RULE_NAME )
            // InternalGraphqlidl.g:4809:3: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputFieldAccess().getNameNAMETerminalRuleCall_0_0()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputFieldAccess().getNameNAMETerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputField__NameAssignment_0"


    // $ANTLR start "rule__GraphqlInputField__TypeAssignment_2"
    // InternalGraphqlidl.g:4818:1: rule__GraphqlInputField__TypeAssignment_2 : ( ruleGraphqlInputType ) ;
    public final void rule__GraphqlInputField__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4822:1: ( ( ruleGraphqlInputType ) )
            // InternalGraphqlidl.g:4823:2: ( ruleGraphqlInputType )
            {
            // InternalGraphqlidl.g:4823:2: ( ruleGraphqlInputType )
            // InternalGraphqlidl.g:4824:3: ruleGraphqlInputType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputFieldAccess().getTypeGraphqlInputTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlInputType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputFieldAccess().getTypeGraphqlInputTypeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputField__TypeAssignment_2"


    // $ANTLR start "rule__GraphqlField__NameAssignment_0"
    // InternalGraphqlidl.g:4833:1: rule__GraphqlField__NameAssignment_0 : ( RULE_NAME ) ;
    public final void rule__GraphqlField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4837:1: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:4838:2: ( RULE_NAME )
            {
            // InternalGraphqlidl.g:4838:2: ( RULE_NAME )
            // InternalGraphqlidl.g:4839:3: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlFieldAccess().getNameNAMETerminalRuleCall_0_0()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlFieldAccess().getNameNAMETerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__NameAssignment_0"


    // $ANTLR start "rule__GraphqlField__ArgsAssignment_1_1"
    // InternalGraphqlidl.g:4848:1: rule__GraphqlField__ArgsAssignment_1_1 : ( ruleArgument ) ;
    public final void rule__GraphqlField__ArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4852:1: ( ( ruleArgument ) )
            // InternalGraphqlidl.g:4853:2: ( ruleArgument )
            {
            // InternalGraphqlidl.g:4853:2: ( ruleArgument )
            // InternalGraphqlidl.g:4854:3: ruleArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlFieldAccess().getArgsArgumentParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlFieldAccess().getArgsArgumentParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__ArgsAssignment_1_1"


    // $ANTLR start "rule__GraphqlField__TypeAssignment_3"
    // InternalGraphqlidl.g:4863:1: rule__GraphqlField__TypeAssignment_3 : ( ruleGraphqlType ) ;
    public final void rule__GraphqlField__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4867:1: ( ( ruleGraphqlType ) )
            // InternalGraphqlidl.g:4868:2: ( ruleGraphqlType )
            {
            // InternalGraphqlidl.g:4868:2: ( ruleGraphqlType )
            // InternalGraphqlidl.g:4869:3: ruleGraphqlType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlFieldAccess().getTypeGraphqlTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlFieldAccess().getTypeGraphqlTypeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlField__TypeAssignment_3"


    // $ANTLR start "rule__GraphqlType__DtypeAssignment_0_0"
    // InternalGraphqlidl.g:4878:1: rule__GraphqlType__DtypeAssignment_0_0 : ( ( RULE_NAME ) ) ;
    public final void rule__GraphqlType__DtypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4882:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphqlidl.g:4883:2: ( ( RULE_NAME ) )
            {
            // InternalGraphqlidl.g:4883:2: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:4884:3: ( RULE_NAME )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getDtypeGraphqlTypeDefinitionCrossReference_0_0_0()); 
            }
            // InternalGraphqlidl.g:4885:3: ( RULE_NAME )
            // InternalGraphqlidl.g:4886:4: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getDtypeGraphqlTypeDefinitionNAMETerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getDtypeGraphqlTypeDefinitionNAMETerminalRuleCall_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getDtypeGraphqlTypeDefinitionCrossReference_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__DtypeAssignment_0_0"


    // $ANTLR start "rule__GraphqlType__NonNullAssignment_0_1"
    // InternalGraphqlidl.g:4897:1: rule__GraphqlType__NonNullAssignment_0_1 : ( ( '!' ) ) ;
    public final void rule__GraphqlType__NonNullAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4901:1: ( ( ( '!' ) ) )
            // InternalGraphqlidl.g:4902:2: ( ( '!' ) )
            {
            // InternalGraphqlidl.g:4902:2: ( ( '!' ) )
            // InternalGraphqlidl.g:4903:3: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getNonNullExclamationMarkKeyword_0_1_0()); 
            }
            // InternalGraphqlidl.g:4904:3: ( '!' )
            // InternalGraphqlidl.g:4905:4: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getNonNullExclamationMarkKeyword_0_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getNonNullExclamationMarkKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getNonNullExclamationMarkKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__NonNullAssignment_0_1"


    // $ANTLR start "rule__GraphqlType__NtypeAssignment_1_0"
    // InternalGraphqlidl.g:4916:1: rule__GraphqlType__NtypeAssignment_1_0 : ( ruleGraphqlNamedType ) ;
    public final void rule__GraphqlType__NtypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4920:1: ( ( ruleGraphqlNamedType ) )
            // InternalGraphqlidl.g:4921:2: ( ruleGraphqlNamedType )
            {
            // InternalGraphqlidl.g:4921:2: ( ruleGraphqlNamedType )
            // InternalGraphqlidl.g:4922:3: ruleGraphqlNamedType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getNtypeGraphqlNamedTypeParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlNamedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getNtypeGraphqlNamedTypeParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__NtypeAssignment_1_0"


    // $ANTLR start "rule__GraphqlType__NonNullAssignment_1_1"
    // InternalGraphqlidl.g:4931:1: rule__GraphqlType__NonNullAssignment_1_1 : ( ( '!' ) ) ;
    public final void rule__GraphqlType__NonNullAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4935:1: ( ( ( '!' ) ) )
            // InternalGraphqlidl.g:4936:2: ( ( '!' ) )
            {
            // InternalGraphqlidl.g:4936:2: ( ( '!' ) )
            // InternalGraphqlidl.g:4937:3: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getNonNullExclamationMarkKeyword_1_1_0()); 
            }
            // InternalGraphqlidl.g:4938:3: ( '!' )
            // InternalGraphqlidl.g:4939:4: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getNonNullExclamationMarkKeyword_1_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getNonNullExclamationMarkKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getNonNullExclamationMarkKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__NonNullAssignment_1_1"


    // $ANTLR start "rule__GraphqlType__LtypeAssignment_2_0"
    // InternalGraphqlidl.g:4950:1: rule__GraphqlType__LtypeAssignment_2_0 : ( ruleGraphqlListType ) ;
    public final void rule__GraphqlType__LtypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4954:1: ( ( ruleGraphqlListType ) )
            // InternalGraphqlidl.g:4955:2: ( ruleGraphqlListType )
            {
            // InternalGraphqlidl.g:4955:2: ( ruleGraphqlListType )
            // InternalGraphqlidl.g:4956:3: ruleGraphqlListType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getLtypeGraphqlListTypeParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlListType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getLtypeGraphqlListTypeParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__LtypeAssignment_2_0"


    // $ANTLR start "rule__GraphqlType__NonNullAssignment_2_1"
    // InternalGraphqlidl.g:4965:1: rule__GraphqlType__NonNullAssignment_2_1 : ( ( '!' ) ) ;
    public final void rule__GraphqlType__NonNullAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4969:1: ( ( ( '!' ) ) )
            // InternalGraphqlidl.g:4970:2: ( ( '!' ) )
            {
            // InternalGraphqlidl.g:4970:2: ( ( '!' ) )
            // InternalGraphqlidl.g:4971:3: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getNonNullExclamationMarkKeyword_2_1_0()); 
            }
            // InternalGraphqlidl.g:4972:3: ( '!' )
            // InternalGraphqlidl.g:4973:4: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlTypeAccess().getNonNullExclamationMarkKeyword_2_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getNonNullExclamationMarkKeyword_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlTypeAccess().getNonNullExclamationMarkKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlType__NonNullAssignment_2_1"


    // $ANTLR start "rule__GraphqlNamedType__NameAssignment"
    // InternalGraphqlidl.g:4984:1: rule__GraphqlNamedType__NameAssignment : ( RULE_SCALAR ) ;
    public final void rule__GraphqlNamedType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:4988:1: ( ( RULE_SCALAR ) )
            // InternalGraphqlidl.g:4989:2: ( RULE_SCALAR )
            {
            // InternalGraphqlidl.g:4989:2: ( RULE_SCALAR )
            // InternalGraphqlidl.g:4990:3: RULE_SCALAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlNamedTypeAccess().getNameSCALARTerminalRuleCall_0()); 
            }
            match(input,RULE_SCALAR,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlNamedTypeAccess().getNameSCALARTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlNamedType__NameAssignment"


    // $ANTLR start "rule__GraphqlInputType__DtypeAssignment_0_0"
    // InternalGraphqlidl.g:4999:1: rule__GraphqlInputType__DtypeAssignment_0_0 : ( ( RULE_NAME ) ) ;
    public final void rule__GraphqlInputType__DtypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5003:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphqlidl.g:5004:2: ( ( RULE_NAME ) )
            {
            // InternalGraphqlidl.g:5004:2: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:5005:3: ( RULE_NAME )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getDtypeGraphqlInputTypeDefinitionCrossReference_0_0_0()); 
            }
            // InternalGraphqlidl.g:5006:3: ( RULE_NAME )
            // InternalGraphqlidl.g:5007:4: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getDtypeGraphqlInputTypeDefinitionNAMETerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getDtypeGraphqlInputTypeDefinitionNAMETerminalRuleCall_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getDtypeGraphqlInputTypeDefinitionCrossReference_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__DtypeAssignment_0_0"


    // $ANTLR start "rule__GraphqlInputType__NonNullAssignment_0_1"
    // InternalGraphqlidl.g:5018:1: rule__GraphqlInputType__NonNullAssignment_0_1 : ( ( '!' ) ) ;
    public final void rule__GraphqlInputType__NonNullAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5022:1: ( ( ( '!' ) ) )
            // InternalGraphqlidl.g:5023:2: ( ( '!' ) )
            {
            // InternalGraphqlidl.g:5023:2: ( ( '!' ) )
            // InternalGraphqlidl.g:5024:3: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getNonNullExclamationMarkKeyword_0_1_0()); 
            }
            // InternalGraphqlidl.g:5025:3: ( '!' )
            // InternalGraphqlidl.g:5026:4: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getNonNullExclamationMarkKeyword_0_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getNonNullExclamationMarkKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getNonNullExclamationMarkKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__NonNullAssignment_0_1"


    // $ANTLR start "rule__GraphqlInputType__NtypeAssignment_1_0"
    // InternalGraphqlidl.g:5037:1: rule__GraphqlInputType__NtypeAssignment_1_0 : ( ruleGraphqlNamedType ) ;
    public final void rule__GraphqlInputType__NtypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5041:1: ( ( ruleGraphqlNamedType ) )
            // InternalGraphqlidl.g:5042:2: ( ruleGraphqlNamedType )
            {
            // InternalGraphqlidl.g:5042:2: ( ruleGraphqlNamedType )
            // InternalGraphqlidl.g:5043:3: ruleGraphqlNamedType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getNtypeGraphqlNamedTypeParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlNamedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getNtypeGraphqlNamedTypeParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__NtypeAssignment_1_0"


    // $ANTLR start "rule__GraphqlInputType__NonNullAssignment_1_1"
    // InternalGraphqlidl.g:5052:1: rule__GraphqlInputType__NonNullAssignment_1_1 : ( ( '!' ) ) ;
    public final void rule__GraphqlInputType__NonNullAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5056:1: ( ( ( '!' ) ) )
            // InternalGraphqlidl.g:5057:2: ( ( '!' ) )
            {
            // InternalGraphqlidl.g:5057:2: ( ( '!' ) )
            // InternalGraphqlidl.g:5058:3: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getNonNullExclamationMarkKeyword_1_1_0()); 
            }
            // InternalGraphqlidl.g:5059:3: ( '!' )
            // InternalGraphqlidl.g:5060:4: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getNonNullExclamationMarkKeyword_1_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getNonNullExclamationMarkKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getNonNullExclamationMarkKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__NonNullAssignment_1_1"


    // $ANTLR start "rule__GraphqlInputType__LtypeAssignment_2_0"
    // InternalGraphqlidl.g:5071:1: rule__GraphqlInputType__LtypeAssignment_2_0 : ( ruleGraphqlListInputType ) ;
    public final void rule__GraphqlInputType__LtypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5075:1: ( ( ruleGraphqlListInputType ) )
            // InternalGraphqlidl.g:5076:2: ( ruleGraphqlListInputType )
            {
            // InternalGraphqlidl.g:5076:2: ( ruleGraphqlListInputType )
            // InternalGraphqlidl.g:5077:3: ruleGraphqlListInputType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getLtypeGraphqlListInputTypeParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlListInputType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getLtypeGraphqlListInputTypeParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__LtypeAssignment_2_0"


    // $ANTLR start "rule__GraphqlInputType__NonNullAssignment_2_1"
    // InternalGraphqlidl.g:5086:1: rule__GraphqlInputType__NonNullAssignment_2_1 : ( ( '!' ) ) ;
    public final void rule__GraphqlInputType__NonNullAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5090:1: ( ( ( '!' ) ) )
            // InternalGraphqlidl.g:5091:2: ( ( '!' ) )
            {
            // InternalGraphqlidl.g:5091:2: ( ( '!' ) )
            // InternalGraphqlidl.g:5092:3: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getNonNullExclamationMarkKeyword_2_1_0()); 
            }
            // InternalGraphqlidl.g:5093:3: ( '!' )
            // InternalGraphqlidl.g:5094:4: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlInputTypeAccess().getNonNullExclamationMarkKeyword_2_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getNonNullExclamationMarkKeyword_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlInputTypeAccess().getNonNullExclamationMarkKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlInputType__NonNullAssignment_2_1"


    // $ANTLR start "rule__Argument__NameAssignment_0"
    // InternalGraphqlidl.g:5105:1: rule__Argument__NameAssignment_0 : ( RULE_NAME ) ;
    public final void rule__Argument__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5109:1: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:5110:2: ( RULE_NAME )
            {
            // InternalGraphqlidl.g:5110:2: ( RULE_NAME )
            // InternalGraphqlidl.g:5111:3: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getNameNAMETerminalRuleCall_0_0()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getNameNAMETerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__NameAssignment_0"


    // $ANTLR start "rule__Argument__TypeAssignment_2"
    // InternalGraphqlidl.g:5120:1: rule__Argument__TypeAssignment_2 : ( ruleGraphqlType ) ;
    public final void rule__Argument__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5124:1: ( ( ruleGraphqlType ) )
            // InternalGraphqlidl.g:5125:2: ( ruleGraphqlType )
            {
            // InternalGraphqlidl.g:5125:2: ( ruleGraphqlType )
            // InternalGraphqlidl.g:5126:3: ruleGraphqlType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getTypeGraphqlTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getTypeGraphqlTypeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__TypeAssignment_2"


    // $ANTLR start "rule__Argument__DefValueAssignment_3_1"
    // InternalGraphqlidl.g:5135:1: rule__Argument__DefValueAssignment_3_1 : ( ruleGraphqlValue ) ;
    public final void rule__Argument__DefValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5139:1: ( ( ruleGraphqlValue ) )
            // InternalGraphqlidl.g:5140:2: ( ruleGraphqlValue )
            {
            // InternalGraphqlidl.g:5140:2: ( ruleGraphqlValue )
            // InternalGraphqlidl.g:5141:3: ruleGraphqlValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentAccess().getDefValueGraphqlValueParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentAccess().getDefValueGraphqlValueParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__DefValueAssignment_3_1"


    // $ANTLR start "rule__GraphqlValue__SvAssignment_0"
    // InternalGraphqlidl.g:5150:1: rule__GraphqlValue__SvAssignment_0 : ( ruleSingleValue ) ;
    public final void rule__GraphqlValue__SvAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5154:1: ( ( ruleSingleValue ) )
            // InternalGraphqlidl.g:5155:2: ( ruleSingleValue )
            {
            // InternalGraphqlidl.g:5155:2: ( ruleSingleValue )
            // InternalGraphqlidl.g:5156:3: ruleSingleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlValueAccess().getSvSingleValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSingleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlValueAccess().getSvSingleValueParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlValue__SvAssignment_0"


    // $ANTLR start "rule__GraphqlValue__EvAssignment_1"
    // InternalGraphqlidl.g:5165:1: rule__GraphqlValue__EvAssignment_1 : ( ( RULE_NAME ) ) ;
    public final void rule__GraphqlValue__EvAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5169:1: ( ( ( RULE_NAME ) ) )
            // InternalGraphqlidl.g:5170:2: ( ( RULE_NAME ) )
            {
            // InternalGraphqlidl.g:5170:2: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:5171:3: ( RULE_NAME )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlValueAccess().getEvEnumValueCrossReference_1_0()); 
            }
            // InternalGraphqlidl.g:5172:3: ( RULE_NAME )
            // InternalGraphqlidl.g:5173:4: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlValueAccess().getEvEnumValueNAMETerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlValueAccess().getEvEnumValueNAMETerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlValueAccess().getEvEnumValueCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlValue__EvAssignment_1"


    // $ANTLR start "rule__GraphqlValue__CvAssignment_2"
    // InternalGraphqlidl.g:5184:1: rule__GraphqlValue__CvAssignment_2 : ( ruleComplexValue ) ;
    public final void rule__GraphqlValue__CvAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5188:1: ( ( ruleComplexValue ) )
            // InternalGraphqlidl.g:5189:2: ( ruleComplexValue )
            {
            // InternalGraphqlidl.g:5189:2: ( ruleComplexValue )
            // InternalGraphqlidl.g:5190:3: ruleComplexValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphqlValueAccess().getCvComplexValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComplexValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphqlValueAccess().getCvComplexValueParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphqlValue__CvAssignment_2"


    // $ANTLR start "rule__SingleValue__ValueAssignment_0"
    // InternalGraphqlidl.g:5199:1: rule__SingleValue__ValueAssignment_0 : ( ruleIntValue ) ;
    public final void rule__SingleValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5203:1: ( ( ruleIntValue ) )
            // InternalGraphqlidl.g:5204:2: ( ruleIntValue )
            {
            // InternalGraphqlidl.g:5204:2: ( ruleIntValue )
            // InternalGraphqlidl.g:5205:3: ruleIntValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleValueAccess().getValueIntValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleValueAccess().getValueIntValueParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_0"


    // $ANTLR start "rule__SingleValue__ValueAssignment_1"
    // InternalGraphqlidl.g:5214:1: rule__SingleValue__ValueAssignment_1 : ( ruleFloatValue ) ;
    public final void rule__SingleValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5218:1: ( ( ruleFloatValue ) )
            // InternalGraphqlidl.g:5219:2: ( ruleFloatValue )
            {
            // InternalGraphqlidl.g:5219:2: ( ruleFloatValue )
            // InternalGraphqlidl.g:5220:3: ruleFloatValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleValueAccess().getValueFloatValueParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFloatValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleValueAccess().getValueFloatValueParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_1"


    // $ANTLR start "rule__SingleValue__ValueAssignment_2"
    // InternalGraphqlidl.g:5229:1: rule__SingleValue__ValueAssignment_2 : ( ruleStringValue ) ;
    public final void rule__SingleValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5233:1: ( ( ruleStringValue ) )
            // InternalGraphqlidl.g:5234:2: ( ruleStringValue )
            {
            // InternalGraphqlidl.g:5234:2: ( ruleStringValue )
            // InternalGraphqlidl.g:5235:3: ruleStringValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleValueAccess().getValueStringValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleValueAccess().getValueStringValueParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_2"


    // $ANTLR start "rule__SingleValue__ValueAssignment_3"
    // InternalGraphqlidl.g:5244:1: rule__SingleValue__ValueAssignment_3 : ( RULE_BOOLEANVALUE ) ;
    public final void rule__SingleValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5248:1: ( ( RULE_BOOLEANVALUE ) )
            // InternalGraphqlidl.g:5249:2: ( RULE_BOOLEANVALUE )
            {
            // InternalGraphqlidl.g:5249:2: ( RULE_BOOLEANVALUE )
            // InternalGraphqlidl.g:5250:3: RULE_BOOLEANVALUE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleValueAccess().getValueBOOLEANVALUETerminalRuleCall_3_0()); 
            }
            match(input,RULE_BOOLEANVALUE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleValueAccess().getValueBOOLEANVALUETerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_3"


    // $ANTLR start "rule__SingleValue__ValueAssignment_4"
    // InternalGraphqlidl.g:5259:1: rule__SingleValue__ValueAssignment_4 : ( RULE_NULLVALUE ) ;
    public final void rule__SingleValue__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5263:1: ( ( RULE_NULLVALUE ) )
            // InternalGraphqlidl.g:5264:2: ( RULE_NULLVALUE )
            {
            // InternalGraphqlidl.g:5264:2: ( RULE_NULLVALUE )
            // InternalGraphqlidl.g:5265:3: RULE_NULLVALUE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleValueAccess().getValueNULLVALUETerminalRuleCall_4_0()); 
            }
            match(input,RULE_NULLVALUE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleValueAccess().getValueNULLVALUETerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_4"


    // $ANTLR start "rule__ComplexValue__ValueAssignment_0"
    // InternalGraphqlidl.g:5274:1: rule__ComplexValue__ValueAssignment_0 : ( ruleListValue ) ;
    public final void rule__ComplexValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5278:1: ( ( ruleListValue ) )
            // InternalGraphqlidl.g:5279:2: ( ruleListValue )
            {
            // InternalGraphqlidl.g:5279:2: ( ruleListValue )
            // InternalGraphqlidl.g:5280:3: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexValueAccess().getValueListValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexValueAccess().getValueListValueParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexValue__ValueAssignment_0"


    // $ANTLR start "rule__ComplexValue__ValueAssignment_1"
    // InternalGraphqlidl.g:5289:1: rule__ComplexValue__ValueAssignment_1 : ( ruleObjectValue ) ;
    public final void rule__ComplexValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5293:1: ( ( ruleObjectValue ) )
            // InternalGraphqlidl.g:5294:2: ( ruleObjectValue )
            {
            // InternalGraphqlidl.g:5294:2: ( ruleObjectValue )
            // InternalGraphqlidl.g:5295:3: ruleObjectValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexValueAccess().getValueObjectValueParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObjectValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexValueAccess().getValueObjectValueParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexValue__ValueAssignment_1"


    // $ANTLR start "rule__EnumValue__NameAssignment_1"
    // InternalGraphqlidl.g:5304:1: rule__EnumValue__NameAssignment_1 : ( RULE_ENUM_VALUE ) ;
    public final void rule__EnumValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5308:1: ( ( RULE_ENUM_VALUE ) )
            // InternalGraphqlidl.g:5309:2: ( RULE_ENUM_VALUE )
            {
            // InternalGraphqlidl.g:5309:2: ( RULE_ENUM_VALUE )
            // InternalGraphqlidl.g:5310:3: RULE_ENUM_VALUE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumValueAccess().getNameENUM_VALUETerminalRuleCall_1_0()); 
            }
            match(input,RULE_ENUM_VALUE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumValueAccess().getNameENUM_VALUETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__NameAssignment_1"


    // $ANTLR start "rule__ListValue__ValuesAssignment_2"
    // InternalGraphqlidl.g:5319:1: rule__ListValue__ValuesAssignment_2 : ( ruleGraphqlValue ) ;
    public final void rule__ListValue__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5323:1: ( ( ruleGraphqlValue ) )
            // InternalGraphqlidl.g:5324:2: ( ruleGraphqlValue )
            {
            // InternalGraphqlidl.g:5324:2: ( ruleGraphqlValue )
            // InternalGraphqlidl.g:5325:3: ruleGraphqlValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getValuesGraphqlValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListValueAccess().getValuesGraphqlValueParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__ValuesAssignment_2"


    // $ANTLR start "rule__ObjectValue__FieldsAssignment_2"
    // InternalGraphqlidl.g:5334:1: rule__ObjectValue__FieldsAssignment_2 : ( ruleObjectField ) ;
    public final void rule__ObjectValue__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5338:1: ( ( ruleObjectField ) )
            // InternalGraphqlidl.g:5339:2: ( ruleObjectField )
            {
            // InternalGraphqlidl.g:5339:2: ( ruleObjectField )
            // InternalGraphqlidl.g:5340:3: ruleObjectField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getFieldsObjectFieldParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObjectField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getFieldsObjectFieldParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__FieldsAssignment_2"


    // $ANTLR start "rule__ObjectField__NameAssignment_0"
    // InternalGraphqlidl.g:5349:1: rule__ObjectField__NameAssignment_0 : ( RULE_NAME ) ;
    public final void rule__ObjectField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5353:1: ( ( RULE_NAME ) )
            // InternalGraphqlidl.g:5354:2: ( RULE_NAME )
            {
            // InternalGraphqlidl.g:5354:2: ( RULE_NAME )
            // InternalGraphqlidl.g:5355:3: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectFieldAccess().getNameNAMETerminalRuleCall_0_0()); 
            }
            match(input,RULE_NAME,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectFieldAccess().getNameNAMETerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__NameAssignment_0"


    // $ANTLR start "rule__ObjectField__ValueAssignment_2"
    // InternalGraphqlidl.g:5364:1: rule__ObjectField__ValueAssignment_2 : ( ruleGraphqlValue ) ;
    public final void rule__ObjectField__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphqlidl.g:5368:1: ( ( ruleGraphqlValue ) )
            // InternalGraphqlidl.g:5369:2: ( ruleGraphqlValue )
            {
            // InternalGraphqlidl.g:5369:2: ( ruleGraphqlValue )
            // InternalGraphqlidl.g:5370:3: ruleGraphqlValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectFieldAccess().getValueGraphqlValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGraphqlValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectFieldAccess().getValueGraphqlValueParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectField__ValueAssignment_2"

    // $ANTLR start synpred1_InternalGraphqlidl
    public final void synpred1_InternalGraphqlidl_fragment() throws RecognitionException {   
        // InternalGraphqlidl.g:4418:8: ( rule__GraphqlSchema__TypesAssignment_1 )
        // InternalGraphqlidl.g:4418:9: rule__GraphqlSchema__TypesAssignment_1
        {
        pushFollow(FOLLOW_2);
        rule__GraphqlSchema__TypesAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalGraphqlidl

    // Delegated rules

    public final boolean synpred1_InternalGraphqlidl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGraphqlidl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\10\6\uffff\1\10";
    static final String dfa_3s = "\3\4\1\5\5\uffff\1\4";
    static final String dfa_4s = "\1\53\1\51\1\53\1\5\5\uffff\1\53";
    static final String dfa_5s = "\4\uffff\1\3\1\4\1\5\1\2\1\1\1\uffff";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\4\uffff\1\5\1\6\10\uffff\1\1\25\uffff\1\2\1\uffff\1\4",
            "\1\3\44\uffff\1\2",
            "\1\10\2\uffff\1\10\1\uffff\2\10\10\uffff\1\10\2\7\1\uffff\2\10\15\uffff\4\10\1\7\1\10",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\10\2\uffff\1\10\1\uffff\2\10\10\uffff\1\10\2\7\1\uffff\2\10\15\uffff\4\10\1\7\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1028:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__ValueAssignment_0 ) ) | ( ( rule__SingleValue__ValueAssignment_1 ) ) | ( ( rule__SingleValue__ValueAssignment_2 ) ) | ( ( rule__SingleValue__ValueAssignment_3 ) ) | ( ( rule__SingleValue__ValueAssignment_4 ) ) );";
        }
    }
    static final String dfa_8s = "\7\uffff\1\11\2\uffff";
    static final String dfa_9s = "\2\4\1\24\2\5\1\uffff\1\24\1\4\2\uffff";
    static final String dfa_10s = "\2\51\1\52\2\5\1\uffff\1\52\1\53\2\uffff";
    static final String dfa_11s = "\5\uffff\1\2\2\uffff\1\3\1\1";
    static final String[] dfa_12s = {
            "\1\3\16\uffff\1\1\25\uffff\1\2",
            "\1\3\44\uffff\1\2",
            "\2\5\24\uffff\1\4",
            "\1\6",
            "\1\7",
            "",
            "\2\5\24\uffff\1\4",
            "\1\11\2\uffff\1\11\1\uffff\2\11\10\uffff\1\11\2\10\1\uffff\2\11\15\uffff\4\11\1\uffff\1\11",
            "",
            ""
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_6;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1109:1: rule__FloatValue__Alternatives : ( ( ( rule__FloatValue__Group_0__0 ) ) | ( ( rule__FloatValue__Group_1__0 ) ) | ( ( rule__FloatValue__Group_2__0 ) ) );";
        }
    }
    static final String dfa_13s = "\1\1\11\uffff";
    static final String dfa_14s = "\1\34\1\uffff\6\0\2\uffff";
    static final String dfa_15s = "\1\54\1\uffff\6\0\2\uffff";
    static final String dfa_16s = "\1\uffff\1\2\7\uffff\1\1";
    static final String dfa_17s = "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\2\uffff}>";
    static final String[] dfa_18s = {
            "\1\2\1\uffff\1\4\1\3\1\6\1\5\2\uffff\1\7\7\uffff\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_1;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()* loopback of 4418:7: ( ( rule__GraphqlSchema__TypesAssignment_1 )=> rule__GraphqlSchema__TypesAssignment_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGraphqlidl()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_3 = input.LA(1);

                         
                        int index34_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGraphqlidl()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGraphqlidl()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGraphqlidl()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGraphqlidl()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGraphqlidl()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000B000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000180L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000A8000880690L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000B8000880690L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000A8000880692L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000080010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000480020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000013D0000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00001013D0000002L});

}
