package smdp.project.survey.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import smdp.project.survey.services.SurveyDSLGrammarAccess;
import survey.Answer;
import survey.MultipleChoice;
import survey.OpenAnswer;
import survey.OpenQuestion;
import survey.RadioChoice;
import survey.Survey;
import survey.SurveyPackage;

@SuppressWarnings("all")
public abstract class AbstractSurveyDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SurveyDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SurveyPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SurveyPackage.ANSWER:
				if(context == grammarAccess.getAnswerRule() ||
				   context == grammarAccess.getAnswer_ImplRule()) {
					sequence_Answer_Impl(context, (Answer) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.MULTIPLE_CHOICE:
				if(context == grammarAccess.getMultipleChoiceRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_MultipleChoice(context, (MultipleChoice) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.OPEN_ANSWER:
				if(context == grammarAccess.getAnswerRule() ||
				   context == grammarAccess.getOpenAnswerRule()) {
					sequence_OpenAnswer(context, (OpenAnswer) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.OPEN_QUESTION:
				if(context == grammarAccess.getOpenQuestionRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_OpenQuestion(context, (OpenQuestion) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.RADIO_CHOICE:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getRadioChoiceRule()) {
					sequence_RadioChoice(context, (RadioChoice) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.SURVEY:
				if(context == grammarAccess.getSurveyRule()) {
					sequence_Survey(context, (Survey) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString description=EString)
	 */
	protected void sequence_Answer_Impl(EObject context, Answer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.TEXT_ELEMENT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.TEXT_ELEMENT__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnswer_ImplAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAnswer_ImplAccess().getDescriptionEStringParserRuleCall_3_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         description=EString 
	 *         isOptional?='optional'? 
	 *         (requiredPreviousAnswers+=[Answer|EString] requiredPreviousAnswers+=[Answer|EString]*)? 
	 *         answers+=Answer+
	 *     )
	 */
	protected void sequence_MultipleChoice(EObject context, MultipleChoice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString description=EString?)
	 */
	protected void sequence_OpenAnswer(EObject context, OpenAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         description=EString 
	 *         isOptional?='optional'? 
	 *         (requiredPreviousAnswers+=[Answer|EString] requiredPreviousAnswers+=[Answer|EString]*)? 
	 *         openAnswer=OpenAnswer
	 *     )
	 */
	protected void sequence_OpenQuestion(EObject context, OpenQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         description=EString 
	 *         isOptional?='optional'? 
	 *         (requiredPreviousAnswers+=[Answer|EString] requiredPreviousAnswers+=[Answer|EString]*)? 
	 *         answers+=Answer+
	 *     )
	 */
	protected void sequence_RadioChoice(EObject context, RadioChoice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     questions+=Question+
	 */
	protected void sequence_Survey(EObject context, Survey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
