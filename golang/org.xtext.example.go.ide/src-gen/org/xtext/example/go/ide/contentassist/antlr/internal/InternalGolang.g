/*
 * generated by Xtext 2.12.0
 */
grammar InternalGolang;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.go.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleVarDecl
entryRuleVarDecl
:
{ before(grammarAccess.getVarDeclRule()); }
	 ruleVarDecl
{ after(grammarAccess.getVarDeclRule()); } 
	 EOF 
;

// Rule VarDecl
ruleVarDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVarDeclAccess().getAlternatives()); }
		(rule__VarDecl__Alternatives)
		{ after(grammarAccess.getVarDeclAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSpec
entryRuleSpec
:
{ before(grammarAccess.getSpecRule()); }
	 ruleSpec
{ after(grammarAccess.getSpecRule()); } 
	 EOF 
;

// Rule Spec
ruleSpec 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSpecAccess().getAlternatives()); }
		(rule__Spec__Alternatives)
		{ after(grammarAccess.getSpecAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getAlternatives()); }
		(rule__Expression__Alternatives)
		{ after(grammarAccess.getExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSign
entryRuleSign
:
{ before(grammarAccess.getSignRule()); }
	 ruleSign
{ after(grammarAccess.getSignRule()); } 
	 EOF 
;

// Rule Sign
ruleSign 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSignAccess().getAlternatives()); }
		(rule__Sign__Alternatives)
		{ after(grammarAccess.getSignAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarDeclAccess().getGroup_0()); }
		(rule__VarDecl__Group_0__0)
		{ after(grammarAccess.getVarDeclAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getVarDeclAccess().getGroup_1()); }
		(rule__VarDecl__Group_1__0)
		{ after(grammarAccess.getVarDeclAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecAccess().getNameAssignment_0()); }
		(rule__Spec__NameAssignment_0)
		{ after(grammarAccess.getSpecAccess().getNameAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getSpecAccess().getGroup_1()); }
		(rule__Spec__Group_1__0)
		{ after(grammarAccess.getSpecAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getSpecAccess().getGroup_2()); }
		(rule__Spec__Group_2__0)
		{ after(grammarAccess.getSpecAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getSpecAccess().getGroup_3()); }
		(rule__Spec__Group_3__0)
		{ after(grammarAccess.getSpecAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getSpecAccess().getGroup_4()); }
		(rule__Spec__Group_4__0)
		{ after(grammarAccess.getSpecAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getSpecAccess().getGroup_5()); }
		(rule__Spec__Group_5__0)
		{ after(grammarAccess.getSpecAccess().getGroup_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getGroup_0()); }
		(rule__Expression__Group_0__0)
		{ after(grammarAccess.getExpressionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getGroup_1()); }
		(rule__Expression__Group_1__0)
		{ after(grammarAccess.getExpressionAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getGroup_2()); }
		(rule__Expression__Group_2__0)
		{ after(grammarAccess.getExpressionAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getGroup_3()); }
		(rule__Expression__Group_3__0)
		{ after(grammarAccess.getExpressionAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getGroup_4()); }
		(rule__Expression__Group_4__0)
		{ after(grammarAccess.getExpressionAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_5()); }
		RULE_INT
		{ after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sign__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSignAccess().getHyphenMinusKeyword_0()); }
		'-'
		{ after(grammarAccess.getSignAccess().getHyphenMinusKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getSignAccess().getPlusSignKeyword_1()); }
		'+'
		{ after(grammarAccess.getSignAccess().getPlusSignKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDecl__Group_0__0__Impl
	rule__VarDecl__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclAccess().getVarKeyword_0_0()); }
	'var'
	{ after(grammarAccess.getVarDeclAccess().getVarKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDecl__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVarDeclAccess().getSpecsAssignment_0_1()); }
		(rule__VarDecl__SpecsAssignment_0_1)
		{ after(grammarAccess.getVarDeclAccess().getSpecsAssignment_0_1()); }
	)
	(
		{ before(grammarAccess.getVarDeclAccess().getSpecsAssignment_0_1()); }
		(rule__VarDecl__SpecsAssignment_0_1)*
		{ after(grammarAccess.getVarDeclAccess().getSpecsAssignment_0_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VarDecl__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDecl__Group_1__0__Impl
	rule__VarDecl__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclAccess().getVarKeyword_1_0()); }
	'var'
	{ after(grammarAccess.getVarDeclAccess().getVarKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDecl__Group_1__1__Impl
	rule__VarDecl__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclAccess().getLeftParenthesisKeyword_1_1()); }
	'('
	{ after(grammarAccess.getVarDeclAccess().getLeftParenthesisKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDecl__Group_1__2__Impl
	rule__VarDecl__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVarDeclAccess().getSpecsAssignment_1_2()); }
		(rule__VarDecl__SpecsAssignment_1_2)
		{ after(grammarAccess.getVarDeclAccess().getSpecsAssignment_1_2()); }
	)
	(
		{ before(grammarAccess.getVarDeclAccess().getSpecsAssignment_1_2()); }
		(rule__VarDecl__SpecsAssignment_1_2)*
		{ after(grammarAccess.getVarDeclAccess().getSpecsAssignment_1_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDecl__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclAccess().getRightParenthesisKeyword_1_3()); }
	')'
	{ after(grammarAccess.getVarDeclAccess().getRightParenthesisKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Spec__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_1__0__Impl
	rule__Spec__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getCommaKeyword_1_0()); }
	','
	{ after(grammarAccess.getSpecAccess().getCommaKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_1__1__Impl
	rule__Spec__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_1__2__Impl
	rule__Spec__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_2()); }
	RULE_ID
	{ after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_1__3__Impl
	rule__Spec__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getEqualsSignKeyword_1_3()); }
	'='
	{ after(grammarAccess.getSpecAccess().getEqualsSignKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getExpressionsAssignment_1_4()); }
	(rule__Spec__ExpressionsAssignment_1_4)
	{ after(grammarAccess.getSpecAccess().getExpressionsAssignment_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Spec__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_2__0__Impl
	rule__Spec__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getSpecAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_2__1__Impl
	rule__Spec__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_2_1()); }
	RULE_ID
	{ after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_2__2__Impl
	rule__Spec__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getEqualsSignKeyword_2_2()); }
	'='
	{ after(grammarAccess.getSpecAccess().getEqualsSignKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getExpressionsAssignment_2_3()); }
	(rule__Spec__ExpressionsAssignment_2_3)
	{ after(grammarAccess.getSpecAccess().getExpressionsAssignment_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Spec__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_3__0__Impl
	rule__Spec__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_3_0()); }
	RULE_ID
	{ after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_3__1__Impl
	rule__Spec__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_3_1()); }
	RULE_ID
	{ after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_3__2__Impl
	rule__Spec__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getEqualsSignKeyword_3_2()); }
	'='
	{ after(grammarAccess.getSpecAccess().getEqualsSignKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getExpressionsAssignment_3_3()); }
	(rule__Spec__ExpressionsAssignment_3_3)
	{ after(grammarAccess.getSpecAccess().getExpressionsAssignment_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Spec__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_4__0__Impl
	rule__Spec__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_4_0()); }
	RULE_ID
	{ after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_4__1__Impl
	rule__Spec__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getEqualsSignKeyword_4_1()); }
	'='
	{ after(grammarAccess.getSpecAccess().getEqualsSignKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getINTTerminalRuleCall_4_2()); }
	RULE_INT
	{ after(grammarAccess.getSpecAccess().getINTTerminalRuleCall_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Spec__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_5__0__Impl
	rule__Spec__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getSpecAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_5__1__Impl
	rule__Spec__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_5_1()); }
	RULE_ID
	{ after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_5__2__Impl
	rule__Spec__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getCommaKeyword_5_2()); }
	','
	{ after(grammarAccess.getSpecAccess().getCommaKeyword_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Spec__Group_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecAccess().getIDTerminalRuleCall_5_3()); }
	RULE_ID
	{ after(grammarAccess.getSpecAccess().getIDTerminalRuleCall_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_0__0__Impl
	rule__Expression__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_0_0()); }
	RULE_ID
	{ after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_0__1__Impl
	rule__Expression__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_1()); }
	'('
	{ after(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_0__2__Impl
	rule__Expression__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getSignParserRuleCall_0_2()); }
	ruleSign
	{ after(grammarAccess.getExpressionAccess().getSignParserRuleCall_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_0__3__Impl
	rule__Expression__Group_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0_3()); }
	RULE_INT
	{ after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_0__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_0_4()); }
	')'
	{ after(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_0_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_1__0__Impl
	rule__Expression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_0()); }
	RULE_ID
	{ after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_1__1__Impl
	rule__Expression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getFullStopKeyword_1_1()); }
	'.'
	{ after(grammarAccess.getExpressionAccess().getFullStopKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_1__2__Impl
	rule__Expression__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_2()); }
	RULE_ID
	{ after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_1__3__Impl
	rule__Expression__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_3()); }
	'('
	{ after(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_1__4__Impl
	rule__Expression__Group_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getSignParserRuleCall_1_4()); }
	ruleSign
	{ after(grammarAccess.getExpressionAccess().getSignParserRuleCall_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_1__5__Impl
	rule__Expression__Group_1__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_1_5()); }
	RULE_INT
	{ after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_1__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_6()); }
	')'
	{ after(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_2__0__Impl
	rule__Expression__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_2_0()); }
	RULE_ID
	{ after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_2__1__Impl
	rule__Expression__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_2_1()); }
	'['
	{ after(grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_2__2__Impl
	rule__Expression__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_2_2()); }
	RULE_ID
	{ after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_2_3()); }
	']'
	{ after(grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_3__0__Impl
	rule__Expression__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getSignParserRuleCall_3_0()); }
	ruleSign
	{ after(grammarAccess.getExpressionAccess().getSignParserRuleCall_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_3__1__Impl
	rule__Expression__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_3_1()); }
	RULE_INT
	{ after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_3__2__Impl
	rule__Expression__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getCommaKeyword_3_2()); }
	','
	{ after(grammarAccess.getExpressionAccess().getCommaKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_3__3__Impl
	rule__Expression__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getSignParserRuleCall_3_3()); }
	ruleSign
	{ after(grammarAccess.getExpressionAccess().getSignParserRuleCall_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_3_4()); }
	RULE_INT
	{ after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_4__0__Impl
	rule__Expression__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getSignParserRuleCall_4_0()); }
	ruleSign
	{ after(grammarAccess.getExpressionAccess().getSignParserRuleCall_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_4_1()); }
	RULE_INT
	{ after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VarDecl__SpecsAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarDeclAccess().getSpecsSpecParserRuleCall_0_1_0()); }
		ruleSpec
		{ after(grammarAccess.getVarDeclAccess().getSpecsSpecParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDecl__SpecsAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarDeclAccess().getSpecsSpecParserRuleCall_1_2_0()); }
		ruleSpec
		{ after(grammarAccess.getVarDeclAccess().getSpecsSpecParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getSpecAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__ExpressionsAssignment_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecAccess().getExpressionsExpressionParserRuleCall_1_4_0()); }
		ruleExpression
		{ after(grammarAccess.getSpecAccess().getExpressionsExpressionParserRuleCall_1_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__ExpressionsAssignment_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecAccess().getExpressionsExpressionParserRuleCall_2_3_0()); }
		ruleExpression
		{ after(grammarAccess.getSpecAccess().getExpressionsExpressionParserRuleCall_2_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Spec__ExpressionsAssignment_3_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecAccess().getExpressionsExpressionParserRuleCall_3_3_0()); }
		ruleExpression
		{ after(grammarAccess.getSpecAccess().getExpressionsExpressionParserRuleCall_3_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
