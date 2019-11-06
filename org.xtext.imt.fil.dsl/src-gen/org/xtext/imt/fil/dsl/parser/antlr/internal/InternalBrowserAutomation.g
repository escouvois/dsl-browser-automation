/*
 * generated by Xtext 2.17.0
 */
grammar InternalBrowserAutomation;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.imt.fil.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.imt.fil.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.imt.fil.dsl.services.BrowserAutomationGrammarAccess;

}

@parser::members {

 	private BrowserAutomationGrammarAccess grammarAccess;

    public InternalBrowserAutomationParser(TokenStream input, BrowserAutomationGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "BrowserAutomation";
   	}

   	@Override
   	protected BrowserAutomationGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleBrowserAutomation
entryRuleBrowserAutomation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBrowserAutomationRule()); }
	iv_ruleBrowserAutomation=ruleBrowserAutomation
	{ $current=$iv_ruleBrowserAutomation.current; }
	EOF;

// Rule BrowserAutomation
ruleBrowserAutomation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBrowserAutomationAccess().getBrowserAutomationAction_0(),
					$current);
			}
		)
		otherlv_1='open'
		{
			newLeafNode(otherlv_1, grammarAccess.getBrowserAutomationAccess().getOpenKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBrowserAutomationAccess().getWebBrowserWebBrowserParserRuleCall_2_0());
				}
				lv_webBrowser_2_0=ruleWebBrowser
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBrowserAutomationRule());
					}
					set(
						$current,
						"webBrowser",
						lv_webBrowser_2_0,
						"org.xtext.imt.fil.dsl.BrowserAutomation.WebBrowser");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBrowserAutomationAccess().getStatementsStatementParserRuleCall_3_0());
				}
				lv_statements_3_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBrowserAutomationRule());
					}
					add(
						$current,
						"statements",
						lv_statements_3_0,
						"org.xtext.imt.fil.dsl.BrowserAutomation.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleWebBrowser
entryRuleWebBrowser returns [String current=null]:
	{ newCompositeNode(grammarAccess.getWebBrowserRule()); }
	iv_ruleWebBrowser=ruleWebBrowser
	{ $current=$iv_ruleWebBrowser.current.getText(); }
	EOF;

// Rule WebBrowser
ruleWebBrowser returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='mozilla'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getWebBrowserAccess().getMozillaKeyword_0());
		}
		    |
		kw='chrome'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getWebBrowserAccess().getChromeKeyword_1());
		}
		    |
		kw='safari'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getWebBrowserAccess().getSafariKeyword_2());
		}
		    |
		kw='internetExplorer'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getWebBrowserAccess().getInternetExplorerKeyword_3());
		}
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getDoActionParserRuleCall_0());
		}
		this_DoAction_0=ruleDoAction
		{
			$current = $this_DoAction_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getGetParserRuleCall_1());
		}
		this_Get_1=ruleGet
		{
			$current = $this_Get_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getUncheckAllParserRuleCall_2());
		}
		ruleUncheckAll
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getGoToParserRuleCall_3());
		}
		this_GoTo_3=ruleGoTo
		{
			$current = $this_GoTo_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDoAction
entryRuleDoAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDoActionRule()); }
	iv_ruleDoAction=ruleDoAction
	{ $current=$iv_ruleDoAction.current; }
	EOF;

// Rule DoAction
ruleDoAction returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getDoActionAccess().getGetGetParserRuleCall_0_0());
				}
				lv_get_0_0=ruleGet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDoActionRule());
					}
					set(
						$current,
						"get",
						lv_get_0_0,
						"org.xtext.imt.fil.dsl.BrowserAutomation.Get");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDoActionAccess().getActionActionParserRuleCall_1_0());
				}
				lv_action_1_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDoActionRule());
					}
					set(
						$current,
						"action",
						lv_action_1_0,
						"org.xtext.imt.fil.dsl.BrowserAutomation.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActionAccess().getClickParserRuleCall_0());
		}
		this_Click_0=ruleClick
		{
			$current = $this_Click_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getInsertParserRuleCall_1());
		}
		this_Insert_1=ruleInsert
		{
			$current = $this_Insert_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getVerifyParserRuleCall_2());
		}
		this_Verify_2=ruleVerify
		{
			$current = $this_Verify_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getCheckParserRuleCall_3());
		}
		this_Check_3=ruleCheck
		{
			$current = $this_Check_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getChooseParserRuleCall_4());
		}
		this_Choose_4=ruleChoose
		{
			$current = $this_Choose_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getContainsParserRuleCall_5());
		}
		this_Contains_5=ruleContains
		{
			$current = $this_Contains_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGoTo
entryRuleGoTo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGoToRule()); }
	iv_ruleGoTo=ruleGoTo
	{ $current=$iv_ruleGoTo.current; }
	EOF;

