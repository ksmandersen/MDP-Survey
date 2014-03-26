/**
 */
package survey;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Question#getRequiredPreviousAnswers <em>Required Previous Answers</em>}</li>
 *   <li>{@link survey.Question#isIsOptional <em>Is Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getQuestion()
 * @model abstract="true"
 * @generated
 */
public interface Question extends TextElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Required Previous Answers</b></em>' reference list.
	 * The list contents are of type {@link survey.Answer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Previous Answers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Previous Answers</em>' reference list.
	 * @see survey.SurveyPackage#getQuestion_RequiredPreviousAnswers()
	 * @model
	 * @generated
	 */
	EList<Answer> getRequiredPreviousAnswers();

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(boolean)
	 * @see survey.SurveyPackage#getQuestion_IsOptional()
	 * @model
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link survey.Question#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

} // Question
