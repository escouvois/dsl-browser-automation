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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mozilla'", "'chrome'", "'safari'", "'internetExplorer'", "'pageTitle'", "'link'", "'input'", "'button'", "'checkbox'", "'combobox'", "'image'", "'text'", "'title'", "'class'", "'value'", "'alt'", "'name'", "'href'", "'open'", "'go'", "'to'", "'uncheck'", "'all'", "'='", "'get'", "'by'", "'['", "']'", "'from'", "'number'", "'click'", "'on'", "'insert'", "'in'", "'is'", "'not'", "'null'", "'check'", "'choose'", "'contains'"
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


    // $ANTLR start "entryRuleOrder"
    // InternalBrowserAutomation.g:253:1: entryRuleOrder : ruleOrder EOF ;
    public final void entryRuleOrder() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:254:1: ( ruleOrder EOF )
            // InternalBrowserAutomation.g:255:1: ruleOrder EOF
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
    // InternalBrowserAutomation.g:262:1: ruleOrder : ( ( rule__Order__Group__0 ) ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:266:2: ( ( ( rule__Order__Group__0 ) ) )
            // InternalBrowserAutomation.g:267:2: ( ( rule__Order__Group__0 ) )
            {
            // InternalBrowserAutomation.g:267:2: ( ( rule__Order__Group__0 ) )
            // InternalBrowserAutomation.g:268:3: ( rule__Order__Group__0 )
            {
             before(grammarAccess.getOrderAccess().getGroup()); 
            // InternalBrowserAutomation.g:269:3: ( rule__Order__Group__0 )
            // InternalBrowserAutomation.g:269:4: rule__Order__Group__0
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
    // InternalBrowserAutomation.g:278:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:279:1: ( ruleElement EOF )
            // InternalBrowserAutomation.g:280:1: ruleElement EOF
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
    // InternalBrowserAutomation.g:287:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:291:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalBrowserAutomation.g:292:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalBrowserAutomation.g:292:2: ( ( rule__Element__Alternatives ) )
            // InternalBrowserAutomation.g:293:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:294:3: ( rule__Element__Alternatives )
            // InternalBrowserAutomation.g:294:4: rule__Element__Alternatives
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
    // InternalBrowserAutomation.g:303:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:304:1: ( ruleAttribut EOF )
            // InternalBrowserAutomation.g:305:1: ruleAttribut EOF
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
    // InternalBrowserAutomation.g:312:1: ruleAttribut : ( ( rule__Attribut__Alternatives ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:316:2: ( ( ( rule__Attribut__Alternatives ) ) )
            // InternalBrowserAutomation.g:317:2: ( ( rule__Attribut__Alternatives ) )
            {
            // InternalBrowserAutomation.g:317:2: ( ( rule__Attribut__Alternatives ) )
            // InternalBrowserAutomation.g:318:3: ( rule__Attribut__Alternatives )
            {
             before(grammarAccess.getAttributAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:319:3: ( rule__Attribut__Alternatives )
            // InternalBrowserAutomation.g:319:4: rule__Attribut__Alternatives
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
    // InternalBrowserAutomation.g:328:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:329:1: ( ruleVariable EOF )
            // InternalBrowserAutomation.g:330:1: ruleVariable EOF
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
    // InternalBrowserAutomation.g:337:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:341:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalBrowserAutomation.g:342:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalBrowserAutomation.g:342:2: ( ( rule__Variable__NameAssignment ) )
            // InternalBrowserAutomation.g:343:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalBrowserAutomation.g:344:3: ( rule__Variable__NameAssignment )
            // InternalBrowserAutomation.g:344:4: rule__Variable__NameAssignment
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
    // InternalBrowserAutomation.g:353:1: entryRuleVarReference : ruleVarReference EOF ;
    public final void entryRuleVarReference() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:354:1: ( ruleVarReference EOF )
            // InternalBrowserAutomation.g:355:1: ruleVarReference EOF
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
    // InternalBrowserAutomation.g:362:1: ruleVarReference : ( ( rule__VarReference__VarAssignment ) ) ;
    public final void ruleVarReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:366:2: ( ( ( rule__VarReference__VarAssignment ) ) )
            // InternalBrowserAutomation.g:367:2: ( ( rule__VarReference__VarAssignment ) )
            {
            // InternalBrowserAutomation.g:367:2: ( ( rule__VarReference__VarAssignment ) )
            // InternalBrowserAutomation.g:368:3: ( rule__VarReference__VarAssignment )
            {
             before(grammarAccess.getVarReferenceAccess().getVarAssignment()); 
            // InternalBrowserAutomation.g:369:3: ( rule__VarReference__VarAssignment )
            // InternalBrowserAutomation.g:369:4: rule__VarReference__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VarReference__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVarReferenceAccess().getVarAssignment()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:378:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:379:1: ( ruleClick EOF )
            // InternalBrowserAutomation.g:380:1: ruleClick EOF
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
    // InternalBrowserAutomation.g:387:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:391:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalBrowserAutomation.g:392:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalBrowserAutomation.g:392:2: ( ( rule__Click__Group__0 ) )
            // InternalBrowserAutomation.g:393:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalBrowserAutomation.g:394:3: ( rule__Click__Group__0 )
            // InternalBrowserAutomation.g:394:4: rule__Click__Group__0
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
    // InternalBrowserAutomation.g:403:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:404:1: ( ruleInsert EOF )
            // InternalBrowserAutomation.g:405:1: ruleInsert EOF
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
    // InternalBrowserAutomation.g:412:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:416:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalBrowserAutomation.g:417:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalBrowserAutomation.g:417:2: ( ( rule__Insert__Group__0 ) )
            // InternalBrowserAutomation.g:418:3: ( rule__Insert__Group__0 )
            {
             before(grammarAccess.getInsertAccess().getGroup()); 
            // InternalBrowserAutomation.g:419:3: ( rule__Insert__Group__0 )
            // InternalBrowserAutomation.g:419:4: rule__Insert__Group__0
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
    // InternalBrowserAutomation.g:428:1: entryRuleVerify : ruleVerify EOF ;
    public final void entryRuleVerify() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:429:1: ( ruleVerify EOF )
            // InternalBrowserAutomation.g:430:1: ruleVerify EOF
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
    // InternalBrowserAutomation.g:437:1: ruleVerify : ( ( rule__Verify__Group__0 ) ) ;
    public final void ruleVerify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:441:2: ( ( ( rule__Verify__Group__0 ) ) )
            // InternalBrowserAutomation.g:442:2: ( ( rule__Verify__Group__0 ) )
            {
            // InternalBrowserAutomation.g:442:2: ( ( rule__Verify__Group__0 ) )
            // InternalBrowserAutomation.g:443:3: ( rule__Verify__Group__0 )
            {
             before(grammarAccess.getVerifyAccess().getGroup()); 
            // InternalBrowserAutomation.g:444:3: ( rule__Verify__Group__0 )
            // InternalBrowserAutomation.g:444:4: rule__Verify__Group__0
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
    // InternalBrowserAutomation.g:453:1: entryRuleCheck : ruleCheck EOF ;
    public final void entryRuleCheck() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:454:1: ( ruleCheck EOF )
            // InternalBrowserAutomation.g:455:1: ruleCheck EOF
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
    // InternalBrowserAutomation.g:462:1: ruleCheck : ( ( rule__Check__Group__0 ) ) ;
    public final void ruleCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:466:2: ( ( ( rule__Check__Group__0 ) ) )
            // InternalBrowserAutomation.g:467:2: ( ( rule__Check__Group__0 ) )
            {
            // InternalBrowserAutomation.g:467:2: ( ( rule__Check__Group__0 ) )
            // InternalBrowserAutomation.g:468:3: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // InternalBrowserAutomation.g:469:3: ( rule__Check__Group__0 )
            // InternalBrowserAutomation.g:469:4: rule__Check__Group__0
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
    // InternalBrowserAutomation.g:478:1: entryRuleChoose : ruleChoose EOF ;
    public final void entryRuleChoose() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:479:1: ( ruleChoose EOF )
            // InternalBrowserAutomation.g:480:1: ruleChoose EOF
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
    // InternalBrowserAutomation.g:487:1: ruleChoose : ( ( rule__Choose__Group__0 ) ) ;
    public final void ruleChoose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:491:2: ( ( ( rule__Choose__Group__0 ) ) )
            // InternalBrowserAutomation.g:492:2: ( ( rule__Choose__Group__0 ) )
            {
            // InternalBrowserAutomation.g:492:2: ( ( rule__Choose__Group__0 ) )
            // InternalBrowserAutomation.g:493:3: ( rule__Choose__Group__0 )
            {
             before(grammarAccess.getChooseAccess().getGroup()); 
            // InternalBrowserAutomation.g:494:3: ( rule__Choose__Group__0 )
            // InternalBrowserAutomation.g:494:4: rule__Choose__Group__0
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
    // InternalBrowserAutomation.g:503:1: entryRuleContains : ruleContains EOF ;
    public final void entryRuleContains() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:504:1: ( ruleContains EOF )
            // InternalBrowserAutomation.g:505:1: ruleContains EOF
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
    // InternalBrowserAutomation.g:512:1: ruleContains : ( ( rule__Contains__Group__0 ) ) ;
    public final void ruleContains() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:516:2: ( ( ( rule__Contains__Group__0 ) ) )
            // InternalBrowserAutomation.g:517:2: ( ( rule__Contains__Group__0 ) )
            {
            // InternalBrowserAutomation.g:517:2: ( ( rule__Contains__Group__0 ) )
            // InternalBrowserAutomation.g:518:3: ( rule__Contains__Group__0 )
            {
             before(grammarAccess.getContainsAccess().getGroup()); 
            // InternalBrowserAutomation.g:519:3: ( rule__Contains__Group__0 )
            // InternalBrowserAutomation.g:519:4: rule__Contains__Group__0
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
    // InternalBrowserAutomation.g:527:1: rule__WebBrowser__Alternatives : ( ( 'mozilla' ) | ( 'chrome' ) | ( 'safari' ) | ( 'internetExplorer' ) );
    public final void rule__WebBrowser__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:531:1: ( ( 'mozilla' ) | ( 'chrome' ) | ( 'safari' ) | ( 'internetExplorer' ) )
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
                    // InternalBrowserAutomation.g:532:2: ( 'mozilla' )
                    {
                    // InternalBrowserAutomation.g:532:2: ( 'mozilla' )
                    // InternalBrowserAutomation.g:533:3: 'mozilla'
                    {
                     before(grammarAccess.getWebBrowserAccess().getMozillaKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getMozillaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:538:2: ( 'chrome' )
                    {
                    // InternalBrowserAutomation.g:538:2: ( 'chrome' )
                    // InternalBrowserAutomation.g:539:3: 'chrome'
                    {
                     before(grammarAccess.getWebBrowserAccess().getChromeKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getChromeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:544:2: ( 'safari' )
                    {
                    // InternalBrowserAutomation.g:544:2: ( 'safari' )
                    // InternalBrowserAutomation.g:545:3: 'safari'
                    {
                     before(grammarAccess.getWebBrowserAccess().getSafariKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getSafariKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:550:2: ( 'internetExplorer' )
                    {
                    // InternalBrowserAutomation.g:550:2: ( 'internetExplorer' )
                    // InternalBrowserAutomation.g:551:3: 'internetExplorer'
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
    // InternalBrowserAutomation.g:560:1: rule__Statement__Alternatives : ( ( ruleDoAction ) | ( ruleGet ) | ( ruleUncheckAll ) | ( ruleGoTo ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:564:1: ( ( ruleDoAction ) | ( ruleGet ) | ( ruleUncheckAll ) | ( ruleGoTo ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalBrowserAutomation.g:565:2: ( ruleDoAction )
                    {
                    // InternalBrowserAutomation.g:565:2: ( ruleDoAction )
                    // InternalBrowserAutomation.g:566:3: ruleDoAction
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
                    // InternalBrowserAutomation.g:571:2: ( ruleGet )
                    {
                    // InternalBrowserAutomation.g:571:2: ( ruleGet )
                    // InternalBrowserAutomation.g:572:3: ruleGet
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
                    // InternalBrowserAutomation.g:577:2: ( ruleUncheckAll )
                    {
                    // InternalBrowserAutomation.g:577:2: ( ruleUncheckAll )
                    // InternalBrowserAutomation.g:578:3: ruleUncheckAll
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
                    // InternalBrowserAutomation.g:583:2: ( ruleGoTo )
                    {
                    // InternalBrowserAutomation.g:583:2: ( ruleGoTo )
                    // InternalBrowserAutomation.g:584:3: ruleGoTo
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
    // InternalBrowserAutomation.g:593:1: rule__Action__Alternatives : ( ( ruleClick ) | ( ruleInsert ) | ( ruleVerify ) | ( ruleCheck ) | ( ruleChoose ) | ( ruleContains ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:597:1: ( ( ruleClick ) | ( ruleInsert ) | ( ruleVerify ) | ( ruleCheck ) | ( ruleChoose ) | ( ruleContains ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt3=1;
                }
                break;
            case 43:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==45) ) {
                    alt3=3;
                }
                else if ( (LA3_3==50) ) {
                    alt3=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                alt3=4;
                }
                break;
            case 49:
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
                    // InternalBrowserAutomation.g:598:2: ( ruleClick )
                    {
                    // InternalBrowserAutomation.g:598:2: ( ruleClick )
                    // InternalBrowserAutomation.g:599:3: ruleClick
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
                    // InternalBrowserAutomation.g:604:2: ( ruleInsert )
                    {
                    // InternalBrowserAutomation.g:604:2: ( ruleInsert )
                    // InternalBrowserAutomation.g:605:3: ruleInsert
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
                    // InternalBrowserAutomation.g:610:2: ( ruleVerify )
                    {
                    // InternalBrowserAutomation.g:610:2: ( ruleVerify )
                    // InternalBrowserAutomation.g:611:3: ruleVerify
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
                    // InternalBrowserAutomation.g:616:2: ( ruleCheck )
                    {
                    // InternalBrowserAutomation.g:616:2: ( ruleCheck )
                    // InternalBrowserAutomation.g:617:3: ruleCheck
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
                    // InternalBrowserAutomation.g:622:2: ( ruleChoose )
                    {
                    // InternalBrowserAutomation.g:622:2: ( ruleChoose )
                    // InternalBrowserAutomation.g:623:3: ruleChoose
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
                    // InternalBrowserAutomation.g:628:2: ( ruleContains )
                    {
                    // InternalBrowserAutomation.g:628:2: ( ruleContains )
                    // InternalBrowserAutomation.g:629:3: ruleContains
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
    // InternalBrowserAutomation.g:638:1: rule__Get__Alternatives_3 : ( ( ( rule__Get__Group_3_0__0 ) ) | ( 'pageTitle' ) );
    public final void rule__Get__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:642:1: ( ( ( rule__Get__Group_3_0__0 ) ) | ( 'pageTitle' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=16 && LA4_0<=23)) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBrowserAutomation.g:643:2: ( ( rule__Get__Group_3_0__0 ) )
                    {
                    // InternalBrowserAutomation.g:643:2: ( ( rule__Get__Group_3_0__0 ) )
                    // InternalBrowserAutomation.g:644:3: ( rule__Get__Group_3_0__0 )
                    {
                     before(grammarAccess.getGetAccess().getGroup_3_0()); 
                    // InternalBrowserAutomation.g:645:3: ( rule__Get__Group_3_0__0 )
                    // InternalBrowserAutomation.g:645:4: rule__Get__Group_3_0__0
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
                    // InternalBrowserAutomation.g:649:2: ( 'pageTitle' )
                    {
                    // InternalBrowserAutomation.g:649:2: ( 'pageTitle' )
                    // InternalBrowserAutomation.g:650:3: 'pageTitle'
                    {
                     before(grammarAccess.getGetAccess().getPageTitleKeyword_3_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getGetAccess().getPageTitleKeyword_3_1()); 

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
    // InternalBrowserAutomation.g:659:1: rule__Get__Alternatives_3_0_2 : ( ( ( rule__Get__Group_3_0_2_0__0 ) ) | ( ( rule__Get__Group_3_0_2_1__0 ) ) );
    public final void rule__Get__Alternatives_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:663:1: ( ( ( rule__Get__Group_3_0_2_0__0 ) ) | ( ( rule__Get__Group_3_0_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                alt5=1;
            }
            else if ( (LA5_0==39) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBrowserAutomation.g:664:2: ( ( rule__Get__Group_3_0_2_0__0 ) )
                    {
                    // InternalBrowserAutomation.g:664:2: ( ( rule__Get__Group_3_0_2_0__0 ) )
                    // InternalBrowserAutomation.g:665:3: ( rule__Get__Group_3_0_2_0__0 )
                    {
                     before(grammarAccess.getGetAccess().getGroup_3_0_2_0()); 
                    // InternalBrowserAutomation.g:666:3: ( rule__Get__Group_3_0_2_0__0 )
                    // InternalBrowserAutomation.g:666:4: rule__Get__Group_3_0_2_0__0
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
                    // InternalBrowserAutomation.g:670:2: ( ( rule__Get__Group_3_0_2_1__0 ) )
                    {
                    // InternalBrowserAutomation.g:670:2: ( ( rule__Get__Group_3_0_2_1__0 ) )
                    // InternalBrowserAutomation.g:671:3: ( rule__Get__Group_3_0_2_1__0 )
                    {
                     before(grammarAccess.getGetAccess().getGroup_3_0_2_1()); 
                    // InternalBrowserAutomation.g:672:3: ( rule__Get__Group_3_0_2_1__0 )
                    // InternalBrowserAutomation.g:672:4: rule__Get__Group_3_0_2_1__0
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


    // $ANTLR start "rule__Get__Alternatives_3_0_2_0_3"
    // InternalBrowserAutomation.g:680:1: rule__Get__Alternatives_3_0_2_0_3 : ( ( ( rule__Get__AttrValAssignment_3_0_2_0_3_0 ) ) | ( ( rule__Get__AttrVarAssignment_3_0_2_0_3_1 ) ) );
    public final void rule__Get__Alternatives_3_0_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:684:1: ( ( ( rule__Get__AttrValAssignment_3_0_2_0_3_0 ) ) | ( ( rule__Get__AttrVarAssignment_3_0_2_0_3_1 ) ) )
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
                    // InternalBrowserAutomation.g:685:2: ( ( rule__Get__AttrValAssignment_3_0_2_0_3_0 ) )
                    {
                    // InternalBrowserAutomation.g:685:2: ( ( rule__Get__AttrValAssignment_3_0_2_0_3_0 ) )
                    // InternalBrowserAutomation.g:686:3: ( rule__Get__AttrValAssignment_3_0_2_0_3_0 )
                    {
                     before(grammarAccess.getGetAccess().getAttrValAssignment_3_0_2_0_3_0()); 
                    // InternalBrowserAutomation.g:687:3: ( rule__Get__AttrValAssignment_3_0_2_0_3_0 )
                    // InternalBrowserAutomation.g:687:4: rule__Get__AttrValAssignment_3_0_2_0_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Get__AttrValAssignment_3_0_2_0_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetAccess().getAttrValAssignment_3_0_2_0_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:691:2: ( ( rule__Get__AttrVarAssignment_3_0_2_0_3_1 ) )
                    {
                    // InternalBrowserAutomation.g:691:2: ( ( rule__Get__AttrVarAssignment_3_0_2_0_3_1 ) )
                    // InternalBrowserAutomation.g:692:3: ( rule__Get__AttrVarAssignment_3_0_2_0_3_1 )
                    {
                     before(grammarAccess.getGetAccess().getAttrVarAssignment_3_0_2_0_3_1()); 
                    // InternalBrowserAutomation.g:693:3: ( rule__Get__AttrVarAssignment_3_0_2_0_3_1 )
                    // InternalBrowserAutomation.g:693:4: rule__Get__AttrVarAssignment_3_0_2_0_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Get__AttrVarAssignment_3_0_2_0_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetAccess().getAttrVarAssignment_3_0_2_0_3_1()); 

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
    // $ANTLR end "rule__Get__Alternatives_3_0_2_0_3"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalBrowserAutomation.g:701:1: rule__Element__Alternatives : ( ( 'link' ) | ( 'input' ) | ( 'button' ) | ( 'checkbox' ) | ( 'combobox' ) | ( 'image' ) | ( 'text' ) | ( 'title' ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:705:1: ( ( 'link' ) | ( 'input' ) | ( 'button' ) | ( 'checkbox' ) | ( 'combobox' ) | ( 'image' ) | ( 'text' ) | ( 'title' ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            case 21:
                {
                alt7=6;
                }
                break;
            case 22:
                {
                alt7=7;
                }
                break;
            case 23:
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
                    // InternalBrowserAutomation.g:706:2: ( 'link' )
                    {
                    // InternalBrowserAutomation.g:706:2: ( 'link' )
                    // InternalBrowserAutomation.g:707:3: 'link'
                    {
                     before(grammarAccess.getElementAccess().getLinkKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getLinkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:712:2: ( 'input' )
                    {
                    // InternalBrowserAutomation.g:712:2: ( 'input' )
                    // InternalBrowserAutomation.g:713:3: 'input'
                    {
                     before(grammarAccess.getElementAccess().getInputKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getInputKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:718:2: ( 'button' )
                    {
                    // InternalBrowserAutomation.g:718:2: ( 'button' )
                    // InternalBrowserAutomation.g:719:3: 'button'
                    {
                     before(grammarAccess.getElementAccess().getButtonKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getButtonKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:724:2: ( 'checkbox' )
                    {
                    // InternalBrowserAutomation.g:724:2: ( 'checkbox' )
                    // InternalBrowserAutomation.g:725:3: 'checkbox'
                    {
                     before(grammarAccess.getElementAccess().getCheckboxKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getCheckboxKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:730:2: ( 'combobox' )
                    {
                    // InternalBrowserAutomation.g:730:2: ( 'combobox' )
                    // InternalBrowserAutomation.g:731:3: 'combobox'
                    {
                     before(grammarAccess.getElementAccess().getComboboxKeyword_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getComboboxKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:736:2: ( 'image' )
                    {
                    // InternalBrowserAutomation.g:736:2: ( 'image' )
                    // InternalBrowserAutomation.g:737:3: 'image'
                    {
                     before(grammarAccess.getElementAccess().getImageKeyword_5()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getImageKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBrowserAutomation.g:742:2: ( 'text' )
                    {
                    // InternalBrowserAutomation.g:742:2: ( 'text' )
                    // InternalBrowserAutomation.g:743:3: 'text'
                    {
                     before(grammarAccess.getElementAccess().getTextKeyword_6()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getTextKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBrowserAutomation.g:748:2: ( 'title' )
                    {
                    // InternalBrowserAutomation.g:748:2: ( 'title' )
                    // InternalBrowserAutomation.g:749:3: 'title'
                    {
                     before(grammarAccess.getElementAccess().getTitleKeyword_7()); 
                    match(input,23,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:758:1: rule__Attribut__Alternatives : ( ( 'class' ) | ( 'value' ) | ( 'alt' ) | ( 'name' ) | ( 'href' ) );
    public final void rule__Attribut__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:762:1: ( ( 'class' ) | ( 'value' ) | ( 'alt' ) | ( 'name' ) | ( 'href' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            case 28:
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
                    // InternalBrowserAutomation.g:763:2: ( 'class' )
                    {
                    // InternalBrowserAutomation.g:763:2: ( 'class' )
                    // InternalBrowserAutomation.g:764:3: 'class'
                    {
                     before(grammarAccess.getAttributAccess().getClassKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getClassKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:769:2: ( 'value' )
                    {
                    // InternalBrowserAutomation.g:769:2: ( 'value' )
                    // InternalBrowserAutomation.g:770:3: 'value'
                    {
                     before(grammarAccess.getAttributAccess().getValueKeyword_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getValueKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:775:2: ( 'alt' )
                    {
                    // InternalBrowserAutomation.g:775:2: ( 'alt' )
                    // InternalBrowserAutomation.g:776:3: 'alt'
                    {
                     before(grammarAccess.getAttributAccess().getAltKeyword_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getAltKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:781:2: ( 'name' )
                    {
                    // InternalBrowserAutomation.g:781:2: ( 'name' )
                    // InternalBrowserAutomation.g:782:3: 'name'
                    {
                     before(grammarAccess.getAttributAccess().getNameKeyword_3()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getNameKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:787:2: ( 'href' )
                    {
                    // InternalBrowserAutomation.g:787:2: ( 'href' )
                    // InternalBrowserAutomation.g:788:3: 'href'
                    {
                     before(grammarAccess.getAttributAccess().getHrefKeyword_4()); 
                    match(input,28,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:797:1: rule__Insert__Alternatives_1 : ( ( ( rule__Insert__ValAssignment_1_0 ) ) | ( ( rule__Insert__VarRefAssignment_1_1 ) ) );
    public final void rule__Insert__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:801:1: ( ( ( rule__Insert__ValAssignment_1_0 ) ) | ( ( rule__Insert__VarRefAssignment_1_1 ) ) )
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
                    // InternalBrowserAutomation.g:802:2: ( ( rule__Insert__ValAssignment_1_0 ) )
                    {
                    // InternalBrowserAutomation.g:802:2: ( ( rule__Insert__ValAssignment_1_0 ) )
                    // InternalBrowserAutomation.g:803:3: ( rule__Insert__ValAssignment_1_0 )
                    {
                     before(grammarAccess.getInsertAccess().getValAssignment_1_0()); 
                    // InternalBrowserAutomation.g:804:3: ( rule__Insert__ValAssignment_1_0 )
                    // InternalBrowserAutomation.g:804:4: rule__Insert__ValAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Insert__ValAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInsertAccess().getValAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:808:2: ( ( rule__Insert__VarRefAssignment_1_1 ) )
                    {
                    // InternalBrowserAutomation.g:808:2: ( ( rule__Insert__VarRefAssignment_1_1 ) )
                    // InternalBrowserAutomation.g:809:3: ( rule__Insert__VarRefAssignment_1_1 )
                    {
                     before(grammarAccess.getInsertAccess().getVarRefAssignment_1_1()); 
                    // InternalBrowserAutomation.g:810:3: ( rule__Insert__VarRefAssignment_1_1 )
                    // InternalBrowserAutomation.g:810:4: rule__Insert__VarRefAssignment_1_1
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
    // InternalBrowserAutomation.g:818:1: rule__BrowserAutomation__Group__0 : rule__BrowserAutomation__Group__0__Impl rule__BrowserAutomation__Group__1 ;
    public final void rule__BrowserAutomation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:822:1: ( rule__BrowserAutomation__Group__0__Impl rule__BrowserAutomation__Group__1 )
            // InternalBrowserAutomation.g:823:2: rule__BrowserAutomation__Group__0__Impl rule__BrowserAutomation__Group__1
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
    // InternalBrowserAutomation.g:830:1: rule__BrowserAutomation__Group__0__Impl : ( () ) ;
    public final void rule__BrowserAutomation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:834:1: ( ( () ) )
            // InternalBrowserAutomation.g:835:1: ( () )
            {
            // InternalBrowserAutomation.g:835:1: ( () )
            // InternalBrowserAutomation.g:836:2: ()
            {
             before(grammarAccess.getBrowserAutomationAccess().getBrowserAutomationAction_0()); 
            // InternalBrowserAutomation.g:837:2: ()
            // InternalBrowserAutomation.g:837:3: 
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
    // InternalBrowserAutomation.g:845:1: rule__BrowserAutomation__Group__1 : rule__BrowserAutomation__Group__1__Impl rule__BrowserAutomation__Group__2 ;
    public final void rule__BrowserAutomation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:849:1: ( rule__BrowserAutomation__Group__1__Impl rule__BrowserAutomation__Group__2 )
            // InternalBrowserAutomation.g:850:2: rule__BrowserAutomation__Group__1__Impl rule__BrowserAutomation__Group__2
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
    // InternalBrowserAutomation.g:857:1: rule__BrowserAutomation__Group__1__Impl : ( 'open' ) ;
    public final void rule__BrowserAutomation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:861:1: ( ( 'open' ) )
            // InternalBrowserAutomation.g:862:1: ( 'open' )
            {
            // InternalBrowserAutomation.g:862:1: ( 'open' )
            // InternalBrowserAutomation.g:863:2: 'open'
            {
             before(grammarAccess.getBrowserAutomationAccess().getOpenKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBrowserAutomationAccess().getOpenKeyword_1()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:872:1: rule__BrowserAutomation__Group__2 : rule__BrowserAutomation__Group__2__Impl rule__BrowserAutomation__Group__3 ;
    public final void rule__BrowserAutomation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:876:1: ( rule__BrowserAutomation__Group__2__Impl rule__BrowserAutomation__Group__3 )
            // InternalBrowserAutomation.g:877:2: rule__BrowserAutomation__Group__2__Impl rule__BrowserAutomation__Group__3
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
    // InternalBrowserAutomation.g:884:1: rule__BrowserAutomation__Group__2__Impl : ( ( rule__BrowserAutomation__WebBrowserAssignment_2 ) ) ;
    public final void rule__BrowserAutomation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:888:1: ( ( ( rule__BrowserAutomation__WebBrowserAssignment_2 ) ) )
            // InternalBrowserAutomation.g:889:1: ( ( rule__BrowserAutomation__WebBrowserAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:889:1: ( ( rule__BrowserAutomation__WebBrowserAssignment_2 ) )
            // InternalBrowserAutomation.g:890:2: ( rule__BrowserAutomation__WebBrowserAssignment_2 )
            {
             before(grammarAccess.getBrowserAutomationAccess().getWebBrowserAssignment_2()); 
            // InternalBrowserAutomation.g:891:2: ( rule__BrowserAutomation__WebBrowserAssignment_2 )
            // InternalBrowserAutomation.g:891:3: rule__BrowserAutomation__WebBrowserAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BrowserAutomation__WebBrowserAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBrowserAutomationAccess().getWebBrowserAssignment_2()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:899:1: rule__BrowserAutomation__Group__3 : rule__BrowserAutomation__Group__3__Impl ;
    public final void rule__BrowserAutomation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:903:1: ( rule__BrowserAutomation__Group__3__Impl )
            // InternalBrowserAutomation.g:904:2: rule__BrowserAutomation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BrowserAutomation__Group__3__Impl();

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
    // InternalBrowserAutomation.g:910:1: rule__BrowserAutomation__Group__3__Impl : ( ( rule__BrowserAutomation__StatementsAssignment_3 )* ) ;
    public final void rule__BrowserAutomation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:914:1: ( ( ( rule__BrowserAutomation__StatementsAssignment_3 )* ) )
            // InternalBrowserAutomation.g:915:1: ( ( rule__BrowserAutomation__StatementsAssignment_3 )* )
            {
            // InternalBrowserAutomation.g:915:1: ( ( rule__BrowserAutomation__StatementsAssignment_3 )* )
            // InternalBrowserAutomation.g:916:2: ( rule__BrowserAutomation__StatementsAssignment_3 )*
            {
             before(grammarAccess.getBrowserAutomationAccess().getStatementsAssignment_3()); 
            // InternalBrowserAutomation.g:917:2: ( rule__BrowserAutomation__StatementsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==30||LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBrowserAutomation.g:917:3: rule__BrowserAutomation__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__BrowserAutomation__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBrowserAutomationAccess().getStatementsAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__DoAction__Group__0"
    // InternalBrowserAutomation.g:926:1: rule__DoAction__Group__0 : rule__DoAction__Group__0__Impl rule__DoAction__Group__1 ;
    public final void rule__DoAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:930:1: ( rule__DoAction__Group__0__Impl rule__DoAction__Group__1 )
            // InternalBrowserAutomation.g:931:2: rule__DoAction__Group__0__Impl rule__DoAction__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBrowserAutomation.g:938:1: rule__DoAction__Group__0__Impl : ( ( rule__DoAction__GetAssignment_0 ) ) ;
    public final void rule__DoAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:942:1: ( ( ( rule__DoAction__GetAssignment_0 ) ) )
            // InternalBrowserAutomation.g:943:1: ( ( rule__DoAction__GetAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:943:1: ( ( rule__DoAction__GetAssignment_0 ) )
            // InternalBrowserAutomation.g:944:2: ( rule__DoAction__GetAssignment_0 )
            {
             before(grammarAccess.getDoActionAccess().getGetAssignment_0()); 
            // InternalBrowserAutomation.g:945:2: ( rule__DoAction__GetAssignment_0 )
            // InternalBrowserAutomation.g:945:3: rule__DoAction__GetAssignment_0
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
    // InternalBrowserAutomation.g:953:1: rule__DoAction__Group__1 : rule__DoAction__Group__1__Impl ;
    public final void rule__DoAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:957:1: ( rule__DoAction__Group__1__Impl )
            // InternalBrowserAutomation.g:958:2: rule__DoAction__Group__1__Impl
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
    // InternalBrowserAutomation.g:964:1: rule__DoAction__Group__1__Impl : ( ( rule__DoAction__ActionAssignment_1 ) ) ;
    public final void rule__DoAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:968:1: ( ( ( rule__DoAction__ActionAssignment_1 ) ) )
            // InternalBrowserAutomation.g:969:1: ( ( rule__DoAction__ActionAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:969:1: ( ( rule__DoAction__ActionAssignment_1 ) )
            // InternalBrowserAutomation.g:970:2: ( rule__DoAction__ActionAssignment_1 )
            {
             before(grammarAccess.getDoActionAccess().getActionAssignment_1()); 
            // InternalBrowserAutomation.g:971:2: ( rule__DoAction__ActionAssignment_1 )
            // InternalBrowserAutomation.g:971:3: rule__DoAction__ActionAssignment_1
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
    // InternalBrowserAutomation.g:980:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:984:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalBrowserAutomation.g:985:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBrowserAutomation.g:992:1: rule__GoTo__Group__0__Impl : ( 'go' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:996:1: ( ( 'go' ) )
            // InternalBrowserAutomation.g:997:1: ( 'go' )
            {
            // InternalBrowserAutomation.g:997:1: ( 'go' )
            // InternalBrowserAutomation.g:998:2: 'go'
            {
             before(grammarAccess.getGoToAccess().getGoKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1007:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl rule__GoTo__Group__2 ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1011:1: ( rule__GoTo__Group__1__Impl rule__GoTo__Group__2 )
            // InternalBrowserAutomation.g:1012:2: rule__GoTo__Group__1__Impl rule__GoTo__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalBrowserAutomation.g:1019:1: rule__GoTo__Group__1__Impl : ( 'to' ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1023:1: ( ( 'to' ) )
            // InternalBrowserAutomation.g:1024:1: ( 'to' )
            {
            // InternalBrowserAutomation.g:1024:1: ( 'to' )
            // InternalBrowserAutomation.g:1025:2: 'to'
            {
             before(grammarAccess.getGoToAccess().getToKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1034:1: rule__GoTo__Group__2 : rule__GoTo__Group__2__Impl ;
    public final void rule__GoTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1038:1: ( rule__GoTo__Group__2__Impl )
            // InternalBrowserAutomation.g:1039:2: rule__GoTo__Group__2__Impl
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
    // InternalBrowserAutomation.g:1045:1: rule__GoTo__Group__2__Impl : ( ( rule__GoTo__UrlAssignment_2 ) ) ;
    public final void rule__GoTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1049:1: ( ( ( rule__GoTo__UrlAssignment_2 ) ) )
            // InternalBrowserAutomation.g:1050:1: ( ( rule__GoTo__UrlAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:1050:1: ( ( rule__GoTo__UrlAssignment_2 ) )
            // InternalBrowserAutomation.g:1051:2: ( rule__GoTo__UrlAssignment_2 )
            {
             before(grammarAccess.getGoToAccess().getUrlAssignment_2()); 
            // InternalBrowserAutomation.g:1052:2: ( rule__GoTo__UrlAssignment_2 )
            // InternalBrowserAutomation.g:1052:3: rule__GoTo__UrlAssignment_2
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
    // InternalBrowserAutomation.g:1061:1: rule__UncheckAll__Group__0 : rule__UncheckAll__Group__0__Impl rule__UncheckAll__Group__1 ;
    public final void rule__UncheckAll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1065:1: ( rule__UncheckAll__Group__0__Impl rule__UncheckAll__Group__1 )
            // InternalBrowserAutomation.g:1066:2: rule__UncheckAll__Group__0__Impl rule__UncheckAll__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalBrowserAutomation.g:1073:1: rule__UncheckAll__Group__0__Impl : ( 'uncheck' ) ;
    public final void rule__UncheckAll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1077:1: ( ( 'uncheck' ) )
            // InternalBrowserAutomation.g:1078:1: ( 'uncheck' )
            {
            // InternalBrowserAutomation.g:1078:1: ( 'uncheck' )
            // InternalBrowserAutomation.g:1079:2: 'uncheck'
            {
             before(grammarAccess.getUncheckAllAccess().getUncheckKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1088:1: rule__UncheckAll__Group__1 : rule__UncheckAll__Group__1__Impl ;
    public final void rule__UncheckAll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1092:1: ( rule__UncheckAll__Group__1__Impl )
            // InternalBrowserAutomation.g:1093:2: rule__UncheckAll__Group__1__Impl
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
    // InternalBrowserAutomation.g:1099:1: rule__UncheckAll__Group__1__Impl : ( 'all' ) ;
    public final void rule__UncheckAll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1103:1: ( ( 'all' ) )
            // InternalBrowserAutomation.g:1104:1: ( 'all' )
            {
            // InternalBrowserAutomation.g:1104:1: ( 'all' )
            // InternalBrowserAutomation.g:1105:2: 'all'
            {
             before(grammarAccess.getUncheckAllAccess().getAllKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1115:1: rule__Get__Group__0 : rule__Get__Group__0__Impl rule__Get__Group__1 ;
    public final void rule__Get__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1119:1: ( rule__Get__Group__0__Impl rule__Get__Group__1 )
            // InternalBrowserAutomation.g:1120:2: rule__Get__Group__0__Impl rule__Get__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBrowserAutomation.g:1127:1: rule__Get__Group__0__Impl : ( ( rule__Get__VarAssignment_0 ) ) ;
    public final void rule__Get__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1131:1: ( ( ( rule__Get__VarAssignment_0 ) ) )
            // InternalBrowserAutomation.g:1132:1: ( ( rule__Get__VarAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:1132:1: ( ( rule__Get__VarAssignment_0 ) )
            // InternalBrowserAutomation.g:1133:2: ( rule__Get__VarAssignment_0 )
            {
             before(grammarAccess.getGetAccess().getVarAssignment_0()); 
            // InternalBrowserAutomation.g:1134:2: ( rule__Get__VarAssignment_0 )
            // InternalBrowserAutomation.g:1134:3: rule__Get__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Get__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getVarAssignment_0()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:1142:1: rule__Get__Group__1 : rule__Get__Group__1__Impl rule__Get__Group__2 ;
    public final void rule__Get__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1146:1: ( rule__Get__Group__1__Impl rule__Get__Group__2 )
            // InternalBrowserAutomation.g:1147:2: rule__Get__Group__1__Impl rule__Get__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalBrowserAutomation.g:1154:1: rule__Get__Group__1__Impl : ( '=' ) ;
    public final void rule__Get__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1158:1: ( ( '=' ) )
            // InternalBrowserAutomation.g:1159:1: ( '=' )
            {
            // InternalBrowserAutomation.g:1159:1: ( '=' )
            // InternalBrowserAutomation.g:1160:2: '='
            {
             before(grammarAccess.getGetAccess().getEqualsSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1169:1: rule__Get__Group__2 : rule__Get__Group__2__Impl rule__Get__Group__3 ;
    public final void rule__Get__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1173:1: ( rule__Get__Group__2__Impl rule__Get__Group__3 )
            // InternalBrowserAutomation.g:1174:2: rule__Get__Group__2__Impl rule__Get__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalBrowserAutomation.g:1181:1: rule__Get__Group__2__Impl : ( 'get' ) ;
    public final void rule__Get__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1185:1: ( ( 'get' ) )
            // InternalBrowserAutomation.g:1186:1: ( 'get' )
            {
            // InternalBrowserAutomation.g:1186:1: ( 'get' )
            // InternalBrowserAutomation.g:1187:2: 'get'
            {
             before(grammarAccess.getGetAccess().getGetKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1196:1: rule__Get__Group__3 : rule__Get__Group__3__Impl ;
    public final void rule__Get__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1200:1: ( rule__Get__Group__3__Impl )
            // InternalBrowserAutomation.g:1201:2: rule__Get__Group__3__Impl
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
    // InternalBrowserAutomation.g:1207:1: rule__Get__Group__3__Impl : ( ( rule__Get__Alternatives_3 ) ) ;
    public final void rule__Get__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1211:1: ( ( ( rule__Get__Alternatives_3 ) ) )
            // InternalBrowserAutomation.g:1212:1: ( ( rule__Get__Alternatives_3 ) )
            {
            // InternalBrowserAutomation.g:1212:1: ( ( rule__Get__Alternatives_3 ) )
            // InternalBrowserAutomation.g:1213:2: ( rule__Get__Alternatives_3 )
            {
             before(grammarAccess.getGetAccess().getAlternatives_3()); 
            // InternalBrowserAutomation.g:1214:2: ( rule__Get__Alternatives_3 )
            // InternalBrowserAutomation.g:1214:3: rule__Get__Alternatives_3
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
    // InternalBrowserAutomation.g:1223:1: rule__Get__Group_3_0__0 : rule__Get__Group_3_0__0__Impl rule__Get__Group_3_0__1 ;
    public final void rule__Get__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1227:1: ( rule__Get__Group_3_0__0__Impl rule__Get__Group_3_0__1 )
            // InternalBrowserAutomation.g:1228:2: rule__Get__Group_3_0__0__Impl rule__Get__Group_3_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalBrowserAutomation.g:1235:1: rule__Get__Group_3_0__0__Impl : ( ( rule__Get__ElementAssignment_3_0_0 ) ) ;
    public final void rule__Get__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1239:1: ( ( ( rule__Get__ElementAssignment_3_0_0 ) ) )
            // InternalBrowserAutomation.g:1240:1: ( ( rule__Get__ElementAssignment_3_0_0 ) )
            {
            // InternalBrowserAutomation.g:1240:1: ( ( rule__Get__ElementAssignment_3_0_0 ) )
            // InternalBrowserAutomation.g:1241:2: ( rule__Get__ElementAssignment_3_0_0 )
            {
             before(grammarAccess.getGetAccess().getElementAssignment_3_0_0()); 
            // InternalBrowserAutomation.g:1242:2: ( rule__Get__ElementAssignment_3_0_0 )
            // InternalBrowserAutomation.g:1242:3: rule__Get__ElementAssignment_3_0_0
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
    // InternalBrowserAutomation.g:1250:1: rule__Get__Group_3_0__1 : rule__Get__Group_3_0__1__Impl rule__Get__Group_3_0__2 ;
    public final void rule__Get__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1254:1: ( rule__Get__Group_3_0__1__Impl rule__Get__Group_3_0__2 )
            // InternalBrowserAutomation.g:1255:2: rule__Get__Group_3_0__1__Impl rule__Get__Group_3_0__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalBrowserAutomation.g:1262:1: rule__Get__Group_3_0__1__Impl : ( ( rule__Get__OrderAssignment_3_0_1 )? ) ;
    public final void rule__Get__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1266:1: ( ( ( rule__Get__OrderAssignment_3_0_1 )? ) )
            // InternalBrowserAutomation.g:1267:1: ( ( rule__Get__OrderAssignment_3_0_1 )? )
            {
            // InternalBrowserAutomation.g:1267:1: ( ( rule__Get__OrderAssignment_3_0_1 )? )
            // InternalBrowserAutomation.g:1268:2: ( rule__Get__OrderAssignment_3_0_1 )?
            {
             before(grammarAccess.getGetAccess().getOrderAssignment_3_0_1()); 
            // InternalBrowserAutomation.g:1269:2: ( rule__Get__OrderAssignment_3_0_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBrowserAutomation.g:1269:3: rule__Get__OrderAssignment_3_0_1
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
    // InternalBrowserAutomation.g:1277:1: rule__Get__Group_3_0__2 : rule__Get__Group_3_0__2__Impl ;
    public final void rule__Get__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1281:1: ( rule__Get__Group_3_0__2__Impl )
            // InternalBrowserAutomation.g:1282:2: rule__Get__Group_3_0__2__Impl
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
    // InternalBrowserAutomation.g:1288:1: rule__Get__Group_3_0__2__Impl : ( ( rule__Get__Alternatives_3_0_2 ) ) ;
    public final void rule__Get__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1292:1: ( ( ( rule__Get__Alternatives_3_0_2 ) ) )
            // InternalBrowserAutomation.g:1293:1: ( ( rule__Get__Alternatives_3_0_2 ) )
            {
            // InternalBrowserAutomation.g:1293:1: ( ( rule__Get__Alternatives_3_0_2 ) )
            // InternalBrowserAutomation.g:1294:2: ( rule__Get__Alternatives_3_0_2 )
            {
             before(grammarAccess.getGetAccess().getAlternatives_3_0_2()); 
            // InternalBrowserAutomation.g:1295:2: ( rule__Get__Alternatives_3_0_2 )
            // InternalBrowserAutomation.g:1295:3: rule__Get__Alternatives_3_0_2
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
    // InternalBrowserAutomation.g:1304:1: rule__Get__Group_3_0_2_0__0 : rule__Get__Group_3_0_2_0__0__Impl rule__Get__Group_3_0_2_0__1 ;
    public final void rule__Get__Group_3_0_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1308:1: ( rule__Get__Group_3_0_2_0__0__Impl rule__Get__Group_3_0_2_0__1 )
            // InternalBrowserAutomation.g:1309:2: rule__Get__Group_3_0_2_0__0__Impl rule__Get__Group_3_0_2_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBrowserAutomation.g:1316:1: rule__Get__Group_3_0_2_0__0__Impl : ( 'by' ) ;
    public final void rule__Get__Group_3_0_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1320:1: ( ( 'by' ) )
            // InternalBrowserAutomation.g:1321:1: ( 'by' )
            {
            // InternalBrowserAutomation.g:1321:1: ( 'by' )
            // InternalBrowserAutomation.g:1322:2: 'by'
            {
             before(grammarAccess.getGetAccess().getByKeyword_3_0_2_0_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1331:1: rule__Get__Group_3_0_2_0__1 : rule__Get__Group_3_0_2_0__1__Impl rule__Get__Group_3_0_2_0__2 ;
    public final void rule__Get__Group_3_0_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1335:1: ( rule__Get__Group_3_0_2_0__1__Impl rule__Get__Group_3_0_2_0__2 )
            // InternalBrowserAutomation.g:1336:2: rule__Get__Group_3_0_2_0__1__Impl rule__Get__Group_3_0_2_0__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalBrowserAutomation.g:1343:1: rule__Get__Group_3_0_2_0__1__Impl : ( ( rule__Get__AttrAssignment_3_0_2_0_1 ) ) ;
    public final void rule__Get__Group_3_0_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1347:1: ( ( ( rule__Get__AttrAssignment_3_0_2_0_1 ) ) )
            // InternalBrowserAutomation.g:1348:1: ( ( rule__Get__AttrAssignment_3_0_2_0_1 ) )
            {
            // InternalBrowserAutomation.g:1348:1: ( ( rule__Get__AttrAssignment_3_0_2_0_1 ) )
            // InternalBrowserAutomation.g:1349:2: ( rule__Get__AttrAssignment_3_0_2_0_1 )
            {
             before(grammarAccess.getGetAccess().getAttrAssignment_3_0_2_0_1()); 
            // InternalBrowserAutomation.g:1350:2: ( rule__Get__AttrAssignment_3_0_2_0_1 )
            // InternalBrowserAutomation.g:1350:3: rule__Get__AttrAssignment_3_0_2_0_1
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
    // InternalBrowserAutomation.g:1358:1: rule__Get__Group_3_0_2_0__2 : rule__Get__Group_3_0_2_0__2__Impl rule__Get__Group_3_0_2_0__3 ;
    public final void rule__Get__Group_3_0_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1362:1: ( rule__Get__Group_3_0_2_0__2__Impl rule__Get__Group_3_0_2_0__3 )
            // InternalBrowserAutomation.g:1363:2: rule__Get__Group_3_0_2_0__2__Impl rule__Get__Group_3_0_2_0__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalBrowserAutomation.g:1370:1: rule__Get__Group_3_0_2_0__2__Impl : ( '[' ) ;
    public final void rule__Get__Group_3_0_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1374:1: ( ( '[' ) )
            // InternalBrowserAutomation.g:1375:1: ( '[' )
            {
            // InternalBrowserAutomation.g:1375:1: ( '[' )
            // InternalBrowserAutomation.g:1376:2: '['
            {
             before(grammarAccess.getGetAccess().getLeftSquareBracketKeyword_3_0_2_0_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1385:1: rule__Get__Group_3_0_2_0__3 : rule__Get__Group_3_0_2_0__3__Impl rule__Get__Group_3_0_2_0__4 ;
    public final void rule__Get__Group_3_0_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1389:1: ( rule__Get__Group_3_0_2_0__3__Impl rule__Get__Group_3_0_2_0__4 )
            // InternalBrowserAutomation.g:1390:2: rule__Get__Group_3_0_2_0__3__Impl rule__Get__Group_3_0_2_0__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalBrowserAutomation.g:1397:1: rule__Get__Group_3_0_2_0__3__Impl : ( ( rule__Get__Alternatives_3_0_2_0_3 ) ) ;
    public final void rule__Get__Group_3_0_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1401:1: ( ( ( rule__Get__Alternatives_3_0_2_0_3 ) ) )
            // InternalBrowserAutomation.g:1402:1: ( ( rule__Get__Alternatives_3_0_2_0_3 ) )
            {
            // InternalBrowserAutomation.g:1402:1: ( ( rule__Get__Alternatives_3_0_2_0_3 ) )
            // InternalBrowserAutomation.g:1403:2: ( rule__Get__Alternatives_3_0_2_0_3 )
            {
             before(grammarAccess.getGetAccess().getAlternatives_3_0_2_0_3()); 
            // InternalBrowserAutomation.g:1404:2: ( rule__Get__Alternatives_3_0_2_0_3 )
            // InternalBrowserAutomation.g:1404:3: rule__Get__Alternatives_3_0_2_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Get__Alternatives_3_0_2_0_3();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getAlternatives_3_0_2_0_3()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:1412:1: rule__Get__Group_3_0_2_0__4 : rule__Get__Group_3_0_2_0__4__Impl ;
    public final void rule__Get__Group_3_0_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1416:1: ( rule__Get__Group_3_0_2_0__4__Impl )
            // InternalBrowserAutomation.g:1417:2: rule__Get__Group_3_0_2_0__4__Impl
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
    // InternalBrowserAutomation.g:1423:1: rule__Get__Group_3_0_2_0__4__Impl : ( ']' ) ;
    public final void rule__Get__Group_3_0_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1427:1: ( ( ']' ) )
            // InternalBrowserAutomation.g:1428:1: ( ']' )
            {
            // InternalBrowserAutomation.g:1428:1: ( ']' )
            // InternalBrowserAutomation.g:1429:2: ']'
            {
             before(grammarAccess.getGetAccess().getRightSquareBracketKeyword_3_0_2_0_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1439:1: rule__Get__Group_3_0_2_1__0 : rule__Get__Group_3_0_2_1__0__Impl rule__Get__Group_3_0_2_1__1 ;
    public final void rule__Get__Group_3_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1443:1: ( rule__Get__Group_3_0_2_1__0__Impl rule__Get__Group_3_0_2_1__1 )
            // InternalBrowserAutomation.g:1444:2: rule__Get__Group_3_0_2_1__0__Impl rule__Get__Group_3_0_2_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBrowserAutomation.g:1451:1: rule__Get__Group_3_0_2_1__0__Impl : ( 'from' ) ;
    public final void rule__Get__Group_3_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1455:1: ( ( 'from' ) )
            // InternalBrowserAutomation.g:1456:1: ( 'from' )
            {
            // InternalBrowserAutomation.g:1456:1: ( 'from' )
            // InternalBrowserAutomation.g:1457:2: 'from'
            {
             before(grammarAccess.getGetAccess().getFromKeyword_3_0_2_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1466:1: rule__Get__Group_3_0_2_1__1 : rule__Get__Group_3_0_2_1__1__Impl ;
    public final void rule__Get__Group_3_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1470:1: ( rule__Get__Group_3_0_2_1__1__Impl )
            // InternalBrowserAutomation.g:1471:2: rule__Get__Group_3_0_2_1__1__Impl
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
    // InternalBrowserAutomation.g:1477:1: rule__Get__Group_3_0_2_1__1__Impl : ( ( rule__Get__VarRefAssignment_3_0_2_1_1 ) ) ;
    public final void rule__Get__Group_3_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1481:1: ( ( ( rule__Get__VarRefAssignment_3_0_2_1_1 ) ) )
            // InternalBrowserAutomation.g:1482:1: ( ( rule__Get__VarRefAssignment_3_0_2_1_1 ) )
            {
            // InternalBrowserAutomation.g:1482:1: ( ( rule__Get__VarRefAssignment_3_0_2_1_1 ) )
            // InternalBrowserAutomation.g:1483:2: ( rule__Get__VarRefAssignment_3_0_2_1_1 )
            {
             before(grammarAccess.getGetAccess().getVarRefAssignment_3_0_2_1_1()); 
            // InternalBrowserAutomation.g:1484:2: ( rule__Get__VarRefAssignment_3_0_2_1_1 )
            // InternalBrowserAutomation.g:1484:3: rule__Get__VarRefAssignment_3_0_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Get__VarRefAssignment_3_0_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getVarRefAssignment_3_0_2_1_1()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:1493:1: rule__Order__Group__0 : rule__Order__Group__0__Impl rule__Order__Group__1 ;
    public final void rule__Order__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1497:1: ( rule__Order__Group__0__Impl rule__Order__Group__1 )
            // InternalBrowserAutomation.g:1498:2: rule__Order__Group__0__Impl rule__Order__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBrowserAutomation.g:1505:1: rule__Order__Group__0__Impl : ( 'number' ) ;
    public final void rule__Order__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1509:1: ( ( 'number' ) )
            // InternalBrowserAutomation.g:1510:1: ( 'number' )
            {
            // InternalBrowserAutomation.g:1510:1: ( 'number' )
            // InternalBrowserAutomation.g:1511:2: 'number'
            {
             before(grammarAccess.getOrderAccess().getNumberKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1520:1: rule__Order__Group__1 : rule__Order__Group__1__Impl ;
    public final void rule__Order__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1524:1: ( rule__Order__Group__1__Impl )
            // InternalBrowserAutomation.g:1525:2: rule__Order__Group__1__Impl
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
    // InternalBrowserAutomation.g:1531:1: rule__Order__Group__1__Impl : ( ( rule__Order__OrderAssignment_1 ) ) ;
    public final void rule__Order__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1535:1: ( ( ( rule__Order__OrderAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1536:1: ( ( rule__Order__OrderAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1536:1: ( ( rule__Order__OrderAssignment_1 ) )
            // InternalBrowserAutomation.g:1537:2: ( rule__Order__OrderAssignment_1 )
            {
             before(grammarAccess.getOrderAccess().getOrderAssignment_1()); 
            // InternalBrowserAutomation.g:1538:2: ( rule__Order__OrderAssignment_1 )
            // InternalBrowserAutomation.g:1538:3: rule__Order__OrderAssignment_1
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
    // InternalBrowserAutomation.g:1547:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1551:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalBrowserAutomation.g:1552:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalBrowserAutomation.g:1559:1: rule__Click__Group__0__Impl : ( 'click' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1563:1: ( ( 'click' ) )
            // InternalBrowserAutomation.g:1564:1: ( 'click' )
            {
            // InternalBrowserAutomation.g:1564:1: ( 'click' )
            // InternalBrowserAutomation.g:1565:2: 'click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1574:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1578:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalBrowserAutomation.g:1579:2: rule__Click__Group__1__Impl rule__Click__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalBrowserAutomation.g:1586:1: rule__Click__Group__1__Impl : ( 'on' ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1590:1: ( ( 'on' ) )
            // InternalBrowserAutomation.g:1591:1: ( 'on' )
            {
            // InternalBrowserAutomation.g:1591:1: ( 'on' )
            // InternalBrowserAutomation.g:1592:2: 'on'
            {
             before(grammarAccess.getClickAccess().getOnKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1601:1: rule__Click__Group__2 : rule__Click__Group__2__Impl ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1605:1: ( rule__Click__Group__2__Impl )
            // InternalBrowserAutomation.g:1606:2: rule__Click__Group__2__Impl
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
    // InternalBrowserAutomation.g:1612:1: rule__Click__Group__2__Impl : ( ( rule__Click__VarAssignment_2 ) ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1616:1: ( ( ( rule__Click__VarAssignment_2 ) ) )
            // InternalBrowserAutomation.g:1617:1: ( ( rule__Click__VarAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:1617:1: ( ( rule__Click__VarAssignment_2 ) )
            // InternalBrowserAutomation.g:1618:2: ( rule__Click__VarAssignment_2 )
            {
             before(grammarAccess.getClickAccess().getVarAssignment_2()); 
            // InternalBrowserAutomation.g:1619:2: ( rule__Click__VarAssignment_2 )
            // InternalBrowserAutomation.g:1619:3: rule__Click__VarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Click__VarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getVarAssignment_2()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:1628:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1632:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalBrowserAutomation.g:1633:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBrowserAutomation.g:1640:1: rule__Insert__Group__0__Impl : ( 'insert' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1644:1: ( ( 'insert' ) )
            // InternalBrowserAutomation.g:1645:1: ( 'insert' )
            {
            // InternalBrowserAutomation.g:1645:1: ( 'insert' )
            // InternalBrowserAutomation.g:1646:2: 'insert'
            {
             before(grammarAccess.getInsertAccess().getInsertKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1655:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1659:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalBrowserAutomation.g:1660:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalBrowserAutomation.g:1667:1: rule__Insert__Group__1__Impl : ( ( rule__Insert__Alternatives_1 ) ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1671:1: ( ( ( rule__Insert__Alternatives_1 ) ) )
            // InternalBrowserAutomation.g:1672:1: ( ( rule__Insert__Alternatives_1 ) )
            {
            // InternalBrowserAutomation.g:1672:1: ( ( rule__Insert__Alternatives_1 ) )
            // InternalBrowserAutomation.g:1673:2: ( rule__Insert__Alternatives_1 )
            {
             before(grammarAccess.getInsertAccess().getAlternatives_1()); 
            // InternalBrowserAutomation.g:1674:2: ( rule__Insert__Alternatives_1 )
            // InternalBrowserAutomation.g:1674:3: rule__Insert__Alternatives_1
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
    // InternalBrowserAutomation.g:1682:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1686:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalBrowserAutomation.g:1687:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalBrowserAutomation.g:1694:1: rule__Insert__Group__2__Impl : ( 'in' ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1698:1: ( ( 'in' ) )
            // InternalBrowserAutomation.g:1699:1: ( 'in' )
            {
            // InternalBrowserAutomation.g:1699:1: ( 'in' )
            // InternalBrowserAutomation.g:1700:2: 'in'
            {
             before(grammarAccess.getInsertAccess().getInKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1709:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1713:1: ( rule__Insert__Group__3__Impl )
            // InternalBrowserAutomation.g:1714:2: rule__Insert__Group__3__Impl
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
    // InternalBrowserAutomation.g:1720:1: rule__Insert__Group__3__Impl : ( ( rule__Insert__Var2Assignment_3 ) ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1724:1: ( ( ( rule__Insert__Var2Assignment_3 ) ) )
            // InternalBrowserAutomation.g:1725:1: ( ( rule__Insert__Var2Assignment_3 ) )
            {
            // InternalBrowserAutomation.g:1725:1: ( ( rule__Insert__Var2Assignment_3 ) )
            // InternalBrowserAutomation.g:1726:2: ( rule__Insert__Var2Assignment_3 )
            {
             before(grammarAccess.getInsertAccess().getVar2Assignment_3()); 
            // InternalBrowserAutomation.g:1727:2: ( rule__Insert__Var2Assignment_3 )
            // InternalBrowserAutomation.g:1727:3: rule__Insert__Var2Assignment_3
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
    // InternalBrowserAutomation.g:1736:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1740:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // InternalBrowserAutomation.g:1741:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalBrowserAutomation.g:1748:1: rule__Verify__Group__0__Impl : ( ( rule__Verify__VarAssignment_0 ) ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1752:1: ( ( ( rule__Verify__VarAssignment_0 ) ) )
            // InternalBrowserAutomation.g:1753:1: ( ( rule__Verify__VarAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:1753:1: ( ( rule__Verify__VarAssignment_0 ) )
            // InternalBrowserAutomation.g:1754:2: ( rule__Verify__VarAssignment_0 )
            {
             before(grammarAccess.getVerifyAccess().getVarAssignment_0()); 
            // InternalBrowserAutomation.g:1755:2: ( rule__Verify__VarAssignment_0 )
            // InternalBrowserAutomation.g:1755:3: rule__Verify__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Verify__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getVarAssignment_0()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:1763:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl rule__Verify__Group__2 ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1767:1: ( rule__Verify__Group__1__Impl rule__Verify__Group__2 )
            // InternalBrowserAutomation.g:1768:2: rule__Verify__Group__1__Impl rule__Verify__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalBrowserAutomation.g:1775:1: rule__Verify__Group__1__Impl : ( 'is' ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1779:1: ( ( 'is' ) )
            // InternalBrowserAutomation.g:1780:1: ( 'is' )
            {
            // InternalBrowserAutomation.g:1780:1: ( 'is' )
            // InternalBrowserAutomation.g:1781:2: 'is'
            {
             before(grammarAccess.getVerifyAccess().getIsKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1790:1: rule__Verify__Group__2 : rule__Verify__Group__2__Impl rule__Verify__Group__3 ;
    public final void rule__Verify__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1794:1: ( rule__Verify__Group__2__Impl rule__Verify__Group__3 )
            // InternalBrowserAutomation.g:1795:2: rule__Verify__Group__2__Impl rule__Verify__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalBrowserAutomation.g:1802:1: rule__Verify__Group__2__Impl : ( 'not' ) ;
    public final void rule__Verify__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1806:1: ( ( 'not' ) )
            // InternalBrowserAutomation.g:1807:1: ( 'not' )
            {
            // InternalBrowserAutomation.g:1807:1: ( 'not' )
            // InternalBrowserAutomation.g:1808:2: 'not'
            {
             before(grammarAccess.getVerifyAccess().getNotKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1817:1: rule__Verify__Group__3 : rule__Verify__Group__3__Impl ;
    public final void rule__Verify__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1821:1: ( rule__Verify__Group__3__Impl )
            // InternalBrowserAutomation.g:1822:2: rule__Verify__Group__3__Impl
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
    // InternalBrowserAutomation.g:1828:1: rule__Verify__Group__3__Impl : ( 'null' ) ;
    public final void rule__Verify__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1832:1: ( ( 'null' ) )
            // InternalBrowserAutomation.g:1833:1: ( 'null' )
            {
            // InternalBrowserAutomation.g:1833:1: ( 'null' )
            // InternalBrowserAutomation.g:1834:2: 'null'
            {
             before(grammarAccess.getVerifyAccess().getNullKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1844:1: rule__Check__Group__0 : rule__Check__Group__0__Impl rule__Check__Group__1 ;
    public final void rule__Check__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1848:1: ( rule__Check__Group__0__Impl rule__Check__Group__1 )
            // InternalBrowserAutomation.g:1849:2: rule__Check__Group__0__Impl rule__Check__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBrowserAutomation.g:1856:1: rule__Check__Group__0__Impl : ( 'check' ) ;
    public final void rule__Check__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1860:1: ( ( 'check' ) )
            // InternalBrowserAutomation.g:1861:1: ( 'check' )
            {
            // InternalBrowserAutomation.g:1861:1: ( 'check' )
            // InternalBrowserAutomation.g:1862:2: 'check'
            {
             before(grammarAccess.getCheckAccess().getCheckKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1871:1: rule__Check__Group__1 : rule__Check__Group__1__Impl ;
    public final void rule__Check__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1875:1: ( rule__Check__Group__1__Impl )
            // InternalBrowserAutomation.g:1876:2: rule__Check__Group__1__Impl
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
    // InternalBrowserAutomation.g:1882:1: rule__Check__Group__1__Impl : ( ( rule__Check__VarAssignment_1 ) ) ;
    public final void rule__Check__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1886:1: ( ( ( rule__Check__VarAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1887:1: ( ( rule__Check__VarAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1887:1: ( ( rule__Check__VarAssignment_1 ) )
            // InternalBrowserAutomation.g:1888:2: ( rule__Check__VarAssignment_1 )
            {
             before(grammarAccess.getCheckAccess().getVarAssignment_1()); 
            // InternalBrowserAutomation.g:1889:2: ( rule__Check__VarAssignment_1 )
            // InternalBrowserAutomation.g:1889:3: rule__Check__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Check__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getVarAssignment_1()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:1898:1: rule__Choose__Group__0 : rule__Choose__Group__0__Impl rule__Choose__Group__1 ;
    public final void rule__Choose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1902:1: ( rule__Choose__Group__0__Impl rule__Choose__Group__1 )
            // InternalBrowserAutomation.g:1903:2: rule__Choose__Group__0__Impl rule__Choose__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalBrowserAutomation.g:1910:1: rule__Choose__Group__0__Impl : ( 'choose' ) ;
    public final void rule__Choose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1914:1: ( ( 'choose' ) )
            // InternalBrowserAutomation.g:1915:1: ( 'choose' )
            {
            // InternalBrowserAutomation.g:1915:1: ( 'choose' )
            // InternalBrowserAutomation.g:1916:2: 'choose'
            {
             before(grammarAccess.getChooseAccess().getChooseKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1925:1: rule__Choose__Group__1 : rule__Choose__Group__1__Impl rule__Choose__Group__2 ;
    public final void rule__Choose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1929:1: ( rule__Choose__Group__1__Impl rule__Choose__Group__2 )
            // InternalBrowserAutomation.g:1930:2: rule__Choose__Group__1__Impl rule__Choose__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalBrowserAutomation.g:1937:1: rule__Choose__Group__1__Impl : ( ( rule__Choose__ValueAssignment_1 ) ) ;
    public final void rule__Choose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1941:1: ( ( ( rule__Choose__ValueAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1942:1: ( ( rule__Choose__ValueAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1942:1: ( ( rule__Choose__ValueAssignment_1 ) )
            // InternalBrowserAutomation.g:1943:2: ( rule__Choose__ValueAssignment_1 )
            {
             before(grammarAccess.getChooseAccess().getValueAssignment_1()); 
            // InternalBrowserAutomation.g:1944:2: ( rule__Choose__ValueAssignment_1 )
            // InternalBrowserAutomation.g:1944:3: rule__Choose__ValueAssignment_1
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
    // InternalBrowserAutomation.g:1952:1: rule__Choose__Group__2 : rule__Choose__Group__2__Impl rule__Choose__Group__3 ;
    public final void rule__Choose__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1956:1: ( rule__Choose__Group__2__Impl rule__Choose__Group__3 )
            // InternalBrowserAutomation.g:1957:2: rule__Choose__Group__2__Impl rule__Choose__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalBrowserAutomation.g:1964:1: rule__Choose__Group__2__Impl : ( 'in' ) ;
    public final void rule__Choose__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1968:1: ( ( 'in' ) )
            // InternalBrowserAutomation.g:1969:1: ( 'in' )
            {
            // InternalBrowserAutomation.g:1969:1: ( 'in' )
            // InternalBrowserAutomation.g:1970:2: 'in'
            {
             before(grammarAccess.getChooseAccess().getInKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1979:1: rule__Choose__Group__3 : rule__Choose__Group__3__Impl ;
    public final void rule__Choose__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1983:1: ( rule__Choose__Group__3__Impl )
            // InternalBrowserAutomation.g:1984:2: rule__Choose__Group__3__Impl
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
    // InternalBrowserAutomation.g:1990:1: rule__Choose__Group__3__Impl : ( ( rule__Choose__VarAssignment_3 ) ) ;
    public final void rule__Choose__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1994:1: ( ( ( rule__Choose__VarAssignment_3 ) ) )
            // InternalBrowserAutomation.g:1995:1: ( ( rule__Choose__VarAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:1995:1: ( ( rule__Choose__VarAssignment_3 ) )
            // InternalBrowserAutomation.g:1996:2: ( rule__Choose__VarAssignment_3 )
            {
             before(grammarAccess.getChooseAccess().getVarAssignment_3()); 
            // InternalBrowserAutomation.g:1997:2: ( rule__Choose__VarAssignment_3 )
            // InternalBrowserAutomation.g:1997:3: rule__Choose__VarAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Choose__VarAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChooseAccess().getVarAssignment_3()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:2006:1: rule__Contains__Group__0 : rule__Contains__Group__0__Impl rule__Contains__Group__1 ;
    public final void rule__Contains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2010:1: ( rule__Contains__Group__0__Impl rule__Contains__Group__1 )
            // InternalBrowserAutomation.g:2011:2: rule__Contains__Group__0__Impl rule__Contains__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalBrowserAutomation.g:2018:1: rule__Contains__Group__0__Impl : ( ( rule__Contains__VarAssignment_0 ) ) ;
    public final void rule__Contains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2022:1: ( ( ( rule__Contains__VarAssignment_0 ) ) )
            // InternalBrowserAutomation.g:2023:1: ( ( rule__Contains__VarAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:2023:1: ( ( rule__Contains__VarAssignment_0 ) )
            // InternalBrowserAutomation.g:2024:2: ( rule__Contains__VarAssignment_0 )
            {
             before(grammarAccess.getContainsAccess().getVarAssignment_0()); 
            // InternalBrowserAutomation.g:2025:2: ( rule__Contains__VarAssignment_0 )
            // InternalBrowserAutomation.g:2025:3: rule__Contains__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Contains__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContainsAccess().getVarAssignment_0()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:2033:1: rule__Contains__Group__1 : rule__Contains__Group__1__Impl rule__Contains__Group__2 ;
    public final void rule__Contains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2037:1: ( rule__Contains__Group__1__Impl rule__Contains__Group__2 )
            // InternalBrowserAutomation.g:2038:2: rule__Contains__Group__1__Impl rule__Contains__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalBrowserAutomation.g:2045:1: rule__Contains__Group__1__Impl : ( 'contains' ) ;
    public final void rule__Contains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2049:1: ( ( 'contains' ) )
            // InternalBrowserAutomation.g:2050:1: ( 'contains' )
            {
            // InternalBrowserAutomation.g:2050:1: ( 'contains' )
            // InternalBrowserAutomation.g:2051:2: 'contains'
            {
             before(grammarAccess.getContainsAccess().getContainsKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:2060:1: rule__Contains__Group__2 : rule__Contains__Group__2__Impl ;
    public final void rule__Contains__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2064:1: ( rule__Contains__Group__2__Impl )
            // InternalBrowserAutomation.g:2065:2: rule__Contains__Group__2__Impl
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
    // InternalBrowserAutomation.g:2071:1: rule__Contains__Group__2__Impl : ( ( rule__Contains__Var2Assignment_2 ) ) ;
    public final void rule__Contains__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2075:1: ( ( ( rule__Contains__Var2Assignment_2 ) ) )
            // InternalBrowserAutomation.g:2076:1: ( ( rule__Contains__Var2Assignment_2 ) )
            {
            // InternalBrowserAutomation.g:2076:1: ( ( rule__Contains__Var2Assignment_2 ) )
            // InternalBrowserAutomation.g:2077:2: ( rule__Contains__Var2Assignment_2 )
            {
             before(grammarAccess.getContainsAccess().getVar2Assignment_2()); 
            // InternalBrowserAutomation.g:2078:2: ( rule__Contains__Var2Assignment_2 )
            // InternalBrowserAutomation.g:2078:3: rule__Contains__Var2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Contains__Var2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContainsAccess().getVar2Assignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__BrowserAutomation__WebBrowserAssignment_2"
    // InternalBrowserAutomation.g:2087:1: rule__BrowserAutomation__WebBrowserAssignment_2 : ( ruleWebBrowser ) ;
    public final void rule__BrowserAutomation__WebBrowserAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2091:1: ( ( ruleWebBrowser ) )
            // InternalBrowserAutomation.g:2092:2: ( ruleWebBrowser )
            {
            // InternalBrowserAutomation.g:2092:2: ( ruleWebBrowser )
            // InternalBrowserAutomation.g:2093:3: ruleWebBrowser
            {
             before(grammarAccess.getBrowserAutomationAccess().getWebBrowserWebBrowserParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWebBrowser();

            state._fsp--;

             after(grammarAccess.getBrowserAutomationAccess().getWebBrowserWebBrowserParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrowserAutomation__WebBrowserAssignment_2"


    // $ANTLR start "rule__BrowserAutomation__StatementsAssignment_3"
    // InternalBrowserAutomation.g:2102:1: rule__BrowserAutomation__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__BrowserAutomation__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2106:1: ( ( ruleStatement ) )
            // InternalBrowserAutomation.g:2107:2: ( ruleStatement )
            {
            // InternalBrowserAutomation.g:2107:2: ( ruleStatement )
            // InternalBrowserAutomation.g:2108:3: ruleStatement
            {
             before(grammarAccess.getBrowserAutomationAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBrowserAutomationAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrowserAutomation__StatementsAssignment_3"


    // $ANTLR start "rule__DoAction__GetAssignment_0"
    // InternalBrowserAutomation.g:2117:1: rule__DoAction__GetAssignment_0 : ( ruleGet ) ;
    public final void rule__DoAction__GetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2121:1: ( ( ruleGet ) )
            // InternalBrowserAutomation.g:2122:2: ( ruleGet )
            {
            // InternalBrowserAutomation.g:2122:2: ( ruleGet )
            // InternalBrowserAutomation.g:2123:3: ruleGet
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
    // InternalBrowserAutomation.g:2132:1: rule__DoAction__ActionAssignment_1 : ( ruleAction ) ;
    public final void rule__DoAction__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2136:1: ( ( ruleAction ) )
            // InternalBrowserAutomation.g:2137:2: ( ruleAction )
            {
            // InternalBrowserAutomation.g:2137:2: ( ruleAction )
            // InternalBrowserAutomation.g:2138:3: ruleAction
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
    // InternalBrowserAutomation.g:2147:1: rule__GoTo__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GoTo__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2151:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2152:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2152:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2153:3: RULE_STRING
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


    // $ANTLR start "rule__Get__VarAssignment_0"
    // InternalBrowserAutomation.g:2162:1: rule__Get__VarAssignment_0 : ( ruleVariable ) ;
    public final void rule__Get__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2166:1: ( ( ruleVariable ) )
            // InternalBrowserAutomation.g:2167:2: ( ruleVariable )
            {
            // InternalBrowserAutomation.g:2167:2: ( ruleVariable )
            // InternalBrowserAutomation.g:2168:3: ruleVariable
            {
             before(grammarAccess.getGetAccess().getVarVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getGetAccess().getVarVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__VarAssignment_0"


    // $ANTLR start "rule__Get__ElementAssignment_3_0_0"
    // InternalBrowserAutomation.g:2177:1: rule__Get__ElementAssignment_3_0_0 : ( ruleElement ) ;
    public final void rule__Get__ElementAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2181:1: ( ( ruleElement ) )
            // InternalBrowserAutomation.g:2182:2: ( ruleElement )
            {
            // InternalBrowserAutomation.g:2182:2: ( ruleElement )
            // InternalBrowserAutomation.g:2183:3: ruleElement
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
    // InternalBrowserAutomation.g:2192:1: rule__Get__OrderAssignment_3_0_1 : ( ruleOrder ) ;
    public final void rule__Get__OrderAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2196:1: ( ( ruleOrder ) )
            // InternalBrowserAutomation.g:2197:2: ( ruleOrder )
            {
            // InternalBrowserAutomation.g:2197:2: ( ruleOrder )
            // InternalBrowserAutomation.g:2198:3: ruleOrder
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
    // InternalBrowserAutomation.g:2207:1: rule__Get__AttrAssignment_3_0_2_0_1 : ( ruleAttribut ) ;
    public final void rule__Get__AttrAssignment_3_0_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2211:1: ( ( ruleAttribut ) )
            // InternalBrowserAutomation.g:2212:2: ( ruleAttribut )
            {
            // InternalBrowserAutomation.g:2212:2: ( ruleAttribut )
            // InternalBrowserAutomation.g:2213:3: ruleAttribut
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


    // $ANTLR start "rule__Get__AttrValAssignment_3_0_2_0_3_0"
    // InternalBrowserAutomation.g:2222:1: rule__Get__AttrValAssignment_3_0_2_0_3_0 : ( RULE_STRING ) ;
    public final void rule__Get__AttrValAssignment_3_0_2_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2226:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2227:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2227:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2228:3: RULE_STRING
            {
             before(grammarAccess.getGetAccess().getAttrValSTRINGTerminalRuleCall_3_0_2_0_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getAttrValSTRINGTerminalRuleCall_3_0_2_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__AttrValAssignment_3_0_2_0_3_0"


    // $ANTLR start "rule__Get__AttrVarAssignment_3_0_2_0_3_1"
    // InternalBrowserAutomation.g:2237:1: rule__Get__AttrVarAssignment_3_0_2_0_3_1 : ( ruleVarReference ) ;
    public final void rule__Get__AttrVarAssignment_3_0_2_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2241:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2242:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2242:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2243:3: ruleVarReference
            {
             before(grammarAccess.getGetAccess().getAttrVarVarReferenceParserRuleCall_3_0_2_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getGetAccess().getAttrVarVarReferenceParserRuleCall_3_0_2_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__AttrVarAssignment_3_0_2_0_3_1"


    // $ANTLR start "rule__Get__VarRefAssignment_3_0_2_1_1"
    // InternalBrowserAutomation.g:2252:1: rule__Get__VarRefAssignment_3_0_2_1_1 : ( ruleVarReference ) ;
    public final void rule__Get__VarRefAssignment_3_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2256:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2257:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2257:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2258:3: ruleVarReference
            {
             before(grammarAccess.getGetAccess().getVarRefVarReferenceParserRuleCall_3_0_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getGetAccess().getVarRefVarReferenceParserRuleCall_3_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__VarRefAssignment_3_0_2_1_1"


    // $ANTLR start "rule__Order__OrderAssignment_1"
    // InternalBrowserAutomation.g:2267:1: rule__Order__OrderAssignment_1 : ( RULE_INT ) ;
    public final void rule__Order__OrderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2271:1: ( ( RULE_INT ) )
            // InternalBrowserAutomation.g:2272:2: ( RULE_INT )
            {
            // InternalBrowserAutomation.g:2272:2: ( RULE_INT )
            // InternalBrowserAutomation.g:2273:3: RULE_INT
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
    // InternalBrowserAutomation.g:2282:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2286:1: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:2287:2: ( RULE_ID )
            {
            // InternalBrowserAutomation.g:2287:2: ( RULE_ID )
            // InternalBrowserAutomation.g:2288:3: RULE_ID
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


    // $ANTLR start "rule__VarReference__VarAssignment"
    // InternalBrowserAutomation.g:2297:1: rule__VarReference__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VarReference__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2301:1: ( ( ( RULE_ID ) ) )
            // InternalBrowserAutomation.g:2302:2: ( ( RULE_ID ) )
            {
            // InternalBrowserAutomation.g:2302:2: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:2303:3: ( RULE_ID )
            {
             before(grammarAccess.getVarReferenceAccess().getVarVariableCrossReference_0()); 
            // InternalBrowserAutomation.g:2304:3: ( RULE_ID )
            // InternalBrowserAutomation.g:2305:4: RULE_ID
            {
             before(grammarAccess.getVarReferenceAccess().getVarVariableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarReferenceAccess().getVarVariableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVarReferenceAccess().getVarVariableCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarReference__VarAssignment"


    // $ANTLR start "rule__Click__VarAssignment_2"
    // InternalBrowserAutomation.g:2316:1: rule__Click__VarAssignment_2 : ( ruleVarReference ) ;
    public final void rule__Click__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2320:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2321:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2321:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2322:3: ruleVarReference
            {
             before(grammarAccess.getClickAccess().getVarVarReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getClickAccess().getVarVarReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__VarAssignment_2"


    // $ANTLR start "rule__Insert__ValAssignment_1_0"
    // InternalBrowserAutomation.g:2331:1: rule__Insert__ValAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__Insert__ValAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2335:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2336:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2336:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2337:3: RULE_STRING
            {
             before(grammarAccess.getInsertAccess().getValSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getValSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__ValAssignment_1_0"


    // $ANTLR start "rule__Insert__VarRefAssignment_1_1"
    // InternalBrowserAutomation.g:2346:1: rule__Insert__VarRefAssignment_1_1 : ( ruleVarReference ) ;
    public final void rule__Insert__VarRefAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2350:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2351:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2351:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2352:3: ruleVarReference
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
    // InternalBrowserAutomation.g:2361:1: rule__Insert__Var2Assignment_3 : ( ruleVarReference ) ;
    public final void rule__Insert__Var2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2365:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2366:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2366:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2367:3: ruleVarReference
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


    // $ANTLR start "rule__Verify__VarAssignment_0"
    // InternalBrowserAutomation.g:2376:1: rule__Verify__VarAssignment_0 : ( ruleVarReference ) ;
    public final void rule__Verify__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2380:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2381:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2381:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2382:3: ruleVarReference
            {
             before(grammarAccess.getVerifyAccess().getVarVarReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getVarVarReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__VarAssignment_0"


    // $ANTLR start "rule__Check__VarAssignment_1"
    // InternalBrowserAutomation.g:2391:1: rule__Check__VarAssignment_1 : ( ruleVarReference ) ;
    public final void rule__Check__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2395:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2396:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2396:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2397:3: ruleVarReference
            {
             before(grammarAccess.getCheckAccess().getVarVarReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getCheckAccess().getVarVarReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__VarAssignment_1"


    // $ANTLR start "rule__Choose__ValueAssignment_1"
    // InternalBrowserAutomation.g:2406:1: rule__Choose__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Choose__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2410:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2411:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2411:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2412:3: RULE_STRING
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


    // $ANTLR start "rule__Choose__VarAssignment_3"
    // InternalBrowserAutomation.g:2421:1: rule__Choose__VarAssignment_3 : ( ruleVarReference ) ;
    public final void rule__Choose__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2425:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2426:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2426:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2427:3: ruleVarReference
            {
             before(grammarAccess.getChooseAccess().getVarVarReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getChooseAccess().getVarVarReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__VarAssignment_3"


    // $ANTLR start "rule__Contains__VarAssignment_0"
    // InternalBrowserAutomation.g:2436:1: rule__Contains__VarAssignment_0 : ( ruleVarReference ) ;
    public final void rule__Contains__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2440:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2441:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2441:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2442:3: ruleVarReference
            {
             before(grammarAccess.getContainsAccess().getVarVarReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getContainsAccess().getVarVarReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__VarAssignment_0"


    // $ANTLR start "rule__Contains__Var2Assignment_2"
    // InternalBrowserAutomation.g:2451:1: rule__Contains__Var2Assignment_2 : ( ruleVarReference ) ;
    public final void rule__Contains__Var2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2455:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2456:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2456:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2457:3: ruleVarReference
            {
             before(grammarAccess.getContainsAccess().getVar2VarReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getContainsAccess().getVar2VarReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__Var2Assignment_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\40\uffff";
    static final String dfa_2s = "\16\uffff\1\22\14\uffff\1\22\3\uffff\1\22";
    static final String dfa_3s = "\1\6\1\42\2\uffff\1\43\1\17\10\44\1\6\1\5\1\30\1\6\1\uffff\1\42\1\uffff\1\44\5\45\1\6\1\4\2\46\1\6";
    static final String dfa_4s = "\1\40\1\42\2\uffff\1\43\1\27\10\50\1\61\1\5\1\34\1\6\1\uffff\1\62\1\uffff\1\47\5\45\1\61\1\6\2\46\1\61";
    static final String dfa_5s = "\2\uffff\1\3\1\4\16\uffff\1\2\1\uffff\1\1\13\uffff";
    static final String dfa_6s = "\40\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\27\uffff\1\3\1\uffff\1\2",
            "\1\4",
            "",
            "",
            "\1\5",
            "\1\16\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\20\2\uffff\1\21\1\17",
            "\1\20\2\uffff\1\21\1\17",
            "\1\20\2\uffff\1\21\1\17",
            "\1\20\2\uffff\1\21\1\17",
            "\1\20\2\uffff\1\21\1\17",
            "\1\20\2\uffff\1\21\1\17",
            "\1\20\2\uffff\1\21\1\17",
            "\1\20\2\uffff\1\21\1\17",
            "\1\23\27\uffff\1\22\1\uffff\1\22\10\uffff\1\24\1\uffff\1\24\4\uffff\2\24",
            "\1\25",
            "\1\26\1\27\1\30\1\31\1\32",
            "\1\33",
            "",
            "\1\22\12\uffff\1\24\4\uffff\1\24",
            "",
            "\1\20\2\uffff\1\21",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\23\27\uffff\1\22\1\uffff\1\22\10\uffff\1\24\1\uffff\1\24\4\uffff\2\24",
            "\1\35\1\uffff\1\36",
            "\1\37",
            "\1\37",
            "\1\23\27\uffff\1\22\1\uffff\1\22\10\uffff\1\24\1\uffff\1\24\4\uffff\2\24"
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
            return "560:1: rule__Statement__Alternatives : ( ( ruleDoAction ) | ( ruleGet ) | ( ruleUncheckAll ) | ( ruleGoTo ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000140000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000140000042L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00030A0000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000FF8000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000019000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000000000000L});

}