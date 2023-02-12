/**
 */
package myJava;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see myJava.MyJavaFactory
 * @model kind="package"
 * @generated
 */
public interface MyJavaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "myJava";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///myJava";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "myJava";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyJavaPackage eINSTANCE = myJava.impl.MyJavaPackageImpl.init();

	/**
	 * The meta object id for the '{@link myJava.impl.JTypeDeclImpl <em>JType Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.JTypeDeclImpl
	 * @see myJava.impl.MyJavaPackageImpl#getJTypeDecl()
	 * @generated
	 */
	int JTYPE_DECL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE_DECL__NAME = 0;

	/**
	 * The number of structural features of the '<em>JType Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE_DECL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>JType Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE_DECL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link myJava.impl.JClasseImpl <em>JClasse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.JClasseImpl
	 * @see myJava.impl.MyJavaPackageImpl#getJClasse()
	 * @generated
	 */
	int JCLASSE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASSE__NAME = JTYPE_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Classes Internes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASSE__CLASSES_INTERNES = JTYPE_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASSE__EXTENDS = JTYPE_DECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Methodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASSE__METHODES = JTYPE_DECL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASSE__ATTRIBUTS = JTYPE_DECL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>JClasse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASSE_FEATURE_COUNT = JTYPE_DECL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>JClasse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASSE_OPERATION_COUNT = JTYPE_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link myJava.impl.JClasseLibrairieImpl <em>JClasse Librairie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.JClasseLibrairieImpl
	 * @see myJava.impl.MyJavaPackageImpl#getJClasseLibrairie()
	 * @generated
	 */
	int JCLASSE_LIBRAIRIE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASSE_LIBRAIRIE__NAME = JTYPE_DECL__NAME;

	/**
	 * The number of structural features of the '<em>JClasse Librairie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASSE_LIBRAIRIE_FEATURE_COUNT = JTYPE_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JClasse Librairie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASSE_LIBRAIRIE_OPERATION_COUNT = JTYPE_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link myJava.impl.JMethodeImpl <em>JMethode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.JMethodeImpl
	 * @see myJava.impl.MyJavaPackageImpl#getJMethode()
	 * @generated
	 */
	int JMETHODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHODE__INSTRUCTIONS = 1;

	/**
	 * The feature id for the '<em><b>Parametres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHODE__PARAMETRES = 2;

	/**
	 * The number of structural features of the '<em>JMethode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>JMethode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link myJava.impl.DonneeTypeeImpl <em>Donnee Typee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.DonneeTypeeImpl
	 * @see myJava.impl.MyJavaPackageImpl#getDonneeTypee()
	 * @generated
	 */
	int DONNEE_TYPEE = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_TYPEE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_TYPEE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Donnee Typee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_TYPEE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Donnee Typee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_TYPEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link myJava.impl.JAttributImpl <em>JAttribut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.JAttributImpl
	 * @see myJava.impl.MyJavaPackageImpl#getJAttribut()
	 * @generated
	 */
	int JATTRIBUT = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUT__TYPE = DONNEE_TYPEE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUT__NAME = DONNEE_TYPEE__NAME;

	/**
	 * The feature id for the '<em><b>Val init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUT__VAL_INIT = DONNEE_TYPEE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JAttribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUT_FEATURE_COUNT = DONNEE_TYPEE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JAttribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUT_OPERATION_COUNT = DONNEE_TYPEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link myJava.impl.JInstructionImpl <em>JInstruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.JInstructionImpl
	 * @see myJava.impl.MyJavaPackageImpl#getJInstruction()
	 * @generated
	 */
	int JINSTRUCTION = 5;

	/**
	 * The number of structural features of the '<em>JInstruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>JInstruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link myJava.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.DeclarationImpl
	 * @see myJava.impl.MyJavaPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__TYPE = JINSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__NAME = JINSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__EXPRESSION = JINSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = JINSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = JINSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link myJava.impl.JExpressionImpl <em>JExpression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.JExpressionImpl
	 * @see myJava.impl.MyJavaPackageImpl#getJExpression()
	 * @generated
	 */
	int JEXPRESSION = 7;

	/**
	 * The number of structural features of the '<em>JExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEXPRESSION_FEATURE_COUNT = JINSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEXPRESSION_OPERATION_COUNT = JINSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link myJava.impl.JAppelMethodeImpl <em>JAppel Methode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.JAppelMethodeImpl
	 * @see myJava.impl.MyJavaPackageImpl#getJAppelMethode()
	 * @generated
	 */
	int JAPPEL_METHODE = 8;

	/**
	 * The feature id for the '<em><b>Cible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAPPEL_METHODE__CIBLE = JEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAPPEL_METHODE__ARGUMENTS = JEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAPPEL_METHODE__METHODE = JEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>JAppel Methode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAPPEL_METHODE_FEATURE_COUNT = JEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>JAppel Methode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAPPEL_METHODE_OPERATION_COUNT = JEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link myJava.impl.JCreationImpl <em>JCreation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.JCreationImpl
	 * @see myJava.impl.MyJavaPackageImpl#getJCreation()
	 * @generated
	 */
	int JCREATION = 9;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCREATION__CLASSE = JEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCREATION__ARGUMENTS = JEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>JCreation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCREATION_FEATURE_COUNT = JEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>JCreation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCREATION_OPERATION_COUNT = JEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link myJava.impl.JVarRefImpl <em>JVar Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.JVarRefImpl
	 * @see myJava.impl.MyJavaPackageImpl#getJVarRef()
	 * @generated
	 */
	int JVAR_REF = 10;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVAR_REF__VARIABLE = JEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JVar Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVAR_REF_FEATURE_COUNT = JEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JVar Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVAR_REF_OPERATION_COUNT = JEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link myJava.impl.StringConstanteImpl <em>String Constante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.StringConstanteImpl
	 * @see myJava.impl.MyJavaPackageImpl#getStringConstante()
	 * @generated
	 */
	int STRING_CONSTANTE = 11;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANTE__VALEUR = JEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANTE_FEATURE_COUNT = JEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANTE_OPERATION_COUNT = JEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link myJava.impl.JConstructeurImpl <em>JConstructeur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.JConstructeurImpl
	 * @see myJava.impl.MyJavaPackageImpl#getJConstructeur()
	 * @generated
	 */
	int JCONSTRUCTEUR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCONSTRUCTEUR__NAME = JMETHODE__NAME;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCONSTRUCTEUR__INSTRUCTIONS = JMETHODE__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Parametres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCONSTRUCTEUR__PARAMETRES = JMETHODE__PARAMETRES;

	/**
	 * The number of structural features of the '<em>JConstructeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCONSTRUCTEUR_FEATURE_COUNT = JMETHODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JConstructeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCONSTRUCTEUR_OPERATION_COUNT = JMETHODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link myJava.impl.JParametreImpl <em>JParametre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.JParametreImpl
	 * @see myJava.impl.MyJavaPackageImpl#getJParametre()
	 * @generated
	 */
	int JPARAMETRE = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETRE__TYPE = DONNEE_TYPEE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETRE__NAME = DONNEE_TYPEE__NAME;

	/**
	 * The number of structural features of the '<em>JParametre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETRE_FEATURE_COUNT = DONNEE_TYPEE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JParametre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETRE_OPERATION_COUNT = DONNEE_TYPEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link myJava.impl.JTypeImpl <em>JType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.JTypeImpl
	 * @see myJava.impl.MyJavaPackageImpl#getJType()
	 * @generated
	 */
	int JTYPE = 14;

	/**
	 * The number of structural features of the '<em>JType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>JType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link myJava.impl.TypeRefImpl <em>Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.TypeRefImpl
	 * @see myJava.impl.MyJavaPackageImpl#getTypeRef()
	 * @generated
	 */
	int TYPE_REF = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF__TYPE = JTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF_FEATURE_COUNT = JTYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF_OPERATION_COUNT = JTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link myJava.impl.TypeBaseImpl <em>Type Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.TypeBaseImpl
	 * @see myJava.impl.MyJavaPackageImpl#getTypeBase()
	 * @generated
	 */
	int TYPE_BASE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_BASE__NAME = JTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_BASE_FEATURE_COUNT = JTYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_BASE_OPERATION_COUNT = JTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link myJava.impl.IntConstanteImpl <em>Int Constante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myJava.impl.IntConstanteImpl
	 * @see myJava.impl.MyJavaPackageImpl#getIntConstante()
	 * @generated
	 */
	int INT_CONSTANTE = 18;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANTE__VALEUR = JEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANTE_FEATURE_COUNT = JEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANTE_OPERATION_COUNT = JEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link myJava.JTypeDecl <em>JType Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JType Decl</em>'.
	 * @see myJava.JTypeDecl
	 * @generated
	 */
	EClass getJTypeDecl();

	/**
	 * Returns the meta object for the attribute '{@link myJava.JTypeDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see myJava.JTypeDecl#getName()
	 * @see #getJTypeDecl()
	 * @generated
	 */
	EAttribute getJTypeDecl_Name();

	/**
	 * Returns the meta object for class '{@link myJava.JClasse <em>JClasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JClasse</em>'.
	 * @see myJava.JClasse
	 * @generated
	 */
	EClass getJClasse();

	/**
	 * Returns the meta object for the containment reference list '{@link myJava.JClasse#getClassesInternes <em>Classes Internes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes Internes</em>'.
	 * @see myJava.JClasse#getClassesInternes()
	 * @see #getJClasse()
	 * @generated
	 */
	EReference getJClasse_ClassesInternes();

	/**
	 * Returns the meta object for the containment reference list '{@link myJava.JClasse#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extends</em>'.
	 * @see myJava.JClasse#getExtends()
	 * @see #getJClasse()
	 * @generated
	 */
	EReference getJClasse_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link myJava.JClasse#getMethodes <em>Methodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methodes</em>'.
	 * @see myJava.JClasse#getMethodes()
	 * @see #getJClasse()
	 * @generated
	 */
	EReference getJClasse_Methodes();

	/**
	 * Returns the meta object for the containment reference list '{@link myJava.JClasse#getAttributs <em>Attributs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributs</em>'.
	 * @see myJava.JClasse#getAttributs()
	 * @see #getJClasse()
	 * @generated
	 */
	EReference getJClasse_Attributs();

	/**
	 * Returns the meta object for class '{@link myJava.JClasseLibrairie <em>JClasse Librairie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JClasse Librairie</em>'.
	 * @see myJava.JClasseLibrairie
	 * @generated
	 */
	EClass getJClasseLibrairie();

	/**
	 * Returns the meta object for class '{@link myJava.JMethode <em>JMethode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JMethode</em>'.
	 * @see myJava.JMethode
	 * @generated
	 */
	EClass getJMethode();

	/**
	 * Returns the meta object for the attribute '{@link myJava.JMethode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see myJava.JMethode#getName()
	 * @see #getJMethode()
	 * @generated
	 */
	EAttribute getJMethode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link myJava.JMethode#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see myJava.JMethode#getInstructions()
	 * @see #getJMethode()
	 * @generated
	 */
	EReference getJMethode_Instructions();

	/**
	 * Returns the meta object for the containment reference list '{@link myJava.JMethode#getParametres <em>Parametres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametres</em>'.
	 * @see myJava.JMethode#getParametres()
	 * @see #getJMethode()
	 * @generated
	 */
	EReference getJMethode_Parametres();

	/**
	 * Returns the meta object for class '{@link myJava.JAttribut <em>JAttribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JAttribut</em>'.
	 * @see myJava.JAttribut
	 * @generated
	 */
	EClass getJAttribut();

	/**
	 * Returns the meta object for the containment reference '{@link myJava.JAttribut#getVal_init <em>Val init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Val init</em>'.
	 * @see myJava.JAttribut#getVal_init()
	 * @see #getJAttribut()
	 * @generated
	 */
	EReference getJAttribut_Val_init();

	/**
	 * Returns the meta object for class '{@link myJava.JInstruction <em>JInstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JInstruction</em>'.
	 * @see myJava.JInstruction
	 * @generated
	 */
	EClass getJInstruction();

	/**
	 * Returns the meta object for class '{@link myJava.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see myJava.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link myJava.Declaration#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see myJava.Declaration#getExpression()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Expression();

	/**
	 * Returns the meta object for class '{@link myJava.JExpression <em>JExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JExpression</em>'.
	 * @see myJava.JExpression
	 * @generated
	 */
	EClass getJExpression();

	/**
	 * Returns the meta object for class '{@link myJava.JAppelMethode <em>JAppel Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JAppel Methode</em>'.
	 * @see myJava.JAppelMethode
	 * @generated
	 */
	EClass getJAppelMethode();

	/**
	 * Returns the meta object for the containment reference '{@link myJava.JAppelMethode#getCible <em>Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cible</em>'.
	 * @see myJava.JAppelMethode#getCible()
	 * @see #getJAppelMethode()
	 * @generated
	 */
	EReference getJAppelMethode_Cible();

	/**
	 * Returns the meta object for the containment reference list '{@link myJava.JAppelMethode#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see myJava.JAppelMethode#getArguments()
	 * @see #getJAppelMethode()
	 * @generated
	 */
	EReference getJAppelMethode_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link myJava.JAppelMethode#getMethode <em>Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Methode</em>'.
	 * @see myJava.JAppelMethode#getMethode()
	 * @see #getJAppelMethode()
	 * @generated
	 */
	EAttribute getJAppelMethode_Methode();

	/**
	 * Returns the meta object for class '{@link myJava.JCreation <em>JCreation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JCreation</em>'.
	 * @see myJava.JCreation
	 * @generated
	 */
	EClass getJCreation();

	/**
	 * Returns the meta object for the reference '{@link myJava.JCreation#getClasse <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classe</em>'.
	 * @see myJava.JCreation#getClasse()
	 * @see #getJCreation()
	 * @generated
	 */
	EReference getJCreation_Classe();

	/**
	 * Returns the meta object for the containment reference list '{@link myJava.JCreation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see myJava.JCreation#getArguments()
	 * @see #getJCreation()
	 * @generated
	 */
	EReference getJCreation_Arguments();

	/**
	 * Returns the meta object for class '{@link myJava.JVarRef <em>JVar Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JVar Ref</em>'.
	 * @see myJava.JVarRef
	 * @generated
	 */
	EClass getJVarRef();

	/**
	 * Returns the meta object for the reference '{@link myJava.JVarRef#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see myJava.JVarRef#getVariable()
	 * @see #getJVarRef()
	 * @generated
	 */
	EReference getJVarRef_Variable();

	/**
	 * Returns the meta object for class '{@link myJava.StringConstante <em>String Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constante</em>'.
	 * @see myJava.StringConstante
	 * @generated
	 */
	EClass getStringConstante();

	/**
	 * Returns the meta object for the attribute '{@link myJava.StringConstante#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see myJava.StringConstante#getValeur()
	 * @see #getStringConstante()
	 * @generated
	 */
	EAttribute getStringConstante_Valeur();

	/**
	 * Returns the meta object for class '{@link myJava.JConstructeur <em>JConstructeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JConstructeur</em>'.
	 * @see myJava.JConstructeur
	 * @generated
	 */
	EClass getJConstructeur();

	/**
	 * Returns the meta object for class '{@link myJava.JParametre <em>JParametre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JParametre</em>'.
	 * @see myJava.JParametre
	 * @generated
	 */
	EClass getJParametre();

	/**
	 * Returns the meta object for class '{@link myJava.JType <em>JType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JType</em>'.
	 * @see myJava.JType
	 * @generated
	 */
	EClass getJType();

	/**
	 * Returns the meta object for class '{@link myJava.TypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Ref</em>'.
	 * @see myJava.TypeRef
	 * @generated
	 */
	EClass getTypeRef();

	/**
	 * Returns the meta object for the reference '{@link myJava.TypeRef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see myJava.TypeRef#getType()
	 * @see #getTypeRef()
	 * @generated
	 */
	EReference getTypeRef_Type();

	/**
	 * Returns the meta object for class '{@link myJava.TypeBase <em>Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Base</em>'.
	 * @see myJava.TypeBase
	 * @generated
	 */
	EClass getTypeBase();

	/**
	 * Returns the meta object for the attribute '{@link myJava.TypeBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see myJava.TypeBase#getName()
	 * @see #getTypeBase()
	 * @generated
	 */
	EAttribute getTypeBase_Name();

	/**
	 * Returns the meta object for class '{@link myJava.DonneeTypee <em>Donnee Typee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donnee Typee</em>'.
	 * @see myJava.DonneeTypee
	 * @generated
	 */
	EClass getDonneeTypee();

	/**
	 * Returns the meta object for the containment reference '{@link myJava.DonneeTypee#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see myJava.DonneeTypee#getType()
	 * @see #getDonneeTypee()
	 * @generated
	 */
	EReference getDonneeTypee_Type();

	/**
	 * Returns the meta object for the attribute '{@link myJava.DonneeTypee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see myJava.DonneeTypee#getName()
	 * @see #getDonneeTypee()
	 * @generated
	 */
	EAttribute getDonneeTypee_Name();

	/**
	 * Returns the meta object for class '{@link myJava.IntConstante <em>Int Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Constante</em>'.
	 * @see myJava.IntConstante
	 * @generated
	 */
	EClass getIntConstante();

	/**
	 * Returns the meta object for the attribute '{@link myJava.IntConstante#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see myJava.IntConstante#getValeur()
	 * @see #getIntConstante()
	 * @generated
	 */
	EAttribute getIntConstante_Valeur();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MyJavaFactory getMyJavaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link myJava.impl.JTypeDeclImpl <em>JType Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.JTypeDeclImpl
		 * @see myJava.impl.MyJavaPackageImpl#getJTypeDecl()
		 * @generated
		 */
		EClass JTYPE_DECL = eINSTANCE.getJTypeDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JTYPE_DECL__NAME = eINSTANCE.getJTypeDecl_Name();

		/**
		 * The meta object literal for the '{@link myJava.impl.JClasseImpl <em>JClasse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.JClasseImpl
		 * @see myJava.impl.MyJavaPackageImpl#getJClasse()
		 * @generated
		 */
		EClass JCLASSE = eINSTANCE.getJClasse();

		/**
		 * The meta object literal for the '<em><b>Classes Internes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASSE__CLASSES_INTERNES = eINSTANCE.getJClasse_ClassesInternes();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASSE__EXTENDS = eINSTANCE.getJClasse_Extends();

		/**
		 * The meta object literal for the '<em><b>Methodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASSE__METHODES = eINSTANCE.getJClasse_Methodes();

		/**
		 * The meta object literal for the '<em><b>Attributs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASSE__ATTRIBUTS = eINSTANCE.getJClasse_Attributs();

		/**
		 * The meta object literal for the '{@link myJava.impl.JClasseLibrairieImpl <em>JClasse Librairie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.JClasseLibrairieImpl
		 * @see myJava.impl.MyJavaPackageImpl#getJClasseLibrairie()
		 * @generated
		 */
		EClass JCLASSE_LIBRAIRIE = eINSTANCE.getJClasseLibrairie();

		/**
		 * The meta object literal for the '{@link myJava.impl.JMethodeImpl <em>JMethode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.JMethodeImpl
		 * @see myJava.impl.MyJavaPackageImpl#getJMethode()
		 * @generated
		 */
		EClass JMETHODE = eINSTANCE.getJMethode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMETHODE__NAME = eINSTANCE.getJMethode_Name();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMETHODE__INSTRUCTIONS = eINSTANCE.getJMethode_Instructions();

		/**
		 * The meta object literal for the '<em><b>Parametres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMETHODE__PARAMETRES = eINSTANCE.getJMethode_Parametres();

		/**
		 * The meta object literal for the '{@link myJava.impl.JAttributImpl <em>JAttribut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.JAttributImpl
		 * @see myJava.impl.MyJavaPackageImpl#getJAttribut()
		 * @generated
		 */
		EClass JATTRIBUT = eINSTANCE.getJAttribut();

		/**
		 * The meta object literal for the '<em><b>Val init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JATTRIBUT__VAL_INIT = eINSTANCE.getJAttribut_Val_init();

		/**
		 * The meta object literal for the '{@link myJava.impl.JInstructionImpl <em>JInstruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.JInstructionImpl
		 * @see myJava.impl.MyJavaPackageImpl#getJInstruction()
		 * @generated
		 */
		EClass JINSTRUCTION = eINSTANCE.getJInstruction();

		/**
		 * The meta object literal for the '{@link myJava.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.DeclarationImpl
		 * @see myJava.impl.MyJavaPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__EXPRESSION = eINSTANCE.getDeclaration_Expression();

		/**
		 * The meta object literal for the '{@link myJava.impl.JExpressionImpl <em>JExpression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.JExpressionImpl
		 * @see myJava.impl.MyJavaPackageImpl#getJExpression()
		 * @generated
		 */
		EClass JEXPRESSION = eINSTANCE.getJExpression();

		/**
		 * The meta object literal for the '{@link myJava.impl.JAppelMethodeImpl <em>JAppel Methode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.JAppelMethodeImpl
		 * @see myJava.impl.MyJavaPackageImpl#getJAppelMethode()
		 * @generated
		 */
		EClass JAPPEL_METHODE = eINSTANCE.getJAppelMethode();

		/**
		 * The meta object literal for the '<em><b>Cible</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAPPEL_METHODE__CIBLE = eINSTANCE.getJAppelMethode_Cible();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAPPEL_METHODE__ARGUMENTS = eINSTANCE.getJAppelMethode_Arguments();

		/**
		 * The meta object literal for the '<em><b>Methode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAPPEL_METHODE__METHODE = eINSTANCE.getJAppelMethode_Methode();

		/**
		 * The meta object literal for the '{@link myJava.impl.JCreationImpl <em>JCreation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.JCreationImpl
		 * @see myJava.impl.MyJavaPackageImpl#getJCreation()
		 * @generated
		 */
		EClass JCREATION = eINSTANCE.getJCreation();

		/**
		 * The meta object literal for the '<em><b>Classe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCREATION__CLASSE = eINSTANCE.getJCreation_Classe();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCREATION__ARGUMENTS = eINSTANCE.getJCreation_Arguments();

		/**
		 * The meta object literal for the '{@link myJava.impl.JVarRefImpl <em>JVar Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.JVarRefImpl
		 * @see myJava.impl.MyJavaPackageImpl#getJVarRef()
		 * @generated
		 */
		EClass JVAR_REF = eINSTANCE.getJVarRef();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JVAR_REF__VARIABLE = eINSTANCE.getJVarRef_Variable();

		/**
		 * The meta object literal for the '{@link myJava.impl.StringConstanteImpl <em>String Constante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.StringConstanteImpl
		 * @see myJava.impl.MyJavaPackageImpl#getStringConstante()
		 * @generated
		 */
		EClass STRING_CONSTANTE = eINSTANCE.getStringConstante();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANTE__VALEUR = eINSTANCE.getStringConstante_Valeur();

		/**
		 * The meta object literal for the '{@link myJava.impl.JConstructeurImpl <em>JConstructeur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.JConstructeurImpl
		 * @see myJava.impl.MyJavaPackageImpl#getJConstructeur()
		 * @generated
		 */
		EClass JCONSTRUCTEUR = eINSTANCE.getJConstructeur();

		/**
		 * The meta object literal for the '{@link myJava.impl.JParametreImpl <em>JParametre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.JParametreImpl
		 * @see myJava.impl.MyJavaPackageImpl#getJParametre()
		 * @generated
		 */
		EClass JPARAMETRE = eINSTANCE.getJParametre();

		/**
		 * The meta object literal for the '{@link myJava.impl.JTypeImpl <em>JType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.JTypeImpl
		 * @see myJava.impl.MyJavaPackageImpl#getJType()
		 * @generated
		 */
		EClass JTYPE = eINSTANCE.getJType();

		/**
		 * The meta object literal for the '{@link myJava.impl.TypeRefImpl <em>Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.TypeRefImpl
		 * @see myJava.impl.MyJavaPackageImpl#getTypeRef()
		 * @generated
		 */
		EClass TYPE_REF = eINSTANCE.getTypeRef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REF__TYPE = eINSTANCE.getTypeRef_Type();

		/**
		 * The meta object literal for the '{@link myJava.impl.TypeBaseImpl <em>Type Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.TypeBaseImpl
		 * @see myJava.impl.MyJavaPackageImpl#getTypeBase()
		 * @generated
		 */
		EClass TYPE_BASE = eINSTANCE.getTypeBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_BASE__NAME = eINSTANCE.getTypeBase_Name();

		/**
		 * The meta object literal for the '{@link myJava.impl.DonneeTypeeImpl <em>Donnee Typee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.DonneeTypeeImpl
		 * @see myJava.impl.MyJavaPackageImpl#getDonneeTypee()
		 * @generated
		 */
		EClass DONNEE_TYPEE = eINSTANCE.getDonneeTypee();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DONNEE_TYPEE__TYPE = eINSTANCE.getDonneeTypee_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONNEE_TYPEE__NAME = eINSTANCE.getDonneeTypee_Name();

		/**
		 * The meta object literal for the '{@link myJava.impl.IntConstanteImpl <em>Int Constante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myJava.impl.IntConstanteImpl
		 * @see myJava.impl.MyJavaPackageImpl#getIntConstante()
		 * @generated
		 */
		EClass INT_CONSTANTE = eINSTANCE.getIntConstante();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_CONSTANTE__VALEUR = eINSTANCE.getIntConstante_Valeur();

	}

} //MyJavaPackage
