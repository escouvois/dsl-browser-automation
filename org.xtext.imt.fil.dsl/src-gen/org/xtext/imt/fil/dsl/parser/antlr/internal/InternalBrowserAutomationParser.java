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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'open'", "'go'", "'to'", "'mozilla'", "'chrome'", "'safari'", "'internet'", "'explorer'", "'uncheck'", "'all'", "'='", "'get'", "'by'", "'['", "']'", "'link'", "'input'", "'button'", "'checkbox'", "'combobox'", "'image'", "'text'", "'class'", "'value'", "'alt'", "'click'", "'on'", "'insert'", "'in'", "'is'", "'not'", "'null'", "'check'", "'choose'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    public static final int T__44=44;
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
    // InternalBrowserAutomation.g:71:1: ruleTest returns [EObject current=null] : ( () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) otherlv_3= 'go' otherlv_4= 'to' ( (lv_url_5_0= RULE_STRING ) ) ( (lv_statements_6_0= ruleStatement ) )* ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_url_5_0=null;
        AntlrDatatypeRuleToken lv_webBrowser_2_0 = null;

        EObject lv_statements_6_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:77:2: ( ( () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) otherlv_3= 'go' otherlv_4= 'to' ( (lv_url_5_0= RULE_STRING ) ) ( (lv_statements_6_0= ruleStatement ) )* ) )
            // InternalBrowserAutomation.g:78:2: ( () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) otherlv_3= 'go' otherlv_4= 'to' ( (lv_url_5_0= RULE_STRING ) ) ( (lv_statements_6_0= ruleStatement ) )* )
            {
            // InternalBrowserAutomation.g:78:2: ( () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) otherlv_3= 'go' otherlv_4= 'to' ( (lv_url_5_0= RULE_STRING ) ) ( (lv_statements_6_0= ruleStatement ) )* )
            // InternalBrowserAutomation.g:79:3: () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) otherlv_3= 'go' otherlv_4= 'to' ( (lv_url_5_0= RULE_STRING ) ) ( (lv_statements_6_0= ruleStatement ) )*
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

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTestAccess().getGoKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getTestAccess().getToKeyword_4());
            		
            // InternalBrowserAutomation.g:117:3: ( (lv_url_5_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:118:4: (lv_url_5_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:118:4: (lv_url_5_0= RULE_STRING )
            // InternalBrowserAutomation.g:119:5: lv_url_5_0= RULE_STRING
            {
            lv_url_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_url_5_0, grammarAccess.getTestAccess().getUrlSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBrowserAutomation.g:135:3: ( (lv_statements_6_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrowserAutomation.g:136:4: (lv_statements_6_0= ruleStatement )
            	    {
            	    // InternalBrowserAutomation.g:136:4: (lv_statements_6_0= ruleStatement )
            	    // InternalBrowserAutomation.g:137:5: lv_statements_6_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getStatementsStatementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_statements_6_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_6_0,
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
    // InternalBrowserAutomation.g:158:1: entryRuleWebBrowser returns [String current=null] : iv_ruleWebBrowser= ruleWebBrowser EOF ;
    public final String entryRuleWebBrowser() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWebBrowser = null;


        try {
            // InternalBrowserAutomation.g:158:50: (iv_ruleWebBrowser= ruleWebBrowser EOF )
            // InternalBrowserAutomation.g:159:2: iv_ruleWebBrowser= ruleWebBrowser EOF
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
    // InternalBrowserAutomation.g:165:1: ruleWebBrowser returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'mozilla' | kw= 'chrome' | kw= 'safari' | (kw= 'internet' kw= 'explorer' ) ) ;
    public final AntlrDatatypeRuleToken ruleWebBrowser() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:171:2: ( (kw= 'mozilla' | kw= 'chrome' | kw= 'safari' | (kw= 'internet' kw= 'explorer' ) ) )
            // InternalBrowserAutomation.g:172:2: (kw= 'mozilla' | kw= 'chrome' | kw= 'safari' | (kw= 'internet' kw= 'explorer' ) )
            {
            // InternalBrowserAutomation.g:172:2: (kw= 'mozilla' | kw= 'chrome' | kw= 'safari' | (kw= 'internet' kw= 'explorer' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
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
                    // InternalBrowserAutomation.g:173:3: kw= 'mozilla'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWebBrowserAccess().getMozillaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:179:3: kw= 'chrome'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWebBrowserAccess().getChromeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:185:3: kw= 'safari'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWebBrowserAccess().getSafariKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:191:3: (kw= 'internet' kw= 'explorer' )
                    {
                    // InternalBrowserAutomation.g:191:3: (kw= 'internet' kw= 'explorer' )
                    // InternalBrowserAutomation.g:192:4: kw= 'internet' kw= 'explorer'
                    {
                    kw=(Token)match(input,17,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getWebBrowserAccess().getInternetKeyword_3_0());
                    			
                    kw=(Token)match(input,18,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:207:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalBrowserAutomation.g:207:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalBrowserAutomation.g:208:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalBrowserAutomation.g:214:1: ruleStatement returns [EObject current=null] : ( (this_Get_0= ruleGet ( (lv_action_1_0= ruleAction ) ) ) | (otherlv_2= 'uncheck' otherlv_3= 'all' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Get_0 = null;

        EObject lv_action_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:220:2: ( ( (this_Get_0= ruleGet ( (lv_action_1_0= ruleAction ) ) ) | (otherlv_2= 'uncheck' otherlv_3= 'all' ) ) )
            // InternalBrowserAutomation.g:221:2: ( (this_Get_0= ruleGet ( (lv_action_1_0= ruleAction ) ) ) | (otherlv_2= 'uncheck' otherlv_3= 'all' ) )
            {
            // InternalBrowserAutomation.g:221:2: ( (this_Get_0= ruleGet ( (lv_action_1_0= ruleAction ) ) ) | (otherlv_2= 'uncheck' otherlv_3= 'all' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBrowserAutomation.g:222:3: (this_Get_0= ruleGet ( (lv_action_1_0= ruleAction ) ) )
                    {
                    // InternalBrowserAutomation.g:222:3: (this_Get_0= ruleGet ( (lv_action_1_0= ruleAction ) ) )
                    // InternalBrowserAutomation.g:223:4: this_Get_0= ruleGet ( (lv_action_1_0= ruleAction ) )
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getGetParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_Get_0=ruleGet();

                    state._fsp--;


                    				current = this_Get_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalBrowserAutomation.g:231:4: ( (lv_action_1_0= ruleAction ) )
                    // InternalBrowserAutomation.g:232:5: (lv_action_1_0= ruleAction )
                    {
                    // InternalBrowserAutomation.g:232:5: (lv_action_1_0= ruleAction )
                    // InternalBrowserAutomation.g:233:6: lv_action_1_0= ruleAction
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
                    // InternalBrowserAutomation.g:252:3: (otherlv_2= 'uncheck' otherlv_3= 'all' )
                    {
                    // InternalBrowserAutomation.g:252:3: (otherlv_2= 'uncheck' otherlv_3= 'all' )
                    // InternalBrowserAutomation.g:253:4: otherlv_2= 'uncheck' otherlv_3= 'all'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getUncheckKeyword_1_0());
                    			
                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getAllKeyword_1_1());
                    			

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
    // InternalBrowserAutomation.g:266:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalBrowserAutomation.g:266:47: (iv_ruleAction= ruleAction EOF )
            // InternalBrowserAutomation.g:267:2: iv_ruleAction= ruleAction EOF
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
    // InternalBrowserAutomation.g:273:1: ruleAction returns [EObject current=null] : (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Check_3= ruleCheck | this_Choose_4= ruleChoose ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;

        EObject this_Insert_1 = null;

        EObject this_Verify_2 = null;

        EObject this_Check_3 = null;

        EObject this_Choose_4 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:279:2: ( (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Check_3= ruleCheck | this_Choose_4= ruleChoose ) )
            // InternalBrowserAutomation.g:280:2: (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Check_3= ruleCheck | this_Choose_4= ruleChoose )
            {
            // InternalBrowserAutomation.g:280:2: (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Check_3= ruleCheck | this_Choose_4= ruleChoose )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt4=1;
                }
                break;
            case 38:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            case 43:
                {
                alt4=4;
                }
                break;
            case 44:
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
                    // InternalBrowserAutomation.g:281:3: this_Click_0= ruleClick
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
                    // InternalBrowserAutomation.g:290:3: this_Insert_1= ruleInsert
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
                    // InternalBrowserAutomation.g:299:3: this_Verify_2= ruleVerify
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
                    // InternalBrowserAutomation.g:308:3: this_Check_3= ruleCheck
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
                    // InternalBrowserAutomation.g:317:3: this_Choose_4= ruleChoose
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getChooseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Choose_4=ruleChoose();

                    state._fsp--;


                    			current = this_Choose_4;
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
    // InternalBrowserAutomation.g:329:1: entryRuleGet returns [EObject current=null] : iv_ruleGet= ruleGet EOF ;
    public final EObject entryRuleGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGet = null;


        try {
            // InternalBrowserAutomation.g:329:44: (iv_ruleGet= ruleGet EOF )
            // InternalBrowserAutomation.g:330:2: iv_ruleGet= ruleGet EOF
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
    // InternalBrowserAutomation.g:336:1: ruleGet returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '=' otherlv_2= 'get' ( (lv_element_3_0= ruleElement ) ) otherlv_4= 'by' ( (lv_attr_5_0= ruleAttribut ) ) otherlv_6= '[' ( (lv_attrVal_7_0= RULE_STRING ) ) otherlv_8= ']' ) ;
    public final EObject ruleGet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_attrVal_7_0=null;
        Token otherlv_8=null;
        EObject lv_var_0_0 = null;

        AntlrDatatypeRuleToken lv_element_3_0 = null;

        AntlrDatatypeRuleToken lv_attr_5_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:342:2: ( ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '=' otherlv_2= 'get' ( (lv_element_3_0= ruleElement ) ) otherlv_4= 'by' ( (lv_attr_5_0= ruleAttribut ) ) otherlv_6= '[' ( (lv_attrVal_7_0= RULE_STRING ) ) otherlv_8= ']' ) )
            // InternalBrowserAutomation.g:343:2: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '=' otherlv_2= 'get' ( (lv_element_3_0= ruleElement ) ) otherlv_4= 'by' ( (lv_attr_5_0= ruleAttribut ) ) otherlv_6= '[' ( (lv_attrVal_7_0= RULE_STRING ) ) otherlv_8= ']' )
            {
            // InternalBrowserAutomation.g:343:2: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '=' otherlv_2= 'get' ( (lv_element_3_0= ruleElement ) ) otherlv_4= 'by' ( (lv_attr_5_0= ruleAttribut ) ) otherlv_6= '[' ( (lv_attrVal_7_0= RULE_STRING ) ) otherlv_8= ']' )
            // InternalBrowserAutomation.g:344:3: ( (lv_var_0_0= ruleVariable ) ) otherlv_1= '=' otherlv_2= 'get' ( (lv_element_3_0= ruleElement ) ) otherlv_4= 'by' ( (lv_attr_5_0= ruleAttribut ) ) otherlv_6= '[' ( (lv_attrVal_7_0= RULE_STRING ) ) otherlv_8= ']'
            {
            // InternalBrowserAutomation.g:344:3: ( (lv_var_0_0= ruleVariable ) )
            // InternalBrowserAutomation.g:345:4: (lv_var_0_0= ruleVariable )
            {
            // InternalBrowserAutomation.g:345:4: (lv_var_0_0= ruleVariable )
            // InternalBrowserAutomation.g:346:5: lv_var_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getGetAccess().getVarVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_1=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getGetAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getGetAccess().getGetKeyword_2());
            		
            // InternalBrowserAutomation.g:371:3: ( (lv_element_3_0= ruleElement ) )
            // InternalBrowserAutomation.g:372:4: (lv_element_3_0= ruleElement )
            {
            // InternalBrowserAutomation.g:372:4: (lv_element_3_0= ruleElement )
            // InternalBrowserAutomation.g:373:5: lv_element_3_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getGetAccess().getElementElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getGetAccess().getByKeyword_4());
            		
            // InternalBrowserAutomation.g:394:3: ( (lv_attr_5_0= ruleAttribut ) )
            // InternalBrowserAutomation.g:395:4: (lv_attr_5_0= ruleAttribut )
            {
            // InternalBrowserAutomation.g:395:4: (lv_attr_5_0= ruleAttribut )
            // InternalBrowserAutomation.g:396:5: lv_attr_5_0= ruleAttribut
            {

            					newCompositeNode(grammarAccess.getGetAccess().getAttrAttributParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_attr_5_0=ruleAttribut();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetRule());
            					}
            					set(
            						current,
            						"attr",
            						lv_attr_5_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.Attribut");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getGetAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalBrowserAutomation.g:417:3: ( (lv_attrVal_7_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:418:4: (lv_attrVal_7_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:418:4: (lv_attrVal_7_0= RULE_STRING )
            // InternalBrowserAutomation.g:419:5: lv_attrVal_7_0= RULE_STRING
            {
            lv_attrVal_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_attrVal_7_0, grammarAccess.getGetAccess().getAttrValSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attrVal",
            						lv_attrVal_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGetAccess().getRightSquareBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleElement"
    // InternalBrowserAutomation.g:443:1: entryRuleElement returns [String current=null] : iv_ruleElement= ruleElement EOF ;
    public final String entryRuleElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElement = null;


        try {
            // InternalBrowserAutomation.g:443:47: (iv_ruleElement= ruleElement EOF )
            // InternalBrowserAutomation.g:444:2: iv_ruleElement= ruleElement EOF
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
    // InternalBrowserAutomation.g:450:1: ruleElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' ) ;
    public final AntlrDatatypeRuleToken ruleElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:456:2: ( (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' ) )
            // InternalBrowserAutomation.g:457:2: (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' )
            {
            // InternalBrowserAutomation.g:457:2: (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 29:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            case 31:
                {
                alt5=6;
                }
                break;
            case 32:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBrowserAutomation.g:458:3: kw= 'link'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getLinkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:464:3: kw= 'input'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getInputKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:470:3: kw= 'button'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getButtonKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:476:3: kw= 'checkbox'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getCheckboxKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:482:3: kw= 'combobox'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getComboboxKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:488:3: kw= 'image'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getImageKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalBrowserAutomation.g:494:3: kw= 'text'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getTextKeyword_6());
                    		

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
    // InternalBrowserAutomation.g:503:1: entryRuleAttribut returns [String current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final String entryRuleAttribut() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttribut = null;


        try {
            // InternalBrowserAutomation.g:503:48: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalBrowserAutomation.g:504:2: iv_ruleAttribut= ruleAttribut EOF
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
    // InternalBrowserAutomation.g:510:1: ruleAttribut returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'class' | kw= 'value' | kw= 'alt' ) ;
    public final AntlrDatatypeRuleToken ruleAttribut() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:516:2: ( (kw= 'class' | kw= 'value' | kw= 'alt' ) )
            // InternalBrowserAutomation.g:517:2: (kw= 'class' | kw= 'value' | kw= 'alt' )
            {
            // InternalBrowserAutomation.g:517:2: (kw= 'class' | kw= 'value' | kw= 'alt' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt6=1;
                }
                break;
            case 34:
                {
                alt6=2;
                }
                break;
            case 35:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBrowserAutomation.g:518:3: kw= 'class'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getClassKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:524:3: kw= 'value'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getValueKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:530:3: kw= 'alt'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getAltKeyword_2());
                    		

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
    // InternalBrowserAutomation.g:539:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalBrowserAutomation.g:539:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalBrowserAutomation.g:540:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalBrowserAutomation.g:546:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:552:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:553:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:553:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBrowserAutomation.g:554:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:554:3: (lv_name_0_0= RULE_ID )
            // InternalBrowserAutomation.g:555:4: lv_name_0_0= RULE_ID
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
    // InternalBrowserAutomation.g:574:1: entryRuleVarReference returns [EObject current=null] : iv_ruleVarReference= ruleVarReference EOF ;
    public final EObject entryRuleVarReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarReference = null;


        try {
            // InternalBrowserAutomation.g:574:53: (iv_ruleVarReference= ruleVarReference EOF )
            // InternalBrowserAutomation.g:575:2: iv_ruleVarReference= ruleVarReference EOF
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
    // InternalBrowserAutomation.g:581:1: ruleVarReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVarReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:587:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:588:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:588:2: ( (otherlv_0= RULE_ID ) )
            // InternalBrowserAutomation.g:589:3: (otherlv_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:589:3: (otherlv_0= RULE_ID )
            // InternalBrowserAutomation.g:590:4: otherlv_0= RULE_ID
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
    // InternalBrowserAutomation.g:604:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalBrowserAutomation.g:604:46: (iv_ruleClick= ruleClick EOF )
            // InternalBrowserAutomation.g:605:2: iv_ruleClick= ruleClick EOF
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
    // InternalBrowserAutomation.g:611:1: ruleClick returns [EObject current=null] : (otherlv_0= 'click' otherlv_1= 'on' ( (lv_var_2_0= ruleVarReference ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_var_2_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:617:2: ( (otherlv_0= 'click' otherlv_1= 'on' ( (lv_var_2_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:618:2: (otherlv_0= 'click' otherlv_1= 'on' ( (lv_var_2_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:618:2: (otherlv_0= 'click' otherlv_1= 'on' ( (lv_var_2_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:619:3: otherlv_0= 'click' otherlv_1= 'on' ( (lv_var_2_0= ruleVarReference ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getClickAccess().getOnKeyword_1());
            		
            // InternalBrowserAutomation.g:627:3: ( (lv_var_2_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:628:4: (lv_var_2_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:628:4: (lv_var_2_0= ruleVarReference )
            // InternalBrowserAutomation.g:629:5: lv_var_2_0= ruleVarReference
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
    // InternalBrowserAutomation.g:650:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalBrowserAutomation.g:650:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalBrowserAutomation.g:651:2: iv_ruleInsert= ruleInsert EOF
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
    // InternalBrowserAutomation.g:657:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'insert' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_var_3_0= ruleVarReference ) ) ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        EObject lv_var_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:663:2: ( (otherlv_0= 'insert' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_var_3_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:664:2: (otherlv_0= 'insert' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_var_3_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:664:2: (otherlv_0= 'insert' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_var_3_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:665:3: otherlv_0= 'insert' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_var_3_0= ruleVarReference ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
            		
            // InternalBrowserAutomation.g:669:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:670:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:670:4: (lv_value_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:671:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_value_1_0, grammarAccess.getInsertAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getInKeyword_2());
            		
            // InternalBrowserAutomation.g:691:3: ( (lv_var_3_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:692:4: (lv_var_3_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:692:4: (lv_var_3_0= ruleVarReference )
            // InternalBrowserAutomation.g:693:5: lv_var_3_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getVarVarReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_3_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
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
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleVerify"
    // InternalBrowserAutomation.g:714:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // InternalBrowserAutomation.g:714:47: (iv_ruleVerify= ruleVerify EOF )
            // InternalBrowserAutomation.g:715:2: iv_ruleVerify= ruleVerify EOF
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
    // InternalBrowserAutomation.g:721:1: ruleVerify returns [EObject current=null] : ( ( (lv_var_0_0= ruleVarReference ) ) otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'null' ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_var_0_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:727:2: ( ( ( (lv_var_0_0= ruleVarReference ) ) otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'null' ) )
            // InternalBrowserAutomation.g:728:2: ( ( (lv_var_0_0= ruleVarReference ) ) otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'null' )
            {
            // InternalBrowserAutomation.g:728:2: ( ( (lv_var_0_0= ruleVarReference ) ) otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'null' )
            // InternalBrowserAutomation.g:729:3: ( (lv_var_0_0= ruleVarReference ) ) otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'null'
            {
            // InternalBrowserAutomation.g:729:3: ( (lv_var_0_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:730:4: (lv_var_0_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:730:4: (lv_var_0_0= ruleVarReference )
            // InternalBrowserAutomation.g:731:5: lv_var_0_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getVerifyAccess().getVarVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_1=(Token)match(input,40,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifyAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getVerifyAccess().getNotKeyword_2());
            		
            otherlv_3=(Token)match(input,42,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:764:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // InternalBrowserAutomation.g:764:46: (iv_ruleCheck= ruleCheck EOF )
            // InternalBrowserAutomation.g:765:2: iv_ruleCheck= ruleCheck EOF
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
    // InternalBrowserAutomation.g:771:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'check' ( (lv_var_1_0= ruleVarReference ) ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_var_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:777:2: ( (otherlv_0= 'check' ( (lv_var_1_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:778:2: (otherlv_0= 'check' ( (lv_var_1_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:778:2: (otherlv_0= 'check' ( (lv_var_1_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:779:3: otherlv_0= 'check' ( (lv_var_1_0= ruleVarReference ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
            		
            // InternalBrowserAutomation.g:783:3: ( (lv_var_1_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:784:4: (lv_var_1_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:784:4: (lv_var_1_0= ruleVarReference )
            // InternalBrowserAutomation.g:785:5: lv_var_1_0= ruleVarReference
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
    // InternalBrowserAutomation.g:806:1: entryRuleChoose returns [EObject current=null] : iv_ruleChoose= ruleChoose EOF ;
    public final EObject entryRuleChoose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoose = null;


        try {
            // InternalBrowserAutomation.g:806:47: (iv_ruleChoose= ruleChoose EOF )
            // InternalBrowserAutomation.g:807:2: iv_ruleChoose= ruleChoose EOF
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
    // InternalBrowserAutomation.g:813:1: ruleChoose returns [EObject current=null] : (otherlv_0= 'choose' ( (lv_var_1_0= ruleVarReference ) ) ) ;
    public final EObject ruleChoose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_var_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:819:2: ( (otherlv_0= 'choose' ( (lv_var_1_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:820:2: (otherlv_0= 'choose' ( (lv_var_1_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:820:2: (otherlv_0= 'choose' ( (lv_var_1_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:821:3: otherlv_0= 'choose' ( (lv_var_1_0= ruleVarReference ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getChooseAccess().getChooseKeyword_0());
            		
            // InternalBrowserAutomation.g:825:3: ( (lv_var_1_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:826:4: (lv_var_1_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:826:4: (lv_var_1_0= ruleVarReference )
            // InternalBrowserAutomation.g:827:5: lv_var_1_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getChooseAccess().getVarVarReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_1_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChooseRule());
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
    // $ANTLR end "ruleChoose"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000185000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000001FC000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});

}