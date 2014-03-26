/**
 */
package survey;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see survey.SurveyFactory
 * @model kind="package"
 * @generated
 */
public interface SurveyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "survey";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/smdp.project.survey/model/model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "survey";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurveyPackage eINSTANCE = survey.impl.SurveyPackageImpl.init();

	/**
	 * The meta object id for the '{@link survey.impl.SurveyImpl <em>Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.SurveyImpl
	 * @see survey.impl.SurveyPackageImpl#getSurvey()
	 * @generated
	 */
	int SURVEY = 0;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__QUESTIONS = 0;

	/**
	 * The number of structural features of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.TextElementImpl <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.TextElementImpl
	 * @see survey.impl.SurveyPackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.QuestionImpl
	 * @see survey.impl.SurveyPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__DESCRIPTION = TEXT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NAME = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Previous Answers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REQUIRED_PREVIOUS_ANSWERS = TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__IS_OPTIONAL = TEXT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.OpenQuestionImpl <em>Open Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.OpenQuestionImpl
	 * @see survey.impl.SurveyPackageImpl#getOpenQuestion()
	 * @generated
	 */
	int OPEN_QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_QUESTION__DESCRIPTION = QUESTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_QUESTION__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Required Previous Answers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_QUESTION__REQUIRED_PREVIOUS_ANSWERS = QUESTION__REQUIRED_PREVIOUS_ANSWERS;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_QUESTION__IS_OPTIONAL = QUESTION__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Open Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_QUESTION__OPEN_ANSWER = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Open Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.MultipleChoiceImpl
	 * @see survey.impl.SurveyPackageImpl#getMultipleChoice()
	 * @generated
	 */
	int MULTIPLE_CHOICE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__DESCRIPTION = QUESTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Required Previous Answers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__REQUIRED_PREVIOUS_ANSWERS = QUESTION__REQUIRED_PREVIOUS_ANSWERS;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__IS_OPTIONAL = QUESTION__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__ANSWERS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.RadioChoiceImpl <em>Radio Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.RadioChoiceImpl
	 * @see survey.impl.SurveyPackageImpl#getRadioChoice()
	 * @generated
	 */
	int RADIO_CHOICE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_CHOICE__DESCRIPTION = QUESTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_CHOICE__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Required Previous Answers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_CHOICE__REQUIRED_PREVIOUS_ANSWERS = QUESTION__REQUIRED_PREVIOUS_ANSWERS;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_CHOICE__IS_OPTIONAL = QUESTION__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_CHOICE__ANSWERS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Radio Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_CHOICE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Radio Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_CHOICE_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.NamedElementImpl
	 * @see survey.impl.SurveyPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.AnswerImpl
	 * @see survey.impl.SurveyPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__DESCRIPTION = TEXT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__NAME = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.OpenAnswerImpl <em>Open Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.OpenAnswerImpl
	 * @see survey.impl.SurveyPackageImpl#getOpenAnswer()
	 * @generated
	 */
	int OPEN_ANSWER = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ANSWER__DESCRIPTION = ANSWER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ANSWER__NAME = ANSWER__NAME;

	/**
	 * The number of structural features of the '<em>Open Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ANSWER_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Open Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ANSWER_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link survey.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey</em>'.
	 * @see survey.Survey
	 * @generated
	 */
	EClass getSurvey();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Survey#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see survey.Survey#getQuestions()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_Questions();

	/**
	 * Returns the meta object for class '{@link survey.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see survey.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the reference list '{@link survey.Question#getRequiredPreviousAnswers <em>Required Previous Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Previous Answers</em>'.
	 * @see survey.Question#getRequiredPreviousAnswers()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_RequiredPreviousAnswers();

	/**
	 * Returns the meta object for the attribute '{@link survey.Question#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see survey.Question#isIsOptional()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_IsOptional();

	/**
	 * Returns the meta object for class '{@link survey.OpenQuestion <em>Open Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Question</em>'.
	 * @see survey.OpenQuestion
	 * @generated
	 */
	EClass getOpenQuestion();

	/**
	 * Returns the meta object for the containment reference '{@link survey.OpenQuestion#getOpenAnswer <em>Open Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Open Answer</em>'.
	 * @see survey.OpenQuestion#getOpenAnswer()
	 * @see #getOpenQuestion()
	 * @generated
	 */
	EReference getOpenQuestion_OpenAnswer();

	/**
	 * Returns the meta object for class '{@link survey.MultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Choice</em>'.
	 * @see survey.MultipleChoice
	 * @generated
	 */
	EClass getMultipleChoice();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.MultipleChoice#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see survey.MultipleChoice#getAnswers()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EReference getMultipleChoice_Answers();

	/**
	 * Returns the meta object for class '{@link survey.RadioChoice <em>Radio Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Choice</em>'.
	 * @see survey.RadioChoice
	 * @generated
	 */
	EClass getRadioChoice();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.RadioChoice#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see survey.RadioChoice#getAnswers()
	 * @see #getRadioChoice()
	 * @generated
	 */
	EReference getRadioChoice_Answers();

	/**
	 * Returns the meta object for class '{@link survey.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see survey.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link survey.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see survey.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link survey.OpenAnswer <em>Open Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Answer</em>'.
	 * @see survey.OpenAnswer
	 * @generated
	 */
	EClass getOpenAnswer();

	/**
	 * Returns the meta object for class '{@link survey.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see survey.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for class '{@link survey.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Element</em>'.
	 * @see survey.TextElement
	 * @generated
	 */
	EClass getTextElement();

	/**
	 * Returns the meta object for the attribute '{@link survey.TextElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see survey.TextElement#getDescription()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SurveyFactory getSurveyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link survey.impl.SurveyImpl <em>Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.SurveyImpl
		 * @see survey.impl.SurveyPackageImpl#getSurvey()
		 * @generated
		 */
		EClass SURVEY = eINSTANCE.getSurvey();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__QUESTIONS = eINSTANCE.getSurvey_Questions();

		/**
		 * The meta object literal for the '{@link survey.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.QuestionImpl
		 * @see survey.impl.SurveyPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Required Previous Answers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__REQUIRED_PREVIOUS_ANSWERS = eINSTANCE.getQuestion_RequiredPreviousAnswers();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__IS_OPTIONAL = eINSTANCE.getQuestion_IsOptional();

		/**
		 * The meta object literal for the '{@link survey.impl.OpenQuestionImpl <em>Open Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.OpenQuestionImpl
		 * @see survey.impl.SurveyPackageImpl#getOpenQuestion()
		 * @generated
		 */
		EClass OPEN_QUESTION = eINSTANCE.getOpenQuestion();

		/**
		 * The meta object literal for the '<em><b>Open Answer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_QUESTION__OPEN_ANSWER = eINSTANCE.getOpenQuestion_OpenAnswer();

		/**
		 * The meta object literal for the '{@link survey.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.MultipleChoiceImpl
		 * @see survey.impl.SurveyPackageImpl#getMultipleChoice()
		 * @generated
		 */
		EClass MULTIPLE_CHOICE = eINSTANCE.getMultipleChoice();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE__ANSWERS = eINSTANCE.getMultipleChoice_Answers();

		/**
		 * The meta object literal for the '{@link survey.impl.RadioChoiceImpl <em>Radio Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.RadioChoiceImpl
		 * @see survey.impl.SurveyPackageImpl#getRadioChoice()
		 * @generated
		 */
		EClass RADIO_CHOICE = eINSTANCE.getRadioChoice();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADIO_CHOICE__ANSWERS = eINSTANCE.getRadioChoice_Answers();

		/**
		 * The meta object literal for the '{@link survey.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.NamedElementImpl
		 * @see survey.impl.SurveyPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link survey.impl.OpenAnswerImpl <em>Open Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.OpenAnswerImpl
		 * @see survey.impl.SurveyPackageImpl#getOpenAnswer()
		 * @generated
		 */
		EClass OPEN_ANSWER = eINSTANCE.getOpenAnswer();

		/**
		 * The meta object literal for the '{@link survey.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.AnswerImpl
		 * @see survey.impl.SurveyPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '{@link survey.impl.TextElementImpl <em>Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.TextElementImpl
		 * @see survey.impl.SurveyPackageImpl#getTextElement()
		 * @generated
		 */
		EClass TEXT_ELEMENT = eINSTANCE.getTextElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__DESCRIPTION = eINSTANCE.getTextElement_Description();

	}

} //SurveyPackage