// Rule GoTo
ruleGoTo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='go'
		{
			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGoKeyword_0());
		}
		otherlv_1='to'
		{
			newLeafNode(otherlv_1, grammarAccess.getGoToAccess().getToKeyword_1());
		}
		(
			(
				lv_url_2_0=RULE_STRING
				{
					newLeafNode(lv_url_2_0, grammarAccess.getGoToAccess().getUrlSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGoToRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleUncheckAll
entryRuleUncheckAll returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUncheckAllRule()); }
	iv_ruleUncheckAll=ruleUncheckAll
	{ $current=$iv_ruleUncheckAll.current.getText(); }
	EOF;

// Rule UncheckAll
ruleUncheckAll returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='uncheck'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUncheckAllAccess().getUncheckKeyword_0());
		}
		kw='all'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUncheckAllAccess().getAllKeyword_1());
		}
	)
;

// Entry rule entryRuleGet
entryRuleGet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGetRule()); }
	iv_ruleGet=ruleGet
	{ $current=$iv_ruleGet.current; }
	EOF;

// Rule Get
ruleGet returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getGetAccess().getVarRefVariableParserRuleCall_0_0());
				}
				lv_varRef_0_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGetRule());
					}
					set(
						$current,
						"varRef",
						lv_varRef_0_0,
						"org.xtext.imt.fil.dsl.BrowserAutomation.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getGetAccess().getEqualsSignKeyword_1());
		}
		otherlv_2='get'
		{
			newLeafNode(otherlv_2, grammarAccess.getGetAccess().getGetKeyword_2());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getGetAccess().getElementElementParserRuleCall_3_0_0_0());
						}
						lv_element_3_0=ruleElement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getGetRule());
							}
							set(
								$current,
								"element",
								lv_element_3_0,
								"org.xtext.imt.fil.dsl.BrowserAutomation.Element");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getGetAccess().getOrderOrderParserRuleCall_3_0_1_0());
						}
						lv_order_4_0=ruleOrder
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getGetRule());
							}
							set(
								$current,
								"order",
								lv_order_4_0,
								"org.xtext.imt.fil.dsl.BrowserAutomation.Order");
							afterParserOrEnumRuleCall();
						}
					)
				)?
				(
					(
						otherlv_5='by'
						{
							newLeafNode(otherlv_5, grammarAccess.getGetAccess().getByKeyword_3_0_2_0_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getGetAccess().getAttrAttributParserRuleCall_3_0_2_0_1_0());
								}
								lv_attr_6_0=ruleAttribut
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getGetRule());
									}
									set(
										$current,
										"attr",
										lv_attr_6_0,
										"org.xtext.imt.fil.dsl.BrowserAutomation.Attribut");
									afterParserOrEnumRuleCall();
								}
							)
						)
						otherlv_7='['
						{
							newLeafNode(otherlv_7, grammarAccess.getGetAccess().getLeftSquareBracketKeyword_3_0_2_0_2());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getGetAccess().getAttrValAttributeValueParserRuleCall_3_0_2_0_3_0());
								}
								lv_attrVal_8_0=ruleAttributeValue
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getGetRule());
									}
									set(
										$current,
										"attrVal",
										lv_attrVal_8_0,
										"org.xtext.imt.fil.dsl.BrowserAutomation.AttributeValue");
									afterParserOrEnumRuleCall();
								}
							)
						)
						otherlv_9=']'
						{
							newLeafNode(otherlv_9, grammarAccess.getGetAccess().getRightSquareBracketKeyword_3_0_2_0_4());
						}
					)
					    |
					(
						otherlv_10='from'
						{
							newLeafNode(otherlv_10, grammarAccess.getGetAccess().getFromKeyword_3_0_2_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getGetAccess().getFromVarReferenceParserRuleCall_3_0_2_1_1_0());
								}
								lv_from_11_0=ruleVarReference
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getGetRule());
									}
									set(
										$current,
										"from",
										lv_from_11_0,
										"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)
				)
			)
			    |
			otherlv_12='pageTitle'
			{
				newLeafNode(otherlv_12, grammarAccess.getGetAccess().getPageTitleKeyword_3_1());
			}
		)
	)
