/**
 */
package myJava.impl;

import myJava.Declaration;
import myJava.DonneeTypee;
import myJava.IntConstante;
import myJava.JAppelMethode;
import myJava.JAttribut;
import myJava.JClasse;
import myJava.JClasseLibrairie;
import myJava.JConstructeur;
import myJava.JCreation;
import myJava.JExpression;
import myJava.JInstruction;
import myJava.JMethode;
import myJava.JParametre;
import myJava.JType;
import myJava.JTypeDecl;
import myJava.JVarRef;
import myJava.MyJavaFactory;
import myJava.MyJavaPackage;
import myJava.StringConstante;
import myJava.TypeBase;
import myJava.TypeRef;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyJavaPackageImpl extends EPackageImpl implements MyJavaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jTypeDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jClasseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jClasseLibrairieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jMethodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jAttributEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jAppelMethodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jCreationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jVarRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringConstanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jConstructeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jParametreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass donneeTypeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intConstanteEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see myJava.MyJavaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MyJavaPackageImpl() {
		super(eNS_URI, MyJavaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MyJavaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MyJavaPackage init() {
		if (isInited)
			return (MyJavaPackage) EPackage.Registry.INSTANCE.getEPackage(MyJavaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMyJavaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MyJavaPackageImpl theMyJavaPackage = registeredMyJavaPackage instanceof MyJavaPackageImpl
				? (MyJavaPackageImpl) registeredMyJavaPackage
				: new MyJavaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMyJavaPackage.createPackageContents();

		// Initialize created meta-data
		theMyJavaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMyJavaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MyJavaPackage.eNS_URI, theMyJavaPackage);
		return theMyJavaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJTypeDecl() {
		return jTypeDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJTypeDecl_Name() {
		return (EAttribute) jTypeDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJClasse() {
		return jClasseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClasse_ClassesInternes() {
		return (EReference) jClasseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClasse_Extends() {
		return (EReference) jClasseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClasse_Methodes() {
		return (EReference) jClasseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClasse_Attributs() {
		return (EReference) jClasseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJClasseLibrairie() {
		return jClasseLibrairieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJMethode() {
		return jMethodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJMethode_Name() {
		return (EAttribute) jMethodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJMethode_Instructions() {
		return (EReference) jMethodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJMethode_Parametres() {
		return (EReference) jMethodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJAttribut() {
		return jAttributEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJAttribut_Val_init() {
		return (EReference) jAttributEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJInstruction() {
		return jInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_Expression() {
		return (EReference) declarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJExpression() {
		return jExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJAppelMethode() {
		return jAppelMethodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJAppelMethode_Cible() {
		return (EReference) jAppelMethodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJAppelMethode_Arguments() {
		return (EReference) jAppelMethodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJAppelMethode_Methode() {
		return (EAttribute) jAppelMethodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJCreation() {
		return jCreationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJCreation_Classe() {
		return (EReference) jCreationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJCreation_Arguments() {
		return (EReference) jCreationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJVarRef() {
		return jVarRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJVarRef_Variable() {
		return (EReference) jVarRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringConstante() {
		return stringConstanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringConstante_Valeur() {
		return (EAttribute) stringConstanteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJConstructeur() {
		return jConstructeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJParametre() {
		return jParametreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJType() {
		return jTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeRef() {
		return typeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeRef_Type() {
		return (EReference) typeRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeBase() {
		return typeBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeBase_Name() {
		return (EAttribute) typeBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDonneeTypee() {
		return donneeTypeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDonneeTypee_Type() {
		return (EReference) donneeTypeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonneeTypee_Name() {
		return (EAttribute) donneeTypeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntConstante() {
		return intConstanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntConstante_Valeur() {
		return (EAttribute) intConstanteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyJavaFactory getMyJavaFactory() {
		return (MyJavaFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		jTypeDeclEClass = createEClass(JTYPE_DECL);
		createEAttribute(jTypeDeclEClass, JTYPE_DECL__NAME);

		jClasseEClass = createEClass(JCLASSE);
		createEReference(jClasseEClass, JCLASSE__CLASSES_INTERNES);
		createEReference(jClasseEClass, JCLASSE__EXTENDS);
		createEReference(jClasseEClass, JCLASSE__METHODES);
		createEReference(jClasseEClass, JCLASSE__ATTRIBUTS);

		jClasseLibrairieEClass = createEClass(JCLASSE_LIBRAIRIE);

		jMethodeEClass = createEClass(JMETHODE);
		createEAttribute(jMethodeEClass, JMETHODE__NAME);
		createEReference(jMethodeEClass, JMETHODE__INSTRUCTIONS);
		createEReference(jMethodeEClass, JMETHODE__PARAMETRES);

		jAttributEClass = createEClass(JATTRIBUT);
		createEReference(jAttributEClass, JATTRIBUT__VAL_INIT);

		jInstructionEClass = createEClass(JINSTRUCTION);

		declarationEClass = createEClass(DECLARATION);
		createEReference(declarationEClass, DECLARATION__EXPRESSION);

		jExpressionEClass = createEClass(JEXPRESSION);

		jAppelMethodeEClass = createEClass(JAPPEL_METHODE);
		createEReference(jAppelMethodeEClass, JAPPEL_METHODE__CIBLE);
		createEReference(jAppelMethodeEClass, JAPPEL_METHODE__ARGUMENTS);
		createEAttribute(jAppelMethodeEClass, JAPPEL_METHODE__METHODE);

		jCreationEClass = createEClass(JCREATION);
		createEReference(jCreationEClass, JCREATION__CLASSE);
		createEReference(jCreationEClass, JCREATION__ARGUMENTS);

		jVarRefEClass = createEClass(JVAR_REF);
		createEReference(jVarRefEClass, JVAR_REF__VARIABLE);

		stringConstanteEClass = createEClass(STRING_CONSTANTE);
		createEAttribute(stringConstanteEClass, STRING_CONSTANTE__VALEUR);

		jConstructeurEClass = createEClass(JCONSTRUCTEUR);

		jParametreEClass = createEClass(JPARAMETRE);

		jTypeEClass = createEClass(JTYPE);

		typeRefEClass = createEClass(TYPE_REF);
		createEReference(typeRefEClass, TYPE_REF__TYPE);

		typeBaseEClass = createEClass(TYPE_BASE);
		createEAttribute(typeBaseEClass, TYPE_BASE__NAME);

		donneeTypeeEClass = createEClass(DONNEE_TYPEE);
		createEReference(donneeTypeeEClass, DONNEE_TYPEE__TYPE);
		createEAttribute(donneeTypeeEClass, DONNEE_TYPEE__NAME);

		intConstanteEClass = createEClass(INT_CONSTANTE);
		createEAttribute(intConstanteEClass, INT_CONSTANTE__VALEUR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jClasseEClass.getESuperTypes().add(this.getJTypeDecl());
		jClasseLibrairieEClass.getESuperTypes().add(this.getJTypeDecl());
		jAttributEClass.getESuperTypes().add(this.getDonneeTypee());
		declarationEClass.getESuperTypes().add(this.getJInstruction());
		declarationEClass.getESuperTypes().add(this.getDonneeTypee());
		jExpressionEClass.getESuperTypes().add(this.getJInstruction());
		jAppelMethodeEClass.getESuperTypes().add(this.getJExpression());
		jCreationEClass.getESuperTypes().add(this.getJExpression());
		jVarRefEClass.getESuperTypes().add(this.getJExpression());
		stringConstanteEClass.getESuperTypes().add(this.getJExpression());
		jConstructeurEClass.getESuperTypes().add(this.getJMethode());
		jParametreEClass.getESuperTypes().add(this.getDonneeTypee());
		typeRefEClass.getESuperTypes().add(this.getJType());
		typeBaseEClass.getESuperTypes().add(this.getJType());
		intConstanteEClass.getESuperTypes().add(this.getJExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(jTypeDeclEClass, JTypeDecl.class, "JTypeDecl", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJTypeDecl_Name(), ecorePackage.getEString(), "name", null, 1, 1, JTypeDecl.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jClasseEClass, JClasse.class, "JClasse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJClasse_ClassesInternes(), this.getJTypeDecl(), null, "classesInternes", null, 0, -1,
				JClasse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClasse_Extends(), this.getJTypeDecl(), null, "extends", null, 0, -1, JClasse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClasse_Methodes(), this.getJMethode(), null, "methodes", null, 0, -1, JClasse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClasse_Attributs(), this.getJAttribut(), null, "attributs", null, 0, -1, JClasse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jClasseLibrairieEClass, JClasseLibrairie.class, "JClasseLibrairie", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jMethodeEClass, JMethode.class, "JMethode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJMethode_Name(), ecorePackage.getEString(), "name", null, 1, 1, JMethode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJMethode_Instructions(), this.getJInstruction(), null, "instructions", null, 0, -1,
				JMethode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJMethode_Parametres(), this.getJParametre(), null, "parametres", null, 0, -1, JMethode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jAttributEClass, JAttribut.class, "JAttribut", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJAttribut_Val_init(), this.getJExpression(), null, "val_init", null, 0, 1, JAttribut.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jInstructionEClass, JInstruction.class, "JInstruction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclaration_Expression(), this.getJExpression(), null, "expression", null, 1, 1,
				Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jExpressionEClass, JExpression.class, "JExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jAppelMethodeEClass, JAppelMethode.class, "JAppelMethode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJAppelMethode_Cible(), this.getJExpression(), null, "cible", null, 0, 1, JAppelMethode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJAppelMethode_Arguments(), this.getJExpression(), null, "arguments", null, 0, -1,
				JAppelMethode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJAppelMethode_Methode(), ecorePackage.getEString(), "methode", null, 1, 1,
				JAppelMethode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(jCreationEClass, JCreation.class, "JCreation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJCreation_Classe(), this.getJTypeDecl(), null, "classe", null, 1, 1, JCreation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJCreation_Arguments(), this.getJExpression(), null, "arguments", null, 0, -1, JCreation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jVarRefEClass, JVarRef.class, "JVarRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJVarRef_Variable(), this.getDonneeTypee(), null, "variable", null, 1, 1, JVarRef.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringConstanteEClass, StringConstante.class, "StringConstante", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringConstante_Valeur(), ecorePackage.getEString(), "valeur", null, 1, 1,
				StringConstante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(jConstructeurEClass, JConstructeur.class, "JConstructeur", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jParametreEClass, JParametre.class, "JParametre", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jTypeEClass, JType.class, "JType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeRefEClass, TypeRef.class, "TypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeRef_Type(), this.getJTypeDecl(), null, "type", null, 1, 1, TypeRef.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(typeBaseEClass, TypeBase.class, "TypeBase", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeBase_Name(), ecorePackage.getEString(), "name", null, 1, 1, TypeBase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(donneeTypeeEClass, DonneeTypee.class, "DonneeTypee", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDonneeTypee_Type(), this.getJType(), null, "type", null, 1, 1, DonneeTypee.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDonneeTypee_Name(), ecorePackage.getEString(), "name", null, 1, 1, DonneeTypee.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intConstanteEClass, IntConstante.class, "IntConstante", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntConstante_Valeur(), ecorePackage.getEInt(), "valeur", null, 1, 1, IntConstante.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MyJavaPackageImpl
