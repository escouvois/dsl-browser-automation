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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'firefox'", "'chrome'", "'safari'", "'internet explorer'", "'link'", "'input'", "'button'", "'checkbox'", "'combobox'", "'image'", "'text'", "'class'", "'value'", "'alt'", "'open'", "'go'", "'to'", "':'", "'get'", "'by'", "'='", "'click'", "'on'", "'insert'", "'in'", "'verify page contains'"
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


    // $ANTLR start "entryRuleAction"
    // InternalBrowserAutomation.g:103:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:104:1: ( ruleAction EOF )
            // InternalBrowserAutomation.g:105:1: ruleAction EOF
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
    // InternalBrowserAutomation.g:112:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:116:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalBrowserAutomation.g:117:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalBrowserAutomation.g:117:2: ( ( rule__Action__Alternatives ) )
            // InternalBrowserAutomation.g:118:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:119:3: ( rule__Action__Alternatives )
            // InternalBrowserAutomation.g:119:4: rule__Action__Alternatives
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
    // InternalBrowserAutomation.g:128:1: entryRuleGet : ruleGet EOF ;
    public final void entryRuleGet() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:129:1: ( ruleGet EOF )
            // InternalBrowserAutomation.g:130:1: ruleGet EOF
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
    // InternalBrowserAutomation.g:137:1: ruleGet : ( ( rule__Get__Group__0 ) ) ;
    public final void ruleGet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:141:2: ( ( ( rule__Get__Group__0 ) ) )
            // InternalBrowserAutomation.g:142:2: ( ( rule__Get__Group__0 ) )
            {
            // InternalBrowserAutomation.g:142:2: ( ( rule__Get__Group__0 ) )
            // InternalBrowserAutomation.g:143:3: ( rule__Get__Group__0 )
            {
             before(grammarAccess.getGetAccess().getGroup()); 
            // InternalBrowserAutomation.g:144:3: ( rule__Get__Group__0 )
            // InternalBrowserAutomation.g:144:4: rule__Get__Group__0
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


    // $ANTLR start "entryRuleElement"
    // InternalBrowserAutomation.g:153:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:154:1: ( ruleElement EOF )
            // InternalBrowserAutomation.g:155:1: ruleElement EOF
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
    // InternalBrowserAutomation.g:162:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:166:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalBrowserAutomation.g:167:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalBrowserAutomation.g:167:2: ( ( rule__Element__Alternatives ) )
            // InternalBrowserAutomation.g:168:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:169:3: ( rule__Element__Alternatives )
            // InternalBrowserAutomation.g:169:4: rule__Element__Alternatives
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
    // InternalBrowserAutomation.g:178:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:179:1: ( ruleAttribut EOF )
            // InternalBrowserAutomation.g:180:1: ruleAttribut EOF
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
    // InternalBrowserAutomation.g:187:1: ruleAttribut : ( ( rule__Attribut__Alternatives ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:191:2: ( ( ( rule__Attribut__Alternatives ) ) )
            // InternalBrowserAutomation.g:192:2: ( ( rule__Attribut__Alternatives ) )
            {
            // InternalBrowserAutomation.g:192:2: ( ( rule__Attribut__Alternatives ) )
            // InternalBrowserAutomation.g:193:3: ( rule__Attribut__Alternatives )
            {
             before(grammarAccess.getAttributAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:194:3: ( rule__Attribut__Alternatives )
            // InternalBrowserAutomation.g:194:4: rule__Attribut__Alternatives
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
    // InternalBrowserAutomation.g:203:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:204:1: ( ruleVariable EOF )
            // InternalBrowserAutomation.g:205:1: ruleVariable EOF
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
    // InternalBrowserAutomation.g:212:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:216:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalBrowserAutomation.g:217:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalBrowserAutomation.g:217:2: ( ( rule__Variable__NameAssignment ) )
            // InternalBrowserAutomation.g:218:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalBrowserAutomation.g:219:3: ( rule__Variable__NameAssignment )
            // InternalBrowserAutomation.g:219:4: rule__Variable__NameAssignment
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
    // InternalBrowserAutomation.g:228:1: entryRuleVarReference : ruleVarReference EOF ;
    public final void entryRuleVarReference() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:229:1: ( ruleVarReference EOF )
            // InternalBrowserAutomation.g:230:1: ruleVarReference EOF
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
    // InternalBrowserAutomation.g:237:1: ruleVarReference : ( ( rule__VarReference__VarAssignment ) ) ;
    public final void ruleVarReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:241:2: ( ( ( rule__VarReference__VarAssignment ) ) )
            // InternalBrowserAutomation.g:242:2: ( ( rule__VarReference__VarAssignment ) )
            {
            // InternalBrowserAutomation.g:242:2: ( ( rule__VarReference__VarAssignment ) )
            // InternalBrowserAutomation.g:243:3: ( rule__VarReference__VarAssignment )
            {
             before(grammarAccess.getVarReferenceAccess().getVarAssignment()); 
            // InternalBrowserAutomation.g:244:3: ( rule__VarReference__VarAssignment )
            // InternalBrowserAutomation.g:244:4: rule__VarReference__VarAssignment
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
    // InternalBrowserAutomation.g:253:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:254:1: ( ruleClick EOF )
            // InternalBrowserAutomation.g:255:1: ruleClick EOF
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
    // InternalBrowserAutomation.g:262:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:266:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalBrowserAutomation.g:267:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalBrowserAutomation.g:267:2: ( ( rule__Click__Group__0 ) )
            // InternalBrowserAutomation.g:268:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalBrowserAutomation.g:269:3: ( rule__Click__Group__0 )
            // InternalBrowserAutomation.g:269:4: rule__Click__Group__0
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
    // InternalBrowserAutomation.g:278:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:279:1: ( ruleInsert EOF )
            // InternalBrowserAutomation.g:280:1: ruleInsert EOF
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
    // InternalBrowserAutomation.g:287:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:291:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalBrowserAutomation.g:292:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalBrowserAutomation.g:292:2: ( ( rule__Insert__Group__0 ) )
            // InternalBrowserAutomation.g:293:3: ( rule__Insert__Group__0 )
            {
             before(grammarAccess.getInsertAccess().getGroup()); 
            // InternalBrowserAutomation.g:294:3: ( rule__Insert__Group__0 )
            // InternalBrowserAutomation.g:294:4: rule__Insert__Group__0
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
    // InternalBrowserAutomation.g:303:1: entryRuleVerify : ruleVerify EOF ;
    public final void entryRuleVerify() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:304:1: ( ruleVerify EOF )
            // InternalBrowserAutomation.g:305:1: ruleVerify EOF
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
    // InternalBrowserAutomation.g:312:1: ruleVerify : ( ( rule__Verify__Group__0 ) ) ;
    public final void ruleVerify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:316:2: ( ( ( rule__Verify__Group__0 ) ) )
            // InternalBrowserAutomation.g:317:2: ( ( rule__Verify__Group__0 ) )
            {
            // InternalBrowserAutomation.g:317:2: ( ( rule__Verify__Group__0 ) )
            // InternalBrowserAutomation.g:318:3: ( rule__Verify__Group__0 )
            {
             before(grammarAccess.getVerifyAccess().getGroup()); 
            // InternalBrowserAutomation.g:319:3: ( rule__Verify__Group__0 )
            // InternalBrowserAutomation.g:319:4: rule__Verify__Group__0
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


    // $ANTLR start "rule__WebBrowser__Alternatives"
    // InternalBrowserAutomation.g:327:1: rule__WebBrowser__Alternatives : ( ( 'firefox' ) | ( 'chrome' ) | ( 'safari' ) | ( 'internet explorer' ) );
    public final void rule__WebBrowser__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:331:1: ( ( 'firefox' ) | ( 'chrome' ) | ( 'safari' ) | ( 'internet explorer' ) )
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
                    // InternalBrowserAutomation.g:332:2: ( 'firefox' )
                    {
                    // InternalBrowserAutomation.g:332:2: ( 'firefox' )
                    // InternalBrowserAutomation.g:333:3: 'firefox'
                    {
                     before(grammarAccess.getWebBrowserAccess().getFirefoxKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getFirefoxKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:338:2: ( 'chrome' )
                    {
                    // InternalBrowserAutomation.g:338:2: ( 'chrome' )
                    // InternalBrowserAutomation.g:339:3: 'chrome'
                    {
                     before(grammarAccess.getWebBrowserAccess().getChromeKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getChromeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:344:2: ( 'safari' )
                    {
                    // InternalBrowserAutomation.g:344:2: ( 'safari' )
                    // InternalBrowserAutomation.g:345:3: 'safari'
                    {
                     before(grammarAccess.getWebBrowserAccess().getSafariKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getSafariKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:350:2: ( 'internet explorer' )
                    {
                    // InternalBrowserAutomation.g:350:2: ( 'internet explorer' )
                    // InternalBrowserAutomation.g:351:3: 'internet explorer'
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


    // $ANTLR start "rule__Action__Alternatives"
    // InternalBrowserAutomation.g:360:1: rule__Action__Alternatives : ( ( ruleClick ) | ( ruleInsert ) | ( ruleVerify ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:364:1: ( ( ruleClick ) | ( ruleInsert ) | ( ruleVerify ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalBrowserAutomation.g:365:2: ( ruleClick )
                    {
                    // InternalBrowserAutomation.g:365:2: ( ruleClick )
                    // InternalBrowserAutomation.g:366:3: ruleClick
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
                    // InternalBrowserAutomation.g:371:2: ( ruleInsert )
                    {
                    // InternalBrowserAutomation.g:371:2: ( ruleInsert )
                    // InternalBrowserAutomation.g:372:3: ruleInsert
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
                    // InternalBrowserAutomation.g:377:2: ( ruleVerify )
                    {
                    // InternalBrowserAutomation.g:377:2: ( ruleVerify )
                    // InternalBrowserAutomation.g:378:3: ruleVerify
                    {
                     before(grammarAccess.getActionAccess().getVerifyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVerify();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getVerifyParserRuleCall_2()); 

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


    // $ANTLR start "rule__Element__Alternatives"
    // InternalBrowserAutomation.g:387:1: rule__Element__Alternatives : ( ( 'link' ) | ( 'input' ) | ( 'button' ) | ( 'checkbox' ) | ( 'combobox' ) | ( 'image' ) | ( 'text' ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:391:1: ( ( 'link' ) | ( 'input' ) | ( 'button' ) | ( 'checkbox' ) | ( 'combobox' ) | ( 'image' ) | ( 'text' ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            case 20:
                {
                alt3=6;
                }
                break;
            case 21:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBrowserAutomation.g:392:2: ( 'link' )
                    {
                    // InternalBrowserAutomation.g:392:2: ( 'link' )
                    // InternalBrowserAutomation.g:393:3: 'link'
                    {
                     before(grammarAccess.getElementAccess().getLinkKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getLinkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:398:2: ( 'input' )
                    {
                    // InternalBrowserAutomation.g:398:2: ( 'input' )
                    // InternalBrowserAutomation.g:399:3: 'input'
                    {
                     before(grammarAccess.getElementAccess().getInputKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getInputKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:404:2: ( 'button' )
                    {
                    // InternalBrowserAutomation.g:404:2: ( 'button' )
                    // InternalBrowserAutomation.g:405:3: 'button'
                    {
                     before(grammarAccess.getElementAccess().getButtonKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getButtonKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:410:2: ( 'checkbox' )
                    {
                    // InternalBrowserAutomation.g:410:2: ( 'checkbox' )
                    // InternalBrowserAutomation.g:411:3: 'checkbox'
                    {
                     before(grammarAccess.getElementAccess().getCheckboxKeyword_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getCheckboxKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:416:2: ( 'combobox' )
                    {
                    // InternalBrowserAutomation.g:416:2: ( 'combobox' )
                    // InternalBrowserAutomation.g:417:3: 'combobox'
                    {
                     before(grammarAccess.getElementAccess().getComboboxKeyword_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getComboboxKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:422:2: ( 'image' )
                    {
                    // InternalBrowserAutomation.g:422:2: ( 'image' )
                    // InternalBrowserAutomation.g:423:3: 'image'
                    {
                     before(grammarAccess.getElementAccess().getImageKeyword_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getImageKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBrowserAutomation.g:428:2: ( 'text' )
                    {
                    // InternalBrowserAutomation.g:428:2: ( 'text' )
                    // InternalBrowserAutomation.g:429:3: 'text'
                    {
                     before(grammarAccess.getElementAccess().getTextKeyword_6()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getTextKeyword_6()); 

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
    // InternalBrowserAutomation.g:438:1: rule__Attribut__Alternatives : ( ( 'class' ) | ( 'value' ) | ( 'alt' ) );
    public final void rule__Attribut__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:442:1: ( ( 'class' ) | ( 'value' ) | ( 'alt' ) )
            int alt4=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBrowserAutomation.g:443:2: ( 'class' )
                    {
                    // InternalBrowserAutomation.g:443:2: ( 'class' )
                    // InternalBrowserAutomation.g:444:3: 'class'
                    {
                     before(grammarAccess.getAttributAccess().getClassKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getClassKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:449:2: ( 'value' )
                    {
                    // InternalBrowserAutomation.g:449:2: ( 'value' )
                    // InternalBrowserAutomation.g:450:3: 'value'
                    {
                     before(grammarAccess.getAttributAccess().getValueKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getValueKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:455:2: ( 'alt' )
                    {
                    // InternalBrowserAutomation.g:455:2: ( 'alt' )
                    // InternalBrowserAutomation.g:456:3: 'alt'
                    {
                     before(grammarAccess.getAttributAccess().getAltKeyword_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getAltKeyword_2()); 

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
    // InternalBrowserAutomation.g:465:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:469:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalBrowserAutomation.g:470:2: rule__Test__Group__0__Impl rule__Test__Group__1
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
    // InternalBrowserAutomation.g:477:1: rule__Test__Group__0__Impl : ( () ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:481:1: ( ( () ) )
            // InternalBrowserAutomation.g:482:1: ( () )
            {
            // InternalBrowserAutomation.g:482:1: ( () )
            // InternalBrowserAutomation.g:483:2: ()
            {
             before(grammarAccess.getTestAccess().getTestAction_0()); 
            // InternalBrowserAutomation.g:484:2: ()
            // InternalBrowserAutomation.g:484:3: 
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
    // InternalBrowserAutomation.g:492:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:496:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalBrowserAutomation.g:497:2: rule__Test__Group__1__Impl rule__Test__Group__2
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
    // InternalBrowserAutomation.g:504:1: rule__Test__Group__1__Impl : ( 'open' ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:508:1: ( ( 'open' ) )
            // InternalBrowserAutomation.g:509:1: ( 'open' )
            {
            // InternalBrowserAutomation.g:509:1: ( 'open' )
            // InternalBrowserAutomation.g:510:2: 'open'
            {
             before(grammarAccess.getTestAccess().getOpenKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:519:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:523:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalBrowserAutomation.g:524:2: rule__Test__Group__2__Impl rule__Test__Group__3
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
    // InternalBrowserAutomation.g:531:1: rule__Test__Group__2__Impl : ( ( rule__Test__WebBrowserAssignment_2 ) ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:535:1: ( ( ( rule__Test__WebBrowserAssignment_2 ) ) )
            // InternalBrowserAutomation.g:536:1: ( ( rule__Test__WebBrowserAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:536:1: ( ( rule__Test__WebBrowserAssignment_2 ) )
            // InternalBrowserAutomation.g:537:2: ( rule__Test__WebBrowserAssignment_2 )
            {
             before(grammarAccess.getTestAccess().getWebBrowserAssignment_2()); 
            // InternalBrowserAutomation.g:538:2: ( rule__Test__WebBrowserAssignment_2 )
            // InternalBrowserAutomation.g:538:3: rule__Test__WebBrowserAssignment_2
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
    // InternalBrowserAutomation.g:546:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:550:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalBrowserAutomation.g:551:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__4();

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
    // InternalBrowserAutomation.g:558:1: rule__Test__Group__3__Impl : ( 'go' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:562:1: ( ( 'go' ) )
            // InternalBrowserAutomation.g:563:1: ( 'go' )
            {
            // InternalBrowserAutomation.g:563:1: ( 'go' )
            // InternalBrowserAutomation.g:564:2: 'go'
            {
             before(grammarAccess.getTestAccess().getGoKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getGoKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Test__Group__4"
    // InternalBrowserAutomation.g:573:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:577:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalBrowserAutomation.g:578:2: rule__Test__Group__4__Impl rule__Test__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Test__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__5();

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
    // $ANTLR end "rule__Test__Group__4"


    // $ANTLR start "rule__Test__Group__4__Impl"
    // InternalBrowserAutomation.g:585:1: rule__Test__Group__4__Impl : ( 'to' ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:589:1: ( ( 'to' ) )
            // InternalBrowserAutomation.g:590:1: ( 'to' )
            {
            // InternalBrowserAutomation.g:590:1: ( 'to' )
            // InternalBrowserAutomation.g:591:2: 'to'
            {
             before(grammarAccess.getTestAccess().getToKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4__Impl"


    // $ANTLR start "rule__Test__Group__5"
    // InternalBrowserAutomation.g:600:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:604:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalBrowserAutomation.g:605:2: rule__Test__Group__5__Impl rule__Test__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Test__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__6();

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
    // $ANTLR end "rule__Test__Group__5"


    // $ANTLR start "rule__Test__Group__5__Impl"
    // InternalBrowserAutomation.g:612:1: rule__Test__Group__5__Impl : ( ( rule__Test__UrlAssignment_5 ) ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:616:1: ( ( ( rule__Test__UrlAssignment_5 ) ) )
            // InternalBrowserAutomation.g:617:1: ( ( rule__Test__UrlAssignment_5 ) )
            {
            // InternalBrowserAutomation.g:617:1: ( ( rule__Test__UrlAssignment_5 ) )
            // InternalBrowserAutomation.g:618:2: ( rule__Test__UrlAssignment_5 )
            {
             before(grammarAccess.getTestAccess().getUrlAssignment_5()); 
            // InternalBrowserAutomation.g:619:2: ( rule__Test__UrlAssignment_5 )
            // InternalBrowserAutomation.g:619:3: rule__Test__UrlAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Test__UrlAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getUrlAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5__Impl"


    // $ANTLR start "rule__Test__Group__6"
    // InternalBrowserAutomation.g:627:1: rule__Test__Group__6 : rule__Test__Group__6__Impl ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:631:1: ( rule__Test__Group__6__Impl )
            // InternalBrowserAutomation.g:632:2: rule__Test__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__6__Impl();

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
    // $ANTLR end "rule__Test__Group__6"


    // $ANTLR start "rule__Test__Group__6__Impl"
    // InternalBrowserAutomation.g:638:1: rule__Test__Group__6__Impl : ( ( rule__Test__ActionsAssignment_6 )* ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:642:1: ( ( ( rule__Test__ActionsAssignment_6 )* ) )
            // InternalBrowserAutomation.g:643:1: ( ( rule__Test__ActionsAssignment_6 )* )
            {
            // InternalBrowserAutomation.g:643:1: ( ( rule__Test__ActionsAssignment_6 )* )
            // InternalBrowserAutomation.g:644:2: ( rule__Test__ActionsAssignment_6 )*
            {
             before(grammarAccess.getTestAccess().getActionsAssignment_6()); 
            // InternalBrowserAutomation.g:645:2: ( rule__Test__ActionsAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBrowserAutomation.g:645:3: rule__Test__ActionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Test__ActionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getActionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6__Impl"


    // $ANTLR start "rule__Get__Group__0"
    // InternalBrowserAutomation.g:654:1: rule__Get__Group__0 : rule__Get__Group__0__Impl rule__Get__Group__1 ;
    public final void rule__Get__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:658:1: ( rule__Get__Group__0__Impl rule__Get__Group__1 )
            // InternalBrowserAutomation.g:659:2: rule__Get__Group__0__Impl rule__Get__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalBrowserAutomation.g:666:1: rule__Get__Group__0__Impl : ( ( rule__Get__VarAssignment_0 ) ) ;
    public final void rule__Get__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:670:1: ( ( ( rule__Get__VarAssignment_0 ) ) )
            // InternalBrowserAutomation.g:671:1: ( ( rule__Get__VarAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:671:1: ( ( rule__Get__VarAssignment_0 ) )
            // InternalBrowserAutomation.g:672:2: ( rule__Get__VarAssignment_0 )
            {
             before(grammarAccess.getGetAccess().getVarAssignment_0()); 
            // InternalBrowserAutomation.g:673:2: ( rule__Get__VarAssignment_0 )
            // InternalBrowserAutomation.g:673:3: rule__Get__VarAssignment_0
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
    // InternalBrowserAutomation.g:681:1: rule__Get__Group__1 : rule__Get__Group__1__Impl rule__Get__Group__2 ;
    public final void rule__Get__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:685:1: ( rule__Get__Group__1__Impl rule__Get__Group__2 )
            // InternalBrowserAutomation.g:686:2: rule__Get__Group__1__Impl rule__Get__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalBrowserAutomation.g:693:1: rule__Get__Group__1__Impl : ( ':' ) ;
    public final void rule__Get__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:697:1: ( ( ':' ) )
            // InternalBrowserAutomation.g:698:1: ( ':' )
            {
            // InternalBrowserAutomation.g:698:1: ( ':' )
            // InternalBrowserAutomation.g:699:2: ':'
            {
             before(grammarAccess.getGetAccess().getColonKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:708:1: rule__Get__Group__2 : rule__Get__Group__2__Impl rule__Get__Group__3 ;
    public final void rule__Get__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:712:1: ( rule__Get__Group__2__Impl rule__Get__Group__3 )
            // InternalBrowserAutomation.g:713:2: rule__Get__Group__2__Impl rule__Get__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalBrowserAutomation.g:720:1: rule__Get__Group__2__Impl : ( 'get' ) ;
    public final void rule__Get__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:724:1: ( ( 'get' ) )
            // InternalBrowserAutomation.g:725:1: ( 'get' )
            {
            // InternalBrowserAutomation.g:725:1: ( 'get' )
            // InternalBrowserAutomation.g:726:2: 'get'
            {
             before(grammarAccess.getGetAccess().getGetKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:735:1: rule__Get__Group__3 : rule__Get__Group__3__Impl rule__Get__Group__4 ;
    public final void rule__Get__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:739:1: ( rule__Get__Group__3__Impl rule__Get__Group__4 )
            // InternalBrowserAutomation.g:740:2: rule__Get__Group__3__Impl rule__Get__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Get__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group__4();

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
    // InternalBrowserAutomation.g:747:1: rule__Get__Group__3__Impl : ( ( rule__Get__ElementAssignment_3 ) ) ;
    public final void rule__Get__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:751:1: ( ( ( rule__Get__ElementAssignment_3 ) ) )
            // InternalBrowserAutomation.g:752:1: ( ( rule__Get__ElementAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:752:1: ( ( rule__Get__ElementAssignment_3 ) )
            // InternalBrowserAutomation.g:753:2: ( rule__Get__ElementAssignment_3 )
            {
             before(grammarAccess.getGetAccess().getElementAssignment_3()); 
            // InternalBrowserAutomation.g:754:2: ( rule__Get__ElementAssignment_3 )
            // InternalBrowserAutomation.g:754:3: rule__Get__ElementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Get__ElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getElementAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Get__Group__4"
    // InternalBrowserAutomation.g:762:1: rule__Get__Group__4 : rule__Get__Group__4__Impl rule__Get__Group__5 ;
    public final void rule__Get__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:766:1: ( rule__Get__Group__4__Impl rule__Get__Group__5 )
            // InternalBrowserAutomation.g:767:2: rule__Get__Group__4__Impl rule__Get__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Get__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group__5();

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
    // $ANTLR end "rule__Get__Group__4"


    // $ANTLR start "rule__Get__Group__4__Impl"
    // InternalBrowserAutomation.g:774:1: rule__Get__Group__4__Impl : ( 'by' ) ;
    public final void rule__Get__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:778:1: ( ( 'by' ) )
            // InternalBrowserAutomation.g:779:1: ( 'by' )
            {
            // InternalBrowserAutomation.g:779:1: ( 'by' )
            // InternalBrowserAutomation.g:780:2: 'by'
            {
             before(grammarAccess.getGetAccess().getByKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__4__Impl"


    // $ANTLR start "rule__Get__Group__5"
    // InternalBrowserAutomation.g:789:1: rule__Get__Group__5 : rule__Get__Group__5__Impl rule__Get__Group__6 ;
    public final void rule__Get__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:793:1: ( rule__Get__Group__5__Impl rule__Get__Group__6 )
            // InternalBrowserAutomation.g:794:2: rule__Get__Group__5__Impl rule__Get__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Get__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group__6();

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
    // $ANTLR end "rule__Get__Group__5"


    // $ANTLR start "rule__Get__Group__5__Impl"
    // InternalBrowserAutomation.g:801:1: rule__Get__Group__5__Impl : ( ( rule__Get__AttrAssignment_5 ) ) ;
    public final void rule__Get__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:805:1: ( ( ( rule__Get__AttrAssignment_5 ) ) )
            // InternalBrowserAutomation.g:806:1: ( ( rule__Get__AttrAssignment_5 ) )
            {
            // InternalBrowserAutomation.g:806:1: ( ( rule__Get__AttrAssignment_5 ) )
            // InternalBrowserAutomation.g:807:2: ( rule__Get__AttrAssignment_5 )
            {
             before(grammarAccess.getGetAccess().getAttrAssignment_5()); 
            // InternalBrowserAutomation.g:808:2: ( rule__Get__AttrAssignment_5 )
            // InternalBrowserAutomation.g:808:3: rule__Get__AttrAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Get__AttrAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getAttrAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__5__Impl"


    // $ANTLR start "rule__Get__Group__6"
    // InternalBrowserAutomation.g:816:1: rule__Get__Group__6 : rule__Get__Group__6__Impl rule__Get__Group__7 ;
    public final void rule__Get__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:820:1: ( rule__Get__Group__6__Impl rule__Get__Group__7 )
            // InternalBrowserAutomation.g:821:2: rule__Get__Group__6__Impl rule__Get__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Get__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group__7();

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
    // $ANTLR end "rule__Get__Group__6"


    // $ANTLR start "rule__Get__Group__6__Impl"
    // InternalBrowserAutomation.g:828:1: rule__Get__Group__6__Impl : ( '=' ) ;
    public final void rule__Get__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:832:1: ( ( '=' ) )
            // InternalBrowserAutomation.g:833:1: ( '=' )
            {
            // InternalBrowserAutomation.g:833:1: ( '=' )
            // InternalBrowserAutomation.g:834:2: '='
            {
             before(grammarAccess.getGetAccess().getEqualsSignKeyword_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__6__Impl"


    // $ANTLR start "rule__Get__Group__7"
    // InternalBrowserAutomation.g:843:1: rule__Get__Group__7 : rule__Get__Group__7__Impl ;
    public final void rule__Get__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:847:1: ( rule__Get__Group__7__Impl )
            // InternalBrowserAutomation.g:848:2: rule__Get__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Get__Group__7__Impl();

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
    // $ANTLR end "rule__Get__Group__7"


    // $ANTLR start "rule__Get__Group__7__Impl"
    // InternalBrowserAutomation.g:854:1: rule__Get__Group__7__Impl : ( ( rule__Get__AttrValAssignment_7 ) ) ;
    public final void rule__Get__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:858:1: ( ( ( rule__Get__AttrValAssignment_7 ) ) )
            // InternalBrowserAutomation.g:859:1: ( ( rule__Get__AttrValAssignment_7 ) )
            {
            // InternalBrowserAutomation.g:859:1: ( ( rule__Get__AttrValAssignment_7 ) )
            // InternalBrowserAutomation.g:860:2: ( rule__Get__AttrValAssignment_7 )
            {
             before(grammarAccess.getGetAccess().getAttrValAssignment_7()); 
            // InternalBrowserAutomation.g:861:2: ( rule__Get__AttrValAssignment_7 )
            // InternalBrowserAutomation.g:861:3: rule__Get__AttrValAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Get__AttrValAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getAttrValAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__7__Impl"


    // $ANTLR start "rule__Click__Group__0"
    // InternalBrowserAutomation.g:870:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:874:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalBrowserAutomation.g:875:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBrowserAutomation.g:882:1: rule__Click__Group__0__Impl : ( ( rule__Click__GetAssignment_0 ) ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:886:1: ( ( ( rule__Click__GetAssignment_0 ) ) )
            // InternalBrowserAutomation.g:887:1: ( ( rule__Click__GetAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:887:1: ( ( rule__Click__GetAssignment_0 ) )
            // InternalBrowserAutomation.g:888:2: ( rule__Click__GetAssignment_0 )
            {
             before(grammarAccess.getClickAccess().getGetAssignment_0()); 
            // InternalBrowserAutomation.g:889:2: ( rule__Click__GetAssignment_0 )
            // InternalBrowserAutomation.g:889:3: rule__Click__GetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Click__GetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getGetAssignment_0()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:897:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:901:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalBrowserAutomation.g:902:2: rule__Click__Group__1__Impl rule__Click__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalBrowserAutomation.g:909:1: rule__Click__Group__1__Impl : ( 'click' ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:913:1: ( ( 'click' ) )
            // InternalBrowserAutomation.g:914:1: ( 'click' )
            {
            // InternalBrowserAutomation.g:914:1: ( 'click' )
            // InternalBrowserAutomation.g:915:2: 'click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getClickKeyword_1()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:924:1: rule__Click__Group__2 : rule__Click__Group__2__Impl rule__Click__Group__3 ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:928:1: ( rule__Click__Group__2__Impl rule__Click__Group__3 )
            // InternalBrowserAutomation.g:929:2: rule__Click__Group__2__Impl rule__Click__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Click__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__3();

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
    // InternalBrowserAutomation.g:936:1: rule__Click__Group__2__Impl : ( 'on' ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:940:1: ( ( 'on' ) )
            // InternalBrowserAutomation.g:941:1: ( 'on' )
            {
            // InternalBrowserAutomation.g:941:1: ( 'on' )
            // InternalBrowserAutomation.g:942:2: 'on'
            {
             before(grammarAccess.getClickAccess().getOnKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getOnKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Click__Group__3"
    // InternalBrowserAutomation.g:951:1: rule__Click__Group__3 : rule__Click__Group__3__Impl ;
    public final void rule__Click__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:955:1: ( rule__Click__Group__3__Impl )
            // InternalBrowserAutomation.g:956:2: rule__Click__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__3__Impl();

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
    // $ANTLR end "rule__Click__Group__3"


    // $ANTLR start "rule__Click__Group__3__Impl"
    // InternalBrowserAutomation.g:962:1: rule__Click__Group__3__Impl : ( ( rule__Click__VarAssignment_3 ) ) ;
    public final void rule__Click__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:966:1: ( ( ( rule__Click__VarAssignment_3 ) ) )
            // InternalBrowserAutomation.g:967:1: ( ( rule__Click__VarAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:967:1: ( ( rule__Click__VarAssignment_3 ) )
            // InternalBrowserAutomation.g:968:2: ( rule__Click__VarAssignment_3 )
            {
             before(grammarAccess.getClickAccess().getVarAssignment_3()); 
            // InternalBrowserAutomation.g:969:2: ( rule__Click__VarAssignment_3 )
            // InternalBrowserAutomation.g:969:3: rule__Click__VarAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Click__VarAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getVarAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__3__Impl"


    // $ANTLR start "rule__Insert__Group__0"
    // InternalBrowserAutomation.g:978:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:982:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalBrowserAutomation.g:983:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBrowserAutomation.g:990:1: rule__Insert__Group__0__Impl : ( ( rule__Insert__GetAssignment_0 ) ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:994:1: ( ( ( rule__Insert__GetAssignment_0 ) ) )
            // InternalBrowserAutomation.g:995:1: ( ( rule__Insert__GetAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:995:1: ( ( rule__Insert__GetAssignment_0 ) )
            // InternalBrowserAutomation.g:996:2: ( rule__Insert__GetAssignment_0 )
            {
             before(grammarAccess.getInsertAccess().getGetAssignment_0()); 
            // InternalBrowserAutomation.g:997:2: ( rule__Insert__GetAssignment_0 )
            // InternalBrowserAutomation.g:997:3: rule__Insert__GetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Insert__GetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getGetAssignment_0()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:1005:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1009:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalBrowserAutomation.g:1010:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalBrowserAutomation.g:1017:1: rule__Insert__Group__1__Impl : ( 'insert' ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1021:1: ( ( 'insert' ) )
            // InternalBrowserAutomation.g:1022:1: ( 'insert' )
            {
            // InternalBrowserAutomation.g:1022:1: ( 'insert' )
            // InternalBrowserAutomation.g:1023:2: 'insert'
            {
             before(grammarAccess.getInsertAccess().getInsertKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getInsertKeyword_1()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:1032:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1036:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalBrowserAutomation.g:1037:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
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
    // InternalBrowserAutomation.g:1044:1: rule__Insert__Group__2__Impl : ( ( rule__Insert__ValueAssignment_2 ) ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1048:1: ( ( ( rule__Insert__ValueAssignment_2 ) ) )
            // InternalBrowserAutomation.g:1049:1: ( ( rule__Insert__ValueAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:1049:1: ( ( rule__Insert__ValueAssignment_2 ) )
            // InternalBrowserAutomation.g:1050:2: ( rule__Insert__ValueAssignment_2 )
            {
             before(grammarAccess.getInsertAccess().getValueAssignment_2()); 
            // InternalBrowserAutomation.g:1051:2: ( rule__Insert__ValueAssignment_2 )
            // InternalBrowserAutomation.g:1051:3: rule__Insert__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Insert__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getValueAssignment_2()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:1059:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl rule__Insert__Group__4 ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1063:1: ( rule__Insert__Group__3__Impl rule__Insert__Group__4 )
            // InternalBrowserAutomation.g:1064:2: rule__Insert__Group__3__Impl rule__Insert__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Insert__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__4();

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
    // InternalBrowserAutomation.g:1071:1: rule__Insert__Group__3__Impl : ( 'in' ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1075:1: ( ( 'in' ) )
            // InternalBrowserAutomation.g:1076:1: ( 'in' )
            {
            // InternalBrowserAutomation.g:1076:1: ( 'in' )
            // InternalBrowserAutomation.g:1077:2: 'in'
            {
             before(grammarAccess.getInsertAccess().getInKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getInKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Insert__Group__4"
    // InternalBrowserAutomation.g:1086:1: rule__Insert__Group__4 : rule__Insert__Group__4__Impl ;
    public final void rule__Insert__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1090:1: ( rule__Insert__Group__4__Impl )
            // InternalBrowserAutomation.g:1091:2: rule__Insert__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__4__Impl();

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
    // $ANTLR end "rule__Insert__Group__4"


    // $ANTLR start "rule__Insert__Group__4__Impl"
    // InternalBrowserAutomation.g:1097:1: rule__Insert__Group__4__Impl : ( ( rule__Insert__VarAssignment_4 ) ) ;
    public final void rule__Insert__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1101:1: ( ( ( rule__Insert__VarAssignment_4 ) ) )
            // InternalBrowserAutomation.g:1102:1: ( ( rule__Insert__VarAssignment_4 ) )
            {
            // InternalBrowserAutomation.g:1102:1: ( ( rule__Insert__VarAssignment_4 ) )
            // InternalBrowserAutomation.g:1103:2: ( rule__Insert__VarAssignment_4 )
            {
             before(grammarAccess.getInsertAccess().getVarAssignment_4()); 
            // InternalBrowserAutomation.g:1104:2: ( rule__Insert__VarAssignment_4 )
            // InternalBrowserAutomation.g:1104:3: rule__Insert__VarAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Insert__VarAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getVarAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__4__Impl"


    // $ANTLR start "rule__Verify__Group__0"
    // InternalBrowserAutomation.g:1113:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1117:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // InternalBrowserAutomation.g:1118:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBrowserAutomation.g:1125:1: rule__Verify__Group__0__Impl : ( ( rule__Verify__GetAssignment_0 ) ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1129:1: ( ( ( rule__Verify__GetAssignment_0 ) ) )
            // InternalBrowserAutomation.g:1130:1: ( ( rule__Verify__GetAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:1130:1: ( ( rule__Verify__GetAssignment_0 ) )
            // InternalBrowserAutomation.g:1131:2: ( rule__Verify__GetAssignment_0 )
            {
             before(grammarAccess.getVerifyAccess().getGetAssignment_0()); 
            // InternalBrowserAutomation.g:1132:2: ( rule__Verify__GetAssignment_0 )
            // InternalBrowserAutomation.g:1132:3: rule__Verify__GetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Verify__GetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getGetAssignment_0()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:1140:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl rule__Verify__Group__2 ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1144:1: ( rule__Verify__Group__1__Impl rule__Verify__Group__2 )
            // InternalBrowserAutomation.g:1145:2: rule__Verify__Group__1__Impl rule__Verify__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalBrowserAutomation.g:1152:1: rule__Verify__Group__1__Impl : ( 'verify page contains' ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1156:1: ( ( 'verify page contains' ) )
            // InternalBrowserAutomation.g:1157:1: ( 'verify page contains' )
            {
            // InternalBrowserAutomation.g:1157:1: ( 'verify page contains' )
            // InternalBrowserAutomation.g:1158:2: 'verify page contains'
            {
             before(grammarAccess.getVerifyAccess().getVerifyPageContainsKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getVerifyPageContainsKeyword_1()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:1167:1: rule__Verify__Group__2 : rule__Verify__Group__2__Impl ;
    public final void rule__Verify__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1171:1: ( rule__Verify__Group__2__Impl )
            // InternalBrowserAutomation.g:1172:2: rule__Verify__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group__2__Impl();

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
    // InternalBrowserAutomation.g:1178:1: rule__Verify__Group__2__Impl : ( ( rule__Verify__VarAssignment_2 ) ) ;
    public final void rule__Verify__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1182:1: ( ( ( rule__Verify__VarAssignment_2 ) ) )
            // InternalBrowserAutomation.g:1183:1: ( ( rule__Verify__VarAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:1183:1: ( ( rule__Verify__VarAssignment_2 ) )
            // InternalBrowserAutomation.g:1184:2: ( rule__Verify__VarAssignment_2 )
            {
             before(grammarAccess.getVerifyAccess().getVarAssignment_2()); 
            // InternalBrowserAutomation.g:1185:2: ( rule__Verify__VarAssignment_2 )
            // InternalBrowserAutomation.g:1185:3: rule__Verify__VarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Verify__VarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getVarAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Test__WebBrowserAssignment_2"
    // InternalBrowserAutomation.g:1194:1: rule__Test__WebBrowserAssignment_2 : ( ruleWebBrowser ) ;
    public final void rule__Test__WebBrowserAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1198:1: ( ( ruleWebBrowser ) )
            // InternalBrowserAutomation.g:1199:2: ( ruleWebBrowser )
            {
            // InternalBrowserAutomation.g:1199:2: ( ruleWebBrowser )
            // InternalBrowserAutomation.g:1200:3: ruleWebBrowser
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


    // $ANTLR start "rule__Test__UrlAssignment_5"
    // InternalBrowserAutomation.g:1209:1: rule__Test__UrlAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Test__UrlAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1213:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:1214:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:1214:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:1215:3: RULE_STRING
            {
             before(grammarAccess.getTestAccess().getUrlSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getUrlSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__UrlAssignment_5"


    // $ANTLR start "rule__Test__ActionsAssignment_6"
    // InternalBrowserAutomation.g:1224:1: rule__Test__ActionsAssignment_6 : ( ruleAction ) ;
    public final void rule__Test__ActionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1228:1: ( ( ruleAction ) )
            // InternalBrowserAutomation.g:1229:2: ( ruleAction )
            {
            // InternalBrowserAutomation.g:1229:2: ( ruleAction )
            // InternalBrowserAutomation.g:1230:3: ruleAction
            {
             before(grammarAccess.getTestAccess().getActionsActionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getTestAccess().getActionsActionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__ActionsAssignment_6"


    // $ANTLR start "rule__Get__VarAssignment_0"
    // InternalBrowserAutomation.g:1239:1: rule__Get__VarAssignment_0 : ( ruleVariable ) ;
    public final void rule__Get__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1243:1: ( ( ruleVariable ) )
            // InternalBrowserAutomation.g:1244:2: ( ruleVariable )
            {
            // InternalBrowserAutomation.g:1244:2: ( ruleVariable )
            // InternalBrowserAutomation.g:1245:3: ruleVariable
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


    // $ANTLR start "rule__Get__ElementAssignment_3"
    // InternalBrowserAutomation.g:1254:1: rule__Get__ElementAssignment_3 : ( ruleElement ) ;
    public final void rule__Get__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1258:1: ( ( ruleElement ) )
            // InternalBrowserAutomation.g:1259:2: ( ruleElement )
            {
            // InternalBrowserAutomation.g:1259:2: ( ruleElement )
            // InternalBrowserAutomation.g:1260:3: ruleElement
            {
             before(grammarAccess.getGetAccess().getElementElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getGetAccess().getElementElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__ElementAssignment_3"


    // $ANTLR start "rule__Get__AttrAssignment_5"
    // InternalBrowserAutomation.g:1269:1: rule__Get__AttrAssignment_5 : ( ruleAttribut ) ;
    public final void rule__Get__AttrAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1273:1: ( ( ruleAttribut ) )
            // InternalBrowserAutomation.g:1274:2: ( ruleAttribut )
            {
            // InternalBrowserAutomation.g:1274:2: ( ruleAttribut )
            // InternalBrowserAutomation.g:1275:3: ruleAttribut
            {
             before(grammarAccess.getGetAccess().getAttrAttributParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getGetAccess().getAttrAttributParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__AttrAssignment_5"


    // $ANTLR start "rule__Get__AttrValAssignment_7"
    // InternalBrowserAutomation.g:1284:1: rule__Get__AttrValAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Get__AttrValAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1288:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:1289:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:1289:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:1290:3: RULE_STRING
            {
             before(grammarAccess.getGetAccess().getAttrValSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getAttrValSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__AttrValAssignment_7"


    // $ANTLR start "rule__Variable__NameAssignment"
    // InternalBrowserAutomation.g:1299:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1303:1: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:1304:2: ( RULE_ID )
            {
            // InternalBrowserAutomation.g:1304:2: ( RULE_ID )
            // InternalBrowserAutomation.g:1305:3: RULE_ID
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
    // InternalBrowserAutomation.g:1314:1: rule__VarReference__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VarReference__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1318:1: ( ( ( RULE_ID ) ) )
            // InternalBrowserAutomation.g:1319:2: ( ( RULE_ID ) )
            {
            // InternalBrowserAutomation.g:1319:2: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:1320:3: ( RULE_ID )
            {
             before(grammarAccess.getVarReferenceAccess().getVarVariableCrossReference_0()); 
            // InternalBrowserAutomation.g:1321:3: ( RULE_ID )
            // InternalBrowserAutomation.g:1322:4: RULE_ID
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


    // $ANTLR start "rule__Click__GetAssignment_0"
    // InternalBrowserAutomation.g:1333:1: rule__Click__GetAssignment_0 : ( ruleGet ) ;
    public final void rule__Click__GetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1337:1: ( ( ruleGet ) )
            // InternalBrowserAutomation.g:1338:2: ( ruleGet )
            {
            // InternalBrowserAutomation.g:1338:2: ( ruleGet )
            // InternalBrowserAutomation.g:1339:3: ruleGet
            {
             before(grammarAccess.getClickAccess().getGetGetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGet();

            state._fsp--;

             after(grammarAccess.getClickAccess().getGetGetParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__GetAssignment_0"


    // $ANTLR start "rule__Click__VarAssignment_3"
    // InternalBrowserAutomation.g:1348:1: rule__Click__VarAssignment_3 : ( ruleVarReference ) ;
    public final void rule__Click__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1352:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:1353:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:1353:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:1354:3: ruleVarReference
            {
             before(grammarAccess.getClickAccess().getVarVarReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getClickAccess().getVarVarReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__VarAssignment_3"


    // $ANTLR start "rule__Insert__GetAssignment_0"
    // InternalBrowserAutomation.g:1363:1: rule__Insert__GetAssignment_0 : ( ruleGet ) ;
    public final void rule__Insert__GetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1367:1: ( ( ruleGet ) )
            // InternalBrowserAutomation.g:1368:2: ( ruleGet )
            {
            // InternalBrowserAutomation.g:1368:2: ( ruleGet )
            // InternalBrowserAutomation.g:1369:3: ruleGet
            {
             before(grammarAccess.getInsertAccess().getGetGetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGet();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getGetGetParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__GetAssignment_0"


    // $ANTLR start "rule__Insert__ValueAssignment_2"
    // InternalBrowserAutomation.g:1378:1: rule__Insert__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Insert__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1382:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:1383:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:1383:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:1384:3: RULE_STRING
            {
             before(grammarAccess.getInsertAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__ValueAssignment_2"


    // $ANTLR start "rule__Insert__VarAssignment_4"
    // InternalBrowserAutomation.g:1393:1: rule__Insert__VarAssignment_4 : ( ruleVarReference ) ;
    public final void rule__Insert__VarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1397:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:1398:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:1398:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:1399:3: ruleVarReference
            {
             before(grammarAccess.getInsertAccess().getVarVarReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getVarVarReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__VarAssignment_4"


    // $ANTLR start "rule__Verify__GetAssignment_0"
    // InternalBrowserAutomation.g:1408:1: rule__Verify__GetAssignment_0 : ( ruleGet ) ;
    public final void rule__Verify__GetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1412:1: ( ( ruleGet ) )
            // InternalBrowserAutomation.g:1413:2: ( ruleGet )
            {
            // InternalBrowserAutomation.g:1413:2: ( ruleGet )
            // InternalBrowserAutomation.g:1414:3: ruleGet
            {
             before(grammarAccess.getVerifyAccess().getGetGetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGet();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getGetGetParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__GetAssignment_0"


    // $ANTLR start "rule__Verify__VarAssignment_2"
    // InternalBrowserAutomation.g:1423:1: rule__Verify__VarAssignment_2 : ( ruleVarReference ) ;
    public final void rule__Verify__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1427:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:1428:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:1428:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:1429:3: ruleVarReference
            {
             before(grammarAccess.getVerifyAccess().getVarVarReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getVarVarReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__VarAssignment_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\5\1\34\1\35\1\17\7\36\1\26\3\37\1\4\1\40\3\uffff";
    static final String dfa_3s = "\1\5\1\34\1\35\1\25\7\36\1\30\3\37\1\4\1\44\3\uffff";
    static final String dfa_4s = "\21\uffff\1\3\1\1\1\2";
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
            "\1\22\1\uffff\1\23\1\uffff\1\21",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "360:1: rule__Action__Alternatives : ( ( ruleClick ) | ( ruleInsert ) | ( ruleVerify ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003F8000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});

}