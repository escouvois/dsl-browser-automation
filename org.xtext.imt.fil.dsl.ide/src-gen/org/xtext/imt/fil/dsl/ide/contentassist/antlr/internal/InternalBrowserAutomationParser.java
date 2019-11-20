package org.xtext.imt.fil.dsl.ide.contentassist.antlr.internal;

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
import org.xtext.imt.fil.dsl.services.BrowserAutomationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrowserAutomationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'firefox'", "'chrome'", "'safari'", "'internetExplorer'", "'link'", "'input'", "'button'", "'checkbox'", "'combobox'", "'image'", "'text'", "'title'", "'class'", "'value'", "'alt'", "'name'", "'href'", "'{'", "'open'", "'}'", "'go'", "'to'", "'uncheck'", "'all'", "'='", "'get'", "'by'", "'['", "']'", "'from'", "'number'", "'click'", "'on'", "'insert'", "'in'", "'is'", "'not'", "'null'", "'check'", "'choose'", "'contains'", "'pageTitle'"
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
    public static final int T__52=52;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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

    	public void setGrammarAccess(BrowserAutomationGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleBrowserAutomation"
    // InternalBrowserAutomation.g:53:1: entryRuleBrowserAutomation : ruleBrowserAutomation EOF ;
    public final void entryRuleBrowserAutomation() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:54:1: ( ruleBrowserAutomation EOF )
            // InternalBrowserAutomation.g:55:1: ruleBrowserAutomation EOF
            {
             before(grammarAccess.getBrowserAutomationRule()); 
            pushFollow(FOLLOW_1);
            ruleBrowserAutomation();

            state._fsp--;

             after(grammarAccess.getBrowserAutomationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBrowserAutomation"


    // $ANTLR start "ruleBrowserAutomation"
    // InternalBrowserAutomation.g:62:1: ruleBrowserAutomation : ( ( rule__BrowserAutomation__Group__0 ) ) ;
    public final void ruleBrowserAutomation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:66:2: ( ( ( rule__BrowserAutomation__Group__0 ) ) )
            // InternalBrowserAutomation.g:67:2: ( ( rule__BrowserAutomation__Group__0 ) )
            {
            // InternalBrowserAutomation.g:67:2: ( ( rule__BrowserAutomation__Group__0 ) )
            // InternalBrowserAutomation.g:68:3: ( rule__BrowserAutomation__Group__0 )
            {
             before(grammarAccess.getBrowserAutomationAccess().getGroup()); 
            // InternalBrowserAutomation.g:69:3: ( rule__BrowserAutomation__Group__0 )
            // InternalBrowserAutomation.g:69:4: rule__BrowserAutomation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BrowserAutomation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBrowserAutomationAccess().getGroup()); 

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
    // $ANTLR end "ruleBrowserAutomation"


    // $ANTLR start "entryRuleWebBrowser"
    // InternalBrowserAutomation.g:78:1: entryRuleWebBrowser : ruleWebBrowser EOF ;
    public final void entryRuleWebBrowser() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:79:1: ( ruleWebBrowser EOF )
            // InternalBrowserAutomation.g:80:1: ruleWebBrowser EOF
            {
             before(grammarAccess.getWebBrowserRule()); 
            pushFollow(FOLLOW_1);
            ruleWebBrowser();

            state._fsp--;

             after(grammarAccess.getWebBrowserRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWebBrowser"


    // $ANTLR start "ruleWebBrowser"
    // InternalBrowserAutomation.g:87:1: ruleWebBrowser : ( ( rule__WebBrowser__Alternatives ) ) ;
    public final void ruleWebBrowser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:91:2: ( ( ( rule__WebBrowser__Alternatives ) ) )
            // InternalBrowserAutomation.g:92:2: ( ( rule__WebBrowser__Alternatives ) )
            {
            // InternalBrowserAutomation.g:92:2: ( ( rule__WebBrowser__Alternatives ) )
            // InternalBrowserAutomation.g:93:3: ( rule__WebBrowser__Alternatives )
            {
             before(grammarAccess.getWebBrowserAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:94:3: ( rule__WebBrowser__Alternatives )
            // InternalBrowserAutomation.g:94:4: rule__WebBrowser__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WebBrowser__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWebBrowserAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWebBrowser"


    // $ANTLR start "entryRuleStatement"
    // InternalBrowserAutomation.g:103:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:104:1: ( ruleStatement EOF )
            // InternalBrowserAutomation.g:105:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalBrowserAutomation.g:112:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:116:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalBrowserAutomation.g:117:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalBrowserAutomation.g:117:2: ( ( rule__Statement__Alternatives ) )
            // InternalBrowserAutomation.g:118:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:119:3: ( rule__Statement__Alternatives )
            // InternalBrowserAutomation.g:119:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDoAction"
    // InternalBrowserAutomation.g:128:1: entryRuleDoAction : ruleDoAction EOF ;
    public final void entryRuleDoAction() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:129:1: ( ruleDoAction EOF )
            // InternalBrowserAutomation.g:130:1: ruleDoAction EOF
            {
             before(grammarAccess.getDoActionRule()); 
            pushFollow(FOLLOW_1);
            ruleDoAction();

            state._fsp--;

             after(grammarAccess.getDoActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDoAction"


    // $ANTLR start "ruleDoAction"
    // InternalBrowserAutomation.g:137:1: ruleDoAction : ( ( rule__DoAction__Group__0 ) ) ;
    public final void ruleDoAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:141:2: ( ( ( rule__DoAction__Group__0 ) ) )
            // InternalBrowserAutomation.g:142:2: ( ( rule__DoAction__Group__0 ) )
            {
            // InternalBrowserAutomation.g:142:2: ( ( rule__DoAction__Group__0 ) )
            // InternalBrowserAutomation.g:143:3: ( rule__DoAction__Group__0 )
            {
             before(grammarAccess.getDoActionAccess().getGroup()); 
            // InternalBrowserAutomation.g:144:3: ( rule__DoAction__Group__0 )
            // InternalBrowserAutomation.g:144:4: rule__DoAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoActionAccess().getGroup()); 

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
    // $ANTLR end "ruleDoAction"


    // $ANTLR start "entryRuleAction"
    // InternalBrowserAutomation.g:153:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:154:1: ( ruleAction EOF )
            // InternalBrowserAutomation.g:155:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalBrowserAutomation.g:162:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:166:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalBrowserAutomation.g:167:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalBrowserAutomation.g:167:2: ( ( rule__Action__Alternatives ) )
            // InternalBrowserAutomation.g:168:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:169:3: ( rule__Action__Alternatives )
            // InternalBrowserAutomation.g:169:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleGoTo"
    // InternalBrowserAutomation.g:178:1: entryRuleGoTo : ruleGoTo EOF ;
    public final void entryRuleGoTo() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:179:1: ( ruleGoTo EOF )
            // InternalBrowserAutomation.g:180:1: ruleGoTo EOF
            {
             before(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            ruleGoTo();

            state._fsp--;

             after(grammarAccess.getGoToRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalBrowserAutomation.g:187:1: ruleGoTo : ( ( rule__GoTo__Group__0 ) ) ;
    public final void ruleGoTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:191:2: ( ( ( rule__GoTo__Group__0 ) ) )
            // InternalBrowserAutomation.g:192:2: ( ( rule__GoTo__Group__0 ) )
            {
            // InternalBrowserAutomation.g:192:2: ( ( rule__GoTo__Group__0 ) )
            // InternalBrowserAutomation.g:193:3: ( rule__GoTo__Group__0 )
            {
             before(grammarAccess.getGoToAccess().getGroup()); 
            // InternalBrowserAutomation.g:194:3: ( rule__GoTo__Group__0 )
            // InternalBrowserAutomation.g:194:4: rule__GoTo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getGroup()); 

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
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleUncheckAll"
    // InternalBrowserAutomation.g:203:1: entryRuleUncheckAll : ruleUncheckAll EOF ;
    public final void entryRuleUncheckAll() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:204:1: ( ruleUncheckAll EOF )
            // InternalBrowserAutomation.g:205:1: ruleUncheckAll EOF
            {
             before(grammarAccess.getUncheckAllRule()); 
            pushFollow(FOLLOW_1);
            ruleUncheckAll();

            state._fsp--;

             after(grammarAccess.getUncheckAllRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUncheckAll"


    // $ANTLR start "ruleUncheckAll"
    // InternalBrowserAutomation.g:212:1: ruleUncheckAll : ( ( rule__UncheckAll__Group__0 ) ) ;
    public final void ruleUncheckAll() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:216:2: ( ( ( rule__UncheckAll__Group__0 ) ) )
            // InternalBrowserAutomation.g:217:2: ( ( rule__UncheckAll__Group__0 ) )
            {
            // InternalBrowserAutomation.g:217:2: ( ( rule__UncheckAll__Group__0 ) )
            // InternalBrowserAutomation.g:218:3: ( rule__UncheckAll__Group__0 )
            {
             before(grammarAccess.getUncheckAllAccess().getGroup()); 
            // InternalBrowserAutomation.g:219:3: ( rule__UncheckAll__Group__0 )
            // InternalBrowserAutomation.g:219:4: rule__UncheckAll__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UncheckAll__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUncheckAllAccess().getGroup()); 

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
    // $ANTLR end "ruleUncheckAll"


    // $ANTLR start "entryRuleGet"
    // InternalBrowserAutomation.g:228:1: entryRuleGet : ruleGet EOF ;
    public final void entryRuleGet() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:229:1: ( ruleGet EOF )
            // InternalBrowserAutomation.g:230:1: ruleGet EOF
            {
             before(grammarAccess.getGetRule()); 
            pushFollow(FOLLOW_1);
            ruleGet();

            state._fsp--;

             after(grammarAccess.getGetRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGet"


    // $ANTLR start "ruleGet"
    // InternalBrowserAutomation.g:237:1: ruleGet : ( ( rule__Get__Group__0 ) ) ;
    public final void ruleGet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:241:2: ( ( ( rule__Get__Group__0 ) ) )
            // InternalBrowserAutomation.g:242:2: ( ( rule__Get__Group__0 ) )
            {
            // InternalBrowserAutomation.g:242:2: ( ( rule__Get__Group__0 ) )
            // InternalBrowserAutomation.g:243:3: ( rule__Get__Group__0 )
            {
             before(grammarAccess.getGetAccess().getGroup()); 
            // InternalBrowserAutomation.g:244:3: ( rule__Get__Group__0 )
            // InternalBrowserAutomation.g:244:4: rule__Get__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Get__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getGroup()); 

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
    // $ANTLR end "ruleGet"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalBrowserAutomation.g:253:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:254:1: ( ruleAttributeValue EOF )
            // InternalBrowserAutomation.g:255:1: ruleAttributeValue EOF
            {
             before(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalBrowserAutomation.g:262:1: ruleAttributeValue : ( ( rule__AttributeValue__Alternatives ) ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:266:2: ( ( ( rule__AttributeValue__Alternatives ) ) )
            // InternalBrowserAutomation.g:267:2: ( ( rule__AttributeValue__Alternatives ) )
            {
            // InternalBrowserAutomation.g:267:2: ( ( rule__AttributeValue__Alternatives ) )
            // InternalBrowserAutomation.g:268:3: ( rule__AttributeValue__Alternatives )
            {
             before(grammarAccess.getAttributeValueAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:269:3: ( rule__AttributeValue__Alternatives )
            // InternalBrowserAutomation.g:269:4: rule__AttributeValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleOrder"
    // InternalBrowserAutomation.g:278:1: entryRuleOrder : ruleOrder EOF ;
    public final void entryRuleOrder() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:279:1: ( ruleOrder EOF )
            // InternalBrowserAutomation.g:280:1: ruleOrder EOF
            {
             before(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getOrderRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalBrowserAutomation.g:287:1: ruleOrder : ( ( rule__Order__Group__0 ) ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:291:2: ( ( ( rule__Order__Group__0 ) ) )
            // InternalBrowserAutomation.g:292:2: ( ( rule__Order__Group__0 ) )
            {
            // InternalBrowserAutomation.g:292:2: ( ( rule__Order__Group__0 ) )
            // InternalBrowserAutomation.g:293:3: ( rule__Order__Group__0 )
            {
             before(grammarAccess.getOrderAccess().getGroup()); 
            // InternalBrowserAutomation.g:294:3: ( rule__Order__Group__0 )
            // InternalBrowserAutomation.g:294:4: rule__Order__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Order__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getGroup()); 

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
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleElement"
    // InternalBrowserAutomation.g:303:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:304:1: ( ruleElement EOF )
            // InternalBrowserAutomation.g:305:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalBrowserAutomation.g:312:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:316:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalBrowserAutomation.g:317:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalBrowserAutomation.g:317:2: ( ( rule__Element__Alternatives ) )
            // InternalBrowserAutomation.g:318:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:319:3: ( rule__Element__Alternatives )
            // InternalBrowserAutomation.g:319:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleAttribut"
    // InternalBrowserAutomation.g:328:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:329:1: ( ruleAttribut EOF )
            // InternalBrowserAutomation.g:330:1: ruleAttribut EOF
            {
             before(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getAttributRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalBrowserAutomation.g:337:1: ruleAttribut : ( ( rule__Attribut__Alternatives ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:341:2: ( ( ( rule__Attribut__Alternatives ) ) )
            // InternalBrowserAutomation.g:342:2: ( ( rule__Attribut__Alternatives ) )
            {
            // InternalBrowserAutomation.g:342:2: ( ( rule__Attribut__Alternatives ) )
            // InternalBrowserAutomation.g:343:3: ( rule__Attribut__Alternatives )
            {
             before(grammarAccess.getAttributAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:344:3: ( rule__Attribut__Alternatives )
            // InternalBrowserAutomation.g:344:4: rule__Attribut__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleVariable"
    // InternalBrowserAutomation.g:353:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:354:1: ( ruleVariable EOF )
            // InternalBrowserAutomation.g:355:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalBrowserAutomation.g:362:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:366:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalBrowserAutomation.g:367:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalBrowserAutomation.g:367:2: ( ( rule__Variable__NameAssignment ) )
            // InternalBrowserAutomation.g:368:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalBrowserAutomation.g:369:3: ( rule__Variable__NameAssignment )
            // InternalBrowserAutomation.g:369:4: rule__Variable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVarReference"
    // InternalBrowserAutomation.g:378:1: entryRuleVarReference : ruleVarReference EOF ;
    public final void entryRuleVarReference() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:379:1: ( ruleVarReference EOF )
            // InternalBrowserAutomation.g:380:1: ruleVarReference EOF
            {
             before(grammarAccess.getVarReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getVarReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarReference"


    // $ANTLR start "ruleVarReference"
    // InternalBrowserAutomation.g:387:1: ruleVarReference : ( ( rule__VarReference__VarRefAssignment ) ) ;
    public final void ruleVarReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:391:2: ( ( ( rule__VarReference__VarRefAssignment ) ) )
            // InternalBrowserAutomation.g:392:2: ( ( rule__VarReference__VarRefAssignment ) )
            {
            // InternalBrowserAutomation.g:392:2: ( ( rule__VarReference__VarRefAssignment ) )
            // InternalBrowserAutomation.g:393:3: ( rule__VarReference__VarRefAssignment )
            {
             before(grammarAccess.getVarReferenceAccess().getVarRefAssignment()); 
            // InternalBrowserAutomation.g:394:3: ( rule__VarReference__VarRefAssignment )
            // InternalBrowserAutomation.g:394:4: rule__VarReference__VarRefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VarReference__VarRefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVarReferenceAccess().getVarRefAssignment()); 

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
    // $ANTLR end "ruleVarReference"


    // $ANTLR start "entryRuleClick"
    // InternalBrowserAutomation.g:403:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:404:1: ( ruleClick EOF )
            // InternalBrowserAutomation.g:405:1: ruleClick EOF
            {
             before(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getClickRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalBrowserAutomation.g:412:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:416:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalBrowserAutomation.g:417:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalBrowserAutomation.g:417:2: ( ( rule__Click__Group__0 ) )
            // InternalBrowserAutomation.g:418:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalBrowserAutomation.g:419:3: ( rule__Click__Group__0 )
            // InternalBrowserAutomation.g:419:4: rule__Click__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getGroup()); 

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
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleInsert"
    // InternalBrowserAutomation.g:428:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:429:1: ( ruleInsert EOF )
            // InternalBrowserAutomation.g:430:1: ruleInsert EOF
            {
             before(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            ruleInsert();

            state._fsp--;

             after(grammarAccess.getInsertRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalBrowserAutomation.g:437:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:441:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalBrowserAutomation.g:442:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalBrowserAutomation.g:442:2: ( ( rule__Insert__Group__0 ) )
            // InternalBrowserAutomation.g:443:3: ( rule__Insert__Group__0 )
            {
             before(grammarAccess.getInsertAccess().getGroup()); 
            // InternalBrowserAutomation.g:444:3: ( rule__Insert__Group__0 )
            // InternalBrowserAutomation.g:444:4: rule__Insert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getGroup()); 

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
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleVerify"
    // InternalBrowserAutomation.g:453:1: entryRuleVerify : ruleVerify EOF ;
    public final void entryRuleVerify() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:454:1: ( ruleVerify EOF )
            // InternalBrowserAutomation.g:455:1: ruleVerify EOF
            {
             before(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_1);
            ruleVerify();

            state._fsp--;

             after(grammarAccess.getVerifyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // InternalBrowserAutomation.g:462:1: ruleVerify : ( ( rule__Verify__Group__0 ) ) ;
    public final void ruleVerify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:466:2: ( ( ( rule__Verify__Group__0 ) ) )
            // InternalBrowserAutomation.g:467:2: ( ( rule__Verify__Group__0 ) )
            {
            // InternalBrowserAutomation.g:467:2: ( ( rule__Verify__Group__0 ) )
            // InternalBrowserAutomation.g:468:3: ( rule__Verify__Group__0 )
            {
             before(grammarAccess.getVerifyAccess().getGroup()); 
            // InternalBrowserAutomation.g:469:3: ( rule__Verify__Group__0 )
            // InternalBrowserAutomation.g:469:4: rule__Verify__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getGroup()); 

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
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleCheck"
    // InternalBrowserAutomation.g:478:1: entryRuleCheck : ruleCheck EOF ;
    public final void entryRuleCheck() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:479:1: ( ruleCheck EOF )
            // InternalBrowserAutomation.g:480:1: ruleCheck EOF
            {
             before(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleCheck();

            state._fsp--;

             after(grammarAccess.getCheckRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalBrowserAutomation.g:487:1: ruleCheck : ( ( rule__Check__Group__0 ) ) ;
    public final void ruleCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:491:2: ( ( ( rule__Check__Group__0 ) ) )
            // InternalBrowserAutomation.g:492:2: ( ( rule__Check__Group__0 ) )
            {
            // InternalBrowserAutomation.g:492:2: ( ( rule__Check__Group__0 ) )
            // InternalBrowserAutomation.g:493:3: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // InternalBrowserAutomation.g:494:3: ( rule__Check__Group__0 )
            // InternalBrowserAutomation.g:494:4: rule__Check__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getGroup()); 

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
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleChoose"
    // InternalBrowserAutomation.g:503:1: entryRuleChoose : ruleChoose EOF ;
    public final void entryRuleChoose() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:504:1: ( ruleChoose EOF )
            // InternalBrowserAutomation.g:505:1: ruleChoose EOF
            {
             before(grammarAccess.getChooseRule()); 
            pushFollow(FOLLOW_1);
            ruleChoose();

            state._fsp--;

             after(grammarAccess.getChooseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChoose"


    // $ANTLR start "ruleChoose"
    // InternalBrowserAutomation.g:512:1: ruleChoose : ( ( rule__Choose__Group__0 ) ) ;
    public final void ruleChoose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:516:2: ( ( ( rule__Choose__Group__0 ) ) )
            // InternalBrowserAutomation.g:517:2: ( ( rule__Choose__Group__0 ) )
            {
            // InternalBrowserAutomation.g:517:2: ( ( rule__Choose__Group__0 ) )
            // InternalBrowserAutomation.g:518:3: ( rule__Choose__Group__0 )
            {
             before(grammarAccess.getChooseAccess().getGroup()); 
            // InternalBrowserAutomation.g:519:3: ( rule__Choose__Group__0 )
            // InternalBrowserAutomation.g:519:4: rule__Choose__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choose__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChooseAccess().getGroup()); 

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
    // $ANTLR end "ruleChoose"


    // $ANTLR start "entryRuleContains"
    // InternalBrowserAutomation.g:528:1: entryRuleContains : ruleContains EOF ;
    public final void entryRuleContains() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:529:1: ( ruleContains EOF )
            // InternalBrowserAutomation.g:530:1: ruleContains EOF
            {
             before(grammarAccess.getContainsRule()); 
            pushFollow(FOLLOW_1);
            ruleContains();

            state._fsp--;

             after(grammarAccess.getContainsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContains"


    // $ANTLR start "ruleContains"
    // InternalBrowserAutomation.g:537:1: ruleContains : ( ( rule__Contains__Group__0 ) ) ;
    public final void ruleContains() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:541:2: ( ( ( rule__Contains__Group__0 ) ) )
            // InternalBrowserAutomation.g:542:2: ( ( rule__Contains__Group__0 ) )
            {
            // InternalBrowserAutomation.g:542:2: ( ( rule__Contains__Group__0 ) )
            // InternalBrowserAutomation.g:543:3: ( rule__Contains__Group__0 )
            {
             before(grammarAccess.getContainsAccess().getGroup()); 
            // InternalBrowserAutomation.g:544:3: ( rule__Contains__Group__0 )
            // InternalBrowserAutomation.g:544:4: rule__Contains__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Contains__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainsAccess().getGroup()); 

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
    // $ANTLR end "ruleContains"


    // $ANTLR start "rule__WebBrowser__Alternatives"
    // InternalBrowserAutomation.g:552:1: rule__WebBrowser__Alternatives : ( ( 'firefox' ) | ( 'chrome' ) | ( 'safari' ) | ( 'internetExplorer' ) );
    public final void rule__WebBrowser__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:556:1: ( ( 'firefox' ) | ( 'chrome' ) | ( 'safari' ) | ( 'internetExplorer' ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBrowserAutomation.g:557:2: ( 'firefox' )
                    {
                    // InternalBrowserAutomation.g:557:2: ( 'firefox' )
                    // InternalBrowserAutomation.g:558:3: 'firefox'
                    {
                     before(grammarAccess.getWebBrowserAccess().getFirefoxKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getFirefoxKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:563:2: ( 'chrome' )
                    {
                    // InternalBrowserAutomation.g:563:2: ( 'chrome' )
                    // InternalBrowserAutomation.g:564:3: 'chrome'
                    {
                     before(grammarAccess.getWebBrowserAccess().getChromeKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getChromeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:569:2: ( 'safari' )
                    {
                    // InternalBrowserAutomation.g:569:2: ( 'safari' )
                    // InternalBrowserAutomation.g:570:3: 'safari'
                    {
                     before(grammarAccess.getWebBrowserAccess().getSafariKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getSafariKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:575:2: ( 'internetExplorer' )
                    {
                    // InternalBrowserAutomation.g:575:2: ( 'internetExplorer' )
                    // InternalBrowserAutomation.g:576:3: 'internetExplorer'
                    {
                     before(grammarAccess.getWebBrowserAccess().getInternetExplorerKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getInternetExplorerKeyword_3()); 

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
    // $ANTLR end "rule__WebBrowser__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalBrowserAutomation.g:585:1: rule__Statement__Alternatives : ( ( ruleDoAction ) | ( ruleGet ) | ( ruleUncheckAll ) | ( ruleGoTo ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:589:1: ( ( ruleDoAction ) | ( ruleGet ) | ( ruleUncheckAll ) | ( ruleGoTo ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalBrowserAutomation.g:590:2: ( ruleDoAction )
                    {
                    // InternalBrowserAutomation.g:590:2: ( ruleDoAction )
                    // InternalBrowserAutomation.g:591:3: ruleDoAction
                    {
                     before(grammarAccess.getStatementAccess().getDoActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDoAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDoActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:596:2: ( ruleGet )
                    {
                    // InternalBrowserAutomation.g:596:2: ( ruleGet )
                    // InternalBrowserAutomation.g:597:3: ruleGet
                    {
                     before(grammarAccess.getStatementAccess().getGetParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGet();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getGetParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:602:2: ( ruleUncheckAll )
                    {
                    // InternalBrowserAutomation.g:602:2: ( ruleUncheckAll )
                    // InternalBrowserAutomation.g:603:3: ruleUncheckAll
                    {
                     before(grammarAccess.getStatementAccess().getUncheckAllParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUncheckAll();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getUncheckAllParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:608:2: ( ruleGoTo )
                    {
                    // InternalBrowserAutomation.g:608:2: ( ruleGoTo )
                    // InternalBrowserAutomation.g:609:3: ruleGoTo
                    {
                     before(grammarAccess.getStatementAccess().getGoToParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGoTo();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getGoToParserRuleCall_3()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalBrowserAutomation.g:618:1: rule__Action__Alternatives : ( ( ruleClick ) | ( ruleInsert ) | ( ruleVerify ) | ( ruleCheck ) | ( ruleChoose ) | ( ruleContains ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:622:1: ( ( ruleClick ) | ( ruleInsert ) | ( ruleVerify ) | ( ruleCheck ) | ( ruleChoose ) | ( ruleContains ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt3=1;
                }
                break;
            case 44:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==46) ) {
                    alt3=3;
                }
                else if ( (LA3_3==51) ) {
                    alt3=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                alt3=4;
                }
                break;
            case 50:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBrowserAutomation.g:623:2: ( ruleClick )
                    {
                    // InternalBrowserAutomation.g:623:2: ( ruleClick )
                    // InternalBrowserAutomation.g:624:3: ruleClick
                    {
                     before(grammarAccess.getActionAccess().getClickParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getClickParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:629:2: ( ruleInsert )
                    {
                    // InternalBrowserAutomation.g:629:2: ( ruleInsert )
                    // InternalBrowserAutomation.g:630:3: ruleInsert
                    {
                     before(grammarAccess.getActionAccess().getInsertParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInsert();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getInsertParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:635:2: ( ruleVerify )
                    {
                    // InternalBrowserAutomation.g:635:2: ( ruleVerify )
                    // InternalBrowserAutomation.g:636:3: ruleVerify
                    {
                     before(grammarAccess.getActionAccess().getVerifyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVerify();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getVerifyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:641:2: ( ruleCheck )
                    {
                    // InternalBrowserAutomation.g:641:2: ( ruleCheck )
                    // InternalBrowserAutomation.g:642:3: ruleCheck
                    {
                     before(grammarAccess.getActionAccess().getCheckParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCheck();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getCheckParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:647:2: ( ruleChoose )
                    {
                    // InternalBrowserAutomation.g:647:2: ( ruleChoose )
                    // InternalBrowserAutomation.g:648:3: ruleChoose
                    {
                     before(grammarAccess.getActionAccess().getChooseParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleChoose();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getChooseParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:653:2: ( ruleContains )
                    {
                    // InternalBrowserAutomation.g:653:2: ( ruleContains )
                    // InternalBrowserAutomation.g:654:3: ruleContains
                    {
                     before(grammarAccess.getActionAccess().getContainsParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleContains();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getContainsParserRuleCall_5()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Get__Alternatives_3"
    // InternalBrowserAutomation.g:663:1: rule__Get__Alternatives_3 : ( ( ( rule__Get__Group_3_0__0 ) ) | ( ( rule__Get__PageTitleAssignment_3_1 ) ) );
    public final void rule__Get__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:667:1: ( ( ( rule__Get__Group_3_0__0 ) ) | ( ( rule__Get__PageTitleAssignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=15 && LA4_0<=22)) ) {
                alt4=1;
            }
            else if ( (LA4_0==52) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBrowserAutomation.g:668:2: ( ( rule__Get__Group_3_0__0 ) )
                    {
                    // InternalBrowserAutomation.g:668:2: ( ( rule__Get__Group_3_0__0 ) )
                    // InternalBrowserAutomation.g:669:3: ( rule__Get__Group_3_0__0 )
                    {
                     before(grammarAccess.getGetAccess().getGroup_3_0()); 
                    // InternalBrowserAutomation.g:670:3: ( rule__Get__Group_3_0__0 )
                    // InternalBrowserAutomation.g:670:4: rule__Get__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Get__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:674:2: ( ( rule__Get__PageTitleAssignment_3_1 ) )
                    {
                    // InternalBrowserAutomation.g:674:2: ( ( rule__Get__PageTitleAssignment_3_1 ) )
                    // InternalBrowserAutomation.g:675:3: ( rule__Get__PageTitleAssignment_3_1 )
                    {
                     before(grammarAccess.getGetAccess().getPageTitleAssignment_3_1()); 
                    // InternalBrowserAutomation.g:676:3: ( rule__Get__PageTitleAssignment_3_1 )
                    // InternalBrowserAutomation.g:676:4: rule__Get__PageTitleAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Get__PageTitleAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetAccess().getPageTitleAssignment_3_1()); 

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
    // $ANTLR end "rule__Get__Alternatives_3"


    // $ANTLR start "rule__Get__Alternatives_3_0_2"
    // InternalBrowserAutomation.g:684:1: rule__Get__Alternatives_3_0_2 : ( ( ( rule__Get__Group_3_0_2_0__0 ) ) | ( ( rule__Get__Group_3_0_2_1__0 ) ) );
    public final void rule__Get__Alternatives_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:688:1: ( ( ( rule__Get__Group_3_0_2_0__0 ) ) | ( ( rule__Get__Group_3_0_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==37) ) {
                alt5=1;
            }
            else if ( (LA5_0==40) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBrowserAutomation.g:689:2: ( ( rule__Get__Group_3_0_2_0__0 ) )
                    {
                    // InternalBrowserAutomation.g:689:2: ( ( rule__Get__Group_3_0_2_0__0 ) )
                    // InternalBrowserAutomation.g:690:3: ( rule__Get__Group_3_0_2_0__0 )
                    {
                     before(grammarAccess.getGetAccess().getGroup_3_0_2_0()); 
                    // InternalBrowserAutomation.g:691:3: ( rule__Get__Group_3_0_2_0__0 )
                    // InternalBrowserAutomation.g:691:4: rule__Get__Group_3_0_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Get__Group_3_0_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetAccess().getGroup_3_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:695:2: ( ( rule__Get__Group_3_0_2_1__0 ) )
                    {
                    // InternalBrowserAutomation.g:695:2: ( ( rule__Get__Group_3_0_2_1__0 ) )
                    // InternalBrowserAutomation.g:696:3: ( rule__Get__Group_3_0_2_1__0 )
                    {
                     before(grammarAccess.getGetAccess().getGroup_3_0_2_1()); 
                    // InternalBrowserAutomation.g:697:3: ( rule__Get__Group_3_0_2_1__0 )
                    // InternalBrowserAutomation.g:697:4: rule__Get__Group_3_0_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Get__Group_3_0_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetAccess().getGroup_3_0_2_1()); 

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
    // $ANTLR end "rule__Get__Alternatives_3_0_2"


    // $ANTLR start "rule__AttributeValue__Alternatives"
    // InternalBrowserAutomation.g:705:1: rule__AttributeValue__Alternatives : ( ( ( rule__AttributeValue__StringValAssignment_0 ) ) | ( ( rule__AttributeValue__VarRefValAssignment_1 ) ) );
    public final void rule__AttributeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:709:1: ( ( ( rule__AttributeValue__StringValAssignment_0 ) ) | ( ( rule__AttributeValue__VarRefValAssignment_1 ) ) )
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
                    // InternalBrowserAutomation.g:710:2: ( ( rule__AttributeValue__StringValAssignment_0 ) )
                    {
                    // InternalBrowserAutomation.g:710:2: ( ( rule__AttributeValue__StringValAssignment_0 ) )
                    // InternalBrowserAutomation.g:711:3: ( rule__AttributeValue__StringValAssignment_0 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getStringValAssignment_0()); 
                    // InternalBrowserAutomation.g:712:3: ( rule__AttributeValue__StringValAssignment_0 )
                    // InternalBrowserAutomation.g:712:4: rule__AttributeValue__StringValAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeValue__StringValAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValueAccess().getStringValAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:716:2: ( ( rule__AttributeValue__VarRefValAssignment_1 ) )
                    {
                    // InternalBrowserAutomation.g:716:2: ( ( rule__AttributeValue__VarRefValAssignment_1 ) )
                    // InternalBrowserAutomation.g:717:3: ( rule__AttributeValue__VarRefValAssignment_1 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getVarRefValAssignment_1()); 
                    // InternalBrowserAutomation.g:718:3: ( rule__AttributeValue__VarRefValAssignment_1 )
                    // InternalBrowserAutomation.g:718:4: rule__AttributeValue__VarRefValAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeValue__VarRefValAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValueAccess().getVarRefValAssignment_1()); 

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
    // $ANTLR end "rule__AttributeValue__Alternatives"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalBrowserAutomation.g:726:1: rule__Element__Alternatives : ( ( 'link' ) | ( 'input' ) | ( 'button' ) | ( 'checkbox' ) | ( 'combobox' ) | ( 'image' ) | ( 'text' ) | ( 'title' ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:730:1: ( ( 'link' ) | ( 'input' ) | ( 'button' ) | ( 'checkbox' ) | ( 'combobox' ) | ( 'image' ) | ( 'text' ) | ( 'title' ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            case 19:
                {
                alt7=5;
                }
                break;
            case 20:
                {
                alt7=6;
                }
                break;
            case 21:
                {
                alt7=7;
                }
                break;
            case 22:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBrowserAutomation.g:731:2: ( 'link' )
                    {
                    // InternalBrowserAutomation.g:731:2: ( 'link' )
                    // InternalBrowserAutomation.g:732:3: 'link'
                    {
                     before(grammarAccess.getElementAccess().getLinkKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getLinkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:737:2: ( 'input' )
                    {
                    // InternalBrowserAutomation.g:737:2: ( 'input' )
                    // InternalBrowserAutomation.g:738:3: 'input'
                    {
                     before(grammarAccess.getElementAccess().getInputKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getInputKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:743:2: ( 'button' )
                    {
                    // InternalBrowserAutomation.g:743:2: ( 'button' )
                    // InternalBrowserAutomation.g:744:3: 'button'
                    {
                     before(grammarAccess.getElementAccess().getButtonKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getButtonKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:749:2: ( 'checkbox' )
                    {
                    // InternalBrowserAutomation.g:749:2: ( 'checkbox' )
                    // InternalBrowserAutomation.g:750:3: 'checkbox'
                    {
                     before(grammarAccess.getElementAccess().getCheckboxKeyword_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getCheckboxKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:755:2: ( 'combobox' )
                    {
                    // InternalBrowserAutomation.g:755:2: ( 'combobox' )
                    // InternalBrowserAutomation.g:756:3: 'combobox'
                    {
                     before(grammarAccess.getElementAccess().getComboboxKeyword_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getComboboxKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:761:2: ( 'image' )
                    {
                    // InternalBrowserAutomation.g:761:2: ( 'image' )
                    // InternalBrowserAutomation.g:762:3: 'image'
                    {
                     before(grammarAccess.getElementAccess().getImageKeyword_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getImageKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBrowserAutomation.g:767:2: ( 'text' )
                    {
                    // InternalBrowserAutomation.g:767:2: ( 'text' )
                    // InternalBrowserAutomation.g:768:3: 'text'
                    {
                     before(grammarAccess.getElementAccess().getTextKeyword_6()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getTextKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBrowserAutomation.g:773:2: ( 'title' )
                    {
                    // InternalBrowserAutomation.g:773:2: ( 'title' )
                    // InternalBrowserAutomation.g:774:3: 'title'
                    {
                     before(grammarAccess.getElementAccess().getTitleKeyword_7()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getTitleKeyword_7()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Attribut__Alternatives"
    // InternalBrowserAutomation.g:783:1: rule__Attribut__Alternatives : ( ( 'class' ) | ( 'value' ) | ( 'alt' ) | ( 'name' ) | ( 'href' ) );
    public final void rule__Attribut__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:787:1: ( ( 'class' ) | ( 'value' ) | ( 'alt' ) | ( 'name' ) | ( 'href' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 26:
                {
                alt8=4;
                }
                break;
            case 27:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBrowserAutomation.g:788:2: ( 'class' )
                    {
                    // InternalBrowserAutomation.g:788:2: ( 'class' )
                    // InternalBrowserAutomation.g:789:3: 'class'
                    {
                     before(grammarAccess.getAttributAccess().getClassKeyword_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getClassKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:794:2: ( 'value' )
                    {
                    // InternalBrowserAutomation.g:794:2: ( 'value' )
                    // InternalBrowserAutomation.g:795:3: 'value'
                    {
                     before(grammarAccess.getAttributAccess().getValueKeyword_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getValueKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:800:2: ( 'alt' )
                    {
                    // InternalBrowserAutomation.g:800:2: ( 'alt' )
                    // InternalBrowserAutomation.g:801:3: 'alt'
                    {
                     before(grammarAccess.getAttributAccess().getAltKeyword_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getAltKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:806:2: ( 'name' )
                    {
                    // InternalBrowserAutomation.g:806:2: ( 'name' )
                    // InternalBrowserAutomation.g:807:3: 'name'
                    {
                     before(grammarAccess.getAttributAccess().getNameKeyword_3()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getNameKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:812:2: ( 'href' )
                    {
                    // InternalBrowserAutomation.g:812:2: ( 'href' )
                    // InternalBrowserAutomation.g:813:3: 'href'
                    {
                     before(grammarAccess.getAttributAccess().getHrefKeyword_4()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getHrefKeyword_4()); 

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
    // $ANTLR end "rule__Attribut__Alternatives"


    // $ANTLR start "rule__Insert__Alternatives_1"
    // InternalBrowserAutomation.g:822:1: rule__Insert__Alternatives_1 : ( ( ( rule__Insert__AttrValAssignment_1_0 ) ) | ( ( rule__Insert__VarRefAssignment_1_1 ) ) );
    public final void rule__Insert__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:826:1: ( ( ( rule__Insert__AttrValAssignment_1_0 ) ) | ( ( rule__Insert__VarRefAssignment_1_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBrowserAutomation.g:827:2: ( ( rule__Insert__AttrValAssignment_1_0 ) )
                    {
                    // InternalBrowserAutomation.g:827:2: ( ( rule__Insert__AttrValAssignment_1_0 ) )
                    // InternalBrowserAutomation.g:828:3: ( rule__Insert__AttrValAssignment_1_0 )
                    {
                     before(grammarAccess.getInsertAccess().getAttrValAssignment_1_0()); 
                    // InternalBrowserAutomation.g:829:3: ( rule__Insert__AttrValAssignment_1_0 )
                    // InternalBrowserAutomation.g:829:4: rule__Insert__AttrValAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Insert__AttrValAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInsertAccess().getAttrValAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:833:2: ( ( rule__Insert__VarRefAssignment_1_1 ) )
                    {
                    // InternalBrowserAutomation.g:833:2: ( ( rule__Insert__VarRefAssignment_1_1 ) )
                    // InternalBrowserAutomation.g:834:3: ( rule__Insert__VarRefAssignment_1_1 )
                    {
                     before(grammarAccess.getInsertAccess().getVarRefAssignment_1_1()); 
                    // InternalBrowserAutomation.g:835:3: ( rule__Insert__VarRefAssignment_1_1 )
                    // InternalBrowserAutomation.g:835:4: rule__Insert__VarRefAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Insert__VarRefAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInsertAccess().getVarRefAssignment_1_1()); 

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
    // $ANTLR end "rule__Insert__Alternatives_1"


    // $ANTLR start "rule__BrowserAutomation__Group__0"
    // InternalBrowserAutomation.g:843:1: rule__BrowserAutomation__Group__0 : rule__BrowserAutomation__Group__0__Impl rule__BrowserAutomation__Group__1 ;
    public final void rule__BrowserAutomation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:847:1: ( rule__BrowserAutomation__Group__0__Impl rule__BrowserAutomation__Group__1 )
            // InternalBrowserAutomation.g:848:2: rule__BrowserAutomation__Group__0__Impl rule__BrowserAutomation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BrowserAutomation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BrowserAutomation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrowserAutomation__Group__0"


    // $ANTLR start "rule__BrowserAutomation__Group__0__Impl"
    // InternalBrowserAutomation.g:855:1: rule__BrowserAutomation__Group__0__Impl : ( () ) ;
    public final void rule__BrowserAutomation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:859:1: ( ( () ) )
            // InternalBrowserAutomation.g:860:1: ( () )
            {
            // InternalBrowserAutomation.g:860:1: ( () )
            // InternalBrowserAutomation.g:861:2: ()
            {
             before(grammarAccess.getBrowserAutomationAccess().getBrowserAutomationAction_0()); 
            // InternalBrowserAutomation.g:862:2: ()
            // InternalBrowserAutomation.g:862:3: 
            {
            }

             after(grammarAccess.getBrowserAutomationAccess().getBrowserAutomationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrowserAutomation__Group__0__Impl"


    // $ANTLR start "rule__BrowserAutomation__Group__1"
    // InternalBrowserAutomation.g:870:1: rule__BrowserAutomation__Group__1 : rule__BrowserAutomation__Group__1__Impl rule__BrowserAutomation__Group__2 ;
    public final void rule__BrowserAutomation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:874:1: ( rule__BrowserAutomation__Group__1__Impl rule__BrowserAutomation__Group__2 )
            // InternalBrowserAutomation.g:875:2: rule__BrowserAutomation__Group__1__Impl rule__BrowserAutomation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BrowserAutomation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BrowserAutomation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrowserAutomation__Group__1"


    // $ANTLR start "rule__BrowserAutomation__Group__1__Impl"
    // InternalBrowserAutomation.g:882:1: rule__BrowserAutomation__Group__1__Impl : ( ( rule__BrowserAutomation__TestNameAssignment_1 ) ) ;
    public final void rule__BrowserAutomation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:886:1: ( ( ( rule__BrowserAutomation__TestNameAssignment_1 ) ) )
            // InternalBrowserAutomation.g:887:1: ( ( rule__BrowserAutomation__TestNameAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:887:1: ( ( rule__BrowserAutomation__TestNameAssignment_1 ) )
            // InternalBrowserAutomation.g:888:2: ( rule__BrowserAutomation__TestNameAssignment_1 )
            {
             before(grammarAccess.getBrowserAutomationAccess().getTestNameAssignment_1()); 
            // InternalBrowserAutomation.g:889:2: ( rule__BrowserAutomation__TestNameAssignment_1 )
            // InternalBrowserAutomation.g:889:3: rule__BrowserAutomation__TestNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BrowserAutomation__TestNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBrowserAutomationAccess().getTestNameAssignment_1()); 

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
    // $ANTLR end "rule__BrowserAutomation__Group__1__Impl"


    // $ANTLR start "rule__BrowserAutomation__Group__2"
    // InternalBrowserAutomation.g:897:1: rule__BrowserAutomation__Group__2 : rule__BrowserAutomation__Group__2__Impl rule__BrowserAutomation__Group__3 ;
    public final void rule__BrowserAutomation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:901:1: ( rule__BrowserAutomation__Group__2__Impl rule__BrowserAutomation__Group__3 )
            // InternalBrowserAutomation.g:902:2: rule__BrowserAutomation__Group__2__Impl rule__BrowserAutomation__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__BrowserAutomation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BrowserAutomation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrowserAutomation__Group__2"


    // $ANTLR start "rule__BrowserAutomation__Group__2__Impl"
    // InternalBrowserAutomation.g:909:1: rule__BrowserAutomation__Group__2__Impl : ( '{' ) ;
    public final void rule__BrowserAutomation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:913:1: ( ( '{' ) )
            // InternalBrowserAutomation.g:914:1: ( '{' )
            {
            // InternalBrowserAutomation.g:914:1: ( '{' )
            // InternalBrowserAutomation.g:915:2: '{'
            {
             before(grammarAccess.getBrowserAutomationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBrowserAutomationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__BrowserAutomation__Group__2__Impl"


    // $ANTLR start "rule__BrowserAutomation__Group__3"
    // InternalBrowserAutomation.g:924:1: rule__BrowserAutomation__Group__3 : rule__BrowserAutomation__Group__3__Impl rule__BrowserAutomation__Group__4 ;
    public final void rule__BrowserAutomation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:928:1: ( rule__BrowserAutomation__Group__3__Impl rule__BrowserAutomation__Group__4 )
            // InternalBrowserAutomation.g:929:2: rule__BrowserAutomation__Group__3__Impl rule__BrowserAutomation__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__BrowserAutomation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BrowserAutomation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrowserAutomation__Group__3"


    // $ANTLR start "rule__BrowserAutomation__Group__3__Impl"
    // InternalBrowserAutomation.g:936:1: rule__BrowserAutomation__Group__3__Impl : ( 'open' ) ;
    public final void rule__BrowserAutomation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:940:1: ( ( 'open' ) )
            // InternalBrowserAutomation.g:941:1: ( 'open' )
            {
            // InternalBrowserAutomation.g:941:1: ( 'open' )
            // InternalBrowserAutomation.g:942:2: 'open'
            {
             before(grammarAccess.getBrowserAutomationAccess().getOpenKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBrowserAutomationAccess().getOpenKeyword_3()); 

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
    // $ANTLR end "rule__BrowserAutomation__Group__3__Impl"


    // $ANTLR start "rule__BrowserAutomation__Group__4"
    // InternalBrowserAutomation.g:951:1: rule__BrowserAutomation__Group__4 : rule__BrowserAutomation__Group__4__Impl rule__BrowserAutomation__Group__5 ;
    public final void rule__BrowserAutomation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:955:1: ( rule__BrowserAutomation__Group__4__Impl rule__BrowserAutomation__Group__5 )
            // InternalBrowserAutomation.g:956:2: rule__BrowserAutomation__Group__4__Impl rule__BrowserAutomation__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__BrowserAutomation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BrowserAutomation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrowserAutomation__Group__4"


    // $ANTLR start "rule__BrowserAutomation__Group__4__Impl"
    // InternalBrowserAutomation.g:963:1: rule__BrowserAutomation__Group__4__Impl : ( ( rule__BrowserAutomation__WebBrowserAssignment_4 ) ) ;
    public final void rule__BrowserAutomation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:967:1: ( ( ( rule__BrowserAutomation__WebBrowserAssignment_4 ) ) )
            // InternalBrowserAutomation.g:968:1: ( ( rule__BrowserAutomation__WebBrowserAssignment_4 ) )
            {
            // InternalBrowserAutomation.g:968:1: ( ( rule__BrowserAutomation__WebBrowserAssignment_4 ) )
            // InternalBrowserAutomation.g:969:2: ( rule__BrowserAutomation__WebBrowserAssignment_4 )
            {
             before(grammarAccess.getBrowserAutomationAccess().getWebBrowserAssignment_4()); 
            // InternalBrowserAutomation.g:970:2: ( rule__BrowserAutomation__WebBrowserAssignment_4 )
            // InternalBrowserAutomation.g:970:3: rule__BrowserAutomation__WebBrowserAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BrowserAutomation__WebBrowserAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBrowserAutomationAccess().getWebBrowserAssignment_4()); 

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
    // $ANTLR end "rule__BrowserAutomation__Group__4__Impl"


    // $ANTLR start "rule__BrowserAutomation__Group__5"
    // InternalBrowserAutomation.g:978:1: rule__BrowserAutomation__Group__5 : rule__BrowserAutomation__Group__5__Impl rule__BrowserAutomation__Group__6 ;
    public final void rule__BrowserAutomation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:982:1: ( rule__BrowserAutomation__Group__5__Impl rule__BrowserAutomation__Group__6 )
            // InternalBrowserAutomation.g:983:2: rule__BrowserAutomation__Group__5__Impl rule__BrowserAutomation__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__BrowserAutomation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BrowserAutomation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrowserAutomation__Group__5"


    // $ANTLR start "rule__BrowserAutomation__Group__5__Impl"
    // InternalBrowserAutomation.g:990:1: rule__BrowserAutomation__Group__5__Impl : ( ( rule__BrowserAutomation__StatementsAssignment_5 )* ) ;
    public final void rule__BrowserAutomation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:994:1: ( ( ( rule__BrowserAutomation__StatementsAssignment_5 )* ) )
            // InternalBrowserAutomation.g:995:1: ( ( rule__BrowserAutomation__StatementsAssignment_5 )* )
            {
            // InternalBrowserAutomation.g:995:1: ( ( rule__BrowserAutomation__StatementsAssignment_5 )* )
            // InternalBrowserAutomation.g:996:2: ( rule__BrowserAutomation__StatementsAssignment_5 )*
            {
             before(grammarAccess.getBrowserAutomationAccess().getStatementsAssignment_5()); 
            // InternalBrowserAutomation.g:997:2: ( rule__BrowserAutomation__StatementsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==31||LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBrowserAutomation.g:997:3: rule__BrowserAutomation__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__BrowserAutomation__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBrowserAutomationAccess().getStatementsAssignment_5()); 

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
    // $ANTLR end "rule__BrowserAutomation__Group__5__Impl"


    // $ANTLR start "rule__BrowserAutomation__Group__6"
    // InternalBrowserAutomation.g:1005:1: rule__BrowserAutomation__Group__6 : rule__BrowserAutomation__Group__6__Impl ;
    public final void rule__BrowserAutomation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1009:1: ( rule__BrowserAutomation__Group__6__Impl )
            // InternalBrowserAutomation.g:1010:2: rule__BrowserAutomation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BrowserAutomation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrowserAutomation__Group__6"


    // $ANTLR start "rule__BrowserAutomation__Group__6__Impl"
    // InternalBrowserAutomation.g:1016:1: rule__BrowserAutomation__Group__6__Impl : ( '}' ) ;
    public final void rule__BrowserAutomation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1020:1: ( ( '}' ) )
            // InternalBrowserAutomation.g:1021:1: ( '}' )
            {
            // InternalBrowserAutomation.g:1021:1: ( '}' )
            // InternalBrowserAutomation.g:1022:2: '}'
            {
             before(grammarAccess.getBrowserAutomationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBrowserAutomationAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__BrowserAutomation__Group__6__Impl"


    // $ANTLR start "rule__DoAction__Group__0"
    // InternalBrowserAutomation.g:1032:1: rule__DoAction__Group__0 : rule__DoAction__Group__0__Impl rule__DoAction__Group__1 ;
    public final void rule__DoAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1036:1: ( rule__DoAction__Group__0__Impl rule__DoAction__Group__1 )
            // InternalBrowserAutomation.g:1037:2: rule__DoAction__Group__0__Impl rule__DoAction__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DoAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAction__Group__0"


    // $ANTLR start "rule__DoAction__Group__0__Impl"
    // InternalBrowserAutomation.g:1044:1: rule__DoAction__Group__0__Impl : ( ( rule__DoAction__GetAssignment_0 ) ) ;
    public final void rule__DoAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1048:1: ( ( ( rule__DoAction__GetAssignment_0 ) ) )
            // InternalBrowserAutomation.g:1049:1: ( ( rule__DoAction__GetAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:1049:1: ( ( rule__DoAction__GetAssignment_0 ) )
            // InternalBrowserAutomation.g:1050:2: ( rule__DoAction__GetAssignment_0 )
            {
             before(grammarAccess.getDoActionAccess().getGetAssignment_0()); 
            // InternalBrowserAutomation.g:1051:2: ( rule__DoAction__GetAssignment_0 )
            // InternalBrowserAutomation.g:1051:3: rule__DoAction__GetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DoAction__GetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDoActionAccess().getGetAssignment_0()); 

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
    // $ANTLR end "rule__DoAction__Group__0__Impl"


    // $ANTLR start "rule__DoAction__Group__1"
    // InternalBrowserAutomation.g:1059:1: rule__DoAction__Group__1 : rule__DoAction__Group__1__Impl ;
    public final void rule__DoAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1063:1: ( rule__DoAction__Group__1__Impl )
            // InternalBrowserAutomation.g:1064:2: rule__DoAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoAction__Group__1"


    // $ANTLR start "rule__DoAction__Group__1__Impl"
    // InternalBrowserAutomation.g:1070:1: rule__DoAction__Group__1__Impl : ( ( rule__DoAction__ActionAssignment_1 ) ) ;
    public final void rule__DoAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1074:1: ( ( ( rule__DoAction__ActionAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1075:1: ( ( rule__DoAction__ActionAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1075:1: ( ( rule__DoAction__ActionAssignment_1 ) )
            // InternalBrowserAutomation.g:1076:2: ( rule__DoAction__ActionAssignment_1 )
            {
             before(grammarAccess.getDoActionAccess().getActionAssignment_1()); 
            // InternalBrowserAutomation.g:1077:2: ( rule__DoAction__ActionAssignment_1 )
            // InternalBrowserAutomation.g:1077:3: rule__DoAction__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DoAction__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoActionAccess().getActionAssignment_1()); 

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
    // $ANTLR end "rule__DoAction__Group__1__Impl"


    // $ANTLR start "rule__GoTo__Group__0"
    // InternalBrowserAutomation.g:1086:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1090:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalBrowserAutomation.g:1091:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__GoTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0"


    // $ANTLR start "rule__GoTo__Group__0__Impl"
    // InternalBrowserAutomation.g:1098:1: rule__GoTo__Group__0__Impl : ( 'go' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1102:1: ( ( 'go' ) )
            // InternalBrowserAutomation.g:1103:1: ( 'go' )
            {
            // InternalBrowserAutomation.g:1103:1: ( 'go' )
            // InternalBrowserAutomation.g:1104:2: 'go'
            {
             before(grammarAccess.getGoToAccess().getGoKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getGoKeyword_0()); 

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
    // $ANTLR end "rule__GoTo__Group__0__Impl"


    // $ANTLR start "rule__GoTo__Group__1"
    // InternalBrowserAutomation.g:1113:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl rule__GoTo__Group__2 ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1117:1: ( rule__GoTo__Group__1__Impl rule__GoTo__Group__2 )
            // InternalBrowserAutomation.g:1118:2: rule__GoTo__Group__1__Impl rule__GoTo__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__GoTo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1"


    // $ANTLR start "rule__GoTo__Group__1__Impl"
    // InternalBrowserAutomation.g:1125:1: rule__GoTo__Group__1__Impl : ( 'to' ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1129:1: ( ( 'to' ) )
            // InternalBrowserAutomation.g:1130:1: ( 'to' )
            {
            // InternalBrowserAutomation.g:1130:1: ( 'to' )
            // InternalBrowserAutomation.g:1131:2: 'to'
            {
             before(grammarAccess.getGoToAccess().getToKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getToKeyword_1()); 

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
    // $ANTLR end "rule__GoTo__Group__1__Impl"


    // $ANTLR start "rule__GoTo__Group__2"
    // InternalBrowserAutomation.g:1140:1: rule__GoTo__Group__2 : rule__GoTo__Group__2__Impl ;
    public final void rule__GoTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1144:1: ( rule__GoTo__Group__2__Impl )
            // InternalBrowserAutomation.g:1145:2: rule__GoTo__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__2"


    // $ANTLR start "rule__GoTo__Group__2__Impl"
    // InternalBrowserAutomation.g:1151:1: rule__GoTo__Group__2__Impl : ( ( rule__GoTo__UrlAssignment_2 ) ) ;
    public final void rule__GoTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1155:1: ( ( ( rule__GoTo__UrlAssignment_2 ) ) )
            // InternalBrowserAutomation.g:1156:1: ( ( rule__GoTo__UrlAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:1156:1: ( ( rule__GoTo__UrlAssignment_2 ) )
            // InternalBrowserAutomation.g:1157:2: ( rule__GoTo__UrlAssignment_2 )
            {
             before(grammarAccess.getGoToAccess().getUrlAssignment_2()); 
            // InternalBrowserAutomation.g:1158:2: ( rule__GoTo__UrlAssignment_2 )
            // InternalBrowserAutomation.g:1158:3: rule__GoTo__UrlAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getUrlAssignment_2()); 

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
    // $ANTLR end "rule__GoTo__Group__2__Impl"


    // $ANTLR start "rule__UncheckAll__Group__0"
    // InternalBrowserAutomation.g:1167:1: rule__UncheckAll__Group__0 : rule__UncheckAll__Group__0__Impl rule__UncheckAll__Group__1 ;
    public final void rule__UncheckAll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1171:1: ( rule__UncheckAll__Group__0__Impl rule__UncheckAll__Group__1 )
            // InternalBrowserAutomation.g:1172:2: rule__UncheckAll__Group__0__Impl rule__UncheckAll__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__UncheckAll__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UncheckAll__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UncheckAll__Group__0"


    // $ANTLR start "rule__UncheckAll__Group__0__Impl"
    // InternalBrowserAutomation.g:1179:1: rule__UncheckAll__Group__0__Impl : ( 'uncheck' ) ;
    public final void rule__UncheckAll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1183:1: ( ( 'uncheck' ) )
            // InternalBrowserAutomation.g:1184:1: ( 'uncheck' )
            {
            // InternalBrowserAutomation.g:1184:1: ( 'uncheck' )
            // InternalBrowserAutomation.g:1185:2: 'uncheck'
            {
             before(grammarAccess.getUncheckAllAccess().getUncheckKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUncheckAllAccess().getUncheckKeyword_0()); 

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
    // $ANTLR end "rule__UncheckAll__Group__0__Impl"


    // $ANTLR start "rule__UncheckAll__Group__1"
    // InternalBrowserAutomation.g:1194:1: rule__UncheckAll__Group__1 : rule__UncheckAll__Group__1__Impl ;
    public final void rule__UncheckAll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1198:1: ( rule__UncheckAll__Group__1__Impl )
            // InternalBrowserAutomation.g:1199:2: rule__UncheckAll__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UncheckAll__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UncheckAll__Group__1"


    // $ANTLR start "rule__UncheckAll__Group__1__Impl"
    // InternalBrowserAutomation.g:1205:1: rule__UncheckAll__Group__1__Impl : ( 'all' ) ;
    public final void rule__UncheckAll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1209:1: ( ( 'all' ) )
            // InternalBrowserAutomation.g:1210:1: ( 'all' )
            {
            // InternalBrowserAutomation.g:1210:1: ( 'all' )
            // InternalBrowserAutomation.g:1211:2: 'all'
            {
             before(grammarAccess.getUncheckAllAccess().getAllKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getUncheckAllAccess().getAllKeyword_1()); 

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
    // $ANTLR end "rule__UncheckAll__Group__1__Impl"


    // $ANTLR start "rule__Get__Group__0"
    // InternalBrowserAutomation.g:1221:1: rule__Get__Group__0 : rule__Get__Group__0__Impl rule__Get__Group__1 ;
    public final void rule__Get__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1225:1: ( rule__Get__Group__0__Impl rule__Get__Group__1 )
            // InternalBrowserAutomation.g:1226:2: rule__Get__Group__0__Impl rule__Get__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Get__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__0"


    // $ANTLR start "rule__Get__Group__0__Impl"
    // InternalBrowserAutomation.g:1233:1: rule__Get__Group__0__Impl : ( ( rule__Get__VarRefAssignment_0 ) ) ;
    public final void rule__Get__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1237:1: ( ( ( rule__Get__VarRefAssignment_0 ) ) )
            // InternalBrowserAutomation.g:1238:1: ( ( rule__Get__VarRefAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:1238:1: ( ( rule__Get__VarRefAssignment_0 ) )
            // InternalBrowserAutomation.g:1239:2: ( rule__Get__VarRefAssignment_0 )
            {
             before(grammarAccess.getGetAccess().getVarRefAssignment_0()); 
            // InternalBrowserAutomation.g:1240:2: ( rule__Get__VarRefAssignment_0 )
            // InternalBrowserAutomation.g:1240:3: rule__Get__VarRefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Get__VarRefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getVarRefAssignment_0()); 

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
    // $ANTLR end "rule__Get__Group__0__Impl"


    // $ANTLR start "rule__Get__Group__1"
    // InternalBrowserAutomation.g:1248:1: rule__Get__Group__1 : rule__Get__Group__1__Impl rule__Get__Group__2 ;
    public final void rule__Get__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1252:1: ( rule__Get__Group__1__Impl rule__Get__Group__2 )
            // InternalBrowserAutomation.g:1253:2: rule__Get__Group__1__Impl rule__Get__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Get__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__1"


    // $ANTLR start "rule__Get__Group__1__Impl"
    // InternalBrowserAutomation.g:1260:1: rule__Get__Group__1__Impl : ( '=' ) ;
    public final void rule__Get__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1264:1: ( ( '=' ) )
            // InternalBrowserAutomation.g:1265:1: ( '=' )
            {
            // InternalBrowserAutomation.g:1265:1: ( '=' )
            // InternalBrowserAutomation.g:1266:2: '='
            {
             before(grammarAccess.getGetAccess().getEqualsSignKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Get__Group__1__Impl"


    // $ANTLR start "rule__Get__Group__2"
    // InternalBrowserAutomation.g:1275:1: rule__Get__Group__2 : rule__Get__Group__2__Impl rule__Get__Group__3 ;
    public final void rule__Get__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1279:1: ( rule__Get__Group__2__Impl rule__Get__Group__3 )
            // InternalBrowserAutomation.g:1280:2: rule__Get__Group__2__Impl rule__Get__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Get__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__2"


    // $ANTLR start "rule__Get__Group__2__Impl"
    // InternalBrowserAutomation.g:1287:1: rule__Get__Group__2__Impl : ( 'get' ) ;
    public final void rule__Get__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1291:1: ( ( 'get' ) )
            // InternalBrowserAutomation.g:1292:1: ( 'get' )
            {
            // InternalBrowserAutomation.g:1292:1: ( 'get' )
            // InternalBrowserAutomation.g:1293:2: 'get'
            {
             before(grammarAccess.getGetAccess().getGetKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getGetKeyword_2()); 

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
    // $ANTLR end "rule__Get__Group__2__Impl"


    // $ANTLR start "rule__Get__Group__3"
    // InternalBrowserAutomation.g:1302:1: rule__Get__Group__3 : rule__Get__Group__3__Impl ;
    public final void rule__Get__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1306:1: ( rule__Get__Group__3__Impl )
            // InternalBrowserAutomation.g:1307:2: rule__Get__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Get__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__3"


    // $ANTLR start "rule__Get__Group__3__Impl"
    // InternalBrowserAutomation.g:1313:1: rule__Get__Group__3__Impl : ( ( rule__Get__Alternatives_3 ) ) ;
    public final void rule__Get__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1317:1: ( ( ( rule__Get__Alternatives_3 ) ) )
            // InternalBrowserAutomation.g:1318:1: ( ( rule__Get__Alternatives_3 ) )
            {
            // InternalBrowserAutomation.g:1318:1: ( ( rule__Get__Alternatives_3 ) )
            // InternalBrowserAutomation.g:1319:2: ( rule__Get__Alternatives_3 )
            {
             before(grammarAccess.getGetAccess().getAlternatives_3()); 
            // InternalBrowserAutomation.g:1320:2: ( rule__Get__Alternatives_3 )
            // InternalBrowserAutomation.g:1320:3: rule__Get__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Get__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Get__Group__3__Impl"


    // $ANTLR start "rule__Get__Group_3_0__0"
    // InternalBrowserAutomation.g:1329:1: rule__Get__Group_3_0__0 : rule__Get__Group_3_0__0__Impl rule__Get__Group_3_0__1 ;
    public final void rule__Get__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1333:1: ( rule__Get__Group_3_0__0__Impl rule__Get__Group_3_0__1 )
            // InternalBrowserAutomation.g:1334:2: rule__Get__Group_3_0__0__Impl rule__Get__Group_3_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Get__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group_3_0__0"


    // $ANTLR start "rule__Get__Group_3_0__0__Impl"
    // InternalBrowserAutomation.g:1341:1: rule__Get__Group_3_0__0__Impl : ( ( rule__Get__ElementAssignment_3_0_0 ) ) ;
    public final void rule__Get__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1345:1: ( ( ( rule__Get__ElementAssignment_3_0_0 ) ) )
            // InternalBrowserAutomation.g:1346:1: ( ( rule__Get__ElementAssignment_3_0_0 ) )
            {
            // InternalBrowserAutomation.g:1346:1: ( ( rule__Get__ElementAssignment_3_0_0 ) )
            // InternalBrowserAutomation.g:1347:2: ( rule__Get__ElementAssignment_3_0_0 )
            {
             before(grammarAccess.getGetAccess().getElementAssignment_3_0_0()); 
            // InternalBrowserAutomation.g:1348:2: ( rule__Get__ElementAssignment_3_0_0 )
            // InternalBrowserAutomation.g:1348:3: rule__Get__ElementAssignment_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Get__ElementAssignment_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getElementAssignment_3_0_0()); 

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
    // $ANTLR end "rule__Get__Group_3_0__0__Impl"


    // $ANTLR start "rule__Get__Group_3_0__1"
    // InternalBrowserAutomation.g:1356:1: rule__Get__Group_3_0__1 : rule__Get__Group_3_0__1__Impl rule__Get__Group_3_0__2 ;
    public final void rule__Get__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1360:1: ( rule__Get__Group_3_0__1__Impl rule__Get__Group_3_0__2 )
            // InternalBrowserAutomation.g:1361:2: rule__Get__Group_3_0__1__Impl rule__Get__Group_3_0__2
            {
            pushFollow(FOLLOW_16);
            rule__Get__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group_3_0__1"


    // $ANTLR start "rule__Get__Group_3_0__1__Impl"
    // InternalBrowserAutomation.g:1368:1: rule__Get__Group_3_0__1__Impl : ( ( rule__Get__OrderAssignment_3_0_1 )? ) ;
    public final void rule__Get__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1372:1: ( ( ( rule__Get__OrderAssignment_3_0_1 )? ) )
            // InternalBrowserAutomation.g:1373:1: ( ( rule__Get__OrderAssignment_3_0_1 )? )
            {
            // InternalBrowserAutomation.g:1373:1: ( ( rule__Get__OrderAssignment_3_0_1 )? )
            // InternalBrowserAutomation.g:1374:2: ( rule__Get__OrderAssignment_3_0_1 )?
            {
             before(grammarAccess.getGetAccess().getOrderAssignment_3_0_1()); 
            // InternalBrowserAutomation.g:1375:2: ( rule__Get__OrderAssignment_3_0_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBrowserAutomation.g:1375:3: rule__Get__OrderAssignment_3_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Get__OrderAssignment_3_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGetAccess().getOrderAssignment_3_0_1()); 

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
    // $ANTLR end "rule__Get__Group_3_0__1__Impl"


    // $ANTLR start "rule__Get__Group_3_0__2"
    // InternalBrowserAutomation.g:1383:1: rule__Get__Group_3_0__2 : rule__Get__Group_3_0__2__Impl ;
    public final void rule__Get__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1387:1: ( rule__Get__Group_3_0__2__Impl )
            // InternalBrowserAutomation.g:1388:2: rule__Get__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Get__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group_3_0__2"


    // $ANTLR start "rule__Get__Group_3_0__2__Impl"
    // InternalBrowserAutomation.g:1394:1: rule__Get__Group_3_0__2__Impl : ( ( rule__Get__Alternatives_3_0_2 ) ) ;
    public final void rule__Get__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1398:1: ( ( ( rule__Get__Alternatives_3_0_2 ) ) )
            // InternalBrowserAutomation.g:1399:1: ( ( rule__Get__Alternatives_3_0_2 ) )
            {
            // InternalBrowserAutomation.g:1399:1: ( ( rule__Get__Alternatives_3_0_2 ) )
            // InternalBrowserAutomation.g:1400:2: ( rule__Get__Alternatives_3_0_2 )
            {
             before(grammarAccess.getGetAccess().getAlternatives_3_0_2()); 
            // InternalBrowserAutomation.g:1401:2: ( rule__Get__Alternatives_3_0_2 )
            // InternalBrowserAutomation.g:1401:3: rule__Get__Alternatives_3_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Get__Alternatives_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getAlternatives_3_0_2()); 

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
    // $ANTLR end "rule__Get__Group_3_0__2__Impl"


    // $ANTLR start "rule__Get__Group_3_0_2_0__0"
    // InternalBrowserAutomation.g:1410:1: rule__Get__Group_3_0_2_0__0 : rule__Get__Group_3_0_2_0__0__Impl rule__Get__Group_3_0_2_0__1 ;
    public final void rule__Get__Group_3_0_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1414:1: ( rule__Get__Group_3_0_2_0__0__Impl rule__Get__Group_3_0_2_0__1 )
            // InternalBrowserAutomation.g:1415:2: rule__Get__Group_3_0_2_0__0__Impl rule__Get__Group_3_0_2_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Get__Group_3_0_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group_3_0_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group_3_0_2_0__0"


    // $ANTLR start "rule__Get__Group_3_0_2_0__0__Impl"
    // InternalBrowserAutomation.g:1422:1: rule__Get__Group_3_0_2_0__0__Impl : ( 'by' ) ;
    public final void rule__Get__Group_3_0_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1426:1: ( ( 'by' ) )
            // InternalBrowserAutomation.g:1427:1: ( 'by' )
            {
            // InternalBrowserAutomation.g:1427:1: ( 'by' )
            // InternalBrowserAutomation.g:1428:2: 'by'
            {
             before(grammarAccess.getGetAccess().getByKeyword_3_0_2_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getByKeyword_3_0_2_0_0()); 

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
    // $ANTLR end "rule__Get__Group_3_0_2_0__0__Impl"


    // $ANTLR start "rule__Get__Group_3_0_2_0__1"
    // InternalBrowserAutomation.g:1437:1: rule__Get__Group_3_0_2_0__1 : rule__Get__Group_3_0_2_0__1__Impl rule__Get__Group_3_0_2_0__2 ;
    public final void rule__Get__Group_3_0_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1441:1: ( rule__Get__Group_3_0_2_0__1__Impl rule__Get__Group_3_0_2_0__2 )
            // InternalBrowserAutomation.g:1442:2: rule__Get__Group_3_0_2_0__1__Impl rule__Get__Group_3_0_2_0__2
            {
            pushFollow(FOLLOW_18);
            rule__Get__Group_3_0_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group_3_0_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group_3_0_2_0__1"


    // $ANTLR start "rule__Get__Group_3_0_2_0__1__Impl"
    // InternalBrowserAutomation.g:1449:1: rule__Get__Group_3_0_2_0__1__Impl : ( ( rule__Get__AttrAssignment_3_0_2_0_1 ) ) ;
    public final void rule__Get__Group_3_0_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1453:1: ( ( ( rule__Get__AttrAssignment_3_0_2_0_1 ) ) )
            // InternalBrowserAutomation.g:1454:1: ( ( rule__Get__AttrAssignment_3_0_2_0_1 ) )
            {
            // InternalBrowserAutomation.g:1454:1: ( ( rule__Get__AttrAssignment_3_0_2_0_1 ) )
            // InternalBrowserAutomation.g:1455:2: ( rule__Get__AttrAssignment_3_0_2_0_1 )
            {
             before(grammarAccess.getGetAccess().getAttrAssignment_3_0_2_0_1()); 
            // InternalBrowserAutomation.g:1456:2: ( rule__Get__AttrAssignment_3_0_2_0_1 )
            // InternalBrowserAutomation.g:1456:3: rule__Get__AttrAssignment_3_0_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Get__AttrAssignment_3_0_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getAttrAssignment_3_0_2_0_1()); 

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
    // $ANTLR end "rule__Get__Group_3_0_2_0__1__Impl"


    // $ANTLR start "rule__Get__Group_3_0_2_0__2"
    // InternalBrowserAutomation.g:1464:1: rule__Get__Group_3_0_2_0__2 : rule__Get__Group_3_0_2_0__2__Impl rule__Get__Group_3_0_2_0__3 ;
    public final void rule__Get__Group_3_0_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1468:1: ( rule__Get__Group_3_0_2_0__2__Impl rule__Get__Group_3_0_2_0__3 )
            // InternalBrowserAutomation.g:1469:2: rule__Get__Group_3_0_2_0__2__Impl rule__Get__Group_3_0_2_0__3
            {
            pushFollow(FOLLOW_19);
            rule__Get__Group_3_0_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group_3_0_2_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group_3_0_2_0__2"


    // $ANTLR start "rule__Get__Group_3_0_2_0__2__Impl"
    // InternalBrowserAutomation.g:1476:1: rule__Get__Group_3_0_2_0__2__Impl : ( '[' ) ;
    public final void rule__Get__Group_3_0_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1480:1: ( ( '[' ) )
            // InternalBrowserAutomation.g:1481:1: ( '[' )
            {
            // InternalBrowserAutomation.g:1481:1: ( '[' )
            // InternalBrowserAutomation.g:1482:2: '['
            {
             before(grammarAccess.getGetAccess().getLeftSquareBracketKeyword_3_0_2_0_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getLeftSquareBracketKeyword_3_0_2_0_2()); 

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
    // $ANTLR end "rule__Get__Group_3_0_2_0__2__Impl"


    // $ANTLR start "rule__Get__Group_3_0_2_0__3"
    // InternalBrowserAutomation.g:1491:1: rule__Get__Group_3_0_2_0__3 : rule__Get__Group_3_0_2_0__3__Impl rule__Get__Group_3_0_2_0__4 ;
    public final void rule__Get__Group_3_0_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1495:1: ( rule__Get__Group_3_0_2_0__3__Impl rule__Get__Group_3_0_2_0__4 )
            // InternalBrowserAutomation.g:1496:2: rule__Get__Group_3_0_2_0__3__Impl rule__Get__Group_3_0_2_0__4
            {
            pushFollow(FOLLOW_20);
            rule__Get__Group_3_0_2_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group_3_0_2_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group_3_0_2_0__3"


    // $ANTLR start "rule__Get__Group_3_0_2_0__3__Impl"
    // InternalBrowserAutomation.g:1503:1: rule__Get__Group_3_0_2_0__3__Impl : ( ( rule__Get__AttrValAssignment_3_0_2_0_3 ) ) ;
    public final void rule__Get__Group_3_0_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1507:1: ( ( ( rule__Get__AttrValAssignment_3_0_2_0_3 ) ) )
            // InternalBrowserAutomation.g:1508:1: ( ( rule__Get__AttrValAssignment_3_0_2_0_3 ) )
            {
            // InternalBrowserAutomation.g:1508:1: ( ( rule__Get__AttrValAssignment_3_0_2_0_3 ) )
            // InternalBrowserAutomation.g:1509:2: ( rule__Get__AttrValAssignment_3_0_2_0_3 )
            {
             before(grammarAccess.getGetAccess().getAttrValAssignment_3_0_2_0_3()); 
            // InternalBrowserAutomation.g:1510:2: ( rule__Get__AttrValAssignment_3_0_2_0_3 )
            // InternalBrowserAutomation.g:1510:3: rule__Get__AttrValAssignment_3_0_2_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Get__AttrValAssignment_3_0_2_0_3();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getAttrValAssignment_3_0_2_0_3()); 

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
    // $ANTLR end "rule__Get__Group_3_0_2_0__3__Impl"


    // $ANTLR start "rule__Get__Group_3_0_2_0__4"
    // InternalBrowserAutomation.g:1518:1: rule__Get__Group_3_0_2_0__4 : rule__Get__Group_3_0_2_0__4__Impl ;
    public final void rule__Get__Group_3_0_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1522:1: ( rule__Get__Group_3_0_2_0__4__Impl )
            // InternalBrowserAutomation.g:1523:2: rule__Get__Group_3_0_2_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Get__Group_3_0_2_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group_3_0_2_0__4"


    // $ANTLR start "rule__Get__Group_3_0_2_0__4__Impl"
    // InternalBrowserAutomation.g:1529:1: rule__Get__Group_3_0_2_0__4__Impl : ( ']' ) ;
    public final void rule__Get__Group_3_0_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1533:1: ( ( ']' ) )
            // InternalBrowserAutomation.g:1534:1: ( ']' )
            {
            // InternalBrowserAutomation.g:1534:1: ( ']' )
            // InternalBrowserAutomation.g:1535:2: ']'
            {
             before(grammarAccess.getGetAccess().getRightSquareBracketKeyword_3_0_2_0_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getRightSquareBracketKeyword_3_0_2_0_4()); 

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
    // $ANTLR end "rule__Get__Group_3_0_2_0__4__Impl"


    // $ANTLR start "rule__Get__Group_3_0_2_1__0"
    // InternalBrowserAutomation.g:1545:1: rule__Get__Group_3_0_2_1__0 : rule__Get__Group_3_0_2_1__0__Impl rule__Get__Group_3_0_2_1__1 ;
    public final void rule__Get__Group_3_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1549:1: ( rule__Get__Group_3_0_2_1__0__Impl rule__Get__Group_3_0_2_1__1 )
            // InternalBrowserAutomation.g:1550:2: rule__Get__Group_3_0_2_1__0__Impl rule__Get__Group_3_0_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Get__Group_3_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group_3_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group_3_0_2_1__0"


    // $ANTLR start "rule__Get__Group_3_0_2_1__0__Impl"
    // InternalBrowserAutomation.g:1557:1: rule__Get__Group_3_0_2_1__0__Impl : ( 'from' ) ;
    public final void rule__Get__Group_3_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1561:1: ( ( 'from' ) )
            // InternalBrowserAutomation.g:1562:1: ( 'from' )
            {
            // InternalBrowserAutomation.g:1562:1: ( 'from' )
            // InternalBrowserAutomation.g:1563:2: 'from'
            {
             before(grammarAccess.getGetAccess().getFromKeyword_3_0_2_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getFromKeyword_3_0_2_1_0()); 

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
    // $ANTLR end "rule__Get__Group_3_0_2_1__0__Impl"


    // $ANTLR start "rule__Get__Group_3_0_2_1__1"
    // InternalBrowserAutomation.g:1572:1: rule__Get__Group_3_0_2_1__1 : rule__Get__Group_3_0_2_1__1__Impl ;
    public final void rule__Get__Group_3_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1576:1: ( rule__Get__Group_3_0_2_1__1__Impl )
            // InternalBrowserAutomation.g:1577:2: rule__Get__Group_3_0_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Get__Group_3_0_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group_3_0_2_1__1"


    // $ANTLR start "rule__Get__Group_3_0_2_1__1__Impl"
    // InternalBrowserAutomation.g:1583:1: rule__Get__Group_3_0_2_1__1__Impl : ( ( rule__Get__FromAssignment_3_0_2_1_1 ) ) ;
    public final void rule__Get__Group_3_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1587:1: ( ( ( rule__Get__FromAssignment_3_0_2_1_1 ) ) )
            // InternalBrowserAutomation.g:1588:1: ( ( rule__Get__FromAssignment_3_0_2_1_1 ) )
            {
            // InternalBrowserAutomation.g:1588:1: ( ( rule__Get__FromAssignment_3_0_2_1_1 ) )
            // InternalBrowserAutomation.g:1589:2: ( rule__Get__FromAssignment_3_0_2_1_1 )
            {
             before(grammarAccess.getGetAccess().getFromAssignment_3_0_2_1_1()); 
            // InternalBrowserAutomation.g:1590:2: ( rule__Get__FromAssignment_3_0_2_1_1 )
            // InternalBrowserAutomation.g:1590:3: rule__Get__FromAssignment_3_0_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Get__FromAssignment_3_0_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getFromAssignment_3_0_2_1_1()); 

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
    // $ANTLR end "rule__Get__Group_3_0_2_1__1__Impl"


    // $ANTLR start "rule__Order__Group__0"
    // InternalBrowserAutomation.g:1599:1: rule__Order__Group__0 : rule__Order__Group__0__Impl rule__Order__Group__1 ;
    public final void rule__Order__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1603:1: ( rule__Order__Group__0__Impl rule__Order__Group__1 )
            // InternalBrowserAutomation.g:1604:2: rule__Order__Group__0__Impl rule__Order__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Order__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__0"


    // $ANTLR start "rule__Order__Group__0__Impl"
    // InternalBrowserAutomation.g:1611:1: rule__Order__Group__0__Impl : ( 'number' ) ;
    public final void rule__Order__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1615:1: ( ( 'number' ) )
            // InternalBrowserAutomation.g:1616:1: ( 'number' )
            {
            // InternalBrowserAutomation.g:1616:1: ( 'number' )
            // InternalBrowserAutomation.g:1617:2: 'number'
            {
             before(grammarAccess.getOrderAccess().getNumberKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getNumberKeyword_0()); 

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
    // $ANTLR end "rule__Order__Group__0__Impl"


    // $ANTLR start "rule__Order__Group__1"
    // InternalBrowserAutomation.g:1626:1: rule__Order__Group__1 : rule__Order__Group__1__Impl ;
    public final void rule__Order__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1630:1: ( rule__Order__Group__1__Impl )
            // InternalBrowserAutomation.g:1631:2: rule__Order__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Order__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__1"


    // $ANTLR start "rule__Order__Group__1__Impl"
    // InternalBrowserAutomation.g:1637:1: rule__Order__Group__1__Impl : ( ( rule__Order__OrderAssignment_1 ) ) ;
    public final void rule__Order__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1641:1: ( ( ( rule__Order__OrderAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1642:1: ( ( rule__Order__OrderAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1642:1: ( ( rule__Order__OrderAssignment_1 ) )
            // InternalBrowserAutomation.g:1643:2: ( rule__Order__OrderAssignment_1 )
            {
             before(grammarAccess.getOrderAccess().getOrderAssignment_1()); 
            // InternalBrowserAutomation.g:1644:2: ( rule__Order__OrderAssignment_1 )
            // InternalBrowserAutomation.g:1644:3: rule__Order__OrderAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Order__OrderAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getOrderAssignment_1()); 

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
    // $ANTLR end "rule__Order__Group__1__Impl"


    // $ANTLR start "rule__Click__Group__0"
    // InternalBrowserAutomation.g:1653:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1657:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalBrowserAutomation.g:1658:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Click__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0"


    // $ANTLR start "rule__Click__Group__0__Impl"
    // InternalBrowserAutomation.g:1665:1: rule__Click__Group__0__Impl : ( 'click' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1669:1: ( ( 'click' ) )
            // InternalBrowserAutomation.g:1670:1: ( 'click' )
            {
            // InternalBrowserAutomation.g:1670:1: ( 'click' )
            // InternalBrowserAutomation.g:1671:2: 'click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getClickKeyword_0()); 

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
    // $ANTLR end "rule__Click__Group__0__Impl"


    // $ANTLR start "rule__Click__Group__1"
    // InternalBrowserAutomation.g:1680:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1684:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalBrowserAutomation.g:1685:2: rule__Click__Group__1__Impl rule__Click__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Click__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1"


    // $ANTLR start "rule__Click__Group__1__Impl"
    // InternalBrowserAutomation.g:1692:1: rule__Click__Group__1__Impl : ( 'on' ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1696:1: ( ( 'on' ) )
            // InternalBrowserAutomation.g:1697:1: ( 'on' )
            {
            // InternalBrowserAutomation.g:1697:1: ( 'on' )
            // InternalBrowserAutomation.g:1698:2: 'on'
            {
             before(grammarAccess.getClickAccess().getOnKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getOnKeyword_1()); 

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
    // $ANTLR end "rule__Click__Group__1__Impl"


    // $ANTLR start "rule__Click__Group__2"
    // InternalBrowserAutomation.g:1707:1: rule__Click__Group__2 : rule__Click__Group__2__Impl ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1711:1: ( rule__Click__Group__2__Impl )
            // InternalBrowserAutomation.g:1712:2: rule__Click__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__2"


    // $ANTLR start "rule__Click__Group__2__Impl"
    // InternalBrowserAutomation.g:1718:1: rule__Click__Group__2__Impl : ( ( rule__Click__VarRefAssignment_2 ) ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1722:1: ( ( ( rule__Click__VarRefAssignment_2 ) ) )
            // InternalBrowserAutomation.g:1723:1: ( ( rule__Click__VarRefAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:1723:1: ( ( rule__Click__VarRefAssignment_2 ) )
            // InternalBrowserAutomation.g:1724:2: ( rule__Click__VarRefAssignment_2 )
            {
             before(grammarAccess.getClickAccess().getVarRefAssignment_2()); 
            // InternalBrowserAutomation.g:1725:2: ( rule__Click__VarRefAssignment_2 )
            // InternalBrowserAutomation.g:1725:3: rule__Click__VarRefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Click__VarRefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getVarRefAssignment_2()); 

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
    // $ANTLR end "rule__Click__Group__2__Impl"


    // $ANTLR start "rule__Insert__Group__0"
    // InternalBrowserAutomation.g:1734:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1738:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalBrowserAutomation.g:1739:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Insert__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__0"


    // $ANTLR start "rule__Insert__Group__0__Impl"
    // InternalBrowserAutomation.g:1746:1: rule__Insert__Group__0__Impl : ( 'insert' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1750:1: ( ( 'insert' ) )
            // InternalBrowserAutomation.g:1751:1: ( 'insert' )
            {
            // InternalBrowserAutomation.g:1751:1: ( 'insert' )
            // InternalBrowserAutomation.g:1752:2: 'insert'
            {
             before(grammarAccess.getInsertAccess().getInsertKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getInsertKeyword_0()); 

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
    // $ANTLR end "rule__Insert__Group__0__Impl"


    // $ANTLR start "rule__Insert__Group__1"
    // InternalBrowserAutomation.g:1761:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1765:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalBrowserAutomation.g:1766:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Insert__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__1"


    // $ANTLR start "rule__Insert__Group__1__Impl"
    // InternalBrowserAutomation.g:1773:1: rule__Insert__Group__1__Impl : ( ( rule__Insert__Alternatives_1 ) ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1777:1: ( ( ( rule__Insert__Alternatives_1 ) ) )
            // InternalBrowserAutomation.g:1778:1: ( ( rule__Insert__Alternatives_1 ) )
            {
            // InternalBrowserAutomation.g:1778:1: ( ( rule__Insert__Alternatives_1 ) )
            // InternalBrowserAutomation.g:1779:2: ( rule__Insert__Alternatives_1 )
            {
             before(grammarAccess.getInsertAccess().getAlternatives_1()); 
            // InternalBrowserAutomation.g:1780:2: ( rule__Insert__Alternatives_1 )
            // InternalBrowserAutomation.g:1780:3: rule__Insert__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Insert__Group__1__Impl"


    // $ANTLR start "rule__Insert__Group__2"
    // InternalBrowserAutomation.g:1788:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1792:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalBrowserAutomation.g:1793:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Insert__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__2"


    // $ANTLR start "rule__Insert__Group__2__Impl"
    // InternalBrowserAutomation.g:1800:1: rule__Insert__Group__2__Impl : ( 'in' ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1804:1: ( ( 'in' ) )
            // InternalBrowserAutomation.g:1805:1: ( 'in' )
            {
            // InternalBrowserAutomation.g:1805:1: ( 'in' )
            // InternalBrowserAutomation.g:1806:2: 'in'
            {
             before(grammarAccess.getInsertAccess().getInKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getInKeyword_2()); 

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
    // $ANTLR end "rule__Insert__Group__2__Impl"


    // $ANTLR start "rule__Insert__Group__3"
    // InternalBrowserAutomation.g:1815:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1819:1: ( rule__Insert__Group__3__Impl )
            // InternalBrowserAutomation.g:1820:2: rule__Insert__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__3"


    // $ANTLR start "rule__Insert__Group__3__Impl"
    // InternalBrowserAutomation.g:1826:1: rule__Insert__Group__3__Impl : ( ( rule__Insert__Var2Assignment_3 ) ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1830:1: ( ( ( rule__Insert__Var2Assignment_3 ) ) )
            // InternalBrowserAutomation.g:1831:1: ( ( rule__Insert__Var2Assignment_3 ) )
            {
            // InternalBrowserAutomation.g:1831:1: ( ( rule__Insert__Var2Assignment_3 ) )
            // InternalBrowserAutomation.g:1832:2: ( rule__Insert__Var2Assignment_3 )
            {
             before(grammarAccess.getInsertAccess().getVar2Assignment_3()); 
            // InternalBrowserAutomation.g:1833:2: ( rule__Insert__Var2Assignment_3 )
            // InternalBrowserAutomation.g:1833:3: rule__Insert__Var2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Var2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getVar2Assignment_3()); 

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
    // $ANTLR end "rule__Insert__Group__3__Impl"


    // $ANTLR start "rule__Verify__Group__0"
    // InternalBrowserAutomation.g:1842:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1846:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // InternalBrowserAutomation.g:1847:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Verify__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__0"


    // $ANTLR start "rule__Verify__Group__0__Impl"
    // InternalBrowserAutomation.g:1854:1: rule__Verify__Group__0__Impl : ( ( rule__Verify__VarToVerifyAssignment_0 ) ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1858:1: ( ( ( rule__Verify__VarToVerifyAssignment_0 ) ) )
            // InternalBrowserAutomation.g:1859:1: ( ( rule__Verify__VarToVerifyAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:1859:1: ( ( rule__Verify__VarToVerifyAssignment_0 ) )
            // InternalBrowserAutomation.g:1860:2: ( rule__Verify__VarToVerifyAssignment_0 )
            {
             before(grammarAccess.getVerifyAccess().getVarToVerifyAssignment_0()); 
            // InternalBrowserAutomation.g:1861:2: ( rule__Verify__VarToVerifyAssignment_0 )
            // InternalBrowserAutomation.g:1861:3: rule__Verify__VarToVerifyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Verify__VarToVerifyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getVarToVerifyAssignment_0()); 

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
    // $ANTLR end "rule__Verify__Group__0__Impl"


    // $ANTLR start "rule__Verify__Group__1"
    // InternalBrowserAutomation.g:1869:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl rule__Verify__Group__2 ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1873:1: ( rule__Verify__Group__1__Impl rule__Verify__Group__2 )
            // InternalBrowserAutomation.g:1874:2: rule__Verify__Group__1__Impl rule__Verify__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Verify__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__1"


    // $ANTLR start "rule__Verify__Group__1__Impl"
    // InternalBrowserAutomation.g:1881:1: rule__Verify__Group__1__Impl : ( 'is' ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1885:1: ( ( 'is' ) )
            // InternalBrowserAutomation.g:1886:1: ( 'is' )
            {
            // InternalBrowserAutomation.g:1886:1: ( 'is' )
            // InternalBrowserAutomation.g:1887:2: 'is'
            {
             before(grammarAccess.getVerifyAccess().getIsKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__Verify__Group__1__Impl"


    // $ANTLR start "rule__Verify__Group__2"
    // InternalBrowserAutomation.g:1896:1: rule__Verify__Group__2 : rule__Verify__Group__2__Impl rule__Verify__Group__3 ;
    public final void rule__Verify__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1900:1: ( rule__Verify__Group__2__Impl rule__Verify__Group__3 )
            // InternalBrowserAutomation.g:1901:2: rule__Verify__Group__2__Impl rule__Verify__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Verify__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__2"


    // $ANTLR start "rule__Verify__Group__2__Impl"
    // InternalBrowserAutomation.g:1908:1: rule__Verify__Group__2__Impl : ( 'not' ) ;
    public final void rule__Verify__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1912:1: ( ( 'not' ) )
            // InternalBrowserAutomation.g:1913:1: ( 'not' )
            {
            // InternalBrowserAutomation.g:1913:1: ( 'not' )
            // InternalBrowserAutomation.g:1914:2: 'not'
            {
             before(grammarAccess.getVerifyAccess().getNotKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getNotKeyword_2()); 

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
    // $ANTLR end "rule__Verify__Group__2__Impl"


    // $ANTLR start "rule__Verify__Group__3"
    // InternalBrowserAutomation.g:1923:1: rule__Verify__Group__3 : rule__Verify__Group__3__Impl ;
    public final void rule__Verify__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1927:1: ( rule__Verify__Group__3__Impl )
            // InternalBrowserAutomation.g:1928:2: rule__Verify__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__3"


    // $ANTLR start "rule__Verify__Group__3__Impl"
    // InternalBrowserAutomation.g:1934:1: rule__Verify__Group__3__Impl : ( 'null' ) ;
    public final void rule__Verify__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1938:1: ( ( 'null' ) )
            // InternalBrowserAutomation.g:1939:1: ( 'null' )
            {
            // InternalBrowserAutomation.g:1939:1: ( 'null' )
            // InternalBrowserAutomation.g:1940:2: 'null'
            {
             before(grammarAccess.getVerifyAccess().getNullKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getNullKeyword_3()); 

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
    // $ANTLR end "rule__Verify__Group__3__Impl"


    // $ANTLR start "rule__Check__Group__0"
    // InternalBrowserAutomation.g:1950:1: rule__Check__Group__0 : rule__Check__Group__0__Impl rule__Check__Group__1 ;
    public final void rule__Check__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1954:1: ( rule__Check__Group__0__Impl rule__Check__Group__1 )
            // InternalBrowserAutomation.g:1955:2: rule__Check__Group__0__Impl rule__Check__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Check__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__0"


    // $ANTLR start "rule__Check__Group__0__Impl"
    // InternalBrowserAutomation.g:1962:1: rule__Check__Group__0__Impl : ( 'check' ) ;
    public final void rule__Check__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1966:1: ( ( 'check' ) )
            // InternalBrowserAutomation.g:1967:1: ( 'check' )
            {
            // InternalBrowserAutomation.g:1967:1: ( 'check' )
            // InternalBrowserAutomation.g:1968:2: 'check'
            {
             before(grammarAccess.getCheckAccess().getCheckKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getCheckKeyword_0()); 

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
    // $ANTLR end "rule__Check__Group__0__Impl"


    // $ANTLR start "rule__Check__Group__1"
    // InternalBrowserAutomation.g:1977:1: rule__Check__Group__1 : rule__Check__Group__1__Impl ;
    public final void rule__Check__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1981:1: ( rule__Check__Group__1__Impl )
            // InternalBrowserAutomation.g:1982:2: rule__Check__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__1"


    // $ANTLR start "rule__Check__Group__1__Impl"
    // InternalBrowserAutomation.g:1988:1: rule__Check__Group__1__Impl : ( ( rule__Check__VarCheckAssignment_1 ) ) ;
    public final void rule__Check__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1992:1: ( ( ( rule__Check__VarCheckAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1993:1: ( ( rule__Check__VarCheckAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1993:1: ( ( rule__Check__VarCheckAssignment_1 ) )
            // InternalBrowserAutomation.g:1994:2: ( rule__Check__VarCheckAssignment_1 )
            {
             before(grammarAccess.getCheckAccess().getVarCheckAssignment_1()); 
            // InternalBrowserAutomation.g:1995:2: ( rule__Check__VarCheckAssignment_1 )
            // InternalBrowserAutomation.g:1995:3: rule__Check__VarCheckAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Check__VarCheckAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getVarCheckAssignment_1()); 

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
    // $ANTLR end "rule__Check__Group__1__Impl"


    // $ANTLR start "rule__Choose__Group__0"
    // InternalBrowserAutomation.g:2004:1: rule__Choose__Group__0 : rule__Choose__Group__0__Impl rule__Choose__Group__1 ;
    public final void rule__Choose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2008:1: ( rule__Choose__Group__0__Impl rule__Choose__Group__1 )
            // InternalBrowserAutomation.g:2009:2: rule__Choose__Group__0__Impl rule__Choose__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Choose__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choose__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__Group__0"


    // $ANTLR start "rule__Choose__Group__0__Impl"
    // InternalBrowserAutomation.g:2016:1: rule__Choose__Group__0__Impl : ( 'choose' ) ;
    public final void rule__Choose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2020:1: ( ( 'choose' ) )
            // InternalBrowserAutomation.g:2021:1: ( 'choose' )
            {
            // InternalBrowserAutomation.g:2021:1: ( 'choose' )
            // InternalBrowserAutomation.g:2022:2: 'choose'
            {
             before(grammarAccess.getChooseAccess().getChooseKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getChooseAccess().getChooseKeyword_0()); 

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
    // $ANTLR end "rule__Choose__Group__0__Impl"


    // $ANTLR start "rule__Choose__Group__1"
    // InternalBrowserAutomation.g:2031:1: rule__Choose__Group__1 : rule__Choose__Group__1__Impl rule__Choose__Group__2 ;
    public final void rule__Choose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2035:1: ( rule__Choose__Group__1__Impl rule__Choose__Group__2 )
            // InternalBrowserAutomation.g:2036:2: rule__Choose__Group__1__Impl rule__Choose__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Choose__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choose__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__Group__1"


    // $ANTLR start "rule__Choose__Group__1__Impl"
    // InternalBrowserAutomation.g:2043:1: rule__Choose__Group__1__Impl : ( ( rule__Choose__ValueAssignment_1 ) ) ;
    public final void rule__Choose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2047:1: ( ( ( rule__Choose__ValueAssignment_1 ) ) )
            // InternalBrowserAutomation.g:2048:1: ( ( rule__Choose__ValueAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:2048:1: ( ( rule__Choose__ValueAssignment_1 ) )
            // InternalBrowserAutomation.g:2049:2: ( rule__Choose__ValueAssignment_1 )
            {
             before(grammarAccess.getChooseAccess().getValueAssignment_1()); 
            // InternalBrowserAutomation.g:2050:2: ( rule__Choose__ValueAssignment_1 )
            // InternalBrowserAutomation.g:2050:3: rule__Choose__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Choose__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChooseAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Choose__Group__1__Impl"


    // $ANTLR start "rule__Choose__Group__2"
    // InternalBrowserAutomation.g:2058:1: rule__Choose__Group__2 : rule__Choose__Group__2__Impl rule__Choose__Group__3 ;
    public final void rule__Choose__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2062:1: ( rule__Choose__Group__2__Impl rule__Choose__Group__3 )
            // InternalBrowserAutomation.g:2063:2: rule__Choose__Group__2__Impl rule__Choose__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Choose__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choose__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__Group__2"


    // $ANTLR start "rule__Choose__Group__2__Impl"
    // InternalBrowserAutomation.g:2070:1: rule__Choose__Group__2__Impl : ( 'in' ) ;
    public final void rule__Choose__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2074:1: ( ( 'in' ) )
            // InternalBrowserAutomation.g:2075:1: ( 'in' )
            {
            // InternalBrowserAutomation.g:2075:1: ( 'in' )
            // InternalBrowserAutomation.g:2076:2: 'in'
            {
             before(grammarAccess.getChooseAccess().getInKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getChooseAccess().getInKeyword_2()); 

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
    // $ANTLR end "rule__Choose__Group__2__Impl"


    // $ANTLR start "rule__Choose__Group__3"
    // InternalBrowserAutomation.g:2085:1: rule__Choose__Group__3 : rule__Choose__Group__3__Impl ;
    public final void rule__Choose__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2089:1: ( rule__Choose__Group__3__Impl )
            // InternalBrowserAutomation.g:2090:2: rule__Choose__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choose__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__Group__3"


    // $ANTLR start "rule__Choose__Group__3__Impl"
    // InternalBrowserAutomation.g:2096:1: rule__Choose__Group__3__Impl : ( ( rule__Choose__VarChooseAssignment_3 ) ) ;
    public final void rule__Choose__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2100:1: ( ( ( rule__Choose__VarChooseAssignment_3 ) ) )
            // InternalBrowserAutomation.g:2101:1: ( ( rule__Choose__VarChooseAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:2101:1: ( ( rule__Choose__VarChooseAssignment_3 ) )
            // InternalBrowserAutomation.g:2102:2: ( rule__Choose__VarChooseAssignment_3 )
            {
             before(grammarAccess.getChooseAccess().getVarChooseAssignment_3()); 
            // InternalBrowserAutomation.g:2103:2: ( rule__Choose__VarChooseAssignment_3 )
            // InternalBrowserAutomation.g:2103:3: rule__Choose__VarChooseAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Choose__VarChooseAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChooseAccess().getVarChooseAssignment_3()); 

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
    // $ANTLR end "rule__Choose__Group__3__Impl"


    // $ANTLR start "rule__Contains__Group__0"
    // InternalBrowserAutomation.g:2112:1: rule__Contains__Group__0 : rule__Contains__Group__0__Impl rule__Contains__Group__1 ;
    public final void rule__Contains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2116:1: ( rule__Contains__Group__0__Impl rule__Contains__Group__1 )
            // InternalBrowserAutomation.g:2117:2: rule__Contains__Group__0__Impl rule__Contains__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Contains__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contains__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__Group__0"


    // $ANTLR start "rule__Contains__Group__0__Impl"
    // InternalBrowserAutomation.g:2124:1: rule__Contains__Group__0__Impl : ( ( rule__Contains__VarContainsAssignment_0 ) ) ;
    public final void rule__Contains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2128:1: ( ( ( rule__Contains__VarContainsAssignment_0 ) ) )
            // InternalBrowserAutomation.g:2129:1: ( ( rule__Contains__VarContainsAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:2129:1: ( ( rule__Contains__VarContainsAssignment_0 ) )
            // InternalBrowserAutomation.g:2130:2: ( rule__Contains__VarContainsAssignment_0 )
            {
             before(grammarAccess.getContainsAccess().getVarContainsAssignment_0()); 
            // InternalBrowserAutomation.g:2131:2: ( rule__Contains__VarContainsAssignment_0 )
            // InternalBrowserAutomation.g:2131:3: rule__Contains__VarContainsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Contains__VarContainsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContainsAccess().getVarContainsAssignment_0()); 

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
    // $ANTLR end "rule__Contains__Group__0__Impl"


    // $ANTLR start "rule__Contains__Group__1"
    // InternalBrowserAutomation.g:2139:1: rule__Contains__Group__1 : rule__Contains__Group__1__Impl rule__Contains__Group__2 ;
    public final void rule__Contains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2143:1: ( rule__Contains__Group__1__Impl rule__Contains__Group__2 )
            // InternalBrowserAutomation.g:2144:2: rule__Contains__Group__1__Impl rule__Contains__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Contains__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contains__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__Group__1"


    // $ANTLR start "rule__Contains__Group__1__Impl"
    // InternalBrowserAutomation.g:2151:1: rule__Contains__Group__1__Impl : ( 'contains' ) ;
    public final void rule__Contains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2155:1: ( ( 'contains' ) )
            // InternalBrowserAutomation.g:2156:1: ( 'contains' )
            {
            // InternalBrowserAutomation.g:2156:1: ( 'contains' )
            // InternalBrowserAutomation.g:2157:2: 'contains'
            {
             before(grammarAccess.getContainsAccess().getContainsKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getContainsAccess().getContainsKeyword_1()); 

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
    // $ANTLR end "rule__Contains__Group__1__Impl"


    // $ANTLR start "rule__Contains__Group__2"
    // InternalBrowserAutomation.g:2166:1: rule__Contains__Group__2 : rule__Contains__Group__2__Impl ;
    public final void rule__Contains__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2170:1: ( rule__Contains__Group__2__Impl )
            // InternalBrowserAutomation.g:2171:2: rule__Contains__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contains__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__Group__2"


    // $ANTLR start "rule__Contains__Group__2__Impl"
    // InternalBrowserAutomation.g:2177:1: rule__Contains__Group__2__Impl : ( ( rule__Contains__VarContainedAssignment_2 ) ) ;
    public final void rule__Contains__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2181:1: ( ( ( rule__Contains__VarContainedAssignment_2 ) ) )
            // InternalBrowserAutomation.g:2182:1: ( ( rule__Contains__VarContainedAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:2182:1: ( ( rule__Contains__VarContainedAssignment_2 ) )
            // InternalBrowserAutomation.g:2183:2: ( rule__Contains__VarContainedAssignment_2 )
            {
             before(grammarAccess.getContainsAccess().getVarContainedAssignment_2()); 
            // InternalBrowserAutomation.g:2184:2: ( rule__Contains__VarContainedAssignment_2 )
            // InternalBrowserAutomation.g:2184:3: rule__Contains__VarContainedAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Contains__VarContainedAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContainsAccess().getVarContainedAssignment_2()); 

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
    // $ANTLR end "rule__Contains__Group__2__Impl"


    // $ANTLR start "rule__BrowserAutomation__TestNameAssignment_1"
    // InternalBrowserAutomation.g:2193:1: rule__BrowserAutomation__TestNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BrowserAutomation__TestNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2197:1: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:2198:2: ( RULE_ID )
            {
            // InternalBrowserAutomation.g:2198:2: ( RULE_ID )
            // InternalBrowserAutomation.g:2199:3: RULE_ID
            {
             before(grammarAccess.getBrowserAutomationAccess().getTestNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBrowserAutomationAccess().getTestNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BrowserAutomation__TestNameAssignment_1"


    // $ANTLR start "rule__BrowserAutomation__WebBrowserAssignment_4"
    // InternalBrowserAutomation.g:2208:1: rule__BrowserAutomation__WebBrowserAssignment_4 : ( ruleWebBrowser ) ;
    public final void rule__BrowserAutomation__WebBrowserAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2212:1: ( ( ruleWebBrowser ) )
            // InternalBrowserAutomation.g:2213:2: ( ruleWebBrowser )
            {
            // InternalBrowserAutomation.g:2213:2: ( ruleWebBrowser )
            // InternalBrowserAutomation.g:2214:3: ruleWebBrowser
            {
             before(grammarAccess.getBrowserAutomationAccess().getWebBrowserWebBrowserParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleWebBrowser();

            state._fsp--;

             after(grammarAccess.getBrowserAutomationAccess().getWebBrowserWebBrowserParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__BrowserAutomation__WebBrowserAssignment_4"


    // $ANTLR start "rule__BrowserAutomation__StatementsAssignment_5"
    // InternalBrowserAutomation.g:2223:1: rule__BrowserAutomation__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__BrowserAutomation__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2227:1: ( ( ruleStatement ) )
            // InternalBrowserAutomation.g:2228:2: ( ruleStatement )
            {
            // InternalBrowserAutomation.g:2228:2: ( ruleStatement )
            // InternalBrowserAutomation.g:2229:3: ruleStatement
            {
             before(grammarAccess.getBrowserAutomationAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBrowserAutomationAccess().getStatementsStatementParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__BrowserAutomation__StatementsAssignment_5"


    // $ANTLR start "rule__DoAction__GetAssignment_0"
    // InternalBrowserAutomation.g:2238:1: rule__DoAction__GetAssignment_0 : ( ruleGet ) ;
    public final void rule__DoAction__GetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2242:1: ( ( ruleGet ) )
            // InternalBrowserAutomation.g:2243:2: ( ruleGet )
            {
            // InternalBrowserAutomation.g:2243:2: ( ruleGet )
            // InternalBrowserAutomation.g:2244:3: ruleGet
            {
             before(grammarAccess.getDoActionAccess().getGetGetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGet();

            state._fsp--;

             after(grammarAccess.getDoActionAccess().getGetGetParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DoAction__GetAssignment_0"


    // $ANTLR start "rule__DoAction__ActionAssignment_1"
    // InternalBrowserAutomation.g:2253:1: rule__DoAction__ActionAssignment_1 : ( ruleAction ) ;
    public final void rule__DoAction__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2257:1: ( ( ruleAction ) )
            // InternalBrowserAutomation.g:2258:2: ( ruleAction )
            {
            // InternalBrowserAutomation.g:2258:2: ( ruleAction )
            // InternalBrowserAutomation.g:2259:3: ruleAction
            {
             before(grammarAccess.getDoActionAccess().getActionActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getDoActionAccess().getActionActionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DoAction__ActionAssignment_1"


    // $ANTLR start "rule__GoTo__UrlAssignment_2"
    // InternalBrowserAutomation.g:2268:1: rule__GoTo__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GoTo__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2272:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2273:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2273:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2274:3: RULE_STRING
            {
             before(grammarAccess.getGoToAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getUrlSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__GoTo__UrlAssignment_2"


    // $ANTLR start "rule__Get__VarRefAssignment_0"
    // InternalBrowserAutomation.g:2283:1: rule__Get__VarRefAssignment_0 : ( ruleVariable ) ;
    public final void rule__Get__VarRefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2287:1: ( ( ruleVariable ) )
            // InternalBrowserAutomation.g:2288:2: ( ruleVariable )
            {
            // InternalBrowserAutomation.g:2288:2: ( ruleVariable )
            // InternalBrowserAutomation.g:2289:3: ruleVariable
            {
             before(grammarAccess.getGetAccess().getVarRefVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getGetAccess().getVarRefVariableParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Get__VarRefAssignment_0"


    // $ANTLR start "rule__Get__ElementAssignment_3_0_0"
    // InternalBrowserAutomation.g:2298:1: rule__Get__ElementAssignment_3_0_0 : ( ruleElement ) ;
    public final void rule__Get__ElementAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2302:1: ( ( ruleElement ) )
            // InternalBrowserAutomation.g:2303:2: ( ruleElement )
            {
            // InternalBrowserAutomation.g:2303:2: ( ruleElement )
            // InternalBrowserAutomation.g:2304:3: ruleElement
            {
             before(grammarAccess.getGetAccess().getElementElementParserRuleCall_3_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getGetAccess().getElementElementParserRuleCall_3_0_0_0()); 

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
    // $ANTLR end "rule__Get__ElementAssignment_3_0_0"


    // $ANTLR start "rule__Get__OrderAssignment_3_0_1"
    // InternalBrowserAutomation.g:2313:1: rule__Get__OrderAssignment_3_0_1 : ( ruleOrder ) ;
    public final void rule__Get__OrderAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2317:1: ( ( ruleOrder ) )
            // InternalBrowserAutomation.g:2318:2: ( ruleOrder )
            {
            // InternalBrowserAutomation.g:2318:2: ( ruleOrder )
            // InternalBrowserAutomation.g:2319:3: ruleOrder
            {
             before(grammarAccess.getGetAccess().getOrderOrderParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getGetAccess().getOrderOrderParserRuleCall_3_0_1_0()); 

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
    // $ANTLR end "rule__Get__OrderAssignment_3_0_1"


    // $ANTLR start "rule__Get__AttrAssignment_3_0_2_0_1"
    // InternalBrowserAutomation.g:2328:1: rule__Get__AttrAssignment_3_0_2_0_1 : ( ruleAttribut ) ;
    public final void rule__Get__AttrAssignment_3_0_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2332:1: ( ( ruleAttribut ) )
            // InternalBrowserAutomation.g:2333:2: ( ruleAttribut )
            {
            // InternalBrowserAutomation.g:2333:2: ( ruleAttribut )
            // InternalBrowserAutomation.g:2334:3: ruleAttribut
            {
             before(grammarAccess.getGetAccess().getAttrAttributParserRuleCall_3_0_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getGetAccess().getAttrAttributParserRuleCall_3_0_2_0_1_0()); 

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
    // $ANTLR end "rule__Get__AttrAssignment_3_0_2_0_1"


    // $ANTLR start "rule__Get__AttrValAssignment_3_0_2_0_3"
    // InternalBrowserAutomation.g:2343:1: rule__Get__AttrValAssignment_3_0_2_0_3 : ( ruleAttributeValue ) ;
    public final void rule__Get__AttrValAssignment_3_0_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2347:1: ( ( ruleAttributeValue ) )
            // InternalBrowserAutomation.g:2348:2: ( ruleAttributeValue )
            {
            // InternalBrowserAutomation.g:2348:2: ( ruleAttributeValue )
            // InternalBrowserAutomation.g:2349:3: ruleAttributeValue
            {
             before(grammarAccess.getGetAccess().getAttrValAttributeValueParserRuleCall_3_0_2_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getGetAccess().getAttrValAttributeValueParserRuleCall_3_0_2_0_3_0()); 

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
    // $ANTLR end "rule__Get__AttrValAssignment_3_0_2_0_3"


    // $ANTLR start "rule__Get__FromAssignment_3_0_2_1_1"
    // InternalBrowserAutomation.g:2358:1: rule__Get__FromAssignment_3_0_2_1_1 : ( ruleVarReference ) ;
    public final void rule__Get__FromAssignment_3_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2362:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2363:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2363:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2364:3: ruleVarReference
            {
             before(grammarAccess.getGetAccess().getFromVarReferenceParserRuleCall_3_0_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getGetAccess().getFromVarReferenceParserRuleCall_3_0_2_1_1_0()); 

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
    // $ANTLR end "rule__Get__FromAssignment_3_0_2_1_1"


    // $ANTLR start "rule__Get__PageTitleAssignment_3_1"
    // InternalBrowserAutomation.g:2373:1: rule__Get__PageTitleAssignment_3_1 : ( ( 'pageTitle' ) ) ;
    public final void rule__Get__PageTitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2377:1: ( ( ( 'pageTitle' ) ) )
            // InternalBrowserAutomation.g:2378:2: ( ( 'pageTitle' ) )
            {
            // InternalBrowserAutomation.g:2378:2: ( ( 'pageTitle' ) )
            // InternalBrowserAutomation.g:2379:3: ( 'pageTitle' )
            {
             before(grammarAccess.getGetAccess().getPageTitlePageTitleKeyword_3_1_0()); 
            // InternalBrowserAutomation.g:2380:3: ( 'pageTitle' )
            // InternalBrowserAutomation.g:2381:4: 'pageTitle'
            {
             before(grammarAccess.getGetAccess().getPageTitlePageTitleKeyword_3_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getPageTitlePageTitleKeyword_3_1_0()); 

            }

             after(grammarAccess.getGetAccess().getPageTitlePageTitleKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Get__PageTitleAssignment_3_1"


    // $ANTLR start "rule__AttributeValue__StringValAssignment_0"
    // InternalBrowserAutomation.g:2392:1: rule__AttributeValue__StringValAssignment_0 : ( RULE_STRING ) ;
    public final void rule__AttributeValue__StringValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2396:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2397:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2397:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2398:3: RULE_STRING
            {
             before(grammarAccess.getAttributeValueAccess().getStringValSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeValueAccess().getStringValSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__AttributeValue__StringValAssignment_0"


    // $ANTLR start "rule__AttributeValue__VarRefValAssignment_1"
    // InternalBrowserAutomation.g:2407:1: rule__AttributeValue__VarRefValAssignment_1 : ( ruleVarReference ) ;
    public final void rule__AttributeValue__VarRefValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2411:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2412:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2412:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2413:3: ruleVarReference
            {
             before(grammarAccess.getAttributeValueAccess().getVarRefValVarReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getAttributeValueAccess().getVarRefValVarReferenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AttributeValue__VarRefValAssignment_1"


    // $ANTLR start "rule__Order__OrderAssignment_1"
    // InternalBrowserAutomation.g:2422:1: rule__Order__OrderAssignment_1 : ( RULE_INT ) ;
    public final void rule__Order__OrderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2426:1: ( ( RULE_INT ) )
            // InternalBrowserAutomation.g:2427:2: ( RULE_INT )
            {
            // InternalBrowserAutomation.g:2427:2: ( RULE_INT )
            // InternalBrowserAutomation.g:2428:3: RULE_INT
            {
             before(grammarAccess.getOrderAccess().getOrderINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getOrderINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Order__OrderAssignment_1"


    // $ANTLR start "rule__Variable__NameAssignment"
    // InternalBrowserAutomation.g:2437:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2441:1: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:2442:2: ( RULE_ID )
            {
            // InternalBrowserAutomation.g:2442:2: ( RULE_ID )
            // InternalBrowserAutomation.g:2443:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment"


    // $ANTLR start "rule__VarReference__VarRefAssignment"
    // InternalBrowserAutomation.g:2452:1: rule__VarReference__VarRefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VarReference__VarRefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2456:1: ( ( ( RULE_ID ) ) )
            // InternalBrowserAutomation.g:2457:2: ( ( RULE_ID ) )
            {
            // InternalBrowserAutomation.g:2457:2: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:2458:3: ( RULE_ID )
            {
             before(grammarAccess.getVarReferenceAccess().getVarRefVariableCrossReference_0()); 
            // InternalBrowserAutomation.g:2459:3: ( RULE_ID )
            // InternalBrowserAutomation.g:2460:4: RULE_ID
            {
             before(grammarAccess.getVarReferenceAccess().getVarRefVariableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarReferenceAccess().getVarRefVariableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVarReferenceAccess().getVarRefVariableCrossReference_0()); 

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
    // $ANTLR end "rule__VarReference__VarRefAssignment"


    // $ANTLR start "rule__Click__VarRefAssignment_2"
    // InternalBrowserAutomation.g:2471:1: rule__Click__VarRefAssignment_2 : ( ruleVarReference ) ;
    public final void rule__Click__VarRefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2475:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2476:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2476:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2477:3: ruleVarReference
            {
             before(grammarAccess.getClickAccess().getVarRefVarReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getClickAccess().getVarRefVarReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Click__VarRefAssignment_2"


    // $ANTLR start "rule__Insert__AttrValAssignment_1_0"
    // InternalBrowserAutomation.g:2486:1: rule__Insert__AttrValAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__Insert__AttrValAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2490:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2491:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2491:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2492:3: RULE_STRING
            {
             before(grammarAccess.getInsertAccess().getAttrValSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getAttrValSTRINGTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Insert__AttrValAssignment_1_0"


    // $ANTLR start "rule__Insert__VarRefAssignment_1_1"
    // InternalBrowserAutomation.g:2501:1: rule__Insert__VarRefAssignment_1_1 : ( ruleVarReference ) ;
    public final void rule__Insert__VarRefAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2505:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2506:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2506:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2507:3: ruleVarReference
            {
             before(grammarAccess.getInsertAccess().getVarRefVarReferenceParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getVarRefVarReferenceParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Insert__VarRefAssignment_1_1"


    // $ANTLR start "rule__Insert__Var2Assignment_3"
    // InternalBrowserAutomation.g:2516:1: rule__Insert__Var2Assignment_3 : ( ruleVarReference ) ;
    public final void rule__Insert__Var2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2520:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2521:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2521:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2522:3: ruleVarReference
            {
             before(grammarAccess.getInsertAccess().getVar2VarReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getVar2VarReferenceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Insert__Var2Assignment_3"


    // $ANTLR start "rule__Verify__VarToVerifyAssignment_0"
    // InternalBrowserAutomation.g:2531:1: rule__Verify__VarToVerifyAssignment_0 : ( ruleVarReference ) ;
    public final void rule__Verify__VarToVerifyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2535:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2536:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2536:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2537:3: ruleVarReference
            {
             before(grammarAccess.getVerifyAccess().getVarToVerifyVarReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getVarToVerifyVarReferenceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Verify__VarToVerifyAssignment_0"


    // $ANTLR start "rule__Check__VarCheckAssignment_1"
    // InternalBrowserAutomation.g:2546:1: rule__Check__VarCheckAssignment_1 : ( ruleVarReference ) ;
    public final void rule__Check__VarCheckAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2550:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2551:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2551:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2552:3: ruleVarReference
            {
             before(grammarAccess.getCheckAccess().getVarCheckVarReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getCheckAccess().getVarCheckVarReferenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Check__VarCheckAssignment_1"


    // $ANTLR start "rule__Choose__ValueAssignment_1"
    // InternalBrowserAutomation.g:2561:1: rule__Choose__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Choose__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2565:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2566:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2566:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2567:3: RULE_STRING
            {
             before(grammarAccess.getChooseAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChooseAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Choose__ValueAssignment_1"


    // $ANTLR start "rule__Choose__VarChooseAssignment_3"
    // InternalBrowserAutomation.g:2576:1: rule__Choose__VarChooseAssignment_3 : ( ruleVarReference ) ;
    public final void rule__Choose__VarChooseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2580:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2581:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2581:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2582:3: ruleVarReference
            {
             before(grammarAccess.getChooseAccess().getVarChooseVarReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getChooseAccess().getVarChooseVarReferenceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Choose__VarChooseAssignment_3"


    // $ANTLR start "rule__Contains__VarContainsAssignment_0"
    // InternalBrowserAutomation.g:2591:1: rule__Contains__VarContainsAssignment_0 : ( ruleVarReference ) ;
    public final void rule__Contains__VarContainsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2595:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2596:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2596:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2597:3: ruleVarReference
            {
             before(grammarAccess.getContainsAccess().getVarContainsVarReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getContainsAccess().getVarContainsVarReferenceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Contains__VarContainsAssignment_0"


    // $ANTLR start "rule__Contains__VarContainedAssignment_2"
    // InternalBrowserAutomation.g:2606:1: rule__Contains__VarContainedAssignment_2 : ( ruleVarReference ) ;
    public final void rule__Contains__VarContainedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2610:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2611:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2611:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2612:3: ruleVarReference
            {
             before(grammarAccess.getContainsAccess().getVarContainedVarReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getContainsAccess().getVarContainedVarReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Contains__VarContainedAssignment_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\40\uffff";
    static final String dfa_2s = "\16\uffff\1\24\14\uffff\1\24\3\uffff\1\24";
    static final String dfa_3s = "\1\4\1\43\2\uffff\1\44\1\17\10\45\1\4\1\6\1\27\1\4\1\uffff\1\43\1\uffff\1\45\5\46\2\4\2\47\1\4";
    static final String dfa_4s = "\1\41\1\43\2\uffff\1\44\1\64\10\51\1\62\1\6\1\33\1\4\1\uffff\1\63\1\uffff\1\50\5\46\1\62\1\5\2\47\1\62";
    static final String dfa_5s = "\2\uffff\1\3\1\4\16\uffff\1\1\1\uffff\1\2\13\uffff";
    static final String dfa_6s = "\40\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\32\uffff\1\3\1\uffff\1\2",
            "\1\4",
            "",
            "",
            "\1\5",
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\35\uffff\1\16",
            "\1\20\2\uffff\1\21\1\17",
            "\1\20\2\uffff\1\21\1\17",
            "\1\20\2\uffff\1\21\1\17",
            "\1\20\2\uffff\1\21\1\17",
            "\1\20\2\uffff\1\21\1\17",
            "\1\20\2\uffff\1\21\1\17",
            "\1\20\2\uffff\1\21\1\17",
            "\1\20\2\uffff\1\21\1\17",
            "\1\23\31\uffff\2\24\1\uffff\1\24\10\uffff\1\22\1\uffff\1\22\4\uffff\2\22",
            "\1\25",
            "\1\26\1\27\1\30\1\31\1\32",
            "\1\33",
            "",
            "\1\24\12\uffff\1\22\4\uffff\1\22",
            "",
            "\1\20\2\uffff\1\21",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\23\31\uffff\2\24\1\uffff\1\24\10\uffff\1\22\1\uffff\1\22\4\uffff\2\22",
            "\1\36\1\35",
            "\1\37",
            "\1\37",
            "\1\23\31\uffff\2\24\1\uffff\1\24\10\uffff\1\22\1\uffff\1\22\4\uffff\2\22"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "585:1: rule__Statement__Alternatives : ( ( ruleDoAction ) | ( ruleGet ) | ( ruleUncheckAll ) | ( ruleGoTo ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000002C0000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000280000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0006140000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00100000007F8000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000032000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000000L});

}