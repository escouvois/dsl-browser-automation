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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'open'", "'go'", "'to'", "'mozilla'", "'chrome'", "'safari'", "'internet explorer'", "':'", "'get'", "'by'", "'['", "']'", "'link'", "'input'", "'button'", "'checkbox'", "'combobox'", "'image'", "'text'", "'class'", "'value'", "'alt'", "'click'", "'on'", "'insert'", "'in'", "'verify page contains'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
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

                if ( (LA1_0==RULE_ID||LA1_0==33||LA1_0==35||LA1_0==37) ) {
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
    // InternalBrowserAutomation.g:165:1: ruleWebBrowser returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'mozilla' | kw= 'chrome' | kw= 'safari' | kw= 'internet explorer' ) ;
    public final AntlrDatatypeRuleToken ruleWebBrowser() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:171:2: ( (kw= 'mozilla' | kw= 'chrome' | kw= 'safari' | kw= 'internet explorer' ) )
            // InternalBrowserAutomation.g:172:2: (kw= 'mozilla' | kw= 'chrome' | kw= 'safari' | kw= 'internet explorer' )
            {
            // InternalBrowserAutomation.g:172:2: (kw= 'mozilla' | kw= 'chrome' | kw= 'safari' | kw= 'internet explorer' )
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
    // InternalBrowserAutomation.g:207:1: ruleAction returns [EObject current=null] : (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Get_3= ruleGet ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;

        EObject this_Insert_1 = null;

        EObject this_Verify_2 = null;

        EObject this_Get_3 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:213:2: ( (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Get_3= ruleGet ) )
            // InternalBrowserAutomation.g:214:2: (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Get_3= ruleGet )
            {
            // InternalBrowserAutomation.g:214:2: (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Get_3= ruleGet )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt3=1;
                }
                break;
            case 35:
                {
                alt3=2;
                }
                break;
            case 37:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

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
                case 4 :
                    // InternalBrowserAutomation.g:242:3: this_Get_3= ruleGet
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getGetParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Get_3=ruleGet();

                    state._fsp--;


                    			current = this_Get_3;
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
    // InternalBrowserAutomation.g:254:1: entryRuleGet returns [EObject current=null] : iv_ruleGet= ruleGet EOF ;
    public final EObject entryRuleGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGet = null;


        try {
            // InternalBrowserAutomation.g:254:44: (iv_ruleGet= ruleGet EOF )
            // InternalBrowserAutomation.g:255:2: iv_ruleGet= ruleGet EOF
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
    // InternalBrowserAutomation.g:261:1: ruleGet returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= ':' otherlv_2= 'get' ( (lv_element_3_0= ruleElement ) ) otherlv_4= 'by' ( (lv_attr_5_0= ruleAttribut ) ) otherlv_6= '[' ( (lv_attrVal_7_0= RULE_STRING ) ) otherlv_8= ']' ) ;
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
            // InternalBrowserAutomation.g:267:2: ( ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= ':' otherlv_2= 'get' ( (lv_element_3_0= ruleElement ) ) otherlv_4= 'by' ( (lv_attr_5_0= ruleAttribut ) ) otherlv_6= '[' ( (lv_attrVal_7_0= RULE_STRING ) ) otherlv_8= ']' ) )
            // InternalBrowserAutomation.g:268:2: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= ':' otherlv_2= 'get' ( (lv_element_3_0= ruleElement ) ) otherlv_4= 'by' ( (lv_attr_5_0= ruleAttribut ) ) otherlv_6= '[' ( (lv_attrVal_7_0= RULE_STRING ) ) otherlv_8= ']' )
            {
            // InternalBrowserAutomation.g:268:2: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= ':' otherlv_2= 'get' ( (lv_element_3_0= ruleElement ) ) otherlv_4= 'by' ( (lv_attr_5_0= ruleAttribut ) ) otherlv_6= '[' ( (lv_attrVal_7_0= RULE_STRING ) ) otherlv_8= ']' )
            // InternalBrowserAutomation.g:269:3: ( (lv_var_0_0= ruleVariable ) ) otherlv_1= ':' otherlv_2= 'get' ( (lv_element_3_0= ruleElement ) ) otherlv_4= 'by' ( (lv_attr_5_0= ruleAttribut ) ) otherlv_6= '[' ( (lv_attrVal_7_0= RULE_STRING ) ) otherlv_8= ']'
            {
            // InternalBrowserAutomation.g:269:3: ( (lv_var_0_0= ruleVariable ) )
            // InternalBrowserAutomation.g:270:4: (lv_var_0_0= ruleVariable )
            {
            // InternalBrowserAutomation.g:270:4: (lv_var_0_0= ruleVariable )
            // InternalBrowserAutomation.g:271:5: lv_var_0_0= ruleVariable
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
            		
            // InternalBrowserAutomation.g:296:3: ( (lv_element_3_0= ruleElement ) )
            // InternalBrowserAutomation.g:297:4: (lv_element_3_0= ruleElement )
            {
            // InternalBrowserAutomation.g:297:4: (lv_element_3_0= ruleElement )
            // InternalBrowserAutomation.g:298:5: lv_element_3_0= ruleElement
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
            		
            // InternalBrowserAutomation.g:319:3: ( (lv_attr_5_0= ruleAttribut ) )
            // InternalBrowserAutomation.g:320:4: (lv_attr_5_0= ruleAttribut )
            {
            // InternalBrowserAutomation.g:320:4: (lv_attr_5_0= ruleAttribut )
            // InternalBrowserAutomation.g:321:5: lv_attr_5_0= ruleAttribut
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

            			newLeafNode(otherlv_6, grammarAccess.getGetAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalBrowserAutomation.g:342:3: ( (lv_attrVal_7_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:343:4: (lv_attrVal_7_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:343:4: (lv_attrVal_7_0= RULE_STRING )
            // InternalBrowserAutomation.g:344:5: lv_attrVal_7_0= RULE_STRING
            {
            lv_attrVal_7_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:368:1: entryRuleElement returns [String current=null] : iv_ruleElement= ruleElement EOF ;
    public final String entryRuleElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElement = null;


        try {
            // InternalBrowserAutomation.g:368:47: (iv_ruleElement= ruleElement EOF )
            // InternalBrowserAutomation.g:369:2: iv_ruleElement= ruleElement EOF
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
    // InternalBrowserAutomation.g:375:1: ruleElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' ) ;
    public final AntlrDatatypeRuleToken ruleElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:381:2: ( (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' ) )
            // InternalBrowserAutomation.g:382:2: (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' )
            {
            // InternalBrowserAutomation.g:382:2: (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 25:
                {
                alt4=3;
                }
                break;
            case 26:
                {
                alt4=4;
                }
                break;
            case 27:
                {
                alt4=5;
                }
                break;
            case 28:
                {
                alt4=6;
                }
                break;
            case 29:
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
                    // InternalBrowserAutomation.g:383:3: kw= 'link'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getLinkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:389:3: kw= 'input'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getInputKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:395:3: kw= 'button'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getButtonKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:401:3: kw= 'checkbox'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getCheckboxKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:407:3: kw= 'combobox'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getComboboxKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:413:3: kw= 'image'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getImageKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalBrowserAutomation.g:419:3: kw= 'text'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:428:1: entryRuleAttribut returns [String current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final String entryRuleAttribut() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttribut = null;


        try {
            // InternalBrowserAutomation.g:428:48: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalBrowserAutomation.g:429:2: iv_ruleAttribut= ruleAttribut EOF
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
    // InternalBrowserAutomation.g:435:1: ruleAttribut returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'class' | kw= 'value' | kw= 'alt' ) ;
    public final AntlrDatatypeRuleToken ruleAttribut() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:441:2: ( (kw= 'class' | kw= 'value' | kw= 'alt' ) )
            // InternalBrowserAutomation.g:442:2: (kw= 'class' | kw= 'value' | kw= 'alt' )
            {
            // InternalBrowserAutomation.g:442:2: (kw= 'class' | kw= 'value' | kw= 'alt' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case 32:
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
                    // InternalBrowserAutomation.g:443:3: kw= 'class'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getClassKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:449:3: kw= 'value'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getValueKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:455:3: kw= 'alt'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:464:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalBrowserAutomation.g:464:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalBrowserAutomation.g:465:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalBrowserAutomation.g:471:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:477:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:478:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:478:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBrowserAutomation.g:479:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:479:3: (lv_name_0_0= RULE_ID )
            // InternalBrowserAutomation.g:480:4: lv_name_0_0= RULE_ID
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
    // InternalBrowserAutomation.g:499:1: entryRuleVarReference returns [EObject current=null] : iv_ruleVarReference= ruleVarReference EOF ;
    public final EObject entryRuleVarReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarReference = null;


        try {
            // InternalBrowserAutomation.g:499:53: (iv_ruleVarReference= ruleVarReference EOF )
            // InternalBrowserAutomation.g:500:2: iv_ruleVarReference= ruleVarReference EOF
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
    // InternalBrowserAutomation.g:506:1: ruleVarReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVarReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:512:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:513:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:513:2: ( (otherlv_0= RULE_ID ) )
            // InternalBrowserAutomation.g:514:3: (otherlv_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:514:3: (otherlv_0= RULE_ID )
            // InternalBrowserAutomation.g:515:4: otherlv_0= RULE_ID
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
    // InternalBrowserAutomation.g:529:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalBrowserAutomation.g:529:46: (iv_ruleClick= ruleClick EOF )
            // InternalBrowserAutomation.g:530:2: iv_ruleClick= ruleClick EOF
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
    // InternalBrowserAutomation.g:536:1: ruleClick returns [EObject current=null] : (otherlv_0= 'click' otherlv_1= 'on' ( (lv_var_2_0= ruleVarReference ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_var_2_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:542:2: ( (otherlv_0= 'click' otherlv_1= 'on' ( (lv_var_2_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:543:2: (otherlv_0= 'click' otherlv_1= 'on' ( (lv_var_2_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:543:2: (otherlv_0= 'click' otherlv_1= 'on' ( (lv_var_2_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:544:3: otherlv_0= 'click' otherlv_1= 'on' ( (lv_var_2_0= ruleVarReference ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getClickAccess().getOnKeyword_1());
            		
            // InternalBrowserAutomation.g:552:3: ( (lv_var_2_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:553:4: (lv_var_2_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:553:4: (lv_var_2_0= ruleVarReference )
            // InternalBrowserAutomation.g:554:5: lv_var_2_0= ruleVarReference
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
    // InternalBrowserAutomation.g:575:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalBrowserAutomation.g:575:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalBrowserAutomation.g:576:2: iv_ruleInsert= ruleInsert EOF
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
    // InternalBrowserAutomation.g:582:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'insert' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_var_3_0= ruleVarReference ) ) ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        EObject lv_var_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:588:2: ( (otherlv_0= 'insert' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_var_3_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:589:2: (otherlv_0= 'insert' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_var_3_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:589:2: (otherlv_0= 'insert' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_var_3_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:590:3: otherlv_0= 'insert' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_var_3_0= ruleVarReference ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
            		
            // InternalBrowserAutomation.g:594:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:595:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:595:4: (lv_value_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:596:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getInKeyword_2());
            		
            // InternalBrowserAutomation.g:616:3: ( (lv_var_3_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:617:4: (lv_var_3_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:617:4: (lv_var_3_0= ruleVarReference )
            // InternalBrowserAutomation.g:618:5: lv_var_3_0= ruleVarReference
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
    // InternalBrowserAutomation.g:639:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // InternalBrowserAutomation.g:639:47: (iv_ruleVerify= ruleVerify EOF )
            // InternalBrowserAutomation.g:640:2: iv_ruleVerify= ruleVerify EOF
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
    // InternalBrowserAutomation.g:646:1: ruleVerify returns [EObject current=null] : (otherlv_0= 'verify page contains' ( (lv_var_1_0= ruleVarReference ) ) ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_var_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:652:2: ( (otherlv_0= 'verify page contains' ( (lv_var_1_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:653:2: (otherlv_0= 'verify page contains' ( (lv_var_1_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:653:2: (otherlv_0= 'verify page contains' ( (lv_var_1_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:654:3: otherlv_0= 'verify page contains' ( (lv_var_1_0= ruleVarReference ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyPageContainsKeyword_0());
            		
            // InternalBrowserAutomation.g:658:3: ( (lv_var_1_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:659:4: (lv_var_1_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:659:4: (lv_var_1_0= ruleVarReference )
            // InternalBrowserAutomation.g:660:5: lv_var_1_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getVerifyAccess().getVarVarReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_1_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifyRule());
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
    // $ANTLR end "ruleVerify"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002A00000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000003F800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});

}