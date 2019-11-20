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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'open'", "'firefox'", "'chrome'", "'safari'", "'internetExplorer'", "'go'", "'to'", "'uncheck'", "'all'", "'='", "'get'", "'by'", "'['", "']'", "'from'", "'pageTitle'", "'number'", "'link'", "'input'", "'button'", "'checkbox'", "'combobox'", "'image'", "'text'", "'title'", "'class'", "'value'", "'alt'", "'name'", "'href'", "'click'", "'on'", "'insert'", "'in'", "'is'", "'not'", "'null'", "'check'", "'choose'", "'contains'"
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
        	return "BrowserAutomation";
       	}

       	@Override
       	protected BrowserAutomationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBrowserAutomation"
    // InternalBrowserAutomation.g:64:1: entryRuleBrowserAutomation returns [EObject current=null] : iv_ruleBrowserAutomation= ruleBrowserAutomation EOF ;
    public final EObject entryRuleBrowserAutomation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrowserAutomation = null;


        try {
            // InternalBrowserAutomation.g:64:58: (iv_ruleBrowserAutomation= ruleBrowserAutomation EOF )
            // InternalBrowserAutomation.g:65:2: iv_ruleBrowserAutomation= ruleBrowserAutomation EOF
            {
             newCompositeNode(grammarAccess.getBrowserAutomationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrowserAutomation=ruleBrowserAutomation();

            state._fsp--;

             current =iv_ruleBrowserAutomation; 
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
    // $ANTLR end "entryRuleBrowserAutomation"


    // $ANTLR start "ruleBrowserAutomation"
    // InternalBrowserAutomation.g:71:1: ruleBrowserAutomation returns [EObject current=null] : ( () otherlv_1= 'open' ( (lv_webBrowser_2_0= ruleWebBrowser ) ) ( (lv_statements_3_0= ruleStatement ) )* ) ;
    public final EObject ruleBrowserAutomation() throws RecognitionException {
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
            					grammarAccess.getBrowserAutomationAccess().getBrowserAutomationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBrowserAutomationAccess().getOpenKeyword_1());
            		
            // InternalBrowserAutomation.g:90:3: ( (lv_webBrowser_2_0= ruleWebBrowser ) )
            // InternalBrowserAutomation.g:91:4: (lv_webBrowser_2_0= ruleWebBrowser )
            {
            // InternalBrowserAutomation.g:91:4: (lv_webBrowser_2_0= ruleWebBrowser )
            // InternalBrowserAutomation.g:92:5: lv_webBrowser_2_0= ruleWebBrowser
            {

            					newCompositeNode(grammarAccess.getBrowserAutomationAccess().getWebBrowserWebBrowserParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_webBrowser_2_0=ruleWebBrowser();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBrowserAutomationRule());
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

                if ( (LA1_0==RULE_ID||LA1_0==16||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrowserAutomation.g:110:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalBrowserAutomation.g:110:4: (lv_statements_3_0= ruleStatement )
            	    // InternalBrowserAutomation.g:111:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBrowserAutomationAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBrowserAutomationRule());
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
    // $ANTLR end "ruleBrowserAutomation"


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
    // InternalBrowserAutomation.g:139:1: ruleWebBrowser returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'firefox' | kw= 'chrome' | kw= 'safari' | kw= 'internetExplorer' ) ;
    public final AntlrDatatypeRuleToken ruleWebBrowser() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:145:2: ( (kw= 'firefox' | kw= 'chrome' | kw= 'safari' | kw= 'internetExplorer' ) )
            // InternalBrowserAutomation.g:146:2: (kw= 'firefox' | kw= 'chrome' | kw= 'safari' | kw= 'internetExplorer' )
            {
            // InternalBrowserAutomation.g:146:2: (kw= 'firefox' | kw= 'chrome' | kw= 'safari' | kw= 'internetExplorer' )
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
                    // InternalBrowserAutomation.g:147:3: kw= 'firefox'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWebBrowserAccess().getFirefoxKeyword_0());
                    		

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
                    // InternalBrowserAutomation.g:165:3: kw= 'internetExplorer'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleStatement"
    // InternalBrowserAutomation.g:174:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalBrowserAutomation.g:174:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalBrowserAutomation.g:175:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalBrowserAutomation.g:181:1: ruleStatement returns [EObject current=null] : (this_DoAction_0= ruleDoAction | this_Get_1= ruleGet | ruleUncheckAll | this_GoTo_3= ruleGoTo ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_DoAction_0 = null;

        EObject this_Get_1 = null;

        EObject this_GoTo_3 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:187:2: ( (this_DoAction_0= ruleDoAction | this_Get_1= ruleGet | ruleUncheckAll | this_GoTo_3= ruleGoTo ) )
            // InternalBrowserAutomation.g:188:2: (this_DoAction_0= ruleDoAction | this_Get_1= ruleGet | ruleUncheckAll | this_GoTo_3= ruleGoTo )
            {
            // InternalBrowserAutomation.g:188:2: (this_DoAction_0= ruleDoAction | this_Get_1= ruleGet | ruleUncheckAll | this_GoTo_3= ruleGoTo )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalBrowserAutomation.g:189:3: this_DoAction_0= ruleDoAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDoActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoAction_0=ruleDoAction();

                    state._fsp--;


                    			current = this_DoAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:198:3: this_Get_1= ruleGet
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getGetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Get_1=ruleGet();

                    state._fsp--;


                    			current = this_Get_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:207:3: ruleUncheckAll
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getUncheckAllParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    ruleUncheckAll();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:215:3: this_GoTo_3= ruleGoTo
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getGoToParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoTo_3=ruleGoTo();

                    state._fsp--;


                    			current = this_GoTo_3;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDoAction"
    // InternalBrowserAutomation.g:227:1: entryRuleDoAction returns [EObject current=null] : iv_ruleDoAction= ruleDoAction EOF ;
    public final EObject entryRuleDoAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoAction = null;


        try {
            // InternalBrowserAutomation.g:227:49: (iv_ruleDoAction= ruleDoAction EOF )
            // InternalBrowserAutomation.g:228:2: iv_ruleDoAction= ruleDoAction EOF
            {
             newCompositeNode(grammarAccess.getDoActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoAction=ruleDoAction();

            state._fsp--;

             current =iv_ruleDoAction; 
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
    // $ANTLR end "entryRuleDoAction"


    // $ANTLR start "ruleDoAction"
    // InternalBrowserAutomation.g:234:1: ruleDoAction returns [EObject current=null] : ( ( (lv_get_0_0= ruleGet ) ) ( (lv_action_1_0= ruleAction ) ) ) ;
    public final EObject ruleDoAction() throws RecognitionException {
        EObject current = null;

        EObject lv_get_0_0 = null;

        EObject lv_action_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:240:2: ( ( ( (lv_get_0_0= ruleGet ) ) ( (lv_action_1_0= ruleAction ) ) ) )
            // InternalBrowserAutomation.g:241:2: ( ( (lv_get_0_0= ruleGet ) ) ( (lv_action_1_0= ruleAction ) ) )
            {
            // InternalBrowserAutomation.g:241:2: ( ( (lv_get_0_0= ruleGet ) ) ( (lv_action_1_0= ruleAction ) ) )
            // InternalBrowserAutomation.g:242:3: ( (lv_get_0_0= ruleGet ) ) ( (lv_action_1_0= ruleAction ) )
            {
            // InternalBrowserAutomation.g:242:3: ( (lv_get_0_0= ruleGet ) )
            // InternalBrowserAutomation.g:243:4: (lv_get_0_0= ruleGet )
            {
            // InternalBrowserAutomation.g:243:4: (lv_get_0_0= ruleGet )
            // InternalBrowserAutomation.g:244:5: lv_get_0_0= ruleGet
            {

            					newCompositeNode(grammarAccess.getDoActionAccess().getGetGetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_get_0_0=ruleGet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoActionRule());
            					}
            					set(
            						current,
            						"get",
            						lv_get_0_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.Get");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowserAutomation.g:261:3: ( (lv_action_1_0= ruleAction ) )
            // InternalBrowserAutomation.g:262:4: (lv_action_1_0= ruleAction )
            {
            // InternalBrowserAutomation.g:262:4: (lv_action_1_0= ruleAction )
            // InternalBrowserAutomation.g:263:5: lv_action_1_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getDoActionAccess().getActionActionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_1_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoActionRule());
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
    // $ANTLR end "ruleDoAction"


    // $ANTLR start "entryRuleAction"
    // InternalBrowserAutomation.g:284:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalBrowserAutomation.g:284:47: (iv_ruleAction= ruleAction EOF )
            // InternalBrowserAutomation.g:285:2: iv_ruleAction= ruleAction EOF
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
    // InternalBrowserAutomation.g:291:1: ruleAction returns [EObject current=null] : (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Check_3= ruleCheck | this_Choose_4= ruleChoose | this_Contains_5= ruleContains ) ;
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
            // InternalBrowserAutomation.g:297:2: ( (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Check_3= ruleCheck | this_Choose_4= ruleChoose | this_Contains_5= ruleContains ) )
            // InternalBrowserAutomation.g:298:2: (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Check_3= ruleCheck | this_Choose_4= ruleChoose | this_Contains_5= ruleContains )
            {
            // InternalBrowserAutomation.g:298:2: (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Verify_2= ruleVerify | this_Check_3= ruleCheck | this_Choose_4= ruleChoose | this_Contains_5= ruleContains )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt4=1;
                }
                break;
            case 43:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==45) ) {
                    alt4=3;
                }
                else if ( (LA4_3==50) ) {
                    alt4=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                alt4=4;
                }
                break;
            case 49:
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
                    // InternalBrowserAutomation.g:299:3: this_Click_0= ruleClick
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
                    // InternalBrowserAutomation.g:308:3: this_Insert_1= ruleInsert
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
                    // InternalBrowserAutomation.g:317:3: this_Verify_2= ruleVerify
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
                    // InternalBrowserAutomation.g:326:3: this_Check_3= ruleCheck
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
                    // InternalBrowserAutomation.g:335:3: this_Choose_4= ruleChoose
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
                    // InternalBrowserAutomation.g:344:3: this_Contains_5= ruleContains
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


    // $ANTLR start "entryRuleGoTo"
    // InternalBrowserAutomation.g:356:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // InternalBrowserAutomation.g:356:45: (iv_ruleGoTo= ruleGoTo EOF )
            // InternalBrowserAutomation.g:357:2: iv_ruleGoTo= ruleGoTo EOF
            {
             newCompositeNode(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoTo=ruleGoTo();

            state._fsp--;

             current =iv_ruleGoTo; 
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
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalBrowserAutomation.g:363:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'go' otherlv_1= 'to' ( (lv_url_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:369:2: ( (otherlv_0= 'go' otherlv_1= 'to' ( (lv_url_2_0= RULE_STRING ) ) ) )
            // InternalBrowserAutomation.g:370:2: (otherlv_0= 'go' otherlv_1= 'to' ( (lv_url_2_0= RULE_STRING ) ) )
            {
            // InternalBrowserAutomation.g:370:2: (otherlv_0= 'go' otherlv_1= 'to' ( (lv_url_2_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:371:3: otherlv_0= 'go' otherlv_1= 'to' ( (lv_url_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGoKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGoToAccess().getToKeyword_1());
            		
            // InternalBrowserAutomation.g:379:3: ( (lv_url_2_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:380:4: (lv_url_2_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:380:4: (lv_url_2_0= RULE_STRING )
            // InternalBrowserAutomation.g:381:5: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_url_2_0, grammarAccess.getGoToAccess().getUrlSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoToRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_2_0,
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
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleUncheckAll"
    // InternalBrowserAutomation.g:401:1: entryRuleUncheckAll returns [String current=null] : iv_ruleUncheckAll= ruleUncheckAll EOF ;
    public final String entryRuleUncheckAll() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUncheckAll = null;


        try {
            // InternalBrowserAutomation.g:401:50: (iv_ruleUncheckAll= ruleUncheckAll EOF )
            // InternalBrowserAutomation.g:402:2: iv_ruleUncheckAll= ruleUncheckAll EOF
            {
             newCompositeNode(grammarAccess.getUncheckAllRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUncheckAll=ruleUncheckAll();

            state._fsp--;

             current =iv_ruleUncheckAll.getText(); 
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
    // $ANTLR end "entryRuleUncheckAll"


    // $ANTLR start "ruleUncheckAll"
    // InternalBrowserAutomation.g:408:1: ruleUncheckAll returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'uncheck' kw= 'all' ) ;
    public final AntlrDatatypeRuleToken ruleUncheckAll() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:414:2: ( (kw= 'uncheck' kw= 'all' ) )
            // InternalBrowserAutomation.g:415:2: (kw= 'uncheck' kw= 'all' )
            {
            // InternalBrowserAutomation.g:415:2: (kw= 'uncheck' kw= 'all' )
            // InternalBrowserAutomation.g:416:3: kw= 'uncheck' kw= 'all'
            {
            kw=(Token)match(input,18,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getUncheckAllAccess().getUncheckKeyword_0());
            		
            kw=(Token)match(input,19,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getUncheckAllAccess().getAllKeyword_1());
            		

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
    // $ANTLR end "ruleUncheckAll"


    // $ANTLR start "entryRuleGet"
    // InternalBrowserAutomation.g:430:1: entryRuleGet returns [EObject current=null] : iv_ruleGet= ruleGet EOF ;
    public final EObject entryRuleGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGet = null;


        try {
            // InternalBrowserAutomation.g:430:44: (iv_ruleGet= ruleGet EOF )
            // InternalBrowserAutomation.g:431:2: iv_ruleGet= ruleGet EOF
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
    // InternalBrowserAutomation.g:437:1: ruleGet returns [EObject current=null] : ( ( (lv_varRef_0_0= ruleVariable ) ) otherlv_1= '=' otherlv_2= 'get' ( ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( (lv_attrVal_8_0= ruleAttributeValue ) ) otherlv_9= ']' ) | (otherlv_10= 'from' ( (lv_from_11_0= ruleVarReference ) ) ) ) ) | ( (lv_pageTitle_12_0= 'pageTitle' ) ) ) ) ;
    public final EObject ruleGet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_pageTitle_12_0=null;
        EObject lv_varRef_0_0 = null;

        AntlrDatatypeRuleToken lv_element_3_0 = null;

        EObject lv_order_4_0 = null;

        AntlrDatatypeRuleToken lv_attr_6_0 = null;

        EObject lv_attrVal_8_0 = null;

        EObject lv_from_11_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:443:2: ( ( ( (lv_varRef_0_0= ruleVariable ) ) otherlv_1= '=' otherlv_2= 'get' ( ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( (lv_attrVal_8_0= ruleAttributeValue ) ) otherlv_9= ']' ) | (otherlv_10= 'from' ( (lv_from_11_0= ruleVarReference ) ) ) ) ) | ( (lv_pageTitle_12_0= 'pageTitle' ) ) ) ) )
            // InternalBrowserAutomation.g:444:2: ( ( (lv_varRef_0_0= ruleVariable ) ) otherlv_1= '=' otherlv_2= 'get' ( ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( (lv_attrVal_8_0= ruleAttributeValue ) ) otherlv_9= ']' ) | (otherlv_10= 'from' ( (lv_from_11_0= ruleVarReference ) ) ) ) ) | ( (lv_pageTitle_12_0= 'pageTitle' ) ) ) )
            {
            // InternalBrowserAutomation.g:444:2: ( ( (lv_varRef_0_0= ruleVariable ) ) otherlv_1= '=' otherlv_2= 'get' ( ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( (lv_attrVal_8_0= ruleAttributeValue ) ) otherlv_9= ']' ) | (otherlv_10= 'from' ( (lv_from_11_0= ruleVarReference ) ) ) ) ) | ( (lv_pageTitle_12_0= 'pageTitle' ) ) ) )
            // InternalBrowserAutomation.g:445:3: ( (lv_varRef_0_0= ruleVariable ) ) otherlv_1= '=' otherlv_2= 'get' ( ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( (lv_attrVal_8_0= ruleAttributeValue ) ) otherlv_9= ']' ) | (otherlv_10= 'from' ( (lv_from_11_0= ruleVarReference ) ) ) ) ) | ( (lv_pageTitle_12_0= 'pageTitle' ) ) )
            {
            // InternalBrowserAutomation.g:445:3: ( (lv_varRef_0_0= ruleVariable ) )
            // InternalBrowserAutomation.g:446:4: (lv_varRef_0_0= ruleVariable )
            {
            // InternalBrowserAutomation.g:446:4: (lv_varRef_0_0= ruleVariable )
            // InternalBrowserAutomation.g:447:5: lv_varRef_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getGetAccess().getVarRefVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_varRef_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetRule());
            					}
            					set(
            						current,
            						"varRef",
            						lv_varRef_0_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getGetAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getGetAccess().getGetKeyword_2());
            		
            // InternalBrowserAutomation.g:472:3: ( ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( (lv_attrVal_8_0= ruleAttributeValue ) ) otherlv_9= ']' ) | (otherlv_10= 'from' ( (lv_from_11_0= ruleVarReference ) ) ) ) ) | ( (lv_pageTitle_12_0= 'pageTitle' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=28 && LA7_0<=35)) ) {
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
                    // InternalBrowserAutomation.g:473:4: ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( (lv_attrVal_8_0= ruleAttributeValue ) ) otherlv_9= ']' ) | (otherlv_10= 'from' ( (lv_from_11_0= ruleVarReference ) ) ) ) )
                    {
                    // InternalBrowserAutomation.g:473:4: ( ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( (lv_attrVal_8_0= ruleAttributeValue ) ) otherlv_9= ']' ) | (otherlv_10= 'from' ( (lv_from_11_0= ruleVarReference ) ) ) ) )
                    // InternalBrowserAutomation.g:474:5: ( (lv_element_3_0= ruleElement ) ) ( (lv_order_4_0= ruleOrder ) )? ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( (lv_attrVal_8_0= ruleAttributeValue ) ) otherlv_9= ']' ) | (otherlv_10= 'from' ( (lv_from_11_0= ruleVarReference ) ) ) )
                    {
                    // InternalBrowserAutomation.g:474:5: ( (lv_element_3_0= ruleElement ) )
                    // InternalBrowserAutomation.g:475:6: (lv_element_3_0= ruleElement )
                    {
                    // InternalBrowserAutomation.g:475:6: (lv_element_3_0= ruleElement )
                    // InternalBrowserAutomation.g:476:7: lv_element_3_0= ruleElement
                    {

                    							newCompositeNode(grammarAccess.getGetAccess().getElementElementParserRuleCall_3_0_0_0());
                    						
                    pushFollow(FOLLOW_12);
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

                    // InternalBrowserAutomation.g:493:5: ( (lv_order_4_0= ruleOrder ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==27) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalBrowserAutomation.g:494:6: (lv_order_4_0= ruleOrder )
                            {
                            // InternalBrowserAutomation.g:494:6: (lv_order_4_0= ruleOrder )
                            // InternalBrowserAutomation.g:495:7: lv_order_4_0= ruleOrder
                            {

                            							newCompositeNode(grammarAccess.getGetAccess().getOrderOrderParserRuleCall_3_0_1_0());
                            						
                            pushFollow(FOLLOW_13);
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

                    // InternalBrowserAutomation.g:512:5: ( (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( (lv_attrVal_8_0= ruleAttributeValue ) ) otherlv_9= ']' ) | (otherlv_10= 'from' ( (lv_from_11_0= ruleVarReference ) ) ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==22) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==25) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalBrowserAutomation.g:513:6: (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( (lv_attrVal_8_0= ruleAttributeValue ) ) otherlv_9= ']' )
                            {
                            // InternalBrowserAutomation.g:513:6: (otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( (lv_attrVal_8_0= ruleAttributeValue ) ) otherlv_9= ']' )
                            // InternalBrowserAutomation.g:514:7: otherlv_5= 'by' ( (lv_attr_6_0= ruleAttribut ) ) otherlv_7= '[' ( (lv_attrVal_8_0= ruleAttributeValue ) ) otherlv_9= ']'
                            {
                            otherlv_5=(Token)match(input,22,FOLLOW_14); 

                            							newLeafNode(otherlv_5, grammarAccess.getGetAccess().getByKeyword_3_0_2_0_0());
                            						
                            // InternalBrowserAutomation.g:518:7: ( (lv_attr_6_0= ruleAttribut ) )
                            // InternalBrowserAutomation.g:519:8: (lv_attr_6_0= ruleAttribut )
                            {
                            // InternalBrowserAutomation.g:519:8: (lv_attr_6_0= ruleAttribut )
                            // InternalBrowserAutomation.g:520:9: lv_attr_6_0= ruleAttribut
                            {

                            									newCompositeNode(grammarAccess.getGetAccess().getAttrAttributParserRuleCall_3_0_2_0_1_0());
                            								
                            pushFollow(FOLLOW_15);
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

                            otherlv_7=(Token)match(input,23,FOLLOW_16); 

                            							newLeafNode(otherlv_7, grammarAccess.getGetAccess().getLeftSquareBracketKeyword_3_0_2_0_2());
                            						
                            // InternalBrowserAutomation.g:541:7: ( (lv_attrVal_8_0= ruleAttributeValue ) )
                            // InternalBrowserAutomation.g:542:8: (lv_attrVal_8_0= ruleAttributeValue )
                            {
                            // InternalBrowserAutomation.g:542:8: (lv_attrVal_8_0= ruleAttributeValue )
                            // InternalBrowserAutomation.g:543:9: lv_attrVal_8_0= ruleAttributeValue
                            {

                            									newCompositeNode(grammarAccess.getGetAccess().getAttrValAttributeValueParserRuleCall_3_0_2_0_3_0());
                            								
                            pushFollow(FOLLOW_17);
                            lv_attrVal_8_0=ruleAttributeValue();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getGetRule());
                            									}
                            									set(
                            										current,
                            										"attrVal",
                            										lv_attrVal_8_0,
                            										"org.xtext.imt.fil.dsl.BrowserAutomation.AttributeValue");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_9=(Token)match(input,24,FOLLOW_2); 

                            							newLeafNode(otherlv_9, grammarAccess.getGetAccess().getRightSquareBracketKeyword_3_0_2_0_4());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalBrowserAutomation.g:566:6: (otherlv_10= 'from' ( (lv_from_11_0= ruleVarReference ) ) )
                            {
                            // InternalBrowserAutomation.g:566:6: (otherlv_10= 'from' ( (lv_from_11_0= ruleVarReference ) ) )
                            // InternalBrowserAutomation.g:567:7: otherlv_10= 'from' ( (lv_from_11_0= ruleVarReference ) )
                            {
                            otherlv_10=(Token)match(input,25,FOLLOW_18); 

                            							newLeafNode(otherlv_10, grammarAccess.getGetAccess().getFromKeyword_3_0_2_1_0());
                            						
                            // InternalBrowserAutomation.g:571:7: ( (lv_from_11_0= ruleVarReference ) )
                            // InternalBrowserAutomation.g:572:8: (lv_from_11_0= ruleVarReference )
                            {
                            // InternalBrowserAutomation.g:572:8: (lv_from_11_0= ruleVarReference )
                            // InternalBrowserAutomation.g:573:9: lv_from_11_0= ruleVarReference
                            {

                            									newCompositeNode(grammarAccess.getGetAccess().getFromVarReferenceParserRuleCall_3_0_2_1_1_0());
                            								
                            pushFollow(FOLLOW_2);
                            lv_from_11_0=ruleVarReference();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getGetRule());
                            									}
                            									set(
                            										current,
                            										"from",
                            										lv_from_11_0,
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
                    // InternalBrowserAutomation.g:594:4: ( (lv_pageTitle_12_0= 'pageTitle' ) )
                    {
                    // InternalBrowserAutomation.g:594:4: ( (lv_pageTitle_12_0= 'pageTitle' ) )
                    // InternalBrowserAutomation.g:595:5: (lv_pageTitle_12_0= 'pageTitle' )
                    {
                    // InternalBrowserAutomation.g:595:5: (lv_pageTitle_12_0= 'pageTitle' )
                    // InternalBrowserAutomation.g:596:6: lv_pageTitle_12_0= 'pageTitle'
                    {
                    lv_pageTitle_12_0=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_pageTitle_12_0, grammarAccess.getGetAccess().getPageTitlePageTitleKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGetRule());
                    						}
                    						setWithLastConsumed(current, "pageTitle", lv_pageTitle_12_0, "pageTitle");
                    					

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
    // $ANTLR end "ruleGet"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalBrowserAutomation.g:613:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalBrowserAutomation.g:613:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalBrowserAutomation.g:614:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalBrowserAutomation.g:620:1: ruleAttributeValue returns [EObject current=null] : ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_varRefVal_1_0= ruleVarReference ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token lv_stringVal_0_0=null;
        EObject lv_varRefVal_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:626:2: ( ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_varRefVal_1_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:627:2: ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_varRefVal_1_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:627:2: ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_varRefVal_1_0= ruleVarReference ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBrowserAutomation.g:628:3: ( (lv_stringVal_0_0= RULE_STRING ) )
                    {
                    // InternalBrowserAutomation.g:628:3: ( (lv_stringVal_0_0= RULE_STRING ) )
                    // InternalBrowserAutomation.g:629:4: (lv_stringVal_0_0= RULE_STRING )
                    {
                    // InternalBrowserAutomation.g:629:4: (lv_stringVal_0_0= RULE_STRING )
                    // InternalBrowserAutomation.g:630:5: lv_stringVal_0_0= RULE_STRING
                    {
                    lv_stringVal_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_stringVal_0_0, grammarAccess.getAttributeValueAccess().getStringValSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"stringVal",
                    						lv_stringVal_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:647:3: ( (lv_varRefVal_1_0= ruleVarReference ) )
                    {
                    // InternalBrowserAutomation.g:647:3: ( (lv_varRefVal_1_0= ruleVarReference ) )
                    // InternalBrowserAutomation.g:648:4: (lv_varRefVal_1_0= ruleVarReference )
                    {
                    // InternalBrowserAutomation.g:648:4: (lv_varRefVal_1_0= ruleVarReference )
                    // InternalBrowserAutomation.g:649:5: lv_varRefVal_1_0= ruleVarReference
                    {

                    					newCompositeNode(grammarAccess.getAttributeValueAccess().getVarRefValVarReferenceParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_varRefVal_1_0=ruleVarReference();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeValueRule());
                    					}
                    					set(
                    						current,
                    						"varRefVal",
                    						lv_varRefVal_1_0,
                    						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleOrder"
    // InternalBrowserAutomation.g:670:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalBrowserAutomation.g:670:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalBrowserAutomation.g:671:2: iv_ruleOrder= ruleOrder EOF
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
    // InternalBrowserAutomation.g:677:1: ruleOrder returns [EObject current=null] : (otherlv_0= 'number' ( (lv_order_1_0= RULE_INT ) ) ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_order_1_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:683:2: ( (otherlv_0= 'number' ( (lv_order_1_0= RULE_INT ) ) ) )
            // InternalBrowserAutomation.g:684:2: (otherlv_0= 'number' ( (lv_order_1_0= RULE_INT ) ) )
            {
            // InternalBrowserAutomation.g:684:2: (otherlv_0= 'number' ( (lv_order_1_0= RULE_INT ) ) )
            // InternalBrowserAutomation.g:685:3: otherlv_0= 'number' ( (lv_order_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderAccess().getNumberKeyword_0());
            		
            // InternalBrowserAutomation.g:689:3: ( (lv_order_1_0= RULE_INT ) )
            // InternalBrowserAutomation.g:690:4: (lv_order_1_0= RULE_INT )
            {
            // InternalBrowserAutomation.g:690:4: (lv_order_1_0= RULE_INT )
            // InternalBrowserAutomation.g:691:5: lv_order_1_0= RULE_INT
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
    // InternalBrowserAutomation.g:711:1: entryRuleElement returns [String current=null] : iv_ruleElement= ruleElement EOF ;
    public final String entryRuleElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElement = null;


        try {
            // InternalBrowserAutomation.g:711:47: (iv_ruleElement= ruleElement EOF )
            // InternalBrowserAutomation.g:712:2: iv_ruleElement= ruleElement EOF
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
    // InternalBrowserAutomation.g:718:1: ruleElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' | kw= 'title' ) ;
    public final AntlrDatatypeRuleToken ruleElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:724:2: ( (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' | kw= 'title' ) )
            // InternalBrowserAutomation.g:725:2: (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' | kw= 'title' )
            {
            // InternalBrowserAutomation.g:725:2: (kw= 'link' | kw= 'input' | kw= 'button' | kw= 'checkbox' | kw= 'combobox' | kw= 'image' | kw= 'text' | kw= 'title' )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 29:
                {
                alt9=2;
                }
                break;
            case 30:
                {
                alt9=3;
                }
                break;
            case 31:
                {
                alt9=4;
                }
                break;
            case 32:
                {
                alt9=5;
                }
                break;
            case 33:
                {
                alt9=6;
                }
                break;
            case 34:
                {
                alt9=7;
                }
                break;
            case 35:
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
                    // InternalBrowserAutomation.g:726:3: kw= 'link'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getLinkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:732:3: kw= 'input'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getInputKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:738:3: kw= 'button'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getButtonKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:744:3: kw= 'checkbox'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getCheckboxKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:750:3: kw= 'combobox'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getComboboxKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:756:3: kw= 'image'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getImageKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalBrowserAutomation.g:762:3: kw= 'text'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getTextKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalBrowserAutomation.g:768:3: kw= 'title'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:777:1: entryRuleAttribut returns [String current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final String entryRuleAttribut() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttribut = null;


        try {
            // InternalBrowserAutomation.g:777:48: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalBrowserAutomation.g:778:2: iv_ruleAttribut= ruleAttribut EOF
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
    // InternalBrowserAutomation.g:784:1: ruleAttribut returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'class' | kw= 'value' | kw= 'alt' | kw= 'name' | kw= 'href' ) ;
    public final AntlrDatatypeRuleToken ruleAttribut() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:790:2: ( (kw= 'class' | kw= 'value' | kw= 'alt' | kw= 'name' | kw= 'href' ) )
            // InternalBrowserAutomation.g:791:2: (kw= 'class' | kw= 'value' | kw= 'alt' | kw= 'name' | kw= 'href' )
            {
            // InternalBrowserAutomation.g:791:2: (kw= 'class' | kw= 'value' | kw= 'alt' | kw= 'name' | kw= 'href' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case 37:
                {
                alt10=2;
                }
                break;
            case 38:
                {
                alt10=3;
                }
                break;
            case 39:
                {
                alt10=4;
                }
                break;
            case 40:
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
                    // InternalBrowserAutomation.g:792:3: kw= 'class'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getClassKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:798:3: kw= 'value'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getValueKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:804:3: kw= 'alt'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getAltKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:810:3: kw= 'name'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributAccess().getNameKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:816:3: kw= 'href'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:825:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalBrowserAutomation.g:825:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalBrowserAutomation.g:826:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalBrowserAutomation.g:832:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:838:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:839:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:839:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBrowserAutomation.g:840:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:840:3: (lv_name_0_0= RULE_ID )
            // InternalBrowserAutomation.g:841:4: lv_name_0_0= RULE_ID
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
    // InternalBrowserAutomation.g:860:1: entryRuleVarReference returns [EObject current=null] : iv_ruleVarReference= ruleVarReference EOF ;
    public final EObject entryRuleVarReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarReference = null;


        try {
            // InternalBrowserAutomation.g:860:53: (iv_ruleVarReference= ruleVarReference EOF )
            // InternalBrowserAutomation.g:861:2: iv_ruleVarReference= ruleVarReference EOF
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
    // InternalBrowserAutomation.g:867:1: ruleVarReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVarReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:873:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:874:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:874:2: ( (otherlv_0= RULE_ID ) )
            // InternalBrowserAutomation.g:875:3: (otherlv_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:875:3: (otherlv_0= RULE_ID )
            // InternalBrowserAutomation.g:876:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVarReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVarReferenceAccess().getVarRefVariableCrossReference_0());
            			

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
    // InternalBrowserAutomation.g:890:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalBrowserAutomation.g:890:46: (iv_ruleClick= ruleClick EOF )
            // InternalBrowserAutomation.g:891:2: iv_ruleClick= ruleClick EOF
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
    // InternalBrowserAutomation.g:897:1: ruleClick returns [EObject current=null] : (otherlv_0= 'click' otherlv_1= 'on' ( (lv_varRef_2_0= ruleVarReference ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_varRef_2_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:903:2: ( (otherlv_0= 'click' otherlv_1= 'on' ( (lv_varRef_2_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:904:2: (otherlv_0= 'click' otherlv_1= 'on' ( (lv_varRef_2_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:904:2: (otherlv_0= 'click' otherlv_1= 'on' ( (lv_varRef_2_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:905:3: otherlv_0= 'click' otherlv_1= 'on' ( (lv_varRef_2_0= ruleVarReference ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getClickAccess().getOnKeyword_1());
            		
            // InternalBrowserAutomation.g:913:3: ( (lv_varRef_2_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:914:4: (lv_varRef_2_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:914:4: (lv_varRef_2_0= ruleVarReference )
            // InternalBrowserAutomation.g:915:5: lv_varRef_2_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getClickAccess().getVarRefVarReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_varRef_2_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
            					}
            					set(
            						current,
            						"varRef",
            						lv_varRef_2_0,
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
    // InternalBrowserAutomation.g:936:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalBrowserAutomation.g:936:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalBrowserAutomation.g:937:2: iv_ruleInsert= ruleInsert EOF
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
    // InternalBrowserAutomation.g:943:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'insert' ( ( (lv_attrVal_1_0= RULE_STRING ) ) | ( (lv_varRef_2_0= ruleVarReference ) ) ) otherlv_3= 'in' ( (lv_var2_4_0= ruleVarReference ) ) ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attrVal_1_0=null;
        Token otherlv_3=null;
        EObject lv_varRef_2_0 = null;

        EObject lv_var2_4_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:949:2: ( (otherlv_0= 'insert' ( ( (lv_attrVal_1_0= RULE_STRING ) ) | ( (lv_varRef_2_0= ruleVarReference ) ) ) otherlv_3= 'in' ( (lv_var2_4_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:950:2: (otherlv_0= 'insert' ( ( (lv_attrVal_1_0= RULE_STRING ) ) | ( (lv_varRef_2_0= ruleVarReference ) ) ) otherlv_3= 'in' ( (lv_var2_4_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:950:2: (otherlv_0= 'insert' ( ( (lv_attrVal_1_0= RULE_STRING ) ) | ( (lv_varRef_2_0= ruleVarReference ) ) ) otherlv_3= 'in' ( (lv_var2_4_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:951:3: otherlv_0= 'insert' ( ( (lv_attrVal_1_0= RULE_STRING ) ) | ( (lv_varRef_2_0= ruleVarReference ) ) ) otherlv_3= 'in' ( (lv_var2_4_0= ruleVarReference ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
            		
            // InternalBrowserAutomation.g:955:3: ( ( (lv_attrVal_1_0= RULE_STRING ) ) | ( (lv_varRef_2_0= ruleVarReference ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBrowserAutomation.g:956:4: ( (lv_attrVal_1_0= RULE_STRING ) )
                    {
                    // InternalBrowserAutomation.g:956:4: ( (lv_attrVal_1_0= RULE_STRING ) )
                    // InternalBrowserAutomation.g:957:5: (lv_attrVal_1_0= RULE_STRING )
                    {
                    // InternalBrowserAutomation.g:957:5: (lv_attrVal_1_0= RULE_STRING )
                    // InternalBrowserAutomation.g:958:6: lv_attrVal_1_0= RULE_STRING
                    {
                    lv_attrVal_1_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_attrVal_1_0, grammarAccess.getInsertAccess().getAttrValSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInsertRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"attrVal",
                    							lv_attrVal_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:975:4: ( (lv_varRef_2_0= ruleVarReference ) )
                    {
                    // InternalBrowserAutomation.g:975:4: ( (lv_varRef_2_0= ruleVarReference ) )
                    // InternalBrowserAutomation.g:976:5: (lv_varRef_2_0= ruleVarReference )
                    {
                    // InternalBrowserAutomation.g:976:5: (lv_varRef_2_0= ruleVarReference )
                    // InternalBrowserAutomation.g:977:6: lv_varRef_2_0= ruleVarReference
                    {

                    						newCompositeNode(grammarAccess.getInsertAccess().getVarRefVarReferenceParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_varRef_2_0=ruleVarReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInsertRule());
                    						}
                    						set(
                    							current,
                    							"varRef",
                    							lv_varRef_2_0,
                    							"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,44,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getInsertAccess().getInKeyword_2());
            		
            // InternalBrowserAutomation.g:999:3: ( (lv_var2_4_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:1000:4: (lv_var2_4_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:1000:4: (lv_var2_4_0= ruleVarReference )
            // InternalBrowserAutomation.g:1001:5: lv_var2_4_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getVar2VarReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_var2_4_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"var2",
            						lv_var2_4_0,
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
    // InternalBrowserAutomation.g:1022:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // InternalBrowserAutomation.g:1022:47: (iv_ruleVerify= ruleVerify EOF )
            // InternalBrowserAutomation.g:1023:2: iv_ruleVerify= ruleVerify EOF
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
    // InternalBrowserAutomation.g:1029:1: ruleVerify returns [EObject current=null] : ( ( (lv_varToVerify_0_0= ruleVarReference ) ) otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'null' ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_varToVerify_0_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:1035:2: ( ( ( (lv_varToVerify_0_0= ruleVarReference ) ) otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'null' ) )
            // InternalBrowserAutomation.g:1036:2: ( ( (lv_varToVerify_0_0= ruleVarReference ) ) otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'null' )
            {
            // InternalBrowserAutomation.g:1036:2: ( ( (lv_varToVerify_0_0= ruleVarReference ) ) otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'null' )
            // InternalBrowserAutomation.g:1037:3: ( (lv_varToVerify_0_0= ruleVarReference ) ) otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'null'
            {
            // InternalBrowserAutomation.g:1037:3: ( (lv_varToVerify_0_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:1038:4: (lv_varToVerify_0_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:1038:4: (lv_varToVerify_0_0= ruleVarReference )
            // InternalBrowserAutomation.g:1039:5: lv_varToVerify_0_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getVerifyAccess().getVarToVerifyVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_varToVerify_0_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifyRule());
            					}
            					set(
            						current,
            						"varToVerify",
            						lv_varToVerify_0_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifyAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getVerifyAccess().getNotKeyword_2());
            		
            otherlv_3=(Token)match(input,47,FOLLOW_2); 

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
    // InternalBrowserAutomation.g:1072:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // InternalBrowserAutomation.g:1072:46: (iv_ruleCheck= ruleCheck EOF )
            // InternalBrowserAutomation.g:1073:2: iv_ruleCheck= ruleCheck EOF
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
    // InternalBrowserAutomation.g:1079:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'check' ( (lv_varCheck_1_0= ruleVarReference ) ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_varCheck_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:1085:2: ( (otherlv_0= 'check' ( (lv_varCheck_1_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:1086:2: (otherlv_0= 'check' ( (lv_varCheck_1_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:1086:2: (otherlv_0= 'check' ( (lv_varCheck_1_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:1087:3: otherlv_0= 'check' ( (lv_varCheck_1_0= ruleVarReference ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
            		
            // InternalBrowserAutomation.g:1091:3: ( (lv_varCheck_1_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:1092:4: (lv_varCheck_1_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:1092:4: (lv_varCheck_1_0= ruleVarReference )
            // InternalBrowserAutomation.g:1093:5: lv_varCheck_1_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getCheckAccess().getVarCheckVarReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_varCheck_1_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckRule());
            					}
            					set(
            						current,
            						"varCheck",
            						lv_varCheck_1_0,
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
    // InternalBrowserAutomation.g:1114:1: entryRuleChoose returns [EObject current=null] : iv_ruleChoose= ruleChoose EOF ;
    public final EObject entryRuleChoose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoose = null;


        try {
            // InternalBrowserAutomation.g:1114:47: (iv_ruleChoose= ruleChoose EOF )
            // InternalBrowserAutomation.g:1115:2: iv_ruleChoose= ruleChoose EOF
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
    // InternalBrowserAutomation.g:1121:1: ruleChoose returns [EObject current=null] : (otherlv_0= 'choose' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_varChoose_3_0= ruleVarReference ) ) ) ;
    public final EObject ruleChoose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        EObject lv_varChoose_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:1127:2: ( (otherlv_0= 'choose' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_varChoose_3_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:1128:2: (otherlv_0= 'choose' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_varChoose_3_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:1128:2: (otherlv_0= 'choose' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_varChoose_3_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:1129:3: otherlv_0= 'choose' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_varChoose_3_0= ruleVarReference ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getChooseAccess().getChooseKeyword_0());
            		
            // InternalBrowserAutomation.g:1133:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:1134:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:1134:4: (lv_value_1_0= RULE_STRING )
            // InternalBrowserAutomation.g:1135:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            otherlv_2=(Token)match(input,44,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getChooseAccess().getInKeyword_2());
            		
            // InternalBrowserAutomation.g:1155:3: ( (lv_varChoose_3_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:1156:4: (lv_varChoose_3_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:1156:4: (lv_varChoose_3_0= ruleVarReference )
            // InternalBrowserAutomation.g:1157:5: lv_varChoose_3_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getChooseAccess().getVarChooseVarReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_varChoose_3_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChooseRule());
            					}
            					set(
            						current,
            						"varChoose",
            						lv_varChoose_3_0,
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
    // InternalBrowserAutomation.g:1178:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalBrowserAutomation.g:1178:49: (iv_ruleContains= ruleContains EOF )
            // InternalBrowserAutomation.g:1179:2: iv_ruleContains= ruleContains EOF
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
    // InternalBrowserAutomation.g:1185:1: ruleContains returns [EObject current=null] : ( ( (lv_varContains_0_0= ruleVarReference ) ) otherlv_1= 'contains' ( (lv_varContained_2_0= ruleVarReference ) ) ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varContains_0_0 = null;

        EObject lv_varContained_2_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:1191:2: ( ( ( (lv_varContains_0_0= ruleVarReference ) ) otherlv_1= 'contains' ( (lv_varContained_2_0= ruleVarReference ) ) ) )
            // InternalBrowserAutomation.g:1192:2: ( ( (lv_varContains_0_0= ruleVarReference ) ) otherlv_1= 'contains' ( (lv_varContained_2_0= ruleVarReference ) ) )
            {
            // InternalBrowserAutomation.g:1192:2: ( ( (lv_varContains_0_0= ruleVarReference ) ) otherlv_1= 'contains' ( (lv_varContained_2_0= ruleVarReference ) ) )
            // InternalBrowserAutomation.g:1193:3: ( (lv_varContains_0_0= ruleVarReference ) ) otherlv_1= 'contains' ( (lv_varContained_2_0= ruleVarReference ) )
            {
            // InternalBrowserAutomation.g:1193:3: ( (lv_varContains_0_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:1194:4: (lv_varContains_0_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:1194:4: (lv_varContains_0_0= ruleVarReference )
            // InternalBrowserAutomation.g:1195:5: lv_varContains_0_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getVarContainsVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_varContains_0_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainsRule());
            					}
            					set(
            						current,
            						"varContains",
            						lv_varContains_0_0,
            						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getContainsKeyword_1());
            		
            // InternalBrowserAutomation.g:1216:3: ( (lv_varContained_2_0= ruleVarReference ) )
            // InternalBrowserAutomation.g:1217:4: (lv_varContained_2_0= ruleVarReference )
            {
            // InternalBrowserAutomation.g:1217:4: (lv_varContained_2_0= ruleVarReference )
            // InternalBrowserAutomation.g:1218:5: lv_varContained_2_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getVarContainedVarReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_varContained_2_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainsRule());
            					}
            					set(
            						current,
            						"varContained",
            						lv_varContained_2_0,
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
    static final String dfa_2s = "\16\uffff\1\22\14\uffff\1\22\3\uffff\1\22";
    static final String dfa_3s = "\1\6\1\24\2\uffff\1\25\1\32\10\26\1\6\1\5\1\44\1\6\1\uffff\1\24\1\uffff\1\26\5\27\1\6\1\4\2\30\1\6";
    static final String dfa_4s = "\1\22\1\24\2\uffff\1\25\1\43\10\33\1\61\1\5\1\50\1\6\1\uffff\1\62\1\uffff\1\31\5\27\1\61\1\6\2\30\1\61";
    static final String dfa_5s = "\2\uffff\1\3\1\4\16\uffff\1\2\1\uffff\1\1\13\uffff";
    static final String dfa_6s = "\40\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\11\uffff\1\3\1\uffff\1\2",
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
            "\1\23\11\uffff\1\22\1\uffff\1\22\26\uffff\1\24\1\uffff\1\24\4\uffff\2\24",
            "\1\25",
            "\1\26\1\27\1\30\1\31\1\32",
            "\1\33",
            "",
            "\1\22\30\uffff\1\24\4\uffff\1\24",
            "",
            "\1\20\2\uffff\1\21",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\23\11\uffff\1\22\1\uffff\1\22\26\uffff\1\24\1\uffff\1\24\4\uffff\2\24",
            "\1\35\1\uffff\1\36",
            "\1\37",
            "\1\37",
            "\1\23\11\uffff\1\22\1\uffff\1\22\26\uffff\1\24\1\uffff\1\24\4\uffff\2\24"
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
            return "188:2: (this_DoAction_0= ruleDoAction | this_Get_1= ruleGet | ruleUncheckAll | this_GoTo_3= ruleGoTo )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000050042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00030A0000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000FF4000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000A400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});

}