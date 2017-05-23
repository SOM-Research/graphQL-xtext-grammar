package oda.graphql.language.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import oda.graphql.language.services.GraphqlidlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphqlidlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_SCALAR", "RULE_BOOLEANVALUE", "RULE_NULLVALUE", "RULE_ENUM_VALUE", "RULE_NONZERODIGIT", "RULE_INT", "RULE_STRING", "RULE_COMMA", "RULE_COMMENT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'schema'", "'{'", "'mutation'", "':'", "'subscription'", "'}'", "'query'", "'type'", "'implements'", "'interface'", "'scalar'", "'enum'", "'union'", "'='", "'|'", "'input'", "'('", "')'", "'!'", "'['", "']'", "'0'", "'-'", "'.'", "'e'", "'E'", "'+'", "'\"'"
    };
    public static final int RULE_ENUM_VALUE=8;
    public static final int RULE_SCALAR=5;
    public static final int T__19=19;
    public static final int RULE_NULLVALUE=7;
    public static final int RULE_NONZERODIGIT=9;
    public static final int RULE_ID=14;
    public static final int RULE_COMMA=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NAME=4;
    public static final int RULE_STRING=11;
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
    public static final int RULE_BOOLEANVALUE=6;
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

        public InternalGraphqlidlParser(TokenStream input, GraphqlidlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GraphqlSchema";
       	}

       	@Override
       	protected GraphqlidlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGraphqlSchema"
    // InternalGraphqlidl.g:64:1: entryRuleGraphqlSchema returns [EObject current=null] : iv_ruleGraphqlSchema= ruleGraphqlSchema EOF ;
    public final EObject entryRuleGraphqlSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlSchema = null;


        try {
            // InternalGraphqlidl.g:64:54: (iv_ruleGraphqlSchema= ruleGraphqlSchema EOF )
            // InternalGraphqlidl.g:65:2: iv_ruleGraphqlSchema= ruleGraphqlSchema EOF
            {
             newCompositeNode(grammarAccess.getGraphqlSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlSchema=ruleGraphqlSchema();

            state._fsp--;

             current =iv_ruleGraphqlSchema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlSchema"


    // $ANTLR start "ruleGraphqlSchema"
    // InternalGraphqlidl.g:71:1: ruleGraphqlSchema returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+ ) ) )+ {...}?) ) ) ;
    public final EObject ruleGraphqlSchema() throws RecognitionException {
        EObject current = null;

        EObject lv_schema_1_0 = null;

        EObject lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+ ) ) )+ {...}?) ) ) )
            // InternalGraphqlidl.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+ ) ) )+ {...}?) ) )
            {
            // InternalGraphqlidl.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+ ) ) )+ {...}?) ) )
            // InternalGraphqlidl.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+ ) ) )+ {...}?) )
            {
            // InternalGraphqlidl.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+ ) ) )+ {...}?) )
            // InternalGraphqlidl.g:80:4: ( ( ({...}? => ( ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+ ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup());
            			
            // InternalGraphqlidl.g:83:4: ( ( ({...}? => ( ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+ ) ) )+ {...}?)
            // InternalGraphqlidl.g:84:5: ( ({...}? => ( ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+ ) ) )+ {...}?
            {
            // InternalGraphqlidl.g:84:5: ( ({...}? => ( ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+ ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( ( LA2_0 == 26 || LA2_0 >= 28 && LA2_0 <= 31 || LA2_0 == 34 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGraphqlidl.g:85:3: ({...}? => ( ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) ) ) )
            	    {
            	    // InternalGraphqlidl.g:85:3: ({...}? => ( ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) ) ) )
            	    // InternalGraphqlidl.g:86:4: {...}? => ( ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGraphqlSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalGraphqlidl.g:86:107: ( ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) ) )
            	    // InternalGraphqlidl.g:87:5: ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalGraphqlidl.g:90:8: ({...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) ) )
            	    // InternalGraphqlidl.g:90:9: {...}? => ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGraphqlSchema", "true");
            	    }
            	    // InternalGraphqlidl.g:90:18: ( (lv_schema_1_0= ruleGraphqlSchemaDefinition ) )
            	    // InternalGraphqlidl.g:90:19: (lv_schema_1_0= ruleGraphqlSchemaDefinition )
            	    {
            	    // InternalGraphqlidl.g:90:19: (lv_schema_1_0= ruleGraphqlSchemaDefinition )
            	    // InternalGraphqlidl.g:91:9: lv_schema_1_0= ruleGraphqlSchemaDefinition
            	    {

            	    									newCompositeNode(grammarAccess.getGraphqlSchemaAccess().getSchemaGraphqlSchemaDefinitionParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_schema_1_0=ruleGraphqlSchemaDefinition();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getGraphqlSchemaRule());
            	    									}
            	    									set(
            	    										current,
            	    										"schema",
            	    										lv_schema_1_0,
            	    										"oda.graphql.language.Graphqlidl.GraphqlSchemaDefinition");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGraphqlidl.g:113:3: ({...}? => ( ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+ ) )
            	    {
            	    // InternalGraphqlidl.g:113:3: ({...}? => ( ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+ ) )
            	    // InternalGraphqlidl.g:114:4: {...}? => ( ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGraphqlSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalGraphqlidl.g:114:107: ( ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+ )
            	    // InternalGraphqlidl.g:115:5: ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalGraphqlidl.g:118:8: ({...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        switch ( input.LA(1) ) {
            	        case 26:
            	            {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	            }
            	            break;
            	        case 29:
            	            {
            	            int LA1_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	            }
            	            break;
            	        case 28:
            	            {
            	            int LA1_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	            }
            	            break;
            	        case 31:
            	            {
            	            int LA1_5 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	            }
            	            break;
            	        case 30:
            	            {
            	            int LA1_6 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA1_7 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalGraphqlidl.g:118:9: {...}? => ( (lv_types_2_0= ruleGraphqlTypeDefinition ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGraphqlSchema", "true");
            	    	    }
            	    	    // InternalGraphqlidl.g:118:18: ( (lv_types_2_0= ruleGraphqlTypeDefinition ) )
            	    	    // InternalGraphqlidl.g:118:19: (lv_types_2_0= ruleGraphqlTypeDefinition )
            	    	    {
            	    	    // InternalGraphqlidl.g:118:19: (lv_types_2_0= ruleGraphqlTypeDefinition )
            	    	    // InternalGraphqlidl.g:119:9: lv_types_2_0= ruleGraphqlTypeDefinition
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getGraphqlSchemaAccess().getTypesGraphqlTypeDefinitionParserRuleCall_1_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_types_2_0=ruleGraphqlTypeDefinition();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getGraphqlSchemaRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"types",
            	    	    										lv_types_2_0,
            	    	    										"oda.graphql.language.Graphqlidl.GraphqlTypeDefinition");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleGraphqlSchema", "getUnorderedGroupHelper().canLeave(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getGraphqlSchemaAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlSchema"


    // $ANTLR start "entryRuleGraphqlSchemaDefinition"
    // InternalGraphqlidl.g:152:1: entryRuleGraphqlSchemaDefinition returns [EObject current=null] : iv_ruleGraphqlSchemaDefinition= ruleGraphqlSchemaDefinition EOF ;
    public final EObject entryRuleGraphqlSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlSchemaDefinition = null;


        try {
            // InternalGraphqlidl.g:152:64: (iv_ruleGraphqlSchemaDefinition= ruleGraphqlSchemaDefinition EOF )
            // InternalGraphqlidl.g:153:2: iv_ruleGraphqlSchemaDefinition= ruleGraphqlSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getGraphqlSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlSchemaDefinition=ruleGraphqlSchemaDefinition();

            state._fsp--;

             current =iv_ruleGraphqlSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlSchemaDefinition"


    // $ANTLR start "ruleGraphqlSchemaDefinition"
    // InternalGraphqlidl.g:159:1: ruleGraphqlSchemaDefinition returns [EObject current=null] : ( ( (lv_name_0_0= 'schema' ) ) otherlv_1= '{' ( (lv_rootQuery_2_0= ruleGraphqlRootQuery ) ) (otherlv_3= 'mutation' otherlv_4= ':' ( (otherlv_5= RULE_NAME ) ) )? (otherlv_6= 'subscription' otherlv_7= ':' ( (otherlv_8= RULE_NAME ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleGraphqlSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_rootQuery_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:165:2: ( ( ( (lv_name_0_0= 'schema' ) ) otherlv_1= '{' ( (lv_rootQuery_2_0= ruleGraphqlRootQuery ) ) (otherlv_3= 'mutation' otherlv_4= ':' ( (otherlv_5= RULE_NAME ) ) )? (otherlv_6= 'subscription' otherlv_7= ':' ( (otherlv_8= RULE_NAME ) ) )? otherlv_9= '}' ) )
            // InternalGraphqlidl.g:166:2: ( ( (lv_name_0_0= 'schema' ) ) otherlv_1= '{' ( (lv_rootQuery_2_0= ruleGraphqlRootQuery ) ) (otherlv_3= 'mutation' otherlv_4= ':' ( (otherlv_5= RULE_NAME ) ) )? (otherlv_6= 'subscription' otherlv_7= ':' ( (otherlv_8= RULE_NAME ) ) )? otherlv_9= '}' )
            {
            // InternalGraphqlidl.g:166:2: ( ( (lv_name_0_0= 'schema' ) ) otherlv_1= '{' ( (lv_rootQuery_2_0= ruleGraphqlRootQuery ) ) (otherlv_3= 'mutation' otherlv_4= ':' ( (otherlv_5= RULE_NAME ) ) )? (otherlv_6= 'subscription' otherlv_7= ':' ( (otherlv_8= RULE_NAME ) ) )? otherlv_9= '}' )
            // InternalGraphqlidl.g:167:3: ( (lv_name_0_0= 'schema' ) ) otherlv_1= '{' ( (lv_rootQuery_2_0= ruleGraphqlRootQuery ) ) (otherlv_3= 'mutation' otherlv_4= ':' ( (otherlv_5= RULE_NAME ) ) )? (otherlv_6= 'subscription' otherlv_7= ':' ( (otherlv_8= RULE_NAME ) ) )? otherlv_9= '}'
            {
            // InternalGraphqlidl.g:167:3: ( (lv_name_0_0= 'schema' ) )
            // InternalGraphqlidl.g:168:4: (lv_name_0_0= 'schema' )
            {
            // InternalGraphqlidl.g:168:4: (lv_name_0_0= 'schema' )
            // InternalGraphqlidl.g:169:5: lv_name_0_0= 'schema'
            {
            lv_name_0_0=(Token)match(input,19,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGraphqlSchemaDefinitionAccess().getNameSchemaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphqlSchemaDefinitionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "schema");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphqlSchemaDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGraphqlidl.g:185:3: ( (lv_rootQuery_2_0= ruleGraphqlRootQuery ) )
            // InternalGraphqlidl.g:186:4: (lv_rootQuery_2_0= ruleGraphqlRootQuery )
            {
            // InternalGraphqlidl.g:186:4: (lv_rootQuery_2_0= ruleGraphqlRootQuery )
            // InternalGraphqlidl.g:187:5: lv_rootQuery_2_0= ruleGraphqlRootQuery
            {

            					newCompositeNode(grammarAccess.getGraphqlSchemaDefinitionAccess().getRootQueryGraphqlRootQueryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_rootQuery_2_0=ruleGraphqlRootQuery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphqlSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"rootQuery",
            						lv_rootQuery_2_0,
            						"oda.graphql.language.Graphqlidl.GraphqlRootQuery");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGraphqlidl.g:204:3: (otherlv_3= 'mutation' otherlv_4= ':' ( (otherlv_5= RULE_NAME ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGraphqlidl.g:205:4: otherlv_3= 'mutation' otherlv_4= ':' ( (otherlv_5= RULE_NAME ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getGraphqlSchemaDefinitionAccess().getMutationKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,22,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getGraphqlSchemaDefinitionAccess().getColonKeyword_3_1());
                    			
                    // InternalGraphqlidl.g:213:4: ( (otherlv_5= RULE_NAME ) )
                    // InternalGraphqlidl.g:214:5: (otherlv_5= RULE_NAME )
                    {
                    // InternalGraphqlidl.g:214:5: (otherlv_5= RULE_NAME )
                    // InternalGraphqlidl.g:215:6: otherlv_5= RULE_NAME
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphqlSchemaDefinitionRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_NAME,FOLLOW_9); 

                    						newLeafNode(otherlv_5, grammarAccess.getGraphqlSchemaDefinitionAccess().getMutationGraphqlObjectTypeDefinitionCrossReference_3_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGraphqlidl.g:227:3: (otherlv_6= 'subscription' otherlv_7= ':' ( (otherlv_8= RULE_NAME ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGraphqlidl.g:228:4: otherlv_6= 'subscription' otherlv_7= ':' ( (otherlv_8= RULE_NAME ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphqlSchemaDefinitionAccess().getSubscriptionKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,22,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getGraphqlSchemaDefinitionAccess().getColonKeyword_4_1());
                    			
                    // InternalGraphqlidl.g:236:4: ( (otherlv_8= RULE_NAME ) )
                    // InternalGraphqlidl.g:237:5: (otherlv_8= RULE_NAME )
                    {
                    // InternalGraphqlidl.g:237:5: (otherlv_8= RULE_NAME )
                    // InternalGraphqlidl.g:238:6: otherlv_8= RULE_NAME
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphqlSchemaDefinitionRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_NAME,FOLLOW_10); 

                    						newLeafNode(otherlv_8, grammarAccess.getGraphqlSchemaDefinitionAccess().getSubcriptionGraphqlObjectTypeDefinitionCrossReference_4_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGraphqlSchemaDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlSchemaDefinition"


    // $ANTLR start "entryRuleGraphqlRootQuery"
    // InternalGraphqlidl.g:258:1: entryRuleGraphqlRootQuery returns [EObject current=null] : iv_ruleGraphqlRootQuery= ruleGraphqlRootQuery EOF ;
    public final EObject entryRuleGraphqlRootQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlRootQuery = null;


        try {
            // InternalGraphqlidl.g:258:57: (iv_ruleGraphqlRootQuery= ruleGraphqlRootQuery EOF )
            // InternalGraphqlidl.g:259:2: iv_ruleGraphqlRootQuery= ruleGraphqlRootQuery EOF
            {
             newCompositeNode(grammarAccess.getGraphqlRootQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlRootQuery=ruleGraphqlRootQuery();

            state._fsp--;

             current =iv_ruleGraphqlRootQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlRootQuery"


    // $ANTLR start "ruleGraphqlRootQuery"
    // InternalGraphqlidl.g:265:1: ruleGraphqlRootQuery returns [EObject current=null] : ( ( (lv_name_0_0= 'query' ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) ) ;
    public final EObject ruleGraphqlRootQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGraphqlidl.g:271:2: ( ( ( (lv_name_0_0= 'query' ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) ) )
            // InternalGraphqlidl.g:272:2: ( ( (lv_name_0_0= 'query' ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) )
            {
            // InternalGraphqlidl.g:272:2: ( ( (lv_name_0_0= 'query' ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) ) )
            // InternalGraphqlidl.g:273:3: ( (lv_name_0_0= 'query' ) ) otherlv_1= ':' ( (otherlv_2= RULE_NAME ) )
            {
            // InternalGraphqlidl.g:273:3: ( (lv_name_0_0= 'query' ) )
            // InternalGraphqlidl.g:274:4: (lv_name_0_0= 'query' )
            {
            // InternalGraphqlidl.g:274:4: (lv_name_0_0= 'query' )
            // InternalGraphqlidl.g:275:5: lv_name_0_0= 'query'
            {
            lv_name_0_0=(Token)match(input,25,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGraphqlRootQueryAccess().getNameQueryKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphqlRootQueryRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "query");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphqlRootQueryAccess().getColonKeyword_1());
            		
            // InternalGraphqlidl.g:291:3: ( (otherlv_2= RULE_NAME ) )
            // InternalGraphqlidl.g:292:4: (otherlv_2= RULE_NAME )
            {
            // InternalGraphqlidl.g:292:4: (otherlv_2= RULE_NAME )
            // InternalGraphqlidl.g:293:5: otherlv_2= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphqlRootQueryRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_NAME,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getGraphqlRootQueryAccess().getQueryGraphqlObjectTypeDefinitionCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlRootQuery"


    // $ANTLR start "entryRuleGraphqlTypeDefinition"
    // InternalGraphqlidl.g:308:1: entryRuleGraphqlTypeDefinition returns [EObject current=null] : iv_ruleGraphqlTypeDefinition= ruleGraphqlTypeDefinition EOF ;
    public final EObject entryRuleGraphqlTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlTypeDefinition = null;


        try {
            // InternalGraphqlidl.g:308:62: (iv_ruleGraphqlTypeDefinition= ruleGraphqlTypeDefinition EOF )
            // InternalGraphqlidl.g:309:2: iv_ruleGraphqlTypeDefinition= ruleGraphqlTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getGraphqlTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlTypeDefinition=ruleGraphqlTypeDefinition();

            state._fsp--;

             current =iv_ruleGraphqlTypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlTypeDefinition"


    // $ANTLR start "ruleGraphqlTypeDefinition"
    // InternalGraphqlidl.g:315:1: ruleGraphqlTypeDefinition returns [EObject current=null] : (this_GraphqlObjectTypeDefinition_0= ruleGraphqlObjectTypeDefinition | this_GraphqlScalarTypeDefinition_1= ruleGraphqlScalarTypeDefinition | this_GraphqlInterfaceTypeDefinition_2= ruleGraphqlInterfaceTypeDefinition | this_GraphqlUnionTypeDefinition_3= ruleGraphqlUnionTypeDefinition | this_GraphqlEmunTypeDefinition_4= ruleGraphqlEmunTypeDefinition | this_GraphqlInputTypeDefinition_5= ruleGraphqlInputTypeDefinition ) ;
    public final EObject ruleGraphqlTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_GraphqlObjectTypeDefinition_0 = null;

        EObject this_GraphqlScalarTypeDefinition_1 = null;

        EObject this_GraphqlInterfaceTypeDefinition_2 = null;

        EObject this_GraphqlUnionTypeDefinition_3 = null;

        EObject this_GraphqlEmunTypeDefinition_4 = null;

        EObject this_GraphqlInputTypeDefinition_5 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:321:2: ( (this_GraphqlObjectTypeDefinition_0= ruleGraphqlObjectTypeDefinition | this_GraphqlScalarTypeDefinition_1= ruleGraphqlScalarTypeDefinition | this_GraphqlInterfaceTypeDefinition_2= ruleGraphqlInterfaceTypeDefinition | this_GraphqlUnionTypeDefinition_3= ruleGraphqlUnionTypeDefinition | this_GraphqlEmunTypeDefinition_4= ruleGraphqlEmunTypeDefinition | this_GraphqlInputTypeDefinition_5= ruleGraphqlInputTypeDefinition ) )
            // InternalGraphqlidl.g:322:2: (this_GraphqlObjectTypeDefinition_0= ruleGraphqlObjectTypeDefinition | this_GraphqlScalarTypeDefinition_1= ruleGraphqlScalarTypeDefinition | this_GraphqlInterfaceTypeDefinition_2= ruleGraphqlInterfaceTypeDefinition | this_GraphqlUnionTypeDefinition_3= ruleGraphqlUnionTypeDefinition | this_GraphqlEmunTypeDefinition_4= ruleGraphqlEmunTypeDefinition | this_GraphqlInputTypeDefinition_5= ruleGraphqlInputTypeDefinition )
            {
            // InternalGraphqlidl.g:322:2: (this_GraphqlObjectTypeDefinition_0= ruleGraphqlObjectTypeDefinition | this_GraphqlScalarTypeDefinition_1= ruleGraphqlScalarTypeDefinition | this_GraphqlInterfaceTypeDefinition_2= ruleGraphqlInterfaceTypeDefinition | this_GraphqlUnionTypeDefinition_3= ruleGraphqlUnionTypeDefinition | this_GraphqlEmunTypeDefinition_4= ruleGraphqlEmunTypeDefinition | this_GraphqlInputTypeDefinition_5= ruleGraphqlInputTypeDefinition )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 31:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            case 34:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGraphqlidl.g:323:3: this_GraphqlObjectTypeDefinition_0= ruleGraphqlObjectTypeDefinition
                    {

                    			newCompositeNode(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlObjectTypeDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphqlObjectTypeDefinition_0=ruleGraphqlObjectTypeDefinition();

                    state._fsp--;


                    			current = this_GraphqlObjectTypeDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:332:3: this_GraphqlScalarTypeDefinition_1= ruleGraphqlScalarTypeDefinition
                    {

                    			newCompositeNode(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlScalarTypeDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphqlScalarTypeDefinition_1=ruleGraphqlScalarTypeDefinition();

                    state._fsp--;


                    			current = this_GraphqlScalarTypeDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGraphqlidl.g:341:3: this_GraphqlInterfaceTypeDefinition_2= ruleGraphqlInterfaceTypeDefinition
                    {

                    			newCompositeNode(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlInterfaceTypeDefinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphqlInterfaceTypeDefinition_2=ruleGraphqlInterfaceTypeDefinition();

                    state._fsp--;


                    			current = this_GraphqlInterfaceTypeDefinition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGraphqlidl.g:350:3: this_GraphqlUnionTypeDefinition_3= ruleGraphqlUnionTypeDefinition
                    {

                    			newCompositeNode(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlUnionTypeDefinitionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphqlUnionTypeDefinition_3=ruleGraphqlUnionTypeDefinition();

                    state._fsp--;


                    			current = this_GraphqlUnionTypeDefinition_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGraphqlidl.g:359:3: this_GraphqlEmunTypeDefinition_4= ruleGraphqlEmunTypeDefinition
                    {

                    			newCompositeNode(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlEmunTypeDefinitionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphqlEmunTypeDefinition_4=ruleGraphqlEmunTypeDefinition();

                    state._fsp--;


                    			current = this_GraphqlEmunTypeDefinition_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGraphqlidl.g:368:3: this_GraphqlInputTypeDefinition_5= ruleGraphqlInputTypeDefinition
                    {

                    			newCompositeNode(grammarAccess.getGraphqlTypeDefinitionAccess().getGraphqlInputTypeDefinitionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphqlInputTypeDefinition_5=ruleGraphqlInputTypeDefinition();

                    state._fsp--;


                    			current = this_GraphqlInputTypeDefinition_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlTypeDefinition"


    // $ANTLR start "entryRuleGraphqlObjectTypeDefinition"
    // InternalGraphqlidl.g:380:1: entryRuleGraphqlObjectTypeDefinition returns [EObject current=null] : iv_ruleGraphqlObjectTypeDefinition= ruleGraphqlObjectTypeDefinition EOF ;
    public final EObject entryRuleGraphqlObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlObjectTypeDefinition = null;


        try {
            // InternalGraphqlidl.g:380:68: (iv_ruleGraphqlObjectTypeDefinition= ruleGraphqlObjectTypeDefinition EOF )
            // InternalGraphqlidl.g:381:2: iv_ruleGraphqlObjectTypeDefinition= ruleGraphqlObjectTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getGraphqlObjectTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlObjectTypeDefinition=ruleGraphqlObjectTypeDefinition();

            state._fsp--;

             current =iv_ruleGraphqlObjectTypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlObjectTypeDefinition"


    // $ANTLR start "ruleGraphqlObjectTypeDefinition"
    // InternalGraphqlidl.g:387:1: ruleGraphqlObjectTypeDefinition returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= 'implements' ( (otherlv_3= RULE_NAME ) )+ )? otherlv_4= '{' ( (lv_fields_5_0= ruleGraphqlField ) )+ otherlv_6= '}' ) ;
    public final EObject ruleGraphqlObjectTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_fields_5_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:393:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= 'implements' ( (otherlv_3= RULE_NAME ) )+ )? otherlv_4= '{' ( (lv_fields_5_0= ruleGraphqlField ) )+ otherlv_6= '}' ) )
            // InternalGraphqlidl.g:394:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= 'implements' ( (otherlv_3= RULE_NAME ) )+ )? otherlv_4= '{' ( (lv_fields_5_0= ruleGraphqlField ) )+ otherlv_6= '}' )
            {
            // InternalGraphqlidl.g:394:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= 'implements' ( (otherlv_3= RULE_NAME ) )+ )? otherlv_4= '{' ( (lv_fields_5_0= ruleGraphqlField ) )+ otherlv_6= '}' )
            // InternalGraphqlidl.g:395:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_NAME ) ) (otherlv_2= 'implements' ( (otherlv_3= RULE_NAME ) )+ )? otherlv_4= '{' ( (lv_fields_5_0= ruleGraphqlField ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphqlObjectTypeDefinitionAccess().getTypeKeyword_0());
            		
            // InternalGraphqlidl.g:399:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphqlidl.g:400:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphqlidl.g:400:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphqlidl.g:401:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGraphqlObjectTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphqlObjectTypeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"oda.graphql.language.Graphqlidl.NAME");
            				

            }


            }

            // InternalGraphqlidl.g:417:3: (otherlv_2= 'implements' ( (otherlv_3= RULE_NAME ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGraphqlidl.g:418:4: otherlv_2= 'implements' ( (otherlv_3= RULE_NAME ) )+
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getGraphqlObjectTypeDefinitionAccess().getImplementsKeyword_2_0());
                    			
                    // InternalGraphqlidl.g:422:4: ( (otherlv_3= RULE_NAME ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_NAME) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGraphqlidl.g:423:5: (otherlv_3= RULE_NAME )
                    	    {
                    	    // InternalGraphqlidl.g:423:5: (otherlv_3= RULE_NAME )
                    	    // InternalGraphqlidl.g:424:6: otherlv_3= RULE_NAME
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getGraphqlObjectTypeDefinitionRule());
                    	    						}
                    	    					
                    	    otherlv_3=(Token)match(input,RULE_NAME,FOLLOW_12); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getGraphqlObjectTypeDefinitionAccess().getInterfacesGraphqlInterfaceTypeDefinitionCrossReference_2_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphqlObjectTypeDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGraphqlidl.g:440:3: ( (lv_fields_5_0= ruleGraphqlField ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_NAME) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGraphqlidl.g:441:4: (lv_fields_5_0= ruleGraphqlField )
            	    {
            	    // InternalGraphqlidl.g:441:4: (lv_fields_5_0= ruleGraphqlField )
            	    // InternalGraphqlidl.g:442:5: lv_fields_5_0= ruleGraphqlField
            	    {

            	    					newCompositeNode(grammarAccess.getGraphqlObjectTypeDefinitionAccess().getFieldsGraphqlFieldParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_fields_5_0=ruleGraphqlField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGraphqlObjectTypeDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_5_0,
            	    						"oda.graphql.language.Graphqlidl.GraphqlField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGraphqlObjectTypeDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlObjectTypeDefinition"


    // $ANTLR start "entryRuleGraphqlInterfaceTypeDefinition"
    // InternalGraphqlidl.g:467:1: entryRuleGraphqlInterfaceTypeDefinition returns [EObject current=null] : iv_ruleGraphqlInterfaceTypeDefinition= ruleGraphqlInterfaceTypeDefinition EOF ;
    public final EObject entryRuleGraphqlInterfaceTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlInterfaceTypeDefinition = null;


        try {
            // InternalGraphqlidl.g:467:71: (iv_ruleGraphqlInterfaceTypeDefinition= ruleGraphqlInterfaceTypeDefinition EOF )
            // InternalGraphqlidl.g:468:2: iv_ruleGraphqlInterfaceTypeDefinition= ruleGraphqlInterfaceTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getGraphqlInterfaceTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlInterfaceTypeDefinition=ruleGraphqlInterfaceTypeDefinition();

            state._fsp--;

             current =iv_ruleGraphqlInterfaceTypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlInterfaceTypeDefinition"


    // $ANTLR start "ruleGraphqlInterfaceTypeDefinition"
    // InternalGraphqlidl.g:474:1: ruleGraphqlInterfaceTypeDefinition returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleGraphqlField ) )+ otherlv_4= '}' ) ;
    public final EObject ruleGraphqlInterfaceTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:480:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleGraphqlField ) )+ otherlv_4= '}' ) )
            // InternalGraphqlidl.g:481:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleGraphqlField ) )+ otherlv_4= '}' )
            {
            // InternalGraphqlidl.g:481:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleGraphqlField ) )+ otherlv_4= '}' )
            // InternalGraphqlidl.g:482:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleGraphqlField ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getInterfaceKeyword_0());
            		
            // InternalGraphqlidl.g:486:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphqlidl.g:487:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphqlidl.g:487:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphqlidl.g:488:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphqlInterfaceTypeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"oda.graphql.language.Graphqlidl.NAME");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGraphqlidl.g:508:3: ( (lv_fields_3_0= ruleGraphqlField ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_NAME) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGraphqlidl.g:509:4: (lv_fields_3_0= ruleGraphqlField )
            	    {
            	    // InternalGraphqlidl.g:509:4: (lv_fields_3_0= ruleGraphqlField )
            	    // InternalGraphqlidl.g:510:5: lv_fields_3_0= ruleGraphqlField
            	    {

            	    					newCompositeNode(grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getFieldsGraphqlFieldParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_fields_3_0=ruleGraphqlField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGraphqlInterfaceTypeDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_3_0,
            	    						"oda.graphql.language.Graphqlidl.GraphqlField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphqlInterfaceTypeDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlInterfaceTypeDefinition"


    // $ANTLR start "entryRuleGraphqlScalarTypeDefinition"
    // InternalGraphqlidl.g:535:1: entryRuleGraphqlScalarTypeDefinition returns [EObject current=null] : iv_ruleGraphqlScalarTypeDefinition= ruleGraphqlScalarTypeDefinition EOF ;
    public final EObject entryRuleGraphqlScalarTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlScalarTypeDefinition = null;


        try {
            // InternalGraphqlidl.g:535:68: (iv_ruleGraphqlScalarTypeDefinition= ruleGraphqlScalarTypeDefinition EOF )
            // InternalGraphqlidl.g:536:2: iv_ruleGraphqlScalarTypeDefinition= ruleGraphqlScalarTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getGraphqlScalarTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlScalarTypeDefinition=ruleGraphqlScalarTypeDefinition();

            state._fsp--;

             current =iv_ruleGraphqlScalarTypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlScalarTypeDefinition"


    // $ANTLR start "ruleGraphqlScalarTypeDefinition"
    // InternalGraphqlidl.g:542:1: ruleGraphqlScalarTypeDefinition returns [EObject current=null] : (otherlv_0= 'scalar' ( (lv_name_1_0= RULE_NAME ) ) ) ;
    public final EObject ruleGraphqlScalarTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGraphqlidl.g:548:2: ( (otherlv_0= 'scalar' ( (lv_name_1_0= RULE_NAME ) ) ) )
            // InternalGraphqlidl.g:549:2: (otherlv_0= 'scalar' ( (lv_name_1_0= RULE_NAME ) ) )
            {
            // InternalGraphqlidl.g:549:2: (otherlv_0= 'scalar' ( (lv_name_1_0= RULE_NAME ) ) )
            // InternalGraphqlidl.g:550:3: otherlv_0= 'scalar' ( (lv_name_1_0= RULE_NAME ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphqlScalarTypeDefinitionAccess().getScalarKeyword_0());
            		
            // InternalGraphqlidl.g:554:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphqlidl.g:555:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphqlidl.g:555:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphqlidl.g:556:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGraphqlScalarTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphqlScalarTypeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"oda.graphql.language.Graphqlidl.NAME");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlScalarTypeDefinition"


    // $ANTLR start "entryRuleGraphqlEmunTypeDefinition"
    // InternalGraphqlidl.g:576:1: entryRuleGraphqlEmunTypeDefinition returns [EObject current=null] : iv_ruleGraphqlEmunTypeDefinition= ruleGraphqlEmunTypeDefinition EOF ;
    public final EObject entryRuleGraphqlEmunTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlEmunTypeDefinition = null;


        try {
            // InternalGraphqlidl.g:576:66: (iv_ruleGraphqlEmunTypeDefinition= ruleGraphqlEmunTypeDefinition EOF )
            // InternalGraphqlidl.g:577:2: iv_ruleGraphqlEmunTypeDefinition= ruleGraphqlEmunTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getGraphqlEmunTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlEmunTypeDefinition=ruleGraphqlEmunTypeDefinition();

            state._fsp--;

             current =iv_ruleGraphqlEmunTypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlEmunTypeDefinition"


    // $ANTLR start "ruleGraphqlEmunTypeDefinition"
    // InternalGraphqlidl.g:583:1: ruleGraphqlEmunTypeDefinition returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumValue ) )+ otherlv_4= '}' ) ;
    public final EObject ruleGraphqlEmunTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:589:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumValue ) )+ otherlv_4= '}' ) )
            // InternalGraphqlidl.g:590:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumValue ) )+ otherlv_4= '}' )
            {
            // InternalGraphqlidl.g:590:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumValue ) )+ otherlv_4= '}' )
            // InternalGraphqlidl.g:591:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumValue ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphqlEmunTypeDefinitionAccess().getEnumKeyword_0());
            		
            // InternalGraphqlidl.g:595:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphqlidl.g:596:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphqlidl.g:596:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphqlidl.g:597:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGraphqlEmunTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphqlEmunTypeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"oda.graphql.language.Graphqlidl.NAME");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphqlEmunTypeDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGraphqlidl.g:617:3: ( (lv_values_3_0= ruleEnumValue ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ENUM_VALUE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGraphqlidl.g:618:4: (lv_values_3_0= ruleEnumValue )
            	    {
            	    // InternalGraphqlidl.g:618:4: (lv_values_3_0= ruleEnumValue )
            	    // InternalGraphqlidl.g:619:5: lv_values_3_0= ruleEnumValue
            	    {

            	    					newCompositeNode(grammarAccess.getGraphqlEmunTypeDefinitionAccess().getValuesEnumValueParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_values_3_0=ruleEnumValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGraphqlEmunTypeDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_3_0,
            	    						"oda.graphql.language.Graphqlidl.EnumValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphqlEmunTypeDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlEmunTypeDefinition"


    // $ANTLR start "entryRuleGraphqlUnionTypeDefinition"
    // InternalGraphqlidl.g:644:1: entryRuleGraphqlUnionTypeDefinition returns [EObject current=null] : iv_ruleGraphqlUnionTypeDefinition= ruleGraphqlUnionTypeDefinition EOF ;
    public final EObject entryRuleGraphqlUnionTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlUnionTypeDefinition = null;


        try {
            // InternalGraphqlidl.g:644:67: (iv_ruleGraphqlUnionTypeDefinition= ruleGraphqlUnionTypeDefinition EOF )
            // InternalGraphqlidl.g:645:2: iv_ruleGraphqlUnionTypeDefinition= ruleGraphqlUnionTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getGraphqlUnionTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlUnionTypeDefinition=ruleGraphqlUnionTypeDefinition();

            state._fsp--;

             current =iv_ruleGraphqlUnionTypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlUnionTypeDefinition"


    // $ANTLR start "ruleGraphqlUnionTypeDefinition"
    // InternalGraphqlidl.g:651:1: ruleGraphqlUnionTypeDefinition returns [EObject current=null] : (otherlv_0= 'union' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '=' ( (otherlv_3= RULE_NAME ) ) (otherlv_4= '|' ( (otherlv_5= RULE_NAME ) ) )* ) ;
    public final EObject ruleGraphqlUnionTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalGraphqlidl.g:657:2: ( (otherlv_0= 'union' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '=' ( (otherlv_3= RULE_NAME ) ) (otherlv_4= '|' ( (otherlv_5= RULE_NAME ) ) )* ) )
            // InternalGraphqlidl.g:658:2: (otherlv_0= 'union' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '=' ( (otherlv_3= RULE_NAME ) ) (otherlv_4= '|' ( (otherlv_5= RULE_NAME ) ) )* )
            {
            // InternalGraphqlidl.g:658:2: (otherlv_0= 'union' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '=' ( (otherlv_3= RULE_NAME ) ) (otherlv_4= '|' ( (otherlv_5= RULE_NAME ) ) )* )
            // InternalGraphqlidl.g:659:3: otherlv_0= 'union' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '=' ( (otherlv_3= RULE_NAME ) ) (otherlv_4= '|' ( (otherlv_5= RULE_NAME ) ) )*
            {
            otherlv_0=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphqlUnionTypeDefinitionAccess().getUnionKeyword_0());
            		
            // InternalGraphqlidl.g:663:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphqlidl.g:664:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphqlidl.g:664:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphqlidl.g:665:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGraphqlUnionTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphqlUnionTypeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"oda.graphql.language.Graphqlidl.NAME");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphqlUnionTypeDefinitionAccess().getEqualsSignKeyword_2());
            		
            // InternalGraphqlidl.g:685:3: ( (otherlv_3= RULE_NAME ) )
            // InternalGraphqlidl.g:686:4: (otherlv_3= RULE_NAME )
            {
            // InternalGraphqlidl.g:686:4: (otherlv_3= RULE_NAME )
            // InternalGraphqlidl.g:687:5: otherlv_3= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphqlUnionTypeDefinitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_NAME,FOLLOW_17); 

            					newLeafNode(otherlv_3, grammarAccess.getGraphqlUnionTypeDefinitionAccess().getMembersGraphqlObjectTypeDefinitionCrossReference_3_0());
            				

            }


            }

            // InternalGraphqlidl.g:698:3: (otherlv_4= '|' ( (otherlv_5= RULE_NAME ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGraphqlidl.g:699:4: otherlv_4= '|' ( (otherlv_5= RULE_NAME ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_8); 

            	    				newLeafNode(otherlv_4, grammarAccess.getGraphqlUnionTypeDefinitionAccess().getVerticalLineKeyword_4_0());
            	    			
            	    // InternalGraphqlidl.g:703:4: ( (otherlv_5= RULE_NAME ) )
            	    // InternalGraphqlidl.g:704:5: (otherlv_5= RULE_NAME )
            	    {
            	    // InternalGraphqlidl.g:704:5: (otherlv_5= RULE_NAME )
            	    // InternalGraphqlidl.g:705:6: otherlv_5= RULE_NAME
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGraphqlUnionTypeDefinitionRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_NAME,FOLLOW_17); 

            	    						newLeafNode(otherlv_5, grammarAccess.getGraphqlUnionTypeDefinitionAccess().getMembersGraphqlObjectTypeDefinitionCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlUnionTypeDefinition"


    // $ANTLR start "entryRuleGraphqlInputTypeDefinition"
    // InternalGraphqlidl.g:721:1: entryRuleGraphqlInputTypeDefinition returns [EObject current=null] : iv_ruleGraphqlInputTypeDefinition= ruleGraphqlInputTypeDefinition EOF ;
    public final EObject entryRuleGraphqlInputTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlInputTypeDefinition = null;


        try {
            // InternalGraphqlidl.g:721:67: (iv_ruleGraphqlInputTypeDefinition= ruleGraphqlInputTypeDefinition EOF )
            // InternalGraphqlidl.g:722:2: iv_ruleGraphqlInputTypeDefinition= ruleGraphqlInputTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getGraphqlInputTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlInputTypeDefinition=ruleGraphqlInputTypeDefinition();

            state._fsp--;

             current =iv_ruleGraphqlInputTypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlInputTypeDefinition"


    // $ANTLR start "ruleGraphqlInputTypeDefinition"
    // InternalGraphqlidl.g:728:1: ruleGraphqlInputTypeDefinition returns [EObject current=null] : (otherlv_0= 'input' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleGraphqlInputField ) )+ otherlv_4= '}' ) ;
    public final EObject ruleGraphqlInputTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:734:2: ( (otherlv_0= 'input' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleGraphqlInputField ) )+ otherlv_4= '}' ) )
            // InternalGraphqlidl.g:735:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleGraphqlInputField ) )+ otherlv_4= '}' )
            {
            // InternalGraphqlidl.g:735:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleGraphqlInputField ) )+ otherlv_4= '}' )
            // InternalGraphqlidl.g:736:3: otherlv_0= 'input' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleGraphqlInputField ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphqlInputTypeDefinitionAccess().getInputKeyword_0());
            		
            // InternalGraphqlidl.g:740:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphqlidl.g:741:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphqlidl.g:741:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphqlidl.g:742:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGraphqlInputTypeDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphqlInputTypeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"oda.graphql.language.Graphqlidl.NAME");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphqlInputTypeDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGraphqlidl.g:762:3: ( (lv_fields_3_0= ruleGraphqlInputField ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_NAME) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGraphqlidl.g:763:4: (lv_fields_3_0= ruleGraphqlInputField )
            	    {
            	    // InternalGraphqlidl.g:763:4: (lv_fields_3_0= ruleGraphqlInputField )
            	    // InternalGraphqlidl.g:764:5: lv_fields_3_0= ruleGraphqlInputField
            	    {

            	    					newCompositeNode(grammarAccess.getGraphqlInputTypeDefinitionAccess().getFieldsGraphqlInputFieldParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_fields_3_0=ruleGraphqlInputField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGraphqlInputTypeDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_3_0,
            	    						"oda.graphql.language.Graphqlidl.GraphqlInputField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphqlInputTypeDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlInputTypeDefinition"


    // $ANTLR start "entryRuleGraphqlInputField"
    // InternalGraphqlidl.g:789:1: entryRuleGraphqlInputField returns [EObject current=null] : iv_ruleGraphqlInputField= ruleGraphqlInputField EOF ;
    public final EObject entryRuleGraphqlInputField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlInputField = null;


        try {
            // InternalGraphqlidl.g:789:58: (iv_ruleGraphqlInputField= ruleGraphqlInputField EOF )
            // InternalGraphqlidl.g:790:2: iv_ruleGraphqlInputField= ruleGraphqlInputField EOF
            {
             newCompositeNode(grammarAccess.getGraphqlInputFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlInputField=ruleGraphqlInputField();

            state._fsp--;

             current =iv_ruleGraphqlInputField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlInputField"


    // $ANTLR start "ruleGraphqlInputField"
    // InternalGraphqlidl.g:796:1: ruleGraphqlInputField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_type_2_0= ruleGraphqlInputType ) ) ) ;
    public final EObject ruleGraphqlInputField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:802:2: ( ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_type_2_0= ruleGraphqlInputType ) ) ) )
            // InternalGraphqlidl.g:803:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_type_2_0= ruleGraphqlInputType ) ) )
            {
            // InternalGraphqlidl.g:803:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_type_2_0= ruleGraphqlInputType ) ) )
            // InternalGraphqlidl.g:804:3: ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_type_2_0= ruleGraphqlInputType ) )
            {
            // InternalGraphqlidl.g:804:3: ( (lv_name_0_0= RULE_NAME ) )
            // InternalGraphqlidl.g:805:4: (lv_name_0_0= RULE_NAME )
            {
            // InternalGraphqlidl.g:805:4: (lv_name_0_0= RULE_NAME )
            // InternalGraphqlidl.g:806:5: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGraphqlInputFieldAccess().getNameNAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphqlInputFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"oda.graphql.language.Graphqlidl.NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphqlInputFieldAccess().getColonKeyword_1());
            		
            // InternalGraphqlidl.g:826:3: ( (lv_type_2_0= ruleGraphqlInputType ) )
            // InternalGraphqlidl.g:827:4: (lv_type_2_0= ruleGraphqlInputType )
            {
            // InternalGraphqlidl.g:827:4: (lv_type_2_0= ruleGraphqlInputType )
            // InternalGraphqlidl.g:828:5: lv_type_2_0= ruleGraphqlInputType
            {

            					newCompositeNode(grammarAccess.getGraphqlInputFieldAccess().getTypeGraphqlInputTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleGraphqlInputType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphqlInputFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"oda.graphql.language.Graphqlidl.GraphqlInputType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlInputField"


    // $ANTLR start "entryRuleGraphqlField"
    // InternalGraphqlidl.g:849:1: entryRuleGraphqlField returns [EObject current=null] : iv_ruleGraphqlField= ruleGraphqlField EOF ;
    public final EObject entryRuleGraphqlField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlField = null;


        try {
            // InternalGraphqlidl.g:849:53: (iv_ruleGraphqlField= ruleGraphqlField EOF )
            // InternalGraphqlidl.g:850:2: iv_ruleGraphqlField= ruleGraphqlField EOF
            {
             newCompositeNode(grammarAccess.getGraphqlFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlField=ruleGraphqlField();

            state._fsp--;

             current =iv_ruleGraphqlField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlField"


    // $ANTLR start "ruleGraphqlField"
    // InternalGraphqlidl.g:856:1: ruleGraphqlField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_NAME ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) ) otherlv_3= ')' )* otherlv_4= ':' ( (lv_type_5_0= ruleGraphqlType ) ) ) ;
    public final EObject ruleGraphqlField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_args_2_0 = null;

        EObject lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:862:2: ( ( ( (lv_name_0_0= RULE_NAME ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) ) otherlv_3= ')' )* otherlv_4= ':' ( (lv_type_5_0= ruleGraphqlType ) ) ) )
            // InternalGraphqlidl.g:863:2: ( ( (lv_name_0_0= RULE_NAME ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) ) otherlv_3= ')' )* otherlv_4= ':' ( (lv_type_5_0= ruleGraphqlType ) ) )
            {
            // InternalGraphqlidl.g:863:2: ( ( (lv_name_0_0= RULE_NAME ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) ) otherlv_3= ')' )* otherlv_4= ':' ( (lv_type_5_0= ruleGraphqlType ) ) )
            // InternalGraphqlidl.g:864:3: ( (lv_name_0_0= RULE_NAME ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) ) otherlv_3= ')' )* otherlv_4= ':' ( (lv_type_5_0= ruleGraphqlType ) )
            {
            // InternalGraphqlidl.g:864:3: ( (lv_name_0_0= RULE_NAME ) )
            // InternalGraphqlidl.g:865:4: (lv_name_0_0= RULE_NAME )
            {
            // InternalGraphqlidl.g:865:4: (lv_name_0_0= RULE_NAME )
            // InternalGraphqlidl.g:866:5: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGraphqlFieldAccess().getNameNAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphqlFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"oda.graphql.language.Graphqlidl.NAME");
            				

            }


            }

            // InternalGraphqlidl.g:882:3: (otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) ) otherlv_3= ')' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGraphqlidl.g:883:4: otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) ) otherlv_3= ')'
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getGraphqlFieldAccess().getLeftParenthesisKeyword_1_0());
            	    			
            	    // InternalGraphqlidl.g:887:4: ( (lv_args_2_0= ruleArgument ) )
            	    // InternalGraphqlidl.g:888:5: (lv_args_2_0= ruleArgument )
            	    {
            	    // InternalGraphqlidl.g:888:5: (lv_args_2_0= ruleArgument )
            	    // InternalGraphqlidl.g:889:6: lv_args_2_0= ruleArgument
            	    {

            	    						newCompositeNode(grammarAccess.getGraphqlFieldAccess().getArgsArgumentParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_args_2_0=ruleArgument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGraphqlFieldRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_2_0,
            	    							"oda.graphql.language.Graphqlidl.Argument");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,36,FOLLOW_19); 

            	    				newLeafNode(otherlv_3, grammarAccess.getGraphqlFieldAccess().getRightParenthesisKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphqlFieldAccess().getColonKeyword_2());
            		
            // InternalGraphqlidl.g:915:3: ( (lv_type_5_0= ruleGraphqlType ) )
            // InternalGraphqlidl.g:916:4: (lv_type_5_0= ruleGraphqlType )
            {
            // InternalGraphqlidl.g:916:4: (lv_type_5_0= ruleGraphqlType )
            // InternalGraphqlidl.g:917:5: lv_type_5_0= ruleGraphqlType
            {

            					newCompositeNode(grammarAccess.getGraphqlFieldAccess().getTypeGraphqlTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_5_0=ruleGraphqlType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphqlFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"oda.graphql.language.Graphqlidl.GraphqlType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlField"


    // $ANTLR start "entryRuleGraphqlType"
    // InternalGraphqlidl.g:938:1: entryRuleGraphqlType returns [EObject current=null] : iv_ruleGraphqlType= ruleGraphqlType EOF ;
    public final EObject entryRuleGraphqlType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlType = null;


        try {
            // InternalGraphqlidl.g:938:52: (iv_ruleGraphqlType= ruleGraphqlType EOF )
            // InternalGraphqlidl.g:939:2: iv_ruleGraphqlType= ruleGraphqlType EOF
            {
             newCompositeNode(grammarAccess.getGraphqlTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlType=ruleGraphqlType();

            state._fsp--;

             current =iv_ruleGraphqlType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlType"


    // $ANTLR start "ruleGraphqlType"
    // InternalGraphqlidl.g:945:1: ruleGraphqlType returns [EObject current=null] : ( ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) | ( ( (lv_ntype_2_0= ruleGraphqlNamedType ) ) ( (lv_nonNull_3_0= '!' ) )? ) | ( ( (lv_ltype_4_0= ruleGraphqlListType ) ) ( (lv_nonNull_5_0= '!' ) )? ) ) ;
    public final EObject ruleGraphqlType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nonNull_1_0=null;
        Token lv_nonNull_3_0=null;
        Token lv_nonNull_5_0=null;
        EObject lv_ntype_2_0 = null;

        EObject lv_ltype_4_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:951:2: ( ( ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) | ( ( (lv_ntype_2_0= ruleGraphqlNamedType ) ) ( (lv_nonNull_3_0= '!' ) )? ) | ( ( (lv_ltype_4_0= ruleGraphqlListType ) ) ( (lv_nonNull_5_0= '!' ) )? ) ) )
            // InternalGraphqlidl.g:952:2: ( ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) | ( ( (lv_ntype_2_0= ruleGraphqlNamedType ) ) ( (lv_nonNull_3_0= '!' ) )? ) | ( ( (lv_ltype_4_0= ruleGraphqlListType ) ) ( (lv_nonNull_5_0= '!' ) )? ) )
            {
            // InternalGraphqlidl.g:952:2: ( ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) | ( ( (lv_ntype_2_0= ruleGraphqlNamedType ) ) ( (lv_nonNull_3_0= '!' ) )? ) | ( ( (lv_ltype_4_0= ruleGraphqlListType ) ) ( (lv_nonNull_5_0= '!' ) )? ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_NAME:
                {
                alt17=1;
                }
                break;
            case RULE_SCALAR:
                {
                alt17=2;
                }
                break;
            case 38:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalGraphqlidl.g:953:3: ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? )
                    {
                    // InternalGraphqlidl.g:953:3: ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? )
                    // InternalGraphqlidl.g:954:4: ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )?
                    {
                    // InternalGraphqlidl.g:954:4: ( (otherlv_0= RULE_NAME ) )
                    // InternalGraphqlidl.g:955:5: (otherlv_0= RULE_NAME )
                    {
                    // InternalGraphqlidl.g:955:5: (otherlv_0= RULE_NAME )
                    // InternalGraphqlidl.g:956:6: otherlv_0= RULE_NAME
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphqlTypeRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_21); 

                    						newLeafNode(otherlv_0, grammarAccess.getGraphqlTypeAccess().getDtypeGraphqlTypeDefinitionCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalGraphqlidl.g:967:4: ( (lv_nonNull_1_0= '!' ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==37) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalGraphqlidl.g:968:5: (lv_nonNull_1_0= '!' )
                            {
                            // InternalGraphqlidl.g:968:5: (lv_nonNull_1_0= '!' )
                            // InternalGraphqlidl.g:969:6: lv_nonNull_1_0= '!'
                            {
                            lv_nonNull_1_0=(Token)match(input,37,FOLLOW_2); 

                            						newLeafNode(lv_nonNull_1_0, grammarAccess.getGraphqlTypeAccess().getNonNullExclamationMarkKeyword_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getGraphqlTypeRule());
                            						}
                            						setWithLastConsumed(current, "nonNull", true, "!");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:983:3: ( ( (lv_ntype_2_0= ruleGraphqlNamedType ) ) ( (lv_nonNull_3_0= '!' ) )? )
                    {
                    // InternalGraphqlidl.g:983:3: ( ( (lv_ntype_2_0= ruleGraphqlNamedType ) ) ( (lv_nonNull_3_0= '!' ) )? )
                    // InternalGraphqlidl.g:984:4: ( (lv_ntype_2_0= ruleGraphqlNamedType ) ) ( (lv_nonNull_3_0= '!' ) )?
                    {
                    // InternalGraphqlidl.g:984:4: ( (lv_ntype_2_0= ruleGraphqlNamedType ) )
                    // InternalGraphqlidl.g:985:5: (lv_ntype_2_0= ruleGraphqlNamedType )
                    {
                    // InternalGraphqlidl.g:985:5: (lv_ntype_2_0= ruleGraphqlNamedType )
                    // InternalGraphqlidl.g:986:6: lv_ntype_2_0= ruleGraphqlNamedType
                    {

                    						newCompositeNode(grammarAccess.getGraphqlTypeAccess().getNtypeGraphqlNamedTypeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_ntype_2_0=ruleGraphqlNamedType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphqlTypeRule());
                    						}
                    						set(
                    							current,
                    							"ntype",
                    							lv_ntype_2_0,
                    							"oda.graphql.language.Graphqlidl.GraphqlNamedType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphqlidl.g:1003:4: ( (lv_nonNull_3_0= '!' ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==37) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalGraphqlidl.g:1004:5: (lv_nonNull_3_0= '!' )
                            {
                            // InternalGraphqlidl.g:1004:5: (lv_nonNull_3_0= '!' )
                            // InternalGraphqlidl.g:1005:6: lv_nonNull_3_0= '!'
                            {
                            lv_nonNull_3_0=(Token)match(input,37,FOLLOW_2); 

                            						newLeafNode(lv_nonNull_3_0, grammarAccess.getGraphqlTypeAccess().getNonNullExclamationMarkKeyword_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getGraphqlTypeRule());
                            						}
                            						setWithLastConsumed(current, "nonNull", true, "!");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGraphqlidl.g:1019:3: ( ( (lv_ltype_4_0= ruleGraphqlListType ) ) ( (lv_nonNull_5_0= '!' ) )? )
                    {
                    // InternalGraphqlidl.g:1019:3: ( ( (lv_ltype_4_0= ruleGraphqlListType ) ) ( (lv_nonNull_5_0= '!' ) )? )
                    // InternalGraphqlidl.g:1020:4: ( (lv_ltype_4_0= ruleGraphqlListType ) ) ( (lv_nonNull_5_0= '!' ) )?
                    {
                    // InternalGraphqlidl.g:1020:4: ( (lv_ltype_4_0= ruleGraphqlListType ) )
                    // InternalGraphqlidl.g:1021:5: (lv_ltype_4_0= ruleGraphqlListType )
                    {
                    // InternalGraphqlidl.g:1021:5: (lv_ltype_4_0= ruleGraphqlListType )
                    // InternalGraphqlidl.g:1022:6: lv_ltype_4_0= ruleGraphqlListType
                    {

                    						newCompositeNode(grammarAccess.getGraphqlTypeAccess().getLtypeGraphqlListTypeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_ltype_4_0=ruleGraphqlListType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphqlTypeRule());
                    						}
                    						set(
                    							current,
                    							"ltype",
                    							lv_ltype_4_0,
                    							"oda.graphql.language.Graphqlidl.GraphqlListType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphqlidl.g:1039:4: ( (lv_nonNull_5_0= '!' ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==37) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalGraphqlidl.g:1040:5: (lv_nonNull_5_0= '!' )
                            {
                            // InternalGraphqlidl.g:1040:5: (lv_nonNull_5_0= '!' )
                            // InternalGraphqlidl.g:1041:6: lv_nonNull_5_0= '!'
                            {
                            lv_nonNull_5_0=(Token)match(input,37,FOLLOW_2); 

                            						newLeafNode(lv_nonNull_5_0, grammarAccess.getGraphqlTypeAccess().getNonNullExclamationMarkKeyword_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getGraphqlTypeRule());
                            						}
                            						setWithLastConsumed(current, "nonNull", true, "!");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlType"


    // $ANTLR start "entryRuleGraphqlNamedType"
    // InternalGraphqlidl.g:1058:1: entryRuleGraphqlNamedType returns [EObject current=null] : iv_ruleGraphqlNamedType= ruleGraphqlNamedType EOF ;
    public final EObject entryRuleGraphqlNamedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlNamedType = null;


        try {
            // InternalGraphqlidl.g:1058:57: (iv_ruleGraphqlNamedType= ruleGraphqlNamedType EOF )
            // InternalGraphqlidl.g:1059:2: iv_ruleGraphqlNamedType= ruleGraphqlNamedType EOF
            {
             newCompositeNode(grammarAccess.getGraphqlNamedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlNamedType=ruleGraphqlNamedType();

            state._fsp--;

             current =iv_ruleGraphqlNamedType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlNamedType"


    // $ANTLR start "ruleGraphqlNamedType"
    // InternalGraphqlidl.g:1065:1: ruleGraphqlNamedType returns [EObject current=null] : ( (lv_name_0_0= RULE_SCALAR ) ) ;
    public final EObject ruleGraphqlNamedType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGraphqlidl.g:1071:2: ( ( (lv_name_0_0= RULE_SCALAR ) ) )
            // InternalGraphqlidl.g:1072:2: ( (lv_name_0_0= RULE_SCALAR ) )
            {
            // InternalGraphqlidl.g:1072:2: ( (lv_name_0_0= RULE_SCALAR ) )
            // InternalGraphqlidl.g:1073:3: (lv_name_0_0= RULE_SCALAR )
            {
            // InternalGraphqlidl.g:1073:3: (lv_name_0_0= RULE_SCALAR )
            // InternalGraphqlidl.g:1074:4: lv_name_0_0= RULE_SCALAR
            {
            lv_name_0_0=(Token)match(input,RULE_SCALAR,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getGraphqlNamedTypeAccess().getNameSCALARTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getGraphqlNamedTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"oda.graphql.language.Graphqlidl.SCALAR");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlNamedType"


    // $ANTLR start "entryRuleGraphqlListType"
    // InternalGraphqlidl.g:1093:1: entryRuleGraphqlListType returns [EObject current=null] : iv_ruleGraphqlListType= ruleGraphqlListType EOF ;
    public final EObject entryRuleGraphqlListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlListType = null;


        try {
            // InternalGraphqlidl.g:1093:56: (iv_ruleGraphqlListType= ruleGraphqlListType EOF )
            // InternalGraphqlidl.g:1094:2: iv_ruleGraphqlListType= ruleGraphqlListType EOF
            {
             newCompositeNode(grammarAccess.getGraphqlListTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlListType=ruleGraphqlListType();

            state._fsp--;

             current =iv_ruleGraphqlListType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlListType"


    // $ANTLR start "ruleGraphqlListType"
    // InternalGraphqlidl.g:1100:1: ruleGraphqlListType returns [EObject current=null] : (otherlv_0= '[' this_GraphqlType_1= ruleGraphqlType otherlv_2= ']' ) ;
    public final EObject ruleGraphqlListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_GraphqlType_1 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:1106:2: ( (otherlv_0= '[' this_GraphqlType_1= ruleGraphqlType otherlv_2= ']' ) )
            // InternalGraphqlidl.g:1107:2: (otherlv_0= '[' this_GraphqlType_1= ruleGraphqlType otherlv_2= ']' )
            {
            // InternalGraphqlidl.g:1107:2: (otherlv_0= '[' this_GraphqlType_1= ruleGraphqlType otherlv_2= ']' )
            // InternalGraphqlidl.g:1108:3: otherlv_0= '[' this_GraphqlType_1= ruleGraphqlType otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphqlListTypeAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getGraphqlListTypeAccess().getGraphqlTypeParserRuleCall_1());
            		
            pushFollow(FOLLOW_22);
            this_GraphqlType_1=ruleGraphqlType();

            state._fsp--;


            			current = this_GraphqlType_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphqlListTypeAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlListType"


    // $ANTLR start "entryRuleGraphqlInputType"
    // InternalGraphqlidl.g:1128:1: entryRuleGraphqlInputType returns [EObject current=null] : iv_ruleGraphqlInputType= ruleGraphqlInputType EOF ;
    public final EObject entryRuleGraphqlInputType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlInputType = null;


        try {
            // InternalGraphqlidl.g:1128:57: (iv_ruleGraphqlInputType= ruleGraphqlInputType EOF )
            // InternalGraphqlidl.g:1129:2: iv_ruleGraphqlInputType= ruleGraphqlInputType EOF
            {
             newCompositeNode(grammarAccess.getGraphqlInputTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlInputType=ruleGraphqlInputType();

            state._fsp--;

             current =iv_ruleGraphqlInputType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlInputType"


    // $ANTLR start "ruleGraphqlInputType"
    // InternalGraphqlidl.g:1135:1: ruleGraphqlInputType returns [EObject current=null] : ( ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) | ( ( (lv_ntype_2_0= ruleGraphqlNamedType ) ) ( (lv_nonNull_3_0= '!' ) )? ) | ( ( (lv_ltype_4_0= ruleGraphqlListInputType ) ) ( (lv_nonNull_5_0= '!' ) )? ) ) ;
    public final EObject ruleGraphqlInputType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nonNull_1_0=null;
        Token lv_nonNull_3_0=null;
        Token lv_nonNull_5_0=null;
        EObject lv_ntype_2_0 = null;

        EObject lv_ltype_4_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:1141:2: ( ( ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) | ( ( (lv_ntype_2_0= ruleGraphqlNamedType ) ) ( (lv_nonNull_3_0= '!' ) )? ) | ( ( (lv_ltype_4_0= ruleGraphqlListInputType ) ) ( (lv_nonNull_5_0= '!' ) )? ) ) )
            // InternalGraphqlidl.g:1142:2: ( ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) | ( ( (lv_ntype_2_0= ruleGraphqlNamedType ) ) ( (lv_nonNull_3_0= '!' ) )? ) | ( ( (lv_ltype_4_0= ruleGraphqlListInputType ) ) ( (lv_nonNull_5_0= '!' ) )? ) )
            {
            // InternalGraphqlidl.g:1142:2: ( ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? ) | ( ( (lv_ntype_2_0= ruleGraphqlNamedType ) ) ( (lv_nonNull_3_0= '!' ) )? ) | ( ( (lv_ltype_4_0= ruleGraphqlListInputType ) ) ( (lv_nonNull_5_0= '!' ) )? ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case RULE_NAME:
                {
                alt21=1;
                }
                break;
            case RULE_SCALAR:
                {
                alt21=2;
                }
                break;
            case 38:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalGraphqlidl.g:1143:3: ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? )
                    {
                    // InternalGraphqlidl.g:1143:3: ( ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )? )
                    // InternalGraphqlidl.g:1144:4: ( (otherlv_0= RULE_NAME ) ) ( (lv_nonNull_1_0= '!' ) )?
                    {
                    // InternalGraphqlidl.g:1144:4: ( (otherlv_0= RULE_NAME ) )
                    // InternalGraphqlidl.g:1145:5: (otherlv_0= RULE_NAME )
                    {
                    // InternalGraphqlidl.g:1145:5: (otherlv_0= RULE_NAME )
                    // InternalGraphqlidl.g:1146:6: otherlv_0= RULE_NAME
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphqlInputTypeRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_21); 

                    						newLeafNode(otherlv_0, grammarAccess.getGraphqlInputTypeAccess().getDtypeGraphqlInputTypeDefinitionCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalGraphqlidl.g:1157:4: ( (lv_nonNull_1_0= '!' ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==37) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalGraphqlidl.g:1158:5: (lv_nonNull_1_0= '!' )
                            {
                            // InternalGraphqlidl.g:1158:5: (lv_nonNull_1_0= '!' )
                            // InternalGraphqlidl.g:1159:6: lv_nonNull_1_0= '!'
                            {
                            lv_nonNull_1_0=(Token)match(input,37,FOLLOW_2); 

                            						newLeafNode(lv_nonNull_1_0, grammarAccess.getGraphqlInputTypeAccess().getNonNullExclamationMarkKeyword_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getGraphqlInputTypeRule());
                            						}
                            						setWithLastConsumed(current, "nonNull", true, "!");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:1173:3: ( ( (lv_ntype_2_0= ruleGraphqlNamedType ) ) ( (lv_nonNull_3_0= '!' ) )? )
                    {
                    // InternalGraphqlidl.g:1173:3: ( ( (lv_ntype_2_0= ruleGraphqlNamedType ) ) ( (lv_nonNull_3_0= '!' ) )? )
                    // InternalGraphqlidl.g:1174:4: ( (lv_ntype_2_0= ruleGraphqlNamedType ) ) ( (lv_nonNull_3_0= '!' ) )?
                    {
                    // InternalGraphqlidl.g:1174:4: ( (lv_ntype_2_0= ruleGraphqlNamedType ) )
                    // InternalGraphqlidl.g:1175:5: (lv_ntype_2_0= ruleGraphqlNamedType )
                    {
                    // InternalGraphqlidl.g:1175:5: (lv_ntype_2_0= ruleGraphqlNamedType )
                    // InternalGraphqlidl.g:1176:6: lv_ntype_2_0= ruleGraphqlNamedType
                    {

                    						newCompositeNode(grammarAccess.getGraphqlInputTypeAccess().getNtypeGraphqlNamedTypeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_ntype_2_0=ruleGraphqlNamedType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphqlInputTypeRule());
                    						}
                    						set(
                    							current,
                    							"ntype",
                    							lv_ntype_2_0,
                    							"oda.graphql.language.Graphqlidl.GraphqlNamedType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphqlidl.g:1193:4: ( (lv_nonNull_3_0= '!' ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==37) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalGraphqlidl.g:1194:5: (lv_nonNull_3_0= '!' )
                            {
                            // InternalGraphqlidl.g:1194:5: (lv_nonNull_3_0= '!' )
                            // InternalGraphqlidl.g:1195:6: lv_nonNull_3_0= '!'
                            {
                            lv_nonNull_3_0=(Token)match(input,37,FOLLOW_2); 

                            						newLeafNode(lv_nonNull_3_0, grammarAccess.getGraphqlInputTypeAccess().getNonNullExclamationMarkKeyword_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getGraphqlInputTypeRule());
                            						}
                            						setWithLastConsumed(current, "nonNull", true, "!");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGraphqlidl.g:1209:3: ( ( (lv_ltype_4_0= ruleGraphqlListInputType ) ) ( (lv_nonNull_5_0= '!' ) )? )
                    {
                    // InternalGraphqlidl.g:1209:3: ( ( (lv_ltype_4_0= ruleGraphqlListInputType ) ) ( (lv_nonNull_5_0= '!' ) )? )
                    // InternalGraphqlidl.g:1210:4: ( (lv_ltype_4_0= ruleGraphqlListInputType ) ) ( (lv_nonNull_5_0= '!' ) )?
                    {
                    // InternalGraphqlidl.g:1210:4: ( (lv_ltype_4_0= ruleGraphqlListInputType ) )
                    // InternalGraphqlidl.g:1211:5: (lv_ltype_4_0= ruleGraphqlListInputType )
                    {
                    // InternalGraphqlidl.g:1211:5: (lv_ltype_4_0= ruleGraphqlListInputType )
                    // InternalGraphqlidl.g:1212:6: lv_ltype_4_0= ruleGraphqlListInputType
                    {

                    						newCompositeNode(grammarAccess.getGraphqlInputTypeAccess().getLtypeGraphqlListInputTypeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_ltype_4_0=ruleGraphqlListInputType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphqlInputTypeRule());
                    						}
                    						set(
                    							current,
                    							"ltype",
                    							lv_ltype_4_0,
                    							"oda.graphql.language.Graphqlidl.GraphqlListInputType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphqlidl.g:1229:4: ( (lv_nonNull_5_0= '!' ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==37) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalGraphqlidl.g:1230:5: (lv_nonNull_5_0= '!' )
                            {
                            // InternalGraphqlidl.g:1230:5: (lv_nonNull_5_0= '!' )
                            // InternalGraphqlidl.g:1231:6: lv_nonNull_5_0= '!'
                            {
                            lv_nonNull_5_0=(Token)match(input,37,FOLLOW_2); 

                            						newLeafNode(lv_nonNull_5_0, grammarAccess.getGraphqlInputTypeAccess().getNonNullExclamationMarkKeyword_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getGraphqlInputTypeRule());
                            						}
                            						setWithLastConsumed(current, "nonNull", true, "!");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlInputType"


    // $ANTLR start "entryRuleGraphqlListInputType"
    // InternalGraphqlidl.g:1248:1: entryRuleGraphqlListInputType returns [EObject current=null] : iv_ruleGraphqlListInputType= ruleGraphqlListInputType EOF ;
    public final EObject entryRuleGraphqlListInputType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlListInputType = null;


        try {
            // InternalGraphqlidl.g:1248:61: (iv_ruleGraphqlListInputType= ruleGraphqlListInputType EOF )
            // InternalGraphqlidl.g:1249:2: iv_ruleGraphqlListInputType= ruleGraphqlListInputType EOF
            {
             newCompositeNode(grammarAccess.getGraphqlListInputTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlListInputType=ruleGraphqlListInputType();

            state._fsp--;

             current =iv_ruleGraphqlListInputType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlListInputType"


    // $ANTLR start "ruleGraphqlListInputType"
    // InternalGraphqlidl.g:1255:1: ruleGraphqlListInputType returns [EObject current=null] : (otherlv_0= '[' this_GraphqlInputType_1= ruleGraphqlInputType otherlv_2= ']' ) ;
    public final EObject ruleGraphqlListInputType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_GraphqlInputType_1 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:1261:2: ( (otherlv_0= '[' this_GraphqlInputType_1= ruleGraphqlInputType otherlv_2= ']' ) )
            // InternalGraphqlidl.g:1262:2: (otherlv_0= '[' this_GraphqlInputType_1= ruleGraphqlInputType otherlv_2= ']' )
            {
            // InternalGraphqlidl.g:1262:2: (otherlv_0= '[' this_GraphqlInputType_1= ruleGraphqlInputType otherlv_2= ']' )
            // InternalGraphqlidl.g:1263:3: otherlv_0= '[' this_GraphqlInputType_1= ruleGraphqlInputType otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphqlListInputTypeAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getGraphqlListInputTypeAccess().getGraphqlInputTypeParserRuleCall_1());
            		
            pushFollow(FOLLOW_22);
            this_GraphqlInputType_1=ruleGraphqlInputType();

            state._fsp--;


            			current = this_GraphqlInputType_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphqlListInputTypeAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlListInputType"


    // $ANTLR start "entryRuleArgument"
    // InternalGraphqlidl.g:1283:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalGraphqlidl.g:1283:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalGraphqlidl.g:1284:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalGraphqlidl.g:1290:1: ruleArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_type_2_0= ruleGraphqlType ) ) (otherlv_3= '=' ( (lv_defValue_4_0= ruleGraphqlValue ) ) )? ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_defValue_4_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:1296:2: ( ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_type_2_0= ruleGraphqlType ) ) (otherlv_3= '=' ( (lv_defValue_4_0= ruleGraphqlValue ) ) )? ) )
            // InternalGraphqlidl.g:1297:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_type_2_0= ruleGraphqlType ) ) (otherlv_3= '=' ( (lv_defValue_4_0= ruleGraphqlValue ) ) )? )
            {
            // InternalGraphqlidl.g:1297:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_type_2_0= ruleGraphqlType ) ) (otherlv_3= '=' ( (lv_defValue_4_0= ruleGraphqlValue ) ) )? )
            // InternalGraphqlidl.g:1298:3: ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_type_2_0= ruleGraphqlType ) ) (otherlv_3= '=' ( (lv_defValue_4_0= ruleGraphqlValue ) ) )?
            {
            // InternalGraphqlidl.g:1298:3: ( (lv_name_0_0= RULE_NAME ) )
            // InternalGraphqlidl.g:1299:4: (lv_name_0_0= RULE_NAME )
            {
            // InternalGraphqlidl.g:1299:4: (lv_name_0_0= RULE_NAME )
            // InternalGraphqlidl.g:1300:5: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getArgumentAccess().getNameNAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"oda.graphql.language.Graphqlidl.NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getColonKeyword_1());
            		
            // InternalGraphqlidl.g:1320:3: ( (lv_type_2_0= ruleGraphqlType ) )
            // InternalGraphqlidl.g:1321:4: (lv_type_2_0= ruleGraphqlType )
            {
            // InternalGraphqlidl.g:1321:4: (lv_type_2_0= ruleGraphqlType )
            // InternalGraphqlidl.g:1322:5: lv_type_2_0= ruleGraphqlType
            {

            					newCompositeNode(grammarAccess.getArgumentAccess().getTypeGraphqlTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_type_2_0=ruleGraphqlType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgumentRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"oda.graphql.language.Graphqlidl.GraphqlType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGraphqlidl.g:1339:3: (otherlv_3= '=' ( (lv_defValue_4_0= ruleGraphqlValue ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGraphqlidl.g:1340:4: otherlv_3= '=' ( (lv_defValue_4_0= ruleGraphqlValue ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getArgumentAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalGraphqlidl.g:1344:4: ( (lv_defValue_4_0= ruleGraphqlValue ) )
                    // InternalGraphqlidl.g:1345:5: (lv_defValue_4_0= ruleGraphqlValue )
                    {
                    // InternalGraphqlidl.g:1345:5: (lv_defValue_4_0= ruleGraphqlValue )
                    // InternalGraphqlidl.g:1346:6: lv_defValue_4_0= ruleGraphqlValue
                    {

                    						newCompositeNode(grammarAccess.getArgumentAccess().getDefValueGraphqlValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_defValue_4_0=ruleGraphqlValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArgumentRule());
                    						}
                    						set(
                    							current,
                    							"defValue",
                    							lv_defValue_4_0,
                    							"oda.graphql.language.Graphqlidl.GraphqlValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleGraphqlValue"
    // InternalGraphqlidl.g:1368:1: entryRuleGraphqlValue returns [EObject current=null] : iv_ruleGraphqlValue= ruleGraphqlValue EOF ;
    public final EObject entryRuleGraphqlValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphqlValue = null;


        try {
            // InternalGraphqlidl.g:1368:53: (iv_ruleGraphqlValue= ruleGraphqlValue EOF )
            // InternalGraphqlidl.g:1369:2: iv_ruleGraphqlValue= ruleGraphqlValue EOF
            {
             newCompositeNode(grammarAccess.getGraphqlValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphqlValue=ruleGraphqlValue();

            state._fsp--;

             current =iv_ruleGraphqlValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphqlValue"


    // $ANTLR start "ruleGraphqlValue"
    // InternalGraphqlidl.g:1375:1: ruleGraphqlValue returns [EObject current=null] : ( ( (lv_sv_0_0= ruleSingleValue ) ) | ( (otherlv_1= RULE_NAME ) ) | ( (lv_cv_2_0= ruleComplexValue ) ) ) ;
    public final EObject ruleGraphqlValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sv_0_0 = null;

        EObject lv_cv_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:1381:2: ( ( ( (lv_sv_0_0= ruleSingleValue ) ) | ( (otherlv_1= RULE_NAME ) ) | ( (lv_cv_2_0= ruleComplexValue ) ) ) )
            // InternalGraphqlidl.g:1382:2: ( ( (lv_sv_0_0= ruleSingleValue ) ) | ( (otherlv_1= RULE_NAME ) ) | ( (lv_cv_2_0= ruleComplexValue ) ) )
            {
            // InternalGraphqlidl.g:1382:2: ( ( (lv_sv_0_0= ruleSingleValue ) ) | ( (otherlv_1= RULE_NAME ) ) | ( (lv_cv_2_0= ruleComplexValue ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEANVALUE:
            case RULE_NULLVALUE:
            case RULE_NONZERODIGIT:
            case 40:
            case 41:
            case 46:
                {
                alt23=1;
                }
                break;
            case RULE_NAME:
                {
                alt23=2;
                }
                break;
            case 20:
            case 38:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalGraphqlidl.g:1383:3: ( (lv_sv_0_0= ruleSingleValue ) )
                    {
                    // InternalGraphqlidl.g:1383:3: ( (lv_sv_0_0= ruleSingleValue ) )
                    // InternalGraphqlidl.g:1384:4: (lv_sv_0_0= ruleSingleValue )
                    {
                    // InternalGraphqlidl.g:1384:4: (lv_sv_0_0= ruleSingleValue )
                    // InternalGraphqlidl.g:1385:5: lv_sv_0_0= ruleSingleValue
                    {

                    					newCompositeNode(grammarAccess.getGraphqlValueAccess().getSvSingleValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_sv_0_0=ruleSingleValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGraphqlValueRule());
                    					}
                    					set(
                    						current,
                    						"sv",
                    						lv_sv_0_0,
                    						"oda.graphql.language.Graphqlidl.SingleValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:1403:3: ( (otherlv_1= RULE_NAME ) )
                    {
                    // InternalGraphqlidl.g:1403:3: ( (otherlv_1= RULE_NAME ) )
                    // InternalGraphqlidl.g:1404:4: (otherlv_1= RULE_NAME )
                    {
                    // InternalGraphqlidl.g:1404:4: (otherlv_1= RULE_NAME )
                    // InternalGraphqlidl.g:1405:5: otherlv_1= RULE_NAME
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGraphqlValueRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_NAME,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getGraphqlValueAccess().getEvEnumValueCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGraphqlidl.g:1417:3: ( (lv_cv_2_0= ruleComplexValue ) )
                    {
                    // InternalGraphqlidl.g:1417:3: ( (lv_cv_2_0= ruleComplexValue ) )
                    // InternalGraphqlidl.g:1418:4: (lv_cv_2_0= ruleComplexValue )
                    {
                    // InternalGraphqlidl.g:1418:4: (lv_cv_2_0= ruleComplexValue )
                    // InternalGraphqlidl.g:1419:5: lv_cv_2_0= ruleComplexValue
                    {

                    					newCompositeNode(grammarAccess.getGraphqlValueAccess().getCvComplexValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cv_2_0=ruleComplexValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGraphqlValueRule());
                    					}
                    					set(
                    						current,
                    						"cv",
                    						lv_cv_2_0,
                    						"oda.graphql.language.Graphqlidl.ComplexValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphqlValue"


    // $ANTLR start "entryRuleSingleValue"
    // InternalGraphqlidl.g:1440:1: entryRuleSingleValue returns [EObject current=null] : iv_ruleSingleValue= ruleSingleValue EOF ;
    public final EObject entryRuleSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValue = null;


        try {
            // InternalGraphqlidl.g:1440:52: (iv_ruleSingleValue= ruleSingleValue EOF )
            // InternalGraphqlidl.g:1441:2: iv_ruleSingleValue= ruleSingleValue EOF
            {
             newCompositeNode(grammarAccess.getSingleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleValue=ruleSingleValue();

            state._fsp--;

             current =iv_ruleSingleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleValue"


    // $ANTLR start "ruleSingleValue"
    // InternalGraphqlidl.g:1447:1: ruleSingleValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleIntValue ) ) | ( (lv_value_1_0= ruleFloatValue ) ) | ( (lv_value_2_0= ruleStringValue ) ) | ( (lv_value_3_0= RULE_BOOLEANVALUE ) ) | ( (lv_value_4_0= RULE_NULLVALUE ) ) ) ;
    public final EObject ruleSingleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_3_0=null;
        Token lv_value_4_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:1453:2: ( ( ( (lv_value_0_0= ruleIntValue ) ) | ( (lv_value_1_0= ruleFloatValue ) ) | ( (lv_value_2_0= ruleStringValue ) ) | ( (lv_value_3_0= RULE_BOOLEANVALUE ) ) | ( (lv_value_4_0= RULE_NULLVALUE ) ) ) )
            // InternalGraphqlidl.g:1454:2: ( ( (lv_value_0_0= ruleIntValue ) ) | ( (lv_value_1_0= ruleFloatValue ) ) | ( (lv_value_2_0= ruleStringValue ) ) | ( (lv_value_3_0= RULE_BOOLEANVALUE ) ) | ( (lv_value_4_0= RULE_NULLVALUE ) ) )
            {
            // InternalGraphqlidl.g:1454:2: ( ( (lv_value_0_0= ruleIntValue ) ) | ( (lv_value_1_0= ruleFloatValue ) ) | ( (lv_value_2_0= ruleStringValue ) ) | ( (lv_value_3_0= RULE_BOOLEANVALUE ) ) | ( (lv_value_4_0= RULE_NULLVALUE ) ) )
            int alt24=5;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalGraphqlidl.g:1455:3: ( (lv_value_0_0= ruleIntValue ) )
                    {
                    // InternalGraphqlidl.g:1455:3: ( (lv_value_0_0= ruleIntValue ) )
                    // InternalGraphqlidl.g:1456:4: (lv_value_0_0= ruleIntValue )
                    {
                    // InternalGraphqlidl.g:1456:4: (lv_value_0_0= ruleIntValue )
                    // InternalGraphqlidl.g:1457:5: lv_value_0_0= ruleIntValue
                    {

                    					newCompositeNode(grammarAccess.getSingleValueAccess().getValueIntValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleIntValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"oda.graphql.language.Graphqlidl.IntValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:1475:3: ( (lv_value_1_0= ruleFloatValue ) )
                    {
                    // InternalGraphqlidl.g:1475:3: ( (lv_value_1_0= ruleFloatValue ) )
                    // InternalGraphqlidl.g:1476:4: (lv_value_1_0= ruleFloatValue )
                    {
                    // InternalGraphqlidl.g:1476:4: (lv_value_1_0= ruleFloatValue )
                    // InternalGraphqlidl.g:1477:5: lv_value_1_0= ruleFloatValue
                    {

                    					newCompositeNode(grammarAccess.getSingleValueAccess().getValueFloatValueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleFloatValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"oda.graphql.language.Graphqlidl.FloatValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGraphqlidl.g:1495:3: ( (lv_value_2_0= ruleStringValue ) )
                    {
                    // InternalGraphqlidl.g:1495:3: ( (lv_value_2_0= ruleStringValue ) )
                    // InternalGraphqlidl.g:1496:4: (lv_value_2_0= ruleStringValue )
                    {
                    // InternalGraphqlidl.g:1496:4: (lv_value_2_0= ruleStringValue )
                    // InternalGraphqlidl.g:1497:5: lv_value_2_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getSingleValueAccess().getValueStringValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"oda.graphql.language.Graphqlidl.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGraphqlidl.g:1515:3: ( (lv_value_3_0= RULE_BOOLEANVALUE ) )
                    {
                    // InternalGraphqlidl.g:1515:3: ( (lv_value_3_0= RULE_BOOLEANVALUE ) )
                    // InternalGraphqlidl.g:1516:4: (lv_value_3_0= RULE_BOOLEANVALUE )
                    {
                    // InternalGraphqlidl.g:1516:4: (lv_value_3_0= RULE_BOOLEANVALUE )
                    // InternalGraphqlidl.g:1517:5: lv_value_3_0= RULE_BOOLEANVALUE
                    {
                    lv_value_3_0=(Token)match(input,RULE_BOOLEANVALUE,FOLLOW_2); 

                    					newLeafNode(lv_value_3_0, grammarAccess.getSingleValueAccess().getValueBOOLEANVALUETerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSingleValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"oda.graphql.language.Graphqlidl.BOOLEANVALUE");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGraphqlidl.g:1534:3: ( (lv_value_4_0= RULE_NULLVALUE ) )
                    {
                    // InternalGraphqlidl.g:1534:3: ( (lv_value_4_0= RULE_NULLVALUE ) )
                    // InternalGraphqlidl.g:1535:4: (lv_value_4_0= RULE_NULLVALUE )
                    {
                    // InternalGraphqlidl.g:1535:4: (lv_value_4_0= RULE_NULLVALUE )
                    // InternalGraphqlidl.g:1536:5: lv_value_4_0= RULE_NULLVALUE
                    {
                    lv_value_4_0=(Token)match(input,RULE_NULLVALUE,FOLLOW_2); 

                    					newLeafNode(lv_value_4_0, grammarAccess.getSingleValueAccess().getValueNULLVALUETerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSingleValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_4_0,
                    						"oda.graphql.language.Graphqlidl.NULLVALUE");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleValue"


    // $ANTLR start "entryRuleComplexValue"
    // InternalGraphqlidl.g:1556:1: entryRuleComplexValue returns [EObject current=null] : iv_ruleComplexValue= ruleComplexValue EOF ;
    public final EObject entryRuleComplexValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexValue = null;


        try {
            // InternalGraphqlidl.g:1556:53: (iv_ruleComplexValue= ruleComplexValue EOF )
            // InternalGraphqlidl.g:1557:2: iv_ruleComplexValue= ruleComplexValue EOF
            {
             newCompositeNode(grammarAccess.getComplexValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexValue=ruleComplexValue();

            state._fsp--;

             current =iv_ruleComplexValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexValue"


    // $ANTLR start "ruleComplexValue"
    // InternalGraphqlidl.g:1563:1: ruleComplexValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleListValue ) ) | ( (lv_value_1_0= ruleObjectValue ) ) ) ;
    public final EObject ruleComplexValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:1569:2: ( ( ( (lv_value_0_0= ruleListValue ) ) | ( (lv_value_1_0= ruleObjectValue ) ) ) )
            // InternalGraphqlidl.g:1570:2: ( ( (lv_value_0_0= ruleListValue ) ) | ( (lv_value_1_0= ruleObjectValue ) ) )
            {
            // InternalGraphqlidl.g:1570:2: ( ( (lv_value_0_0= ruleListValue ) ) | ( (lv_value_1_0= ruleObjectValue ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            else if ( (LA25_0==20) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalGraphqlidl.g:1571:3: ( (lv_value_0_0= ruleListValue ) )
                    {
                    // InternalGraphqlidl.g:1571:3: ( (lv_value_0_0= ruleListValue ) )
                    // InternalGraphqlidl.g:1572:4: (lv_value_0_0= ruleListValue )
                    {
                    // InternalGraphqlidl.g:1572:4: (lv_value_0_0= ruleListValue )
                    // InternalGraphqlidl.g:1573:5: lv_value_0_0= ruleListValue
                    {

                    					newCompositeNode(grammarAccess.getComplexValueAccess().getValueListValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleListValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComplexValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"oda.graphql.language.Graphqlidl.ListValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:1591:3: ( (lv_value_1_0= ruleObjectValue ) )
                    {
                    // InternalGraphqlidl.g:1591:3: ( (lv_value_1_0= ruleObjectValue ) )
                    // InternalGraphqlidl.g:1592:4: (lv_value_1_0= ruleObjectValue )
                    {
                    // InternalGraphqlidl.g:1592:4: (lv_value_1_0= ruleObjectValue )
                    // InternalGraphqlidl.g:1593:5: lv_value_1_0= ruleObjectValue
                    {

                    					newCompositeNode(grammarAccess.getComplexValueAccess().getValueObjectValueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleObjectValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComplexValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"oda.graphql.language.Graphqlidl.ObjectValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexValue"


    // $ANTLR start "entryRuleEnumValue"
    // InternalGraphqlidl.g:1614:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalGraphqlidl.g:1614:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalGraphqlidl.g:1615:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
             newCompositeNode(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;

             current =iv_ruleEnumValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalGraphqlidl.g:1621:1: ruleEnumValue returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ENUM_VALUE ) ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGraphqlidl.g:1627:2: ( ( () ( (lv_name_1_0= RULE_ENUM_VALUE ) ) ) )
            // InternalGraphqlidl.g:1628:2: ( () ( (lv_name_1_0= RULE_ENUM_VALUE ) ) )
            {
            // InternalGraphqlidl.g:1628:2: ( () ( (lv_name_1_0= RULE_ENUM_VALUE ) ) )
            // InternalGraphqlidl.g:1629:3: () ( (lv_name_1_0= RULE_ENUM_VALUE ) )
            {
            // InternalGraphqlidl.g:1629:3: ()
            // InternalGraphqlidl.g:1630:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumValueAccess().getEnumValueAction_0(),
            					current);
            			

            }

            // InternalGraphqlidl.g:1636:3: ( (lv_name_1_0= RULE_ENUM_VALUE ) )
            // InternalGraphqlidl.g:1637:4: (lv_name_1_0= RULE_ENUM_VALUE )
            {
            // InternalGraphqlidl.g:1637:4: (lv_name_1_0= RULE_ENUM_VALUE )
            // InternalGraphqlidl.g:1638:5: lv_name_1_0= RULE_ENUM_VALUE
            {
            lv_name_1_0=(Token)match(input,RULE_ENUM_VALUE,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumValueAccess().getNameENUM_VALUETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"oda.graphql.language.Graphqlidl.ENUM_VALUE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleListValue"
    // InternalGraphqlidl.g:1658:1: entryRuleListValue returns [EObject current=null] : iv_ruleListValue= ruleListValue EOF ;
    public final EObject entryRuleListValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListValue = null;


        try {
            // InternalGraphqlidl.g:1658:50: (iv_ruleListValue= ruleListValue EOF )
            // InternalGraphqlidl.g:1659:2: iv_ruleListValue= ruleListValue EOF
            {
             newCompositeNode(grammarAccess.getListValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListValue=ruleListValue();

            state._fsp--;

             current =iv_ruleListValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // InternalGraphqlidl.g:1665:1: ruleListValue returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_values_2_0= ruleGraphqlValue ) )* otherlv_3= ']' ) ;
    public final EObject ruleListValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:1671:2: ( ( () otherlv_1= '[' ( (lv_values_2_0= ruleGraphqlValue ) )* otherlv_3= ']' ) )
            // InternalGraphqlidl.g:1672:2: ( () otherlv_1= '[' ( (lv_values_2_0= ruleGraphqlValue ) )* otherlv_3= ']' )
            {
            // InternalGraphqlidl.g:1672:2: ( () otherlv_1= '[' ( (lv_values_2_0= ruleGraphqlValue ) )* otherlv_3= ']' )
            // InternalGraphqlidl.g:1673:3: () otherlv_1= '[' ( (lv_values_2_0= ruleGraphqlValue ) )* otherlv_3= ']'
            {
            // InternalGraphqlidl.g:1673:3: ()
            // InternalGraphqlidl.g:1674:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListValueAccess().getListValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalGraphqlidl.g:1684:3: ( (lv_values_2_0= ruleGraphqlValue ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_NAME||(LA26_0>=RULE_BOOLEANVALUE && LA26_0<=RULE_NULLVALUE)||LA26_0==RULE_NONZERODIGIT||LA26_0==20||LA26_0==38||(LA26_0>=40 && LA26_0<=41)||LA26_0==46) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGraphqlidl.g:1685:4: (lv_values_2_0= ruleGraphqlValue )
            	    {
            	    // InternalGraphqlidl.g:1685:4: (lv_values_2_0= ruleGraphqlValue )
            	    // InternalGraphqlidl.g:1686:5: lv_values_2_0= ruleGraphqlValue
            	    {

            	    					newCompositeNode(grammarAccess.getListValueAccess().getValuesGraphqlValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_values_2_0=ruleGraphqlValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_2_0,
            	    						"oda.graphql.language.Graphqlidl.GraphqlValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_3=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListValue"


    // $ANTLR start "entryRuleObjectValue"
    // InternalGraphqlidl.g:1711:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalGraphqlidl.g:1711:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalGraphqlidl.g:1712:2: iv_ruleObjectValue= ruleObjectValue EOF
            {
             newCompositeNode(grammarAccess.getObjectValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectValue=ruleObjectValue();

            state._fsp--;

             current =iv_ruleObjectValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectValue"


    // $ANTLR start "ruleObjectValue"
    // InternalGraphqlidl.g:1718:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:1724:2: ( ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' ) )
            // InternalGraphqlidl.g:1725:2: ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' )
            {
            // InternalGraphqlidl.g:1725:2: ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' )
            // InternalGraphqlidl.g:1726:3: () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}'
            {
            // InternalGraphqlidl.g:1726:3: ()
            // InternalGraphqlidl.g:1727:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGraphqlidl.g:1737:3: ( (lv_fields_2_0= ruleObjectField ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_NAME) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGraphqlidl.g:1738:4: (lv_fields_2_0= ruleObjectField )
            	    {
            	    // InternalGraphqlidl.g:1738:4: (lv_fields_2_0= ruleObjectField )
            	    // InternalGraphqlidl.g:1739:5: lv_fields_2_0= ruleObjectField
            	    {

            	    					newCompositeNode(grammarAccess.getObjectValueAccess().getFieldsObjectFieldParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_fields_2_0=ruleObjectField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_2_0,
            	    						"oda.graphql.language.Graphqlidl.ObjectField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectValue"


    // $ANTLR start "entryRuleObjectField"
    // InternalGraphqlidl.g:1764:1: entryRuleObjectField returns [EObject current=null] : iv_ruleObjectField= ruleObjectField EOF ;
    public final EObject entryRuleObjectField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectField = null;


        try {
            // InternalGraphqlidl.g:1764:52: (iv_ruleObjectField= ruleObjectField EOF )
            // InternalGraphqlidl.g:1765:2: iv_ruleObjectField= ruleObjectField EOF
            {
             newCompositeNode(grammarAccess.getObjectFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectField=ruleObjectField();

            state._fsp--;

             current =iv_ruleObjectField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectField"


    // $ANTLR start "ruleObjectField"
    // InternalGraphqlidl.g:1771:1: ruleObjectField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleGraphqlValue ) ) ) ;
    public final EObject ruleObjectField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:1777:2: ( ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleGraphqlValue ) ) ) )
            // InternalGraphqlidl.g:1778:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleGraphqlValue ) ) )
            {
            // InternalGraphqlidl.g:1778:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleGraphqlValue ) ) )
            // InternalGraphqlidl.g:1779:3: ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleGraphqlValue ) )
            {
            // InternalGraphqlidl.g:1779:3: ( (lv_name_0_0= RULE_NAME ) )
            // InternalGraphqlidl.g:1780:4: (lv_name_0_0= RULE_NAME )
            {
            // InternalGraphqlidl.g:1780:4: (lv_name_0_0= RULE_NAME )
            // InternalGraphqlidl.g:1781:5: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getObjectFieldAccess().getNameNAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"oda.graphql.language.Graphqlidl.NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectFieldAccess().getColonKeyword_1());
            		
            // InternalGraphqlidl.g:1801:3: ( (lv_value_2_0= ruleGraphqlValue ) )
            // InternalGraphqlidl.g:1802:4: (lv_value_2_0= ruleGraphqlValue )
            {
            // InternalGraphqlidl.g:1802:4: (lv_value_2_0= ruleGraphqlValue )
            // InternalGraphqlidl.g:1803:5: lv_value_2_0= ruleGraphqlValue
            {

            					newCompositeNode(grammarAccess.getObjectFieldAccess().getValueGraphqlValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleGraphqlValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"oda.graphql.language.Graphqlidl.GraphqlValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectField"


    // $ANTLR start "entryRuleIntValue"
    // InternalGraphqlidl.g:1824:1: entryRuleIntValue returns [String current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final String entryRuleIntValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntValue = null;


        try {
            // InternalGraphqlidl.g:1824:48: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalGraphqlidl.g:1825:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalGraphqlidl.g:1831:1: ruleIntValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IntegerPart_0= ruleIntegerPart ;
    public final AntlrDatatypeRuleToken ruleIntValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntegerPart_0 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:1837:2: (this_IntegerPart_0= ruleIntegerPart )
            // InternalGraphqlidl.g:1838:2: this_IntegerPart_0= ruleIntegerPart
            {

            		newCompositeNode(grammarAccess.getIntValueAccess().getIntegerPartParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_IntegerPart_0=ruleIntegerPart();

            state._fsp--;


            		current.merge(this_IntegerPart_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleIntegerPart"
    // InternalGraphqlidl.g:1851:1: entryRuleIntegerPart returns [String current=null] : iv_ruleIntegerPart= ruleIntegerPart EOF ;
    public final String entryRuleIntegerPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerPart = null;


        try {
            // InternalGraphqlidl.g:1851:51: (iv_ruleIntegerPart= ruleIntegerPart EOF )
            // InternalGraphqlidl.g:1852:2: iv_ruleIntegerPart= ruleIntegerPart EOF
            {
             newCompositeNode(grammarAccess.getIntegerPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerPart=ruleIntegerPart();

            state._fsp--;

             current =iv_ruleIntegerPart.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerPart"


    // $ANTLR start "ruleIntegerPart"
    // InternalGraphqlidl.g:1858:1: ruleIntegerPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NegativeSign_0= ruleNegativeSign )? kw= '0' ) | ( (this_NegativeSign_2= ruleNegativeSign )? this_NONZERODIGIT_3= RULE_NONZERODIGIT this_INT_4= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleIntegerPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NONZERODIGIT_3=null;
        Token this_INT_4=null;
        AntlrDatatypeRuleToken this_NegativeSign_0 = null;

        AntlrDatatypeRuleToken this_NegativeSign_2 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:1864:2: ( ( ( (this_NegativeSign_0= ruleNegativeSign )? kw= '0' ) | ( (this_NegativeSign_2= ruleNegativeSign )? this_NONZERODIGIT_3= RULE_NONZERODIGIT this_INT_4= RULE_INT ) ) )
            // InternalGraphqlidl.g:1865:2: ( ( (this_NegativeSign_0= ruleNegativeSign )? kw= '0' ) | ( (this_NegativeSign_2= ruleNegativeSign )? this_NONZERODIGIT_3= RULE_NONZERODIGIT this_INT_4= RULE_INT ) )
            {
            // InternalGraphqlidl.g:1865:2: ( ( (this_NegativeSign_0= ruleNegativeSign )? kw= '0' ) | ( (this_NegativeSign_2= ruleNegativeSign )? this_NONZERODIGIT_3= RULE_NONZERODIGIT this_INT_4= RULE_INT ) )
            int alt30=2;
            switch ( input.LA(1) ) {
            case 41:
                {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==40) ) {
                    alt30=1;
                }
                else if ( (LA30_1==RULE_NONZERODIGIT) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt30=1;
                }
                break;
            case RULE_NONZERODIGIT:
                {
                alt30=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalGraphqlidl.g:1866:3: ( (this_NegativeSign_0= ruleNegativeSign )? kw= '0' )
                    {
                    // InternalGraphqlidl.g:1866:3: ( (this_NegativeSign_0= ruleNegativeSign )? kw= '0' )
                    // InternalGraphqlidl.g:1867:4: (this_NegativeSign_0= ruleNegativeSign )? kw= '0'
                    {
                    // InternalGraphqlidl.g:1867:4: (this_NegativeSign_0= ruleNegativeSign )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==41) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalGraphqlidl.g:1868:5: this_NegativeSign_0= ruleNegativeSign
                            {

                            					newCompositeNode(grammarAccess.getIntegerPartAccess().getNegativeSignParserRuleCall_0_0());
                            				
                            pushFollow(FOLLOW_26);
                            this_NegativeSign_0=ruleNegativeSign();

                            state._fsp--;


                            					current.merge(this_NegativeSign_0);
                            				

                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,40,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerPartAccess().getDigitZeroKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:1886:3: ( (this_NegativeSign_2= ruleNegativeSign )? this_NONZERODIGIT_3= RULE_NONZERODIGIT this_INT_4= RULE_INT )
                    {
                    // InternalGraphqlidl.g:1886:3: ( (this_NegativeSign_2= ruleNegativeSign )? this_NONZERODIGIT_3= RULE_NONZERODIGIT this_INT_4= RULE_INT )
                    // InternalGraphqlidl.g:1887:4: (this_NegativeSign_2= ruleNegativeSign )? this_NONZERODIGIT_3= RULE_NONZERODIGIT this_INT_4= RULE_INT
                    {
                    // InternalGraphqlidl.g:1887:4: (this_NegativeSign_2= ruleNegativeSign )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==41) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalGraphqlidl.g:1888:5: this_NegativeSign_2= ruleNegativeSign
                            {

                            					newCompositeNode(grammarAccess.getIntegerPartAccess().getNegativeSignParserRuleCall_1_0());
                            				
                            pushFollow(FOLLOW_27);
                            this_NegativeSign_2=ruleNegativeSign();

                            state._fsp--;


                            					current.merge(this_NegativeSign_2);
                            				

                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    this_NONZERODIGIT_3=(Token)match(input,RULE_NONZERODIGIT,FOLLOW_28); 

                    				current.merge(this_NONZERODIGIT_3);
                    			

                    				newLeafNode(this_NONZERODIGIT_3, grammarAccess.getIntegerPartAccess().getNONZERODIGITTerminalRuleCall_1_1());
                    			
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_4);
                    			

                    				newLeafNode(this_INT_4, grammarAccess.getIntegerPartAccess().getINTTerminalRuleCall_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerPart"


    // $ANTLR start "entryRuleNegativeSign"
    // InternalGraphqlidl.g:1918:1: entryRuleNegativeSign returns [String current=null] : iv_ruleNegativeSign= ruleNegativeSign EOF ;
    public final String entryRuleNegativeSign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNegativeSign = null;


        try {
            // InternalGraphqlidl.g:1918:52: (iv_ruleNegativeSign= ruleNegativeSign EOF )
            // InternalGraphqlidl.g:1919:2: iv_ruleNegativeSign= ruleNegativeSign EOF
            {
             newCompositeNode(grammarAccess.getNegativeSignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegativeSign=ruleNegativeSign();

            state._fsp--;

             current =iv_ruleNegativeSign.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegativeSign"


    // $ANTLR start "ruleNegativeSign"
    // InternalGraphqlidl.g:1925:1: ruleNegativeSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleNegativeSign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGraphqlidl.g:1931:2: (kw= '-' )
            // InternalGraphqlidl.g:1932:2: kw= '-'
            {
            kw=(Token)match(input,41,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getNegativeSignAccess().getHyphenMinusKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegativeSign"


    // $ANTLR start "entryRuleFloatValue"
    // InternalGraphqlidl.g:1940:1: entryRuleFloatValue returns [String current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final String entryRuleFloatValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatValue = null;


        try {
            // InternalGraphqlidl.g:1940:50: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalGraphqlidl.g:1941:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalGraphqlidl.g:1947:1: ruleFloatValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IntegerPart_0= ruleIntegerPart this_FractionalPart_1= ruleFractionalPart ) | (this_IntegerPart_2= ruleIntegerPart this_ExponentPart_3= ruleExponentPart ) | (this_IntegerPart_4= ruleIntegerPart this_FractionalPart_5= ruleFractionalPart this_ExponentPart_6= ruleExponentPart ) ) ;
    public final AntlrDatatypeRuleToken ruleFloatValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntegerPart_0 = null;

        AntlrDatatypeRuleToken this_FractionalPart_1 = null;

        AntlrDatatypeRuleToken this_IntegerPart_2 = null;

        AntlrDatatypeRuleToken this_ExponentPart_3 = null;

        AntlrDatatypeRuleToken this_IntegerPart_4 = null;

        AntlrDatatypeRuleToken this_FractionalPart_5 = null;

        AntlrDatatypeRuleToken this_ExponentPart_6 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:1953:2: ( ( (this_IntegerPart_0= ruleIntegerPart this_FractionalPart_1= ruleFractionalPart ) | (this_IntegerPart_2= ruleIntegerPart this_ExponentPart_3= ruleExponentPart ) | (this_IntegerPart_4= ruleIntegerPart this_FractionalPart_5= ruleFractionalPart this_ExponentPart_6= ruleExponentPart ) ) )
            // InternalGraphqlidl.g:1954:2: ( (this_IntegerPart_0= ruleIntegerPart this_FractionalPart_1= ruleFractionalPart ) | (this_IntegerPart_2= ruleIntegerPart this_ExponentPart_3= ruleExponentPart ) | (this_IntegerPart_4= ruleIntegerPart this_FractionalPart_5= ruleFractionalPart this_ExponentPart_6= ruleExponentPart ) )
            {
            // InternalGraphqlidl.g:1954:2: ( (this_IntegerPart_0= ruleIntegerPart this_FractionalPart_1= ruleFractionalPart ) | (this_IntegerPart_2= ruleIntegerPart this_ExponentPart_3= ruleExponentPart ) | (this_IntegerPart_4= ruleIntegerPart this_FractionalPart_5= ruleFractionalPart this_ExponentPart_6= ruleExponentPart ) )
            int alt31=3;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalGraphqlidl.g:1955:3: (this_IntegerPart_0= ruleIntegerPart this_FractionalPart_1= ruleFractionalPart )
                    {
                    // InternalGraphqlidl.g:1955:3: (this_IntegerPart_0= ruleIntegerPart this_FractionalPart_1= ruleFractionalPart )
                    // InternalGraphqlidl.g:1956:4: this_IntegerPart_0= ruleIntegerPart this_FractionalPart_1= ruleFractionalPart
                    {

                    				newCompositeNode(grammarAccess.getFloatValueAccess().getIntegerPartParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_29);
                    this_IntegerPart_0=ruleIntegerPart();

                    state._fsp--;


                    				current.merge(this_IntegerPart_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getFloatValueAccess().getFractionalPartParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_FractionalPart_1=ruleFractionalPart();

                    state._fsp--;


                    				current.merge(this_FractionalPart_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:1978:3: (this_IntegerPart_2= ruleIntegerPart this_ExponentPart_3= ruleExponentPart )
                    {
                    // InternalGraphqlidl.g:1978:3: (this_IntegerPart_2= ruleIntegerPart this_ExponentPart_3= ruleExponentPart )
                    // InternalGraphqlidl.g:1979:4: this_IntegerPart_2= ruleIntegerPart this_ExponentPart_3= ruleExponentPart
                    {

                    				newCompositeNode(grammarAccess.getFloatValueAccess().getIntegerPartParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_30);
                    this_IntegerPart_2=ruleIntegerPart();

                    state._fsp--;


                    				current.merge(this_IntegerPart_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getFloatValueAccess().getExponentPartParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ExponentPart_3=ruleExponentPart();

                    state._fsp--;


                    				current.merge(this_ExponentPart_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphqlidl.g:2001:3: (this_IntegerPart_4= ruleIntegerPart this_FractionalPart_5= ruleFractionalPart this_ExponentPart_6= ruleExponentPart )
                    {
                    // InternalGraphqlidl.g:2001:3: (this_IntegerPart_4= ruleIntegerPart this_FractionalPart_5= ruleFractionalPart this_ExponentPart_6= ruleExponentPart )
                    // InternalGraphqlidl.g:2002:4: this_IntegerPart_4= ruleIntegerPart this_FractionalPart_5= ruleFractionalPart this_ExponentPart_6= ruleExponentPart
                    {

                    				newCompositeNode(grammarAccess.getFloatValueAccess().getIntegerPartParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_29);
                    this_IntegerPart_4=ruleIntegerPart();

                    state._fsp--;


                    				current.merge(this_IntegerPart_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getFloatValueAccess().getFractionalPartParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_30);
                    this_FractionalPart_5=ruleFractionalPart();

                    state._fsp--;


                    				current.merge(this_FractionalPart_5);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getFloatValueAccess().getExponentPartParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_ExponentPart_6=ruleExponentPart();

                    state._fsp--;


                    				current.merge(this_ExponentPart_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleFractionalPart"
    // InternalGraphqlidl.g:2037:1: entryRuleFractionalPart returns [String current=null] : iv_ruleFractionalPart= ruleFractionalPart EOF ;
    public final String entryRuleFractionalPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFractionalPart = null;


        try {
            // InternalGraphqlidl.g:2037:54: (iv_ruleFractionalPart= ruleFractionalPart EOF )
            // InternalGraphqlidl.g:2038:2: iv_ruleFractionalPart= ruleFractionalPart EOF
            {
             newCompositeNode(grammarAccess.getFractionalPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFractionalPart=ruleFractionalPart();

            state._fsp--;

             current =iv_ruleFractionalPart.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFractionalPart"


    // $ANTLR start "ruleFractionalPart"
    // InternalGraphqlidl.g:2044:1: ruleFractionalPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFractionalPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGraphqlidl.g:2050:2: ( (kw= '.' this_INT_1= RULE_INT ) )
            // InternalGraphqlidl.g:2051:2: (kw= '.' this_INT_1= RULE_INT )
            {
            // InternalGraphqlidl.g:2051:2: (kw= '.' this_INT_1= RULE_INT )
            // InternalGraphqlidl.g:2052:3: kw= '.' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,42,FOLLOW_28); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFractionalPartAccess().getFullStopKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getFractionalPartAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFractionalPart"


    // $ANTLR start "entryRuleExponentPart"
    // InternalGraphqlidl.g:2068:1: entryRuleExponentPart returns [String current=null] : iv_ruleExponentPart= ruleExponentPart EOF ;
    public final String entryRuleExponentPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponentPart = null;


        try {
            // InternalGraphqlidl.g:2068:52: (iv_ruleExponentPart= ruleExponentPart EOF )
            // InternalGraphqlidl.g:2069:2: iv_ruleExponentPart= ruleExponentPart EOF
            {
             newCompositeNode(grammarAccess.getExponentPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExponentPart=ruleExponentPart();

            state._fsp--;

             current =iv_ruleExponentPart.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExponentPart"


    // $ANTLR start "ruleExponentPart"
    // InternalGraphqlidl.g:2075:1: ruleExponentPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExponentIndicator_0= ruleExponentIndicator (this_Sign_1= ruleSign )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleExponentPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_ExponentIndicator_0 = null;

        AntlrDatatypeRuleToken this_Sign_1 = null;



        	enterRule();

        try {
            // InternalGraphqlidl.g:2081:2: ( (this_ExponentIndicator_0= ruleExponentIndicator (this_Sign_1= ruleSign )? this_INT_2= RULE_INT ) )
            // InternalGraphqlidl.g:2082:2: (this_ExponentIndicator_0= ruleExponentIndicator (this_Sign_1= ruleSign )? this_INT_2= RULE_INT )
            {
            // InternalGraphqlidl.g:2082:2: (this_ExponentIndicator_0= ruleExponentIndicator (this_Sign_1= ruleSign )? this_INT_2= RULE_INT )
            // InternalGraphqlidl.g:2083:3: this_ExponentIndicator_0= ruleExponentIndicator (this_Sign_1= ruleSign )? this_INT_2= RULE_INT
            {

            			newCompositeNode(grammarAccess.getExponentPartAccess().getExponentIndicatorParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_ExponentIndicator_0=ruleExponentIndicator();

            state._fsp--;


            			current.merge(this_ExponentIndicator_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalGraphqlidl.g:2093:3: (this_Sign_1= ruleSign )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41||LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGraphqlidl.g:2094:4: this_Sign_1= ruleSign
                    {

                    				newCompositeNode(grammarAccess.getExponentPartAccess().getSignParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_28);
                    this_Sign_1=ruleSign();

                    state._fsp--;


                    				current.merge(this_Sign_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getExponentPartAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExponentPart"


    // $ANTLR start "entryRuleExponentIndicator"
    // InternalGraphqlidl.g:2116:1: entryRuleExponentIndicator returns [String current=null] : iv_ruleExponentIndicator= ruleExponentIndicator EOF ;
    public final String entryRuleExponentIndicator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponentIndicator = null;


        try {
            // InternalGraphqlidl.g:2116:57: (iv_ruleExponentIndicator= ruleExponentIndicator EOF )
            // InternalGraphqlidl.g:2117:2: iv_ruleExponentIndicator= ruleExponentIndicator EOF
            {
             newCompositeNode(grammarAccess.getExponentIndicatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExponentIndicator=ruleExponentIndicator();

            state._fsp--;

             current =iv_ruleExponentIndicator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExponentIndicator"


    // $ANTLR start "ruleExponentIndicator"
    // InternalGraphqlidl.g:2123:1: ruleExponentIndicator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'e' | kw= 'E' ) ;
    public final AntlrDatatypeRuleToken ruleExponentIndicator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGraphqlidl.g:2129:2: ( (kw= 'e' | kw= 'E' ) )
            // InternalGraphqlidl.g:2130:2: (kw= 'e' | kw= 'E' )
            {
            // InternalGraphqlidl.g:2130:2: (kw= 'e' | kw= 'E' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            else if ( (LA33_0==44) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalGraphqlidl.g:2131:3: kw= 'e'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExponentIndicatorAccess().getEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:2137:3: kw= 'E'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExponentIndicatorAccess().getEKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExponentIndicator"


    // $ANTLR start "entryRuleSign"
    // InternalGraphqlidl.g:2146:1: entryRuleSign returns [String current=null] : iv_ruleSign= ruleSign EOF ;
    public final String entryRuleSign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSign = null;


        try {
            // InternalGraphqlidl.g:2146:44: (iv_ruleSign= ruleSign EOF )
            // InternalGraphqlidl.g:2147:2: iv_ruleSign= ruleSign EOF
            {
             newCompositeNode(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSign=ruleSign();

            state._fsp--;

             current =iv_ruleSign.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSign"


    // $ANTLR start "ruleSign"
    // InternalGraphqlidl.g:2153:1: ruleSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleSign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGraphqlidl.g:2159:2: ( (kw= '+' | kw= '-' ) )
            // InternalGraphqlidl.g:2160:2: (kw= '+' | kw= '-' )
            {
            // InternalGraphqlidl.g:2160:2: (kw= '+' | kw= '-' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            else if ( (LA34_0==41) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalGraphqlidl.g:2161:3: kw= '+'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:2167:3: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSignAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSign"


    // $ANTLR start "entryRuleStringValue"
    // InternalGraphqlidl.g:2176:1: entryRuleStringValue returns [String current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final String entryRuleStringValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringValue = null;


        try {
            // InternalGraphqlidl.g:2176:51: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalGraphqlidl.g:2177:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalGraphqlidl.g:2183:1: ruleStringValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '\"' kw= '\"' ) | (kw= '\"' this_STRING_3= RULE_STRING kw= '\"' ) ) ;
    public final AntlrDatatypeRuleToken ruleStringValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_3=null;


        	enterRule();

        try {
            // InternalGraphqlidl.g:2189:2: ( ( (kw= '\"' kw= '\"' ) | (kw= '\"' this_STRING_3= RULE_STRING kw= '\"' ) ) )
            // InternalGraphqlidl.g:2190:2: ( (kw= '\"' kw= '\"' ) | (kw= '\"' this_STRING_3= RULE_STRING kw= '\"' ) )
            {
            // InternalGraphqlidl.g:2190:2: ( (kw= '\"' kw= '\"' ) | (kw= '\"' this_STRING_3= RULE_STRING kw= '\"' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==46) ) {
                    alt35=1;
                }
                else if ( (LA35_1==RULE_STRING) ) {
                    alt35=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalGraphqlidl.g:2191:3: (kw= '\"' kw= '\"' )
                    {
                    // InternalGraphqlidl.g:2191:3: (kw= '\"' kw= '\"' )
                    // InternalGraphqlidl.g:2192:4: kw= '\"' kw= '\"'
                    {
                    kw=(Token)match(input,46,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getStringValueAccess().getQuotationMarkKeyword_0_0());
                    			
                    kw=(Token)match(input,46,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getStringValueAccess().getQuotationMarkKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:2204:3: (kw= '\"' this_STRING_3= RULE_STRING kw= '\"' )
                    {
                    // InternalGraphqlidl.g:2204:3: (kw= '\"' this_STRING_3= RULE_STRING kw= '\"' )
                    // InternalGraphqlidl.g:2205:4: kw= '\"' this_STRING_3= RULE_STRING kw= '\"'
                    {
                    kw=(Token)match(input,46,FOLLOW_33); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getStringValueAccess().getQuotationMarkKeyword_1_0());
                    			
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    				current.merge(this_STRING_3);
                    			

                    				newLeafNode(this_STRING_3, grammarAccess.getStringValueAccess().getSTRINGTerminalRuleCall_1_1());
                    			
                    kw=(Token)match(input,46,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getStringValueAccess().getQuotationMarkKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"

    // Delegated rules


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\7\6\uffff\1\7";
    static final String dfa_3s = "\1\6\1\11\1\4\1\12\5\uffff\1\4";
    static final String dfa_4s = "\1\56\1\50\1\56\1\12\5\uffff\1\56";
    static final String dfa_5s = "\4\uffff\1\3\1\4\1\5\1\1\1\2\1\uffff";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\5\1\6\1\uffff\1\3\36\uffff\1\2\1\1\4\uffff\1\4",
            "\1\3\36\uffff\1\2",
            "\1\7\1\uffff\2\7\1\uffff\1\7\12\uffff\1\7\3\uffff\1\7\13\uffff\1\7\1\uffff\4\7\3\10\1\uffff\1\7",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\7\1\uffff\2\7\1\uffff\1\7\12\uffff\1\7\3\uffff\1\7\13\uffff\1\7\1\uffff\4\7\3\10\1\uffff\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1454:2: ( ( (lv_value_0_0= ruleIntValue ) ) | ( (lv_value_1_0= ruleFloatValue ) ) | ( (lv_value_2_0= ruleStringValue ) ) | ( (lv_value_3_0= RULE_BOOLEANVALUE ) ) | ( (lv_value_4_0= RULE_NULLVALUE ) ) )";
        }
    }
    static final String dfa_8s = "\7\uffff\1\10\2\uffff";
    static final String dfa_9s = "\2\11\1\52\2\12\1\uffff\1\52\1\4\2\uffff";
    static final String dfa_10s = "\1\51\1\50\1\54\2\12\1\uffff\1\54\1\56\2\uffff";
    static final String dfa_11s = "\5\uffff\1\2\2\uffff\1\1\1\3";
    static final String[] dfa_12s = {
            "\1\3\36\uffff\1\2\1\1",
            "\1\3\36\uffff\1\2",
            "\1\4\2\5",
            "\1\6",
            "\1\7",
            "",
            "\1\4\2\5",
            "\1\10\1\uffff\2\10\1\uffff\1\10\12\uffff\1\10\3\uffff\1\10\13\uffff\1\10\1\uffff\4\10\1\uffff\2\11\1\uffff\1\10",
            "",
            ""
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_6;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1954:2: ( (this_IntegerPart_0= ruleIntegerPart this_FractionalPart_1= ruleFractionalPart ) | (this_IntegerPart_2= ruleIntegerPart this_ExponentPart_3= ruleExponentPart ) | (this_IntegerPart_4= ruleIntegerPart this_FractionalPart_5= ruleFractionalPart this_ExponentPart_6= ruleExponentPart ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000004F4080002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00004340001002D0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000043C0001002D0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000220000000400L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000800L});

}
