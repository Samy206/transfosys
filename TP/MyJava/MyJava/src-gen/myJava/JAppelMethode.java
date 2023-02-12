/**
 */
package myJava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JAppel Methode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myJava.JAppelMethode#getCible <em>Cible</em>}</li>
 *   <li>{@link myJava.JAppelMethode#getArguments <em>Arguments</em>}</li>
 *   <li>{@link myJava.JAppelMethode#getMethode <em>Methode</em>}</li>
 * </ul>
 *
 * @see myJava.MyJavaPackage#getJAppelMethode()
 * @model
 * @generated
 */
public interface JAppelMethode extends JExpression {
	/**
	 * Returns the value of the '<em><b>Cible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cible</em>' containment reference.
	 * @see #setCible(JExpression)
	 * @see myJava.MyJavaPackage#getJAppelMethode_Cible()
	 * @model containment="true"
	 * @generated
	 */
	JExpression getCible();

	/**
	 * Sets the value of the '{@link myJava.JAppelMethode#getCible <em>Cible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cible</em>' containment reference.
	 * @see #getCible()
	 * @generated
	 */
	void setCible(JExpression value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link myJava.JExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see myJava.MyJavaPackage#getJAppelMethode_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<JExpression> getArguments();

	/**
	 * Returns the value of the '<em><b>Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methode</em>' attribute.
	 * @see #setMethode(String)
	 * @see myJava.MyJavaPackage#getJAppelMethode_Methode()
	 * @model required="true"
	 * @generated
	 */
	String getMethode();

	/**
	 * Sets the value of the '{@link myJava.JAppelMethode#getMethode <em>Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methode</em>' attribute.
	 * @see #getMethode()
	 * @generated
	 */
	void setMethode(String value);

} // JAppelMethode