;

// Entry rule entryRuleAttributeValue
entryRuleAttributeValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeValueRule()); }
	iv_ruleAttributeValue=ruleAttributeValue
	{ $current=$iv_ruleAttributeValue.current; }
	EOF;

// Rule AttributeValue
ruleAttributeValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_stringVal_0_0=RULE_STRING
				{
					newLeafNode(lv_stringVal_0_0, grammarAccess.getAttributeValueAccess().getStringValSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeValueRule());
					}
					setWithLastConsumed(
						$current,
						"stringVal",
						lv_stringVal_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeValueAccess().getVarRefValVarReferenceParserRuleCall_1_0());
				}
				lv_varRefVal_1_0=ruleVarReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeValueRule());
					}
					set(
						$current,
						"varRefVal",
						lv_varRefVal_1_0,
						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleOrder
entryRuleOrder returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrderRule()); }
	iv_ruleOrder=ruleOrder
	{ $current=$iv_ruleOrder.current; }
	EOF;

// Rule Order
ruleOrder returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='number'
		{
			newLeafNode(otherlv_0, grammarAccess.getOrderAccess().getNumberKeyword_0());
		}
		(
			(
				lv_order_1_0=RULE_INT
				{
					newLeafNode(lv_order_1_0, grammarAccess.getOrderAccess().getOrderINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOrderRule());
					}
					setWithLastConsumed(
						$current,
						"order",
						lv_order_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [String current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current.getText(); }
	EOF;

// Rule Element
ruleElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='link'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getElementAccess().getLinkKeyword_0());
		}
		    |
		kw='input'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getElementAccess().getInputKeyword_1());
		}
		    |
		kw='button'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getElementAccess().getButtonKeyword_2());
		}
		    |
		kw='checkbox'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getElementAccess().getCheckboxKeyword_3());
		}
		    |
		kw='combobox'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getElementAccess().getComboboxKeyword_4());
		}
		    |
		kw='image'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getElementAccess().getImageKeyword_5());
		}
		    |
		kw='text'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getElementAccess().getTextKeyword_6());
		}
		    |
		kw='title'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getElementAccess().getTitleKeyword_7());
		}
	)
;

// Entry rule entryRuleAttribut
entryRuleAttribut returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAttributRule()); }
	iv_ruleAttribut=ruleAttribut
	{ $current=$iv_ruleAttribut.current.getText(); }
	EOF;

// Rule Attribut
ruleAttribut returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='class'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAttributAccess().getClassKeyword_0());
		}
		    |
		kw='value'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAttributAccess().getValueKeyword_1());
		}
		    |
		kw='alt'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAttributAccess().getAltKeyword_2());
		}
		    |
		kw='name'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAttributAccess().getNameKeyword_3());
		}
		    |
		kw='href'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAttributAccess().getHrefKeyword_4());
		}
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getVariableRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleVarReference
entryRuleVarReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVarReferenceRule()); }
	iv_ruleVarReference=ruleVarReference
	{ $current=$iv_ruleVarReference.current; }
	EOF;

// Rule VarReference
ruleVarReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getVarReferenceRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getVarReferenceAccess().getVarRefVariableCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleClick
entryRuleClick returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClickRule()); }
	iv_ruleClick=ruleClick
	{ $current=$iv_ruleClick.current; }
	EOF;

// Rule Click
ruleClick returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='click'
		{
			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
		}
		otherlv_1='on'
		{
			newLeafNode(otherlv_1, grammarAccess.getClickAccess().getOnKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClickAccess().getVarRefVarReferenceParserRuleCall_2_0());
				}
				lv_varRef_2_0=ruleVarReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClickRule());
					}
					set(
						$current,
						"varRef",
						lv_varRef_2_0,
						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInsert
entryRuleInsert returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInsertRule()); }
	iv_ruleInsert=ruleInsert
	{ $current=$iv_ruleInsert.current; }
	EOF;

