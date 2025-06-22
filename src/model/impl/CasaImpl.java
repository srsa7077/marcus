/**
 */
package model.impl;

import java.util.Collection;

import model.Casa;
import model.Comodo;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Casa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.CasaImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link model.impl.CasaImpl#getEndereco <em>Endereco</em>}</li>
 *   <li>{@link model.impl.CasaImpl#getComodos <em>Comodos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CasaImpl extends MinimalEObjectImpl.Container implements Casa {
	/**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndereco() <em>Endereco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDERECO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndereco() <em>Endereco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco()
	 * @generated
	 * @ordered
	 */
	protected String endereco = ENDERECO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComodos() <em>Comodos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComodos()
	 * @generated
	 * @ordered
	 */
	protected EList<Comodo> comodos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CasaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CASA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CASA__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndereco() {
		return endereco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndereco(String newEndereco) {
		String oldEndereco = endereco;
		endereco = newEndereco;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CASA__ENDERECO, oldEndereco, endereco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comodo> getComodos() {
		if (comodos == null) {
			comodos = new EObjectContainmentEList<Comodo>(Comodo.class, this, ModelPackage.CASA__COMODOS);
		}
		return comodos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CASA__COMODOS:
				return ((InternalEList<?>)getComodos()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.CASA__NOME:
				return getNome();
			case ModelPackage.CASA__ENDERECO:
				return getEndereco();
			case ModelPackage.CASA__COMODOS:
				return getComodos();
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
			case ModelPackage.CASA__NOME:
				setNome((String)newValue);
				return;
			case ModelPackage.CASA__ENDERECO:
				setEndereco((String)newValue);
				return;
			case ModelPackage.CASA__COMODOS:
				getComodos().clear();
				getComodos().addAll((Collection<? extends Comodo>)newValue);
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
			case ModelPackage.CASA__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelPackage.CASA__ENDERECO:
				setEndereco(ENDERECO_EDEFAULT);
				return;
			case ModelPackage.CASA__COMODOS:
				getComodos().clear();
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
			case ModelPackage.CASA__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelPackage.CASA__ENDERECO:
				return ENDERECO_EDEFAULT == null ? endereco != null : !ENDERECO_EDEFAULT.equals(endereco);
			case ModelPackage.CASA__COMODOS:
				return comodos != null && !comodos.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nome: ");
		result.append(nome);
		result.append(", endereco: ");
		result.append(endereco);
		result.append(')');
		return result.toString();
	}

} //CasaImpl
