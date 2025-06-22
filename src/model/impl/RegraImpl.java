/**
 */
package model.impl;

import java.util.Collection;

import model.AcaoDispositivo;
import model.Condicao;
import model.ModelPackage;
import model.Regra;

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
 * An implementation of the model object '<em><b>Regra</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.RegraImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link model.impl.RegraImpl#isAtivada <em>Ativada</em>}</li>
 *   <li>{@link model.impl.RegraImpl#getCondicoes <em>Condicoes</em>}</li>
 *   <li>{@link model.impl.RegraImpl#getAcaodispositivo <em>Acaodispositivo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegraImpl extends MinimalEObjectImpl.Container implements Regra {
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
	 * The default value of the '{@link #isAtivada() <em>Ativada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtivada()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATIVADA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAtivada() <em>Ativada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtivada()
	 * @generated
	 * @ordered
	 */
	protected boolean ativada = ATIVADA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCondicoes() <em>Condicoes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondicoes()
	 * @generated
	 * @ordered
	 */
	protected EList<Condicao> condicoes;

	/**
	 * The cached value of the '{@link #getAcaodispositivo() <em>Acaodispositivo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcaodispositivo()
	 * @generated
	 * @ordered
	 */
	protected EList<AcaoDispositivo> acaodispositivo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.REGRA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGRA__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAtivada() {
		return ativada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAtivada(boolean newAtivada) {
		boolean oldAtivada = ativada;
		ativada = newAtivada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGRA__ATIVADA, oldAtivada, ativada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condicao> getCondicoes() {
		if (condicoes == null) {
			condicoes = new EObjectContainmentEList<Condicao>(Condicao.class, this, ModelPackage.REGRA__CONDICOES);
		}
		return condicoes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AcaoDispositivo> getAcaodispositivo() {
		if (acaodispositivo == null) {
			acaodispositivo = new EObjectContainmentEList<AcaoDispositivo>(AcaoDispositivo.class, this, ModelPackage.REGRA__ACAODISPOSITIVO);
		}
		return acaodispositivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.REGRA__CONDICOES:
				return ((InternalEList<?>)getCondicoes()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGRA__ACAODISPOSITIVO:
				return ((InternalEList<?>)getAcaodispositivo()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.REGRA__NOME:
				return getNome();
			case ModelPackage.REGRA__ATIVADA:
				return isAtivada();
			case ModelPackage.REGRA__CONDICOES:
				return getCondicoes();
			case ModelPackage.REGRA__ACAODISPOSITIVO:
				return getAcaodispositivo();
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
			case ModelPackage.REGRA__NOME:
				setNome((String)newValue);
				return;
			case ModelPackage.REGRA__ATIVADA:
				setAtivada((Boolean)newValue);
				return;
			case ModelPackage.REGRA__CONDICOES:
				getCondicoes().clear();
				getCondicoes().addAll((Collection<? extends Condicao>)newValue);
				return;
			case ModelPackage.REGRA__ACAODISPOSITIVO:
				getAcaodispositivo().clear();
				getAcaodispositivo().addAll((Collection<? extends AcaoDispositivo>)newValue);
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
			case ModelPackage.REGRA__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelPackage.REGRA__ATIVADA:
				setAtivada(ATIVADA_EDEFAULT);
				return;
			case ModelPackage.REGRA__CONDICOES:
				getCondicoes().clear();
				return;
			case ModelPackage.REGRA__ACAODISPOSITIVO:
				getAcaodispositivo().clear();
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
			case ModelPackage.REGRA__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelPackage.REGRA__ATIVADA:
				return ativada != ATIVADA_EDEFAULT;
			case ModelPackage.REGRA__CONDICOES:
				return condicoes != null && !condicoes.isEmpty();
			case ModelPackage.REGRA__ACAODISPOSITIVO:
				return acaodispositivo != null && !acaodispositivo.isEmpty();
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
		result.append(", ativada: ");
		result.append(ativada);
		result.append(')');
		return result.toString();
	}

} //RegraImpl
