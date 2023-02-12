/**
 */
package composant.impl;

import composant.Composant;
import composant.ComposantPackage;
import composant.Connecteur;
import composant.Port;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link composant.impl.ComposantImpl#getFils <em>Fils</em>}</li>
 *   <li>{@link composant.impl.ComposantImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link composant.impl.ComposantImpl#getConnecteurs <em>Connecteurs</em>}</li>
 *   <li>{@link composant.impl.ComposantImpl#getPere <em>Pere</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposantImpl extends ElementImpl implements Composant {
	/**
	 * The cached value of the '{@link #getFils() <em>Fils</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFils()
	 * @generated
	 * @ordered
	 */
	protected EList<Composant> fils;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getConnecteurs() <em>Connecteurs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnecteurs()
	 * @generated
	 * @ordered
	 */
	protected EList<Connecteur> connecteurs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComposantPackage.Literals.COMPOSANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composant> getFils() {
		if (fils == null) {
			fils = new EObjectContainmentWithInverseEList<Composant>(Composant.class, this,
					ComposantPackage.COMPOSANT__FILS, ComposantPackage.COMPOSANT__PERE);
		}
		return fils;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentWithInverseEList<Port>(Port.class, this, ComposantPackage.COMPOSANT__PORTS,
					ComposantPackage.PORT__COMPOSANT);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connecteur> getConnecteurs() {
		if (connecteurs == null) {
			connecteurs = new EObjectContainmentEList<Connecteur>(Connecteur.class, this,
					ComposantPackage.COMPOSANT__CONNECTEURS);
		}
		return connecteurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composant getPere() {
		if (eContainerFeatureID() != ComposantPackage.COMPOSANT__PERE)
			return null;
		return (Composant) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPere(Composant newPere, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPere, ComposantPackage.COMPOSANT__PERE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPere(Composant newPere) {
		if (newPere != eInternalContainer()
				|| (eContainerFeatureID() != ComposantPackage.COMPOSANT__PERE && newPere != null)) {
			if (EcoreUtil.isAncestor(this, newPere))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPere != null)
				msgs = ((InternalEObject) newPere).eInverseAdd(this, ComposantPackage.COMPOSANT__FILS, Composant.class,
						msgs);
			msgs = basicSetPere(newPere, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComposantPackage.COMPOSANT__PERE, newPere, newPere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComposantPackage.COMPOSANT__FILS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFils()).basicAdd(otherEnd, msgs);
		case ComposantPackage.COMPOSANT__PORTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPorts()).basicAdd(otherEnd, msgs);
		case ComposantPackage.COMPOSANT__PERE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPere((Composant) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComposantPackage.COMPOSANT__FILS:
			return ((InternalEList<?>) getFils()).basicRemove(otherEnd, msgs);
		case ComposantPackage.COMPOSANT__PORTS:
			return ((InternalEList<?>) getPorts()).basicRemove(otherEnd, msgs);
		case ComposantPackage.COMPOSANT__CONNECTEURS:
			return ((InternalEList<?>) getConnecteurs()).basicRemove(otherEnd, msgs);
		case ComposantPackage.COMPOSANT__PERE:
			return basicSetPere(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ComposantPackage.COMPOSANT__PERE:
			return eInternalContainer().eInverseRemove(this, ComposantPackage.COMPOSANT__FILS, Composant.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComposantPackage.COMPOSANT__FILS:
			return getFils();
		case ComposantPackage.COMPOSANT__PORTS:
			return getPorts();
		case ComposantPackage.COMPOSANT__CONNECTEURS:
			return getConnecteurs();
		case ComposantPackage.COMPOSANT__PERE:
			return getPere();
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
		case ComposantPackage.COMPOSANT__FILS:
			getFils().clear();
			getFils().addAll((Collection<? extends Composant>) newValue);
			return;
		case ComposantPackage.COMPOSANT__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends Port>) newValue);
			return;
		case ComposantPackage.COMPOSANT__CONNECTEURS:
			getConnecteurs().clear();
			getConnecteurs().addAll((Collection<? extends Connecteur>) newValue);
			return;
		case ComposantPackage.COMPOSANT__PERE:
			setPere((Composant) newValue);
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
		case ComposantPackage.COMPOSANT__FILS:
			getFils().clear();
			return;
		case ComposantPackage.COMPOSANT__PORTS:
			getPorts().clear();
			return;
		case ComposantPackage.COMPOSANT__CONNECTEURS:
			getConnecteurs().clear();
			return;
		case ComposantPackage.COMPOSANT__PERE:
			setPere((Composant) null);
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
		case ComposantPackage.COMPOSANT__FILS:
			return fils != null && !fils.isEmpty();
		case ComposantPackage.COMPOSANT__PORTS:
			return ports != null && !ports.isEmpty();
		case ComposantPackage.COMPOSANT__CONNECTEURS:
			return connecteurs != null && !connecteurs.isEmpty();
		case ComposantPackage.COMPOSANT__PERE:
			return getPere() != null;
		}
		return super.eIsSet(featureID);
	}

} //ComposantImpl
