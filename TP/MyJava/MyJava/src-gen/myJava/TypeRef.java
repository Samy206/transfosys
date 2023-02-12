/**
 */
package myJava;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myJava.TypeRef#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see myJava.MyJavaPackage#getTypeRef()
 * @model
 * @generated
 */
public interface TypeRef extends JType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(JTypeDecl)
	 * @see myJava.MyJavaPackage#getTypeRef_Type()
	 * @model required="true"
	 * @generated
	 */
	JTypeDecl getType();

	/**
	 * Sets the value of the '{@link myJava.TypeRef#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(JTypeDecl value);

} // TypeRef
