/**
 */
package myJava.util;

import myJava.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see myJava.MyJavaPackage
 * @generated
 */
public class MyJavaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MyJavaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyJavaSwitch() {
		if (modelPackage == null) {
			modelPackage = MyJavaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MyJavaPackage.JTYPE_DECL: {
			JTypeDecl jTypeDecl = (JTypeDecl) theEObject;
			T result = caseJTypeDecl(jTypeDecl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.JCLASSE: {
			JClasse jClasse = (JClasse) theEObject;
			T result = caseJClasse(jClasse);
			if (result == null)
				result = caseJTypeDecl(jClasse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.JCLASSE_LIBRAIRIE: {
			JClasseLibrairie jClasseLibrairie = (JClasseLibrairie) theEObject;
			T result = caseJClasseLibrairie(jClasseLibrairie);
			if (result == null)
				result = caseJTypeDecl(jClasseLibrairie);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.JMETHODE: {
			JMethode jMethode = (JMethode) theEObject;
			T result = caseJMethode(jMethode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.JATTRIBUT: {
			JAttribut jAttribut = (JAttribut) theEObject;
			T result = caseJAttribut(jAttribut);
			if (result == null)
				result = caseDonneeTypee(jAttribut);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.JINSTRUCTION: {
			JInstruction jInstruction = (JInstruction) theEObject;
			T result = caseJInstruction(jInstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.DECLARATION: {
			Declaration declaration = (Declaration) theEObject;
			T result = caseDeclaration(declaration);
			if (result == null)
				result = caseJInstruction(declaration);
			if (result == null)
				result = caseDonneeTypee(declaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.JEXPRESSION: {
			JExpression jExpression = (JExpression) theEObject;
			T result = caseJExpression(jExpression);
			if (result == null)
				result = caseJInstruction(jExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.JAPPEL_METHODE: {
			JAppelMethode jAppelMethode = (JAppelMethode) theEObject;
			T result = caseJAppelMethode(jAppelMethode);
			if (result == null)
				result = caseJExpression(jAppelMethode);
			if (result == null)
				result = caseJInstruction(jAppelMethode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.JCREATION: {
			JCreation jCreation = (JCreation) theEObject;
			T result = caseJCreation(jCreation);
			if (result == null)
				result = caseJExpression(jCreation);
			if (result == null)
				result = caseJInstruction(jCreation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.JVAR_REF: {
			JVarRef jVarRef = (JVarRef) theEObject;
			T result = caseJVarRef(jVarRef);
			if (result == null)
				result = caseJExpression(jVarRef);
			if (result == null)
				result = caseJInstruction(jVarRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.STRING_CONSTANTE: {
			StringConstante stringConstante = (StringConstante) theEObject;
			T result = caseStringConstante(stringConstante);
			if (result == null)
				result = caseJExpression(stringConstante);
			if (result == null)
				result = caseJInstruction(stringConstante);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.JCONSTRUCTEUR: {
			JConstructeur jConstructeur = (JConstructeur) theEObject;
			T result = caseJConstructeur(jConstructeur);
			if (result == null)
				result = caseJMethode(jConstructeur);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.JPARAMETRE: {
			JParametre jParametre = (JParametre) theEObject;
			T result = caseJParametre(jParametre);
			if (result == null)
				result = caseDonneeTypee(jParametre);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.JTYPE: {
			JType jType = (JType) theEObject;
			T result = caseJType(jType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.TYPE_REF: {
			TypeRef typeRef = (TypeRef) theEObject;
			T result = caseTypeRef(typeRef);
			if (result == null)
				result = caseJType(typeRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.TYPE_BASE: {
			TypeBase typeBase = (TypeBase) theEObject;
			T result = caseTypeBase(typeBase);
			if (result == null)
				result = caseJType(typeBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.DONNEE_TYPEE: {
			DonneeTypee donneeTypee = (DonneeTypee) theEObject;
			T result = caseDonneeTypee(donneeTypee);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MyJavaPackage.INT_CONSTANTE: {
			IntConstante intConstante = (IntConstante) theEObject;
			T result = caseIntConstante(intConstante);
			if (result == null)
				result = caseJExpression(intConstante);
			if (result == null)
				result = caseJInstruction(intConstante);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JType Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JType Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJTypeDecl(JTypeDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JClasse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JClasse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJClasse(JClasse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JClasse Librairie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JClasse Librairie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJClasseLibrairie(JClasseLibrairie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JMethode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JMethode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJMethode(JMethode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JAttribut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JAttribut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJAttribut(JAttribut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JInstruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JInstruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJInstruction(JInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJExpression(JExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JAppel Methode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JAppel Methode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJAppelMethode(JAppelMethode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JCreation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JCreation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJCreation(JCreation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JVar Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JVar Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJVarRef(JVarRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Constante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Constante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringConstante(StringConstante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JConstructeur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JConstructeur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJConstructeur(JConstructeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JParametre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JParametre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJParametre(JParametre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJType(JType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRef(TypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBase(TypeBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Donnee Typee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Donnee Typee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDonneeTypee(DonneeTypee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Constante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Constante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntConstante(IntConstante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MyJavaSwitch
