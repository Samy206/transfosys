/**
 */
package myJava.provider;

import java.util.Collection;
import java.util.List;

import myJava.JClasse;
import myJava.MyJavaFactory;
import myJava.MyJavaPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link myJava.JClasse} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JClasseItemProvider extends JTypeDeclItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClasseItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MyJavaPackage.Literals.JCLASSE__CLASSES_INTERNES);
			childrenFeatures.add(MyJavaPackage.Literals.JCLASSE__EXTENDS);
			childrenFeatures.add(MyJavaPackage.Literals.JCLASSE__METHODES);
			childrenFeatures.add(MyJavaPackage.Literals.JCLASSE__ATTRIBUTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns JClasse.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JClasse"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JClasse) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_JClasse_type")
				: getString("_UI_JClasse_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(JClasse.class)) {
		case MyJavaPackage.JCLASSE__CLASSES_INTERNES:
		case MyJavaPackage.JCLASSE__EXTENDS:
		case MyJavaPackage.JCLASSE__METHODES:
		case MyJavaPackage.JCLASSE__ATTRIBUTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JCLASSE__CLASSES_INTERNES,
				MyJavaFactory.eINSTANCE.createJClasse()));

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JCLASSE__CLASSES_INTERNES,
				MyJavaFactory.eINSTANCE.createJClasseLibrairie()));

		newChildDescriptors.add(
				createChildParameter(MyJavaPackage.Literals.JCLASSE__EXTENDS, MyJavaFactory.eINSTANCE.createJClasse()));

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JCLASSE__EXTENDS,
				MyJavaFactory.eINSTANCE.createJClasseLibrairie()));

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JCLASSE__METHODES,
				MyJavaFactory.eINSTANCE.createJMethode()));

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JCLASSE__METHODES,
				MyJavaFactory.eINSTANCE.createJConstructeur()));

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JCLASSE__ATTRIBUTS,
				MyJavaFactory.eINSTANCE.createJAttribut()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == MyJavaPackage.Literals.JCLASSE__CLASSES_INTERNES
				|| childFeature == MyJavaPackage.Literals.JCLASSE__EXTENDS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
