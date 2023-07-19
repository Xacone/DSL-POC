/**
 * generated by Xtext 2.31.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.array;
import org.xtext.example.mydsl.myDsl.arrayElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.arrayImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.arrayImpl#getArray_names <em>Array names</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.arrayImpl#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class arrayImpl extends MinimalEObjectImpl.Container implements array
{
  /**
   * The cached value of the '{@link #getTargets() <em>Targets</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargets()
   * @generated
   * @ordered
   */
  protected EList<String> targets;

  /**
   * The cached value of the '{@link #getArray_names() <em>Array names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray_names()
   * @generated
   * @ordered
   */
  protected EList<String> array_names;

  /**
   * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected EList<arrayElement> array;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected arrayImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.ARRAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getTargets()
  {
    if (targets == null)
    {
      targets = new EDataTypeEList<String>(String.class, this, MyDslPackage.ARRAY__TARGETS);
    }
    return targets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getArray_names()
  {
    if (array_names == null)
    {
      array_names = new EDataTypeEList<String>(String.class, this, MyDslPackage.ARRAY__ARRAY_NAMES);
    }
    return array_names;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<arrayElement> getArray()
  {
    if (array == null)
    {
      array = new EObjectContainmentEList<arrayElement>(arrayElement.class, this, MyDslPackage.ARRAY__ARRAY);
    }
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.ARRAY__ARRAY:
        return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.ARRAY__TARGETS:
        return getTargets();
      case MyDslPackage.ARRAY__ARRAY_NAMES:
        return getArray_names();
      case MyDslPackage.ARRAY__ARRAY:
        return getArray();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.ARRAY__TARGETS:
        getTargets().clear();
        getTargets().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.ARRAY__ARRAY_NAMES:
        getArray_names().clear();
        getArray_names().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.ARRAY__ARRAY:
        getArray().clear();
        getArray().addAll((Collection<? extends arrayElement>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ARRAY__TARGETS:
        getTargets().clear();
        return;
      case MyDslPackage.ARRAY__ARRAY_NAMES:
        getArray_names().clear();
        return;
      case MyDslPackage.ARRAY__ARRAY:
        getArray().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ARRAY__TARGETS:
        return targets != null && !targets.isEmpty();
      case MyDslPackage.ARRAY__ARRAY_NAMES:
        return array_names != null && !array_names.isEmpty();
      case MyDslPackage.ARRAY__ARRAY:
        return array != null && !array.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (targets: ");
    result.append(targets);
    result.append(", array_names: ");
    result.append(array_names);
    result.append(')');
    return result.toString();
  }

} //arrayImpl
