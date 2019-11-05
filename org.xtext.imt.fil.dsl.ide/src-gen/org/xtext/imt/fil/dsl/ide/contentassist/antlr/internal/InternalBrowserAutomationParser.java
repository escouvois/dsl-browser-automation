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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mozilla'", "'chrome'", "'safari'", "'pageTitle'", "'link'", "'input'", "'button'", "'checkbox'", "'combobox'", "'image'", "'text'", "'title'", "'class'", "'value'", "'alt'", "'name'", "'href'", "'open'", "'internet'", "'explorer'", "'uncheck'", "'all'", "'go'", "'to'", "'='", "'get'", "'by'", "'['", "']'", "'from'", "'number'", "'click'", "'on'", "'insert'", "'in'", "'is'", "'not'", "'null'", "'check'", "'choose'", "'contains'"
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



    // $ANTLR start "entryRuleTest"
    // InternalBrowserAutomation.g:53:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:54:1: ( ruleTest EOF )
            // InternalBrowserAutomation.g:55:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalBrowserAutomation.g:62:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:66:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalBrowserAutomation.g:67:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalBrowserAutomation.g:67:2: ( ( rule__Test__Group__0 ) )
            // InternalBrowserAutomation.g:68:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalBrowserAutomation.g:69:3: ( rule__Test__Group__0 )
            // InternalBrowserAutomation.g:69:4: rule__Test__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


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


    // $ANTLR start "entryRuleAction"
    // InternalBrowserAutomation.g:128:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:129:1: ( ruleAction EOF )
            // InternalBrowserAutomation.g:130:1: ruleAction EOF
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
    // InternalBrowserAutomation.g:137:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:141:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalBrowserAutomation.g:142:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalBrowserAutomation.g:142:2: ( ( rule__Action__Alternatives ) )
            // InternalBrowserAutomation.g:143:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:144:3: ( rule__Action__Alternatives )
            // InternalBrowserAutomation.g:144:4: rule__Action__Alternatives
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


    // $ANTLR start "entryRuleGet"
    // InternalBrowserAutomation.g:153:1: entryRuleGet : ruleGet EOF ;
    public final void entryRuleGet() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:154:1: ( ruleGet EOF )
            // InternalBrowserAutomation.g:155:1: ruleGet EOF
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
    // InternalBrowserAutomation.g:162:1: ruleGet : ( ( rule__Get__Group__0 ) ) ;
    public final void ruleGet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:166:2: ( ( ( rule__Get__Group__0 ) ) )
            // InternalBrowserAutomation.g:167:2: ( ( rule__Get__Group__0 ) )
            {
            // InternalBrowserAutomation.g:167:2: ( ( rule__Get__Group__0 ) )
            // InternalBrowserAutomation.g:168:3: ( rule__Get__Group__0 )
            {
             before(grammarAccess.getGetAccess().getGroup()); 
            // InternalBrowserAutomation.g:169:3: ( rule__Get__Group__0 )
            // InternalBrowserAutomation.g:169:4: rule__Get__Group__0
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
    // InternalBrowserAutomation.g:178:1: entryRuleOrder : ruleOrder EOF ;
    public final void entryRuleOrder() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:179:1: ( ruleOrder EOF )
            // InternalBrowserAutomation.g:180:1: ruleOrder EOF
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
    // InternalBrowserAutomation.g:187:1: ruleOrder : ( ( rule__Order__Group__0 ) ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:191:2: ( ( ( rule__Order__Group__0 ) ) )
            // InternalBrowserAutomation.g:192:2: ( ( rule__Order__Group__0 ) )
            {
            // InternalBrowserAutomation.g:192:2: ( ( rule__Order__Group__0 ) )
            // InternalBrowserAutomation.g:193:3: ( rule__Order__Group__0 )
            {
             before(grammarAccess.getOrderAccess().getGroup()); 
            // InternalBrowserAutomation.g:194:3: ( rule__Order__Group__0 )
            // InternalBrowserAutomation.g:194:4: rule__Order__Group__0
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
    // InternalBrowserAutomation.g:203:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:204:1: ( ruleElement EOF )
            // InternalBrowserAutomation.g:205:1: ruleElement EOF
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
    // InternalBrowserAutomation.g:212:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:216:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalBrowserAutomation.g:217:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalBrowserAutomation.g:217:2: ( ( rule__Element__Alternatives ) )
            // InternalBrowserAutomation.g:218:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:219:3: ( rule__Element__Alternatives )
            // InternalBrowserAutomation.g:219:4: rule__Element__Alternatives
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
    // InternalBrowserAutomation.g:228:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:229:1: ( ruleAttribut EOF )
            // InternalBrowserAutomation.g:230:1: ruleAttribut EOF
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
    // InternalBrowserAutomation.g:237:1: ruleAttribut : ( ( rule__Attribut__Alternatives ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:241:2: ( ( ( rule__Attribut__Alternatives ) ) )
            // InternalBrowserAutomation.g:242:2: ( ( rule__Attribut__Alternatives ) )
            {
            // InternalBrowserAutomation.g:242:2: ( ( rule__Attribut__Alternatives ) )
            // InternalBrowserAutomation.g:243:3: ( rule__Attribut__Alternatives )
            {
             before(grammarAccess.getAttributAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:244:3: ( rule__Attribut__Alternatives )
            // InternalBrowserAutomation.g:244:4: rule__Attribut__Alternatives
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
    // InternalBrowserAutomation.g:253:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:254:1: ( ruleVariable EOF )
            // InternalBrowserAutomation.g:255:1: ruleVariable EOF
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
    // InternalBrowserAutomation.g:262:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:266:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalBrowserAutomation.g:267:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalBrowserAutomation.g:267:2: ( ( rule__Variable__NameAssignment ) )
            // InternalBrowserAutomation.g:268:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalBrowserAutomation.g:269:3: ( rule__Variable__NameAssignment )
            // InternalBrowserAutomation.g:269:4: rule__Variable__NameAssignment
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
    // InternalBrowserAutomation.g:278:1: entryRuleVarReference : ruleVarReference EOF ;
    public final void entryRuleVarReference() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:279:1: ( ruleVarReference EOF )
            // InternalBrowserAutomation.g:280:1: ruleVarReference EOF
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
    // InternalBrowserAutomation.g:287:1: ruleVarReference : ( ( rule__VarReference__VarAssignment ) ) ;
    public final void ruleVarReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:291:2: ( ( ( rule__VarReference__VarAssignment ) ) )
            // InternalBrowserAutomation.g:292:2: ( ( rule__VarReference__VarAssignment ) )
            {
            // InternalBrowserAutomation.g:292:2: ( ( rule__VarReference__VarAssignment ) )
            // InternalBrowserAutomation.g:293:3: ( rule__VarReference__VarAssignment )
            {
             before(grammarAccess.getVarReferenceAccess().getVarAssignment()); 
            // InternalBrowserAutomation.g:294:3: ( rule__VarReference__VarAssignment )
            // InternalBrowserAutomation.g:294:4: rule__VarReference__VarAssignment
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
    // InternalBrowserAutomation.g:303:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:304:1: ( ruleClick EOF )
            // InternalBrowserAutomation.g:305:1: ruleClick EOF
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
    // InternalBrowserAutomation.g:312:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:316:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalBrowserAutomation.g:317:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalBrowserAutomation.g:317:2: ( ( rule__Click__Group__0 ) )
            // InternalBrowserAutomation.g:318:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalBrowserAutomation.g:319:3: ( rule__Click__Group__0 )
            // InternalBrowserAutomation.g:319:4: rule__Click__Group__0
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
    // InternalBrowserAutomation.g:328:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:329:1: ( ruleInsert EOF )
            // InternalBrowserAutomation.g:330:1: ruleInsert EOF
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
    // InternalBrowserAutomation.g:337:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:341:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalBrowserAutomation.g:342:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalBrowserAutomation.g:342:2: ( ( rule__Insert__Group__0 ) )
            // InternalBrowserAutomation.g:343:3: ( rule__Insert__Group__0 )
            {
             before(grammarAccess.getInsertAccess().getGroup()); 
            // InternalBrowserAutomation.g:344:3: ( rule__Insert__Group__0 )
            // InternalBrowserAutomation.g:344:4: rule__Insert__Group__0
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
    // InternalBrowserAutomation.g:353:1: entryRuleVerify : ruleVerify EOF ;
    public final void entryRuleVerify() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:354:1: ( ruleVerify EOF )
            // InternalBrowserAutomation.g:355:1: ruleVerify EOF
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
    // InternalBrowserAutomation.g:362:1: ruleVerify : ( ( rule__Verify__Group__0 ) ) ;
    public final void ruleVerify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:366:2: ( ( ( rule__Verify__Group__0 ) ) )
            // InternalBrowserAutomation.g:367:2: ( ( rule__Verify__Group__0 ) )
            {
            // InternalBrowserAutomation.g:367:2: ( ( rule__Verify__Group__0 ) )
            // InternalBrowserAutomation.g:368:3: ( rule__Verify__Group__0 )
            {
             before(grammarAccess.getVerifyAccess().getGroup()); 
            // InternalBrowserAutomation.g:369:3: ( rule__Verify__Group__0 )
            // InternalBrowserAutomation.g:369:4: rule__Verify__Group__0
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
    // InternalBrowserAutomation.g:378:1: entryRuleCheck : ruleCheck EOF ;
    public final void entryRuleCheck() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:379:1: ( ruleCheck EOF )
            // InternalBrowserAutomation.g:380:1: ruleCheck EOF
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
    // InternalBrowserAutomation.g:387:1: ruleCheck : ( ( rule__Check__Group__0 ) ) ;
    public final void ruleCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:391:2: ( ( ( rule__Check__Group__0 ) ) )
            // InternalBrowserAutomation.g:392:2: ( ( rule__Check__Group__0 ) )
            {
            // InternalBrowserAutomation.g:392:2: ( ( rule__Check__Group__0 ) )
            // InternalBrowserAutomation.g:393:3: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // InternalBrowserAutomation.g:394:3: ( rule__Check__Group__0 )
            // InternalBrowserAutomation.g:394:4: rule__Check__Group__0
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
    // InternalBrowserAutomation.g:403:1: entryRuleChoose : ruleChoose EOF ;
    public final void entryRuleChoose() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:404:1: ( ruleChoose EOF )
            // InternalBrowserAutomation.g:405:1: ruleChoose EOF
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
    // InternalBrowserAutomation.g:412:1: ruleChoose : ( ( rule__Choose__Group__0 ) ) ;
    public final void ruleChoose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:416:2: ( ( ( rule__Choose__Group__0 ) ) )
            // InternalBrowserAutomation.g:417:2: ( ( rule__Choose__Group__0 ) )
            {
            // InternalBrowserAutomation.g:417:2: ( ( rule__Choose__Group__0 ) )
            // InternalBrowserAutomation.g:418:3: ( rule__Choose__Group__0 )
            {
             before(grammarAccess.getChooseAccess().getGroup()); 
            // InternalBrowserAutomation.g:419:3: ( rule__Choose__Group__0 )
            // InternalBrowserAutomation.g:419:4: rule__Choose__Group__0
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
    // InternalBrowserAutomation.g:428:1: entryRuleContains : ruleContains EOF ;
    public final void entryRuleContains() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:429:1: ( ruleContains EOF )
            // InternalBrowserAutomation.g:430:1: ruleContains EOF
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
    // InternalBrowserAutomation.g:437:1: ruleContains : ( ( rule__Contains__Group__0 ) ) ;
    public final void ruleContains() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:441:2: ( ( ( rule__Contains__Group__0 ) ) )
            // InternalBrowserAutomation.g:442:2: ( ( rule__Contains__Group__0 ) )
            {
            // InternalBrowserAutomation.g:442:2: ( ( rule__Contains__Group__0 ) )
            // InternalBrowserAutomation.g:443:3: ( rule__Contains__Group__0 )
            {
             before(grammarAccess.getContainsAccess().getGroup()); 
            // InternalBrowserAutomation.g:444:3: ( rule__Contains__Group__0 )
            // InternalBrowserAutomation.g:444:4: rule__Contains__Group__0
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
    // InternalBrowserAutomation.g:452:1: rule__WebBrowser__Alternatives : ( ( 'mozilla' ) | ( 'chrome' ) | ( 'safari' ) | ( ( rule__WebBrowser__Group_3__0 ) ) );
    public final void rule__WebBrowser__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:456:1: ( ( 'mozilla' ) | ( 'chrome' ) | ( 'safari' ) | ( ( rule__WebBrowser__Group_3__0 ) ) )
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
            case 29:
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
                    // InternalBrowserAutomation.g:457:2: ( 'mozilla' )
                    {
                    // InternalBrowserAutomation.g:457:2: ( 'mozilla' )
                    // InternalBrowserAutomation.g:458:3: 'mozilla'
                    {
                     before(grammarAccess.getWebBrowserAccess().getMozillaKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getMozillaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:463:2: ( 'chrome' )
                    {
                    // InternalBrowserAutomation.g:463:2: ( 'chrome' )
                    // InternalBrowserAutomation.g:464:3: 'chrome'
                    {
                     before(grammarAccess.getWebBrowserAccess().getChromeKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getChromeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:469:2: ( 'safari' )
                    {
                    // InternalBrowserAutomation.g:469:2: ( 'safari' )
                    // InternalBrowserAutomation.g:470:3: 'safari'
                    {
                     before(grammarAccess.getWebBrowserAccess().getSafariKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getSafariKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:475:2: ( ( rule__WebBrowser__Group_3__0 ) )
                    {
                    // InternalBrowserAutomation.g:475:2: ( ( rule__WebBrowser__Group_3__0 ) )
                    // InternalBrowserAutomation.g:476:3: ( rule__WebBrowser__Group_3__0 )
                    {
                     before(grammarAccess.getWebBrowserAccess().getGroup_3()); 
                    // InternalBrowserAutomation.g:477:3: ( rule__WebBrowser__Group_3__0 )
                    // InternalBrowserAutomation.g:477:4: rule__WebBrowser__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WebBrowser__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWebBrowserAccess().getGroup_3()); 

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
    // InternalBrowserAutomation.g:485:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ruleGet ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:489:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ruleGet ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalBrowserAutomation.g:490:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalBrowserAutomation.g:490:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalBrowserAutomation.g:491:3: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // InternalBrowserAutomation.g:492:3: ( rule__Statement__Group_0__0 )
                    // InternalBrowserAutomation.g:492:4: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:496:2: ( ruleGet )
                    {
                    // InternalBrowserAutomation.g:496:2: ( ruleGet )
                    // InternalBrowserAutomation.g:497:3: ruleGet
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
                    // InternalBrowserAutomation.g:502:2: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // InternalBrowserAutomation.g:502:2: ( ( rule__Statement__Group_2__0 ) )
                    // InternalBrowserAutomation.g:503:3: ( rule__Statement__Group_2__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2()); 
                    // InternalBrowserAutomation.g:504:3: ( rule__Statement__Group_2__0 )
                    // InternalBrowserAutomation.g:504:4: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:508:2: ( ( rule__Statement__Group_3__0 ) )
                    {
                    // InternalBrowserAutomation.g:508:2: ( ( rule__Statement__Group_3__0 ) )
                    // InternalBrowserAutomation.g:509:3: ( rule__Statement__Group_3__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_3()); 
                    // InternalBrowserAutomation.g:510:3: ( rule__Statement__Group_3__0 )
                    // InternalBrowserAutomation.g:510:4: rule__Statement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_3()); 

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
    // InternalBrowserAutomation.g:518:1: rule__Action__Alternatives : ( ( ruleClick ) | ( ruleInsert ) | ( ruleVerify ) | ( ruleCheck ) | ( ruleChoose ) | ( ruleContains ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:522:1: ( ( ruleClick ) | ( ruleInsert ) | ( ruleVerify ) | ( ruleCheck ) | ( ruleChoose ) | ( ruleContains ) )
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
                    // InternalBrowserAutomation.g:523:2: ( ruleClick )
                    {
                    // InternalBrowserAutomation.g:523:2: ( ruleClick )
                    // InternalBrowserAutomation.g:524:3: ruleClick
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
                    // InternalBrowserAutomation.g:529:2: ( ruleInsert )
                    {
                    // InternalBrowserAutomation.g:529:2: ( ruleInsert )
                    // InternalBrowserAutomation.g:530:3: ruleInsert
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
                    // InternalBrowserAutomation.g:535:2: ( ruleVerify )
                    {
                    // InternalBrowserAutomation.g:535:2: ( ruleVerify )
                    // InternalBrowserAutomation.g:536:3: ruleVerify
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
                    // InternalBrowserAutomation.g:541:2: ( ruleCheck )
                    {
                    // InternalBrowserAutomation.g:541:2: ( ruleCheck )
                    // InternalBrowserAutomation.g:542:3: ruleCheck
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
                    // InternalBrowserAutomation.g:547:2: ( ruleChoose )
                    {
                    // InternalBrowserAutomation.g:547:2: ( ruleChoose )
                    // InternalBrowserAutomation.g:548:3: ruleChoose
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
                    // InternalBrowserAutomation.g:553:2: ( ruleContains )
                    {
                    // InternalBrowserAutomation.g:553:2: ( ruleContains )
                    // InternalBrowserAutomation.g:554:3: ruleContains
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
    // InternalBrowserAutomation.g:563:1: rule__Get__Alternatives_3 : ( ( ( rule__Get__Group_3_0__0 ) ) | ( 'pageTitle' ) );
    public final void rule__Get__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:567:1: ( ( ( rule__Get__Group_3_0__0 ) ) | ( 'pageTitle' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=15 && LA4_0<=22)) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBrowserAutomation.g:568:2: ( ( rule__Get__Group_3_0__0 ) )
                    {
                    // InternalBrowserAutomation.g:568:2: ( ( rule__Get__Group_3_0__0 ) )
                    // InternalBrowserAutomation.g:569:3: ( rule__Get__Group_3_0__0 )
                    {
                     before(grammarAccess.getGetAccess().getGroup_3_0()); 
                    // InternalBrowserAutomation.g:570:3: ( rule__Get__Group_3_0__0 )
                    // InternalBrowserAutomation.g:570:4: rule__Get__Group_3_0__0
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
                    // InternalBrowserAutomation.g:574:2: ( 'pageTitle' )
                    {
                    // InternalBrowserAutomation.g:574:2: ( 'pageTitle' )
                    // InternalBrowserAutomation.g:575:3: 'pageTitle'
                    {
                     before(grammarAccess.getGetAccess().getPageTitleKeyword_3_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:584:1: rule__Get__Alternatives_3_0_2 : ( ( ( rule__Get__Group_3_0_2_0__0 ) ) | ( ( rule__Get__Group_3_0_2_1__0 ) ) );
    public final void rule__Get__Alternatives_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:588:1: ( ( ( rule__Get__Group_3_0_2_0__0 ) ) | ( ( rule__Get__Group_3_0_2_1__0 ) ) )
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
                    // InternalBrowserAutomation.g:589:2: ( ( rule__Get__Group_3_0_2_0__0 ) )
                    {
                    // InternalBrowserAutomation.g:589:2: ( ( rule__Get__Group_3_0_2_0__0 ) )
                    // InternalBrowserAutomation.g:590:3: ( rule__Get__Group_3_0_2_0__0 )
                    {
                     before(grammarAccess.getGetAccess().getGroup_3_0_2_0()); 
                    // InternalBrowserAutomation.g:591:3: ( rule__Get__Group_3_0_2_0__0 )
                    // InternalBrowserAutomation.g:591:4: rule__Get__Group_3_0_2_0__0
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
                    // InternalBrowserAutomation.g:595:2: ( ( rule__Get__Group_3_0_2_1__0 ) )
                    {
                    // InternalBrowserAutomation.g:595:2: ( ( rule__Get__Group_3_0_2_1__0 ) )
                    // InternalBrowserAutomation.g:596:3: ( rule__Get__Group_3_0_2_1__0 )
                    {
                     before(grammarAccess.getGetAccess().getGroup_3_0_2_1()); 
                    // InternalBrowserAutomation.g:597:3: ( rule__Get__Group_3_0_2_1__0 )
                    // InternalBrowserAutomation.g:597:4: rule__Get__Group_3_0_2_1__0
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
    // InternalBrowserAutomation.g:605:1: rule__Get__Alternatives_3_0_2_0_3 : ( ( ( rule__Get__AttrValAssignment_3_0_2_0_3_0 ) ) | ( ( rule__Get__AttrVarAssignment_3_0_2_0_3_1 ) ) );
    public final void rule__Get__Alternatives_3_0_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:609:1: ( ( ( rule__Get__AttrValAssignment_3_0_2_0_3_0 ) ) | ( ( rule__Get__AttrVarAssignment_3_0_2_0_3_1 ) ) )
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
                    // InternalBrowserAutomation.g:610:2: ( ( rule__Get__AttrValAssignment_3_0_2_0_3_0 ) )
                    {
                    // InternalBrowserAutomation.g:610:2: ( ( rule__Get__AttrValAssignment_3_0_2_0_3_0 ) )
                    // InternalBrowserAutomation.g:611:3: ( rule__Get__AttrValAssignment_3_0_2_0_3_0 )
                    {
                     before(grammarAccess.getGetAccess().getAttrValAssignment_3_0_2_0_3_0()); 
                    // InternalBrowserAutomation.g:612:3: ( rule__Get__AttrValAssignment_3_0_2_0_3_0 )
                    // InternalBrowserAutomation.g:612:4: rule__Get__AttrValAssignment_3_0_2_0_3_0
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
                    // InternalBrowserAutomation.g:616:2: ( ( rule__Get__AttrVarAssignment_3_0_2_0_3_1 ) )
                    {
                    // InternalBrowserAutomation.g:616:2: ( ( rule__Get__AttrVarAssignment_3_0_2_0_3_1 ) )
                    // InternalBrowserAutomation.g:617:3: ( rule__Get__AttrVarAssignment_3_0_2_0_3_1 )
                    {
                     before(grammarAccess.getGetAccess().getAttrVarAssignment_3_0_2_0_3_1()); 
                    // InternalBrowserAutomation.g:618:3: ( rule__Get__AttrVarAssignment_3_0_2_0_3_1 )
                    // InternalBrowserAutomation.g:618:4: rule__Get__AttrVarAssignment_3_0_2_0_3_1
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
    // InternalBrowserAutomation.g:626:1: rule__Element__Alternatives : ( ( 'link' ) | ( 'input' ) | ( 'button' ) | ( 'checkbox' ) | ( 'combobox' ) | ( 'image' ) | ( 'text' ) | ( 'title' ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:630:1: ( ( 'link' ) | ( 'input' ) | ( 'button' ) | ( 'checkbox' ) | ( 'combobox' ) | ( 'image' ) | ( 'text' ) | ( 'title' ) )
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
                    // InternalBrowserAutomation.g:631:2: ( 'link' )
                    {
                    // InternalBrowserAutomation.g:631:2: ( 'link' )
                    // InternalBrowserAutomation.g:632:3: 'link'
                    {
                     before(grammarAccess.getElementAccess().getLinkKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getLinkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:637:2: ( 'input' )
                    {
                    // InternalBrowserAutomation.g:637:2: ( 'input' )
                    // InternalBrowserAutomation.g:638:3: 'input'
                    {
                     before(grammarAccess.getElementAccess().getInputKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getInputKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:643:2: ( 'button' )
                    {
                    // InternalBrowserAutomation.g:643:2: ( 'button' )
                    // InternalBrowserAutomation.g:644:3: 'button'
                    {
                     before(grammarAccess.getElementAccess().getButtonKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getButtonKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:649:2: ( 'checkbox' )
                    {
                    // InternalBrowserAutomation.g:649:2: ( 'checkbox' )
                    // InternalBrowserAutomation.g:650:3: 'checkbox'
                    {
                     before(grammarAccess.getElementAccess().getCheckboxKeyword_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getCheckboxKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:655:2: ( 'combobox' )
                    {
                    // InternalBrowserAutomation.g:655:2: ( 'combobox' )
                    // InternalBrowserAutomation.g:656:3: 'combobox'
                    {
                     before(grammarAccess.getElementAccess().getComboboxKeyword_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getComboboxKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:661:2: ( 'image' )
                    {
                    // InternalBrowserAutomation.g:661:2: ( 'image' )
                    // InternalBrowserAutomation.g:662:3: 'image'
                    {
                     before(grammarAccess.getElementAccess().getImageKeyword_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getImageKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBrowserAutomation.g:667:2: ( 'text' )
                    {
                    // InternalBrowserAutomation.g:667:2: ( 'text' )
                    // InternalBrowserAutomation.g:668:3: 'text'
                    {
                     before(grammarAccess.getElementAccess().getTextKeyword_6()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getTextKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBrowserAutomation.g:673:2: ( 'title' )
                    {
                    // InternalBrowserAutomation.g:673:2: ( 'title' )
                    // InternalBrowserAutomation.g:674:3: 'title'
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
    // InternalBrowserAutomation.g:683:1: rule__Attribut__Alternatives : ( ( 'class' ) | ( 'value' ) | ( 'alt' ) | ( 'name' ) | ( 'href' ) );
    public final void rule__Attribut__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:687:1: ( ( 'class' ) | ( 'value' ) | ( 'alt' ) | ( 'name' ) | ( 'href' ) )
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
                    // InternalBrowserAutomation.g:688:2: ( 'class' )
                    {
                    // InternalBrowserAutomation.g:688:2: ( 'class' )
                    // InternalBrowserAutomation.g:689:3: 'class'
                    {
                     before(grammarAccess.getAttributAccess().getClassKeyword_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getClassKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:694:2: ( 'value' )
                    {
                    // InternalBrowserAutomation.g:694:2: ( 'value' )
                    // InternalBrowserAutomation.g:695:3: 'value'
                    {
                     before(grammarAccess.getAttributAccess().getValueKeyword_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getValueKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:700:2: ( 'alt' )
                    {
                    // InternalBrowserAutomation.g:700:2: ( 'alt' )
                    // InternalBrowserAutomation.g:701:3: 'alt'
                    {
                     before(grammarAccess.getAttributAccess().getAltKeyword_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getAltKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:706:2: ( 'name' )
                    {
                    // InternalBrowserAutomation.g:706:2: ( 'name' )
                    // InternalBrowserAutomation.g:707:3: 'name'
                    {
                     before(grammarAccess.getAttributAccess().getNameKeyword_3()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getNameKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:712:2: ( 'href' )
                    {
                    // InternalBrowserAutomation.g:712:2: ( 'href' )
                    // InternalBrowserAutomation.g:713:3: 'href'
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


    // $ANTLR start "rule__Test__Group__0"
    // InternalBrowserAutomation.g:722:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:726:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalBrowserAutomation.g:727:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__1();

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
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // InternalBrowserAutomation.g:734:1: rule__Test__Group__0__Impl : ( () ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:738:1: ( ( () ) )
            // InternalBrowserAutomation.g:739:1: ( () )
            {
            // InternalBrowserAutomation.g:739:1: ( () )
            // InternalBrowserAutomation.g:740:2: ()
            {
             before(grammarAccess.getTestAccess().getTestAction_0()); 
            // InternalBrowserAutomation.g:741:2: ()
            // InternalBrowserAutomation.g:741:3: 
            {
            }

             after(grammarAccess.getTestAccess().getTestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // InternalBrowserAutomation.g:749:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:753:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalBrowserAutomation.g:754:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__2();

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
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // InternalBrowserAutomation.g:761:1: rule__Test__Group__1__Impl : ( 'open' ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:765:1: ( ( 'open' ) )
            // InternalBrowserAutomation.g:766:1: ( 'open' )
            {
            // InternalBrowserAutomation.g:766:1: ( 'open' )
            // InternalBrowserAutomation.g:767:2: 'open'
            {
             before(grammarAccess.getTestAccess().getOpenKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getOpenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // InternalBrowserAutomation.g:776:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:780:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalBrowserAutomation.g:781:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__3();

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
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // InternalBrowserAutomation.g:788:1: rule__Test__Group__2__Impl : ( ( rule__Test__WebBrowserAssignment_2 ) ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:792:1: ( ( ( rule__Test__WebBrowserAssignment_2 ) ) )
            // InternalBrowserAutomation.g:793:1: ( ( rule__Test__WebBrowserAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:793:1: ( ( rule__Test__WebBrowserAssignment_2 ) )
            // InternalBrowserAutomation.g:794:2: ( rule__Test__WebBrowserAssignment_2 )
            {
             before(grammarAccess.getTestAccess().getWebBrowserAssignment_2()); 
            // InternalBrowserAutomation.g:795:2: ( rule__Test__WebBrowserAssignment_2 )
            // InternalBrowserAutomation.g:795:3: rule__Test__WebBrowserAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Test__WebBrowserAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getWebBrowserAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // InternalBrowserAutomation.g:803:1: rule__Test__Group__3 : rule__Test__Group__3__Impl ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:807:1: ( rule__Test__Group__3__Impl )
            // InternalBrowserAutomation.g:808:2: rule__Test__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__3__Impl();

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
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // InternalBrowserAutomation.g:814:1: rule__Test__Group__3__Impl : ( ( rule__Test__StatementsAssignment_3 )* ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:818:1: ( ( ( rule__Test__StatementsAssignment_3 )* ) )
            // InternalBrowserAutomation.g:819:1: ( ( rule__Test__StatementsAssignment_3 )* )
            {
            // InternalBrowserAutomation.g:819:1: ( ( rule__Test__StatementsAssignment_3 )* )
            // InternalBrowserAutomation.g:820:2: ( rule__Test__StatementsAssignment_3 )*
            {
             before(grammarAccess.getTestAccess().getStatementsAssignment_3()); 
            // InternalBrowserAutomation.g:821:2: ( rule__Test__StatementsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==31||LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBrowserAutomation.g:821:3: rule__Test__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Test__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__WebBrowser__Group_3__0"
    // InternalBrowserAutomation.g:830:1: rule__WebBrowser__Group_3__0 : rule__WebBrowser__Group_3__0__Impl rule__WebBrowser__Group_3__1 ;
    public final void rule__WebBrowser__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:834:1: ( rule__WebBrowser__Group_3__0__Impl rule__WebBrowser__Group_3__1 )
            // InternalBrowserAutomation.g:835:2: rule__WebBrowser__Group_3__0__Impl rule__WebBrowser__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__WebBrowser__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WebBrowser__Group_3__1();

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
    // $ANTLR end "rule__WebBrowser__Group_3__0"


    // $ANTLR start "rule__WebBrowser__Group_3__0__Impl"
    // InternalBrowserAutomation.g:842:1: rule__WebBrowser__Group_3__0__Impl : ( 'internet' ) ;
    public final void rule__WebBrowser__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:846:1: ( ( 'internet' ) )
            // InternalBrowserAutomation.g:847:1: ( 'internet' )
            {
            // InternalBrowserAutomation.g:847:1: ( 'internet' )
            // InternalBrowserAutomation.g:848:2: 'internet'
            {
             before(grammarAccess.getWebBrowserAccess().getInternetKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWebBrowserAccess().getInternetKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebBrowser__Group_3__0__Impl"


    // $ANTLR start "rule__WebBrowser__Group_3__1"
    // InternalBrowserAutomation.g:857:1: rule__WebBrowser__Group_3__1 : rule__WebBrowser__Group_3__1__Impl ;
    public final void rule__WebBrowser__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:861:1: ( rule__WebBrowser__Group_3__1__Impl )
            // InternalBrowserAutomation.g:862:2: rule__WebBrowser__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WebBrowser__Group_3__1__Impl();

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
    // $ANTLR end "rule__WebBrowser__Group_3__1"


    // $ANTLR start "rule__WebBrowser__Group_3__1__Impl"
    // InternalBrowserAutomation.g:868:1: rule__WebBrowser__Group_3__1__Impl : ( 'explorer' ) ;
    public final void rule__WebBrowser__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:872:1: ( ( 'explorer' ) )
            // InternalBrowserAutomation.g:873:1: ( 'explorer' )
            {
            // InternalBrowserAutomation.g:873:1: ( 'explorer' )
            // InternalBrowserAutomation.g:874:2: 'explorer'
            {
             before(grammarAccess.getWebBrowserAccess().getExplorerKeyword_3_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWebBrowserAccess().getExplorerKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebBrowser__Group_3__1__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalBrowserAutomation.g:884:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:888:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalBrowserAutomation.g:889:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1();

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
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // InternalBrowserAutomation.g:896:1: rule__Statement__Group_0__0__Impl : ( ruleGet ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:900:1: ( ( ruleGet ) )
            // InternalBrowserAutomation.g:901:1: ( ruleGet )
            {
            // InternalBrowserAutomation.g:901:1: ( ruleGet )
            // InternalBrowserAutomation.g:902:2: ruleGet
            {
             before(grammarAccess.getStatementAccess().getGetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGet();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getGetParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // InternalBrowserAutomation.g:911:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:915:1: ( rule__Statement__Group_0__1__Impl )
            // InternalBrowserAutomation.g:916:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // InternalBrowserAutomation.g:922:1: rule__Statement__Group_0__1__Impl : ( ( rule__Statement__ActionAssignment_0_1 ) ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:926:1: ( ( ( rule__Statement__ActionAssignment_0_1 ) ) )
            // InternalBrowserAutomation.g:927:1: ( ( rule__Statement__ActionAssignment_0_1 ) )
            {
            // InternalBrowserAutomation.g:927:1: ( ( rule__Statement__ActionAssignment_0_1 ) )
            // InternalBrowserAutomation.g:928:2: ( rule__Statement__ActionAssignment_0_1 )
            {
             before(grammarAccess.getStatementAccess().getActionAssignment_0_1()); 
            // InternalBrowserAutomation.g:929:2: ( rule__Statement__ActionAssignment_0_1 )
            // InternalBrowserAutomation.g:929:3: rule__Statement__ActionAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__ActionAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getActionAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_2__0"
    // InternalBrowserAutomation.g:938:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:942:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // InternalBrowserAutomation.g:943:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Statement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__1();

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
    // $ANTLR end "rule__Statement__Group_2__0"


    // $ANTLR start "rule__Statement__Group_2__0__Impl"
    // InternalBrowserAutomation.g:950:1: rule__Statement__Group_2__0__Impl : ( 'uncheck' ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:954:1: ( ( 'uncheck' ) )
            // InternalBrowserAutomation.g:955:1: ( 'uncheck' )
            {
            // InternalBrowserAutomation.g:955:1: ( 'uncheck' )
            // InternalBrowserAutomation.g:956:2: 'uncheck'
            {
             before(grammarAccess.getStatementAccess().getUncheckKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getUncheckKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__0__Impl"


    // $ANTLR start "rule__Statement__Group_2__1"
    // InternalBrowserAutomation.g:965:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:969:1: ( rule__Statement__Group_2__1__Impl )
            // InternalBrowserAutomation.g:970:2: rule__Statement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_2__1"


    // $ANTLR start "rule__Statement__Group_2__1__Impl"
    // InternalBrowserAutomation.g:976:1: rule__Statement__Group_2__1__Impl : ( 'all' ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:980:1: ( ( 'all' ) )
            // InternalBrowserAutomation.g:981:1: ( 'all' )
            {
            // InternalBrowserAutomation.g:981:1: ( 'all' )
            // InternalBrowserAutomation.g:982:2: 'all'
            {
             before(grammarAccess.getStatementAccess().getAllKeyword_2_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getAllKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__1__Impl"


    // $ANTLR start "rule__Statement__Group_3__0"
    // InternalBrowserAutomation.g:992:1: rule__Statement__Group_3__0 : rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 ;
    public final void rule__Statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:996:1: ( rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 )
            // InternalBrowserAutomation.g:997:2: rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Statement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__1();

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
    // $ANTLR end "rule__Statement__Group_3__0"


    // $ANTLR start "rule__Statement__Group_3__0__Impl"
    // InternalBrowserAutomation.g:1004:1: rule__Statement__Group_3__0__Impl : ( 'go' ) ;
    public final void rule__Statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1008:1: ( ( 'go' ) )
            // InternalBrowserAutomation.g:1009:1: ( 'go' )
            {
            // InternalBrowserAutomation.g:1009:1: ( 'go' )
            // InternalBrowserAutomation.g:1010:2: 'go'
            {
             before(grammarAccess.getStatementAccess().getGoKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getGoKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__0__Impl"


    // $ANTLR start "rule__Statement__Group_3__1"
    // InternalBrowserAutomation.g:1019:1: rule__Statement__Group_3__1 : rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 ;
    public final void rule__Statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1023:1: ( rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 )
            // InternalBrowserAutomation.g:1024:2: rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Statement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__2();

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
    // $ANTLR end "rule__Statement__Group_3__1"


    // $ANTLR start "rule__Statement__Group_3__1__Impl"
    // InternalBrowserAutomation.g:1031:1: rule__Statement__Group_3__1__Impl : ( 'to' ) ;
    public final void rule__Statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1035:1: ( ( 'to' ) )
            // InternalBrowserAutomation.g:1036:1: ( 'to' )
            {
            // InternalBrowserAutomation.g:1036:1: ( 'to' )
            // InternalBrowserAutomation.g:1037:2: 'to'
            {
             before(grammarAccess.getStatementAccess().getToKeyword_3_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getToKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__1__Impl"


    // $ANTLR start "rule__Statement__Group_3__2"
    // InternalBrowserAutomation.g:1046:1: rule__Statement__Group_3__2 : rule__Statement__Group_3__2__Impl ;
    public final void rule__Statement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1050:1: ( rule__Statement__Group_3__2__Impl )
            // InternalBrowserAutomation.g:1051:2: rule__Statement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__2__Impl();

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
    // $ANTLR end "rule__Statement__Group_3__2"


    // $ANTLR start "rule__Statement__Group_3__2__Impl"
    // InternalBrowserAutomation.g:1057:1: rule__Statement__Group_3__2__Impl : ( ( rule__Statement__UrlAssignment_3_2 ) ) ;
    public final void rule__Statement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1061:1: ( ( ( rule__Statement__UrlAssignment_3_2 ) ) )
            // InternalBrowserAutomation.g:1062:1: ( ( rule__Statement__UrlAssignment_3_2 ) )
            {
            // InternalBrowserAutomation.g:1062:1: ( ( rule__Statement__UrlAssignment_3_2 ) )
            // InternalBrowserAutomation.g:1063:2: ( rule__Statement__UrlAssignment_3_2 )
            {
             before(grammarAccess.getStatementAccess().getUrlAssignment_3_2()); 
            // InternalBrowserAutomation.g:1064:2: ( rule__Statement__UrlAssignment_3_2 )
            // InternalBrowserAutomation.g:1064:3: rule__Statement__UrlAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__UrlAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getUrlAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__2__Impl"


    // $ANTLR start "rule__Get__Group__0"
    // InternalBrowserAutomation.g:1073:1: rule__Get__Group__0 : rule__Get__Group__0__Impl rule__Get__Group__1 ;
    public final void rule__Get__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1077:1: ( rule__Get__Group__0__Impl rule__Get__Group__1 )
            // InternalBrowserAutomation.g:1078:2: rule__Get__Group__0__Impl rule__Get__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBrowserAutomation.g:1085:1: rule__Get__Group__0__Impl : ( ( rule__Get__VarAssignment_0 ) ) ;
    public final void rule__Get__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1089:1: ( ( ( rule__Get__VarAssignment_0 ) ) )
            // InternalBrowserAutomation.g:1090:1: ( ( rule__Get__VarAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:1090:1: ( ( rule__Get__VarAssignment_0 ) )
            // InternalBrowserAutomation.g:1091:2: ( rule__Get__VarAssignment_0 )
            {
             before(grammarAccess.getGetAccess().getVarAssignment_0()); 
            // InternalBrowserAutomation.g:1092:2: ( rule__Get__VarAssignment_0 )
            // InternalBrowserAutomation.g:1092:3: rule__Get__VarAssignment_0
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
    // InternalBrowserAutomation.g:1100:1: rule__Get__Group__1 : rule__Get__Group__1__Impl rule__Get__Group__2 ;
    public final void rule__Get__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1104:1: ( rule__Get__Group__1__Impl rule__Get__Group__2 )
            // InternalBrowserAutomation.g:1105:2: rule__Get__Group__1__Impl rule__Get__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalBrowserAutomation.g:1112:1: rule__Get__Group__1__Impl : ( '=' ) ;
    public final void rule__Get__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1116:1: ( ( '=' ) )
            // InternalBrowserAutomation.g:1117:1: ( '=' )
            {
            // InternalBrowserAutomation.g:1117:1: ( '=' )
            // InternalBrowserAutomation.g:1118:2: '='
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
    // InternalBrowserAutomation.g:1127:1: rule__Get__Group__2 : rule__Get__Group__2__Impl rule__Get__Group__3 ;
    public final void rule__Get__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1131:1: ( rule__Get__Group__2__Impl rule__Get__Group__3 )
            // InternalBrowserAutomation.g:1132:2: rule__Get__Group__2__Impl rule__Get__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalBrowserAutomation.g:1139:1: rule__Get__Group__2__Impl : ( 'get' ) ;
    public final void rule__Get__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1143:1: ( ( 'get' ) )
            // InternalBrowserAutomation.g:1144:1: ( 'get' )
            {
            // InternalBrowserAutomation.g:1144:1: ( 'get' )
            // InternalBrowserAutomation.g:1145:2: 'get'
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
    // InternalBrowserAutomation.g:1154:1: rule__Get__Group__3 : rule__Get__Group__3__Impl ;
    public final void rule__Get__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1158:1: ( rule__Get__Group__3__Impl )
            // InternalBrowserAutomation.g:1159:2: rule__Get__Group__3__Impl
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
    // InternalBrowserAutomation.g:1165:1: rule__Get__Group__3__Impl : ( ( rule__Get__Alternatives_3 ) ) ;
    public final void rule__Get__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1169:1: ( ( ( rule__Get__Alternatives_3 ) ) )
            // InternalBrowserAutomation.g:1170:1: ( ( rule__Get__Alternatives_3 ) )
            {
            // InternalBrowserAutomation.g:1170:1: ( ( rule__Get__Alternatives_3 ) )
            // InternalBrowserAutomation.g:1171:2: ( rule__Get__Alternatives_3 )
            {
             before(grammarAccess.getGetAccess().getAlternatives_3()); 
            // InternalBrowserAutomation.g:1172:2: ( rule__Get__Alternatives_3 )
            // InternalBrowserAutomation.g:1172:3: rule__Get__Alternatives_3
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
    // InternalBrowserAutomation.g:1181:1: rule__Get__Group_3_0__0 : rule__Get__Group_3_0__0__Impl rule__Get__Group_3_0__1 ;
    public final void rule__Get__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1185:1: ( rule__Get__Group_3_0__0__Impl rule__Get__Group_3_0__1 )
            // InternalBrowserAutomation.g:1186:2: rule__Get__Group_3_0__0__Impl rule__Get__Group_3_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBrowserAutomation.g:1193:1: rule__Get__Group_3_0__0__Impl : ( ( rule__Get__ElementAssignment_3_0_0 ) ) ;
    public final void rule__Get__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1197:1: ( ( ( rule__Get__ElementAssignment_3_0_0 ) ) )
            // InternalBrowserAutomation.g:1198:1: ( ( rule__Get__ElementAssignment_3_0_0 ) )
            {
            // InternalBrowserAutomation.g:1198:1: ( ( rule__Get__ElementAssignment_3_0_0 ) )
            // InternalBrowserAutomation.g:1199:2: ( rule__Get__ElementAssignment_3_0_0 )
            {
             before(grammarAccess.getGetAccess().getElementAssignment_3_0_0()); 
            // InternalBrowserAutomation.g:1200:2: ( rule__Get__ElementAssignment_3_0_0 )
            // InternalBrowserAutomation.g:1200:3: rule__Get__ElementAssignment_3_0_0
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
    // InternalBrowserAutomation.g:1208:1: rule__Get__Group_3_0__1 : rule__Get__Group_3_0__1__Impl rule__Get__Group_3_0__2 ;
    public final void rule__Get__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1212:1: ( rule__Get__Group_3_0__1__Impl rule__Get__Group_3_0__2 )
            // InternalBrowserAutomation.g:1213:2: rule__Get__Group_3_0__1__Impl rule__Get__Group_3_0__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBrowserAutomation.g:1220:1: rule__Get__Group_3_0__1__Impl : ( ( rule__Get__OrderAssignment_3_0_1 )? ) ;
    public final void rule__Get__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1224:1: ( ( ( rule__Get__OrderAssignment_3_0_1 )? ) )
            // InternalBrowserAutomation.g:1225:1: ( ( rule__Get__OrderAssignment_3_0_1 )? )
            {
            // InternalBrowserAutomation.g:1225:1: ( ( rule__Get__OrderAssignment_3_0_1 )? )
            // InternalBrowserAutomation.g:1226:2: ( rule__Get__OrderAssignment_3_0_1 )?
            {
             before(grammarAccess.getGetAccess().getOrderAssignment_3_0_1()); 
            // InternalBrowserAutomation.g:1227:2: ( rule__Get__OrderAssignment_3_0_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBrowserAutomation.g:1227:3: rule__Get__OrderAssignment_3_0_1
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
    // InternalBrowserAutomation.g:1235:1: rule__Get__Group_3_0__2 : rule__Get__Group_3_0__2__Impl ;
    public final void rule__Get__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1239:1: ( rule__Get__Group_3_0__2__Impl )
            // InternalBrowserAutomation.g:1240:2: rule__Get__Group_3_0__2__Impl
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
    // InternalBrowserAutomation.g:1246:1: rule__Get__Group_3_0__2__Impl : ( ( rule__Get__Alternatives_3_0_2 ) ) ;
    public final void rule__Get__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1250:1: ( ( ( rule__Get__Alternatives_3_0_2 ) ) )
            // InternalBrowserAutomation.g:1251:1: ( ( rule__Get__Alternatives_3_0_2 ) )
            {
            // InternalBrowserAutomation.g:1251:1: ( ( rule__Get__Alternatives_3_0_2 ) )
            // InternalBrowserAutomation.g:1252:2: ( rule__Get__Alternatives_3_0_2 )
            {
             before(grammarAccess.getGetAccess().getAlternatives_3_0_2()); 
            // InternalBrowserAutomation.g:1253:2: ( rule__Get__Alternatives_3_0_2 )
            // InternalBrowserAutomation.g:1253:3: rule__Get__Alternatives_3_0_2
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
    // InternalBrowserAutomation.g:1262:1: rule__Get__Group_3_0_2_0__0 : rule__Get__Group_3_0_2_0__0__Impl rule__Get__Group_3_0_2_0__1 ;
    public final void rule__Get__Group_3_0_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1266:1: ( rule__Get__Group_3_0_2_0__0__Impl rule__Get__Group_3_0_2_0__1 )
            // InternalBrowserAutomation.g:1267:2: rule__Get__Group_3_0_2_0__0__Impl rule__Get__Group_3_0_2_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBrowserAutomation.g:1274:1: rule__Get__Group_3_0_2_0__0__Impl : ( 'by' ) ;
    public final void rule__Get__Group_3_0_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1278:1: ( ( 'by' ) )
            // InternalBrowserAutomation.g:1279:1: ( 'by' )
            {
            // InternalBrowserAutomation.g:1279:1: ( 'by' )
            // InternalBrowserAutomation.g:1280:2: 'by'
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
    // InternalBrowserAutomation.g:1289:1: rule__Get__Group_3_0_2_0__1 : rule__Get__Group_3_0_2_0__1__Impl rule__Get__Group_3_0_2_0__2 ;
    public final void rule__Get__Group_3_0_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1293:1: ( rule__Get__Group_3_0_2_0__1__Impl rule__Get__Group_3_0_2_0__2 )
            // InternalBrowserAutomation.g:1294:2: rule__Get__Group_3_0_2_0__1__Impl rule__Get__Group_3_0_2_0__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalBrowserAutomation.g:1301:1: rule__Get__Group_3_0_2_0__1__Impl : ( ( rule__Get__AttrAssignment_3_0_2_0_1 ) ) ;
    public final void rule__Get__Group_3_0_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1305:1: ( ( ( rule__Get__AttrAssignment_3_0_2_0_1 ) ) )
            // InternalBrowserAutomation.g:1306:1: ( ( rule__Get__AttrAssignment_3_0_2_0_1 ) )
            {
            // InternalBrowserAutomation.g:1306:1: ( ( rule__Get__AttrAssignment_3_0_2_0_1 ) )
            // InternalBrowserAutomation.g:1307:2: ( rule__Get__AttrAssignment_3_0_2_0_1 )
            {
             before(grammarAccess.getGetAccess().getAttrAssignment_3_0_2_0_1()); 
            // InternalBrowserAutomation.g:1308:2: ( rule__Get__AttrAssignment_3_0_2_0_1 )
            // InternalBrowserAutomation.g:1308:3: rule__Get__AttrAssignment_3_0_2_0_1
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
    // InternalBrowserAutomation.g:1316:1: rule__Get__Group_3_0_2_0__2 : rule__Get__Group_3_0_2_0__2__Impl rule__Get__Group_3_0_2_0__3 ;
    public final void rule__Get__Group_3_0_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1320:1: ( rule__Get__Group_3_0_2_0__2__Impl rule__Get__Group_3_0_2_0__3 )
            // InternalBrowserAutomation.g:1321:2: rule__Get__Group_3_0_2_0__2__Impl rule__Get__Group_3_0_2_0__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalBrowserAutomation.g:1328:1: rule__Get__Group_3_0_2_0__2__Impl : ( '[' ) ;
    public final void rule__Get__Group_3_0_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1332:1: ( ( '[' ) )
            // InternalBrowserAutomation.g:1333:1: ( '[' )
            {
            // InternalBrowserAutomation.g:1333:1: ( '[' )
            // InternalBrowserAutomation.g:1334:2: '['
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
    // InternalBrowserAutomation.g:1343:1: rule__Get__Group_3_0_2_0__3 : rule__Get__Group_3_0_2_0__3__Impl rule__Get__Group_3_0_2_0__4 ;
    public final void rule__Get__Group_3_0_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1347:1: ( rule__Get__Group_3_0_2_0__3__Impl rule__Get__Group_3_0_2_0__4 )
            // InternalBrowserAutomation.g:1348:2: rule__Get__Group_3_0_2_0__3__Impl rule__Get__Group_3_0_2_0__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalBrowserAutomation.g:1355:1: rule__Get__Group_3_0_2_0__3__Impl : ( ( rule__Get__Alternatives_3_0_2_0_3 ) ) ;
    public final void rule__Get__Group_3_0_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1359:1: ( ( ( rule__Get__Alternatives_3_0_2_0_3 ) ) )
            // InternalBrowserAutomation.g:1360:1: ( ( rule__Get__Alternatives_3_0_2_0_3 ) )
            {
            // InternalBrowserAutomation.g:1360:1: ( ( rule__Get__Alternatives_3_0_2_0_3 ) )
            // InternalBrowserAutomation.g:1361:2: ( rule__Get__Alternatives_3_0_2_0_3 )
            {
             before(grammarAccess.getGetAccess().getAlternatives_3_0_2_0_3()); 
            // InternalBrowserAutomation.g:1362:2: ( rule__Get__Alternatives_3_0_2_0_3 )
            // InternalBrowserAutomation.g:1362:3: rule__Get__Alternatives_3_0_2_0_3
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
    // InternalBrowserAutomation.g:1370:1: rule__Get__Group_3_0_2_0__4 : rule__Get__Group_3_0_2_0__4__Impl ;
    public final void rule__Get__Group_3_0_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1374:1: ( rule__Get__Group_3_0_2_0__4__Impl )
            // InternalBrowserAutomation.g:1375:2: rule__Get__Group_3_0_2_0__4__Impl
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
    // InternalBrowserAutomation.g:1381:1: rule__Get__Group_3_0_2_0__4__Impl : ( ']' ) ;
    public final void rule__Get__Group_3_0_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1385:1: ( ( ']' ) )
            // InternalBrowserAutomation.g:1386:1: ( ']' )
            {
            // InternalBrowserAutomation.g:1386:1: ( ']' )
            // InternalBrowserAutomation.g:1387:2: ']'
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
    // InternalBrowserAutomation.g:1397:1: rule__Get__Group_3_0_2_1__0 : rule__Get__Group_3_0_2_1__0__Impl rule__Get__Group_3_0_2_1__1 ;
    public final void rule__Get__Group_3_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1401:1: ( rule__Get__Group_3_0_2_1__0__Impl rule__Get__Group_3_0_2_1__1 )
            // InternalBrowserAutomation.g:1402:2: rule__Get__Group_3_0_2_1__0__Impl rule__Get__Group_3_0_2_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBrowserAutomation.g:1409:1: rule__Get__Group_3_0_2_1__0__Impl : ( 'from' ) ;
    public final void rule__Get__Group_3_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1413:1: ( ( 'from' ) )
            // InternalBrowserAutomation.g:1414:1: ( 'from' )
            {
            // InternalBrowserAutomation.g:1414:1: ( 'from' )
            // InternalBrowserAutomation.g:1415:2: 'from'
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
    // InternalBrowserAutomation.g:1424:1: rule__Get__Group_3_0_2_1__1 : rule__Get__Group_3_0_2_1__1__Impl ;
    public final void rule__Get__Group_3_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1428:1: ( rule__Get__Group_3_0_2_1__1__Impl )
            // InternalBrowserAutomation.g:1429:2: rule__Get__Group_3_0_2_1__1__Impl
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
    // InternalBrowserAutomation.g:1435:1: rule__Get__Group_3_0_2_1__1__Impl : ( ( rule__Get__VarRefAssignment_3_0_2_1_1 ) ) ;
    public final void rule__Get__Group_3_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1439:1: ( ( ( rule__Get__VarRefAssignment_3_0_2_1_1 ) ) )
            // InternalBrowserAutomation.g:1440:1: ( ( rule__Get__VarRefAssignment_3_0_2_1_1 ) )
            {
            // InternalBrowserAutomation.g:1440:1: ( ( rule__Get__VarRefAssignment_3_0_2_1_1 ) )
            // InternalBrowserAutomation.g:1441:2: ( rule__Get__VarRefAssignment_3_0_2_1_1 )
            {
             before(grammarAccess.getGetAccess().getVarRefAssignment_3_0_2_1_1()); 
            // InternalBrowserAutomation.g:1442:2: ( rule__Get__VarRefAssignment_3_0_2_1_1 )
            // InternalBrowserAutomation.g:1442:3: rule__Get__VarRefAssignment_3_0_2_1_1
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
    // InternalBrowserAutomation.g:1451:1: rule__Order__Group__0 : rule__Order__Group__0__Impl rule__Order__Group__1 ;
    public final void rule__Order__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1455:1: ( rule__Order__Group__0__Impl rule__Order__Group__1 )
            // InternalBrowserAutomation.g:1456:2: rule__Order__Group__0__Impl rule__Order__Group__1
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
    // InternalBrowserAutomation.g:1463:1: rule__Order__Group__0__Impl : ( 'number' ) ;
    public final void rule__Order__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1467:1: ( ( 'number' ) )
            // InternalBrowserAutomation.g:1468:1: ( 'number' )
            {
            // InternalBrowserAutomation.g:1468:1: ( 'number' )
            // InternalBrowserAutomation.g:1469:2: 'number'
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
    // InternalBrowserAutomation.g:1478:1: rule__Order__Group__1 : rule__Order__Group__1__Impl ;
    public final void rule__Order__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1482:1: ( rule__Order__Group__1__Impl )
            // InternalBrowserAutomation.g:1483:2: rule__Order__Group__1__Impl
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
    // InternalBrowserAutomation.g:1489:1: rule__Order__Group__1__Impl : ( ( rule__Order__OrderAssignment_1 ) ) ;
    public final void rule__Order__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1493:1: ( ( ( rule__Order__OrderAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1494:1: ( ( rule__Order__OrderAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1494:1: ( ( rule__Order__OrderAssignment_1 ) )
            // InternalBrowserAutomation.g:1495:2: ( rule__Order__OrderAssignment_1 )
            {
             before(grammarAccess.getOrderAccess().getOrderAssignment_1()); 
            // InternalBrowserAutomation.g:1496:2: ( rule__Order__OrderAssignment_1 )
            // InternalBrowserAutomation.g:1496:3: rule__Order__OrderAssignment_1
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
    // InternalBrowserAutomation.g:1505:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1509:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalBrowserAutomation.g:1510:2: rule__Click__Group__0__Impl rule__Click__Group__1
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
    // InternalBrowserAutomation.g:1517:1: rule__Click__Group__0__Impl : ( 'click' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1521:1: ( ( 'click' ) )
            // InternalBrowserAutomation.g:1522:1: ( 'click' )
            {
            // InternalBrowserAutomation.g:1522:1: ( 'click' )
            // InternalBrowserAutomation.g:1523:2: 'click'
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
    // InternalBrowserAutomation.g:1532:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1536:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalBrowserAutomation.g:1537:2: rule__Click__Group__1__Impl rule__Click__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBrowserAutomation.g:1544:1: rule__Click__Group__1__Impl : ( 'on' ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1548:1: ( ( 'on' ) )
            // InternalBrowserAutomation.g:1549:1: ( 'on' )
            {
            // InternalBrowserAutomation.g:1549:1: ( 'on' )
            // InternalBrowserAutomation.g:1550:2: 'on'
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
    // InternalBrowserAutomation.g:1559:1: rule__Click__Group__2 : rule__Click__Group__2__Impl ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1563:1: ( rule__Click__Group__2__Impl )
            // InternalBrowserAutomation.g:1564:2: rule__Click__Group__2__Impl
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
    // InternalBrowserAutomation.g:1570:1: rule__Click__Group__2__Impl : ( ( rule__Click__VarAssignment_2 ) ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1574:1: ( ( ( rule__Click__VarAssignment_2 ) ) )
            // InternalBrowserAutomation.g:1575:1: ( ( rule__Click__VarAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:1575:1: ( ( rule__Click__VarAssignment_2 ) )
            // InternalBrowserAutomation.g:1576:2: ( rule__Click__VarAssignment_2 )
            {
             before(grammarAccess.getClickAccess().getVarAssignment_2()); 
            // InternalBrowserAutomation.g:1577:2: ( rule__Click__VarAssignment_2 )
            // InternalBrowserAutomation.g:1577:3: rule__Click__VarAssignment_2
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
    // InternalBrowserAutomation.g:1586:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1590:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalBrowserAutomation.g:1591:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBrowserAutomation.g:1598:1: rule__Insert__Group__0__Impl : ( 'insert' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1602:1: ( ( 'insert' ) )
            // InternalBrowserAutomation.g:1603:1: ( 'insert' )
            {
            // InternalBrowserAutomation.g:1603:1: ( 'insert' )
            // InternalBrowserAutomation.g:1604:2: 'insert'
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
    // InternalBrowserAutomation.g:1613:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1617:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalBrowserAutomation.g:1618:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
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
    // InternalBrowserAutomation.g:1625:1: rule__Insert__Group__1__Impl : ( ( rule__Insert__VarAssignment_1 ) ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1629:1: ( ( ( rule__Insert__VarAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1630:1: ( ( rule__Insert__VarAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1630:1: ( ( rule__Insert__VarAssignment_1 ) )
            // InternalBrowserAutomation.g:1631:2: ( rule__Insert__VarAssignment_1 )
            {
             before(grammarAccess.getInsertAccess().getVarAssignment_1()); 
            // InternalBrowserAutomation.g:1632:2: ( rule__Insert__VarAssignment_1 )
            // InternalBrowserAutomation.g:1632:3: rule__Insert__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getVarAssignment_1()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:1640:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1644:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalBrowserAutomation.g:1645:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalBrowserAutomation.g:1652:1: rule__Insert__Group__2__Impl : ( 'in' ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1656:1: ( ( 'in' ) )
            // InternalBrowserAutomation.g:1657:1: ( 'in' )
            {
            // InternalBrowserAutomation.g:1657:1: ( 'in' )
            // InternalBrowserAutomation.g:1658:2: 'in'
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
    // InternalBrowserAutomation.g:1667:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1671:1: ( rule__Insert__Group__3__Impl )
            // InternalBrowserAutomation.g:1672:2: rule__Insert__Group__3__Impl
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
    // InternalBrowserAutomation.g:1678:1: rule__Insert__Group__3__Impl : ( ( rule__Insert__Var2Assignment_3 ) ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1682:1: ( ( ( rule__Insert__Var2Assignment_3 ) ) )
            // InternalBrowserAutomation.g:1683:1: ( ( rule__Insert__Var2Assignment_3 ) )
            {
            // InternalBrowserAutomation.g:1683:1: ( ( rule__Insert__Var2Assignment_3 ) )
            // InternalBrowserAutomation.g:1684:2: ( rule__Insert__Var2Assignment_3 )
            {
             before(grammarAccess.getInsertAccess().getVar2Assignment_3()); 
            // InternalBrowserAutomation.g:1685:2: ( rule__Insert__Var2Assignment_3 )
            // InternalBrowserAutomation.g:1685:3: rule__Insert__Var2Assignment_3
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
    // InternalBrowserAutomation.g:1694:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1698:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // InternalBrowserAutomation.g:1699:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
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
    // InternalBrowserAutomation.g:1706:1: rule__Verify__Group__0__Impl : ( ( rule__Verify__VarAssignment_0 ) ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1710:1: ( ( ( rule__Verify__VarAssignment_0 ) ) )
            // InternalBrowserAutomation.g:1711:1: ( ( rule__Verify__VarAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:1711:1: ( ( rule__Verify__VarAssignment_0 ) )
            // InternalBrowserAutomation.g:1712:2: ( rule__Verify__VarAssignment_0 )
            {
             before(grammarAccess.getVerifyAccess().getVarAssignment_0()); 
            // InternalBrowserAutomation.g:1713:2: ( rule__Verify__VarAssignment_0 )
            // InternalBrowserAutomation.g:1713:3: rule__Verify__VarAssignment_0
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
    // InternalBrowserAutomation.g:1721:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl rule__Verify__Group__2 ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1725:1: ( rule__Verify__Group__1__Impl rule__Verify__Group__2 )
            // InternalBrowserAutomation.g:1726:2: rule__Verify__Group__1__Impl rule__Verify__Group__2
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
    // InternalBrowserAutomation.g:1733:1: rule__Verify__Group__1__Impl : ( 'is' ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1737:1: ( ( 'is' ) )
            // InternalBrowserAutomation.g:1738:1: ( 'is' )
            {
            // InternalBrowserAutomation.g:1738:1: ( 'is' )
            // InternalBrowserAutomation.g:1739:2: 'is'
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
    // InternalBrowserAutomation.g:1748:1: rule__Verify__Group__2 : rule__Verify__Group__2__Impl rule__Verify__Group__3 ;
    public final void rule__Verify__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1752:1: ( rule__Verify__Group__2__Impl rule__Verify__Group__3 )
            // InternalBrowserAutomation.g:1753:2: rule__Verify__Group__2__Impl rule__Verify__Group__3
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
    // InternalBrowserAutomation.g:1760:1: rule__Verify__Group__2__Impl : ( 'not' ) ;
    public final void rule__Verify__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1764:1: ( ( 'not' ) )
            // InternalBrowserAutomation.g:1765:1: ( 'not' )
            {
            // InternalBrowserAutomation.g:1765:1: ( 'not' )
            // InternalBrowserAutomation.g:1766:2: 'not'
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
    // InternalBrowserAutomation.g:1775:1: rule__Verify__Group__3 : rule__Verify__Group__3__Impl ;
    public final void rule__Verify__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1779:1: ( rule__Verify__Group__3__Impl )
            // InternalBrowserAutomation.g:1780:2: rule__Verify__Group__3__Impl
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
    // InternalBrowserAutomation.g:1786:1: rule__Verify__Group__3__Impl : ( 'null' ) ;
    public final void rule__Verify__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1790:1: ( ( 'null' ) )
            // InternalBrowserAutomation.g:1791:1: ( 'null' )
            {
            // InternalBrowserAutomation.g:1791:1: ( 'null' )
            // InternalBrowserAutomation.g:1792:2: 'null'
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
    // InternalBrowserAutomation.g:1802:1: rule__Check__Group__0 : rule__Check__Group__0__Impl rule__Check__Group__1 ;
    public final void rule__Check__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1806:1: ( rule__Check__Group__0__Impl rule__Check__Group__1 )
            // InternalBrowserAutomation.g:1807:2: rule__Check__Group__0__Impl rule__Check__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBrowserAutomation.g:1814:1: rule__Check__Group__0__Impl : ( 'check' ) ;
    public final void rule__Check__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1818:1: ( ( 'check' ) )
            // InternalBrowserAutomation.g:1819:1: ( 'check' )
            {
            // InternalBrowserAutomation.g:1819:1: ( 'check' )
            // InternalBrowserAutomation.g:1820:2: 'check'
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
    // InternalBrowserAutomation.g:1829:1: rule__Check__Group__1 : rule__Check__Group__1__Impl ;
    public final void rule__Check__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1833:1: ( rule__Check__Group__1__Impl )
            // InternalBrowserAutomation.g:1834:2: rule__Check__Group__1__Impl
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
    // InternalBrowserAutomation.g:1840:1: rule__Check__Group__1__Impl : ( ( rule__Check__VarAssignment_1 ) ) ;
    public final void rule__Check__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1844:1: ( ( ( rule__Check__VarAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1845:1: ( ( rule__Check__VarAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1845:1: ( ( rule__Check__VarAssignment_1 ) )
            // InternalBrowserAutomation.g:1846:2: ( rule__Check__VarAssignment_1 )
            {
             before(grammarAccess.getCheckAccess().getVarAssignment_1()); 
            // InternalBrowserAutomation.g:1847:2: ( rule__Check__VarAssignment_1 )
            // InternalBrowserAutomation.g:1847:3: rule__Check__VarAssignment_1
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
    // InternalBrowserAutomation.g:1856:1: rule__Choose__Group__0 : rule__Choose__Group__0__Impl rule__Choose__Group__1 ;
    public final void rule__Choose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1860:1: ( rule__Choose__Group__0__Impl rule__Choose__Group__1 )
            // InternalBrowserAutomation.g:1861:2: rule__Choose__Group__0__Impl rule__Choose__Group__1
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
    // InternalBrowserAutomation.g:1868:1: rule__Choose__Group__0__Impl : ( 'choose' ) ;
    public final void rule__Choose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1872:1: ( ( 'choose' ) )
            // InternalBrowserAutomation.g:1873:1: ( 'choose' )
            {
            // InternalBrowserAutomation.g:1873:1: ( 'choose' )
            // InternalBrowserAutomation.g:1874:2: 'choose'
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
    // InternalBrowserAutomation.g:1883:1: rule__Choose__Group__1 : rule__Choose__Group__1__Impl rule__Choose__Group__2 ;
    public final void rule__Choose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1887:1: ( rule__Choose__Group__1__Impl rule__Choose__Group__2 )
            // InternalBrowserAutomation.g:1888:2: rule__Choose__Group__1__Impl rule__Choose__Group__2
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
    // InternalBrowserAutomation.g:1895:1: rule__Choose__Group__1__Impl : ( ( rule__Choose__ValueAssignment_1 ) ) ;
    public final void rule__Choose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1899:1: ( ( ( rule__Choose__ValueAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1900:1: ( ( rule__Choose__ValueAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1900:1: ( ( rule__Choose__ValueAssignment_1 ) )
            // InternalBrowserAutomation.g:1901:2: ( rule__Choose__ValueAssignment_1 )
            {
             before(grammarAccess.getChooseAccess().getValueAssignment_1()); 
            // InternalBrowserAutomation.g:1902:2: ( rule__Choose__ValueAssignment_1 )
            // InternalBrowserAutomation.g:1902:3: rule__Choose__ValueAssignment_1
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
    // InternalBrowserAutomation.g:1910:1: rule__Choose__Group__2 : rule__Choose__Group__2__Impl rule__Choose__Group__3 ;
    public final void rule__Choose__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1914:1: ( rule__Choose__Group__2__Impl rule__Choose__Group__3 )
            // InternalBrowserAutomation.g:1915:2: rule__Choose__Group__2__Impl rule__Choose__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalBrowserAutomation.g:1922:1: rule__Choose__Group__2__Impl : ( 'in' ) ;
    public final void rule__Choose__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1926:1: ( ( 'in' ) )
            // InternalBrowserAutomation.g:1927:1: ( 'in' )
            {
            // InternalBrowserAutomation.g:1927:1: ( 'in' )
            // InternalBrowserAutomation.g:1928:2: 'in'
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
    // InternalBrowserAutomation.g:1937:1: rule__Choose__Group__3 : rule__Choose__Group__3__Impl ;
    public final void rule__Choose__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1941:1: ( rule__Choose__Group__3__Impl )
            // InternalBrowserAutomation.g:1942:2: rule__Choose__Group__3__Impl
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
    // InternalBrowserAutomation.g:1948:1: rule__Choose__Group__3__Impl : ( ( rule__Choose__VarAssignment_3 ) ) ;
    public final void rule__Choose__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1952:1: ( ( ( rule__Choose__VarAssignment_3 ) ) )
            // InternalBrowserAutomation.g:1953:1: ( ( rule__Choose__VarAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:1953:1: ( ( rule__Choose__VarAssignment_3 ) )
            // InternalBrowserAutomation.g:1954:2: ( rule__Choose__VarAssignment_3 )
            {
             before(grammarAccess.getChooseAccess().getVarAssignment_3()); 
            // InternalBrowserAutomation.g:1955:2: ( rule__Choose__VarAssignment_3 )
            // InternalBrowserAutomation.g:1955:3: rule__Choose__VarAssignment_3
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
    // InternalBrowserAutomation.g:1964:1: rule__Contains__Group__0 : rule__Contains__Group__0__Impl rule__Contains__Group__1 ;
    public final void rule__Contains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1968:1: ( rule__Contains__Group__0__Impl rule__Contains__Group__1 )
            // InternalBrowserAutomation.g:1969:2: rule__Contains__Group__0__Impl rule__Contains__Group__1
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
    // InternalBrowserAutomation.g:1976:1: rule__Contains__Group__0__Impl : ( ( rule__Contains__VarAssignment_0 ) ) ;
    public final void rule__Contains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1980:1: ( ( ( rule__Contains__VarAssignment_0 ) ) )
            // InternalBrowserAutomation.g:1981:1: ( ( rule__Contains__VarAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:1981:1: ( ( rule__Contains__VarAssignment_0 ) )
            // InternalBrowserAutomation.g:1982:2: ( rule__Contains__VarAssignment_0 )
            {
             before(grammarAccess.getContainsAccess().getVarAssignment_0()); 
            // InternalBrowserAutomation.g:1983:2: ( rule__Contains__VarAssignment_0 )
            // InternalBrowserAutomation.g:1983:3: rule__Contains__VarAssignment_0
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
    // InternalBrowserAutomation.g:1991:1: rule__Contains__Group__1 : rule__Contains__Group__1__Impl rule__Contains__Group__2 ;
    public final void rule__Contains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1995:1: ( rule__Contains__Group__1__Impl rule__Contains__Group__2 )
            // InternalBrowserAutomation.g:1996:2: rule__Contains__Group__1__Impl rule__Contains__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBrowserAutomation.g:2003:1: rule__Contains__Group__1__Impl : ( 'contains' ) ;
    public final void rule__Contains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2007:1: ( ( 'contains' ) )
            // InternalBrowserAutomation.g:2008:1: ( 'contains' )
            {
            // InternalBrowserAutomation.g:2008:1: ( 'contains' )
            // InternalBrowserAutomation.g:2009:2: 'contains'
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
    // InternalBrowserAutomation.g:2018:1: rule__Contains__Group__2 : rule__Contains__Group__2__Impl ;
    public final void rule__Contains__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2022:1: ( rule__Contains__Group__2__Impl )
            // InternalBrowserAutomation.g:2023:2: rule__Contains__Group__2__Impl
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
    // InternalBrowserAutomation.g:2029:1: rule__Contains__Group__2__Impl : ( ( rule__Contains__Var2Assignment_2 ) ) ;
    public final void rule__Contains__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2033:1: ( ( ( rule__Contains__Var2Assignment_2 ) ) )
            // InternalBrowserAutomation.g:2034:1: ( ( rule__Contains__Var2Assignment_2 ) )
            {
            // InternalBrowserAutomation.g:2034:1: ( ( rule__Contains__Var2Assignment_2 ) )
            // InternalBrowserAutomation.g:2035:2: ( rule__Contains__Var2Assignment_2 )
            {
             before(grammarAccess.getContainsAccess().getVar2Assignment_2()); 
            // InternalBrowserAutomation.g:2036:2: ( rule__Contains__Var2Assignment_2 )
            // InternalBrowserAutomation.g:2036:3: rule__Contains__Var2Assignment_2
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


    // $ANTLR start "rule__Test__WebBrowserAssignment_2"
    // InternalBrowserAutomation.g:2045:1: rule__Test__WebBrowserAssignment_2 : ( ruleWebBrowser ) ;
    public final void rule__Test__WebBrowserAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2049:1: ( ( ruleWebBrowser ) )
            // InternalBrowserAutomation.g:2050:2: ( ruleWebBrowser )
            {
            // InternalBrowserAutomation.g:2050:2: ( ruleWebBrowser )
            // InternalBrowserAutomation.g:2051:3: ruleWebBrowser
            {
             before(grammarAccess.getTestAccess().getWebBrowserWebBrowserParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWebBrowser();

            state._fsp--;

             after(grammarAccess.getTestAccess().getWebBrowserWebBrowserParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__WebBrowserAssignment_2"


    // $ANTLR start "rule__Test__StatementsAssignment_3"
    // InternalBrowserAutomation.g:2060:1: rule__Test__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Test__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2064:1: ( ( ruleStatement ) )
            // InternalBrowserAutomation.g:2065:2: ( ruleStatement )
            {
            // InternalBrowserAutomation.g:2065:2: ( ruleStatement )
            // InternalBrowserAutomation.g:2066:3: ruleStatement
            {
             before(grammarAccess.getTestAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTestAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__StatementsAssignment_3"


    // $ANTLR start "rule__Statement__ActionAssignment_0_1"
    // InternalBrowserAutomation.g:2075:1: rule__Statement__ActionAssignment_0_1 : ( ruleAction ) ;
    public final void rule__Statement__ActionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2079:1: ( ( ruleAction ) )
            // InternalBrowserAutomation.g:2080:2: ( ruleAction )
            {
            // InternalBrowserAutomation.g:2080:2: ( ruleAction )
            // InternalBrowserAutomation.g:2081:3: ruleAction
            {
             before(grammarAccess.getStatementAccess().getActionActionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getActionActionParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__ActionAssignment_0_1"


    // $ANTLR start "rule__Statement__UrlAssignment_3_2"
    // InternalBrowserAutomation.g:2090:1: rule__Statement__UrlAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__Statement__UrlAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2094:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2095:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2095:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2096:3: RULE_STRING
            {
             before(grammarAccess.getStatementAccess().getUrlSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getUrlSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__UrlAssignment_3_2"


    // $ANTLR start "rule__Get__VarAssignment_0"
    // InternalBrowserAutomation.g:2105:1: rule__Get__VarAssignment_0 : ( ruleVariable ) ;
    public final void rule__Get__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2109:1: ( ( ruleVariable ) )
            // InternalBrowserAutomation.g:2110:2: ( ruleVariable )
            {
            // InternalBrowserAutomation.g:2110:2: ( ruleVariable )
            // InternalBrowserAutomation.g:2111:3: ruleVariable
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
    // InternalBrowserAutomation.g:2120:1: rule__Get__ElementAssignment_3_0_0 : ( ruleElement ) ;
    public final void rule__Get__ElementAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2124:1: ( ( ruleElement ) )
            // InternalBrowserAutomation.g:2125:2: ( ruleElement )
            {
            // InternalBrowserAutomation.g:2125:2: ( ruleElement )
            // InternalBrowserAutomation.g:2126:3: ruleElement
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
    // InternalBrowserAutomation.g:2135:1: rule__Get__OrderAssignment_3_0_1 : ( ruleOrder ) ;
    public final void rule__Get__OrderAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2139:1: ( ( ruleOrder ) )
            // InternalBrowserAutomation.g:2140:2: ( ruleOrder )
            {
            // InternalBrowserAutomation.g:2140:2: ( ruleOrder )
            // InternalBrowserAutomation.g:2141:3: ruleOrder
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
    // InternalBrowserAutomation.g:2150:1: rule__Get__AttrAssignment_3_0_2_0_1 : ( ruleAttribut ) ;
    public final void rule__Get__AttrAssignment_3_0_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2154:1: ( ( ruleAttribut ) )
            // InternalBrowserAutomation.g:2155:2: ( ruleAttribut )
            {
            // InternalBrowserAutomation.g:2155:2: ( ruleAttribut )
            // InternalBrowserAutomation.g:2156:3: ruleAttribut
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
    // InternalBrowserAutomation.g:2165:1: rule__Get__AttrValAssignment_3_0_2_0_3_0 : ( RULE_STRING ) ;
    public final void rule__Get__AttrValAssignment_3_0_2_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2169:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2170:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2170:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2171:3: RULE_STRING
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
    // InternalBrowserAutomation.g:2180:1: rule__Get__AttrVarAssignment_3_0_2_0_3_1 : ( ruleVarReference ) ;
    public final void rule__Get__AttrVarAssignment_3_0_2_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2184:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2185:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2185:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2186:3: ruleVarReference
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
    // InternalBrowserAutomation.g:2195:1: rule__Get__VarRefAssignment_3_0_2_1_1 : ( ruleVarReference ) ;
    public final void rule__Get__VarRefAssignment_3_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2199:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2200:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2200:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2201:3: ruleVarReference
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
    // InternalBrowserAutomation.g:2210:1: rule__Order__OrderAssignment_1 : ( RULE_INT ) ;
    public final void rule__Order__OrderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2214:1: ( ( RULE_INT ) )
            // InternalBrowserAutomation.g:2215:2: ( RULE_INT )
            {
            // InternalBrowserAutomation.g:2215:2: ( RULE_INT )
            // InternalBrowserAutomation.g:2216:3: RULE_INT
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
    // InternalBrowserAutomation.g:2225:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2229:1: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:2230:2: ( RULE_ID )
            {
            // InternalBrowserAutomation.g:2230:2: ( RULE_ID )
            // InternalBrowserAutomation.g:2231:3: RULE_ID
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
    // InternalBrowserAutomation.g:2240:1: rule__VarReference__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VarReference__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2244:1: ( ( ( RULE_ID ) ) )
            // InternalBrowserAutomation.g:2245:2: ( ( RULE_ID ) )
            {
            // InternalBrowserAutomation.g:2245:2: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:2246:3: ( RULE_ID )
            {
             before(grammarAccess.getVarReferenceAccess().getVarVariableCrossReference_0()); 
            // InternalBrowserAutomation.g:2247:3: ( RULE_ID )
            // InternalBrowserAutomation.g:2248:4: RULE_ID
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
    // InternalBrowserAutomation.g:2259:1: rule__Click__VarAssignment_2 : ( ruleVarReference ) ;
    public final void rule__Click__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2263:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2264:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2264:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2265:3: ruleVarReference
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


    // $ANTLR start "rule__Insert__VarAssignment_1"
    // InternalBrowserAutomation.g:2274:1: rule__Insert__VarAssignment_1 : ( ruleVarReference ) ;
    public final void rule__Insert__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2278:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2279:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2279:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2280:3: ruleVarReference
            {
             before(grammarAccess.getInsertAccess().getVarVarReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getVarVarReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__VarAssignment_1"


    // $ANTLR start "rule__Insert__Var2Assignment_3"
    // InternalBrowserAutomation.g:2289:1: rule__Insert__Var2Assignment_3 : ( ruleVarReference ) ;
    public final void rule__Insert__Var2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2293:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2294:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2294:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2295:3: ruleVarReference
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
    // InternalBrowserAutomation.g:2304:1: rule__Verify__VarAssignment_0 : ( ruleVarReference ) ;
    public final void rule__Verify__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2308:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2309:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2309:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2310:3: ruleVarReference
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
    // InternalBrowserAutomation.g:2319:1: rule__Check__VarAssignment_1 : ( ruleVarReference ) ;
    public final void rule__Check__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2323:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2324:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2324:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2325:3: ruleVarReference
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
    // InternalBrowserAutomation.g:2334:1: rule__Choose__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Choose__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2338:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2339:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2339:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2340:3: RULE_STRING
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
    // InternalBrowserAutomation.g:2349:1: rule__Choose__VarAssignment_3 : ( ruleVarReference ) ;
    public final void rule__Choose__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2353:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2354:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2354:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2355:3: ruleVarReference
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
    // InternalBrowserAutomation.g:2364:1: rule__Contains__VarAssignment_0 : ( ruleVarReference ) ;
    public final void rule__Contains__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2368:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2369:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2369:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2370:3: ruleVarReference
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
    // InternalBrowserAutomation.g:2379:1: rule__Contains__Var2Assignment_2 : ( ruleVarReference ) ;
    public final void rule__Contains__Var2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2383:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:2384:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:2384:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:2385:3: ruleVarReference
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
    static final String dfa_3s = "\1\6\1\43\2\uffff\1\44\1\16\10\45\1\6\1\5\1\27\1\6\1\uffff\1\43\1\uffff\1\45\5\46\1\6\1\4\2\47\1\6";
    static final String dfa_4s = "\1\41\1\43\2\uffff\1\44\1\26\10\51\1\62\1\5\1\33\1\6\1\uffff\1\63\1\uffff\1\50\5\46\1\62\1\6\2\47\1\62";
    static final String dfa_5s = "\2\uffff\1\3\1\4\16\uffff\1\2\1\uffff\1\1\13\uffff";
    static final String dfa_6s = "\40\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\30\uffff\1\2\1\uffff\1\3",
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
            "\1\23\30\uffff\1\22\1\uffff\1\22\10\uffff\1\24\1\uffff\1\24\4\uffff\2\24",
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
            "\1\23\30\uffff\1\22\1\uffff\1\22\10\uffff\1\24\1\uffff\1\24\4\uffff\2\24",
            "\1\35\1\uffff\1\36",
            "\1\37",
            "\1\37",
            "\1\23\30\uffff\1\22\1\uffff\1\22\10\uffff\1\24\1\uffff\1\24\4\uffff\2\24"
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
            return "485:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ruleGet ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020003800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000280000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000280000042L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0006140000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000007FC000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000032000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000000L});

}