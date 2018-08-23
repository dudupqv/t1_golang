package org.xtext.example.go.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.go.services.GolangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGolangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'('", "')'", "','", "'='", "'.'", "'['", "']'", "'-'", "'+'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
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

        public InternalGolangParser(TokenStream input, GolangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "VarDecl";
       	}

       	@Override
       	protected GolangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVarDecl"
    // InternalGolang.g:64:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalGolang.g:64:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalGolang.g:65:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalGolang.g:71:1: ruleVarDecl returns [EObject current=null] : ( (otherlv_0= 'var' ( (lv_specs_1_0= ruleSpec ) )+ ) | (otherlv_2= 'var' otherlv_3= '(' ( (lv_specs_4_0= ruleSpec ) )+ otherlv_5= ')' ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_specs_1_0 = null;

        EObject lv_specs_4_0 = null;



        	enterRule();

        try {
            // InternalGolang.g:77:2: ( ( (otherlv_0= 'var' ( (lv_specs_1_0= ruleSpec ) )+ ) | (otherlv_2= 'var' otherlv_3= '(' ( (lv_specs_4_0= ruleSpec ) )+ otherlv_5= ')' ) ) )
            // InternalGolang.g:78:2: ( (otherlv_0= 'var' ( (lv_specs_1_0= ruleSpec ) )+ ) | (otherlv_2= 'var' otherlv_3= '(' ( (lv_specs_4_0= ruleSpec ) )+ otherlv_5= ')' ) )
            {
            // InternalGolang.g:78:2: ( (otherlv_0= 'var' ( (lv_specs_1_0= ruleSpec ) )+ ) | (otherlv_2= 'var' otherlv_3= '(' ( (lv_specs_4_0= ruleSpec ) )+ otherlv_5= ')' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID||LA3_1==14) ) {
                    alt3=1;
                }
                else if ( (LA3_1==12) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGolang.g:79:3: (otherlv_0= 'var' ( (lv_specs_1_0= ruleSpec ) )+ )
                    {
                    // InternalGolang.g:79:3: (otherlv_0= 'var' ( (lv_specs_1_0= ruleSpec ) )+ )
                    // InternalGolang.g:80:4: otherlv_0= 'var' ( (lv_specs_1_0= ruleSpec ) )+
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getVarDeclAccess().getVarKeyword_0_0());
                    			
                    // InternalGolang.g:84:4: ( (lv_specs_1_0= ruleSpec ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID||LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGolang.g:85:5: (lv_specs_1_0= ruleSpec )
                    	    {
                    	    // InternalGolang.g:85:5: (lv_specs_1_0= ruleSpec )
                    	    // InternalGolang.g:86:6: lv_specs_1_0= ruleSpec
                    	    {

                    	    						newCompositeNode(grammarAccess.getVarDeclAccess().getSpecsSpecParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_specs_1_0=ruleSpec();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getVarDeclRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"specs",
                    	    							lv_specs_1_0,
                    	    							"org.xtext.example.go.Golang.Spec");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalGolang.g:105:3: (otherlv_2= 'var' otherlv_3= '(' ( (lv_specs_4_0= ruleSpec ) )+ otherlv_5= ')' )
                    {
                    // InternalGolang.g:105:3: (otherlv_2= 'var' otherlv_3= '(' ( (lv_specs_4_0= ruleSpec ) )+ otherlv_5= ')' )
                    // InternalGolang.g:106:4: otherlv_2= 'var' otherlv_3= '(' ( (lv_specs_4_0= ruleSpec ) )+ otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getVarDeclAccess().getVarKeyword_1_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getVarDeclAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalGolang.g:114:4: ( (lv_specs_4_0= ruleSpec ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID||LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalGolang.g:115:5: (lv_specs_4_0= ruleSpec )
                    	    {
                    	    // InternalGolang.g:115:5: (lv_specs_4_0= ruleSpec )
                    	    // InternalGolang.g:116:6: lv_specs_4_0= ruleSpec
                    	    {

                    	    						newCompositeNode(grammarAccess.getVarDeclAccess().getSpecsSpecParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_specs_4_0=ruleSpec();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getVarDeclRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"specs",
                    	    							lv_specs_4_0,
                    	    							"org.xtext.example.go.Golang.Spec");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    otherlv_5=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getVarDeclAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleSpec"
    // InternalGolang.g:142:1: entryRuleSpec returns [EObject current=null] : iv_ruleSpec= ruleSpec EOF ;
    public final EObject entryRuleSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpec = null;


        try {
            // InternalGolang.g:142:45: (iv_ruleSpec= ruleSpec EOF )
            // InternalGolang.g:143:2: iv_ruleSpec= ruleSpec EOF
            {
             newCompositeNode(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpec=ruleSpec();

            state._fsp--;

             current =iv_ruleSpec; 
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
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // InternalGolang.g:149:1: ruleSpec returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= ',' this_ID_2= RULE_ID this_ID_3= RULE_ID otherlv_4= '=' ( (lv_expressions_5_0= ruleExpression ) ) ) | (otherlv_6= ',' this_ID_7= RULE_ID otherlv_8= '=' ( (lv_expressions_9_0= ruleExpression ) ) ) | (this_ID_10= RULE_ID this_ID_11= RULE_ID otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) ) | (this_ID_14= RULE_ID otherlv_15= '=' this_INT_16= RULE_INT ) | (otherlv_17= ',' this_ID_18= RULE_ID otherlv_19= ',' this_ID_20= RULE_ID ) ) ;
    public final EObject ruleSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_ID_2=null;
        Token this_ID_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_ID_7=null;
        Token otherlv_8=null;
        Token this_ID_10=null;
        Token this_ID_11=null;
        Token otherlv_12=null;
        Token this_ID_14=null;
        Token otherlv_15=null;
        Token this_INT_16=null;
        Token otherlv_17=null;
        Token this_ID_18=null;
        Token otherlv_19=null;
        Token this_ID_20=null;
        AntlrDatatypeRuleToken lv_expressions_5_0 = null;

        AntlrDatatypeRuleToken lv_expressions_9_0 = null;

        AntlrDatatypeRuleToken lv_expressions_13_0 = null;



        	enterRule();

        try {
            // InternalGolang.g:155:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= ',' this_ID_2= RULE_ID this_ID_3= RULE_ID otherlv_4= '=' ( (lv_expressions_5_0= ruleExpression ) ) ) | (otherlv_6= ',' this_ID_7= RULE_ID otherlv_8= '=' ( (lv_expressions_9_0= ruleExpression ) ) ) | (this_ID_10= RULE_ID this_ID_11= RULE_ID otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) ) | (this_ID_14= RULE_ID otherlv_15= '=' this_INT_16= RULE_INT ) | (otherlv_17= ',' this_ID_18= RULE_ID otherlv_19= ',' this_ID_20= RULE_ID ) ) )
            // InternalGolang.g:156:2: ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= ',' this_ID_2= RULE_ID this_ID_3= RULE_ID otherlv_4= '=' ( (lv_expressions_5_0= ruleExpression ) ) ) | (otherlv_6= ',' this_ID_7= RULE_ID otherlv_8= '=' ( (lv_expressions_9_0= ruleExpression ) ) ) | (this_ID_10= RULE_ID this_ID_11= RULE_ID otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) ) | (this_ID_14= RULE_ID otherlv_15= '=' this_INT_16= RULE_INT ) | (otherlv_17= ',' this_ID_18= RULE_ID otherlv_19= ',' this_ID_20= RULE_ID ) )
            {
            // InternalGolang.g:156:2: ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= ',' this_ID_2= RULE_ID this_ID_3= RULE_ID otherlv_4= '=' ( (lv_expressions_5_0= ruleExpression ) ) ) | (otherlv_6= ',' this_ID_7= RULE_ID otherlv_8= '=' ( (lv_expressions_9_0= ruleExpression ) ) ) | (this_ID_10= RULE_ID this_ID_11= RULE_ID otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) ) | (this_ID_14= RULE_ID otherlv_15= '=' this_INT_16= RULE_INT ) | (otherlv_17= ',' this_ID_18= RULE_ID otherlv_19= ',' this_ID_20= RULE_ID ) )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalGolang.g:157:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalGolang.g:157:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalGolang.g:158:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalGolang.g:158:4: (lv_name_0_0= RULE_ID )
                    // InternalGolang.g:159:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getSpecAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSpecRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGolang.g:176:3: (otherlv_1= ',' this_ID_2= RULE_ID this_ID_3= RULE_ID otherlv_4= '=' ( (lv_expressions_5_0= ruleExpression ) ) )
                    {
                    // InternalGolang.g:176:3: (otherlv_1= ',' this_ID_2= RULE_ID this_ID_3= RULE_ID otherlv_4= '=' ( (lv_expressions_5_0= ruleExpression ) ) )
                    // InternalGolang.g:177:4: otherlv_1= ',' this_ID_2= RULE_ID this_ID_3= RULE_ID otherlv_4= '=' ( (lv_expressions_5_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getSpecAccess().getCommaKeyword_1_0());
                    			
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

                    				newLeafNode(this_ID_2, grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_1());
                    			
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_8); 

                    				newLeafNode(this_ID_3, grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_2());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getSpecAccess().getEqualsSignKeyword_1_3());
                    			
                    // InternalGolang.g:193:4: ( (lv_expressions_5_0= ruleExpression ) )
                    // InternalGolang.g:194:5: (lv_expressions_5_0= ruleExpression )
                    {
                    // InternalGolang.g:194:5: (lv_expressions_5_0= ruleExpression )
                    // InternalGolang.g:195:6: lv_expressions_5_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSpecAccess().getExpressionsExpressionParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressions_5_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpecRule());
                    						}
                    						add(
                    							current,
                    							"expressions",
                    							lv_expressions_5_0,
                    							"org.xtext.example.go.Golang.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGolang.g:214:3: (otherlv_6= ',' this_ID_7= RULE_ID otherlv_8= '=' ( (lv_expressions_9_0= ruleExpression ) ) )
                    {
                    // InternalGolang.g:214:3: (otherlv_6= ',' this_ID_7= RULE_ID otherlv_8= '=' ( (lv_expressions_9_0= ruleExpression ) ) )
                    // InternalGolang.g:215:4: otherlv_6= ',' this_ID_7= RULE_ID otherlv_8= '=' ( (lv_expressions_9_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getSpecAccess().getCommaKeyword_2_0());
                    			
                    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_8); 

                    				newLeafNode(this_ID_7, grammarAccess.getSpecAccess().getIDTerminalRuleCall_2_1());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getSpecAccess().getEqualsSignKeyword_2_2());
                    			
                    // InternalGolang.g:227:4: ( (lv_expressions_9_0= ruleExpression ) )
                    // InternalGolang.g:228:5: (lv_expressions_9_0= ruleExpression )
                    {
                    // InternalGolang.g:228:5: (lv_expressions_9_0= ruleExpression )
                    // InternalGolang.g:229:6: lv_expressions_9_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSpecAccess().getExpressionsExpressionParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressions_9_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpecRule());
                    						}
                    						add(
                    							current,
                    							"expressions",
                    							lv_expressions_9_0,
                    							"org.xtext.example.go.Golang.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGolang.g:248:3: (this_ID_10= RULE_ID this_ID_11= RULE_ID otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) )
                    {
                    // InternalGolang.g:248:3: (this_ID_10= RULE_ID this_ID_11= RULE_ID otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) )
                    // InternalGolang.g:249:4: this_ID_10= RULE_ID this_ID_11= RULE_ID otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) )
                    {
                    this_ID_10=(Token)match(input,RULE_ID,FOLLOW_7); 

                    				newLeafNode(this_ID_10, grammarAccess.getSpecAccess().getIDTerminalRuleCall_3_0());
                    			
                    this_ID_11=(Token)match(input,RULE_ID,FOLLOW_8); 

                    				newLeafNode(this_ID_11, grammarAccess.getSpecAccess().getIDTerminalRuleCall_3_1());
                    			
                    otherlv_12=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getSpecAccess().getEqualsSignKeyword_3_2());
                    			
                    // InternalGolang.g:261:4: ( (lv_expressions_13_0= ruleExpression ) )
                    // InternalGolang.g:262:5: (lv_expressions_13_0= ruleExpression )
                    {
                    // InternalGolang.g:262:5: (lv_expressions_13_0= ruleExpression )
                    // InternalGolang.g:263:6: lv_expressions_13_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSpecAccess().getExpressionsExpressionParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressions_13_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpecRule());
                    						}
                    						add(
                    							current,
                    							"expressions",
                    							lv_expressions_13_0,
                    							"org.xtext.example.go.Golang.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGolang.g:282:3: (this_ID_14= RULE_ID otherlv_15= '=' this_INT_16= RULE_INT )
                    {
                    // InternalGolang.g:282:3: (this_ID_14= RULE_ID otherlv_15= '=' this_INT_16= RULE_INT )
                    // InternalGolang.g:283:4: this_ID_14= RULE_ID otherlv_15= '=' this_INT_16= RULE_INT
                    {
                    this_ID_14=(Token)match(input,RULE_ID,FOLLOW_8); 

                    				newLeafNode(this_ID_14, grammarAccess.getSpecAccess().getIDTerminalRuleCall_4_0());
                    			
                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getSpecAccess().getEqualsSignKeyword_4_1());
                    			
                    this_INT_16=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_16, grammarAccess.getSpecAccess().getINTTerminalRuleCall_4_2());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGolang.g:297:3: (otherlv_17= ',' this_ID_18= RULE_ID otherlv_19= ',' this_ID_20= RULE_ID )
                    {
                    // InternalGolang.g:297:3: (otherlv_17= ',' this_ID_18= RULE_ID otherlv_19= ',' this_ID_20= RULE_ID )
                    // InternalGolang.g:298:4: otherlv_17= ',' this_ID_18= RULE_ID otherlv_19= ',' this_ID_20= RULE_ID
                    {
                    otherlv_17=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getSpecAccess().getCommaKeyword_5_0());
                    			
                    this_ID_18=(Token)match(input,RULE_ID,FOLLOW_11); 

                    				newLeafNode(this_ID_18, grammarAccess.getSpecAccess().getIDTerminalRuleCall_5_1());
                    			
                    otherlv_19=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_19, grammarAccess.getSpecAccess().getCommaKeyword_5_2());
                    			
                    this_ID_20=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				newLeafNode(this_ID_20, grammarAccess.getSpecAccess().getIDTerminalRuleCall_5_3());
                    			

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
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRuleExpression"
    // InternalGolang.g:319:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalGolang.g:319:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalGolang.g:320:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression.getText(); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGolang.g:326:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '(' this_Sign_2= ruleSign this_INT_3= RULE_INT kw= ')' ) | (this_ID_5= RULE_ID kw= '.' this_ID_7= RULE_ID kw= '(' this_Sign_9= ruleSign this_INT_10= RULE_INT kw= ')' ) | (this_ID_12= RULE_ID kw= '[' this_ID_14= RULE_ID kw= ']' ) | (this_Sign_16= ruleSign this_INT_17= RULE_INT kw= ',' this_Sign_19= ruleSign this_INT_20= RULE_INT ) | (this_Sign_21= ruleSign this_INT_22= RULE_INT ) | this_INT_23= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_INT_3=null;
        Token this_ID_5=null;
        Token this_ID_7=null;
        Token this_INT_10=null;
        Token this_ID_12=null;
        Token this_ID_14=null;
        Token this_INT_17=null;
        Token this_INT_20=null;
        Token this_INT_22=null;
        Token this_INT_23=null;
        AntlrDatatypeRuleToken this_Sign_2 = null;

        AntlrDatatypeRuleToken this_Sign_9 = null;

        AntlrDatatypeRuleToken this_Sign_16 = null;

        AntlrDatatypeRuleToken this_Sign_19 = null;

        AntlrDatatypeRuleToken this_Sign_21 = null;



        	enterRule();

        try {
            // InternalGolang.g:332:2: ( ( (this_ID_0= RULE_ID kw= '(' this_Sign_2= ruleSign this_INT_3= RULE_INT kw= ')' ) | (this_ID_5= RULE_ID kw= '.' this_ID_7= RULE_ID kw= '(' this_Sign_9= ruleSign this_INT_10= RULE_INT kw= ')' ) | (this_ID_12= RULE_ID kw= '[' this_ID_14= RULE_ID kw= ']' ) | (this_Sign_16= ruleSign this_INT_17= RULE_INT kw= ',' this_Sign_19= ruleSign this_INT_20= RULE_INT ) | (this_Sign_21= ruleSign this_INT_22= RULE_INT ) | this_INT_23= RULE_INT ) )
            // InternalGolang.g:333:2: ( (this_ID_0= RULE_ID kw= '(' this_Sign_2= ruleSign this_INT_3= RULE_INT kw= ')' ) | (this_ID_5= RULE_ID kw= '.' this_ID_7= RULE_ID kw= '(' this_Sign_9= ruleSign this_INT_10= RULE_INT kw= ')' ) | (this_ID_12= RULE_ID kw= '[' this_ID_14= RULE_ID kw= ']' ) | (this_Sign_16= ruleSign this_INT_17= RULE_INT kw= ',' this_Sign_19= ruleSign this_INT_20= RULE_INT ) | (this_Sign_21= ruleSign this_INT_22= RULE_INT ) | this_INT_23= RULE_INT )
            {
            // InternalGolang.g:333:2: ( (this_ID_0= RULE_ID kw= '(' this_Sign_2= ruleSign this_INT_3= RULE_INT kw= ')' ) | (this_ID_5= RULE_ID kw= '.' this_ID_7= RULE_ID kw= '(' this_Sign_9= ruleSign this_INT_10= RULE_INT kw= ')' ) | (this_ID_12= RULE_ID kw= '[' this_ID_14= RULE_ID kw= ']' ) | (this_Sign_16= ruleSign this_INT_17= RULE_INT kw= ',' this_Sign_19= ruleSign this_INT_20= RULE_INT ) | (this_Sign_21= ruleSign this_INT_22= RULE_INT ) | this_INT_23= RULE_INT )
            int alt5=6;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalGolang.g:334:3: (this_ID_0= RULE_ID kw= '(' this_Sign_2= ruleSign this_INT_3= RULE_INT kw= ')' )
                    {
                    // InternalGolang.g:334:3: (this_ID_0= RULE_ID kw= '(' this_Sign_2= ruleSign this_INT_3= RULE_INT kw= ')' )
                    // InternalGolang.g:335:4: this_ID_0= RULE_ID kw= '(' this_Sign_2= ruleSign this_INT_3= RULE_INT kw= ')'
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,12,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_1());
                    			

                    				newCompositeNode(grammarAccess.getExpressionAccess().getSignParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_10);
                    this_Sign_2=ruleSign();

                    state._fsp--;


                    				current.merge(this_Sign_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_13); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0_3());
                    			
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGolang.g:371:3: (this_ID_5= RULE_ID kw= '.' this_ID_7= RULE_ID kw= '(' this_Sign_9= ruleSign this_INT_10= RULE_INT kw= ')' )
                    {
                    // InternalGolang.g:371:3: (this_ID_5= RULE_ID kw= '.' this_ID_7= RULE_ID kw= '(' this_Sign_9= ruleSign this_INT_10= RULE_INT kw= ')' )
                    // InternalGolang.g:372:4: this_ID_5= RULE_ID kw= '.' this_ID_7= RULE_ID kw= '(' this_Sign_9= ruleSign this_INT_10= RULE_INT kw= ')'
                    {
                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_14); 

                    				current.merge(this_ID_5);
                    			

                    				newLeafNode(this_ID_5, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,16,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpressionAccess().getFullStopKeyword_1_1());
                    			
                    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_5); 

                    				current.merge(this_ID_7);
                    			

                    				newLeafNode(this_ID_7, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_2());
                    			
                    kw=(Token)match(input,12,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_3());
                    			

                    				newCompositeNode(grammarAccess.getExpressionAccess().getSignParserRuleCall_1_4());
                    			
                    pushFollow(FOLLOW_10);
                    this_Sign_9=ruleSign();

                    state._fsp--;


                    				current.merge(this_Sign_9);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_INT_10=(Token)match(input,RULE_INT,FOLLOW_13); 

                    				current.merge(this_INT_10);
                    			

                    				newLeafNode(this_INT_10, grammarAccess.getExpressionAccess().getINTTerminalRuleCall_1_5());
                    			
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_6());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGolang.g:420:3: (this_ID_12= RULE_ID kw= '[' this_ID_14= RULE_ID kw= ']' )
                    {
                    // InternalGolang.g:420:3: (this_ID_12= RULE_ID kw= '[' this_ID_14= RULE_ID kw= ']' )
                    // InternalGolang.g:421:4: this_ID_12= RULE_ID kw= '[' this_ID_14= RULE_ID kw= ']'
                    {
                    this_ID_12=(Token)match(input,RULE_ID,FOLLOW_15); 

                    				current.merge(this_ID_12);
                    			

                    				newLeafNode(this_ID_12, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_2_0());
                    			
                    kw=(Token)match(input,17,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    this_ID_14=(Token)match(input,RULE_ID,FOLLOW_16); 

                    				current.merge(this_ID_14);
                    			

                    				newLeafNode(this_ID_14, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_2_2());
                    			
                    kw=(Token)match(input,18,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGolang.g:447:3: (this_Sign_16= ruleSign this_INT_17= RULE_INT kw= ',' this_Sign_19= ruleSign this_INT_20= RULE_INT )
                    {
                    // InternalGolang.g:447:3: (this_Sign_16= ruleSign this_INT_17= RULE_INT kw= ',' this_Sign_19= ruleSign this_INT_20= RULE_INT )
                    // InternalGolang.g:448:4: this_Sign_16= ruleSign this_INT_17= RULE_INT kw= ',' this_Sign_19= ruleSign this_INT_20= RULE_INT
                    {

                    				newCompositeNode(grammarAccess.getExpressionAccess().getSignParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_10);
                    this_Sign_16=ruleSign();

                    state._fsp--;


                    				current.merge(this_Sign_16);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_INT_17=(Token)match(input,RULE_INT,FOLLOW_11); 

                    				current.merge(this_INT_17);
                    			

                    				newLeafNode(this_INT_17, grammarAccess.getExpressionAccess().getINTTerminalRuleCall_3_1());
                    			
                    kw=(Token)match(input,14,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpressionAccess().getCommaKeyword_3_2());
                    			

                    				newCompositeNode(grammarAccess.getExpressionAccess().getSignParserRuleCall_3_3());
                    			
                    pushFollow(FOLLOW_10);
                    this_Sign_19=ruleSign();

                    state._fsp--;


                    				current.merge(this_Sign_19);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_INT_20=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_20);
                    			

                    				newLeafNode(this_INT_20, grammarAccess.getExpressionAccess().getINTTerminalRuleCall_3_4());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGolang.g:489:3: (this_Sign_21= ruleSign this_INT_22= RULE_INT )
                    {
                    // InternalGolang.g:489:3: (this_Sign_21= ruleSign this_INT_22= RULE_INT )
                    // InternalGolang.g:490:4: this_Sign_21= ruleSign this_INT_22= RULE_INT
                    {

                    				newCompositeNode(grammarAccess.getExpressionAccess().getSignParserRuleCall_4_0());
                    			
                    pushFollow(FOLLOW_10);
                    this_Sign_21=ruleSign();

                    state._fsp--;


                    				current.merge(this_Sign_21);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_INT_22=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_22);
                    			

                    				newLeafNode(this_INT_22, grammarAccess.getExpressionAccess().getINTTerminalRuleCall_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGolang.g:509:3: this_INT_23= RULE_INT
                    {
                    this_INT_23=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_23);
                    		

                    			newLeafNode(this_INT_23, grammarAccess.getExpressionAccess().getINTTerminalRuleCall_5());
                    		

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSign"
    // InternalGolang.g:520:1: entryRuleSign returns [String current=null] : iv_ruleSign= ruleSign EOF ;
    public final String entryRuleSign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSign = null;


        try {
            // InternalGolang.g:520:44: (iv_ruleSign= ruleSign EOF )
            // InternalGolang.g:521:2: iv_ruleSign= ruleSign EOF
            {
             newCompositeNode(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSign=ruleSign();

            state._fsp--;

             current =iv_ruleSign.getText(); 
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
    // $ANTLR end "entryRuleSign"


    // $ANTLR start "ruleSign"
    // InternalGolang.g:527:1: ruleSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleSign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGolang.g:533:2: ( (kw= '-' | kw= '+' ) )
            // InternalGolang.g:534:2: (kw= '-' | kw= '+' )
            {
            // InternalGolang.g:534:2: (kw= '-' | kw= '+' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGolang.g:535:3: kw= '-'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSignAccess().getHyphenMinusKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGolang.g:541:3: kw= '+'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_1());
                    		

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
    // $ANTLR end "ruleSign"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\uffff\1\3\2\uffff\1\3\10\uffff";
    static final String dfa_3s = "\3\4\1\uffff\1\4\1\uffff\2\4\5\uffff";
    static final String dfa_4s = "\1\16\1\17\1\4\1\uffff\1\17\1\uffff\1\17\1\24\5\uffff";
    static final String dfa_5s = "\3\uffff\1\1\1\uffff\1\5\2\uffff\1\6\1\3\1\2\1\1\1\4";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\11\uffff\1\2",
            "\1\4\10\uffff\2\3\1\5",
            "\1\6",
            "",
            "\1\3\10\uffff\2\3\1\7",
            "",
            "\1\12\11\uffff\1\10\1\11",
            "\1\14\1\13\15\uffff\2\14",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "156:2: ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= ',' this_ID_2= RULE_ID this_ID_3= RULE_ID otherlv_4= '=' ( (lv_expressions_5_0= ruleExpression ) ) ) | (otherlv_6= ',' this_ID_7= RULE_ID otherlv_8= '=' ( (lv_expressions_9_0= ruleExpression ) ) ) | (this_ID_10= RULE_ID this_ID_11= RULE_ID otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) ) | (this_ID_14= RULE_ID otherlv_15= '=' this_INT_16= RULE_INT ) | (otherlv_17= ',' this_ID_18= RULE_ID otherlv_19= ',' this_ID_20= RULE_ID ) )";
        }
    }
    static final String dfa_8s = "\14\uffff";
    static final String dfa_9s = "\10\uffff\1\12\3\uffff";
    static final String dfa_10s = "\1\4\1\14\2\5\4\uffff\2\4\2\uffff";
    static final String dfa_11s = "\1\24\1\21\2\5\4\uffff\1\16\1\24\2\uffff";
    static final String dfa_12s = "\4\uffff\1\6\1\3\1\2\1\1\2\uffff\1\5\1\4";
    static final String dfa_13s = "\14\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\4\15\uffff\1\2\1\3",
            "\1\7\3\uffff\1\6\1\5",
            "\1\10",
            "\1\10",
            "",
            "",
            "",
            "",
            "\1\12\10\uffff\1\12\1\11",
            "\1\12\16\uffff\2\13",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "333:2: ( (this_ID_0= RULE_ID kw= '(' this_Sign_2= ruleSign this_INT_3= RULE_INT kw= ')' ) | (this_ID_5= RULE_ID kw= '.' this_ID_7= RULE_ID kw= '(' this_Sign_9= ruleSign this_INT_10= RULE_INT kw= ')' ) | (this_ID_12= RULE_ID kw= '[' this_ID_14= RULE_ID kw= ']' ) | (this_Sign_16= ruleSign this_INT_17= RULE_INT kw= ',' this_Sign_19= ruleSign this_INT_20= RULE_INT ) | (this_Sign_21= ruleSign this_INT_22= RULE_INT ) | this_INT_23= RULE_INT )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});

}