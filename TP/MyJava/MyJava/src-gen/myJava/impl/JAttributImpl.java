/**
 */
package myJava.impl;

import myJava.JAttribut;
import myJava.JExpression;
import myJava.MyJavaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JAttribut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link myJava.impl.JAttributImpl#getVal_init <em>Val init</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JAttributImpl extends DonneeTypeeImpl implements JAttribut {
	/**
	 * The cached value of the '{@link #getVal_init() <em>Val init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal_init()
	 * @generated
	 * @ordered
	 */
	protected JExpression val_init;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JAttributImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyJavaPackage.Literals.JATTRIBUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JExpression getVal_init() {
		return val_init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVal_init(JExpression newVal_init, NotificationChain msgs) {
		JExpression oldVal_init = val_init;
		val_init = newVal_init;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MyJavaPackage.JATTRIBUT__VAL_INIT, oldVal_init, newVal_init);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVal_init(JExpression newVal_init) {
		if (newVal_init != val_init) {
			NotificationChain msgs = null;
			if (val_init != null)
				msgs = ((InternalEObject) val_init).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MyJavaPackage.JATTRIBUT__VAL_INIT, null, msgs);
			if (newVal_init != null)
				msgs = ((InternalEObject) newVal_init).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MyJavaPackage.JATTRIBUT__VAL_INIT, null, msgs);
			msgs = basicSetVal_init(newVal_init, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.JATTRIBUT__VAL_INIT, newVal_init,
					newVal_init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MyJavaPackage.JATTRIBUT__VAL_INIT:
			return basicSetVal_init(null, msgs);
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
		case MyJavaPackage.JATTRIBUT__VAL_INIT:
			return getVal_init();
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
		case MyJavaPackage.JATTRIBUT__VAL_INIT:
			setVal_init((JExpression) newValue);
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
		case MyJavaPackage.JATTRIBUT__VAL_INIT:
			setVal_init((JExpression) null);
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
		case MyJavaPackage.JATTRIBUT__VAL_INIT:
			return val_init != null;
		}
		return super.eIsSet(featureID);
	}

} //JAttributImpl
