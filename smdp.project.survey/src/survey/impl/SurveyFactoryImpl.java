/**
 */
package survey.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import survey.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurveyFactoryImpl extends EFactoryImpl implements SurveyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SurveyFactory init() {
		try {
			SurveyFactory theSurveyFactory = (SurveyFactory)EPackage.Registry.INSTANCE.getEFactory(SurveyPackage.eNS_URI);
			if (theSurveyFactory != null) {
				return theSurveyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SurveyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SurveyPackage.SURVEY: return createSurvey();
			case SurveyPackage.OPEN_QUESTION: return createOpenQuestion();
			case SurveyPackage.MULTIPLE_CHOICE: return createMultipleChoice();
			case SurveyPackage.RADIO_CHOICE: return createRadioChoice();
			case SurveyPackage.NAMED_ELEMENT: return createNamedElement();
			case SurveyPackage.OPEN_ANSWER: return createOpenAnswer();
			case SurveyPackage.ANSWER: return createAnswer();
			case SurveyPackage.TEXT_ELEMENT: return createTextElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Survey createSurvey() {
		SurveyImpl survey = new SurveyImpl();
		return survey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenQuestion createOpenQuestion() {
		OpenQuestionImpl openQuestion = new OpenQuestionImpl();
		return openQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoice createMultipleChoice() {
		MultipleChoiceImpl multipleChoice = new MultipleChoiceImpl();
		return multipleChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioChoice createRadioChoice() {
		RadioChoiceImpl radioChoice = new RadioChoiceImpl();
		return radioChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAnswer createOpenAnswer() {
		OpenAnswerImpl openAnswer = new OpenAnswerImpl();
		return openAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer createAnswer() {
		AnswerImpl answer = new AnswerImpl();
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextElement createTextElement() {
		TextElementImpl textElement = new TextElementImpl();
		return textElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyPackage getSurveyPackage() {
		return (SurveyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SurveyPackage getPackage() {
		return SurveyPackage.eINSTANCE;
	}

} //SurveyFactoryImpl
