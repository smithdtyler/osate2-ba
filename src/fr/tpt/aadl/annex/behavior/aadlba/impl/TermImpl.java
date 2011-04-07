/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tpt.aadl.annex.behavior.aadlba.impl;

import fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage;
import fr.tpt.aadl.annex.behavior.aadlba.Factor;
import fr.tpt.aadl.annex.behavior.aadlba.MultiplyingOperator;
import fr.tpt.aadl.annex.behavior.aadlba.Term;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.impl.TermImpl#getFactors <em>Factors</em>}</li>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.impl.TermImpl#getMultiplyingOperators <em>Multiplying Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermImpl extends BehaviorElementImpl implements Term {
	/**
	 * The cached value of the '{@link #getFactors() <em>Factors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<Factor> factors;

	/**
	 * The cached value of the '{@link #getMultiplyingOperators() <em>Multiplying Operators</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplyingOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiplyingOperator> multiplyingOperators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AadlBaPackage.Literals.TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Factor> getFactors() {
		if (factors == null) {
			factors = new EObjectContainmentEList.Unsettable<Factor>(Factor.class, this, AadlBaPackage.TERM__FACTORS);
		}
		return factors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFactors() {
		if (factors != null) ((InternalEList.Unsettable<?>)factors).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFactors() {
		return factors != null && ((InternalEList.Unsettable<?>)factors).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiplyingOperator> getMultiplyingOperators() {
		if (multiplyingOperators == null) {
			multiplyingOperators = new EDataTypeEList.Unsettable<MultiplyingOperator>(MultiplyingOperator.class, this, AadlBaPackage.TERM__MULTIPLYING_OPERATORS);
		}
		return multiplyingOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultiplyingOperators() {
		if (multiplyingOperators != null) ((InternalEList.Unsettable<?>)multiplyingOperators).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultiplyingOperators() {
		return multiplyingOperators != null && ((InternalEList.Unsettable<?>)multiplyingOperators).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AadlBaPackage.TERM__FACTORS:
				return ((InternalEList<?>)getFactors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AadlBaPackage.TERM__FACTORS:
				return getFactors();
			case AadlBaPackage.TERM__MULTIPLYING_OPERATORS:
				return getMultiplyingOperators();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AadlBaPackage.TERM__FACTORS:
				getFactors().clear();
				getFactors().addAll((Collection<? extends Factor>)newValue);
				return;
			case AadlBaPackage.TERM__MULTIPLYING_OPERATORS:
				getMultiplyingOperators().clear();
				getMultiplyingOperators().addAll((Collection<? extends MultiplyingOperator>)newValue);
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
			case AadlBaPackage.TERM__FACTORS:
				unsetFactors();
				return;
			case AadlBaPackage.TERM__MULTIPLYING_OPERATORS:
				unsetMultiplyingOperators();
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
			case AadlBaPackage.TERM__FACTORS:
				return isSetFactors();
			case AadlBaPackage.TERM__MULTIPLYING_OPERATORS:
				return isSetMultiplyingOperators();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (multiplyingOperators: ");
		result.append(multiplyingOperators);
		result.append(')');
		return result.toString();
	}

} //TermImpl
