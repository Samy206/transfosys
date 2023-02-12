/**
 */
package composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link composant.Composant#getFils <em>Fils</em>}</li>
 *   <li>{@link composant.Composant#getPorts <em>Ports</em>}</li>
 *   <li>{@link composant.Composant#getConnecteurs <em>Connecteurs</em>}</li>
 *   <li>{@link composant.Composant#getPere <em>Pere</em>}</li>
 * </ul>
 *
 * @see composant.ComposantPackage#getComposant()
 * @model
 * @generated
 */
public interface Composant extends Element {
	/**
	 * Returns the value of the '<em><b>Fils</b></em>' containment reference list.
	 * The list contents are of type {@link composant.Composant}.
	 * It is bidirectional and its opposite is '{@link composant.Composant#getPere <em>Pere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fils</em>' containment reference list.
	 * @see composant.ComposantPackage#getComposant_Fils()
	 * @see composant.Composant#getPere
	 * @model opposite="pere" containment="true"
	 * @generated
	 */
	EList<Composant> getFils();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link composant.Port}.
	 * It is bidirectional and its opposite is '{@link composant.Port#getComposant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see composant.ComposantPackage#getComposant_Ports()
	 * @see composant.Port#getComposant
	 * @model opposite="composant" containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Connecteurs</b></em>' containment reference list.
	 * The list contents are of type {@link composant.Connecteur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connecteurs</em>' containment reference list.
	 * @see composant.ComposantPackage#getComposant_Connecteurs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connecteur> getConnecteurs();

	/**
	 * Returns the value of the '<em><b>Pere</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link composant.Composant#getFils <em>Fils</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pere</em>' container reference.
	 * @see #setPere(Composant)
	 * @see composant.ComposantPackage#getComposant_Pere()
	 * @see composant.Composant#getFils
	 * @model opposite="fils" transient="false"
	 * @generated
	 */
	Composant getPere();

	/**
	 * Sets the value of the '{@link composant.Composant#getPere <em>Pere</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pere</em>' container reference.
	 * @see #getPere()
	 * @generated
	 */
	void setPere(Composant value);

} // Composant
