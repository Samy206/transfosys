/**
 */
package myJava;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myJava.Declaration#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see myJava.MyJavaPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends JInstruction, DonneeTypee {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(JExpression)
	 * @see myJava.MyJavaPackage#getDeclaration_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JExpression getExpression();

	/**
	 * Sets the value of the '{@link myJava.Declaration#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(JExpression value);

} // Declaration
