/*
 * generated by Xtext 2.26.0
 */
grammar InternalComp;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package composant.xtext.comp.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package composant.xtext.comp.ide.contentassist.antlr.internal;

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
import composant.xtext.comp.services.CompGrammarAccess;

}
@parser::members {
	private CompGrammarAccess grammarAccess;

	public void setGrammarAccess(CompGrammarAccess grammarAccess) {
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

// Entry rule entryRuleComposant
entryRuleComposant
:
{ before(grammarAccess.getComposantRule()); }
	 ruleComposant
{ after(grammarAccess.getComposantRule()); } 
	 EOF 
;

// Rule Composant
ruleComposant 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComposantAccess().getGroup()); }
		(rule__Composant__Group__0)
		{ after(grammarAccess.getComposantAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProperty
entryRuleProperty
:
{ before(grammarAccess.getPropertyRule()); }
	 ruleProperty
{ after(grammarAccess.getPropertyRule()); } 
	 EOF 
;

// Rule Property
ruleProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyAccess().getGroup()); }
		(rule__Property__Group__0)
		{ after(grammarAccess.getPropertyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePort
entryRulePort
:
{ before(grammarAccess.getPortRule()); }
	 rulePort
{ after(grammarAccess.getPortRule()); } 
	 EOF 
;

// Rule Port
rulePort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPortAccess().getGroup()); }
		(rule__Port__Group__0)
		{ after(grammarAccess.getPortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConnecteur
entryRuleConnecteur
:
{ before(grammarAccess.getConnecteurRule()); }
	 ruleConnecteur
{ after(grammarAccess.getConnecteurRule()); } 
	 EOF 
;

// Rule Connecteur
ruleConnecteur 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConnecteurAccess().getGroup()); }
		(rule__Connecteur__Group__0)
		{ after(grammarAccess.getConnecteurAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedID
entryRuleQualifiedID
:
{ before(grammarAccess.getQualifiedIDRule()); }
	 ruleQualifiedID
{ after(grammarAccess.getQualifiedIDRule()); } 
	 EOF 
;

// Rule QualifiedID
ruleQualifiedID 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedIDAccess().getGroup()); }
		(rule__QualifiedID__Group__0)
		{ after(grammarAccess.getQualifiedIDAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Direction
ruleDirection
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDirectionAccess().getAlternatives()); }
		(rule__Direction__Alternatives)
		{ after(grammarAccess.getDirectionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Direction__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_0()); }
		('in')
		{ after(grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_1()); }
		('out')
		{ after(grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group__0__Impl
	rule__Composant__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getComponentKeyword_0()); }
	'component'
	{ after(grammarAccess.getComposantAccess().getComponentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group__1__Impl
	rule__Composant__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getNameAssignment_1()); }
	(rule__Composant__NameAssignment_1)
	{ after(grammarAccess.getComposantAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group__2__Impl
	rule__Composant__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getGroup_2()); }
	(rule__Composant__Group_2__0)?
	{ after(grammarAccess.getComposantAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group__3__Impl
	rule__Composant__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getComposantAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group__4__Impl
	rule__Composant__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getGroup_4()); }
	(rule__Composant__Group_4__0)?
	{ after(grammarAccess.getComposantAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group__5__Impl
	rule__Composant__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getGroup_5()); }
	(rule__Composant__Group_5__0)?
	{ after(grammarAccess.getComposantAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group__6__Impl
	rule__Composant__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getGroup_6()); }
	(rule__Composant__Group_6__0)?
	{ after(grammarAccess.getComposantAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getComposantAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Composant__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group_2__0__Impl
	rule__Composant__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getLeftParenthesisKeyword_2_0()); }
	'('
	{ after(grammarAccess.getComposantAccess().getLeftParenthesisKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group_2__1__Impl
	rule__Composant__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getPortsAssignment_2_1()); }
	(rule__Composant__PortsAssignment_2_1)
	{ after(grammarAccess.getComposantAccess().getPortsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group_2__2__Impl
	rule__Composant__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getGroup_2_2()); }
	(rule__Composant__Group_2_2__0)*
	{ after(grammarAccess.getComposantAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getRightParenthesisKeyword_2_3()); }
	')'
	{ after(grammarAccess.getComposantAccess().getRightParenthesisKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Composant__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group_2_2__0__Impl
	rule__Composant__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getCommaKeyword_2_2_0()); }
	','
	{ after(grammarAccess.getComposantAccess().getCommaKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getPortsAssignment_2_2_1()); }
	(rule__Composant__PortsAssignment_2_2_1)
	{ after(grammarAccess.getComposantAccess().getPortsAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Composant__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group_4__0__Impl
	rule__Composant__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getFilsAssignment_4_0()); }
	(rule__Composant__FilsAssignment_4_0)
	{ after(grammarAccess.getComposantAccess().getFilsAssignment_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getFilsAssignment_4_1()); }
	(rule__Composant__FilsAssignment_4_1)*
	{ after(grammarAccess.getComposantAccess().getFilsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Composant__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group_5__0__Impl
	rule__Composant__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getConnecteursAssignment_5_0()); }
	(rule__Composant__ConnecteursAssignment_5_0)
	{ after(grammarAccess.getComposantAccess().getConnecteursAssignment_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getConnecteursAssignment_5_1()); }
	(rule__Composant__ConnecteursAssignment_5_1)*
	{ after(grammarAccess.getComposantAccess().getConnecteursAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Composant__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group_6__0__Impl
	rule__Composant__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getPropertiesKeyword_6_0()); }
	'properties'
	{ after(grammarAccess.getComposantAccess().getPropertiesKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group_6__1__Impl
	rule__Composant__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getPropertiesAssignment_6_1()); }
	(rule__Composant__PropertiesAssignment_6_1)
	{ after(grammarAccess.getComposantAccess().getPropertiesAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group_6__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getGroup_6_2()); }
	(rule__Composant__Group_6_2__0)*
	{ after(grammarAccess.getComposantAccess().getGroup_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Composant__Group_6_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group_6_2__0__Impl
	rule__Composant__Group_6_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_6_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getCommaKeyword_6_2_0()); }
	','
	{ after(grammarAccess.getComposantAccess().getCommaKeyword_6_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_6_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Composant__Group_6_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__Group_6_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComposantAccess().getPropertiesAssignment_6_2_1()); }
	(rule__Composant__PropertiesAssignment_6_2_1)
	{ after(grammarAccess.getComposantAccess().getPropertiesAssignment_6_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group__0__Impl
	rule__Property__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getCleeAssignment_0()); }
	(rule__Property__CleeAssignment_0)
	{ after(grammarAccess.getPropertyAccess().getCleeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group__1__Impl
	rule__Property__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getColonEqualsSignKeyword_1()); }
	':='
	{ after(grammarAccess.getPropertyAccess().getColonEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getValeurAssignment_2()); }
	(rule__Property__ValeurAssignment_2)
	{ after(grammarAccess.getPropertyAccess().getValeurAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Port__Group__0__Impl
	rule__Port__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPortAccess().getDirectionAssignment_0()); }
	(rule__Port__DirectionAssignment_0)
	{ after(grammarAccess.getPortAccess().getDirectionAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Port__Group__1__Impl
	rule__Port__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPortAccess().getNameAssignment_1()); }
	(rule__Port__NameAssignment_1)
	{ after(grammarAccess.getPortAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Port__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPortAccess().getGroup_2()); }
	(rule__Port__Group_2__0)?
	{ after(grammarAccess.getPortAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Port__Group_2__0__Impl
	rule__Port__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_2_0()); }
	'{'
	{ after(grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Port__Group_2__1__Impl
	rule__Port__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPortAccess().getPropertiesAssignment_2_1()); }
	(rule__Port__PropertiesAssignment_2_1)
	{ after(grammarAccess.getPortAccess().getPropertiesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Port__Group_2__2__Impl
	rule__Port__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPortAccess().getGroup_2_2()); }
	(rule__Port__Group_2_2__0)*
	{ after(grammarAccess.getPortAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Port__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPortAccess().getRightCurlyBracketKeyword_2_3()); }
	'}'
	{ after(grammarAccess.getPortAccess().getRightCurlyBracketKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Port__Group_2_2__0__Impl
	rule__Port__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPortAccess().getCommaKeyword_2_2_0()); }
	','
	{ after(grammarAccess.getPortAccess().getCommaKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Port__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPortAccess().getPropertiesAssignment_2_2_1()); }
	(rule__Port__PropertiesAssignment_2_2_1)
	{ after(grammarAccess.getPortAccess().getPropertiesAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Connecteur__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connecteur__Group__0__Impl
	rule__Connecteur__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnecteurAccess().getNameAssignment_0()); }
	(rule__Connecteur__NameAssignment_0)
	{ after(grammarAccess.getConnecteurAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connecteur__Group__1__Impl
	rule__Connecteur__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnecteurAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getConnecteurAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connecteur__Group__2__Impl
	rule__Connecteur__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnecteurAccess().getSrcAssignment_2()); }
	(rule__Connecteur__SrcAssignment_2)
	{ after(grammarAccess.getConnecteurAccess().getSrcAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connecteur__Group__3__Impl
	rule__Connecteur__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnecteurAccess().getHyphenMinusGreaterThanSignKeyword_3()); }
	'->'
	{ after(grammarAccess.getConnecteurAccess().getHyphenMinusGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connecteur__Group__4__Impl
	rule__Connecteur__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnecteurAccess().getDstAssignment_4()); }
	(rule__Connecteur__DstAssignment_4)
	{ after(grammarAccess.getConnecteurAccess().getDstAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connecteur__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnecteurAccess().getGroup_5()); }
	(rule__Connecteur__Group_5__0)?
	{ after(grammarAccess.getConnecteurAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Connecteur__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connecteur__Group_5__0__Impl
	rule__Connecteur__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnecteurAccess().getLeftCurlyBracketKeyword_5_0()); }
	'{'
	{ after(grammarAccess.getConnecteurAccess().getLeftCurlyBracketKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connecteur__Group_5__1__Impl
	rule__Connecteur__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnecteurAccess().getPropertiesAssignment_5_1()); }
	(rule__Connecteur__PropertiesAssignment_5_1)
	{ after(grammarAccess.getConnecteurAccess().getPropertiesAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connecteur__Group_5__2__Impl
	rule__Connecteur__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnecteurAccess().getGroup_5_2()); }
	(rule__Connecteur__Group_5_2__0)*
	{ after(grammarAccess.getConnecteurAccess().getGroup_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connecteur__Group_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnecteurAccess().getRightCurlyBracketKeyword_5_3()); }
	'}'
	{ after(grammarAccess.getConnecteurAccess().getRightCurlyBracketKeyword_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Connecteur__Group_5_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connecteur__Group_5_2__0__Impl
	rule__Connecteur__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group_5_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnecteurAccess().getCommaKeyword_5_2_0()); }
	','
	{ after(grammarAccess.getConnecteurAccess().getCommaKeyword_5_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group_5_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connecteur__Group_5_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__Group_5_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnecteurAccess().getPropertiesAssignment_5_2_1()); }
	(rule__Connecteur__PropertiesAssignment_5_2_1)
	{ after(grammarAccess.getConnecteurAccess().getPropertiesAssignment_5_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedID__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedID__Group__0__Impl
	rule__QualifiedID__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedID__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedIDAccess().getGroup_1()); }
	(rule__QualifiedID__Group_1__0)?
	{ after(grammarAccess.getQualifiedIDAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedID__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedID__Group_1__0__Impl
	rule__QualifiedID__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedID__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Composant__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComposantAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getComposantAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__PortsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComposantAccess().getPortsPortParserRuleCall_2_1_0()); }
		rulePort
		{ after(grammarAccess.getComposantAccess().getPortsPortParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__PortsAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComposantAccess().getPortsPortParserRuleCall_2_2_1_0()); }
		rulePort
		{ after(grammarAccess.getComposantAccess().getPortsPortParserRuleCall_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__FilsAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComposantAccess().getFilsComposantParserRuleCall_4_0_0()); }
		ruleComposant
		{ after(grammarAccess.getComposantAccess().getFilsComposantParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__FilsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComposantAccess().getFilsComposantParserRuleCall_4_1_0()); }
		ruleComposant
		{ after(grammarAccess.getComposantAccess().getFilsComposantParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__ConnecteursAssignment_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComposantAccess().getConnecteursConnecteurParserRuleCall_5_0_0()); }
		ruleConnecteur
		{ after(grammarAccess.getComposantAccess().getConnecteursConnecteurParserRuleCall_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__ConnecteursAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComposantAccess().getConnecteursConnecteurParserRuleCall_5_1_0()); }
		ruleConnecteur
		{ after(grammarAccess.getComposantAccess().getConnecteursConnecteurParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__PropertiesAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComposantAccess().getPropertiesPropertyParserRuleCall_6_1_0()); }
		ruleProperty
		{ after(grammarAccess.getComposantAccess().getPropertiesPropertyParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Composant__PropertiesAssignment_6_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComposantAccess().getPropertiesPropertyParserRuleCall_6_2_1_0()); }
		ruleProperty
		{ after(grammarAccess.getComposantAccess().getPropertiesPropertyParserRuleCall_6_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__CleeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getCleeEStringParserRuleCall_0_0()); }
		ruleEString
		{ after(grammarAccess.getPropertyAccess().getCleeEStringParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__ValeurAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getValeurEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getPropertyAccess().getValeurEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__DirectionAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPortAccess().getDirectionDirectionEnumRuleCall_0_0()); }
		ruleDirection
		{ after(grammarAccess.getPortAccess().getDirectionDirectionEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__PropertiesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPortAccess().getPropertiesPropertyParserRuleCall_2_1_0()); }
		ruleProperty
		{ after(grammarAccess.getPortAccess().getPropertiesPropertyParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__PropertiesAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPortAccess().getPropertiesPropertyParserRuleCall_2_2_1_0()); }
		ruleProperty
		{ after(grammarAccess.getPortAccess().getPropertiesPropertyParserRuleCall_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnecteurAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getConnecteurAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__SrcAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnecteurAccess().getSrcPortCrossReference_2_0()); }
		(
			{ before(grammarAccess.getConnecteurAccess().getSrcPortQualifiedIDParserRuleCall_2_0_1()); }
			ruleQualifiedID
			{ after(grammarAccess.getConnecteurAccess().getSrcPortQualifiedIDParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getConnecteurAccess().getSrcPortCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__DstAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnecteurAccess().getDstPortCrossReference_4_0()); }
		(
			{ before(grammarAccess.getConnecteurAccess().getDstPortQualifiedIDParserRuleCall_4_0_1()); }
			ruleQualifiedID
			{ after(grammarAccess.getConnecteurAccess().getDstPortQualifiedIDParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getConnecteurAccess().getDstPortCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__PropertiesAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnecteurAccess().getPropertiesPropertyParserRuleCall_5_1_0()); }
		ruleProperty
		{ after(grammarAccess.getConnecteurAccess().getPropertiesPropertyParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connecteur__PropertiesAssignment_5_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnecteurAccess().getPropertiesPropertyParserRuleCall_5_2_1_0()); }
		ruleProperty
		{ after(grammarAccess.getConnecteurAccess().getPropertiesPropertyParserRuleCall_5_2_1_0()); }
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
