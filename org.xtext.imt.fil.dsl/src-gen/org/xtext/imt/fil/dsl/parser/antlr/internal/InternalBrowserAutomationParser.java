package org.xtext.imt.fil.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.imt.fil.dsl.services.BrowserAutomationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrowserAutomationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'open'", "'mozilla'", "'chrome'", "'safari'", "'internet'", "'explorer'", "'uncheck'", "'all'", "'go'", "'to'", "'='", "'get'", "'by'", "'['", "']'", "'from'", "'pageTitle'", "'number'", "'link'", "'input'", "'button'", "'checkbox'", "'combobox'", "'image'", "'text'", "'title'", "'class'", "'value'", "'alt'", "'name'", "'href'", "'click'", "'on'", "'insert'", "'in'", "'is'", "'not'", "'null'", "'check'", "'choose'", "'contains'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBrowserAutomationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBrowserAutomationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBrowserAutomationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBrowserAutomation.g"; }



     	private BrowserAutomationGrammarAccess grammarAccess;

        public InternalBrowserAutomationParser(TokenStream input, BrowserAutomationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Test";
       	}

       	@Override
       	protected BrowserAutomationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTest"
    // InternalBrowserAutomation.g:64:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalBrowserAutomation.g:64:45: (iv_ruleTest= ruleTest EOF )
            // InternalBrowserAutomation.g:65:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalBrowserAutomation.g:71:1: ruleTest returns [EObject current=null] : ( () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) ( (lv_statements_3_0= ruleStatement ) )* ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_webBrowser_2_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:77:2: ( ( () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) ( (lv_statements_3_0= ruleStatement ) )* ) )
            // InternalBrowserAutomation.g:78:2: ( () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) ( (lv_statements_3_0= ruleStatement ) )* )
            {
            // InternalBrowserAutomation.g:78:2: ( () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) ( (lv_statements_3_0= ruleStatement ) )* )
            // InternalBrowserAutomation.g:79:3: () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) ( (lv_statements_3_0= ruleStatement ) )*
            {
            // InternalBrowserAutomation.g:79:3: ()
            // InternalBrowserAutomation.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestAccess().getTestAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTestAccess().getOpenKeyword_1());
            		
            // InternalBrowserAutomation.g:90:3: ( (lv_webBrowser_2_0= ruleWebBrowser ) )
            // InternalBrowserAutomation.g:91:4: (lv_webBrowser_2_0= ruleWebBrowser )
            {
            // InternalBrowserAutomation.g:91:4: (lv_webBrowser_2_0= ruleWebBrowser )
            // InternalBrowserAutomation.g:92:5: lv_webBrowser_2_0= ruleWebBrowser
            {

            					newCompositeNode(grammarAccess.getTestAccess().getWebBrowserWebBrowserParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_webBrowser_2_0=ruleWebBrowser();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"webBrowser",
            						lv_webBrowser_2_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.WebBrowser");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowserAutomation.g:109:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==17||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrowserAutomation.g:110:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalBrowserAutomation.g:110:4: (lv_statements_3_0= ruleStatement )
            	    // InternalBrowserAutomation.g:111:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.xtext.imt.fil.dsl.BrowserAutomation.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleWebBrowser"
    // InternalBrowserAutomation.g:132:1: entryRuleWebBrowser returns [String current=null] : iv_ruleWebBrowser= ruleWebBrowser EOF ;
    public final String entryRuleWebBrowser() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWebBrowser = null;


        try {
            // InternalBrowserAutomation.g:132:50: (iv_ruleWebBrowser= ruleWebBrowser EOF )
            // InternalBrowserAutomation.g:133:2: iv_ruleWebBrowser= ruleWebBrowser EOF
            {
             newCompositeNode(grammarAccess.getWebBrowserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebBrowser=ruleWebBrowser();

            state._fsp--;

             current =iv_ruleWebBrowser.getText(); 
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
    // $ANTLR end "entryRuleWebBrowser"


    // $ANTLR start "ruleWebBrowser"
    // InternalBrowserAutomation.g:139:1: ruleWebBrowser returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'mozilla' | kw= 'chrome' | kw= 'safari' | (kw= 'internet' kw= 'explorer' ) ) ;
    public final AntlrDatatypeRuleToken ruleWebBrowser() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:145:2: ( (kw= 'mozilla' | kw= 'chrome' | kw= 'safari' | (kw= 'internet' kw= 'explorer' ) ) )
            // InternalBrowserAutomation.g:146:2: (kw= 'mozilla' | kw= 'chrome' | kw= 'safari' | (kw= 'internet' kw= 'explorer' ) )
            {
            // InternalBrowserAutomation.g:146:2: (kw= 'mozilla' | kw= 'chrome' | kw= 'safari' | (kw= 'internet' kw= 'explorer' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBrowserAutomation.g:147:3: kw= 'mozilla'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWebBrowserAccess().getMozillaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:153:3: kw= 'chrome'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWebBrowserAccess().getChromeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:159:3: kw= 'safari'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWebBrowserAccess().getSafariKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:165:3: (kw= 'internet' kw= 'explorer' )
                    {
                    // InternalBrowserAutomation.g:165:3: (kw= 'internet' kw= 'explorer' )
                    // InternalBrowserAutomation.g:166:4: kw= 'internet' kw= 'explorer'
                    {
                    kw=(Token)match(input,15,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getWebBrowserAccess().getInternetKeyword_3_0());
                    			
                    kw=(Token)match(input,16,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getWebBrowserAccess().getExplorerKeyword_3_1());
                    			

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
    // $ANTLR end "ruleWebBrowser"


    // $ANTLR start "entryRuleStatement"
    // InternalBrowserAutomation.g:181:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalBrowserAutomation.g:181:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalBrowserAutomation.g:182:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalBrowserAutomation.g:188:1: ruleStatement returns [EObject current=null] : ( (this_Get_0= ruleGet ( (lv_action_1_0= ruleAction ) ) ) | this_Get_2= ruleGet | (otherlv_3= 'uncheck' otherlv_4= 'all' ) | (otherlv_5= 'go' otherlv_6= 'to' ( (lv_url_7_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_url_7_0=null;
        EObject this_Get_0 = null;

        EObject lv_action_1_0 = null;

        EObject this_Get_2 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:194:2: ( ( (this_Get_0= ruleGet ( (lv_action_1_0= ruleAction ) ) ) | this_Get_2= ruleGet | (otherlv_3= 'uncheck' otherlv_4= 'all' ) | (otherlv_5= 'go' otherlv_6= 'to' ( (lv_url_7_0= RULE_STRING ) ) ) ) )
            // InternalBrowserAutomation.g:195:2: ( (this_Get_0= ruleGet ( (lv_action_1_0= ruleAction ) ) ) | this_Get_2= ruleGet | (otherlv_3= 'uncheck' otherlv_4= 'all' ) | (otherlv_5= 'go' otherlv_6= 'to' ( (lv_url_7_0= RULE_STRING ) ) ) )
            {
            // InternalBrowserAutomation.g:195:2: ( (this_Get_0= ruleGet ( (lv_action_1_0= ruleAction ) ) ) | this_Get_2= ruleGet | (otherlv_3= 'uncheck' otherlv_4= 'all' ) | (otherlv_5= 'go' otherlv_6= 'to' ( (lv_url_7_0= RULE_STRING ) ) ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalBrowserAutomation.g:196:3: (this_Get_0= ruleGet ( (lv_action_1_0= ruleAction ) ) )
                    {
                    // InternalBrowserAutomation.g:196:3: (this_Get_0= ruleGet ( (lv_action_1_0= ruleAction ) ) )
                    // InternalBrowserAutomation.g:197:4: this_Get_0= ruleGet ( (lv_action_1_0= ruleAction ) )
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getGetParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_Get_0=ruleGet();

                    state._fsp--;


                    				current = this_Get_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalBrowserAutomation.g:205:4: ( (lv_action_1_0= ruleAction ) )
                    // InternalBrowserAutomation.g:206:5: (lv_action_1_0= ruleAction )
                    {
                    // InternalBrowserAutomation.g:206:5: (lv_action_1_0= ruleAction )
                    // InternalBrowserAutomation.g:207:6: lv_action_1_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getActionActionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_action_1_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"action",
                    							lv_action_1_0,
                    							"org.xtext.imt.fil.dsl.BrowserAutomation.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:226:3: this_Get_2= ruleGet
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getGetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Get_2=ruleGet();

                    state._fsp--;


                    			current = this_Get_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:235:3: (otherlv_3= 'uncheck' otherlv_4= 'all' )
                    {
                    // InternalBrowserAutomation.g:235:3: (otherlv_3= 'uncheck' otherlv_4= 'all' )
                    // InternalBrowserAutomation.g:236:4: otherlv_3= 'uncheck' otherlv_4= 'all'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getUncheckKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getAllKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:246:3: (otherlv_5= 'go' otherlv_6= 'to' ( (lv_url_7_0= RULE_STRING ) ) )
                    {
                    // InternalBrowserAutomation.g:246:3: (otherlv_5= 'go' otherlv_6= 'to' ( (lv_url_7_0= RULE_STRING ) ) )
                    // InternalBrowserAutomation.g:247:4: otherlv_5= 'go' otherlv_6= 'to' ( (lv_url_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getGoKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getToKeyword_3_1());
                    			
                    // InternalBrowserAutomation.g:255:4: ( (lv_url_7_0= RULE_STRING ) )
                    // InternalBrowserAutomation.g:256:5: (lv_url_7_0= RULE_STRING )
                    {
                    // InternalBrowserAutomation.g:256:5: (lv_url_7_0= RULE_STRING )
                    // InternalBrowserAutomation.g:257:6: lv_url_7_0= RULE_STRING
                    {
                    lv_url_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_url_7_0, grammarAccess.getStatementAccess().getUrlSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAction"
    // InternalBrowserAutomation.g:278:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalBrowserAutomation.g:278:47: (iv_ruleAction= ruleAction EOF )
            // InternalBrowserAutomation.g:279:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalBrowserAutomation.g:285:1: ruleAction returns [EObject current=null] : (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Check_3= ruleCheck | this_Choose_4= ruleChoose | this_Contains_5= ruleContains ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;

        EObject this_Insert_1 = null;

        EObject this_Verify_2 = null;

        EObject this_Check_3 = null;

        EObject this_Choose_4 = null;

        EObject this_Contains_5 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:291:2: ( (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Check_3= ruleCheck | this_Choose_4= ruleChoose | this_Contains_5= ruleContains ) )
            // InternalBrowserAutomation.g:292:2: (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Check_3= ruleCheck | this_Choose_4= ruleChoose | this_Contains_5= ruleContains )
            {
            // InternalBrowserAutomation.g:292:2: (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Check_3= ruleCheck | this_Choose_4= ruleChoose | this_Contains_5= ruleContains )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt4=1;
                }
                break;
            case 44:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==46) ) {
                    alt4=3;
                }
                else if ( (LA4_3==51) ) {
                    alt4=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                alt4=4;
                }
                break;
            case 50:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBrowserAutomation.g:293:3: this_Click_0= ruleClick
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getClickParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Click_0=ruleClick();

                    state._fsp--;


                    			current = this_Click_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:302:3: this_Insert_1= ruleInsert
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getInsertParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Insert_1=ruleInsert();

                    state._fsp--;


                    			current = this_Insert_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:311:3: this_Verify_2= ruleVerify
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getVerifyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Verify_2=ruleVerify();

                    state._fsp--;


                    			current = this_Verify_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:320:3: this_Check_3= ruleCheck
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getCheckParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Check_3=ruleCheck();

                    state._fsp--;


                    			current = this_Check_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:329:3: this_Choose_4= ruleChoose
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getChooseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Choose_4=ruleChoose();

                    state._fsp--;


                    			current = this_Choose_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:338:3: this_Contains_5= ruleContains
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getContainsParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Contains_5=ruleContains();

                    state._fsp--;


                    			current = this_Contains_5;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleGet"
    // InternalBrowserAutomation.g:350:1: entryRuleGet returns [EObject current=null] : iv_ruleGet= ruleGet EOF ;
    public final EObject entryRuleGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGet = null;


        try {
            // InternalBrowserAutomation.g:350:44: (iv_ruleGet= ruleGet EOF )
            // InternalBrowserAutomation.g:351:2: iv_ruleGet= ruleGet EOF
            {
             newCompositeNode(grammarAccess.getGetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGet=ruleGet();

            state._fsp--;

             current =iv_ruleGet; 
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
    // $ANTLR end "entryRuleGet"


    // $ANTLR start "ruleGet"
    // InternalBrowserAutomation.g:357:1: ruleGet returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '=' otherlv_2= 'get' ( ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( ( (lv_attrVal_8_0= RULE_STRING ) ) | ( (lv_attrVar_9_0= ruleVarReference ) ) ) otherlv_10= ']' ) | (otherlv_11= 'from' ( (lv_varRef_12_0= ruleVarReference ) ) ) ) ) | otherlv_13= 'pageTitle' ) ) ;
    public final EObject ruleGet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_attrVal_8_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_var_0_0 = null;

        AntlrDatatypeRuleToken lv_element_3_0 = null;

        EObject lv_order_4_0 = null;

        AntlrDatatypeRuleToken lv_attr_6_0 = null;

        EObject lv_attrVar_9_0 = null;

        EObject lv_varRef_12_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:363:2: ( ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '=' otherlv_2= 'get' ( ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( ( (lv_attrVal_8_0= RULE_STRING ) ) | ( (lv_attrVar_9_0= ruleVarReference ) ) ) otherlv_10= ']' ) | (otherlv_11= 'from' ( (lv_varRef_12_0= ruleVarReference ) ) ) ) ) | otherlv_13= 'pageTitle' ) ) )
            // InternalBrowserAutomation.g:364:2: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '=' otherlv_2= 'get' ( ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( ( (lv_attrVal_8_0= RULE_STRING ) ) | ( (lv_attrVar_9_0= ruleVarReference ) ) ) otherlv_10= ']' ) | (otherlv_11= 'from' ( (lv_varRef_12_0= ruleVarReference ) ) ) ) ) | otherlv_13= 'pageTitle' ) )
            {
            // InternalBrowserAutomation.g:364:2: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '=' otherlv_2= 'get' ( ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( ( (lv_attrVal_8_0= RULE_STRING ) ) | ( (lv_attrVar_9_0= ruleVarReference ) ) ) otherlv_10= ']' ) | (otherlv_11= 'from' ( (lv_varRef_12_0= ruleVarReference ) ) ) ) ) | otherlv_13= 'pageTitle' ) )
            // InternalBrowserAutomation.g:365:3: ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '=' otherlv_2= 'get' ( ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( ( (lv_attrVal_8_0= RULE_STRING ) ) | ( (lv_attrVar_9_0= ruleVarReference ) ) ) otherlv_10= ']' ) | (otherlv_11= 'from' ( (lv_varRef_12_0= ruleVarReference ) ) ) ) ) | otherlv_13= 'pageTitle' )
            {
            // InternalBrowserAutomation.g:365:3: ( (lv_var_0_0= ruleVariable ) )
            // InternalBrowserAutomation.g:366:4: (lv_var_0_0= ruleVariable )
            {
            // InternalBrowserAutomation.g:366:4: (lv_var_0_0= ruleVariable )
            // InternalBrowserAutomation.g:367:5: lv_var_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getGetAccess().getVarVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_var_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getGetAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getGetAccess().getGetKeyword_2());
            		
            // InternalBrowserAutomation.g:392:3: ( ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( ( (lv_attrVal_8_0= RULE_STRING ) ) | ( (lv_attrVar_9_0= ruleVarReference ) ) ) otherlv_10= ']' ) | (otherlv_11= 'from' ( (lv_varRef_12_0= ruleVarReference ) ) ) ) ) | otherlv_13= 'pageTitle' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=29 && LA8_0<=36)) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBrowserAutomation.g:393:4: ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( ( (lv_attrVal_8_0= RULE_STRING ) ) | ( (lv_attrVar_9_0= ruleVarReference ) ) ) otherlv_10= ']' ) | (otherlv_11= 'from' ( (lv_varRef_12_0= ruleVarReference ) ) ) ) )
                    {
                    // InternalBrowserAutomation.g:393:4: ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( ( (lv_attrVal_8_0= RULE_STRING ) ) | ( (lv_attrVar_9_0= ruleVarReference ) ) ) otherlv_10= ']' ) | (otherlv_11= 'from' ( (lv_varRef_12_0= ruleVarReference ) ) ) ) )
                    // InternalBrowserAutomation.g:394:5: ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( ( (lv_attrVal_8_0= RULE_STRING ) ) | ( (lv_attrVar_9_0= ruleVarReference ) ) ) otherlv_10= ']' ) | (otherlv_11= 'from' ( (lv_varRef_12_0= ruleVarReference ) ) ) )
                    {
                    // InternalBrowserAutomation.g:394:5: ( (lv_element_3_0= ruleElement ) )
                    // InternalBrowserAutomation.g:395:6: (lv_element_3_0= ruleElement )
                    {
                    // InternalBrowserAutomation.g:395:6: (lv_element_3_0= ruleElement )
                    // InternalBrowserAutomation.g:396:7: lv_element_3_0= ruleElement
                    {

                    							newCompositeNode(grammarAccess.getGetAccess().getElementElementParserRuleCall_3_0_0_0());
                    						
                    pushFollow(FOLLOW_13);
                    lv_element_3_0=ruleElement();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getGetRule());
                    							}
                    							set(
                    								current,
                    								"element",
                    								lv_element_3_0,
                    								"org.xtext.imt.fil.dsl.BrowserAutomation.Element");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalBrowserAutomation.g:413:5: ( (lv_order_4_0= ruleOrder ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==28) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalBrowserAutomation.g:414:6: (lv_order_4_0= ruleOrder )
                            {
                            // InternalBrowserAutomation.g:414:6: (lv_order_4_0= ruleOrder )
                            // InternalBrowserAutomation.g:415:7: lv_order_4_0= ruleOrder
                            {

                            							newCompositeNode(grammarAccess.getGetAccess().getOrderOrderParserRuleCall_3_0_1_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_order_4_0=ruleOrder();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getGetRule());
                            							}
                            							set(
                            								current,
                            								"order",
                            								lv_order_4_0,
                            								"org.xtext.imt.fil.dsl.BrowserAutomation.Order");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalBrowserAutomation.g:432:5: ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( ( (lv_attrVal_8_0= RULE_STRING ) ) | ( (lv_attrVar_9_0= ruleVarReference ) ) ) otherlv_10= ']' ) | (otherlv_11= 'from' ( (lv_varRef_12_0= ruleVarReference ) ) ) )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==23) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==26) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalBrowserAutomation.g:433:6: (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( ( (lv_attrVal_8_0= RULE_STRING ) ) | ( (lv_attrVar_9_0= ruleVarReference ) ) ) otherlv_10= ']' )
                            {
                            // InternalBrowserAutomation.g:433:6: (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( ( (lv_attrVal_8_0= RULE_STRING ) ) | ( (lv_attrVar_9_0= ruleVarReference ) ) ) otherlv_10= ']' )
                            // InternalBrowserAutomation.g:434:7: otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( ( (lv_attrVal_8_0= RULE_STRING ) ) | ( (lv_attrVar_9_0= ruleVarReference ) ) ) otherlv_10= ']'
                            {
                            otherlv_5=(Token)match(input,23,FOLLOW_15); 

                            							newLeafNode(otherlv_5, grammarAccess.getGetAccess().getByKeyword_3_0_2_0_0());
                            						
                            // InternalBrowserAutomation.g:438:7: ( (lv_attr_6_0= ruleAttribut ) )
                            // InternalBrowserAutomation.g:439:8: (lv_attr_6_0= ruleAttribut )
                            {
                            // InternalBrowserAutomation.g:439:8: (lv_attr_6_0= ruleAttribut )
                            // InternalBrowserAutomation.g:440:9: lv_attr_6_0= ruleAttribut
                            {

                            									newCompositeNode(grammarAccess.getGetAccess().getAttrAttributParserRuleCall_3_0_2_0_1_0());
                            								
                            pushFollow(FOLLOW_16);
                            lv_attr_6_0=ruleAttribut();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getGetRule());
                            									}
                            									set(
                            										current,
                            										"attr",
                            										lv_attr_6_0,
                            										"org.xtext.imt.fil.dsl.BrowserAutomation.Attribut");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_7=(Token)match(input,24,FOLLOW_17); 

                            							newLeafNode(otherlv_7, grammarAccess.getGetAccess().getLeftSquareBracketKeyword_3_0_2_0_2());
                            						
                            // InternalBrowserAutomation.g:461:7: ( ( (lv_attrVal_8_0= RULE_STRING ) ) | ( (lv_attrVar_9_0= ruleVarReference ) ) )
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==RULE_STRING) ) {
                                alt6=1;
                            }
                            else if ( (LA6_0==RULE_ID) ) {
                                alt6=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 0, input);

                                throw nvae;
                            }
                            switch (alt6) {
                                case 1 :
                                    // InternalBrowserAutomation.g:462:8: ( (lv_attrVal_8_0= RULE_STRING ) )
                                    {
                                    // InternalBrowserAutomation.g:462:8: ( (lv_attrVal_8_0= RULE_STRING ) )
                                    // InternalBrowserAutomation.g:463:9: (lv_attrVal_8_0= RULE_STRING )
                                    {
                                    // InternalBrowserAutomation.g:463:9: (lv_attrVal_8_0= RULE_STRING )
                                    // InternalBrowserAutomation.g:464:10: lv_attrVal_8_0= RULE_STRING
                                    {
                                    lv_attrVal_8_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                                    										newLeafNode(lv_attrVal_8_0, grammarAccess.getGetAccess().getAttrValSTRINGTerminalRuleCall_3_0_2_0_3_0_0());
                                    									

                                    										if (current==null) {
                                    											current = createModelElement(grammarAccess.getGetRule());
                                    										}
                                    										setWithLastConsumed(
                                    											current,
                                    											"attrVal",
                                    											lv_attrVal_8_0,
                                    											"org.eclipse.xtext.common.Terminals.STRING");
                                    									

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalBrowserAutomation.g:481:8: ( (lv_attrVar_9_0= ruleVarReference ) )
                                    {
                                    // InternalBrowserAutomation.g:481:8: ( (lv_attrVar_9_0= ruleVarReference ) )
                                    // InternalBrowserAutomation.g:482:9: (lv_attrVar_9_0= ruleVarReference )
                                    {
                                    // InternalBrowserAutomation.g:482:9: (lv_attrVar_9_0= ruleVarReference )
                                    // InternalBrowserAutomation.g:483:10: lv_attrVar_9_0= ruleVarReference
                                    {

                                    										newCompositeNode(grammarAccess.getGetAccess().getAttrVarVarReferenceParserRuleCall_3_0_2_0_3_1_0());
                                    									
                                    pushFollow(FOLLOW_18);
                                    lv_attrVar_9_0=ruleVarReference();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getGetRule());
                                    										}
                                    										set(
                                    											current,
                                    											"attrVar",
                                    											lv_attrVar_9_0,
                                    											"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_10=(Token)match(input,25,FOLLOW_2); 

                            							newLeafNode(otherlv_10, grammarAccess.getGetAccess().getRightSquareBracketKeyword_3_0_2_0_4());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalBrowserAutomation.g:507:6: (otherlv_11= 'from' ( (lv_varRef_12_0= ruleVarReference ) ) )
                            {
                            // InternalBrowserAutomation.g:507:6: (otherlv_11= 'from' ( (lv_varRef_12_0= ruleVarReference ) ) )
                            // InternalBrowserAutomation.g:508:7: otherlv_11= 'from' ( (lv_varRef_12_0= ruleVarReference ) )
                            {
                            otherlv_11=(Token)match(input,26,FOLLOW_19); 

                            							newLeafNode(otherlv_11, grammarAccess.getGetAccess().getFromKeyword_3_0_2_1_0());
                            						
                            // InternalBrowserAutomation.g:512:7: ( (lv_varRef_12_0= ruleVarReference ) )
                            // InternalBrowserAutomation.g:513:8: (lv_varRef_12_0= ruleVarReference )
                            {
                            // InternalBrowserAutomation.g:513:8: (lv_varRef_12_0= ruleVarReference )
                            // InternalBrowserAutomation.g:514:9: lv_varRef_12_0= ruleVarReference
                            {

                            									newCompositeNode(grammarAccess.getGetAccess().getVarRefVarReferenceParserRuleCall_3_0_2_1_1_0());
                            								
                            pushFollow(FOLLOW_2);
                            lv_varRef_12_0=ruleVarReference();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getGetRule());
                            									}
                            									set(
                            										current,
                            										"varRef",
                            										lv_varRef_12_0,
                            										"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:535:4: otherlv_13= 'pageTitle'
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getGetAccess().getPageTitleKeyword_3_1());
                    			

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
    // $ANTLR end "ruleGet"


    // $ANTLR start "entryRuleOrder"
    // InternalBrowserAutomation.g:544:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalBrowserAutomation.g:544:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalBrowserAutomation.g:545:2: iv_ruleOrder= ruleOrder EOF
            {
             newCompositeNode(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrder=ruleOrder();

            state._fsp--;

             current =iv_ruleOrder; 
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
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalBrowserAutomation.g:551:1: ruleOrder returns [EObject current=null] : (otherlv_0= 'number' ( (lv_order_1_0= RULE_INT ) ) ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_order_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:557:2: ( (otherlv_0= 'number' ( (lv_order_1_0= RULE_INT ) ) ) )
            // InternalBrowserAutomation.g:558:2: (otherlv_0= 'number' ( (lv_order_1_0= RULE_INT ) ) )
            {
            // InternalBrowserAutomation.g:558:2: (otherlv_0= 'number' ( (lv_order_1_0= RULE_INT ) ) )
            // InternalBrowserAutomation.g:559:3: otherlv_0= 'number' ( (lv_order_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderAccess().getNumberKeyword_0());
            		
            // InternalBrowserAutomation.g:563:3: ( (lv_order_1_0= RULE_INT ) )
            // InternalBrowserAutomation.g:564:4: (lv_order_1_0= RULE_INT )
            {
            // InternalBrowserAutomation.g:564:4: (lv_order_1_0= RULE_INT )
            // InternalBrowserAutomation.g:565:5: lv_order_1_0= RULE_INT
            {
            lv_order_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_order_1_0, grammarAccess.getOrderAccess().getOrderINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"order",
            						lv_order_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleElement"
    // InternalBrowserAutomation.g:585:1: entryRuleElement returns [String current=null] : iv_ruleElement= ruleElement EOF ;
    public final String entryRuleElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElement = null;


        try {
            // InternalBrowserAutomation.g:585:47: (iv_ruleElement= ruleElement EOF )
            // InternalBrowserAutomation.g:586:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement.getText(); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalBrowserAutomation.g:592:1: ruleElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' | kw= 'title' ) ;
    public final AntlrDatatypeRuleToken ruleElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:598:2: ( (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' | kw= 'title' ) )
            // InternalBrowserAutomation.g:599:2: (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' | kw= 'title' )
            {
            // InternalBrowserAutomation.g:599:2: (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' | kw= 'title' )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case 31:
                {
                alt9=3;
                }
                break;
            case 32:
                {
                alt9=4;
                }
                break;
            case 33:
                {
                alt9=5;
                }
                break;
            case 34:
                {
                alt9=6;
                }
                break;
            case 35:
                {
                alt9=7;
                }
                break;
            case 36:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBrowserAutomation.g:600:3: kw= 'link'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getLinkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:606:3: kw= 'input'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getInputKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:612:3: kw= 'button'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getButtonKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:618:3: kw= 'checkbox'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getCheckboxKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:624:3: kw= 'combobox'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getComboboxKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:630:3: kw= 'image'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getImageKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalBrowserAutomation.g:636:3: kw= 'text'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getTextKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalBrowserAutomation.g:642:3: kw= 'title'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getTitleKeyword_7());
                    		

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleAttribut"
    // InternalBrowserAutomation.g:651:1: entryRuleAttribut returns [String current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final String entryRuleAttribut() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttribut = null;


        try {
            // InternalBrowserAutomation.g:651:48: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalBrowserAutomation.g:652:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut.getText(); 
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
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalBrowserAutomation.g:658:1: ruleAttribut returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'class' | kw= 'value' | kw= 'alt' | kw= 'name' | kw= 'href' ) ;
    public final AntlrDatatypeRuleToken ruleAttribut() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:664:2: ( (kw= 'class' | kw= 'value' | kw= 'alt' | kw= 'name' | kw= 'href' ) )
            // InternalBrowserAutomation.g:665:2: (kw= 'class' | kw= 'value' | kw= 'alt' | kw= 'name' | kw= 'href' )
            {
            // InternalBrowserAutomation.g:665:2: (kw= 'class' | kw= 'value' | kw= 'alt' | kw= 'name' | kw= 'href' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt10=1;
                }
                break;
            case 38:
                {
                alt10=2;
                }
                break;
            case 39:
                {
                alt10=3;
                }
                break;
            case 40:
                {
                alt10=4;
                }
                break;
            case 41:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalBrowserAutomation.g:666:3: kw= 'class'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getClassKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:672:3: kw= 'value'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getValueKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:678:3: kw= 'alt'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getAltKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:684:3: kw= 'name'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getNameKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:690:3: kw= 'href'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getHrefKeyword_4());
                    		

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
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleVariable"
    // InternalBrowserAutomation.g:699:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalBrowserAutomation.g:699:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalBrowserAutomation.g:700:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalBrowserAutomation.g:706:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:712:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:713:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:713:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBrowserAutomation.g:714:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:714:3: (lv_name_0_0= RULE_ID )
            // InternalBrowserAutomation.g:715:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVarReference"
    // InternalBrowserAutomation.g:734:1: entryRuleVarReference returns [EObject current=null] : iv_ruleVarReference= ruleVarReference EOF ;
    public final EObject entryRuleVarReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarReference = null;


        try {
            // InternalBrowserAutomation.g:734:53: (iv_ruleVarReference= ruleVarReference EOF )
            // InternalBrowserAutomation.g:735:2: iv_ruleVarReference= ruleVarReference EOF
            {
             newCompositeNode(grammarAccess.getVarReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarReference=ruleVarReference();

            state._fsp--;

             current =iv_ruleVarReference; 
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
    // $ANTLR end "entryRuleVarReference"


    // $ANTLR start "ruleVarReference"
    // InternalBrowserAutomation.g:741:1: ruleVarReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVarReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:747:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:748:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:748:2: ( (otherlv_0= RULE_ID ) )
            // InternalBrowserAutomation.g:749:3: (otherlv_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:749:3: (otherlv_0= RULE_ID )
            // InternalBrowserAutomation.g:750:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVarReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVarReferenceAccess().getVarVariableCrossReference_0());
            			

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
    // $ANTLR end "ruleVarReference"


    // $ANTLR start "entryRuleClick"
    // InternalBrowserAutomation.g:764:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalBrowserAutomation.g:764:46: (iv_ruleClick= ruleClick EOF )
            // InternalBrowserAutomation.g:765:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
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
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalBrowserAutomation.g:771:1: ruleClick returns [EObject current=null] : (otherlv_0= 'click' otherlv_1= 'on' ( (lv_var_2_0= ruleVarReference ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_var_2_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:777:2: ( (otherlv_0= 'click' otherlv_1= 'on' ( (lv_var_2_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:778:2: (otherlv_0= 'click' otherlv_1= 'on' ( (lv_var_2_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:778:2: (otherlv_0= 'click' otherlv_1= 'on' ( (lv_var_2_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:779:3: otherlv_0= 'click' otherlv_1= 'on' ( (lv_var_2_0= ruleVarReference ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getClickAccess().getOnKeyword_1());
            		
            // InternalBrowserAutomation.g:787:3: ( (lv_var_2_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:788:4: (lv_var_2_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:788:4: (lv_var_2_0= ruleVarReference )
            // InternalBrowserAutomation.g:789:5: lv_var_2_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getClickAccess().getVarVarReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_2_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_2_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
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
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleInsert"
    // InternalBrowserAutomation.g:810:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalBrowserAutomation.g:810:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalBrowserAutomation.g:811:2: iv_ruleInsert= ruleInsert EOF
            {
             newCompositeNode(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;

             current =iv_ruleInsert; 
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
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalBrowserAutomation.g:817:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'insert' ( (lv_var_1_0= ruleVarReference ) ) otherlv_2= 'in' ( (lv_var2_3_0= ruleVarReference ) ) ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_var_1_0 = null;

        EObject lv_var2_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:823:2: ( (otherlv_0= 'insert' ( (lv_var_1_0= ruleVarReference ) ) otherlv_2= 'in' ( (lv_var2_3_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:824:2: (otherlv_0= 'insert' ( (lv_var_1_0= ruleVarReference ) ) otherlv_2= 'in' ( (lv_var2_3_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:824:2: (otherlv_0= 'insert' ( (lv_var_1_0= ruleVarReference ) ) otherlv_2= 'in' ( (lv_var2_3_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:825:3: otherlv_0= 'insert' ( (lv_var_1_0= ruleVarReference ) ) otherlv_2= 'in' ( (lv_var2_3_0= ruleVarReference ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
            		
            // InternalBrowserAutomation.g:829:3: ( (lv_var_1_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:830:4: (lv_var_1_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:830:4: (lv_var_1_0= ruleVarReference )
            // InternalBrowserAutomation.g:831:5: lv_var_1_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getVarVarReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_var_1_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getInKeyword_2());
            		
            // InternalBrowserAutomation.g:852:3: ( (lv_var2_3_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:853:4: (lv_var2_3_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:853:4: (lv_var2_3_0= ruleVarReference )
            // InternalBrowserAutomation.g:854:5: lv_var2_3_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getVar2VarReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_var2_3_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"var2",
            						lv_var2_3_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
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
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleVerify"
    // InternalBrowserAutomation.g:875:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // InternalBrowserAutomation.g:875:47: (iv_ruleVerify= ruleVerify EOF )
            // InternalBrowserAutomation.g:876:2: iv_ruleVerify= ruleVerify EOF
            {
             newCompositeNode(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerify=ruleVerify();

            state._fsp--;

             current =iv_ruleVerify; 
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
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // InternalBrowserAutomation.g:882:1: ruleVerify returns [EObject current=null] : ( ( (lv_var_0_0= ruleVarReference ) ) otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'null' ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_var_0_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:888:2: ( ( ( (lv_var_0_0= ruleVarReference ) ) otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'null' ) )
            // InternalBrowserAutomation.g:889:2: ( ( (lv_var_0_0= ruleVarReference ) ) otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'null' )
            {
            // InternalBrowserAutomation.g:889:2: ( ( (lv_var_0_0= ruleVarReference ) ) otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'null' )
            // InternalBrowserAutomation.g:890:3: ( (lv_var_0_0= ruleVarReference ) ) otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'null'
            {
            // InternalBrowserAutomation.g:890:3: ( (lv_var_0_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:891:4: (lv_var_0_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:891:4: (lv_var_0_0= ruleVarReference )
            // InternalBrowserAutomation.g:892:5: lv_var_0_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getVerifyAccess().getVarVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_var_0_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifyRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifyAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getVerifyAccess().getNotKeyword_2());
            		
            otherlv_3=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getVerifyAccess().getNullKeyword_3());
            		

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
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleCheck"
    // InternalBrowserAutomation.g:925:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // InternalBrowserAutomation.g:925:46: (iv_ruleCheck= ruleCheck EOF )
            // InternalBrowserAutomation.g:926:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
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
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalBrowserAutomation.g:932:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'check' ( (lv_var_1_0= ruleVarReference ) ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_var_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:938:2: ( (otherlv_0= 'check' ( (lv_var_1_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:939:2: (otherlv_0= 'check' ( (lv_var_1_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:939:2: (otherlv_0= 'check' ( (lv_var_1_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:940:3: otherlv_0= 'check' ( (lv_var_1_0= ruleVarReference ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
            		
            // InternalBrowserAutomation.g:944:3: ( (lv_var_1_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:945:4: (lv_var_1_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:945:4: (lv_var_1_0= ruleVarReference )
            // InternalBrowserAutomation.g:946:5: lv_var_1_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getCheckAccess().getVarVarReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_1_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
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
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleChoose"
    // InternalBrowserAutomation.g:967:1: entryRuleChoose returns [EObject current=null] : iv_ruleChoose= ruleChoose EOF ;
    public final EObject entryRuleChoose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoose = null;


        try {
            // InternalBrowserAutomation.g:967:47: (iv_ruleChoose= ruleChoose EOF )
            // InternalBrowserAutomation.g:968:2: iv_ruleChoose= ruleChoose EOF
            {
             newCompositeNode(grammarAccess.getChooseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoose=ruleChoose();

            state._fsp--;

             current =iv_ruleChoose; 
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
    // $ANTLR end "entryRuleChoose"


    // $ANTLR start "ruleChoose"
    // InternalBrowserAutomation.g:974:1: ruleChoose returns [EObject current=null] : (otherlv_0= 'choose' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_var_3_0= ruleVarReference ) ) ) ;
    public final EObject ruleChoose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        EObject lv_var_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:980:2: ( (otherlv_0= 'choose' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_var_3_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:981:2: (otherlv_0= 'choose' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_var_3_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:981:2: (otherlv_0= 'choose' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_var_3_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:982:3: otherlv_0= 'choose' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_var_3_0= ruleVarReference ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getChooseAccess().getChooseKeyword_0());
            		
            // InternalBrowserAutomation.g:986:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:987:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:987:4: (lv_value_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:988:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_value_1_0, grammarAccess.getChooseAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChooseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getChooseAccess().getInKeyword_2());
            		
            // InternalBrowserAutomation.g:1008:3: ( (lv_var_3_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:1009:4: (lv_var_3_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:1009:4: (lv_var_3_0= ruleVarReference )
            // InternalBrowserAutomation.g:1010:5: lv_var_3_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getChooseAccess().getVarVarReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_3_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChooseRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_3_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
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
    // $ANTLR end "ruleChoose"


    // $ANTLR start "entryRuleContains"
    // InternalBrowserAutomation.g:1031:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalBrowserAutomation.g:1031:49: (iv_ruleContains= ruleContains EOF )
            // InternalBrowserAutomation.g:1032:2: iv_ruleContains= ruleContains EOF
            {
             newCompositeNode(grammarAccess.getContainsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContains=ruleContains();

            state._fsp--;

             current =iv_ruleContains; 
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
    // $ANTLR end "entryRuleContains"


    // $ANTLR start "ruleContains"
    // InternalBrowserAutomation.g:1038:1: ruleContains returns [EObject current=null] : ( ( (lv_var_0_0= ruleVarReference ) ) otherlv_1= 'contains' ( (lv_var2_2_0= ruleVarReference ) ) ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;

        EObject lv_var2_2_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:1044:2: ( ( ( (lv_var_0_0= ruleVarReference ) ) otherlv_1= 'contains' ( (lv_var2_2_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:1045:2: ( ( (lv_var_0_0= ruleVarReference ) ) otherlv_1= 'contains' ( (lv_var2_2_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:1045:2: ( ( (lv_var_0_0= ruleVarReference ) ) otherlv_1= 'contains' ( (lv_var2_2_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:1046:3: ( (lv_var_0_0= ruleVarReference ) ) otherlv_1= 'contains' ( (lv_var2_2_0= ruleVarReference ) )
            {
            // InternalBrowserAutomation.g:1046:3: ( (lv_var_0_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:1047:4: (lv_var_0_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:1047:4: (lv_var_0_0= ruleVarReference )
            // InternalBrowserAutomation.g:1048:5: lv_var_0_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getVarVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_var_0_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainsRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,51,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getContainsKeyword_1());
            		
            // InternalBrowserAutomation.g:1069:3: ( (lv_var2_2_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:1070:4: (lv_var2_2_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:1070:4: (lv_var2_2_0= ruleVarReference )
            // InternalBrowserAutomation.g:1071:5: lv_var2_2_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getVar2VarReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_var2_2_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainsRule());
            					}
            					set(
            						current,
            						"var2",
            						lv_var2_2_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
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
    // $ANTLR end "ruleContains"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\40\uffff";
    static final String dfa_2s = "\16\uffff\1\24\14\uffff\1\24\3\uffff\1\24";
    static final String dfa_3s = "\1\6\1\25\2\uffff\1\26\1\33\10\27\1\6\1\5\1\45\1\6\1\uffff\1\25\1\uffff\1\27\5\30\1\6\1\4\2\31\1\6";
    static final String dfa_4s = "\1\23\1\25\2\uffff\1\26\1\44\10\34\1\62\1\5\1\51\1\6\1\uffff\1\63\1\uffff\1\32\5\30\1\62\1\6\2\31\1\62";
    static final String dfa_5s = "\2\uffff\1\3\1\4\16\uffff\1\1\1\uffff\1\2\13\uffff";
    static final String dfa_6s = "\40\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\12\uffff\1\2\1\uffff\1\3",
            "\1\4",
            "",
            "",
            "\1\5",
            "\1\16\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\20\2\uffff\1\21\1\uffff\1\17",
            "\1\20\2\uffff\1\21\1\uffff\1\17",
            "\1\20\2\uffff\1\21\1\uffff\1\17",
            "\1\20\2\uffff\1\21\1\uffff\1\17",
            "\1\20\2\uffff\1\21\1\uffff\1\17",
            "\1\20\2\uffff\1\21\1\uffff\1\17",
            "\1\20\2\uffff\1\21\1\uffff\1\17",
            "\1\20\2\uffff\1\21\1\uffff\1\17",
            "\1\23\12\uffff\1\24\1\uffff\1\24\26\uffff\1\22\1\uffff\1\22\4\uffff\2\22",
            "\1\25",
            "\1\26\1\27\1\30\1\31\1\32",
            "\1\33",
            "",
            "\1\24\30\uffff\1\22\4\uffff\1\22",
            "",
            "\1\20\2\uffff\1\21",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\23\12\uffff\1\24\1\uffff\1\24\26\uffff\1\22\1\uffff\1\22\4\uffff\2\22",
            "\1\35\1\uffff\1\36",
            "\1\37",
            "\1\37",
            "\1\23\12\uffff\1\24\1\uffff\1\24\26\uffff\1\22\1\uffff\1\22\4\uffff\2\22"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "195:2: ( (this_Get_0= ruleGet ( (lv_action_1_0= ruleAction ) ) ) | this_Get_2= ruleGet | (otherlv_3= 'uncheck' otherlv_4= 'all' ) | (otherlv_5= 'go' otherlv_6= 'to' ( (lv_url_7_0= RULE_STRING ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000A0042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0006140000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001FE8000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000014800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008000000000000L});

}