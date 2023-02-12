/**
 */
package myJava.provider;

import java.util.Collection;
import java.util.List;

import myJava.JAppelMethode;
import myJava.MyJavaFactory;
import myJava.MyJavaPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link myJava.JAppelMethode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JAppelMethodeItemProvider extends JExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAppelMethodeItemProvider(AdapterFactory adapterFactory) {
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

			addMethodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Methode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_JAppelMethode_methode_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_JAppelMethode_methode_feature",
								"_UI_JAppelMethode_type"),
						MyJavaPackage.Literals.JAPPEL_METHODE__METHODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(MyJavaPackage.Literals.JAPPEL_METHODE__CIBLE);
			childrenFeatures.add(MyJavaPackage.Literals.JAPPEL_METHODE__ARGUMENTS);
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
	 * This returns JAppelMethode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JAppelMethode"));
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
		String label = ((JAppelMethode) object).getMethode();
		return label == null || label.length() == 0 ? getString("_UI_JAppelMethode_type")
				: getString("_UI_JAppelMethode_type") + " " + label;
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

		switch (notification.getFeatureID(JAppelMethode.class)) {
		case MyJavaPackage.JAPPEL_METHODE__METHODE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case MyJavaPackage.JAPPEL_METHODE__CIBLE:
		case MyJavaPackage.JAPPEL_METHODE__ARGUMENTS:
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

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JAPPEL_METHODE__CIBLE,
				MyJavaFactory.eINSTANCE.createJAppelMethode()));

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JAPPEL_METHODE__CIBLE,
				MyJavaFactory.eINSTANCE.createJCreation()));

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JAPPEL_METHODE__CIBLE,
				MyJavaFactory.eINSTANCE.createJVarRef()));

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JAPPEL_METHODE__CIBLE,
				MyJavaFactory.eINSTANCE.createStringConstante()));

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JAPPEL_METHODE__CIBLE,
				MyJavaFactory.eINSTANCE.createIntConstante()));

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JAPPEL_METHODE__ARGUMENTS,
				MyJavaFactory.eINSTANCE.createJAppelMethode()));

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JAPPEL_METHODE__ARGUMENTS,
				MyJavaFactory.eINSTANCE.createJCreation()));

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JAPPEL_METHODE__ARGUMENTS,
				MyJavaFactory.eINSTANCE.createJVarRef()));

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JAPPEL_METHODE__ARGUMENTS,
				MyJavaFactory.eINSTANCE.createStringConstante()));

		newChildDescriptors.add(createChildParameter(MyJavaPackage.Literals.JAPPEL_METHODE__ARGUMENTS,
				MyJavaFactory.eINSTANCE.createIntConstante()));
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

		boolean qualify = childFeature == MyJavaPackage.Literals.JAPPEL_METHODE__CIBLE
				|| childFeature == MyJavaPackage.Literals.JAPPEL_METHODE__ARGUMENTS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