// Rule Insert
ruleInsert returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='insert'
		{
			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
		}
		(
			(
				(
					lv_val_1_0=RULE_STRING
					{
						newLeafNode(lv_val_1_0, grammarAccess.getInsertAccess().getValSTRINGTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getInsertRule());
						}
						setWithLastConsumed(
							$current,
							"val",
							lv_val_1_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getInsertAccess().getVarRefVarReferenceParserRuleCall_1_1_0());
					}
					lv_varRef_2_0=ruleVarReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInsertRule());
						}
						set(
							$current,
							"varRef",
							lv_varRef_2_0,
							"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_3='in'
		{
			newLeafNode(otherlv_3, grammarAccess.getInsertAccess().getInKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInsertAccess().getVar2VarReferenceParserRuleCall_3_0());
				}
				lv_var2_4_0=ruleVarReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInsertRule());
					}
					set(
						$current,
						"var2",
						lv_var2_4_0,
						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVerify
entryRuleVerify returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVerifyRule()); }
	iv_ruleVerify=ruleVerify
	{ $current=$iv_ruleVerify.current; }
	EOF;

// Rule Verify
ruleVerify returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getVerifyAccess().getVarToVerifyVarReferenceParserRuleCall_0_0());
				}
				lv_varToVerify_0_0=ruleVarReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVerifyRule());
					}
					set(
						$current,
						"varToVerify",
						lv_varToVerify_0_0,
						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='is'
		{
			newLeafNode(otherlv_1, grammarAccess.getVerifyAccess().getIsKeyword_1());
		}
		otherlv_2='not'
		{
			newLeafNode(otherlv_2, grammarAccess.getVerifyAccess().getNotKeyword_2());
		}
		otherlv_3='null'
		{
			newLeafNode(otherlv_3, grammarAccess.getVerifyAccess().getNullKeyword_3());
		}
	)
;

// Entry rule entryRuleCheck
entryRuleCheck returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCheckRule()); }
	iv_ruleCheck=ruleCheck
	{ $current=$iv_ruleCheck.current; }
	EOF;

// Rule Check
ruleCheck returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='check'
		{
			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCheckAccess().getVarCheckVarReferenceParserRuleCall_1_0());
				}
				lv_varCheck_1_0=ruleVarReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCheckRule());
					}
					set(
						$current,
						"varCheck",
						lv_varCheck_1_0,
						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleChoose
entryRuleChoose returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChooseRule()); }
	iv_ruleChoose=ruleChoose
	{ $current=$iv_ruleChoose.current; }
	EOF;

// Rule Choose
ruleChoose returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='choose'
		{
			newLeafNode(otherlv_0, grammarAccess.getChooseAccess().getChooseKeyword_0());
		}
		(
			(
				lv_value_1_0=RULE_STRING
				{
					newLeafNode(lv_value_1_0, grammarAccess.getChooseAccess().getValueSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChooseRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='in'
		{
			newLeafNode(otherlv_2, grammarAccess.getChooseAccess().getInKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChooseAccess().getVarChooseVarReferenceParserRuleCall_3_0());
				}
				lv_varChoose_3_0=ruleVarReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChooseRule());
					}
					set(
						$current,
						"varChoose",
						lv_varChoose_3_0,
						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleContains
entryRuleContains returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainsRule()); }
	iv_ruleContains=ruleContains
	{ $current=$iv_ruleContains.current; }
	EOF;

// Rule Contains
ruleContains returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getContainsAccess().getVarContainsVarReferenceParserRuleCall_0_0());
				}
				lv_varContains_0_0=ruleVarReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContainsRule());
					}
					set(
						$current,
						"varContains",
						lv_varContains_0_0,
						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='contains'
		{
			newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getContainsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getContainsAccess().getVarContainedVarReferenceParserRuleCall_2_0());
				}
				lv_varContained_2_0=ruleVarReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContainsRule());
					}
					set(
						$current,
						"varContained",
						lv_varContained_2_0,
						"org.xtext.imt.fil.dsl.BrowserAutomation.VarReference");
					afterParserOrEnumRuleCall();
				}
			)
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
