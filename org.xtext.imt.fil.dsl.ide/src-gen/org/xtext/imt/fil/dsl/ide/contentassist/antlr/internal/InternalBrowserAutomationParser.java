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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mozilla'", "'chrome'", "'safari'", "'internet explorer'", "'link'", "'input'", "'button'", "'checkbox'", "'combobox'", "'image'", "'text'", "'class'", "'value'", "'alt'", "'open'", "'go'", "'to'", "':'", "'get'", "'by'", "'['", "']'", "'click'", "'on'", "'insert'", "'in'", "'verify page contains'"
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
    // InternalBrowserAutomation.g:327:1: rule__WebBrowser__Alternatives : ( ( 'mozilla' ) | ( 'chrome' ) | ( 'safari' ) | ( 'internet explorer' ) );
    public final void rule__WebBrowser__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:331:1: ( ( 'mozilla' ) | ( 'chrome' ) | ( 'safari' ) | ( 'internet explorer' ) )
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
                    // InternalBrowserAutomation.g:332:2: ( 'mozilla' )
                    {
                    // InternalBrowserAutomation.g:332:2: ( 'mozilla' )
                    // InternalBrowserAutomation.g:333:3: 'mozilla'
                    {
                     before(grammarAccess.getWebBrowserAccess().getMozillaKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getMozillaKeyword_0()); 

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
    // InternalBrowserAutomation.g:360:1: rule__Action__Alternatives : ( ( ruleClick ) | ( ruleInsert ) | ( ruleVerify ) | ( ruleGet ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:364:1: ( ( ruleClick ) | ( ruleInsert ) | ( ruleVerify ) | ( ruleGet ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            case RULE_ID:
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
                case 4 :
                    // InternalBrowserAutomation.g:383:2: ( ruleGet )
                    {
                    // InternalBrowserAutomation.g:383:2: ( ruleGet )
                    // InternalBrowserAutomation.g:384:3: ruleGet
                    {
                     before(grammarAccess.getActionAccess().getGetParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGet();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getGetParserRuleCall_3()); 

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
    // InternalBrowserAutomation.g:393:1: rule__Element__Alternatives : ( ( 'link' ) | ( 'input' ) | ( 'button' ) | ( 'checkbox' ) | ( 'combobox' ) | ( 'image' ) | ( 'text' ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:397:1: ( ( 'link' ) | ( 'input' ) | ( 'button' ) | ( 'checkbox' ) | ( 'combobox' ) | ( 'image' ) | ( 'text' ) )
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
                    // InternalBrowserAutomation.g:398:2: ( 'link' )
                    {
                    // InternalBrowserAutomation.g:398:2: ( 'link' )
                    // InternalBrowserAutomation.g:399:3: 'link'
                    {
                     before(grammarAccess.getElementAccess().getLinkKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getLinkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:404:2: ( 'input' )
                    {
                    // InternalBrowserAutomation.g:404:2: ( 'input' )
                    // InternalBrowserAutomation.g:405:3: 'input'
                    {
                     before(grammarAccess.getElementAccess().getInputKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getInputKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:410:2: ( 'button' )
                    {
                    // InternalBrowserAutomation.g:410:2: ( 'button' )
                    // InternalBrowserAutomation.g:411:3: 'button'
                    {
                     before(grammarAccess.getElementAccess().getButtonKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getButtonKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:416:2: ( 'checkbox' )
                    {
                    // InternalBrowserAutomation.g:416:2: ( 'checkbox' )
                    // InternalBrowserAutomation.g:417:3: 'checkbox'
                    {
                     before(grammarAccess.getElementAccess().getCheckboxKeyword_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getCheckboxKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:422:2: ( 'combobox' )
                    {
                    // InternalBrowserAutomation.g:422:2: ( 'combobox' )
                    // InternalBrowserAutomation.g:423:3: 'combobox'
                    {
                     before(grammarAccess.getElementAccess().getComboboxKeyword_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getComboboxKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:428:2: ( 'image' )
                    {
                    // InternalBrowserAutomation.g:428:2: ( 'image' )
                    // InternalBrowserAutomation.g:429:3: 'image'
                    {
                     before(grammarAccess.getElementAccess().getImageKeyword_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getImageKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBrowserAutomation.g:434:2: ( 'text' )
                    {
                    // InternalBrowserAutomation.g:434:2: ( 'text' )
                    // InternalBrowserAutomation.g:435:3: 'text'
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
    // InternalBrowserAutomation.g:444:1: rule__Attribut__Alternatives : ( ( 'class' ) | ( 'value' ) | ( 'alt' ) );
    public final void rule__Attribut__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:448:1: ( ( 'class' ) | ( 'value' ) | ( 'alt' ) )
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
                    // InternalBrowserAutomation.g:449:2: ( 'class' )
                    {
                    // InternalBrowserAutomation.g:449:2: ( 'class' )
                    // InternalBrowserAutomation.g:450:3: 'class'
                    {
                     before(grammarAccess.getAttributAccess().getClassKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getClassKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:455:2: ( 'value' )
                    {
                    // InternalBrowserAutomation.g:455:2: ( 'value' )
                    // InternalBrowserAutomation.g:456:3: 'value'
                    {
                     before(grammarAccess.getAttributAccess().getValueKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getValueKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:461:2: ( 'alt' )
                    {
                    // InternalBrowserAutomation.g:461:2: ( 'alt' )
                    // InternalBrowserAutomation.g:462:3: 'alt'
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
    // InternalBrowserAutomation.g:471:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:475:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalBrowserAutomation.g:476:2: rule__Test__Group__0__Impl rule__Test__Group__1
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
    // InternalBrowserAutomation.g:483:1: rule__Test__Group__0__Impl : ( () ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:487:1: ( ( () ) )
            // InternalBrowserAutomation.g:488:1: ( () )
            {
            // InternalBrowserAutomation.g:488:1: ( () )
            // InternalBrowserAutomation.g:489:2: ()
            {
             before(grammarAccess.getTestAccess().getTestAction_0()); 
            // InternalBrowserAutomation.g:490:2: ()
            // InternalBrowserAutomation.g:490:3: 
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
    // InternalBrowserAutomation.g:498:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:502:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalBrowserAutomation.g:503:2: rule__Test__Group__1__Impl rule__Test__Group__2
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
    // InternalBrowserAutomation.g:510:1: rule__Test__Group__1__Impl : ( 'open' ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:514:1: ( ( 'open' ) )
            // InternalBrowserAutomation.g:515:1: ( 'open' )
            {
            // InternalBrowserAutomation.g:515:1: ( 'open' )
            // InternalBrowserAutomation.g:516:2: 'open'
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
    // InternalBrowserAutomation.g:525:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:529:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalBrowserAutomation.g:530:2: rule__Test__Group__2__Impl rule__Test__Group__3
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
    // InternalBrowserAutomation.g:537:1: rule__Test__Group__2__Impl : ( ( rule__Test__WebBrowserAssignment_2 ) ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:541:1: ( ( ( rule__Test__WebBrowserAssignment_2 ) ) )
            // InternalBrowserAutomation.g:542:1: ( ( rule__Test__WebBrowserAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:542:1: ( ( rule__Test__WebBrowserAssignment_2 ) )
            // InternalBrowserAutomation.g:543:2: ( rule__Test__WebBrowserAssignment_2 )
            {
             before(grammarAccess.getTestAccess().getWebBrowserAssignment_2()); 
            // InternalBrowserAutomation.g:544:2: ( rule__Test__WebBrowserAssignment_2 )
            // InternalBrowserAutomation.g:544:3: rule__Test__WebBrowserAssignment_2
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
    // InternalBrowserAutomation.g:552:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:556:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalBrowserAutomation.g:557:2: rule__Test__Group__3__Impl rule__Test__Group__4
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
    // InternalBrowserAutomation.g:564:1: rule__Test__Group__3__Impl : ( 'go' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:568:1: ( ( 'go' ) )
            // InternalBrowserAutomation.g:569:1: ( 'go' )
            {
            // InternalBrowserAutomation.g:569:1: ( 'go' )
            // InternalBrowserAutomation.g:570:2: 'go'
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
    // InternalBrowserAutomation.g:579:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:583:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalBrowserAutomation.g:584:2: rule__Test__Group__4__Impl rule__Test__Group__5
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
    // InternalBrowserAutomation.g:591:1: rule__Test__Group__4__Impl : ( 'to' ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:595:1: ( ( 'to' ) )
            // InternalBrowserAutomation.g:596:1: ( 'to' )
            {
            // InternalBrowserAutomation.g:596:1: ( 'to' )
            // InternalBrowserAutomation.g:597:2: 'to'
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
    // InternalBrowserAutomation.g:606:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:610:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalBrowserAutomation.g:611:2: rule__Test__Group__5__Impl rule__Test__Group__6
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
    // InternalBrowserAutomation.g:618:1: rule__Test__Group__5__Impl : ( ( rule__Test__UrlAssignment_5 ) ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:622:1: ( ( ( rule__Test__UrlAssignment_5 ) ) )
            // InternalBrowserAutomation.g:623:1: ( ( rule__Test__UrlAssignment_5 ) )
            {
            // InternalBrowserAutomation.g:623:1: ( ( rule__Test__UrlAssignment_5 ) )
            // InternalBrowserAutomation.g:624:2: ( rule__Test__UrlAssignment_5 )
            {
             before(grammarAccess.getTestAccess().getUrlAssignment_5()); 
            // InternalBrowserAutomation.g:625:2: ( rule__Test__UrlAssignment_5 )
            // InternalBrowserAutomation.g:625:3: rule__Test__UrlAssignment_5
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
    // InternalBrowserAutomation.g:633:1: rule__Test__Group__6 : rule__Test__Group__6__Impl ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:637:1: ( rule__Test__Group__6__Impl )
            // InternalBrowserAutomation.g:638:2: rule__Test__Group__6__Impl
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
    // InternalBrowserAutomation.g:644:1: rule__Test__Group__6__Impl : ( ( rule__Test__ActionsAssignment_6 )* ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:648:1: ( ( ( rule__Test__ActionsAssignment_6 )* ) )
            // InternalBrowserAutomation.g:649:1: ( ( rule__Test__ActionsAssignment_6 )* )
            {
            // InternalBrowserAutomation.g:649:1: ( ( rule__Test__ActionsAssignment_6 )* )
            // InternalBrowserAutomation.g:650:2: ( rule__Test__ActionsAssignment_6 )*
            {
             before(grammarAccess.getTestAccess().getActionsAssignment_6()); 
            // InternalBrowserAutomation.g:651:2: ( rule__Test__ActionsAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==33||LA5_0==35||LA5_0==37) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBrowserAutomation.g:651:3: rule__Test__ActionsAssignment_6
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
    // InternalBrowserAutomation.g:660:1: rule__Get__Group__0 : rule__Get__Group__0__Impl rule__Get__Group__1 ;
    public final void rule__Get__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:664:1: ( rule__Get__Group__0__Impl rule__Get__Group__1 )
            // InternalBrowserAutomation.g:665:2: rule__Get__Group__0__Impl rule__Get__Group__1
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
    // InternalBrowserAutomation.g:672:1: rule__Get__Group__0__Impl : ( ( rule__Get__VarAssignment_0 ) ) ;
    public final void rule__Get__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:676:1: ( ( ( rule__Get__VarAssignment_0 ) ) )
            // InternalBrowserAutomation.g:677:1: ( ( rule__Get__VarAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:677:1: ( ( rule__Get__VarAssignment_0 ) )
            // InternalBrowserAutomation.g:678:2: ( rule__Get__VarAssignment_0 )
            {
             before(grammarAccess.getGetAccess().getVarAssignment_0()); 
            // InternalBrowserAutomation.g:679:2: ( rule__Get__VarAssignment_0 )
            // InternalBrowserAutomation.g:679:3: rule__Get__VarAssignment_0
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
    // InternalBrowserAutomation.g:687:1: rule__Get__Group__1 : rule__Get__Group__1__Impl rule__Get__Group__2 ;
    public final void rule__Get__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:691:1: ( rule__Get__Group__1__Impl rule__Get__Group__2 )
            // InternalBrowserAutomation.g:692:2: rule__Get__Group__1__Impl rule__Get__Group__2
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
    // InternalBrowserAutomation.g:699:1: rule__Get__Group__1__Impl : ( ':' ) ;
    public final void rule__Get__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:703:1: ( ( ':' ) )
            // InternalBrowserAutomation.g:704:1: ( ':' )
            {
            // InternalBrowserAutomation.g:704:1: ( ':' )
            // InternalBrowserAutomation.g:705:2: ':'
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
    // InternalBrowserAutomation.g:714:1: rule__Get__Group__2 : rule__Get__Group__2__Impl rule__Get__Group__3 ;
    public final void rule__Get__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:718:1: ( rule__Get__Group__2__Impl rule__Get__Group__3 )
            // InternalBrowserAutomation.g:719:2: rule__Get__Group__2__Impl rule__Get__Group__3
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
    // InternalBrowserAutomation.g:726:1: rule__Get__Group__2__Impl : ( 'get' ) ;
    public final void rule__Get__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:730:1: ( ( 'get' ) )
            // InternalBrowserAutomation.g:731:1: ( 'get' )
            {
            // InternalBrowserAutomation.g:731:1: ( 'get' )
            // InternalBrowserAutomation.g:732:2: 'get'
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
    // InternalBrowserAutomation.g:741:1: rule__Get__Group__3 : rule__Get__Group__3__Impl rule__Get__Group__4 ;
    public final void rule__Get__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:745:1: ( rule__Get__Group__3__Impl rule__Get__Group__4 )
            // InternalBrowserAutomation.g:746:2: rule__Get__Group__3__Impl rule__Get__Group__4
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
    // InternalBrowserAutomation.g:753:1: rule__Get__Group__3__Impl : ( ( rule__Get__ElementAssignment_3 ) ) ;
    public final void rule__Get__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:757:1: ( ( ( rule__Get__ElementAssignment_3 ) ) )
            // InternalBrowserAutomation.g:758:1: ( ( rule__Get__ElementAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:758:1: ( ( rule__Get__ElementAssignment_3 ) )
            // InternalBrowserAutomation.g:759:2: ( rule__Get__ElementAssignment_3 )
            {
             before(grammarAccess.getGetAccess().getElementAssignment_3()); 
            // InternalBrowserAutomation.g:760:2: ( rule__Get__ElementAssignment_3 )
            // InternalBrowserAutomation.g:760:3: rule__Get__ElementAssignment_3
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
    // InternalBrowserAutomation.g:768:1: rule__Get__Group__4 : rule__Get__Group__4__Impl rule__Get__Group__5 ;
    public final void rule__Get__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:772:1: ( rule__Get__Group__4__Impl rule__Get__Group__5 )
            // InternalBrowserAutomation.g:773:2: rule__Get__Group__4__Impl rule__Get__Group__5
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
    // InternalBrowserAutomation.g:780:1: rule__Get__Group__4__Impl : ( 'by' ) ;
    public final void rule__Get__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:784:1: ( ( 'by' ) )
            // InternalBrowserAutomation.g:785:1: ( 'by' )
            {
            // InternalBrowserAutomation.g:785:1: ( 'by' )
            // InternalBrowserAutomation.g:786:2: 'by'
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
    // InternalBrowserAutomation.g:795:1: rule__Get__Group__5 : rule__Get__Group__5__Impl rule__Get__Group__6 ;
    public final void rule__Get__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:799:1: ( rule__Get__Group__5__Impl rule__Get__Group__6 )
            // InternalBrowserAutomation.g:800:2: rule__Get__Group__5__Impl rule__Get__Group__6
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
    // InternalBrowserAutomation.g:807:1: rule__Get__Group__5__Impl : ( ( rule__Get__AttrAssignment_5 ) ) ;
    public final void rule__Get__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:811:1: ( ( ( rule__Get__AttrAssignment_5 ) ) )
            // InternalBrowserAutomation.g:812:1: ( ( rule__Get__AttrAssignment_5 ) )
            {
            // InternalBrowserAutomation.g:812:1: ( ( rule__Get__AttrAssignment_5 ) )
            // InternalBrowserAutomation.g:813:2: ( rule__Get__AttrAssignment_5 )
            {
             before(grammarAccess.getGetAccess().getAttrAssignment_5()); 
            // InternalBrowserAutomation.g:814:2: ( rule__Get__AttrAssignment_5 )
            // InternalBrowserAutomation.g:814:3: rule__Get__AttrAssignment_5
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
    // InternalBrowserAutomation.g:822:1: rule__Get__Group__6 : rule__Get__Group__6__Impl rule__Get__Group__7 ;
    public final void rule__Get__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:826:1: ( rule__Get__Group__6__Impl rule__Get__Group__7 )
            // InternalBrowserAutomation.g:827:2: rule__Get__Group__6__Impl rule__Get__Group__7
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
    // InternalBrowserAutomation.g:834:1: rule__Get__Group__6__Impl : ( '[' ) ;
    public final void rule__Get__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:838:1: ( ( '[' ) )
            // InternalBrowserAutomation.g:839:1: ( '[' )
            {
            // InternalBrowserAutomation.g:839:1: ( '[' )
            // InternalBrowserAutomation.g:840:2: '['
            {
             before(grammarAccess.getGetAccess().getLeftSquareBracketKeyword_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getLeftSquareBracketKeyword_6()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:849:1: rule__Get__Group__7 : rule__Get__Group__7__Impl rule__Get__Group__8 ;
    public final void rule__Get__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:853:1: ( rule__Get__Group__7__Impl rule__Get__Group__8 )
            // InternalBrowserAutomation.g:854:2: rule__Get__Group__7__Impl rule__Get__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Get__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group__8();

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
    // InternalBrowserAutomation.g:861:1: rule__Get__Group__7__Impl : ( ( rule__Get__AttrValAssignment_7 ) ) ;
    public final void rule__Get__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:865:1: ( ( ( rule__Get__AttrValAssignment_7 ) ) )
            // InternalBrowserAutomation.g:866:1: ( ( rule__Get__AttrValAssignment_7 ) )
            {
            // InternalBrowserAutomation.g:866:1: ( ( rule__Get__AttrValAssignment_7 ) )
            // InternalBrowserAutomation.g:867:2: ( rule__Get__AttrValAssignment_7 )
            {
             before(grammarAccess.getGetAccess().getAttrValAssignment_7()); 
            // InternalBrowserAutomation.g:868:2: ( rule__Get__AttrValAssignment_7 )
            // InternalBrowserAutomation.g:868:3: rule__Get__AttrValAssignment_7
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


    // $ANTLR start "rule__Get__Group__8"
    // InternalBrowserAutomation.g:876:1: rule__Get__Group__8 : rule__Get__Group__8__Impl ;
    public final void rule__Get__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:880:1: ( rule__Get__Group__8__Impl )
            // InternalBrowserAutomation.g:881:2: rule__Get__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Get__Group__8__Impl();

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
    // $ANTLR end "rule__Get__Group__8"


    // $ANTLR start "rule__Get__Group__8__Impl"
    // InternalBrowserAutomation.g:887:1: rule__Get__Group__8__Impl : ( ']' ) ;
    public final void rule__Get__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:891:1: ( ( ']' ) )
            // InternalBrowserAutomation.g:892:1: ( ']' )
            {
            // InternalBrowserAutomation.g:892:1: ( ']' )
            // InternalBrowserAutomation.g:893:2: ']'
            {
             before(grammarAccess.getGetAccess().getRightSquareBracketKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getRightSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__8__Impl"


    // $ANTLR start "rule__Click__Group__0"
    // InternalBrowserAutomation.g:903:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:907:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalBrowserAutomation.g:908:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBrowserAutomation.g:915:1: rule__Click__Group__0__Impl : ( 'click' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:919:1: ( ( 'click' ) )
            // InternalBrowserAutomation.g:920:1: ( 'click' )
            {
            // InternalBrowserAutomation.g:920:1: ( 'click' )
            // InternalBrowserAutomation.g:921:2: 'click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:930:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:934:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalBrowserAutomation.g:935:2: rule__Click__Group__1__Impl rule__Click__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalBrowserAutomation.g:942:1: rule__Click__Group__1__Impl : ( 'on' ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:946:1: ( ( 'on' ) )
            // InternalBrowserAutomation.g:947:1: ( 'on' )
            {
            // InternalBrowserAutomation.g:947:1: ( 'on' )
            // InternalBrowserAutomation.g:948:2: 'on'
            {
             before(grammarAccess.getClickAccess().getOnKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:957:1: rule__Click__Group__2 : rule__Click__Group__2__Impl ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:961:1: ( rule__Click__Group__2__Impl )
            // InternalBrowserAutomation.g:962:2: rule__Click__Group__2__Impl
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
    // InternalBrowserAutomation.g:968:1: rule__Click__Group__2__Impl : ( ( rule__Click__VarAssignment_2 ) ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:972:1: ( ( ( rule__Click__VarAssignment_2 ) ) )
            // InternalBrowserAutomation.g:973:1: ( ( rule__Click__VarAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:973:1: ( ( rule__Click__VarAssignment_2 ) )
            // InternalBrowserAutomation.g:974:2: ( rule__Click__VarAssignment_2 )
            {
             before(grammarAccess.getClickAccess().getVarAssignment_2()); 
            // InternalBrowserAutomation.g:975:2: ( rule__Click__VarAssignment_2 )
            // InternalBrowserAutomation.g:975:3: rule__Click__VarAssignment_2
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
    // InternalBrowserAutomation.g:984:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:988:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalBrowserAutomation.g:989:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBrowserAutomation.g:996:1: rule__Insert__Group__0__Impl : ( 'insert' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1000:1: ( ( 'insert' ) )
            // InternalBrowserAutomation.g:1001:1: ( 'insert' )
            {
            // InternalBrowserAutomation.g:1001:1: ( 'insert' )
            // InternalBrowserAutomation.g:1002:2: 'insert'
            {
             before(grammarAccess.getInsertAccess().getInsertKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1011:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1015:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalBrowserAutomation.g:1016:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalBrowserAutomation.g:1023:1: rule__Insert__Group__1__Impl : ( ( rule__Insert__ValueAssignment_1 ) ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1027:1: ( ( ( rule__Insert__ValueAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1028:1: ( ( rule__Insert__ValueAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1028:1: ( ( rule__Insert__ValueAssignment_1 ) )
            // InternalBrowserAutomation.g:1029:2: ( rule__Insert__ValueAssignment_1 )
            {
             before(grammarAccess.getInsertAccess().getValueAssignment_1()); 
            // InternalBrowserAutomation.g:1030:2: ( rule__Insert__ValueAssignment_1 )
            // InternalBrowserAutomation.g:1030:3: rule__Insert__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getValueAssignment_1()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:1038:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1042:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalBrowserAutomation.g:1043:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalBrowserAutomation.g:1050:1: rule__Insert__Group__2__Impl : ( 'in' ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1054:1: ( ( 'in' ) )
            // InternalBrowserAutomation.g:1055:1: ( 'in' )
            {
            // InternalBrowserAutomation.g:1055:1: ( 'in' )
            // InternalBrowserAutomation.g:1056:2: 'in'
            {
             before(grammarAccess.getInsertAccess().getInKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1065:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1069:1: ( rule__Insert__Group__3__Impl )
            // InternalBrowserAutomation.g:1070:2: rule__Insert__Group__3__Impl
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
    // InternalBrowserAutomation.g:1076:1: rule__Insert__Group__3__Impl : ( ( rule__Insert__VarAssignment_3 ) ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1080:1: ( ( ( rule__Insert__VarAssignment_3 ) ) )
            // InternalBrowserAutomation.g:1081:1: ( ( rule__Insert__VarAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:1081:1: ( ( rule__Insert__VarAssignment_3 ) )
            // InternalBrowserAutomation.g:1082:2: ( rule__Insert__VarAssignment_3 )
            {
             before(grammarAccess.getInsertAccess().getVarAssignment_3()); 
            // InternalBrowserAutomation.g:1083:2: ( rule__Insert__VarAssignment_3 )
            // InternalBrowserAutomation.g:1083:3: rule__Insert__VarAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Insert__VarAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getVarAssignment_3()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:1092:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1096:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // InternalBrowserAutomation.g:1097:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBrowserAutomation.g:1104:1: rule__Verify__Group__0__Impl : ( 'verify page contains' ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1108:1: ( ( 'verify page contains' ) )
            // InternalBrowserAutomation.g:1109:1: ( 'verify page contains' )
            {
            // InternalBrowserAutomation.g:1109:1: ( 'verify page contains' )
            // InternalBrowserAutomation.g:1110:2: 'verify page contains'
            {
             before(grammarAccess.getVerifyAccess().getVerifyPageContainsKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getVerifyPageContainsKeyword_0()); 

            }


            }

        }
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
    // InternalBrowserAutomation.g:1119:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1123:1: ( rule__Verify__Group__1__Impl )
            // InternalBrowserAutomation.g:1124:2: rule__Verify__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group__1__Impl();

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
    // InternalBrowserAutomation.g:1130:1: rule__Verify__Group__1__Impl : ( ( rule__Verify__VarAssignment_1 ) ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1134:1: ( ( ( rule__Verify__VarAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1135:1: ( ( rule__Verify__VarAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1135:1: ( ( rule__Verify__VarAssignment_1 ) )
            // InternalBrowserAutomation.g:1136:2: ( rule__Verify__VarAssignment_1 )
            {
             before(grammarAccess.getVerifyAccess().getVarAssignment_1()); 
            // InternalBrowserAutomation.g:1137:2: ( rule__Verify__VarAssignment_1 )
            // InternalBrowserAutomation.g:1137:3: rule__Verify__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Verify__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getVarAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Test__WebBrowserAssignment_2"
    // InternalBrowserAutomation.g:1146:1: rule__Test__WebBrowserAssignment_2 : ( ruleWebBrowser ) ;
    public final void rule__Test__WebBrowserAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1150:1: ( ( ruleWebBrowser ) )
            // InternalBrowserAutomation.g:1151:2: ( ruleWebBrowser )
            {
            // InternalBrowserAutomation.g:1151:2: ( ruleWebBrowser )
            // InternalBrowserAutomation.g:1152:3: ruleWebBrowser
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
    // InternalBrowserAutomation.g:1161:1: rule__Test__UrlAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Test__UrlAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1165:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:1166:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:1166:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:1167:3: RULE_STRING
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
    // InternalBrowserAutomation.g:1176:1: rule__Test__ActionsAssignment_6 : ( ruleAction ) ;
    public final void rule__Test__ActionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1180:1: ( ( ruleAction ) )
            // InternalBrowserAutomation.g:1181:2: ( ruleAction )
            {
            // InternalBrowserAutomation.g:1181:2: ( ruleAction )
            // InternalBrowserAutomation.g:1182:3: ruleAction
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
    // InternalBrowserAutomation.g:1191:1: rule__Get__VarAssignment_0 : ( ruleVariable ) ;
    public final void rule__Get__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1195:1: ( ( ruleVariable ) )
            // InternalBrowserAutomation.g:1196:2: ( ruleVariable )
            {
            // InternalBrowserAutomation.g:1196:2: ( ruleVariable )
            // InternalBrowserAutomation.g:1197:3: ruleVariable
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
    // InternalBrowserAutomation.g:1206:1: rule__Get__ElementAssignment_3 : ( ruleElement ) ;
    public final void rule__Get__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1210:1: ( ( ruleElement ) )
            // InternalBrowserAutomation.g:1211:2: ( ruleElement )
            {
            // InternalBrowserAutomation.g:1211:2: ( ruleElement )
            // InternalBrowserAutomation.g:1212:3: ruleElement
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
    // InternalBrowserAutomation.g:1221:1: rule__Get__AttrAssignment_5 : ( ruleAttribut ) ;
    public final void rule__Get__AttrAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1225:1: ( ( ruleAttribut ) )
            // InternalBrowserAutomation.g:1226:2: ( ruleAttribut )
            {
            // InternalBrowserAutomation.g:1226:2: ( ruleAttribut )
            // InternalBrowserAutomation.g:1227:3: ruleAttribut
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
    // InternalBrowserAutomation.g:1236:1: rule__Get__AttrValAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Get__AttrValAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1240:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:1241:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:1241:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:1242:3: RULE_STRING
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
    // InternalBrowserAutomation.g:1251:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1255:1: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:1256:2: ( RULE_ID )
            {
            // InternalBrowserAutomation.g:1256:2: ( RULE_ID )
            // InternalBrowserAutomation.g:1257:3: RULE_ID
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
    // InternalBrowserAutomation.g:1266:1: rule__VarReference__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VarReference__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1270:1: ( ( ( RULE_ID ) ) )
            // InternalBrowserAutomation.g:1271:2: ( ( RULE_ID ) )
            {
            // InternalBrowserAutomation.g:1271:2: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:1272:3: ( RULE_ID )
            {
             before(grammarAccess.getVarReferenceAccess().getVarVariableCrossReference_0()); 
            // InternalBrowserAutomation.g:1273:3: ( RULE_ID )
            // InternalBrowserAutomation.g:1274:4: RULE_ID
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
    // InternalBrowserAutomation.g:1285:1: rule__Click__VarAssignment_2 : ( ruleVarReference ) ;
    public final void rule__Click__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1289:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:1290:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:1290:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:1291:3: ruleVarReference
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


    // $ANTLR start "rule__Insert__ValueAssignment_1"
    // InternalBrowserAutomation.g:1300:1: rule__Insert__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Insert__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1304:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:1305:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:1305:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:1306:3: RULE_STRING
            {
             before(grammarAccess.getInsertAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__ValueAssignment_1"


    // $ANTLR start "rule__Insert__VarAssignment_3"
    // InternalBrowserAutomation.g:1315:1: rule__Insert__VarAssignment_3 : ( ruleVarReference ) ;
    public final void rule__Insert__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1319:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:1320:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:1320:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:1321:3: ruleVarReference
            {
             before(grammarAccess.getInsertAccess().getVarVarReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getVarVarReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__VarAssignment_3"


    // $ANTLR start "rule__Verify__VarAssignment_1"
    // InternalBrowserAutomation.g:1330:1: rule__Verify__VarAssignment_1 : ( ruleVarReference ) ;
    public final void rule__Verify__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1334:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:1335:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:1335:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:1336:3: ruleVarReference
            {
             before(grammarAccess.getVerifyAccess().getVarVarReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getVarVarReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__VarAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002A00000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002A00000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003F8000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});

}