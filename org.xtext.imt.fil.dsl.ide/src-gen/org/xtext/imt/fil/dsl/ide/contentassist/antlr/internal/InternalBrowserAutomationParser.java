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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mozilla'", "'chrome'", "'safari'", "'link'", "'input'", "'button'", "'checkbox'", "'combobox'", "'image'", "'text'", "'class'", "'value'", "'alt'", "'open'", "'go'", "'to'", "'internet'", "'explorer'", "'uncheck'", "'all'", "'='", "'get'", "'by'", "'['", "']'", "'click'", "'on'", "'insert'", "'in'", "'is'", "'not'", "'null'", "'check'", "'choose'"
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


    // $ANTLR start "entryRuleElement"
    // InternalBrowserAutomation.g:178:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:179:1: ( ruleElement EOF )
            // InternalBrowserAutomation.g:180:1: ruleElement EOF
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
    // InternalBrowserAutomation.g:187:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:191:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalBrowserAutomation.g:192:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalBrowserAutomation.g:192:2: ( ( rule__Element__Alternatives ) )
            // InternalBrowserAutomation.g:193:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:194:3: ( rule__Element__Alternatives )
            // InternalBrowserAutomation.g:194:4: rule__Element__Alternatives
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
    // InternalBrowserAutomation.g:203:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:204:1: ( ruleAttribut EOF )
            // InternalBrowserAutomation.g:205:1: ruleAttribut EOF
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
    // InternalBrowserAutomation.g:212:1: ruleAttribut : ( ( rule__Attribut__Alternatives ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:216:2: ( ( ( rule__Attribut__Alternatives ) ) )
            // InternalBrowserAutomation.g:217:2: ( ( rule__Attribut__Alternatives ) )
            {
            // InternalBrowserAutomation.g:217:2: ( ( rule__Attribut__Alternatives ) )
            // InternalBrowserAutomation.g:218:3: ( rule__Attribut__Alternatives )
            {
             before(grammarAccess.getAttributAccess().getAlternatives()); 
            // InternalBrowserAutomation.g:219:3: ( rule__Attribut__Alternatives )
            // InternalBrowserAutomation.g:219:4: rule__Attribut__Alternatives
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
    // InternalBrowserAutomation.g:228:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:229:1: ( ruleVariable EOF )
            // InternalBrowserAutomation.g:230:1: ruleVariable EOF
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
    // InternalBrowserAutomation.g:237:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:241:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalBrowserAutomation.g:242:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalBrowserAutomation.g:242:2: ( ( rule__Variable__NameAssignment ) )
            // InternalBrowserAutomation.g:243:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalBrowserAutomation.g:244:3: ( rule__Variable__NameAssignment )
            // InternalBrowserAutomation.g:244:4: rule__Variable__NameAssignment
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
    // InternalBrowserAutomation.g:253:1: entryRuleVarReference : ruleVarReference EOF ;
    public final void entryRuleVarReference() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:254:1: ( ruleVarReference EOF )
            // InternalBrowserAutomation.g:255:1: ruleVarReference EOF
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
    // InternalBrowserAutomation.g:262:1: ruleVarReference : ( ( rule__VarReference__VarAssignment ) ) ;
    public final void ruleVarReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:266:2: ( ( ( rule__VarReference__VarAssignment ) ) )
            // InternalBrowserAutomation.g:267:2: ( ( rule__VarReference__VarAssignment ) )
            {
            // InternalBrowserAutomation.g:267:2: ( ( rule__VarReference__VarAssignment ) )
            // InternalBrowserAutomation.g:268:3: ( rule__VarReference__VarAssignment )
            {
             before(grammarAccess.getVarReferenceAccess().getVarAssignment()); 
            // InternalBrowserAutomation.g:269:3: ( rule__VarReference__VarAssignment )
            // InternalBrowserAutomation.g:269:4: rule__VarReference__VarAssignment
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
    // InternalBrowserAutomation.g:278:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:279:1: ( ruleClick EOF )
            // InternalBrowserAutomation.g:280:1: ruleClick EOF
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
    // InternalBrowserAutomation.g:287:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:291:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalBrowserAutomation.g:292:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalBrowserAutomation.g:292:2: ( ( rule__Click__Group__0 ) )
            // InternalBrowserAutomation.g:293:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalBrowserAutomation.g:294:3: ( rule__Click__Group__0 )
            // InternalBrowserAutomation.g:294:4: rule__Click__Group__0
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
    // InternalBrowserAutomation.g:303:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:304:1: ( ruleInsert EOF )
            // InternalBrowserAutomation.g:305:1: ruleInsert EOF
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
    // InternalBrowserAutomation.g:312:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:316:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalBrowserAutomation.g:317:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalBrowserAutomation.g:317:2: ( ( rule__Insert__Group__0 ) )
            // InternalBrowserAutomation.g:318:3: ( rule__Insert__Group__0 )
            {
             before(grammarAccess.getInsertAccess().getGroup()); 
            // InternalBrowserAutomation.g:319:3: ( rule__Insert__Group__0 )
            // InternalBrowserAutomation.g:319:4: rule__Insert__Group__0
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
    // InternalBrowserAutomation.g:328:1: entryRuleVerify : ruleVerify EOF ;
    public final void entryRuleVerify() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:329:1: ( ruleVerify EOF )
            // InternalBrowserAutomation.g:330:1: ruleVerify EOF
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
    // InternalBrowserAutomation.g:337:1: ruleVerify : ( ( rule__Verify__Group__0 ) ) ;
    public final void ruleVerify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:341:2: ( ( ( rule__Verify__Group__0 ) ) )
            // InternalBrowserAutomation.g:342:2: ( ( rule__Verify__Group__0 ) )
            {
            // InternalBrowserAutomation.g:342:2: ( ( rule__Verify__Group__0 ) )
            // InternalBrowserAutomation.g:343:3: ( rule__Verify__Group__0 )
            {
             before(grammarAccess.getVerifyAccess().getGroup()); 
            // InternalBrowserAutomation.g:344:3: ( rule__Verify__Group__0 )
            // InternalBrowserAutomation.g:344:4: rule__Verify__Group__0
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
    // InternalBrowserAutomation.g:353:1: entryRuleCheck : ruleCheck EOF ;
    public final void entryRuleCheck() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:354:1: ( ruleCheck EOF )
            // InternalBrowserAutomation.g:355:1: ruleCheck EOF
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
    // InternalBrowserAutomation.g:362:1: ruleCheck : ( ( rule__Check__Group__0 ) ) ;
    public final void ruleCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:366:2: ( ( ( rule__Check__Group__0 ) ) )
            // InternalBrowserAutomation.g:367:2: ( ( rule__Check__Group__0 ) )
            {
            // InternalBrowserAutomation.g:367:2: ( ( rule__Check__Group__0 ) )
            // InternalBrowserAutomation.g:368:3: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // InternalBrowserAutomation.g:369:3: ( rule__Check__Group__0 )
            // InternalBrowserAutomation.g:369:4: rule__Check__Group__0
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
    // InternalBrowserAutomation.g:378:1: entryRuleChoose : ruleChoose EOF ;
    public final void entryRuleChoose() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:379:1: ( ruleChoose EOF )
            // InternalBrowserAutomation.g:380:1: ruleChoose EOF
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
    // InternalBrowserAutomation.g:387:1: ruleChoose : ( ( rule__Choose__Group__0 ) ) ;
    public final void ruleChoose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:391:2: ( ( ( rule__Choose__Group__0 ) ) )
            // InternalBrowserAutomation.g:392:2: ( ( rule__Choose__Group__0 ) )
            {
            // InternalBrowserAutomation.g:392:2: ( ( rule__Choose__Group__0 ) )
            // InternalBrowserAutomation.g:393:3: ( rule__Choose__Group__0 )
            {
             before(grammarAccess.getChooseAccess().getGroup()); 
            // InternalBrowserAutomation.g:394:3: ( rule__Choose__Group__0 )
            // InternalBrowserAutomation.g:394:4: rule__Choose__Group__0
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


    // $ANTLR start "rule__WebBrowser__Alternatives"
    // InternalBrowserAutomation.g:402:1: rule__WebBrowser__Alternatives : ( ( 'mozilla' ) | ( 'chrome' ) | ( 'safari' ) | ( ( rule__WebBrowser__Group_3__0 ) ) );
    public final void rule__WebBrowser__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:406:1: ( ( 'mozilla' ) | ( 'chrome' ) | ( 'safari' ) | ( ( rule__WebBrowser__Group_3__0 ) ) )
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
            case 27:
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
                    // InternalBrowserAutomation.g:407:2: ( 'mozilla' )
                    {
                    // InternalBrowserAutomation.g:407:2: ( 'mozilla' )
                    // InternalBrowserAutomation.g:408:3: 'mozilla'
                    {
                     before(grammarAccess.getWebBrowserAccess().getMozillaKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getMozillaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:413:2: ( 'chrome' )
                    {
                    // InternalBrowserAutomation.g:413:2: ( 'chrome' )
                    // InternalBrowserAutomation.g:414:3: 'chrome'
                    {
                     before(grammarAccess.getWebBrowserAccess().getChromeKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getChromeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:419:2: ( 'safari' )
                    {
                    // InternalBrowserAutomation.g:419:2: ( 'safari' )
                    // InternalBrowserAutomation.g:420:3: 'safari'
                    {
                     before(grammarAccess.getWebBrowserAccess().getSafariKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getWebBrowserAccess().getSafariKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:425:2: ( ( rule__WebBrowser__Group_3__0 ) )
                    {
                    // InternalBrowserAutomation.g:425:2: ( ( rule__WebBrowser__Group_3__0 ) )
                    // InternalBrowserAutomation.g:426:3: ( rule__WebBrowser__Group_3__0 )
                    {
                     before(grammarAccess.getWebBrowserAccess().getGroup_3()); 
                    // InternalBrowserAutomation.g:427:3: ( rule__WebBrowser__Group_3__0 )
                    // InternalBrowserAutomation.g:427:4: rule__WebBrowser__Group_3__0
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
    // InternalBrowserAutomation.g:435:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:439:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBrowserAutomation.g:440:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalBrowserAutomation.g:440:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalBrowserAutomation.g:441:3: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // InternalBrowserAutomation.g:442:3: ( rule__Statement__Group_0__0 )
                    // InternalBrowserAutomation.g:442:4: rule__Statement__Group_0__0
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
                    // InternalBrowserAutomation.g:446:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalBrowserAutomation.g:446:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalBrowserAutomation.g:447:3: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // InternalBrowserAutomation.g:448:3: ( rule__Statement__Group_1__0 )
                    // InternalBrowserAutomation.g:448:4: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

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
    // InternalBrowserAutomation.g:456:1: rule__Action__Alternatives : ( ( ruleClick ) | ( ruleInsert ) | ( ruleVerify ) | ( ruleCheck ) | ( ruleChoose ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:460:1: ( ( ruleClick ) | ( ruleInsert ) | ( ruleVerify ) | ( ruleCheck ) | ( ruleChoose ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt3=1;
                }
                break;
            case 38:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            case 43:
                {
                alt3=4;
                }
                break;
            case 44:
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
                    // InternalBrowserAutomation.g:461:2: ( ruleClick )
                    {
                    // InternalBrowserAutomation.g:461:2: ( ruleClick )
                    // InternalBrowserAutomation.g:462:3: ruleClick
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
                    // InternalBrowserAutomation.g:467:2: ( ruleInsert )
                    {
                    // InternalBrowserAutomation.g:467:2: ( ruleInsert )
                    // InternalBrowserAutomation.g:468:3: ruleInsert
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
                    // InternalBrowserAutomation.g:473:2: ( ruleVerify )
                    {
                    // InternalBrowserAutomation.g:473:2: ( ruleVerify )
                    // InternalBrowserAutomation.g:474:3: ruleVerify
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
                    // InternalBrowserAutomation.g:479:2: ( ruleCheck )
                    {
                    // InternalBrowserAutomation.g:479:2: ( ruleCheck )
                    // InternalBrowserAutomation.g:480:3: ruleCheck
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
                    // InternalBrowserAutomation.g:485:2: ( ruleChoose )
                    {
                    // InternalBrowserAutomation.g:485:2: ( ruleChoose )
                    // InternalBrowserAutomation.g:486:3: ruleChoose
                    {
                     before(grammarAccess.getActionAccess().getChooseParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleChoose();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getChooseParserRuleCall_4()); 

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
    // InternalBrowserAutomation.g:495:1: rule__Element__Alternatives : ( ( 'link' ) | ( 'input' ) | ( 'button' ) | ( 'checkbox' ) | ( 'combobox' ) | ( 'image' ) | ( 'text' ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:499:1: ( ( 'link' ) | ( 'input' ) | ( 'button' ) | ( 'checkbox' ) | ( 'combobox' ) | ( 'image' ) | ( 'text' ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            case 18:
                {
                alt4=5;
                }
                break;
            case 19:
                {
                alt4=6;
                }
                break;
            case 20:
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
                    // InternalBrowserAutomation.g:500:2: ( 'link' )
                    {
                    // InternalBrowserAutomation.g:500:2: ( 'link' )
                    // InternalBrowserAutomation.g:501:3: 'link'
                    {
                     before(grammarAccess.getElementAccess().getLinkKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getLinkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:506:2: ( 'input' )
                    {
                    // InternalBrowserAutomation.g:506:2: ( 'input' )
                    // InternalBrowserAutomation.g:507:3: 'input'
                    {
                     before(grammarAccess.getElementAccess().getInputKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getInputKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:512:2: ( 'button' )
                    {
                    // InternalBrowserAutomation.g:512:2: ( 'button' )
                    // InternalBrowserAutomation.g:513:3: 'button'
                    {
                     before(grammarAccess.getElementAccess().getButtonKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getButtonKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBrowserAutomation.g:518:2: ( 'checkbox' )
                    {
                    // InternalBrowserAutomation.g:518:2: ( 'checkbox' )
                    // InternalBrowserAutomation.g:519:3: 'checkbox'
                    {
                     before(grammarAccess.getElementAccess().getCheckboxKeyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getCheckboxKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBrowserAutomation.g:524:2: ( 'combobox' )
                    {
                    // InternalBrowserAutomation.g:524:2: ( 'combobox' )
                    // InternalBrowserAutomation.g:525:3: 'combobox'
                    {
                     before(grammarAccess.getElementAccess().getComboboxKeyword_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getComboboxKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBrowserAutomation.g:530:2: ( 'image' )
                    {
                    // InternalBrowserAutomation.g:530:2: ( 'image' )
                    // InternalBrowserAutomation.g:531:3: 'image'
                    {
                     before(grammarAccess.getElementAccess().getImageKeyword_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getImageKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBrowserAutomation.g:536:2: ( 'text' )
                    {
                    // InternalBrowserAutomation.g:536:2: ( 'text' )
                    // InternalBrowserAutomation.g:537:3: 'text'
                    {
                     before(grammarAccess.getElementAccess().getTextKeyword_6()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:546:1: rule__Attribut__Alternatives : ( ( 'class' ) | ( 'value' ) | ( 'alt' ) );
    public final void rule__Attribut__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:550:1: ( ( 'class' ) | ( 'value' ) | ( 'alt' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
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
                    // InternalBrowserAutomation.g:551:2: ( 'class' )
                    {
                    // InternalBrowserAutomation.g:551:2: ( 'class' )
                    // InternalBrowserAutomation.g:552:3: 'class'
                    {
                     before(grammarAccess.getAttributAccess().getClassKeyword_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getClassKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:557:2: ( 'value' )
                    {
                    // InternalBrowserAutomation.g:557:2: ( 'value' )
                    // InternalBrowserAutomation.g:558:3: 'value'
                    {
                     before(grammarAccess.getAttributAccess().getValueKeyword_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getValueKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBrowserAutomation.g:563:2: ( 'alt' )
                    {
                    // InternalBrowserAutomation.g:563:2: ( 'alt' )
                    // InternalBrowserAutomation.g:564:3: 'alt'
                    {
                     before(grammarAccess.getAttributAccess().getAltKeyword_2()); 
                    match(input,23,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:573:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:577:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalBrowserAutomation.g:578:2: rule__Test__Group__0__Impl rule__Test__Group__1
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
    // InternalBrowserAutomation.g:585:1: rule__Test__Group__0__Impl : ( () ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:589:1: ( ( () ) )
            // InternalBrowserAutomation.g:590:1: ( () )
            {
            // InternalBrowserAutomation.g:590:1: ( () )
            // InternalBrowserAutomation.g:591:2: ()
            {
             before(grammarAccess.getTestAccess().getTestAction_0()); 
            // InternalBrowserAutomation.g:592:2: ()
            // InternalBrowserAutomation.g:592:3: 
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
    // InternalBrowserAutomation.g:600:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:604:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalBrowserAutomation.g:605:2: rule__Test__Group__1__Impl rule__Test__Group__2
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
    // InternalBrowserAutomation.g:612:1: rule__Test__Group__1__Impl : ( 'open' ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:616:1: ( ( 'open' ) )
            // InternalBrowserAutomation.g:617:1: ( 'open' )
            {
            // InternalBrowserAutomation.g:617:1: ( 'open' )
            // InternalBrowserAutomation.g:618:2: 'open'
            {
             before(grammarAccess.getTestAccess().getOpenKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:627:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:631:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalBrowserAutomation.g:632:2: rule__Test__Group__2__Impl rule__Test__Group__3
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
    // InternalBrowserAutomation.g:639:1: rule__Test__Group__2__Impl : ( ( rule__Test__WebBrowserAssignment_2 ) ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:643:1: ( ( ( rule__Test__WebBrowserAssignment_2 ) ) )
            // InternalBrowserAutomation.g:644:1: ( ( rule__Test__WebBrowserAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:644:1: ( ( rule__Test__WebBrowserAssignment_2 ) )
            // InternalBrowserAutomation.g:645:2: ( rule__Test__WebBrowserAssignment_2 )
            {
             before(grammarAccess.getTestAccess().getWebBrowserAssignment_2()); 
            // InternalBrowserAutomation.g:646:2: ( rule__Test__WebBrowserAssignment_2 )
            // InternalBrowserAutomation.g:646:3: rule__Test__WebBrowserAssignment_2
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
    // InternalBrowserAutomation.g:654:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:658:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalBrowserAutomation.g:659:2: rule__Test__Group__3__Impl rule__Test__Group__4
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
    // InternalBrowserAutomation.g:666:1: rule__Test__Group__3__Impl : ( 'go' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:670:1: ( ( 'go' ) )
            // InternalBrowserAutomation.g:671:1: ( 'go' )
            {
            // InternalBrowserAutomation.g:671:1: ( 'go' )
            // InternalBrowserAutomation.g:672:2: 'go'
            {
             before(grammarAccess.getTestAccess().getGoKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:681:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:685:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalBrowserAutomation.g:686:2: rule__Test__Group__4__Impl rule__Test__Group__5
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
    // InternalBrowserAutomation.g:693:1: rule__Test__Group__4__Impl : ( 'to' ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:697:1: ( ( 'to' ) )
            // InternalBrowserAutomation.g:698:1: ( 'to' )
            {
            // InternalBrowserAutomation.g:698:1: ( 'to' )
            // InternalBrowserAutomation.g:699:2: 'to'
            {
             before(grammarAccess.getTestAccess().getToKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:708:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:712:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalBrowserAutomation.g:713:2: rule__Test__Group__5__Impl rule__Test__Group__6
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
    // InternalBrowserAutomation.g:720:1: rule__Test__Group__5__Impl : ( ( rule__Test__UrlAssignment_5 ) ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:724:1: ( ( ( rule__Test__UrlAssignment_5 ) ) )
            // InternalBrowserAutomation.g:725:1: ( ( rule__Test__UrlAssignment_5 ) )
            {
            // InternalBrowserAutomation.g:725:1: ( ( rule__Test__UrlAssignment_5 ) )
            // InternalBrowserAutomation.g:726:2: ( rule__Test__UrlAssignment_5 )
            {
             before(grammarAccess.getTestAccess().getUrlAssignment_5()); 
            // InternalBrowserAutomation.g:727:2: ( rule__Test__UrlAssignment_5 )
            // InternalBrowserAutomation.g:727:3: rule__Test__UrlAssignment_5
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
    // InternalBrowserAutomation.g:735:1: rule__Test__Group__6 : rule__Test__Group__6__Impl ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:739:1: ( rule__Test__Group__6__Impl )
            // InternalBrowserAutomation.g:740:2: rule__Test__Group__6__Impl
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
    // InternalBrowserAutomation.g:746:1: rule__Test__Group__6__Impl : ( ( rule__Test__StatementsAssignment_6 )* ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:750:1: ( ( ( rule__Test__StatementsAssignment_6 )* ) )
            // InternalBrowserAutomation.g:751:1: ( ( rule__Test__StatementsAssignment_6 )* )
            {
            // InternalBrowserAutomation.g:751:1: ( ( rule__Test__StatementsAssignment_6 )* )
            // InternalBrowserAutomation.g:752:2: ( rule__Test__StatementsAssignment_6 )*
            {
             before(grammarAccess.getTestAccess().getStatementsAssignment_6()); 
            // InternalBrowserAutomation.g:753:2: ( rule__Test__StatementsAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBrowserAutomation.g:753:3: rule__Test__StatementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Test__StatementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getStatementsAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__WebBrowser__Group_3__0"
    // InternalBrowserAutomation.g:762:1: rule__WebBrowser__Group_3__0 : rule__WebBrowser__Group_3__0__Impl rule__WebBrowser__Group_3__1 ;
    public final void rule__WebBrowser__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:766:1: ( rule__WebBrowser__Group_3__0__Impl rule__WebBrowser__Group_3__1 )
            // InternalBrowserAutomation.g:767:2: rule__WebBrowser__Group_3__0__Impl rule__WebBrowser__Group_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalBrowserAutomation.g:774:1: rule__WebBrowser__Group_3__0__Impl : ( 'internet' ) ;
    public final void rule__WebBrowser__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:778:1: ( ( 'internet' ) )
            // InternalBrowserAutomation.g:779:1: ( 'internet' )
            {
            // InternalBrowserAutomation.g:779:1: ( 'internet' )
            // InternalBrowserAutomation.g:780:2: 'internet'
            {
             before(grammarAccess.getWebBrowserAccess().getInternetKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:789:1: rule__WebBrowser__Group_3__1 : rule__WebBrowser__Group_3__1__Impl ;
    public final void rule__WebBrowser__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:793:1: ( rule__WebBrowser__Group_3__1__Impl )
            // InternalBrowserAutomation.g:794:2: rule__WebBrowser__Group_3__1__Impl
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
    // InternalBrowserAutomation.g:800:1: rule__WebBrowser__Group_3__1__Impl : ( 'explorer' ) ;
    public final void rule__WebBrowser__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:804:1: ( ( 'explorer' ) )
            // InternalBrowserAutomation.g:805:1: ( 'explorer' )
            {
            // InternalBrowserAutomation.g:805:1: ( 'explorer' )
            // InternalBrowserAutomation.g:806:2: 'explorer'
            {
             before(grammarAccess.getWebBrowserAccess().getExplorerKeyword_3_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:816:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:820:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalBrowserAutomation.g:821:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBrowserAutomation.g:828:1: rule__Statement__Group_0__0__Impl : ( ruleGet ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:832:1: ( ( ruleGet ) )
            // InternalBrowserAutomation.g:833:1: ( ruleGet )
            {
            // InternalBrowserAutomation.g:833:1: ( ruleGet )
            // InternalBrowserAutomation.g:834:2: ruleGet
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
    // InternalBrowserAutomation.g:843:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:847:1: ( rule__Statement__Group_0__1__Impl )
            // InternalBrowserAutomation.g:848:2: rule__Statement__Group_0__1__Impl
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
    // InternalBrowserAutomation.g:854:1: rule__Statement__Group_0__1__Impl : ( ( rule__Statement__ActionAssignment_0_1 ) ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:858:1: ( ( ( rule__Statement__ActionAssignment_0_1 ) ) )
            // InternalBrowserAutomation.g:859:1: ( ( rule__Statement__ActionAssignment_0_1 ) )
            {
            // InternalBrowserAutomation.g:859:1: ( ( rule__Statement__ActionAssignment_0_1 ) )
            // InternalBrowserAutomation.g:860:2: ( rule__Statement__ActionAssignment_0_1 )
            {
             before(grammarAccess.getStatementAccess().getActionAssignment_0_1()); 
            // InternalBrowserAutomation.g:861:2: ( rule__Statement__ActionAssignment_0_1 )
            // InternalBrowserAutomation.g:861:3: rule__Statement__ActionAssignment_0_1
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


    // $ANTLR start "rule__Statement__Group_1__0"
    // InternalBrowserAutomation.g:870:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:874:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalBrowserAutomation.g:875:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1();

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
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // InternalBrowserAutomation.g:882:1: rule__Statement__Group_1__0__Impl : ( 'uncheck' ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:886:1: ( ( 'uncheck' ) )
            // InternalBrowserAutomation.g:887:1: ( 'uncheck' )
            {
            // InternalBrowserAutomation.g:887:1: ( 'uncheck' )
            // InternalBrowserAutomation.g:888:2: 'uncheck'
            {
             before(grammarAccess.getStatementAccess().getUncheckKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getUncheckKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // InternalBrowserAutomation.g:897:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:901:1: ( rule__Statement__Group_1__1__Impl )
            // InternalBrowserAutomation.g:902:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // InternalBrowserAutomation.g:908:1: rule__Statement__Group_1__1__Impl : ( 'all' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:912:1: ( ( 'all' ) )
            // InternalBrowserAutomation.g:913:1: ( 'all' )
            {
            // InternalBrowserAutomation.g:913:1: ( 'all' )
            // InternalBrowserAutomation.g:914:2: 'all'
            {
             before(grammarAccess.getStatementAccess().getAllKeyword_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getAllKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Get__Group__0"
    // InternalBrowserAutomation.g:924:1: rule__Get__Group__0 : rule__Get__Group__0__Impl rule__Get__Group__1 ;
    public final void rule__Get__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:928:1: ( rule__Get__Group__0__Impl rule__Get__Group__1 )
            // InternalBrowserAutomation.g:929:2: rule__Get__Group__0__Impl rule__Get__Group__1
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
    // InternalBrowserAutomation.g:936:1: rule__Get__Group__0__Impl : ( ( rule__Get__VarAssignment_0 ) ) ;
    public final void rule__Get__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:940:1: ( ( ( rule__Get__VarAssignment_0 ) ) )
            // InternalBrowserAutomation.g:941:1: ( ( rule__Get__VarAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:941:1: ( ( rule__Get__VarAssignment_0 ) )
            // InternalBrowserAutomation.g:942:2: ( rule__Get__VarAssignment_0 )
            {
             before(grammarAccess.getGetAccess().getVarAssignment_0()); 
            // InternalBrowserAutomation.g:943:2: ( rule__Get__VarAssignment_0 )
            // InternalBrowserAutomation.g:943:3: rule__Get__VarAssignment_0
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
    // InternalBrowserAutomation.g:951:1: rule__Get__Group__1 : rule__Get__Group__1__Impl rule__Get__Group__2 ;
    public final void rule__Get__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:955:1: ( rule__Get__Group__1__Impl rule__Get__Group__2 )
            // InternalBrowserAutomation.g:956:2: rule__Get__Group__1__Impl rule__Get__Group__2
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
    // InternalBrowserAutomation.g:963:1: rule__Get__Group__1__Impl : ( '=' ) ;
    public final void rule__Get__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:967:1: ( ( '=' ) )
            // InternalBrowserAutomation.g:968:1: ( '=' )
            {
            // InternalBrowserAutomation.g:968:1: ( '=' )
            // InternalBrowserAutomation.g:969:2: '='
            {
             before(grammarAccess.getGetAccess().getEqualsSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:978:1: rule__Get__Group__2 : rule__Get__Group__2__Impl rule__Get__Group__3 ;
    public final void rule__Get__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:982:1: ( rule__Get__Group__2__Impl rule__Get__Group__3 )
            // InternalBrowserAutomation.g:983:2: rule__Get__Group__2__Impl rule__Get__Group__3
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
    // InternalBrowserAutomation.g:990:1: rule__Get__Group__2__Impl : ( 'get' ) ;
    public final void rule__Get__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:994:1: ( ( 'get' ) )
            // InternalBrowserAutomation.g:995:1: ( 'get' )
            {
            // InternalBrowserAutomation.g:995:1: ( 'get' )
            // InternalBrowserAutomation.g:996:2: 'get'
            {
             before(grammarAccess.getGetAccess().getGetKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1005:1: rule__Get__Group__3 : rule__Get__Group__3__Impl rule__Get__Group__4 ;
    public final void rule__Get__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1009:1: ( rule__Get__Group__3__Impl rule__Get__Group__4 )
            // InternalBrowserAutomation.g:1010:2: rule__Get__Group__3__Impl rule__Get__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalBrowserAutomation.g:1017:1: rule__Get__Group__3__Impl : ( ( rule__Get__ElementAssignment_3 ) ) ;
    public final void rule__Get__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1021:1: ( ( ( rule__Get__ElementAssignment_3 ) ) )
            // InternalBrowserAutomation.g:1022:1: ( ( rule__Get__ElementAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:1022:1: ( ( rule__Get__ElementAssignment_3 ) )
            // InternalBrowserAutomation.g:1023:2: ( rule__Get__ElementAssignment_3 )
            {
             before(grammarAccess.getGetAccess().getElementAssignment_3()); 
            // InternalBrowserAutomation.g:1024:2: ( rule__Get__ElementAssignment_3 )
            // InternalBrowserAutomation.g:1024:3: rule__Get__ElementAssignment_3
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
    // InternalBrowserAutomation.g:1032:1: rule__Get__Group__4 : rule__Get__Group__4__Impl rule__Get__Group__5 ;
    public final void rule__Get__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1036:1: ( rule__Get__Group__4__Impl rule__Get__Group__5 )
            // InternalBrowserAutomation.g:1037:2: rule__Get__Group__4__Impl rule__Get__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalBrowserAutomation.g:1044:1: rule__Get__Group__4__Impl : ( 'by' ) ;
    public final void rule__Get__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1048:1: ( ( 'by' ) )
            // InternalBrowserAutomation.g:1049:1: ( 'by' )
            {
            // InternalBrowserAutomation.g:1049:1: ( 'by' )
            // InternalBrowserAutomation.g:1050:2: 'by'
            {
             before(grammarAccess.getGetAccess().getByKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1059:1: rule__Get__Group__5 : rule__Get__Group__5__Impl rule__Get__Group__6 ;
    public final void rule__Get__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1063:1: ( rule__Get__Group__5__Impl rule__Get__Group__6 )
            // InternalBrowserAutomation.g:1064:2: rule__Get__Group__5__Impl rule__Get__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalBrowserAutomation.g:1071:1: rule__Get__Group__5__Impl : ( ( rule__Get__AttrAssignment_5 ) ) ;
    public final void rule__Get__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1075:1: ( ( ( rule__Get__AttrAssignment_5 ) ) )
            // InternalBrowserAutomation.g:1076:1: ( ( rule__Get__AttrAssignment_5 ) )
            {
            // InternalBrowserAutomation.g:1076:1: ( ( rule__Get__AttrAssignment_5 ) )
            // InternalBrowserAutomation.g:1077:2: ( rule__Get__AttrAssignment_5 )
            {
             before(grammarAccess.getGetAccess().getAttrAssignment_5()); 
            // InternalBrowserAutomation.g:1078:2: ( rule__Get__AttrAssignment_5 )
            // InternalBrowserAutomation.g:1078:3: rule__Get__AttrAssignment_5
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
    // InternalBrowserAutomation.g:1086:1: rule__Get__Group__6 : rule__Get__Group__6__Impl rule__Get__Group__7 ;
    public final void rule__Get__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1090:1: ( rule__Get__Group__6__Impl rule__Get__Group__7 )
            // InternalBrowserAutomation.g:1091:2: rule__Get__Group__6__Impl rule__Get__Group__7
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
    // InternalBrowserAutomation.g:1098:1: rule__Get__Group__6__Impl : ( '[' ) ;
    public final void rule__Get__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1102:1: ( ( '[' ) )
            // InternalBrowserAutomation.g:1103:1: ( '[' )
            {
            // InternalBrowserAutomation.g:1103:1: ( '[' )
            // InternalBrowserAutomation.g:1104:2: '['
            {
             before(grammarAccess.getGetAccess().getLeftSquareBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1113:1: rule__Get__Group__7 : rule__Get__Group__7__Impl rule__Get__Group__8 ;
    public final void rule__Get__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1117:1: ( rule__Get__Group__7__Impl rule__Get__Group__8 )
            // InternalBrowserAutomation.g:1118:2: rule__Get__Group__7__Impl rule__Get__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalBrowserAutomation.g:1125:1: rule__Get__Group__7__Impl : ( ( rule__Get__AttrValAssignment_7 ) ) ;
    public final void rule__Get__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1129:1: ( ( ( rule__Get__AttrValAssignment_7 ) ) )
            // InternalBrowserAutomation.g:1130:1: ( ( rule__Get__AttrValAssignment_7 ) )
            {
            // InternalBrowserAutomation.g:1130:1: ( ( rule__Get__AttrValAssignment_7 ) )
            // InternalBrowserAutomation.g:1131:2: ( rule__Get__AttrValAssignment_7 )
            {
             before(grammarAccess.getGetAccess().getAttrValAssignment_7()); 
            // InternalBrowserAutomation.g:1132:2: ( rule__Get__AttrValAssignment_7 )
            // InternalBrowserAutomation.g:1132:3: rule__Get__AttrValAssignment_7
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
    // InternalBrowserAutomation.g:1140:1: rule__Get__Group__8 : rule__Get__Group__8__Impl ;
    public final void rule__Get__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1144:1: ( rule__Get__Group__8__Impl )
            // InternalBrowserAutomation.g:1145:2: rule__Get__Group__8__Impl
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
    // InternalBrowserAutomation.g:1151:1: rule__Get__Group__8__Impl : ( ']' ) ;
    public final void rule__Get__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1155:1: ( ( ']' ) )
            // InternalBrowserAutomation.g:1156:1: ( ']' )
            {
            // InternalBrowserAutomation.g:1156:1: ( ']' )
            // InternalBrowserAutomation.g:1157:2: ']'
            {
             before(grammarAccess.getGetAccess().getRightSquareBracketKeyword_8()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1167:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1171:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalBrowserAutomation.g:1172:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBrowserAutomation.g:1179:1: rule__Click__Group__0__Impl : ( 'click' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1183:1: ( ( 'click' ) )
            // InternalBrowserAutomation.g:1184:1: ( 'click' )
            {
            // InternalBrowserAutomation.g:1184:1: ( 'click' )
            // InternalBrowserAutomation.g:1185:2: 'click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1194:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1198:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalBrowserAutomation.g:1199:2: rule__Click__Group__1__Impl rule__Click__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalBrowserAutomation.g:1206:1: rule__Click__Group__1__Impl : ( 'on' ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1210:1: ( ( 'on' ) )
            // InternalBrowserAutomation.g:1211:1: ( 'on' )
            {
            // InternalBrowserAutomation.g:1211:1: ( 'on' )
            // InternalBrowserAutomation.g:1212:2: 'on'
            {
             before(grammarAccess.getClickAccess().getOnKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1221:1: rule__Click__Group__2 : rule__Click__Group__2__Impl ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1225:1: ( rule__Click__Group__2__Impl )
            // InternalBrowserAutomation.g:1226:2: rule__Click__Group__2__Impl
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
    // InternalBrowserAutomation.g:1232:1: rule__Click__Group__2__Impl : ( ( rule__Click__VarAssignment_2 ) ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1236:1: ( ( ( rule__Click__VarAssignment_2 ) ) )
            // InternalBrowserAutomation.g:1237:1: ( ( rule__Click__VarAssignment_2 ) )
            {
            // InternalBrowserAutomation.g:1237:1: ( ( rule__Click__VarAssignment_2 ) )
            // InternalBrowserAutomation.g:1238:2: ( rule__Click__VarAssignment_2 )
            {
             before(grammarAccess.getClickAccess().getVarAssignment_2()); 
            // InternalBrowserAutomation.g:1239:2: ( rule__Click__VarAssignment_2 )
            // InternalBrowserAutomation.g:1239:3: rule__Click__VarAssignment_2
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
    // InternalBrowserAutomation.g:1248:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1252:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalBrowserAutomation.g:1253:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
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
    // InternalBrowserAutomation.g:1260:1: rule__Insert__Group__0__Impl : ( 'insert' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1264:1: ( ( 'insert' ) )
            // InternalBrowserAutomation.g:1265:1: ( 'insert' )
            {
            // InternalBrowserAutomation.g:1265:1: ( 'insert' )
            // InternalBrowserAutomation.g:1266:2: 'insert'
            {
             before(grammarAccess.getInsertAccess().getInsertKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1275:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1279:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalBrowserAutomation.g:1280:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
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
    // InternalBrowserAutomation.g:1287:1: rule__Insert__Group__1__Impl : ( ( rule__Insert__ValueAssignment_1 ) ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1291:1: ( ( ( rule__Insert__ValueAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1292:1: ( ( rule__Insert__ValueAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1292:1: ( ( rule__Insert__ValueAssignment_1 ) )
            // InternalBrowserAutomation.g:1293:2: ( rule__Insert__ValueAssignment_1 )
            {
             before(grammarAccess.getInsertAccess().getValueAssignment_1()); 
            // InternalBrowserAutomation.g:1294:2: ( rule__Insert__ValueAssignment_1 )
            // InternalBrowserAutomation.g:1294:3: rule__Insert__ValueAssignment_1
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
    // InternalBrowserAutomation.g:1302:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1306:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalBrowserAutomation.g:1307:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalBrowserAutomation.g:1314:1: rule__Insert__Group__2__Impl : ( 'in' ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1318:1: ( ( 'in' ) )
            // InternalBrowserAutomation.g:1319:1: ( 'in' )
            {
            // InternalBrowserAutomation.g:1319:1: ( 'in' )
            // InternalBrowserAutomation.g:1320:2: 'in'
            {
             before(grammarAccess.getInsertAccess().getInKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1329:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1333:1: ( rule__Insert__Group__3__Impl )
            // InternalBrowserAutomation.g:1334:2: rule__Insert__Group__3__Impl
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
    // InternalBrowserAutomation.g:1340:1: rule__Insert__Group__3__Impl : ( ( rule__Insert__VarAssignment_3 ) ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1344:1: ( ( ( rule__Insert__VarAssignment_3 ) ) )
            // InternalBrowserAutomation.g:1345:1: ( ( rule__Insert__VarAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:1345:1: ( ( rule__Insert__VarAssignment_3 ) )
            // InternalBrowserAutomation.g:1346:2: ( rule__Insert__VarAssignment_3 )
            {
             before(grammarAccess.getInsertAccess().getVarAssignment_3()); 
            // InternalBrowserAutomation.g:1347:2: ( rule__Insert__VarAssignment_3 )
            // InternalBrowserAutomation.g:1347:3: rule__Insert__VarAssignment_3
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
    // InternalBrowserAutomation.g:1356:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1360:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // InternalBrowserAutomation.g:1361:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
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
    // InternalBrowserAutomation.g:1368:1: rule__Verify__Group__0__Impl : ( ( rule__Verify__VarAssignment_0 ) ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1372:1: ( ( ( rule__Verify__VarAssignment_0 ) ) )
            // InternalBrowserAutomation.g:1373:1: ( ( rule__Verify__VarAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:1373:1: ( ( rule__Verify__VarAssignment_0 ) )
            // InternalBrowserAutomation.g:1374:2: ( rule__Verify__VarAssignment_0 )
            {
             before(grammarAccess.getVerifyAccess().getVarAssignment_0()); 
            // InternalBrowserAutomation.g:1375:2: ( rule__Verify__VarAssignment_0 )
            // InternalBrowserAutomation.g:1375:3: rule__Verify__VarAssignment_0
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
    // InternalBrowserAutomation.g:1383:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl rule__Verify__Group__2 ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1387:1: ( rule__Verify__Group__1__Impl rule__Verify__Group__2 )
            // InternalBrowserAutomation.g:1388:2: rule__Verify__Group__1__Impl rule__Verify__Group__2
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
    // InternalBrowserAutomation.g:1395:1: rule__Verify__Group__1__Impl : ( 'is' ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1399:1: ( ( 'is' ) )
            // InternalBrowserAutomation.g:1400:1: ( 'is' )
            {
            // InternalBrowserAutomation.g:1400:1: ( 'is' )
            // InternalBrowserAutomation.g:1401:2: 'is'
            {
             before(grammarAccess.getVerifyAccess().getIsKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1410:1: rule__Verify__Group__2 : rule__Verify__Group__2__Impl rule__Verify__Group__3 ;
    public final void rule__Verify__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1414:1: ( rule__Verify__Group__2__Impl rule__Verify__Group__3 )
            // InternalBrowserAutomation.g:1415:2: rule__Verify__Group__2__Impl rule__Verify__Group__3
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
    // InternalBrowserAutomation.g:1422:1: rule__Verify__Group__2__Impl : ( 'not' ) ;
    public final void rule__Verify__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1426:1: ( ( 'not' ) )
            // InternalBrowserAutomation.g:1427:1: ( 'not' )
            {
            // InternalBrowserAutomation.g:1427:1: ( 'not' )
            // InternalBrowserAutomation.g:1428:2: 'not'
            {
             before(grammarAccess.getVerifyAccess().getNotKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1437:1: rule__Verify__Group__3 : rule__Verify__Group__3__Impl ;
    public final void rule__Verify__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1441:1: ( rule__Verify__Group__3__Impl )
            // InternalBrowserAutomation.g:1442:2: rule__Verify__Group__3__Impl
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
    // InternalBrowserAutomation.g:1448:1: rule__Verify__Group__3__Impl : ( 'null' ) ;
    public final void rule__Verify__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1452:1: ( ( 'null' ) )
            // InternalBrowserAutomation.g:1453:1: ( 'null' )
            {
            // InternalBrowserAutomation.g:1453:1: ( 'null' )
            // InternalBrowserAutomation.g:1454:2: 'null'
            {
             before(grammarAccess.getVerifyAccess().getNullKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1464:1: rule__Check__Group__0 : rule__Check__Group__0__Impl rule__Check__Group__1 ;
    public final void rule__Check__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1468:1: ( rule__Check__Group__0__Impl rule__Check__Group__1 )
            // InternalBrowserAutomation.g:1469:2: rule__Check__Group__0__Impl rule__Check__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalBrowserAutomation.g:1476:1: rule__Check__Group__0__Impl : ( 'check' ) ;
    public final void rule__Check__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1480:1: ( ( 'check' ) )
            // InternalBrowserAutomation.g:1481:1: ( 'check' )
            {
            // InternalBrowserAutomation.g:1481:1: ( 'check' )
            // InternalBrowserAutomation.g:1482:2: 'check'
            {
             before(grammarAccess.getCheckAccess().getCheckKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1491:1: rule__Check__Group__1 : rule__Check__Group__1__Impl ;
    public final void rule__Check__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1495:1: ( rule__Check__Group__1__Impl )
            // InternalBrowserAutomation.g:1496:2: rule__Check__Group__1__Impl
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
    // InternalBrowserAutomation.g:1502:1: rule__Check__Group__1__Impl : ( ( rule__Check__VarAssignment_1 ) ) ;
    public final void rule__Check__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1506:1: ( ( ( rule__Check__VarAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1507:1: ( ( rule__Check__VarAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1507:1: ( ( rule__Check__VarAssignment_1 ) )
            // InternalBrowserAutomation.g:1508:2: ( rule__Check__VarAssignment_1 )
            {
             before(grammarAccess.getCheckAccess().getVarAssignment_1()); 
            // InternalBrowserAutomation.g:1509:2: ( rule__Check__VarAssignment_1 )
            // InternalBrowserAutomation.g:1509:3: rule__Check__VarAssignment_1
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
    // InternalBrowserAutomation.g:1518:1: rule__Choose__Group__0 : rule__Choose__Group__0__Impl rule__Choose__Group__1 ;
    public final void rule__Choose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1522:1: ( rule__Choose__Group__0__Impl rule__Choose__Group__1 )
            // InternalBrowserAutomation.g:1523:2: rule__Choose__Group__0__Impl rule__Choose__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalBrowserAutomation.g:1530:1: rule__Choose__Group__0__Impl : ( 'choose' ) ;
    public final void rule__Choose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1534:1: ( ( 'choose' ) )
            // InternalBrowserAutomation.g:1535:1: ( 'choose' )
            {
            // InternalBrowserAutomation.g:1535:1: ( 'choose' )
            // InternalBrowserAutomation.g:1536:2: 'choose'
            {
             before(grammarAccess.getChooseAccess().getChooseKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:1545:1: rule__Choose__Group__1 : rule__Choose__Group__1__Impl ;
    public final void rule__Choose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1549:1: ( rule__Choose__Group__1__Impl )
            // InternalBrowserAutomation.g:1550:2: rule__Choose__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choose__Group__1__Impl();

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
    // InternalBrowserAutomation.g:1556:1: rule__Choose__Group__1__Impl : ( ( rule__Choose__VarAssignment_1 ) ) ;
    public final void rule__Choose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1560:1: ( ( ( rule__Choose__VarAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1561:1: ( ( rule__Choose__VarAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1561:1: ( ( rule__Choose__VarAssignment_1 ) )
            // InternalBrowserAutomation.g:1562:2: ( rule__Choose__VarAssignment_1 )
            {
             before(grammarAccess.getChooseAccess().getVarAssignment_1()); 
            // InternalBrowserAutomation.g:1563:2: ( rule__Choose__VarAssignment_1 )
            // InternalBrowserAutomation.g:1563:3: rule__Choose__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Choose__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChooseAccess().getVarAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Test__WebBrowserAssignment_2"
    // InternalBrowserAutomation.g:1572:1: rule__Test__WebBrowserAssignment_2 : ( ruleWebBrowser ) ;
    public final void rule__Test__WebBrowserAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1576:1: ( ( ruleWebBrowser ) )
            // InternalBrowserAutomation.g:1577:2: ( ruleWebBrowser )
            {
            // InternalBrowserAutomation.g:1577:2: ( ruleWebBrowser )
            // InternalBrowserAutomation.g:1578:3: ruleWebBrowser
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
    // InternalBrowserAutomation.g:1587:1: rule__Test__UrlAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Test__UrlAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1591:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:1592:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:1592:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:1593:3: RULE_STRING
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


    // $ANTLR start "rule__Test__StatementsAssignment_6"
    // InternalBrowserAutomation.g:1602:1: rule__Test__StatementsAssignment_6 : ( ruleStatement ) ;
    public final void rule__Test__StatementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1606:1: ( ( ruleStatement ) )
            // InternalBrowserAutomation.g:1607:2: ( ruleStatement )
            {
            // InternalBrowserAutomation.g:1607:2: ( ruleStatement )
            // InternalBrowserAutomation.g:1608:3: ruleStatement
            {
             before(grammarAccess.getTestAccess().getStatementsStatementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTestAccess().getStatementsStatementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__StatementsAssignment_6"


    // $ANTLR start "rule__Statement__ActionAssignment_0_1"
    // InternalBrowserAutomation.g:1617:1: rule__Statement__ActionAssignment_0_1 : ( ruleAction ) ;
    public final void rule__Statement__ActionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1621:1: ( ( ruleAction ) )
            // InternalBrowserAutomation.g:1622:2: ( ruleAction )
            {
            // InternalBrowserAutomation.g:1622:2: ( ruleAction )
            // InternalBrowserAutomation.g:1623:3: ruleAction
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


    // $ANTLR start "rule__Get__VarAssignment_0"
    // InternalBrowserAutomation.g:1632:1: rule__Get__VarAssignment_0 : ( ruleVariable ) ;
    public final void rule__Get__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1636:1: ( ( ruleVariable ) )
            // InternalBrowserAutomation.g:1637:2: ( ruleVariable )
            {
            // InternalBrowserAutomation.g:1637:2: ( ruleVariable )
            // InternalBrowserAutomation.g:1638:3: ruleVariable
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
    // InternalBrowserAutomation.g:1647:1: rule__Get__ElementAssignment_3 : ( ruleElement ) ;
    public final void rule__Get__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1651:1: ( ( ruleElement ) )
            // InternalBrowserAutomation.g:1652:2: ( ruleElement )
            {
            // InternalBrowserAutomation.g:1652:2: ( ruleElement )
            // InternalBrowserAutomation.g:1653:3: ruleElement
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
    // InternalBrowserAutomation.g:1662:1: rule__Get__AttrAssignment_5 : ( ruleAttribut ) ;
    public final void rule__Get__AttrAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1666:1: ( ( ruleAttribut ) )
            // InternalBrowserAutomation.g:1667:2: ( ruleAttribut )
            {
            // InternalBrowserAutomation.g:1667:2: ( ruleAttribut )
            // InternalBrowserAutomation.g:1668:3: ruleAttribut
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
    // InternalBrowserAutomation.g:1677:1: rule__Get__AttrValAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Get__AttrValAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1681:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:1682:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:1682:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:1683:3: RULE_STRING
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
    // InternalBrowserAutomation.g:1692:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1696:1: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:1697:2: ( RULE_ID )
            {
            // InternalBrowserAutomation.g:1697:2: ( RULE_ID )
            // InternalBrowserAutomation.g:1698:3: RULE_ID
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
    // InternalBrowserAutomation.g:1707:1: rule__VarReference__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VarReference__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1711:1: ( ( ( RULE_ID ) ) )
            // InternalBrowserAutomation.g:1712:2: ( ( RULE_ID ) )
            {
            // InternalBrowserAutomation.g:1712:2: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:1713:3: ( RULE_ID )
            {
             before(grammarAccess.getVarReferenceAccess().getVarVariableCrossReference_0()); 
            // InternalBrowserAutomation.g:1714:3: ( RULE_ID )
            // InternalBrowserAutomation.g:1715:4: RULE_ID
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
    // InternalBrowserAutomation.g:1726:1: rule__Click__VarAssignment_2 : ( ruleVarReference ) ;
    public final void rule__Click__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1730:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:1731:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:1731:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:1732:3: ruleVarReference
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
    // InternalBrowserAutomation.g:1741:1: rule__Insert__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Insert__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1745:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:1746:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:1746:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:1747:3: RULE_STRING
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
    // InternalBrowserAutomation.g:1756:1: rule__Insert__VarAssignment_3 : ( ruleVarReference ) ;
    public final void rule__Insert__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1760:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:1761:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:1761:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:1762:3: ruleVarReference
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


    // $ANTLR start "rule__Verify__VarAssignment_0"
    // InternalBrowserAutomation.g:1771:1: rule__Verify__VarAssignment_0 : ( ruleVarReference ) ;
    public final void rule__Verify__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1775:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:1776:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:1776:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:1777:3: ruleVarReference
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
    // InternalBrowserAutomation.g:1786:1: rule__Check__VarAssignment_1 : ( ruleVarReference ) ;
    public final void rule__Check__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1790:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:1791:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:1791:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:1792:3: ruleVarReference
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


    // $ANTLR start "rule__Choose__VarAssignment_1"
    // InternalBrowserAutomation.g:1801:1: rule__Choose__VarAssignment_1 : ( ruleVarReference ) ;
    public final void rule__Choose__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1805:1: ( ( ruleVarReference ) )
            // InternalBrowserAutomation.g:1806:2: ( ruleVarReference )
            {
            // InternalBrowserAutomation.g:1806:2: ( ruleVarReference )
            // InternalBrowserAutomation.g:1807:3: ruleVarReference
            {
             before(grammarAccess.getChooseAccess().getVarVarReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getChooseAccess().getVarVarReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__VarAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008003800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000185000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});

}