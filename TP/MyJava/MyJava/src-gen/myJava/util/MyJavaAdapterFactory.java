/**
 */
package myJava.util;

import myJava.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see myJava.MyJavaPackage
 * @generated
 */
public class MyJavaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MyJavaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyJavaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MyJavaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyJavaSwitch<Adapter> modelSwitch = new MyJavaSwitch<Adapter>() {
		@Override
		public Adapter caseJTypeDecl(JTypeDecl object) {
			return createJTypeDeclAdapter();
		}

		@Override
		public Adapter caseJClasse(JClasse object) {
			return createJClasseAdapter();
		}

		@Override
		public Adapter caseJClasseLibrairie(JClasseLibrairie object) {
			return createJClasseLibrairieAdapter();
		}

		@Override
		public Adapter caseJMethode(JMethode object) {
			return createJMethodeAdapter();
		}

		@Override
		public Adapter caseJAttribut(JAttribut object) {
			return createJAttributAdapter();
		}

		@Override
		public Adapter caseJInstruction(JInstruction object) {
			return createJInstructionAdapter();
		}

		@Override
		public Adapter caseDeclaration(Declaration object) {
			return createDeclarationAdapter();
		}

		@Override
		public Adapter caseJExpression(JExpression object) {
			return createJExpressionAdapter();
		}

		@Override
		public Adapter caseJAppelMethode(JAppelMethode object) {
			return createJAppelMethodeAdapter();
		}

		@Override
		public Adapter caseJCreation(JCreation object) {
			return createJCreationAdapter();
		}

		@Override
		public Adapter caseJVarRef(JVarRef object) {
			return createJVarRefAdapter();
		}

		@Override
		public Adapter caseStringConstante(StringConstante object) {
			return createStringConstanteAdapter();
		}

		@Override
		public Adapter caseJConstructeur(JConstructeur object) {
			return createJConstructeurAdapter();
		}

		@Override
		public Adapter caseJParametre(JParametre object) {
			return createJParametreAdapter();
		}

		@Override
		public Adapter caseJType(JType object) {
			return createJTypeAdapter();
		}

		@Override
		public Adapter caseTypeRef(TypeRef object) {
			return createTypeRefAdapter();
		}

		@Override
		public Adapter caseTypeBase(TypeBase object) {
			return createTypeBaseAdapter();
		}

		@Override
		public Adapter caseDonneeTypee(DonneeTypee object) {
			return createDonneeTypeeAdapter();
		}

		@Override
		public Adapter caseIntConstante(IntConstante object) {
			return createIntConstanteAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.JTypeDecl <em>JType Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.JTypeDecl
	 * @generated
	 */
	public Adapter createJTypeDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.JClasse <em>JClasse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.JClasse
	 * @generated
	 */
	public Adapter createJClasseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.JClasseLibrairie <em>JClasse Librairie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.JClasseLibrairie
	 * @generated
	 */
	public Adapter createJClasseLibrairieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.JMethode <em>JMethode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.JMethode
	 * @generated
	 */
	public Adapter createJMethodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.JAttribut <em>JAttribut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.JAttribut
	 * @generated
	 */
	public Adapter createJAttributAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.JInstruction <em>JInstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.JInstruction
	 * @generated
	 */
	public Adapter createJInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.JExpression <em>JExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.JExpression
	 * @generated
	 */
	public Adapter createJExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.JAppelMethode <em>JAppel Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.JAppelMethode
	 * @generated
	 */
	public Adapter createJAppelMethodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.JCreation <em>JCreation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.JCreation
	 * @generated
	 */
	public Adapter createJCreationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.JVarRef <em>JVar Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.JVarRef
	 * @generated
	 */
	public Adapter createJVarRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.StringConstante <em>String Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.StringConstante
	 * @generated
	 */
	public Adapter createStringConstanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.JConstructeur <em>JConstructeur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.JConstructeur
	 * @generated
	 */
	public Adapter createJConstructeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.JParametre <em>JParametre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.JParametre
	 * @generated
	 */
	public Adapter createJParametreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.JType <em>JType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.JType
	 * @generated
	 */
	public Adapter createJTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.TypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.TypeRef
	 * @generated
	 */
	public Adapter createTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.TypeBase <em>Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.TypeBase
	 * @generated
	 */
	public Adapter createTypeBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.DonneeTypee <em>Donnee Typee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.DonneeTypee
	 * @generated
	 */
	public Adapter createDonneeTypeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myJava.IntConstante <em>Int Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myJava.IntConstante
	 * @generated
	 */
	public Adapter createIntConstanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MyJavaAdapterFactory
