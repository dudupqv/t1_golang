package org.xtext.example.go.ide.contentassist.antlr.internal;

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
import org.xtext.example.go.services.GolangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGolangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'+'", "'var'", "'('", "')'", "','", "'='", "'.'", "'['", "']'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalGolangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGolangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGolangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGolang.g"; }


    	private GolangGrammarAccess grammarAccess;

    	public void setGrammarAccess(GolangGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleVarDecl"
    // InternalGolang.g:53:1: entryRuleVarDecl : ruleVarDecl EOF ;
    public final void entryRuleVarDecl() throws RecognitionException {
        try {
            // InternalGolang.g:54:1: ( ruleVarDecl EOF )
            // InternalGolang.g:55:1: ruleVarDecl EOF
            {
             before(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getVarDeclRule()); 
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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalGolang.g:62:1: ruleVarDecl : ( ( rule__VarDecl__Alternatives ) ) ;
    public final void ruleVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:66:2: ( ( ( rule__VarDecl__Alternatives ) ) )
            // InternalGolang.g:67:2: ( ( rule__VarDecl__Alternatives ) )
            {
            // InternalGolang.g:67:2: ( ( rule__VarDecl__Alternatives ) )
            // InternalGolang.g:68:3: ( rule__VarDecl__Alternatives )
            {
             before(grammarAccess.getVarDeclAccess().getAlternatives()); 
            // InternalGolang.g:69:3: ( rule__VarDecl__Alternatives )
            // InternalGolang.g:69:4: rule__VarDecl__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VarDecl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleSpec"
    // InternalGolang.g:78:1: entryRuleSpec : ruleSpec EOF ;
    public final void entryRuleSpec() throws RecognitionException {
        try {
            // InternalGolang.g:79:1: ( ruleSpec EOF )
            // InternalGolang.g:80:1: ruleSpec EOF
            {
             before(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleSpec();

            state._fsp--;

             after(grammarAccess.getSpecRule()); 
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
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // InternalGolang.g:87:1: ruleSpec : ( ( rule__Spec__Alternatives ) ) ;
    public final void ruleSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:91:2: ( ( ( rule__Spec__Alternatives ) ) )
            // InternalGolang.g:92:2: ( ( rule__Spec__Alternatives ) )
            {
            // InternalGolang.g:92:2: ( ( rule__Spec__Alternatives ) )
            // InternalGolang.g:93:3: ( rule__Spec__Alternatives )
            {
             before(grammarAccess.getSpecAccess().getAlternatives()); 
            // InternalGolang.g:94:3: ( rule__Spec__Alternatives )
            // InternalGolang.g:94:4: rule__Spec__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Spec__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRuleExpression"
    // InternalGolang.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalGolang.g:104:1: ( ruleExpression EOF )
            // InternalGolang.g:105:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGolang.g:112:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:116:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalGolang.g:117:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalGolang.g:117:2: ( ( rule__Expression__Alternatives ) )
            // InternalGolang.g:118:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalGolang.g:119:3: ( rule__Expression__Alternatives )
            // InternalGolang.g:119:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSign"
    // InternalGolang.g:128:1: entryRuleSign : ruleSign EOF ;
    public final void entryRuleSign() throws RecognitionException {
        try {
            // InternalGolang.g:129:1: ( ruleSign EOF )
            // InternalGolang.g:130:1: ruleSign EOF
            {
             before(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_1);
            ruleSign();

            state._fsp--;

             after(grammarAccess.getSignRule()); 
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
    // $ANTLR end "entryRuleSign"


    // $ANTLR start "ruleSign"
    // InternalGolang.g:137:1: ruleSign : ( ( rule__Sign__Alternatives ) ) ;
    public final void ruleSign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:141:2: ( ( ( rule__Sign__Alternatives ) ) )
            // InternalGolang.g:142:2: ( ( rule__Sign__Alternatives ) )
            {
            // InternalGolang.g:142:2: ( ( rule__Sign__Alternatives ) )
            // InternalGolang.g:143:3: ( rule__Sign__Alternatives )
            {
             before(grammarAccess.getSignAccess().getAlternatives()); 
            // InternalGolang.g:144:3: ( rule__Sign__Alternatives )
            // InternalGolang.g:144:4: rule__Sign__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sign__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSignAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSign"


    // $ANTLR start "rule__VarDecl__Alternatives"
    // InternalGolang.g:152:1: rule__VarDecl__Alternatives : ( ( ( rule__VarDecl__Group_0__0 ) ) | ( ( rule__VarDecl__Group_1__0 ) ) );
    public final void rule__VarDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:156:1: ( ( ( rule__VarDecl__Group_0__0 ) ) | ( ( rule__VarDecl__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==14) ) {
                    alt1=2;
                }
                else if ( (LA1_1==RULE_ID||LA1_1==16) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGolang.g:157:2: ( ( rule__VarDecl__Group_0__0 ) )
                    {
                    // InternalGolang.g:157:2: ( ( rule__VarDecl__Group_0__0 ) )
                    // InternalGolang.g:158:3: ( rule__VarDecl__Group_0__0 )
                    {
                     before(grammarAccess.getVarDeclAccess().getGroup_0()); 
                    // InternalGolang.g:159:3: ( rule__VarDecl__Group_0__0 )
                    // InternalGolang.g:159:4: rule__VarDecl__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDecl__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarDeclAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGolang.g:163:2: ( ( rule__VarDecl__Group_1__0 ) )
                    {
                    // InternalGolang.g:163:2: ( ( rule__VarDecl__Group_1__0 ) )
                    // InternalGolang.g:164:3: ( rule__VarDecl__Group_1__0 )
                    {
                     before(grammarAccess.getVarDeclAccess().getGroup_1()); 
                    // InternalGolang.g:165:3: ( rule__VarDecl__Group_1__0 )
                    // InternalGolang.g:165:4: rule__VarDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDecl__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarDeclAccess().getGroup_1()); 

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
    // $ANTLR end "rule__VarDecl__Alternatives"


    // $ANTLR start "rule__Spec__Alternatives"
    // InternalGolang.g:173:1: rule__Spec__Alternatives : ( ( ( rule__Spec__NameAssignment_0 ) ) | ( ( rule__Spec__Group_1__0 ) ) | ( ( rule__Spec__Group_2__0 ) ) | ( ( rule__Spec__Group_3__0 ) ) | ( ( rule__Spec__Group_4__0 ) ) | ( ( rule__Spec__Group_5__0 ) ) );
    public final void rule__Spec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:177:1: ( ( ( rule__Spec__NameAssignment_0 ) ) | ( ( rule__Spec__Group_1__0 ) ) | ( ( rule__Spec__Group_2__0 ) ) | ( ( rule__Spec__Group_3__0 ) ) | ( ( rule__Spec__Group_4__0 ) ) | ( ( rule__Spec__Group_5__0 ) ) )
            int alt2=6;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalGolang.g:178:2: ( ( rule__Spec__NameAssignment_0 ) )
                    {
                    // InternalGolang.g:178:2: ( ( rule__Spec__NameAssignment_0 ) )
                    // InternalGolang.g:179:3: ( rule__Spec__NameAssignment_0 )
                    {
                     before(grammarAccess.getSpecAccess().getNameAssignment_0()); 
                    // InternalGolang.g:180:3: ( rule__Spec__NameAssignment_0 )
                    // InternalGolang.g:180:4: rule__Spec__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Spec__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGolang.g:184:2: ( ( rule__Spec__Group_1__0 ) )
                    {
                    // InternalGolang.g:184:2: ( ( rule__Spec__Group_1__0 ) )
                    // InternalGolang.g:185:3: ( rule__Spec__Group_1__0 )
                    {
                     before(grammarAccess.getSpecAccess().getGroup_1()); 
                    // InternalGolang.g:186:3: ( rule__Spec__Group_1__0 )
                    // InternalGolang.g:186:4: rule__Spec__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Spec__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGolang.g:190:2: ( ( rule__Spec__Group_2__0 ) )
                    {
                    // InternalGolang.g:190:2: ( ( rule__Spec__Group_2__0 ) )
                    // InternalGolang.g:191:3: ( rule__Spec__Group_2__0 )
                    {
                     before(grammarAccess.getSpecAccess().getGroup_2()); 
                    // InternalGolang.g:192:3: ( rule__Spec__Group_2__0 )
                    // InternalGolang.g:192:4: rule__Spec__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Spec__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGolang.g:196:2: ( ( rule__Spec__Group_3__0 ) )
                    {
                    // InternalGolang.g:196:2: ( ( rule__Spec__Group_3__0 ) )
                    // InternalGolang.g:197:3: ( rule__Spec__Group_3__0 )
                    {
                     before(grammarAccess.getSpecAccess().getGroup_3()); 
                    // InternalGolang.g:198:3: ( rule__Spec__Group_3__0 )
                    // InternalGolang.g:198:4: rule__Spec__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Spec__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGolang.g:202:2: ( ( rule__Spec__Group_4__0 ) )
                    {
                    // InternalGolang.g:202:2: ( ( rule__Spec__Group_4__0 ) )
                    // InternalGolang.g:203:3: ( rule__Spec__Group_4__0 )
                    {
                     before(grammarAccess.getSpecAccess().getGroup_4()); 
                    // InternalGolang.g:204:3: ( rule__Spec__Group_4__0 )
                    // InternalGolang.g:204:4: rule__Spec__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Spec__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGolang.g:208:2: ( ( rule__Spec__Group_5__0 ) )
                    {
                    // InternalGolang.g:208:2: ( ( rule__Spec__Group_5__0 ) )
                    // InternalGolang.g:209:3: ( rule__Spec__Group_5__0 )
                    {
                     before(grammarAccess.getSpecAccess().getGroup_5()); 
                    // InternalGolang.g:210:3: ( rule__Spec__Group_5__0 )
                    // InternalGolang.g:210:4: rule__Spec__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Spec__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Spec__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalGolang.g:218:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ( rule__Expression__Group_2__0 ) ) | ( ( rule__Expression__Group_3__0 ) ) | ( ( rule__Expression__Group_4__0 ) ) | ( RULE_INT ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:222:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ( rule__Expression__Group_2__0 ) ) | ( ( rule__Expression__Group_3__0 ) ) | ( ( rule__Expression__Group_4__0 ) ) | ( RULE_INT ) )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalGolang.g:223:2: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // InternalGolang.g:223:2: ( ( rule__Expression__Group_0__0 ) )
                    // InternalGolang.g:224:3: ( rule__Expression__Group_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    // InternalGolang.g:225:3: ( rule__Expression__Group_0__0 )
                    // InternalGolang.g:225:4: rule__Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGolang.g:229:2: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalGolang.g:229:2: ( ( rule__Expression__Group_1__0 ) )
                    // InternalGolang.g:230:3: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // InternalGolang.g:231:3: ( rule__Expression__Group_1__0 )
                    // InternalGolang.g:231:4: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGolang.g:235:2: ( ( rule__Expression__Group_2__0 ) )
                    {
                    // InternalGolang.g:235:2: ( ( rule__Expression__Group_2__0 ) )
                    // InternalGolang.g:236:3: ( rule__Expression__Group_2__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_2()); 
                    // InternalGolang.g:237:3: ( rule__Expression__Group_2__0 )
                    // InternalGolang.g:237:4: rule__Expression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGolang.g:241:2: ( ( rule__Expression__Group_3__0 ) )
                    {
                    // InternalGolang.g:241:2: ( ( rule__Expression__Group_3__0 ) )
                    // InternalGolang.g:242:3: ( rule__Expression__Group_3__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_3()); 
                    // InternalGolang.g:243:3: ( rule__Expression__Group_3__0 )
                    // InternalGolang.g:243:4: rule__Expression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGolang.g:247:2: ( ( rule__Expression__Group_4__0 ) )
                    {
                    // InternalGolang.g:247:2: ( ( rule__Expression__Group_4__0 ) )
                    // InternalGolang.g:248:3: ( rule__Expression__Group_4__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_4()); 
                    // InternalGolang.g:249:3: ( rule__Expression__Group_4__0 )
                    // InternalGolang.g:249:4: rule__Expression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGolang.g:253:2: ( RULE_INT )
                    {
                    // InternalGolang.g:253:2: ( RULE_INT )
                    // InternalGolang.g:254:3: RULE_INT
                    {
                     before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_5()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Sign__Alternatives"
    // InternalGolang.g:263:1: rule__Sign__Alternatives : ( ( '-' ) | ( '+' ) );
    public final void rule__Sign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:267:1: ( ( '-' ) | ( '+' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGolang.g:268:2: ( '-' )
                    {
                    // InternalGolang.g:268:2: ( '-' )
                    // InternalGolang.g:269:3: '-'
                    {
                     before(grammarAccess.getSignAccess().getHyphenMinusKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSignAccess().getHyphenMinusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGolang.g:274:2: ( '+' )
                    {
                    // InternalGolang.g:274:2: ( '+' )
                    // InternalGolang.g:275:3: '+'
                    {
                     before(grammarAccess.getSignAccess().getPlusSignKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSignAccess().getPlusSignKeyword_1()); 

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
    // $ANTLR end "rule__Sign__Alternatives"


    // $ANTLR start "rule__VarDecl__Group_0__0"
    // InternalGolang.g:284:1: rule__VarDecl__Group_0__0 : rule__VarDecl__Group_0__0__Impl rule__VarDecl__Group_0__1 ;
    public final void rule__VarDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:288:1: ( rule__VarDecl__Group_0__0__Impl rule__VarDecl__Group_0__1 )
            // InternalGolang.g:289:2: rule__VarDecl__Group_0__0__Impl rule__VarDecl__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__VarDecl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDecl__Group_0__1();

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
    // $ANTLR end "rule__VarDecl__Group_0__0"


    // $ANTLR start "rule__VarDecl__Group_0__0__Impl"
    // InternalGolang.g:296:1: rule__VarDecl__Group_0__0__Impl : ( 'var' ) ;
    public final void rule__VarDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:300:1: ( ( 'var' ) )
            // InternalGolang.g:301:1: ( 'var' )
            {
            // InternalGolang.g:301:1: ( 'var' )
            // InternalGolang.g:302:2: 'var'
            {
             before(grammarAccess.getVarDeclAccess().getVarKeyword_0_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVarDeclAccess().getVarKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group_0__0__Impl"


    // $ANTLR start "rule__VarDecl__Group_0__1"
    // InternalGolang.g:311:1: rule__VarDecl__Group_0__1 : rule__VarDecl__Group_0__1__Impl ;
    public final void rule__VarDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:315:1: ( rule__VarDecl__Group_0__1__Impl )
            // InternalGolang.g:316:2: rule__VarDecl__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDecl__Group_0__1__Impl();

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
    // $ANTLR end "rule__VarDecl__Group_0__1"


    // $ANTLR start "rule__VarDecl__Group_0__1__Impl"
    // InternalGolang.g:322:1: rule__VarDecl__Group_0__1__Impl : ( ( ( rule__VarDecl__SpecsAssignment_0_1 ) ) ( ( rule__VarDecl__SpecsAssignment_0_1 )* ) ) ;
    public final void rule__VarDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:326:1: ( ( ( ( rule__VarDecl__SpecsAssignment_0_1 ) ) ( ( rule__VarDecl__SpecsAssignment_0_1 )* ) ) )
            // InternalGolang.g:327:1: ( ( ( rule__VarDecl__SpecsAssignment_0_1 ) ) ( ( rule__VarDecl__SpecsAssignment_0_1 )* ) )
            {
            // InternalGolang.g:327:1: ( ( ( rule__VarDecl__SpecsAssignment_0_1 ) ) ( ( rule__VarDecl__SpecsAssignment_0_1 )* ) )
            // InternalGolang.g:328:2: ( ( rule__VarDecl__SpecsAssignment_0_1 ) ) ( ( rule__VarDecl__SpecsAssignment_0_1 )* )
            {
            // InternalGolang.g:328:2: ( ( rule__VarDecl__SpecsAssignment_0_1 ) )
            // InternalGolang.g:329:3: ( rule__VarDecl__SpecsAssignment_0_1 )
            {
             before(grammarAccess.getVarDeclAccess().getSpecsAssignment_0_1()); 
            // InternalGolang.g:330:3: ( rule__VarDecl__SpecsAssignment_0_1 )
            // InternalGolang.g:330:4: rule__VarDecl__SpecsAssignment_0_1
            {
            pushFollow(FOLLOW_4);
            rule__VarDecl__SpecsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getSpecsAssignment_0_1()); 

            }

            // InternalGolang.g:333:2: ( ( rule__VarDecl__SpecsAssignment_0_1 )* )
            // InternalGolang.g:334:3: ( rule__VarDecl__SpecsAssignment_0_1 )*
            {
             before(grammarAccess.getVarDeclAccess().getSpecsAssignment_0_1()); 
            // InternalGolang.g:335:3: ( rule__VarDecl__SpecsAssignment_0_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGolang.g:335:4: rule__VarDecl__SpecsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__VarDecl__SpecsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getVarDeclAccess().getSpecsAssignment_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group_0__1__Impl"


    // $ANTLR start "rule__VarDecl__Group_1__0"
    // InternalGolang.g:345:1: rule__VarDecl__Group_1__0 : rule__VarDecl__Group_1__0__Impl rule__VarDecl__Group_1__1 ;
    public final void rule__VarDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:349:1: ( rule__VarDecl__Group_1__0__Impl rule__VarDecl__Group_1__1 )
            // InternalGolang.g:350:2: rule__VarDecl__Group_1__0__Impl rule__VarDecl__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__VarDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDecl__Group_1__1();

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
    // $ANTLR end "rule__VarDecl__Group_1__0"


    // $ANTLR start "rule__VarDecl__Group_1__0__Impl"
    // InternalGolang.g:357:1: rule__VarDecl__Group_1__0__Impl : ( 'var' ) ;
    public final void rule__VarDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:361:1: ( ( 'var' ) )
            // InternalGolang.g:362:1: ( 'var' )
            {
            // InternalGolang.g:362:1: ( 'var' )
            // InternalGolang.g:363:2: 'var'
            {
             before(grammarAccess.getVarDeclAccess().getVarKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVarDeclAccess().getVarKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group_1__0__Impl"


    // $ANTLR start "rule__VarDecl__Group_1__1"
    // InternalGolang.g:372:1: rule__VarDecl__Group_1__1 : rule__VarDecl__Group_1__1__Impl rule__VarDecl__Group_1__2 ;
    public final void rule__VarDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:376:1: ( rule__VarDecl__Group_1__1__Impl rule__VarDecl__Group_1__2 )
            // InternalGolang.g:377:2: rule__VarDecl__Group_1__1__Impl rule__VarDecl__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__VarDecl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDecl__Group_1__2();

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
    // $ANTLR end "rule__VarDecl__Group_1__1"


    // $ANTLR start "rule__VarDecl__Group_1__1__Impl"
    // InternalGolang.g:384:1: rule__VarDecl__Group_1__1__Impl : ( '(' ) ;
    public final void rule__VarDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:388:1: ( ( '(' ) )
            // InternalGolang.g:389:1: ( '(' )
            {
            // InternalGolang.g:389:1: ( '(' )
            // InternalGolang.g:390:2: '('
            {
             before(grammarAccess.getVarDeclAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVarDeclAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group_1__1__Impl"


    // $ANTLR start "rule__VarDecl__Group_1__2"
    // InternalGolang.g:399:1: rule__VarDecl__Group_1__2 : rule__VarDecl__Group_1__2__Impl rule__VarDecl__Group_1__3 ;
    public final void rule__VarDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:403:1: ( rule__VarDecl__Group_1__2__Impl rule__VarDecl__Group_1__3 )
            // InternalGolang.g:404:2: rule__VarDecl__Group_1__2__Impl rule__VarDecl__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__VarDecl__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDecl__Group_1__3();

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
    // $ANTLR end "rule__VarDecl__Group_1__2"


    // $ANTLR start "rule__VarDecl__Group_1__2__Impl"
    // InternalGolang.g:411:1: rule__VarDecl__Group_1__2__Impl : ( ( ( rule__VarDecl__SpecsAssignment_1_2 ) ) ( ( rule__VarDecl__SpecsAssignment_1_2 )* ) ) ;
    public final void rule__VarDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:415:1: ( ( ( ( rule__VarDecl__SpecsAssignment_1_2 ) ) ( ( rule__VarDecl__SpecsAssignment_1_2 )* ) ) )
            // InternalGolang.g:416:1: ( ( ( rule__VarDecl__SpecsAssignment_1_2 ) ) ( ( rule__VarDecl__SpecsAssignment_1_2 )* ) )
            {
            // InternalGolang.g:416:1: ( ( ( rule__VarDecl__SpecsAssignment_1_2 ) ) ( ( rule__VarDecl__SpecsAssignment_1_2 )* ) )
            // InternalGolang.g:417:2: ( ( rule__VarDecl__SpecsAssignment_1_2 ) ) ( ( rule__VarDecl__SpecsAssignment_1_2 )* )
            {
            // InternalGolang.g:417:2: ( ( rule__VarDecl__SpecsAssignment_1_2 ) )
            // InternalGolang.g:418:3: ( rule__VarDecl__SpecsAssignment_1_2 )
            {
             before(grammarAccess.getVarDeclAccess().getSpecsAssignment_1_2()); 
            // InternalGolang.g:419:3: ( rule__VarDecl__SpecsAssignment_1_2 )
            // InternalGolang.g:419:4: rule__VarDecl__SpecsAssignment_1_2
            {
            pushFollow(FOLLOW_4);
            rule__VarDecl__SpecsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getSpecsAssignment_1_2()); 

            }

            // InternalGolang.g:422:2: ( ( rule__VarDecl__SpecsAssignment_1_2 )* )
            // InternalGolang.g:423:3: ( rule__VarDecl__SpecsAssignment_1_2 )*
            {
             before(grammarAccess.getVarDeclAccess().getSpecsAssignment_1_2()); 
            // InternalGolang.g:424:3: ( rule__VarDecl__SpecsAssignment_1_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGolang.g:424:4: rule__VarDecl__SpecsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__VarDecl__SpecsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getVarDeclAccess().getSpecsAssignment_1_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group_1__2__Impl"


    // $ANTLR start "rule__VarDecl__Group_1__3"
    // InternalGolang.g:433:1: rule__VarDecl__Group_1__3 : rule__VarDecl__Group_1__3__Impl ;
    public final void rule__VarDecl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:437:1: ( rule__VarDecl__Group_1__3__Impl )
            // InternalGolang.g:438:2: rule__VarDecl__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDecl__Group_1__3__Impl();

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
    // $ANTLR end "rule__VarDecl__Group_1__3"


    // $ANTLR start "rule__VarDecl__Group_1__3__Impl"
    // InternalGolang.g:444:1: rule__VarDecl__Group_1__3__Impl : ( ')' ) ;
    public final void rule__VarDecl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:448:1: ( ( ')' ) )
            // InternalGolang.g:449:1: ( ')' )
            {
            // InternalGolang.g:449:1: ( ')' )
            // InternalGolang.g:450:2: ')'
            {
             before(grammarAccess.getVarDeclAccess().getRightParenthesisKeyword_1_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVarDeclAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group_1__3__Impl"


    // $ANTLR start "rule__Spec__Group_1__0"
    // InternalGolang.g:460:1: rule__Spec__Group_1__0 : rule__Spec__Group_1__0__Impl rule__Spec__Group_1__1 ;
    public final void rule__Spec__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:464:1: ( rule__Spec__Group_1__0__Impl rule__Spec__Group_1__1 )
            // InternalGolang.g:465:2: rule__Spec__Group_1__0__Impl rule__Spec__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Spec__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group_1__1();

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
    // $ANTLR end "rule__Spec__Group_1__0"


    // $ANTLR start "rule__Spec__Group_1__0__Impl"
    // InternalGolang.g:472:1: rule__Spec__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Spec__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:476:1: ( ( ',' ) )
            // InternalGolang.g:477:1: ( ',' )
            {
            // InternalGolang.g:477:1: ( ',' )
            // InternalGolang.g:478:2: ','
            {
             before(grammarAccess.getSpecAccess().getCommaKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_1__0__Impl"


    // $ANTLR start "rule__Spec__Group_1__1"
    // InternalGolang.g:487:1: rule__Spec__Group_1__1 : rule__Spec__Group_1__1__Impl rule__Spec__Group_1__2 ;
    public final void rule__Spec__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:491:1: ( rule__Spec__Group_1__1__Impl rule__Spec__Group_1__2 )
            // InternalGolang.g:492:2: rule__Spec__Group_1__1__Impl rule__Spec__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Spec__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group_1__2();

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
    // $ANTLR end "rule__Spec__Group_1__1"


    // $ANTLR start "rule__Spec__Group_1__1__Impl"
    // InternalGolang.g:499:1: rule__Spec__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Spec__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:503:1: ( ( RULE_ID ) )
            // InternalGolang.g:504:1: ( RULE_ID )
            {
            // InternalGolang.g:504:1: ( RULE_ID )
            // InternalGolang.g:505:2: RULE_ID
            {
             before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_1__1__Impl"


    // $ANTLR start "rule__Spec__Group_1__2"
    // InternalGolang.g:514:1: rule__Spec__Group_1__2 : rule__Spec__Group_1__2__Impl rule__Spec__Group_1__3 ;
    public final void rule__Spec__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:518:1: ( rule__Spec__Group_1__2__Impl rule__Spec__Group_1__3 )
            // InternalGolang.g:519:2: rule__Spec__Group_1__2__Impl rule__Spec__Group_1__3
            {
            pushFollow(FOLLOW_8);
            rule__Spec__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group_1__3();

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
    // $ANTLR end "rule__Spec__Group_1__2"


    // $ANTLR start "rule__Spec__Group_1__2__Impl"
    // InternalGolang.g:526:1: rule__Spec__Group_1__2__Impl : ( RULE_ID ) ;
    public final void rule__Spec__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:530:1: ( ( RULE_ID ) )
            // InternalGolang.g:531:1: ( RULE_ID )
            {
            // InternalGolang.g:531:1: ( RULE_ID )
            // InternalGolang.g:532:2: RULE_ID
            {
             before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_1__2__Impl"


    // $ANTLR start "rule__Spec__Group_1__3"
    // InternalGolang.g:541:1: rule__Spec__Group_1__3 : rule__Spec__Group_1__3__Impl rule__Spec__Group_1__4 ;
    public final void rule__Spec__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:545:1: ( rule__Spec__Group_1__3__Impl rule__Spec__Group_1__4 )
            // InternalGolang.g:546:2: rule__Spec__Group_1__3__Impl rule__Spec__Group_1__4
            {
            pushFollow(FOLLOW_9);
            rule__Spec__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group_1__4();

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
    // $ANTLR end "rule__Spec__Group_1__3"


    // $ANTLR start "rule__Spec__Group_1__3__Impl"
    // InternalGolang.g:553:1: rule__Spec__Group_1__3__Impl : ( '=' ) ;
    public final void rule__Spec__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:557:1: ( ( '=' ) )
            // InternalGolang.g:558:1: ( '=' )
            {
            // InternalGolang.g:558:1: ( '=' )
            // InternalGolang.g:559:2: '='
            {
             before(grammarAccess.getSpecAccess().getEqualsSignKeyword_1_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getEqualsSignKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_1__3__Impl"


    // $ANTLR start "rule__Spec__Group_1__4"
    // InternalGolang.g:568:1: rule__Spec__Group_1__4 : rule__Spec__Group_1__4__Impl ;
    public final void rule__Spec__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:572:1: ( rule__Spec__Group_1__4__Impl )
            // InternalGolang.g:573:2: rule__Spec__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spec__Group_1__4__Impl();

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
    // $ANTLR end "rule__Spec__Group_1__4"


    // $ANTLR start "rule__Spec__Group_1__4__Impl"
    // InternalGolang.g:579:1: rule__Spec__Group_1__4__Impl : ( ( rule__Spec__ExpressionsAssignment_1_4 ) ) ;
    public final void rule__Spec__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:583:1: ( ( ( rule__Spec__ExpressionsAssignment_1_4 ) ) )
            // InternalGolang.g:584:1: ( ( rule__Spec__ExpressionsAssignment_1_4 ) )
            {
            // InternalGolang.g:584:1: ( ( rule__Spec__ExpressionsAssignment_1_4 ) )
            // InternalGolang.g:585:2: ( rule__Spec__ExpressionsAssignment_1_4 )
            {
             before(grammarAccess.getSpecAccess().getExpressionsAssignment_1_4()); 
            // InternalGolang.g:586:2: ( rule__Spec__ExpressionsAssignment_1_4 )
            // InternalGolang.g:586:3: rule__Spec__ExpressionsAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Spec__ExpressionsAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getExpressionsAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_1__4__Impl"


    // $ANTLR start "rule__Spec__Group_2__0"
    // InternalGolang.g:595:1: rule__Spec__Group_2__0 : rule__Spec__Group_2__0__Impl rule__Spec__Group_2__1 ;
    public final void rule__Spec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:599:1: ( rule__Spec__Group_2__0__Impl rule__Spec__Group_2__1 )
            // InternalGolang.g:600:2: rule__Spec__Group_2__0__Impl rule__Spec__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Spec__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group_2__1();

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
    // $ANTLR end "rule__Spec__Group_2__0"


    // $ANTLR start "rule__Spec__Group_2__0__Impl"
    // InternalGolang.g:607:1: rule__Spec__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Spec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:611:1: ( ( ',' ) )
            // InternalGolang.g:612:1: ( ',' )
            {
            // InternalGolang.g:612:1: ( ',' )
            // InternalGolang.g:613:2: ','
            {
             before(grammarAccess.getSpecAccess().getCommaKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_2__0__Impl"


    // $ANTLR start "rule__Spec__Group_2__1"
    // InternalGolang.g:622:1: rule__Spec__Group_2__1 : rule__Spec__Group_2__1__Impl rule__Spec__Group_2__2 ;
    public final void rule__Spec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:626:1: ( rule__Spec__Group_2__1__Impl rule__Spec__Group_2__2 )
            // InternalGolang.g:627:2: rule__Spec__Group_2__1__Impl rule__Spec__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__Spec__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group_2__2();

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
    // $ANTLR end "rule__Spec__Group_2__1"


    // $ANTLR start "rule__Spec__Group_2__1__Impl"
    // InternalGolang.g:634:1: rule__Spec__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Spec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:638:1: ( ( RULE_ID ) )
            // InternalGolang.g:639:1: ( RULE_ID )
            {
            // InternalGolang.g:639:1: ( RULE_ID )
            // InternalGolang.g:640:2: RULE_ID
            {
             before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_2__1__Impl"


    // $ANTLR start "rule__Spec__Group_2__2"
    // InternalGolang.g:649:1: rule__Spec__Group_2__2 : rule__Spec__Group_2__2__Impl rule__Spec__Group_2__3 ;
    public final void rule__Spec__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:653:1: ( rule__Spec__Group_2__2__Impl rule__Spec__Group_2__3 )
            // InternalGolang.g:654:2: rule__Spec__Group_2__2__Impl rule__Spec__Group_2__3
            {
            pushFollow(FOLLOW_9);
            rule__Spec__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group_2__3();

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
    // $ANTLR end "rule__Spec__Group_2__2"


    // $ANTLR start "rule__Spec__Group_2__2__Impl"
    // InternalGolang.g:661:1: rule__Spec__Group_2__2__Impl : ( '=' ) ;
    public final void rule__Spec__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:665:1: ( ( '=' ) )
            // InternalGolang.g:666:1: ( '=' )
            {
            // InternalGolang.g:666:1: ( '=' )
            // InternalGolang.g:667:2: '='
            {
             before(grammarAccess.getSpecAccess().getEqualsSignKeyword_2_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getEqualsSignKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_2__2__Impl"


    // $ANTLR start "rule__Spec__Group_2__3"
    // InternalGolang.g:676:1: rule__Spec__Group_2__3 : rule__Spec__Group_2__3__Impl ;
    public final void rule__Spec__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:680:1: ( rule__Spec__Group_2__3__Impl )
            // InternalGolang.g:681:2: rule__Spec__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spec__Group_2__3__Impl();

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
    // $ANTLR end "rule__Spec__Group_2__3"


    // $ANTLR start "rule__Spec__Group_2__3__Impl"
    // InternalGolang.g:687:1: rule__Spec__Group_2__3__Impl : ( ( rule__Spec__ExpressionsAssignment_2_3 ) ) ;
    public final void rule__Spec__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:691:1: ( ( ( rule__Spec__ExpressionsAssignment_2_3 ) ) )
            // InternalGolang.g:692:1: ( ( rule__Spec__ExpressionsAssignment_2_3 ) )
            {
            // InternalGolang.g:692:1: ( ( rule__Spec__ExpressionsAssignment_2_3 ) )
            // InternalGolang.g:693:2: ( rule__Spec__ExpressionsAssignment_2_3 )
            {
             before(grammarAccess.getSpecAccess().getExpressionsAssignment_2_3()); 
            // InternalGolang.g:694:2: ( rule__Spec__ExpressionsAssignment_2_3 )
            // InternalGolang.g:694:3: rule__Spec__ExpressionsAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Spec__ExpressionsAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getExpressionsAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_2__3__Impl"


    // $ANTLR start "rule__Spec__Group_3__0"
    // InternalGolang.g:703:1: rule__Spec__Group_3__0 : rule__Spec__Group_3__0__Impl rule__Spec__Group_3__1 ;
    public final void rule__Spec__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:707:1: ( rule__Spec__Group_3__0__Impl rule__Spec__Group_3__1 )
            // InternalGolang.g:708:2: rule__Spec__Group_3__0__Impl rule__Spec__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Spec__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group_3__1();

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
    // $ANTLR end "rule__Spec__Group_3__0"


    // $ANTLR start "rule__Spec__Group_3__0__Impl"
    // InternalGolang.g:715:1: rule__Spec__Group_3__0__Impl : ( RULE_ID ) ;
    public final void rule__Spec__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:719:1: ( ( RULE_ID ) )
            // InternalGolang.g:720:1: ( RULE_ID )
            {
            // InternalGolang.g:720:1: ( RULE_ID )
            // InternalGolang.g:721:2: RULE_ID
            {
             before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_3__0__Impl"


    // $ANTLR start "rule__Spec__Group_3__1"
    // InternalGolang.g:730:1: rule__Spec__Group_3__1 : rule__Spec__Group_3__1__Impl rule__Spec__Group_3__2 ;
    public final void rule__Spec__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:734:1: ( rule__Spec__Group_3__1__Impl rule__Spec__Group_3__2 )
            // InternalGolang.g:735:2: rule__Spec__Group_3__1__Impl rule__Spec__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__Spec__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group_3__2();

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
    // $ANTLR end "rule__Spec__Group_3__1"


    // $ANTLR start "rule__Spec__Group_3__1__Impl"
    // InternalGolang.g:742:1: rule__Spec__Group_3__1__Impl : ( RULE_ID ) ;
    public final void rule__Spec__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:746:1: ( ( RULE_ID ) )
            // InternalGolang.g:747:1: ( RULE_ID )
            {
            // InternalGolang.g:747:1: ( RULE_ID )
            // InternalGolang.g:748:2: RULE_ID
            {
             before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_3_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_3__1__Impl"


    // $ANTLR start "rule__Spec__Group_3__2"
    // InternalGolang.g:757:1: rule__Spec__Group_3__2 : rule__Spec__Group_3__2__Impl rule__Spec__Group_3__3 ;
    public final void rule__Spec__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:761:1: ( rule__Spec__Group_3__2__Impl rule__Spec__Group_3__3 )
            // InternalGolang.g:762:2: rule__Spec__Group_3__2__Impl rule__Spec__Group_3__3
            {
            pushFollow(FOLLOW_9);
            rule__Spec__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group_3__3();

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
    // $ANTLR end "rule__Spec__Group_3__2"


    // $ANTLR start "rule__Spec__Group_3__2__Impl"
    // InternalGolang.g:769:1: rule__Spec__Group_3__2__Impl : ( '=' ) ;
    public final void rule__Spec__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:773:1: ( ( '=' ) )
            // InternalGolang.g:774:1: ( '=' )
            {
            // InternalGolang.g:774:1: ( '=' )
            // InternalGolang.g:775:2: '='
            {
             before(grammarAccess.getSpecAccess().getEqualsSignKeyword_3_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getEqualsSignKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_3__2__Impl"


    // $ANTLR start "rule__Spec__Group_3__3"
    // InternalGolang.g:784:1: rule__Spec__Group_3__3 : rule__Spec__Group_3__3__Impl ;
    public final void rule__Spec__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:788:1: ( rule__Spec__Group_3__3__Impl )
            // InternalGolang.g:789:2: rule__Spec__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spec__Group_3__3__Impl();

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
    // $ANTLR end "rule__Spec__Group_3__3"


    // $ANTLR start "rule__Spec__Group_3__3__Impl"
    // InternalGolang.g:795:1: rule__Spec__Group_3__3__Impl : ( ( rule__Spec__ExpressionsAssignment_3_3 ) ) ;
    public final void rule__Spec__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:799:1: ( ( ( rule__Spec__ExpressionsAssignment_3_3 ) ) )
            // InternalGolang.g:800:1: ( ( rule__Spec__ExpressionsAssignment_3_3 ) )
            {
            // InternalGolang.g:800:1: ( ( rule__Spec__ExpressionsAssignment_3_3 ) )
            // InternalGolang.g:801:2: ( rule__Spec__ExpressionsAssignment_3_3 )
            {
             before(grammarAccess.getSpecAccess().getExpressionsAssignment_3_3()); 
            // InternalGolang.g:802:2: ( rule__Spec__ExpressionsAssignment_3_3 )
            // InternalGolang.g:802:3: rule__Spec__ExpressionsAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Spec__ExpressionsAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getExpressionsAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_3__3__Impl"


    // $ANTLR start "rule__Spec__Group_4__0"
    // InternalGolang.g:811:1: rule__Spec__Group_4__0 : rule__Spec__Group_4__0__Impl rule__Spec__Group_4__1 ;
    public final void rule__Spec__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:815:1: ( rule__Spec__Group_4__0__Impl rule__Spec__Group_4__1 )
            // InternalGolang.g:816:2: rule__Spec__Group_4__0__Impl rule__Spec__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Spec__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group_4__1();

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
    // $ANTLR end "rule__Spec__Group_4__0"


    // $ANTLR start "rule__Spec__Group_4__0__Impl"
    // InternalGolang.g:823:1: rule__Spec__Group_4__0__Impl : ( RULE_ID ) ;
    public final void rule__Spec__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:827:1: ( ( RULE_ID ) )
            // InternalGolang.g:828:1: ( RULE_ID )
            {
            // InternalGolang.g:828:1: ( RULE_ID )
            // InternalGolang.g:829:2: RULE_ID
            {
             before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_4__0__Impl"


    // $ANTLR start "rule__Spec__Group_4__1"
    // InternalGolang.g:838:1: rule__Spec__Group_4__1 : rule__Spec__Group_4__1__Impl rule__Spec__Group_4__2 ;
    public final void rule__Spec__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:842:1: ( rule__Spec__Group_4__1__Impl rule__Spec__Group_4__2 )
            // InternalGolang.g:843:2: rule__Spec__Group_4__1__Impl rule__Spec__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__Spec__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group_4__2();

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
    // $ANTLR end "rule__Spec__Group_4__1"


    // $ANTLR start "rule__Spec__Group_4__1__Impl"
    // InternalGolang.g:850:1: rule__Spec__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Spec__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:854:1: ( ( '=' ) )
            // InternalGolang.g:855:1: ( '=' )
            {
            // InternalGolang.g:855:1: ( '=' )
            // InternalGolang.g:856:2: '='
            {
             before(grammarAccess.getSpecAccess().getEqualsSignKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_4__1__Impl"


    // $ANTLR start "rule__Spec__Group_4__2"
    // InternalGolang.g:865:1: rule__Spec__Group_4__2 : rule__Spec__Group_4__2__Impl ;
    public final void rule__Spec__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:869:1: ( rule__Spec__Group_4__2__Impl )
            // InternalGolang.g:870:2: rule__Spec__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spec__Group_4__2__Impl();

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
    // $ANTLR end "rule__Spec__Group_4__2"


    // $ANTLR start "rule__Spec__Group_4__2__Impl"
    // InternalGolang.g:876:1: rule__Spec__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__Spec__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:880:1: ( ( RULE_INT ) )
            // InternalGolang.g:881:1: ( RULE_INT )
            {
            // InternalGolang.g:881:1: ( RULE_INT )
            // InternalGolang.g:882:2: RULE_INT
            {
             before(grammarAccess.getSpecAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_4__2__Impl"


    // $ANTLR start "rule__Spec__Group_5__0"
    // InternalGolang.g:892:1: rule__Spec__Group_5__0 : rule__Spec__Group_5__0__Impl rule__Spec__Group_5__1 ;
    public final void rule__Spec__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:896:1: ( rule__Spec__Group_5__0__Impl rule__Spec__Group_5__1 )
            // InternalGolang.g:897:2: rule__Spec__Group_5__0__Impl rule__Spec__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Spec__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group_5__1();

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
    // $ANTLR end "rule__Spec__Group_5__0"


    // $ANTLR start "rule__Spec__Group_5__0__Impl"
    // InternalGolang.g:904:1: rule__Spec__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Spec__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:908:1: ( ( ',' ) )
            // InternalGolang.g:909:1: ( ',' )
            {
            // InternalGolang.g:909:1: ( ',' )
            // InternalGolang.g:910:2: ','
            {
             before(grammarAccess.getSpecAccess().getCommaKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_5__0__Impl"


    // $ANTLR start "rule__Spec__Group_5__1"
    // InternalGolang.g:919:1: rule__Spec__Group_5__1 : rule__Spec__Group_5__1__Impl rule__Spec__Group_5__2 ;
    public final void rule__Spec__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:923:1: ( rule__Spec__Group_5__1__Impl rule__Spec__Group_5__2 )
            // InternalGolang.g:924:2: rule__Spec__Group_5__1__Impl rule__Spec__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Spec__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group_5__2();

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
    // $ANTLR end "rule__Spec__Group_5__1"


    // $ANTLR start "rule__Spec__Group_5__1__Impl"
    // InternalGolang.g:931:1: rule__Spec__Group_5__1__Impl : ( RULE_ID ) ;
    public final void rule__Spec__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:935:1: ( ( RULE_ID ) )
            // InternalGolang.g:936:1: ( RULE_ID )
            {
            // InternalGolang.g:936:1: ( RULE_ID )
            // InternalGolang.g:937:2: RULE_ID
            {
             before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_5_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_5__1__Impl"


    // $ANTLR start "rule__Spec__Group_5__2"
    // InternalGolang.g:946:1: rule__Spec__Group_5__2 : rule__Spec__Group_5__2__Impl rule__Spec__Group_5__3 ;
    public final void rule__Spec__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:950:1: ( rule__Spec__Group_5__2__Impl rule__Spec__Group_5__3 )
            // InternalGolang.g:951:2: rule__Spec__Group_5__2__Impl rule__Spec__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__Spec__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group_5__3();

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
    // $ANTLR end "rule__Spec__Group_5__2"


    // $ANTLR start "rule__Spec__Group_5__2__Impl"
    // InternalGolang.g:958:1: rule__Spec__Group_5__2__Impl : ( ',' ) ;
    public final void rule__Spec__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:962:1: ( ( ',' ) )
            // InternalGolang.g:963:1: ( ',' )
            {
            // InternalGolang.g:963:1: ( ',' )
            // InternalGolang.g:964:2: ','
            {
             before(grammarAccess.getSpecAccess().getCommaKeyword_5_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getCommaKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_5__2__Impl"


    // $ANTLR start "rule__Spec__Group_5__3"
    // InternalGolang.g:973:1: rule__Spec__Group_5__3 : rule__Spec__Group_5__3__Impl ;
    public final void rule__Spec__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:977:1: ( rule__Spec__Group_5__3__Impl )
            // InternalGolang.g:978:2: rule__Spec__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spec__Group_5__3__Impl();

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
    // $ANTLR end "rule__Spec__Group_5__3"


    // $ANTLR start "rule__Spec__Group_5__3__Impl"
    // InternalGolang.g:984:1: rule__Spec__Group_5__3__Impl : ( RULE_ID ) ;
    public final void rule__Spec__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:988:1: ( ( RULE_ID ) )
            // InternalGolang.g:989:1: ( RULE_ID )
            {
            // InternalGolang.g:989:1: ( RULE_ID )
            // InternalGolang.g:990:2: RULE_ID
            {
             before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_5_3()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group_5__3__Impl"


    // $ANTLR start "rule__Expression__Group_0__0"
    // InternalGolang.g:1000:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1004:1: ( rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 )
            // InternalGolang.g:1005:2: rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1();

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
    // $ANTLR end "rule__Expression__Group_0__0"


    // $ANTLR start "rule__Expression__Group_0__0__Impl"
    // InternalGolang.g:1012:1: rule__Expression__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1016:1: ( ( RULE_ID ) )
            // InternalGolang.g:1017:1: ( RULE_ID )
            {
            // InternalGolang.g:1017:1: ( RULE_ID )
            // InternalGolang.g:1018:2: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_0__1"
    // InternalGolang.g:1027:1: rule__Expression__Group_0__1 : rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2 ;
    public final void rule__Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1031:1: ( rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2 )
            // InternalGolang.g:1032:2: rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2
            {
            pushFollow(FOLLOW_12);
            rule__Expression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__2();

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
    // $ANTLR end "rule__Expression__Group_0__1"


    // $ANTLR start "rule__Expression__Group_0__1__Impl"
    // InternalGolang.g:1039:1: rule__Expression__Group_0__1__Impl : ( '(' ) ;
    public final void rule__Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1043:1: ( ( '(' ) )
            // InternalGolang.g:1044:1: ( '(' )
            {
            // InternalGolang.g:1044:1: ( '(' )
            // InternalGolang.g:1045:2: '('
            {
             before(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_0__2"
    // InternalGolang.g:1054:1: rule__Expression__Group_0__2 : rule__Expression__Group_0__2__Impl rule__Expression__Group_0__3 ;
    public final void rule__Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1058:1: ( rule__Expression__Group_0__2__Impl rule__Expression__Group_0__3 )
            // InternalGolang.g:1059:2: rule__Expression__Group_0__2__Impl rule__Expression__Group_0__3
            {
            pushFollow(FOLLOW_10);
            rule__Expression__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__3();

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
    // $ANTLR end "rule__Expression__Group_0__2"


    // $ANTLR start "rule__Expression__Group_0__2__Impl"
    // InternalGolang.g:1066:1: rule__Expression__Group_0__2__Impl : ( ruleSign ) ;
    public final void rule__Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1070:1: ( ( ruleSign ) )
            // InternalGolang.g:1071:1: ( ruleSign )
            {
            // InternalGolang.g:1071:1: ( ruleSign )
            // InternalGolang.g:1072:2: ruleSign
            {
             before(grammarAccess.getExpressionAccess().getSignParserRuleCall_0_2()); 
            pushFollow(FOLLOW_2);
            ruleSign();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getSignParserRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__2__Impl"


    // $ANTLR start "rule__Expression__Group_0__3"
    // InternalGolang.g:1081:1: rule__Expression__Group_0__3 : rule__Expression__Group_0__3__Impl rule__Expression__Group_0__4 ;
    public final void rule__Expression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1085:1: ( rule__Expression__Group_0__3__Impl rule__Expression__Group_0__4 )
            // InternalGolang.g:1086:2: rule__Expression__Group_0__3__Impl rule__Expression__Group_0__4
            {
            pushFollow(FOLLOW_6);
            rule__Expression__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__4();

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
    // $ANTLR end "rule__Expression__Group_0__3"


    // $ANTLR start "rule__Expression__Group_0__3__Impl"
    // InternalGolang.g:1093:1: rule__Expression__Group_0__3__Impl : ( RULE_INT ) ;
    public final void rule__Expression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1097:1: ( ( RULE_INT ) )
            // InternalGolang.g:1098:1: ( RULE_INT )
            {
            // InternalGolang.g:1098:1: ( RULE_INT )
            // InternalGolang.g:1099:2: RULE_INT
            {
             before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__3__Impl"


    // $ANTLR start "rule__Expression__Group_0__4"
    // InternalGolang.g:1108:1: rule__Expression__Group_0__4 : rule__Expression__Group_0__4__Impl ;
    public final void rule__Expression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1112:1: ( rule__Expression__Group_0__4__Impl )
            // InternalGolang.g:1113:2: rule__Expression__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__4__Impl();

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
    // $ANTLR end "rule__Expression__Group_0__4"


    // $ANTLR start "rule__Expression__Group_0__4__Impl"
    // InternalGolang.g:1119:1: rule__Expression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__Expression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1123:1: ( ( ')' ) )
            // InternalGolang.g:1124:1: ( ')' )
            {
            // InternalGolang.g:1124:1: ( ')' )
            // InternalGolang.g:1125:2: ')'
            {
             before(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_0_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__4__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalGolang.g:1135:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1139:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalGolang.g:1140:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalGolang.g:1147:1: rule__Expression__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1151:1: ( ( RULE_ID ) )
            // InternalGolang.g:1152:1: ( RULE_ID )
            {
            // InternalGolang.g:1152:1: ( RULE_ID )
            // InternalGolang.g:1153:2: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalGolang.g:1162:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1166:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalGolang.g:1167:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalGolang.g:1174:1: rule__Expression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1178:1: ( ( '.' ) )
            // InternalGolang.g:1179:1: ( '.' )
            {
            // InternalGolang.g:1179:1: ( '.' )
            // InternalGolang.g:1180:2: '.'
            {
             before(grammarAccess.getExpressionAccess().getFullStopKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // InternalGolang.g:1189:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl rule__Expression__Group_1__3 ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1193:1: ( rule__Expression__Group_1__2__Impl rule__Expression__Group_1__3 )
            // InternalGolang.g:1194:2: rule__Expression__Group_1__2__Impl rule__Expression__Group_1__3
            {
            pushFollow(FOLLOW_5);
            rule__Expression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__3();

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
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // InternalGolang.g:1201:1: rule__Expression__Group_1__2__Impl : ( RULE_ID ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1205:1: ( ( RULE_ID ) )
            // InternalGolang.g:1206:1: ( RULE_ID )
            {
            // InternalGolang.g:1206:1: ( RULE_ID )
            // InternalGolang.g:1207:2: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__Expression__Group_1__3"
    // InternalGolang.g:1216:1: rule__Expression__Group_1__3 : rule__Expression__Group_1__3__Impl rule__Expression__Group_1__4 ;
    public final void rule__Expression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1220:1: ( rule__Expression__Group_1__3__Impl rule__Expression__Group_1__4 )
            // InternalGolang.g:1221:2: rule__Expression__Group_1__3__Impl rule__Expression__Group_1__4
            {
            pushFollow(FOLLOW_12);
            rule__Expression__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__4();

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
    // $ANTLR end "rule__Expression__Group_1__3"


    // $ANTLR start "rule__Expression__Group_1__3__Impl"
    // InternalGolang.g:1228:1: rule__Expression__Group_1__3__Impl : ( '(' ) ;
    public final void rule__Expression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1232:1: ( ( '(' ) )
            // InternalGolang.g:1233:1: ( '(' )
            {
            // InternalGolang.g:1233:1: ( '(' )
            // InternalGolang.g:1234:2: '('
            {
             before(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__3__Impl"


    // $ANTLR start "rule__Expression__Group_1__4"
    // InternalGolang.g:1243:1: rule__Expression__Group_1__4 : rule__Expression__Group_1__4__Impl rule__Expression__Group_1__5 ;
    public final void rule__Expression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1247:1: ( rule__Expression__Group_1__4__Impl rule__Expression__Group_1__5 )
            // InternalGolang.g:1248:2: rule__Expression__Group_1__4__Impl rule__Expression__Group_1__5
            {
            pushFollow(FOLLOW_10);
            rule__Expression__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__5();

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
    // $ANTLR end "rule__Expression__Group_1__4"


    // $ANTLR start "rule__Expression__Group_1__4__Impl"
    // InternalGolang.g:1255:1: rule__Expression__Group_1__4__Impl : ( ruleSign ) ;
    public final void rule__Expression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1259:1: ( ( ruleSign ) )
            // InternalGolang.g:1260:1: ( ruleSign )
            {
            // InternalGolang.g:1260:1: ( ruleSign )
            // InternalGolang.g:1261:2: ruleSign
            {
             before(grammarAccess.getExpressionAccess().getSignParserRuleCall_1_4()); 
            pushFollow(FOLLOW_2);
            ruleSign();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getSignParserRuleCall_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__4__Impl"


    // $ANTLR start "rule__Expression__Group_1__5"
    // InternalGolang.g:1270:1: rule__Expression__Group_1__5 : rule__Expression__Group_1__5__Impl rule__Expression__Group_1__6 ;
    public final void rule__Expression__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1274:1: ( rule__Expression__Group_1__5__Impl rule__Expression__Group_1__6 )
            // InternalGolang.g:1275:2: rule__Expression__Group_1__5__Impl rule__Expression__Group_1__6
            {
            pushFollow(FOLLOW_6);
            rule__Expression__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__6();

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
    // $ANTLR end "rule__Expression__Group_1__5"


    // $ANTLR start "rule__Expression__Group_1__5__Impl"
    // InternalGolang.g:1282:1: rule__Expression__Group_1__5__Impl : ( RULE_INT ) ;
    public final void rule__Expression__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1286:1: ( ( RULE_INT ) )
            // InternalGolang.g:1287:1: ( RULE_INT )
            {
            // InternalGolang.g:1287:1: ( RULE_INT )
            // InternalGolang.g:1288:2: RULE_INT
            {
             before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_1_5()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__5__Impl"


    // $ANTLR start "rule__Expression__Group_1__6"
    // InternalGolang.g:1297:1: rule__Expression__Group_1__6 : rule__Expression__Group_1__6__Impl ;
    public final void rule__Expression__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1301:1: ( rule__Expression__Group_1__6__Impl )
            // InternalGolang.g:1302:2: rule__Expression__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__6__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__6"


    // $ANTLR start "rule__Expression__Group_1__6__Impl"
    // InternalGolang.g:1308:1: rule__Expression__Group_1__6__Impl : ( ')' ) ;
    public final void rule__Expression__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1312:1: ( ( ')' ) )
            // InternalGolang.g:1313:1: ( ')' )
            {
            // InternalGolang.g:1313:1: ( ')' )
            // InternalGolang.g:1314:2: ')'
            {
             before(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__6__Impl"


    // $ANTLR start "rule__Expression__Group_2__0"
    // InternalGolang.g:1324:1: rule__Expression__Group_2__0 : rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 ;
    public final void rule__Expression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1328:1: ( rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 )
            // InternalGolang.g:1329:2: rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Expression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__1();

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
    // $ANTLR end "rule__Expression__Group_2__0"


    // $ANTLR start "rule__Expression__Group_2__0__Impl"
    // InternalGolang.g:1336:1: rule__Expression__Group_2__0__Impl : ( RULE_ID ) ;
    public final void rule__Expression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1340:1: ( ( RULE_ID ) )
            // InternalGolang.g:1341:1: ( RULE_ID )
            {
            // InternalGolang.g:1341:1: ( RULE_ID )
            // InternalGolang.g:1342:2: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__0__Impl"


    // $ANTLR start "rule__Expression__Group_2__1"
    // InternalGolang.g:1351:1: rule__Expression__Group_2__1 : rule__Expression__Group_2__1__Impl rule__Expression__Group_2__2 ;
    public final void rule__Expression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1355:1: ( rule__Expression__Group_2__1__Impl rule__Expression__Group_2__2 )
            // InternalGolang.g:1356:2: rule__Expression__Group_2__1__Impl rule__Expression__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__2();

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
    // $ANTLR end "rule__Expression__Group_2__1"


    // $ANTLR start "rule__Expression__Group_2__1__Impl"
    // InternalGolang.g:1363:1: rule__Expression__Group_2__1__Impl : ( '[' ) ;
    public final void rule__Expression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1367:1: ( ( '[' ) )
            // InternalGolang.g:1368:1: ( '[' )
            {
            // InternalGolang.g:1368:1: ( '[' )
            // InternalGolang.g:1369:2: '['
            {
             before(grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__1__Impl"


    // $ANTLR start "rule__Expression__Group_2__2"
    // InternalGolang.g:1378:1: rule__Expression__Group_2__2 : rule__Expression__Group_2__2__Impl rule__Expression__Group_2__3 ;
    public final void rule__Expression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1382:1: ( rule__Expression__Group_2__2__Impl rule__Expression__Group_2__3 )
            // InternalGolang.g:1383:2: rule__Expression__Group_2__2__Impl rule__Expression__Group_2__3
            {
            pushFollow(FOLLOW_15);
            rule__Expression__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__3();

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
    // $ANTLR end "rule__Expression__Group_2__2"


    // $ANTLR start "rule__Expression__Group_2__2__Impl"
    // InternalGolang.g:1390:1: rule__Expression__Group_2__2__Impl : ( RULE_ID ) ;
    public final void rule__Expression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1394:1: ( ( RULE_ID ) )
            // InternalGolang.g:1395:1: ( RULE_ID )
            {
            // InternalGolang.g:1395:1: ( RULE_ID )
            // InternalGolang.g:1396:2: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_2_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__2__Impl"


    // $ANTLR start "rule__Expression__Group_2__3"
    // InternalGolang.g:1405:1: rule__Expression__Group_2__3 : rule__Expression__Group_2__3__Impl ;
    public final void rule__Expression__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1409:1: ( rule__Expression__Group_2__3__Impl )
            // InternalGolang.g:1410:2: rule__Expression__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__3__Impl();

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
    // $ANTLR end "rule__Expression__Group_2__3"


    // $ANTLR start "rule__Expression__Group_2__3__Impl"
    // InternalGolang.g:1416:1: rule__Expression__Group_2__3__Impl : ( ']' ) ;
    public final void rule__Expression__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1420:1: ( ( ']' ) )
            // InternalGolang.g:1421:1: ( ']' )
            {
            // InternalGolang.g:1421:1: ( ']' )
            // InternalGolang.g:1422:2: ']'
            {
             before(grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__3__Impl"


    // $ANTLR start "rule__Expression__Group_3__0"
    // InternalGolang.g:1432:1: rule__Expression__Group_3__0 : rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 ;
    public final void rule__Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1436:1: ( rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 )
            // InternalGolang.g:1437:2: rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Expression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__1();

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
    // $ANTLR end "rule__Expression__Group_3__0"


    // $ANTLR start "rule__Expression__Group_3__0__Impl"
    // InternalGolang.g:1444:1: rule__Expression__Group_3__0__Impl : ( ruleSign ) ;
    public final void rule__Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1448:1: ( ( ruleSign ) )
            // InternalGolang.g:1449:1: ( ruleSign )
            {
            // InternalGolang.g:1449:1: ( ruleSign )
            // InternalGolang.g:1450:2: ruleSign
            {
             before(grammarAccess.getExpressionAccess().getSignParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSign();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getSignParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__0__Impl"


    // $ANTLR start "rule__Expression__Group_3__1"
    // InternalGolang.g:1459:1: rule__Expression__Group_3__1 : rule__Expression__Group_3__1__Impl rule__Expression__Group_3__2 ;
    public final void rule__Expression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1463:1: ( rule__Expression__Group_3__1__Impl rule__Expression__Group_3__2 )
            // InternalGolang.g:1464:2: rule__Expression__Group_3__1__Impl rule__Expression__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Expression__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__2();

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
    // $ANTLR end "rule__Expression__Group_3__1"


    // $ANTLR start "rule__Expression__Group_3__1__Impl"
    // InternalGolang.g:1471:1: rule__Expression__Group_3__1__Impl : ( RULE_INT ) ;
    public final void rule__Expression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1475:1: ( ( RULE_INT ) )
            // InternalGolang.g:1476:1: ( RULE_INT )
            {
            // InternalGolang.g:1476:1: ( RULE_INT )
            // InternalGolang.g:1477:2: RULE_INT
            {
             before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_3_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__1__Impl"


    // $ANTLR start "rule__Expression__Group_3__2"
    // InternalGolang.g:1486:1: rule__Expression__Group_3__2 : rule__Expression__Group_3__2__Impl rule__Expression__Group_3__3 ;
    public final void rule__Expression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1490:1: ( rule__Expression__Group_3__2__Impl rule__Expression__Group_3__3 )
            // InternalGolang.g:1491:2: rule__Expression__Group_3__2__Impl rule__Expression__Group_3__3
            {
            pushFollow(FOLLOW_12);
            rule__Expression__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__3();

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
    // $ANTLR end "rule__Expression__Group_3__2"


    // $ANTLR start "rule__Expression__Group_3__2__Impl"
    // InternalGolang.g:1498:1: rule__Expression__Group_3__2__Impl : ( ',' ) ;
    public final void rule__Expression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1502:1: ( ( ',' ) )
            // InternalGolang.g:1503:1: ( ',' )
            {
            // InternalGolang.g:1503:1: ( ',' )
            // InternalGolang.g:1504:2: ','
            {
             before(grammarAccess.getExpressionAccess().getCommaKeyword_3_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getCommaKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__2__Impl"


    // $ANTLR start "rule__Expression__Group_3__3"
    // InternalGolang.g:1513:1: rule__Expression__Group_3__3 : rule__Expression__Group_3__3__Impl rule__Expression__Group_3__4 ;
    public final void rule__Expression__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1517:1: ( rule__Expression__Group_3__3__Impl rule__Expression__Group_3__4 )
            // InternalGolang.g:1518:2: rule__Expression__Group_3__3__Impl rule__Expression__Group_3__4
            {
            pushFollow(FOLLOW_10);
            rule__Expression__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__4();

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
    // $ANTLR end "rule__Expression__Group_3__3"


    // $ANTLR start "rule__Expression__Group_3__3__Impl"
    // InternalGolang.g:1525:1: rule__Expression__Group_3__3__Impl : ( ruleSign ) ;
    public final void rule__Expression__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1529:1: ( ( ruleSign ) )
            // InternalGolang.g:1530:1: ( ruleSign )
            {
            // InternalGolang.g:1530:1: ( ruleSign )
            // InternalGolang.g:1531:2: ruleSign
            {
             before(grammarAccess.getExpressionAccess().getSignParserRuleCall_3_3()); 
            pushFollow(FOLLOW_2);
            ruleSign();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getSignParserRuleCall_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__3__Impl"


    // $ANTLR start "rule__Expression__Group_3__4"
    // InternalGolang.g:1540:1: rule__Expression__Group_3__4 : rule__Expression__Group_3__4__Impl ;
    public final void rule__Expression__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1544:1: ( rule__Expression__Group_3__4__Impl )
            // InternalGolang.g:1545:2: rule__Expression__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__4__Impl();

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
    // $ANTLR end "rule__Expression__Group_3__4"


    // $ANTLR start "rule__Expression__Group_3__4__Impl"
    // InternalGolang.g:1551:1: rule__Expression__Group_3__4__Impl : ( RULE_INT ) ;
    public final void rule__Expression__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1555:1: ( ( RULE_INT ) )
            // InternalGolang.g:1556:1: ( RULE_INT )
            {
            // InternalGolang.g:1556:1: ( RULE_INT )
            // InternalGolang.g:1557:2: RULE_INT
            {
             before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_3_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__4__Impl"


    // $ANTLR start "rule__Expression__Group_4__0"
    // InternalGolang.g:1567:1: rule__Expression__Group_4__0 : rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1 ;
    public final void rule__Expression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1571:1: ( rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1 )
            // InternalGolang.g:1572:2: rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Expression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_4__1();

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
    // $ANTLR end "rule__Expression__Group_4__0"


    // $ANTLR start "rule__Expression__Group_4__0__Impl"
    // InternalGolang.g:1579:1: rule__Expression__Group_4__0__Impl : ( ruleSign ) ;
    public final void rule__Expression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1583:1: ( ( ruleSign ) )
            // InternalGolang.g:1584:1: ( ruleSign )
            {
            // InternalGolang.g:1584:1: ( ruleSign )
            // InternalGolang.g:1585:2: ruleSign
            {
             before(grammarAccess.getExpressionAccess().getSignParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSign();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getSignParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__0__Impl"


    // $ANTLR start "rule__Expression__Group_4__1"
    // InternalGolang.g:1594:1: rule__Expression__Group_4__1 : rule__Expression__Group_4__1__Impl ;
    public final void rule__Expression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1598:1: ( rule__Expression__Group_4__1__Impl )
            // InternalGolang.g:1599:2: rule__Expression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_4__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_4__1"


    // $ANTLR start "rule__Expression__Group_4__1__Impl"
    // InternalGolang.g:1605:1: rule__Expression__Group_4__1__Impl : ( RULE_INT ) ;
    public final void rule__Expression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1609:1: ( ( RULE_INT ) )
            // InternalGolang.g:1610:1: ( RULE_INT )
            {
            // InternalGolang.g:1610:1: ( RULE_INT )
            // InternalGolang.g:1611:2: RULE_INT
            {
             before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_4_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__1__Impl"


    // $ANTLR start "rule__VarDecl__SpecsAssignment_0_1"
    // InternalGolang.g:1621:1: rule__VarDecl__SpecsAssignment_0_1 : ( ruleSpec ) ;
    public final void rule__VarDecl__SpecsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1625:1: ( ( ruleSpec ) )
            // InternalGolang.g:1626:2: ( ruleSpec )
            {
            // InternalGolang.g:1626:2: ( ruleSpec )
            // InternalGolang.g:1627:3: ruleSpec
            {
             before(grammarAccess.getVarDeclAccess().getSpecsSpecParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpec();

            state._fsp--;

             after(grammarAccess.getVarDeclAccess().getSpecsSpecParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__SpecsAssignment_0_1"


    // $ANTLR start "rule__VarDecl__SpecsAssignment_1_2"
    // InternalGolang.g:1636:1: rule__VarDecl__SpecsAssignment_1_2 : ( ruleSpec ) ;
    public final void rule__VarDecl__SpecsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1640:1: ( ( ruleSpec ) )
            // InternalGolang.g:1641:2: ( ruleSpec )
            {
            // InternalGolang.g:1641:2: ( ruleSpec )
            // InternalGolang.g:1642:3: ruleSpec
            {
             before(grammarAccess.getVarDeclAccess().getSpecsSpecParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSpec();

            state._fsp--;

             after(grammarAccess.getVarDeclAccess().getSpecsSpecParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__SpecsAssignment_1_2"


    // $ANTLR start "rule__Spec__NameAssignment_0"
    // InternalGolang.g:1651:1: rule__Spec__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Spec__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1655:1: ( ( RULE_ID ) )
            // InternalGolang.g:1656:2: ( RULE_ID )
            {
            // InternalGolang.g:1656:2: ( RULE_ID )
            // InternalGolang.g:1657:3: RULE_ID
            {
             before(grammarAccess.getSpecAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__NameAssignment_0"


    // $ANTLR start "rule__Spec__ExpressionsAssignment_1_4"
    // InternalGolang.g:1666:1: rule__Spec__ExpressionsAssignment_1_4 : ( ruleExpression ) ;
    public final void rule__Spec__ExpressionsAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1670:1: ( ( ruleExpression ) )
            // InternalGolang.g:1671:2: ( ruleExpression )
            {
            // InternalGolang.g:1671:2: ( ruleExpression )
            // InternalGolang.g:1672:3: ruleExpression
            {
             before(grammarAccess.getSpecAccess().getExpressionsExpressionParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSpecAccess().getExpressionsExpressionParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__ExpressionsAssignment_1_4"


    // $ANTLR start "rule__Spec__ExpressionsAssignment_2_3"
    // InternalGolang.g:1681:1: rule__Spec__ExpressionsAssignment_2_3 : ( ruleExpression ) ;
    public final void rule__Spec__ExpressionsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1685:1: ( ( ruleExpression ) )
            // InternalGolang.g:1686:2: ( ruleExpression )
            {
            // InternalGolang.g:1686:2: ( ruleExpression )
            // InternalGolang.g:1687:3: ruleExpression
            {
             before(grammarAccess.getSpecAccess().getExpressionsExpressionParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSpecAccess().getExpressionsExpressionParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__ExpressionsAssignment_2_3"


    // $ANTLR start "rule__Spec__ExpressionsAssignment_3_3"
    // InternalGolang.g:1696:1: rule__Spec__ExpressionsAssignment_3_3 : ( ruleExpression ) ;
    public final void rule__Spec__ExpressionsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGolang.g:1700:1: ( ( ruleExpression ) )
            // InternalGolang.g:1701:2: ( ruleExpression )
            {
            // InternalGolang.g:1701:2: ( ruleExpression )
            // InternalGolang.g:1702:3: ruleExpression
            {
             before(grammarAccess.getSpecAccess().getExpressionsExpressionParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSpecAccess().getExpressionsExpressionParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__ExpressionsAssignment_3_3"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\uffff\1\3\2\uffff\1\3\10\uffff";
    static final String dfa_3s = "\3\5\1\uffff\1\5\1\uffff\1\5\1\4\5\uffff";
    static final String dfa_4s = "\1\20\1\21\1\5\1\uffff\1\21\1\uffff\1\21\1\14\5\uffff";
    static final String dfa_5s = "\3\uffff\1\1\1\uffff\1\5\2\uffff\1\2\1\6\1\3\1\4\1\1";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\12\uffff\1\2",
            "\1\4\11\uffff\2\3\1\5",
            "\1\6",
            "",
            "\1\3\11\uffff\2\3\1\7",
            "",
            "\1\10\12\uffff\1\11\1\12",
            "\1\14\1\13\5\uffff\2\13",
            "",
            "",
            "",
            "",
            ""
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
            return "173:1: rule__Spec__Alternatives : ( ( ( rule__Spec__NameAssignment_0 ) ) | ( ( rule__Spec__Group_1__0 ) ) | ( ( rule__Spec__Group_2__0 ) ) | ( ( rule__Spec__Group_3__0 ) ) | ( ( rule__Spec__Group_4__0 ) ) | ( ( rule__Spec__Group_5__0 ) ) );";
        }
    }
    static final String dfa_8s = "\14\uffff";
    static final String dfa_9s = "\10\uffff\1\11\3\uffff";
    static final String dfa_10s = "\1\4\1\16\2\4\4\uffff\1\5\1\uffff\1\5\1\uffff";
    static final String dfa_11s = "\1\14\1\23\2\4\4\uffff\1\20\1\uffff\1\14\1\uffff";
    static final String dfa_12s = "\4\uffff\1\6\1\3\1\2\1\1\1\uffff\1\5\1\uffff\1\4";
    static final String dfa_13s = "\14\uffff}>";
    static final String[] dfa_14s = {
            "\1\4\1\1\5\uffff\1\2\1\3",
            "\1\7\3\uffff\1\6\1\5",
            "\1\10",
            "\1\10",
            "",
            "",
            "",
            "",
            "\1\11\11\uffff\1\11\1\12",
            "",
            "\1\11\5\uffff\2\13",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "218:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ( rule__Expression__Group_2__0 ) ) | ( ( rule__Expression__Group_3__0 ) ) | ( ( rule__Expression__Group_4__0 ) ) | ( RULE_INT ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});

}