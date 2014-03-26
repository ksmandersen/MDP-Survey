/**
 */
package survey;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Survey#getQuestions <em>Questions</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getSurvey()
 * @model
 * @generated
 */
public interface Survey extends EObject {
	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link survey.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see survey.SurveyPackage#getSurvey_Questions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Question> getQuestions();

} // Survey
