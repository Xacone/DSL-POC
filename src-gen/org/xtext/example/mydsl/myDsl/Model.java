/**
 * generated by Xtext 2.31.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getTokens <em>Tokens</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getArrays <em>Arrays</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getLoops <em>Loops</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getIdentifications <em>Identifications</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.api_token}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tokens</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Tokens()
   * @model containment="true"
   * @generated
   */
  EList<api_token> getTokens();

  /**
   * Returns the value of the '<em><b>Arrays</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.array}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrays</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Arrays()
   * @model containment="true"
   * @generated
   */
  EList<array> getArrays();

  /**
   * Returns the value of the '<em><b>Loops</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loops</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Loops()
   * @model unique="false"
   * @generated
   */
  EList<String> getLoops();

  /**
   * Returns the value of the '<em><b>Identifications</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.identify}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifications</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Identifications()
   * @model containment="true"
   * @generated
   */
  EList<identify> getIdentifications();

} // Model
