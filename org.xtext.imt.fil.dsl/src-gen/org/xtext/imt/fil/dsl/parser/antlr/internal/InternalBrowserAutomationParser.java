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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'open'", "'go'", "'to'", "'firefox'", "'chrome'", "'safari'", "'internet explorer'", "':'", "'get'", "'by'", "'='", "'link'", "'input'", "'button'", "'checkbox'", "'combobox'", "'image'", "'text'", "'class'", "'value'", "'alt'", "'click'", "'on'", "'insert'", "'in'", "'verify page contains'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalBrowserAutomation.g:71:1: ruleTest returns [EObject current=null] : ( () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) otherlv_3= 'go' otherlv_4= 'to' ( (lv_url_5_0= RULE_STRING ) ) ( (lv_actions_6_0= ruleAction ) )* ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_url_5_0=null;
        AntlrDatatypeRuleToken lv_webBrowser_2_0 = null;

        EObject lv_actions_6_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:77:2: ( ( () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) otherlv_3= 'go' otherlv_4= 'to' ( (lv_url_5_0= RULE_STRING ) ) ( (lv_actions_6_0= ruleAction ) )* ) )
            // InternalBrowserAutomation.g:78:2: ( () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) otherlv_3= 'go' otherlv_4= 'to' ( (lv_url_5_0= RULE_STRING ) ) ( (lv_actions_6_0= ruleAction ) )* )
            {
            // InternalBrowserAutomation.g:78:2: ( () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) otherlv_3= 'go' otherlv_4= 'to' ( (lv_url_5_0= RULE_STRING ) ) ( (lv_actions_6_0= ruleAction ) )* )
            // InternalBrowserAutomation.g:79:3: () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) otherlv_3= 'go' otherlv_4= 'to' ( (lv_url_5_0= RULE_STRING ) ) ( (lv_actions_6_0= ruleAction ) )*
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

            // InternalBrowserAutomation.g:135:3: ( (lv_actions_6_0= ruleAction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrowserAutomation.g:136:4: (lv_actions_6_0= ruleAction )
            	    {
            	    // InternalBrowserAutomation.g:136:4: (lv_actions_6_0= ruleAction )
            	    // InternalBrowserAutomation.g:137:5: lv_actions_6_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getActionsActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_actions_6_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_6_0,
            	    						"org.xtext.imt.fil.dsl.BrowserAutomation.Action");
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
    // InternalBrowserAutomation.g:165:1: ruleWebBrowser returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'firefox' | kw= 'chrome' | kw= 'safari' | kw= 'internet explorer' ) ;
    public final AntlrDatatypeRuleToken ruleWebBrowser() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:171:2: ( (kw= 'firefox' | kw= 'chrome' | kw= 'safari' | kw= 'internet explorer' ) )
            // InternalBrowserAutomation.g:172:2: (kw= 'firefox' | kw= 'chrome' | kw= 'safari' | kw= 'internet explorer' )
            {
            // InternalBrowserAutomation.g:172:2: (kw= 'firefox' | kw= 'chrome' | kw= 'safari' | kw= 'internet explorer' )
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
                    // InternalBrowserAutomation.g:173:3: kw= 'firefox'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWebBrowserAccess().getFirefoxKeyword_0());
                    		

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
                    // InternalBrowserAutomation.g:191:3: kw= 'internet explorer'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWebBrowserAccess().getInternetExplorerKeyword_3());
                    		

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


    // $ANTLR start "entryRuleAction"
    // InternalBrowserAutomation.g:200:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalBrowserAutomation.g:200:47: (iv_ruleAction= ruleAction EOF )
            // InternalBrowserAutomation.g:201:2: iv_ruleAction= ruleAction EOF
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
    // InternalBrowserAutomation.g:207:1: ruleAction returns [EObject current=null] : (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;

        EObject this_Insert_1 = null;

        EObject this_Verify_2 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:213:2: ( (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify ) )
            // InternalBrowserAutomation.g:214:2: (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify )
            {
            // InternalBrowserAutomation.g:214:2: (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalBrowserAutomation.g:215:3: this_Click_0= ruleClick
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
                    // InternalBrowserAutomation.g:224:3: this_Insert_1= ruleInsert
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
                    // InternalBrowserAutomation.g:233:3: this_Verify_2= ruleVerify
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getVerifyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Verify_2=ruleVerify();

                    state._fsp--;


                    			current = this_Verify_2;
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
    // InternalBrowserAutomation.g:245:1: entryRuleGet returns [EObject current=null] : iv_ruleGet= ruleGet EOF ;
    public final EObject entryRuleGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGet = null;


        try {
            // InternalBrowserAutomation.g:245:44: (iv_ruleGet= ruleGet EOF )
            // InternalBrowserAutomation.g:246:2: iv_ruleGet= ruleGet EOF
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
    // InternalBrowserAutomation.g:252:1: ruleGet returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= ':' otherlv_2= 'get' ( (lv_element_3_0= ruleElement ) ) otherlv_4= 'by' ( (lv_attr_5_0= ruleAttribut ) ) otherlv_6= '=' ( (lv_attrVal_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleGet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_attrVal_7_0=null;
        EObject lv_var_0_0 = null;

        AntlrDatatypeRuleToken lv_element_3_0 = null;

        AntlrDatatypeRuleToken lv_attr_5_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:258:2: ( ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= ':' otherlv_2= 'get' ( (lv_element_3_0= ruleElement ) ) otherlv_4= 'by' ( (lv_attr_5_0= ruleAttribut ) ) otherlv_6= '=' ( (lv_attrVal_7_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:259:2: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= ':' otherlv_2= 'get' ( (lv_element_3_0= ruleElement ) ) otherlv_4= 'by' ( (lv_attr_5_0= ruleAttribut ) ) otherlv_6= '=' ( (lv_attrVal_7_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:259:2: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= ':' otherlv_2= 'get' ( (lv_element_3_0= ruleElement ) ) otherlv_4= 'by' ( (lv_attr_5_0= ruleAttribut ) ) otherlv_6= '=' ( (lv_attrVal_7_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:260:3: ( (lv_var_0_0= ruleVariable ) ) otherlv_1= ':' otherlv_2= 'get' ( (lv_element_3_0= ruleElement ) ) otherlv_4= 'by' ( (lv_attr_5_0= ruleAttribut ) ) otherlv_6= '=' ( (lv_attrVal_7_0= RULE_STRING ) )
            {
            // InternalBrowserAutomation.g:260:3: ( (lv_var_0_0= ruleVariable ) )
            // InternalBrowserAutomation.g:261:4: (lv_var_0_0= ruleVariable )
            {
            // InternalBrowserAutomation.g:261:4: (lv_var_0_0= ruleVariable )
            // InternalBrowserAutomation.g:262:5: lv_var_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getGetAccess().getVarVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_1=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getGetAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getGetAccess().getGetKeyword_2());
            		
            // InternalBrowserAutomation.g:287:3: ( (lv_element_3_0= ruleElement ) )
            // InternalBrowserAutomation.g:288:4: (lv_element_3_0= ruleElement )
            {
            // InternalBrowserAutomation.g:288:4: (lv_element_3_0= ruleElement )
            // InternalBrowserAutomation.g:289:5: lv_element_3_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getGetAccess().getElementElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_4=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getGetAccess().getByKeyword_4());
            		
            // InternalBrowserAutomation.g:310:3: ( (lv_attr_5_0= ruleAttribut ) )
            // InternalBrowserAutomation.g:311:4: (lv_attr_5_0= ruleAttribut )
            {
            // InternalBrowserAutomation.g:311:4: (lv_attr_5_0= ruleAttribut )
            // InternalBrowserAutomation.g:312:5: lv_attr_5_0= ruleAttribut
            {

            					newCompositeNode(grammarAccess.getGetAccess().getAttrAttributParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_6=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getGetAccess().getEqualsSignKeyword_6());
            		
            // InternalBrowserAutomation.g:333:3: ( (lv_attrVal_7_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:334:4: (lv_attrVal_7_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:334:4: (lv_attrVal_7_0= RULE_STRING )
            // InternalBrowserAutomation.g:335:5: lv_attrVal_7_0= RULE_STRING
            {
            lv_attrVal_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:355:1: entryRuleElement returns [String current=null] : iv_ruleElement= ruleElement EOF ;
    public final String entryRuleElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElement = null;


        try {
            // InternalBrowserAutomation.g:355:47: (iv_ruleElement= ruleElement EOF )
            // InternalBrowserAutomation.g:356:2: iv_ruleElement= ruleElement EOF
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
    // InternalBrowserAutomation.g:362:1: ruleElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' ) ;
    public final AntlrDatatypeRuleToken ruleElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:368:2: ( (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' ) )
            // InternalBrowserAutomation.g:369:2: (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' )
            {
            // InternalBrowserAutomation.g:369:2: (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 26:
                {
                alt4=5;
                }
                break;
            case 27:
                {
                alt4=6;
                }
                break;
            case 28:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBrowserAutomation.g:370:3: kw= 'link'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getLinkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:376:3: kw= 'input'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getInputKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:382:3: kw= 'button'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getButtonKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:388:3: kw= 'checkbox'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getCheckboxKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:394:3: kw= 'combobox'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getComboboxKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:400:3: kw= 'image'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getImageKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalBrowserAutomation.g:406:3: kw= 'text'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:415:1: entryRuleAttribut returns [String current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final String entryRuleAttribut() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttribut = null;


        try {
            // InternalBrowserAutomation.g:415:48: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalBrowserAutomation.g:416:2: iv_ruleAttribut= ruleAttribut EOF
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
    // InternalBrowserAutomation.g:422:1: ruleAttribut returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'class' | kw= 'value' | kw= 'alt' ) ;
    public final AntlrDatatypeRuleToken ruleAttribut() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:428:2: ( (kw= 'class' | kw= 'value' | kw= 'alt' ) )
            // InternalBrowserAutomation.g:429:2: (kw= 'class' | kw= 'value' | kw= 'alt' )
            {
            // InternalBrowserAutomation.g:429:2: (kw= 'class' | kw= 'value' | kw= 'alt' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBrowserAutomation.g:430:3: kw= 'class'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getClassKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:436:3: kw= 'value'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getValueKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:442:3: kw= 'alt'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:451:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalBrowserAutomation.g:451:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalBrowserAutomation.g:452:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalBrowserAutomation.g:458:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:464:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:465:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:465:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBrowserAutomation.g:466:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:466:3: (lv_name_0_0= RULE_ID )
            // InternalBrowserAutomation.g:467:4: lv_name_0_0= RULE_ID
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
    // InternalBrowserAutomation.g:486:1: entryRuleVarReference returns [EObject current=null] : iv_ruleVarReference= ruleVarReference EOF ;
    public final EObject entryRuleVarReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarReference = null;


        try {
            // InternalBrowserAutomation.g:486:53: (iv_ruleVarReference= ruleVarReference EOF )
            // InternalBrowserAutomation.g:487:2: iv_ruleVarReference= ruleVarReference EOF
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
    // InternalBrowserAutomation.g:493:1: ruleVarReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVarReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:499:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:500:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:500:2: ( (otherlv_0= RULE_ID ) )
            // InternalBrowserAutomation.g:501:3: (otherlv_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:501:3: (otherlv_0= RULE_ID )
            // InternalBrowserAutomation.g:502:4: otherlv_0= RULE_ID
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
    // InternalBrowserAutomation.g:516:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalBrowserAutomation.g:516:46: (iv_ruleClick= ruleClick EOF )
            // InternalBrowserAutomation.g:517:2: iv_ruleClick= ruleClick EOF
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
    // InternalBrowserAutomation.g:523:1: ruleClick returns [EObject current=null] : ( ( (lv_get_0_0= ruleGet ) ) otherlv_1= 'click' otherlv_2= 'on' ( (lv_var_3_0= ruleVarReference ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_get_0_0 = null;

        EObject lv_var_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:529:2: ( ( ( (lv_get_0_0= ruleGet ) ) otherlv_1= 'click' otherlv_2= 'on' ( (lv_var_3_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:530:2: ( ( (lv_get_0_0= ruleGet ) ) otherlv_1= 'click' otherlv_2= 'on' ( (lv_var_3_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:530:2: ( ( (lv_get_0_0= ruleGet ) ) otherlv_1= 'click' otherlv_2= 'on' ( (lv_var_3_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:531:3: ( (lv_get_0_0= ruleGet ) ) otherlv_1= 'click' otherlv_2= 'on' ( (lv_var_3_0= ruleVarReference ) )
            {
            // InternalBrowserAutomation.g:531:3: ( (lv_get_0_0= ruleGet ) )
            // InternalBrowserAutomation.g:532:4: (lv_get_0_0= ruleGet )
            {
            // InternalBrowserAutomation.g:532:4: (lv_get_0_0= ruleGet )
            // InternalBrowserAutomation.g:533:5: lv_get_0_0= ruleGet
            {

            					newCompositeNode(grammarAccess.getClickAccess().getGetGetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_get_0_0=ruleGet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
            					}
            					set(
            						current,
            						"get",
            						lv_get_0_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.Get");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getClickAccess().getClickKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getClickAccess().getOnKeyword_2());
            		
            // InternalBrowserAutomation.g:558:3: ( (lv_var_3_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:559:4: (lv_var_3_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:559:4: (lv_var_3_0= ruleVarReference )
            // InternalBrowserAutomation.g:560:5: lv_var_3_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getClickAccess().getVarVarReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_3_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
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
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleInsert"
    // InternalBrowserAutomation.g:581:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalBrowserAutomation.g:581:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalBrowserAutomation.g:582:2: iv_ruleInsert= ruleInsert EOF
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
    // InternalBrowserAutomation.g:588:1: ruleInsert returns [EObject current=null] : ( ( (lv_get_0_0= ruleGet ) ) otherlv_1= 'insert' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVarReference ) ) ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        EObject lv_get_0_0 = null;

        EObject lv_var_4_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:594:2: ( ( ( (lv_get_0_0= ruleGet ) ) otherlv_1= 'insert' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:595:2: ( ( (lv_get_0_0= ruleGet ) ) otherlv_1= 'insert' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:595:2: ( ( (lv_get_0_0= ruleGet ) ) otherlv_1= 'insert' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:596:3: ( (lv_get_0_0= ruleGet ) ) otherlv_1= 'insert' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVarReference ) )
            {
            // InternalBrowserAutomation.g:596:3: ( (lv_get_0_0= ruleGet ) )
            // InternalBrowserAutomation.g:597:4: (lv_get_0_0= ruleGet )
            {
            // InternalBrowserAutomation.g:597:4: (lv_get_0_0= ruleGet )
            // InternalBrowserAutomation.g:598:5: lv_get_0_0= ruleGet
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getGetGetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_get_0_0=ruleGet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"get",
            						lv_get_0_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.Get");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertAccess().getInsertKeyword_1());
            		
            // InternalBrowserAutomation.g:619:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:620:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:620:4: (lv_value_2_0= RULE_STRING )
            // InternalBrowserAutomation.g:621:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_value_2_0, grammarAccess.getInsertAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getInsertAccess().getInKeyword_3());
            		
            // InternalBrowserAutomation.g:641:3: ( (lv_var_4_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:642:4: (lv_var_4_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:642:4: (lv_var_4_0= ruleVarReference )
            // InternalBrowserAutomation.g:643:5: lv_var_4_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getVarVarReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_4_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_4_0,
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
    // InternalBrowserAutomation.g:664:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // InternalBrowserAutomation.g:664:47: (iv_ruleVerify= ruleVerify EOF )
            // InternalBrowserAutomation.g:665:2: iv_ruleVerify= ruleVerify EOF
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
    // InternalBrowserAutomation.g:671:1: ruleVerify returns [EObject current=null] : ( ( (lv_get_0_0= ruleGet ) ) otherlv_1= 'verify page contains' ( (lv_var_2_0= ruleVarReference ) ) ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_get_0_0 = null;

        EObject lv_var_2_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:677:2: ( ( ( (lv_get_0_0= ruleGet ) ) otherlv_1= 'verify page contains' ( (lv_var_2_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:678:2: ( ( (lv_get_0_0= ruleGet ) ) otherlv_1= 'verify page contains' ( (lv_var_2_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:678:2: ( ( (lv_get_0_0= ruleGet ) ) otherlv_1= 'verify page contains' ( (lv_var_2_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:679:3: ( (lv_get_0_0= ruleGet ) ) otherlv_1= 'verify page contains' ( (lv_var_2_0= ruleVarReference ) )
            {
            // InternalBrowserAutomation.g:679:3: ( (lv_get_0_0= ruleGet ) )
            // InternalBrowserAutomation.g:680:4: (lv_get_0_0= ruleGet )
            {
            // InternalBrowserAutomation.g:680:4: (lv_get_0_0= ruleGet )
            // InternalBrowserAutomation.g:681:5: lv_get_0_0= ruleGet
            {

            					newCompositeNode(grammarAccess.getVerifyAccess().getGetGetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_get_0_0=ruleGet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifyRule());
            					}
            					set(
            						current,
            						"get",
            						lv_get_0_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.Get");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifyAccess().getVerifyPageContainsKeyword_1());
            		
            // InternalBrowserAutomation.g:702:3: ( (lv_var_2_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:703:4: (lv_var_2_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:703:4: (lv_var_2_0= ruleVarReference )
            // InternalBrowserAutomation.g:704:5: lv_var_2_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getVerifyAccess().getVarVarReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_2_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifyRule());
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
    // $ANTLR end "ruleVerify"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\5\1\22\1\23\1\26\7\24\1\35\3\25\1\4\1\40\3\uffff";
    static final String dfa_3s = "\1\5\1\22\1\23\1\34\7\24\1\37\3\25\1\4\1\44\3\uffff";
    static final String dfa_4s = "\21\uffff\1\2\1\1\1\3";
    static final String dfa_5s = "\24\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\14\1\15\1\16",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\20",
            "\1\22\1\uffff\1\21\1\uffff\1\23",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "214:2: (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000001FC00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});

}