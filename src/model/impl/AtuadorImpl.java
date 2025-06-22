/**
 */
package model.impl;

import java.util.Collection;

import model.AcaoDispositivo;
import model.Atuador;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atuador</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.AtuadorImpl#getTipoAtuador <em>Tipo Atuador</em>}</li>
 *   <li>{@link model.impl.AtuadorImpl#getEstadoAtual <em>Estado Atual</em>}</li>
 *   <li>{@link model.impl.AtuadorImpl#getAcaodispositivo <em>Acaodispositivo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtuadorImpl extends DispositivoImpl implements Atuador {
	/**
	 * The default value of the '{@link #getTipoAtuador() <em>Tipo Atuador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoAtuador()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_ATUADOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoAtuador() <em>Tipo Atuador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoAtuador()
	 * @generated
	 * @ordered
	 */
	protected String tipoAtuador = TIPO_ATUADOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstadoAtual() <em>Estado Atual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstadoAtual()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_ATUAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstadoAtual() <em>Estado Atual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstadoAtual()
	 * @generated
	 * @ordered
	 */
	protected String estadoAtual = ESTADO_ATUAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcaodispositivo() <em>Acaodispositivo</em>}' reference list.
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
	protected AtuadorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ATUADOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTipoAtuador() {
		return tipoAtuador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoAtuador(String newTipoAtuador) {
		String oldTipoAtuador = tipoAtuador;
		tipoAtuador = newTipoAtuador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATUADOR__TIPO_ATUADOR, oldTipoAtuador, tipoAtuador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEstadoAtual() {
		return estadoAtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstadoAtual(String newEstadoAtual) {
		String oldEstadoAtual = estadoAtual;
		estadoAtual = newEstadoAtual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATUADOR__ESTADO_ATUAL, oldEstadoAtual, estadoAtual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AcaoDispositivo> getAcaodispositivo() {
		if (acaodispositivo == null) {
			acaodispositivo = new EObjectResolvingEList<AcaoDispositivo>(AcaoDispositivo.class, this, ModelPackage.ATUADOR__ACAODISPOSITIVO);
		}
		return acaodispositivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ATUADOR__TIPO_ATUADOR:
				return getTipoAtuador();
			case ModelPackage.ATUADOR__ESTADO_ATUAL:
				return getEstadoAtual();
			case ModelPackage.ATUADOR__ACAODISPOSITIVO:
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
			case ModelPackage.ATUADOR__TIPO_ATUADOR:
				setTipoAtuador((String)newValue);
				return;
			case ModelPackage.ATUADOR__ESTADO_ATUAL:
				setEstadoAtual((String)newValue);
				return;
			case ModelPackage.ATUADOR__ACAODISPOSITIVO:
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
			case ModelPackage.ATUADOR__TIPO_ATUADOR:
				setTipoAtuador(TIPO_ATUADOR_EDEFAULT);
				return;
			case ModelPackage.ATUADOR__ESTADO_ATUAL:
				setEstadoAtual(ESTADO_ATUAL_EDEFAULT);
				return;
			case ModelPackage.ATUADOR__ACAODISPOSITIVO:
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
			case ModelPackage.ATUADOR__TIPO_ATUADOR:
				return TIPO_ATUADOR_EDEFAULT == null ? tipoAtuador != null : !TIPO_ATUADOR_EDEFAULT.equals(tipoAtuador);
			case ModelPackage.ATUADOR__ESTADO_ATUAL:
				return ESTADO_ATUAL_EDEFAULT == null ? estadoAtual != null : !ESTADO_ATUAL_EDEFAULT.equals(estadoAtual);
			case ModelPackage.ATUADOR__ACAODISPOSITIVO:
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
		result.append(" (tipoAtuador: ");
		result.append(tipoAtuador);
		result.append(", estadoAtual: ");
		result.append(estadoAtual);
		result.append(')');
		return result.toString();
	}

} //AtuadorImpl
