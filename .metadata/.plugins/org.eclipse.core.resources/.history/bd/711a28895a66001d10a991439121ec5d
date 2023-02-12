/**
 */
package myJava.impl;

import java.util.Collection;

import myJava.JCreation;
import myJava.JExpression;
import myJava.JTypeDecl;
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
 * An implementation of the model object '<em><b>JCreation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link myJava.impl.JCreationImpl#getClasse <em>Classe</em>}</li>
 *   <li>{@link myJava.impl.JCreationImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JCreationImpl extends JExpressionImpl implements JCreation {
	/**
	 * The cached value of the '{@link #getClasse() <em>Classe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasse()
	 * @generated
	 * @ordered
	 */
	protected JTypeDecl classe;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JCreationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyJavaPackage.Literals.JCREATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JTypeDecl getClasse() {
		if (classe != null && classe.eIsProxy()) {
			InternalEObject oldClasse = (InternalEObject) classe;
			classe = (JTypeDecl) eResolveProxy(oldClasse);
			if (classe != oldClasse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyJavaPackage.JCREATION__CLASSE,
							oldClasse, classe));
			}
		}
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JTypeDecl basicGetClasse() {
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasse(JTypeDecl newClasse) {
		JTypeDecl oldClasse = classe;
		classe = newClasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.JCREATION__CLASSE, oldClasse, classe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JExpression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<JExpression>(JExpression.class, this,
					MyJavaPackage.JCREATION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MyJavaPackage.JCREATION__ARGUMENTS:
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
		case MyJavaPackage.JCREATION__CLASSE:
			if (resolve)
				return getClasse();
			return basicGetClasse();
		case MyJavaPackage.JCREATION__ARGUMENTS:
			return getArguments();
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
		case MyJavaPackage.JCREATION__CLASSE:
			setClasse((JTypeDecl) newValue);
			return;
		case MyJavaPackage.JCREATION__ARGUMENTS:
			getArguments().clear();
			getArguments().addAll((Collection<? extends JExpression>) newValue);
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
		case MyJavaPackage.JCREATION__CLASSE:
			setClasse((JTypeDecl) null);
			return;
		case MyJavaPackage.JCREATION__ARGUMENTS:
			getArguments().clear();
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
		case MyJavaPackage.JCREATION__CLASSE:
			return classe != null;
		case MyJavaPackage.JCREATION__ARGUMENTS:
			return arguments != null && !arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JCreationImpl
