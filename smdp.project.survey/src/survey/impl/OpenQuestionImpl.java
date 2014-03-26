/**
 */
package survey.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import survey.OpenAnswer;
import survey.OpenQuestion;
import survey.SurveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.OpenQuestionImpl#getOpenAnswer <em>Open Answer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenQuestionImpl extends QuestionImpl implements OpenQuestion {
	/**
	 * The cached value of the '{@link #getOpenAnswer() <em>Open Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenAnswer()
	 * @generated
	 * @ordered
	 */
	protected OpenAnswer openAnswer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.OPEN_QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAnswer getOpenAnswer() {
		return openAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenAnswer(OpenAnswer newOpenAnswer, NotificationChain msgs) {
		OpenAnswer oldOpenAnswer = openAnswer;
		openAnswer = newOpenAnswer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SurveyPackage.OPEN_QUESTION__OPEN_ANSWER, oldOpenAnswer, newOpenAnswer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenAnswer(OpenAnswer newOpenAnswer) {
		if (newOpenAnswer != openAnswer) {
			NotificationChain msgs = null;
			if (openAnswer != null)
				msgs = ((InternalEObject)openAnswer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SurveyPackage.OPEN_QUESTION__OPEN_ANSWER, null, msgs);
			if (newOpenAnswer != null)
				msgs = ((InternalEObject)newOpenAnswer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SurveyPackage.OPEN_QUESTION__OPEN_ANSWER, null, msgs);
			msgs = basicSetOpenAnswer(newOpenAnswer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.OPEN_QUESTION__OPEN_ANSWER, newOpenAnswer, newOpenAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SurveyPackage.OPEN_QUESTION__OPEN_ANSWER:
				return basicSetOpenAnswer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.OPEN_QUESTION__OPEN_ANSWER:
				return getOpenAnswer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SurveyPackage.OPEN_QUESTION__OPEN_ANSWER:
				setOpenAnswer((OpenAnswer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SurveyPackage.OPEN_QUESTION__OPEN_ANSWER:
				setOpenAnswer((OpenAnswer)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SurveyPackage.OPEN_QUESTION__OPEN_ANSWER:
				return openAnswer != null;
		}
		return super.eIsSet(featureID);
	}

} //OpenQuestionImpl
