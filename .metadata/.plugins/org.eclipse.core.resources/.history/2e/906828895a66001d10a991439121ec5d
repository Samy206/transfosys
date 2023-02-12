/**
 */
package myJava.impl;

import java.util.Collection;

import myJava.JInstruction;
import myJava.JMethode;
import myJava.JParametre;
import myJava.MyJavaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JMethode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link myJava.impl.JMethodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link myJava.impl.JMethodeImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link myJava.impl.JMethodeImpl#getParametres <em>Parametres</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JMethodeImpl extends MinimalEObjectImpl.Container implements JMethode {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<JInstruction> instructions;

	/**
	 * The cached value of the '{@link #getParametres() <em>Parametres</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametres()
	 * @generated
	 * @ordered
	 */
	protected EList<JParametre> parametres;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JMethodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyJavaPackage.Literals.JMETHODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.JMETHODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JInstruction> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentEList<JInstruction>(JInstruction.class, this,
					MyJavaPackage.JMETHODE__INSTRUCTIONS);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JParametre> getParametres() {
		if (parametres == null) {
			parametres = new EObjectContainmentEList<JParametre>(JParametre.class, this,
					MyJavaPackage.JMETHODE__PARAMETRES);
		}
		return parametres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MyJavaPackage.JMETHODE__INSTRUCTIONS:
			return ((InternalEList<?>) getInstructions()).basicRemove(otherEnd, msgs);
		case MyJavaPackage.JMETHODE__PARAMETRES:
			return ((InternalEList<?>) getParametres()).basicRemove(otherEnd, msgs);
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
		case MyJavaPackage.JMETHODE__NAME:
			return getName();
		case MyJavaPackage.JMETHODE__INSTRUCTIONS:
			return getInstructions();
		case MyJavaPackage.JMETHODE__PARAMETRES:
			return getParametres();
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
		case MyJavaPackage.JMETHODE__NAME:
			setName((String) newValue);
			return;
		case MyJavaPackage.JMETHODE__INSTRUCTIONS:
			getInstructions().clear();
			getInstructions().addAll((Collection<? extends JInstruction>) newValue);
			return;
		case MyJavaPackage.JMETHODE__PARAMETRES:
			getParametres().clear();
			getParametres().addAll((Collection<? extends JParametre>) newValue);
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
		case MyJavaPackage.JMETHODE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MyJavaPackage.JMETHODE__INSTRUCTIONS:
			getInstructions().clear();
			return;
		case MyJavaPackage.JMETHODE__PARAMETRES:
			getParametres().clear();
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
		case MyJavaPackage.JMETHODE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MyJavaPackage.JMETHODE__INSTRUCTIONS:
			return instructions != null && !instructions.isEmpty();
		case MyJavaPackage.JMETHODE__PARAMETRES:
			return parametres != null && !parametres.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //JMethodeImpl
