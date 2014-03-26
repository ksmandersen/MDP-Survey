/**
 */
package survey;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.OpenQuestion#getOpenAnswer <em>Open Answer</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getOpenQuestion()
 * @model
 * @generated
 */
public interface OpenQuestion extends Question {
	/**
	 * Returns the value of the '<em><b>Open Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Answer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Answer</em>' containment reference.
	 * @see #setOpenAnswer(OpenAnswer)
	 * @see survey.SurveyPackage#getOpenQuestion_OpenAnswer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OpenAnswer getOpenAnswer();

	/**
	 * Sets the value of the '{@link survey.OpenQuestion#getOpenAnswer <em>Open Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Answer</em>' containment reference.
	 * @see #getOpenAnswer()
	 * @generated
	 */
	void setOpenAnswer(OpenAnswer value);

} // OpenQuestion
