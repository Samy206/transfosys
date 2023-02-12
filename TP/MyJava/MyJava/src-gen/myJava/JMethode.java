/**
 */
package myJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JMethode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myJava.JMethode#getName <em>Name</em>}</li>
 *   <li>{@link myJava.JMethode#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link myJava.JMethode#getParametres <em>Parametres</em>}</li>
 * </ul>
 *
 * @see myJava.MyJavaPackage#getJMethode()
 * @model
 * @generated
 */
public interface JMethode extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see myJava.MyJavaPackage#getJMethode_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link myJava.JMethode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link myJava.JInstruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see myJava.MyJavaPackage#getJMethode_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<JInstruction> getInstructions();

	/**
	 * Returns the value of the '<em><b>Parametres</b></em>' containment reference list.
	 * The list contents are of type {@link myJava.JParametre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametres</em>' containment reference list.
	 * @see myJava.MyJavaPackage#getJMethode_Parametres()
	 * @model containment="true"
	 * @generated
	 */
	EList<JParametre> getParametres();

} // JMethode
