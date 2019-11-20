/*
 * generated by Xtext 2.17.0
 */
package org.xtext.imt.fil.dsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.imt.fil.dsl.browserAutomation.AttributeValue;
import org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomation;
import org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomationPackage;
import org.xtext.imt.fil.dsl.browserAutomation.Check;
import org.xtext.imt.fil.dsl.browserAutomation.Choose;
import org.xtext.imt.fil.dsl.browserAutomation.Click;
import org.xtext.imt.fil.dsl.browserAutomation.Contains;
import org.xtext.imt.fil.dsl.browserAutomation.DoAction;
import org.xtext.imt.fil.dsl.browserAutomation.Get;
import org.xtext.imt.fil.dsl.browserAutomation.GoTo;
import org.xtext.imt.fil.dsl.browserAutomation.Insert;
import org.xtext.imt.fil.dsl.browserAutomation.Order;
import org.xtext.imt.fil.dsl.browserAutomation.VarReference;
import org.xtext.imt.fil.dsl.browserAutomation.Variable;
import org.xtext.imt.fil.dsl.browserAutomation.Verify;
import org.xtext.imt.fil.dsl.services.BrowserAutomationGrammarAccess;

@SuppressWarnings("all")
public class BrowserAutomationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BrowserAutomationGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BrowserAutomationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BrowserAutomationPackage.ATTRIBUTE_VALUE:
				sequence_AttributeValue(context, (AttributeValue) semanticObject); 
				return; 
			case BrowserAutomationPackage.BROWSER_AUTOMATION:
				sequence_BrowserAutomation(context, (BrowserAutomation) semanticObject); 
				return; 
			case BrowserAutomationPackage.CHECK:
				sequence_Check(context, (Check) semanticObject); 
				return; 
			case BrowserAutomationPackage.CHOOSE:
				sequence_Choose(context, (Choose) semanticObject); 
				return; 
			case BrowserAutomationPackage.CLICK:
				sequence_Click(context, (Click) semanticObject); 
				return; 
			case BrowserAutomationPackage.CONTAINS:
				sequence_Contains(context, (Contains) semanticObject); 
				return; 
			case BrowserAutomationPackage.DO_ACTION:
				sequence_DoAction(context, (DoAction) semanticObject); 
				return; 
			case BrowserAutomationPackage.GET:
				sequence_Get(context, (Get) semanticObject); 
				return; 
			case BrowserAutomationPackage.GO_TO:
				sequence_GoTo(context, (GoTo) semanticObject); 
				return; 
			case BrowserAutomationPackage.INSERT:
				sequence_Insert(context, (Insert) semanticObject); 
				return; 
			case BrowserAutomationPackage.ORDER:
				sequence_Order(context, (Order) semanticObject); 
				return; 
			case BrowserAutomationPackage.VAR_REFERENCE:
				sequence_VarReference(context, (VarReference) semanticObject); 
				return; 
			case BrowserAutomationPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case BrowserAutomationPackage.VERIFY:
				sequence_Verify(context, (Verify) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AttributeValue returns AttributeValue
	 *
	 * Constraint:
	 *     (stringVal=STRING | varRefVal=VarReference)
	 */
	protected void sequence_AttributeValue(ISerializationContext context, AttributeValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BrowserAutomation returns BrowserAutomation
	 *
	 * Constraint:
	 *     (testName=ID webBrowser=WebBrowser statements+=Statement*)
	 */
	protected void sequence_BrowserAutomation(ISerializationContext context, BrowserAutomation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Check
	 *     Check returns Check
	 *
	 * Constraint:
	 *     varCheck=VarReference
	 */
	protected void sequence_Check(ISerializationContext context, Check semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.CHECK__VAR_CHECK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.CHECK__VAR_CHECK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCheckAccess().getVarCheckVarReferenceParserRuleCall_1_0(), semanticObject.getVarCheck());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Choose
	 *     Choose returns Choose
	 *
	 * Constraint:
	 *     (value=STRING varChoose=VarReference)
	 */
	protected void sequence_Choose(ISerializationContext context, Choose semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.CHOOSE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.CHOOSE__VALUE));
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.CHOOSE__VAR_CHOOSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.CHOOSE__VAR_CHOOSE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChooseAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getChooseAccess().getVarChooseVarReferenceParserRuleCall_3_0(), semanticObject.getVarChoose());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Click
	 *     Click returns Click
	 *
	 * Constraint:
	 *     varRef=VarReference
	 */
	protected void sequence_Click(ISerializationContext context, Click semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.CLICK__VAR_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.CLICK__VAR_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClickAccess().getVarRefVarReferenceParserRuleCall_2_0(), semanticObject.getVarRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Contains
	 *     Contains returns Contains
	 *
	 * Constraint:
	 *     (varContains=VarReference varContained=VarReference)
	 */
	protected void sequence_Contains(ISerializationContext context, Contains semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.CONTAINS__VAR_CONTAINS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.CONTAINS__VAR_CONTAINS));
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.CONTAINS__VAR_CONTAINED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.CONTAINS__VAR_CONTAINED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContainsAccess().getVarContainsVarReferenceParserRuleCall_0_0(), semanticObject.getVarContains());
		feeder.accept(grammarAccess.getContainsAccess().getVarContainedVarReferenceParserRuleCall_2_0(), semanticObject.getVarContained());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns DoAction
	 *     DoAction returns DoAction
	 *
	 * Constraint:
	 *     (get=Get action=Action)
	 */
	protected void sequence_DoAction(ISerializationContext context, DoAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.DO_ACTION__GET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.DO_ACTION__GET));
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.DO_ACTION__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.DO_ACTION__ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDoActionAccess().getGetGetParserRuleCall_0_0(), semanticObject.getGet());
		feeder.accept(grammarAccess.getDoActionAccess().getActionActionParserRuleCall_1_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Get
	 *     Get returns Get
	 *
	 * Constraint:
	 *     (varRef=Variable ((element=Element order=Order? ((attr=Attribut attrVal=AttributeValue) | from=VarReference)) | pageTitle='pageTitle'))
	 */
	protected void sequence_Get(ISerializationContext context, Get semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns GoTo
	 *     GoTo returns GoTo
	 *
	 * Constraint:
	 *     url=STRING
	 */
	protected void sequence_GoTo(ISerializationContext context, GoTo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.GO_TO__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.GO_TO__URL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGoToAccess().getUrlSTRINGTerminalRuleCall_2_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Insert
	 *     Insert returns Insert
	 *
	 * Constraint:
	 *     ((attrVal=STRING | varRef=VarReference) var2=VarReference)
	 */
	protected void sequence_Insert(ISerializationContext context, Insert semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Order returns Order
	 *
	 * Constraint:
	 *     order=INT
	 */
	protected void sequence_Order(ISerializationContext context, Order semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.ORDER__ORDER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.ORDER__ORDER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrderAccess().getOrderINTTerminalRuleCall_1_0(), semanticObject.getOrder());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VarReference returns VarReference
	 *
	 * Constraint:
	 *     varRef=[Variable|ID]
	 */
	protected void sequence_VarReference(ISerializationContext context, VarReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.VAR_REFERENCE__VAR_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.VAR_REFERENCE__VAR_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarReferenceAccess().getVarRefVariableIDTerminalRuleCall_0_1(), semanticObject.eGet(BrowserAutomationPackage.Literals.VAR_REFERENCE__VAR_REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Verify
	 *     Verify returns Verify
	 *
	 * Constraint:
	 *     varToVerify=VarReference
	 */
	protected void sequence_Verify(ISerializationContext context, Verify semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.VERIFY__VAR_TO_VERIFY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.VERIFY__VAR_TO_VERIFY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVerifyAccess().getVarToVerifyVarReferenceParserRuleCall_0_0(), semanticObject.getVarToVerify());
		feeder.finish();
	}
	
	
}
