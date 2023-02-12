/**
 */
package myJava;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JVar Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myJava.JVarRef#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see myJava.MyJavaPackage#getJVarRef()
 * @model
 * @generated
 */
public interface JVarRef extends JExpression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(DonneeTypee)
	 * @see myJava.MyJavaPackage#getJVarRef_Variable()
	 * @model required="true"
	 * @generated
	 */
	DonneeTypee getVariable();

	/**
	 * Sets the value of the '{@link myJava.JVarRef#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(DonneeTypee value);

} // JVarRef
