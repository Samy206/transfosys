/**
 */
package composant.impl;

import composant.ComposantPackage;
import composant.Connecteur;
import composant.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connecteur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link composant.impl.ConnecteurImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link composant.impl.ConnecteurImpl#getDst <em>Dst</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnecteurImpl extends ElementImpl implements Connecteur {
	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Port src;

	/**
	 * The cached value of the '{@link #getDst() <em>Dst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDst()
	 * @generated
	 * @ordered
	 */
	protected Port dst;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnecteurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComposantPackage.Literals.CONNECTEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject) src;
			src = (Port) eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComposantPackage.CONNECTEUR__SRC, oldSrc,
							src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(Port newSrc) {
		Port oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComposantPackage.CONNECTEUR__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getDst() {
		if (dst != null && dst.eIsProxy()) {
			InternalEObject oldDst = (InternalEObject) dst;
			dst = (Port) eResolveProxy(oldDst);
			if (dst != oldDst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComposantPackage.CONNECTEUR__DST, oldDst,
							dst));
			}
		}
		return dst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetDst() {
		return dst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDst(Port newDst) {
		Port oldDst = dst;
		dst = newDst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComposantPackage.CONNECTEUR__DST, oldDst, dst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComposantPackage.CONNECTEUR__SRC:
			if (resolve)
				return getSrc();
			return basicGetSrc();
		case ComposantPackage.CONNECTEUR__DST:
			if (resolve)
				return getDst();
			return basicGetDst();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ComposantPackage.CONNECTEUR__SRC:
			setSrc((Port) newValue);
			return;
		case ComposantPackage.CONNECTEUR__DST:
			setDst((Port) newValue);
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
		case ComposantPackage.CONNECTEUR__SRC:
			setSrc((Port) null);
			return;
		case ComposantPackage.CONNECTEUR__DST:
			setDst((Port) null);
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
		case ComposantPackage.CONNECTEUR__SRC:
			return src != null;
		case ComposantPackage.CONNECTEUR__DST:
			return dst != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnecteurImpl
