/*
 * generated by Xtext 2.26.0
 */
grammar InternalComp;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package composant.xtext.comp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package composant.xtext.comp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import composant.xtext.comp.services.CompGrammarAccess;

}

@parser::members {

 	private CompGrammarAccess grammarAccess;

    public InternalCompParser(TokenStream input, CompGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Composant";
   	}

   	@Override
   	protected CompGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleComposant
entryRuleComposant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComposantRule()); }
	iv_ruleComposant=ruleComposant
	{ $current=$iv_ruleComposant.current; }
	EOF;

// Rule Composant
ruleComposant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='component'
		{
			newLeafNode(otherlv_0, grammarAccess.getComposantAccess().getComponentKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getComposantAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComposantRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getComposantAccess().getLeftParenthesisKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getComposantAccess().getPortsPortParserRuleCall_2_1_0());
					}
					lv_ports_3_0=rulePort
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComposantRule());
						}
						add(
							$current,
							"ports",
							lv_ports_3_0,
							"composant.xtext.comp.Comp.Port");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getComposantAccess().getCommaKeyword_2_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getComposantAccess().getPortsPortParserRuleCall_2_2_1_0());
						}
						lv_ports_5_0=rulePort
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getComposantRule());
							}
							add(
								$current,
								"ports",
								lv_ports_5_0,
								"composant.xtext.comp.Comp.Port");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getComposantAccess().getRightParenthesisKeyword_2_3());
			}
		)?
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getComposantAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getComposantAccess().getFilsComposantParserRuleCall_4_0_0());
					}
					lv_fils_8_0=ruleComposant
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComposantRule());
						}
						add(
							$current,
							"fils",
							lv_fils_8_0,
							"composant.xtext.comp.Comp.Composant");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getComposantAccess().getFilsComposantParserRuleCall_4_1_0());
					}
					lv_fils_9_0=ruleComposant
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComposantRule());
						}
						add(
							$current,
							"fils",
							lv_fils_9_0,
							"composant.xtext.comp.Comp.Composant");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getComposantAccess().getConnecteursConnecteurParserRuleCall_5_0_0());
					}
					lv_connecteurs_10_0=ruleConnecteur
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComposantRule());
						}
						add(
							$current,
							"connecteurs",
							lv_connecteurs_10_0,
							"composant.xtext.comp.Comp.Connecteur");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getComposantAccess().getConnecteursConnecteurParserRuleCall_5_1_0());
					}
					lv_connecteurs_11_0=ruleConnecteur
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComposantRule());
						}
						add(
							$current,
							"connecteurs",
							lv_connecteurs_11_0,
							"composant.xtext.comp.Comp.Connecteur");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		(
			otherlv_12='properties'
			{
				newLeafNode(otherlv_12, grammarAccess.getComposantAccess().getPropertiesKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getComposantAccess().getPropertiesPropertyParserRuleCall_6_1_0());
					}
					lv_properties_13_0=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComposantRule());
						}
						add(
							$current,
							"properties",
							lv_properties_13_0,
							"composant.xtext.comp.Comp.Property");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getComposantAccess().getCommaKeyword_6_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getComposantAccess().getPropertiesPropertyParserRuleCall_6_2_1_0());
						}
						lv_properties_15_0=ruleProperty
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getComposantRule());
							}
							add(
								$current,
								"properties",
								lv_properties_15_0,
								"composant.xtext.comp.Comp.Property");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getComposantAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	iv_ruleProperty=ruleProperty
	{ $current=$iv_ruleProperty.current; }
	EOF;

// Rule Property
ruleProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAccess().getCleeEStringParserRuleCall_0_0());
				}
				lv_clee_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyRule());
					}
					set(
						$current,
						"clee",
						lv_clee_0_0,
						"composant.xtext.comp.Comp.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=':='
		{
			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAccess().getValeurEStringParserRuleCall_2_0());
				}
				lv_valeur_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyRule());
					}
					set(
						$current,
						"valeur",
						lv_valeur_2_0,
						"composant.xtext.comp.Comp.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePort
entryRulePort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPortRule()); }
	iv_rulePort=rulePort
	{ $current=$iv_rulePort.current; }
	EOF;

// Rule Port
rulePort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPortAccess().getDirectionDirectionEnumRuleCall_0_0());
				}
				lv_direction_0_0=ruleDirection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPortRule());
					}
					set(
						$current,
						"direction",
						lv_direction_0_0,
						"composant.xtext.comp.Comp.Direction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='{'
			{
				newLeafNode(otherlv_2, grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPortAccess().getPropertiesPropertyParserRuleCall_2_1_0());
					}
					lv_properties_3_0=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPortRule());
						}
						add(
							$current,
							"properties",
							lv_properties_3_0,
							"composant.xtext.comp.Comp.Property");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getPortAccess().getCommaKeyword_2_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getPortAccess().getPropertiesPropertyParserRuleCall_2_2_1_0());
						}
						lv_properties_5_0=ruleProperty
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPortRule());
							}
							add(
								$current,
								"properties",
								lv_properties_5_0,
								"composant.xtext.comp.Comp.Property");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_6='}'
			{
				newLeafNode(otherlv_6, grammarAccess.getPortAccess().getRightCurlyBracketKeyword_2_3());
			}
		)?
	)
;

// Entry rule entryRuleConnecteur
entryRuleConnecteur returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnecteurRule()); }
	iv_ruleConnecteur=ruleConnecteur
	{ $current=$iv_ruleConnecteur.current; }
	EOF;

// Rule Connecteur
ruleConnecteur returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getConnecteurAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnecteurRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getConnecteurAccess().getColonKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnecteurRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConnecteurAccess().getSrcPortCrossReference_2_0());
				}
				ruleQualifiedID
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='->'
		{
			newLeafNode(otherlv_3, grammarAccess.getConnecteurAccess().getHyphenMinusGreaterThanSignKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnecteurRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConnecteurAccess().getDstPortCrossReference_4_0());
				}
				ruleQualifiedID
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getConnecteurAccess().getLeftCurlyBracketKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConnecteurAccess().getPropertiesPropertyParserRuleCall_5_1_0());
					}
					lv_properties_6_0=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConnecteurRule());
						}
						add(
							$current,
							"properties",
							lv_properties_6_0,
							"composant.xtext.comp.Comp.Property");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getConnecteurAccess().getCommaKeyword_5_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getConnecteurAccess().getPropertiesPropertyParserRuleCall_5_2_1_0());
						}
						lv_properties_8_0=ruleProperty
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getConnecteurRule());
							}
							add(
								$current,
								"properties",
								lv_properties_8_0,
								"composant.xtext.comp.Comp.Property");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getConnecteurAccess().getRightCurlyBracketKeyword_5_3());
			}
		)?
	)
;

// Entry rule entryRuleQualifiedID
entryRuleQualifiedID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedIDRule()); }
	iv_ruleQualifiedID=ruleQualifiedID
	{ $current=$iv_ruleQualifiedID.current.getText(); }
	EOF;

// Rule QualifiedID
ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1());
			}
		)?
	)
;

// Rule Direction
ruleDirection returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='in'
			{
				$current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='out'
			{
				$current = grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
