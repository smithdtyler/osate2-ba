/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2011 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the Eclipse Public License as published by Eclipse, either
 * version 1.0 of the License, or (at your option) any later version. This
 * program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the Eclipse Public License for
 * more details. You should have received a copy of the Eclipse Public License
 * along with this program. If not, see
 * http://www.eclipse.org/org/documents/epl-v10.php
 */
package org.osate.ba.aadlba.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.Parameter;
import org.osate.ba.aadlba.AadlBaPackage ;
import org.osate.ba.aadlba.ElementValues ;
import org.osate.ba.aadlba.GroupHolder ;
import org.osate.ba.aadlba.GroupableElement ;
import org.osate.ba.aadlba.IndexableElement ;
import org.osate.ba.aadlba.IntegerValue ;
import org.osate.ba.aadlba.ParameterHolder ;
import org.osate.ba.aadlba.ParameterLabel ;
import org.osate.ba.aadlba.Target ;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.ba.aadlba.impl.ParameterHolderImpl#getGroupHolders <em>Group Holders</em>}</li>
 *   <li>{@link org.osate.ba.aadlba.impl.ParameterHolderImpl#getArrayIndexes <em>Array Indexes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterHolderImpl extends DataHolderImpl implements ParameterHolder
{
  /**
   * The cached value of the '{@link #getGroupHolders() <em>Group Holders</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupHolders()
   * @generated
   * @ordered
   */
  protected EList<GroupHolder> groupHolders;

  /**
   * The cached value of the '{@link #getArrayIndexes() <em>Array Indexes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayIndexes()
   * @generated
   * @ordered
   */
  protected EList<IntegerValue> arrayIndexes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterHolderImpl()
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
    return AadlBaPackage.Literals.PARAMETER_HOLDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupHolder> getGroupHolders()
  {
    if (groupHolders == null)
    {
      groupHolders = new EObjectContainmentEList.Unsettable<GroupHolder>(GroupHolder.class, this, AadlBaPackage.PARAMETER_HOLDER__GROUP_HOLDERS);
    }
    return groupHolders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetGroupHolders()
  {
    if (groupHolders != null) ((InternalEList.Unsettable<?>)groupHolders).unset();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetGroupHolders()
  {
    return groupHolders != null && ((InternalEList.Unsettable<?>)groupHolders).isSet();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntegerValue> getArrayIndexes()
  {
    if (arrayIndexes == null)
    {
      arrayIndexes = new EObjectContainmentEList.Unsettable<IntegerValue>(IntegerValue.class, this, AadlBaPackage.PARAMETER_HOLDER__ARRAY_INDEXES);
    }
    return arrayIndexes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetArrayIndexes()
  {
    if (arrayIndexes != null) ((InternalEList.Unsettable<?>)arrayIndexes).unset();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetArrayIndexes()
  {
    return arrayIndexes != null && ((InternalEList.Unsettable<?>)arrayIndexes).isSet();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(Parameter parameter)
  {
    element = parameter ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getParameter()
  {
    return (Parameter) element;
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
      case AadlBaPackage.PARAMETER_HOLDER__GROUP_HOLDERS:
        return ((InternalEList<?>)getGroupHolders()).basicRemove(otherEnd, msgs);
      case AadlBaPackage.PARAMETER_HOLDER__ARRAY_INDEXES:
        return ((InternalEList<?>)getArrayIndexes()).basicRemove(otherEnd, msgs);
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
      case AadlBaPackage.PARAMETER_HOLDER__GROUP_HOLDERS:
        return getGroupHolders();
      case AadlBaPackage.PARAMETER_HOLDER__ARRAY_INDEXES:
        return getArrayIndexes();
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
      case AadlBaPackage.PARAMETER_HOLDER__GROUP_HOLDERS:
        getGroupHolders().clear();
        getGroupHolders().addAll((Collection<? extends GroupHolder>)newValue);
        return;
      case AadlBaPackage.PARAMETER_HOLDER__ARRAY_INDEXES:
        getArrayIndexes().clear();
        getArrayIndexes().addAll((Collection<? extends IntegerValue>)newValue);
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
      case AadlBaPackage.PARAMETER_HOLDER__GROUP_HOLDERS:
        unsetGroupHolders();
        return;
      case AadlBaPackage.PARAMETER_HOLDER__ARRAY_INDEXES:
        unsetArrayIndexes();
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
      case AadlBaPackage.PARAMETER_HOLDER__GROUP_HOLDERS:
        return isSetGroupHolders();
      case AadlBaPackage.PARAMETER_HOLDER__ARRAY_INDEXES:
        return isSetArrayIndexes();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == GroupableElement.class)
    {
      switch (derivedFeatureID)
      {
        case AadlBaPackage.PARAMETER_HOLDER__GROUP_HOLDERS: return AadlBaPackage.GROUPABLE_ELEMENT__GROUP_HOLDERS;
        default: return -1;
      }
    }
    if (baseClass == IndexableElement.class)
    {
      switch (derivedFeatureID)
      {
        case AadlBaPackage.PARAMETER_HOLDER__ARRAY_INDEXES: return AadlBaPackage.INDEXABLE_ELEMENT__ARRAY_INDEXES;
        default: return -1;
      }
    }
    if (baseClass == ParameterLabel.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Target.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ElementValues.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == GroupableElement.class)
    {
      switch (baseFeatureID)
      {
        case AadlBaPackage.GROUPABLE_ELEMENT__GROUP_HOLDERS: return AadlBaPackage.PARAMETER_HOLDER__GROUP_HOLDERS;
        default: return -1;
      }
    }
    if (baseClass == IndexableElement.class)
    {
      switch (baseFeatureID)
      {
        case AadlBaPackage.INDEXABLE_ELEMENT__ARRAY_INDEXES: return AadlBaPackage.PARAMETER_HOLDER__ARRAY_INDEXES;
        default: return -1;
      }
    }
    if (baseClass == ParameterLabel.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Target.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ElementValues.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ParameterHolderImpl