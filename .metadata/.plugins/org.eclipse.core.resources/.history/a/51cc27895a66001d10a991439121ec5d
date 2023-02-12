/**
 */
package myJava.impl;

import java.util.Collection;

import myJava.JAppelMethode;
import myJava.JExpression;
import myJava.MyJavaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JAppel Methode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link myJava.impl.JAppelMethodeImpl#getCible <em>Cible</em>}</li>
 *   <li>{@link myJava.impl.JAppelMethodeImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link myJava.impl.JAppelMethodeImpl#getMethode <em>Methode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JAppelMethodeImpl extends JExpressionImpl implements JAppelMethode {
	/**
	 * The cached value of the '{@link #getCible() <em>Cible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCible()
	 * @generated
	 * @ordered
	 */
	protected JExpression cible;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<JExpression> arguments;

	/**
	 * The default value of the '{@link #getMethode() <em>Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethode()
	 * @generated
	 * @ordered
	 */
	protected static final String METHODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethode() <em>Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethode()
	 * @generated
	 * @ordered
	 */
	protected String methode = METHODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JAppelMethodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyJavaPackage.Literals.JAPPEL_METHODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JExpression getCible() {
		return cible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCible(JExpression newCible, NotificationChain msgs) {
		JExpression oldCible = cible;
		cible = newCible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MyJavaPackage.JAPPEL_METHODE__CIBLE, oldCible, newCible);
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
	public void setCible(JExpression newCible) {
		if (newCible != cible) {
			NotificationChain msgs = null;
			if (cible != null)
				msgs = ((InternalEObject) cible).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MyJavaPackage.JAPPEL_METHODE__CIBLE, null, msgs);
			if (newCible != null)
				msgs = ((InternalEObject) newCible).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MyJavaPackage.JAPPEL_METHODE__CIBLE, null, msgs);
			msgs = basicSetCible(newCible, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.JAPPEL_METHODE__CIBLE, newCible,
					newCible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JExpression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<JExpression>(JExpression.class, this,
					MyJavaPackage.JAPPEL_METHODE__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethode() {
		return methode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethode(String newMethode) {
		String oldMethode = methode;
		methode = newMethode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.JAPPEL_METHODE__METHODE, oldMethode,
					methode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MyJavaPackage.JAPPEL_METHODE__CIBLE:
			return basicSetCible(null, msgs);
		case MyJavaPackage.JAPPEL_METHODE__ARGUMENTS:
			return ((InternalEList<?>) getArguments()).basicRemove(otherEnd, msgs);
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
		case MyJavaPackage.JAPPEL_METHODE__CIBLE:
			return getCible();
		case MyJavaPackage.JAPPEL_METHODE__ARGUMENTS:
			return getArguments();
		case MyJavaPackage.JAPPEL_METHODE__METHODE:
			return getMethode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MyJavaPackage.JAPPEL_METHODE__CIBLE:
			setCible((JExpression) newValue);
			return;
		case MyJavaPackage.JAPPEL_METHODE__ARGUMENTS:
			getArguments().clear();
			getArguments().addAll((Collection<? extends JExpression>) newValue);
			return;
		case MyJavaPackage.JAPPEL_METHODE__METHODE:
			setMethode((String) newValue);
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
		case MyJavaPackage.JAPPEL_METHODE__CIBLE:
			setCible((JExpression) null);
			return;
		case MyJavaPackage.JAPPEL_METHODE__ARGUMENTS:
			getArguments().clear();
			return;
		case MyJavaPackage.JAPPEL_METHODE__METHODE:
			setMethode(METHODE_EDEFAULT);
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
		case MyJavaPackage.JAPPEL_METHODE__CIBLE:
			return cible != null;
		case MyJavaPackage.JAPPEL_METHODE__ARGUMENTS:
			return arguments != null && !arguments.isEmpty();
		case MyJavaPackage.JAPPEL_METHODE__METHODE:
			return METHODE_EDEFAULT == null ? methode != null : !METHODE_EDEFAULT.equals(methode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (methode: ");
		result.append(methode);
		result.append(')');
		return result.toString();
	}

} //JAppelMethodeImpl
