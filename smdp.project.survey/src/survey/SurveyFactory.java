/**
 */
package survey;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see survey.SurveyPackage
 * @generated
 */
public interface SurveyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurveyFactory eINSTANCE = survey.impl.SurveyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Survey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Survey</em>'.
	 * @generated
	 */
	Survey createSurvey();

	/**
	 * Returns a new object of class '<em>Open Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Question</em>'.
	 * @generated
	 */
	OpenQuestion createOpenQuestion();

	/**
	 * Returns a new object of class '<em>Multiple Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Choice</em>'.
	 * @generated
	 */
	MultipleChoice createMultipleChoice();

	/**
	 * Returns a new object of class '<em>Radio Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Choice</em>'.
	 * @generated
	 */
	RadioChoice createRadioChoice();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Open Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Answer</em>'.
	 * @generated
	 */
	OpenAnswer createOpenAnswer();

	/**
	 * Returns a new object of class '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Answer</em>'.
	 * @generated
	 */
	Answer createAnswer();

	/**
	 * Returns a new object of class '<em>Text Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Element</em>'.
	 * @generated
	 */
	TextElement createTextElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SurveyPackage getSurveyPackage();

} //SurveyFactory
