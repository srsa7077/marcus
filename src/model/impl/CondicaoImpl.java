/**
 */
package model.impl;

import model.Condicao;
import model.ModelPackage;
import model.Sensor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condicao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.CondicaoImpl#getOperador <em>Operador</em>}</li>
 *   <li>{@link model.impl.CondicaoImpl#getValorComparacao <em>Valor Comparacao</em>}</li>
 *   <li>{@link model.impl.CondicaoImpl#getSensorAlvo <em>Sensor Alvo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CondicaoImpl extends MinimalEObjectImpl.Container implements Condicao {
	/**
	 * The default value of the '{@link #getOperador() <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperador()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERADOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperador() <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperador()
	 * @generated
	 * @ordered
	 */
	protected String operador = OPERADOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorComparacao() <em>Valor Comparacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorComparacao()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_COMPARACAO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValorComparacao() <em>Valor Comparacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorComparacao()
	 * @generated
	 * @ordered
	 */
	protected String valorComparacao = VALOR_COMPARACAO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSensorAlvo() <em>Sensor Alvo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorAlvo()
	 * @generated
	 * @ordered
	 */
	protected Sensor sensorAlvo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CondicaoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONDICAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperador() {
		return operador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperador(String newOperador) {
		String oldOperador = operador;
		operador = newOperador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONDICAO__OPERADOR, oldOperador, operador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValorComparacao() {
		return valorComparacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValorComparacao(String newValorComparacao) {
		String oldValorComparacao = valorComparacao;
		valorComparacao = newValorComparacao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONDICAO__VALOR_COMPARACAO, oldValorComparacao, valorComparacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor getSensorAlvo() {
		if (sensorAlvo != null && sensorAlvo.eIsProxy()) {
			InternalEObject oldSensorAlvo = (InternalEObject)sensorAlvo;
			sensorAlvo = (Sensor)eResolveProxy(oldSensorAlvo);
			if (sensorAlvo != oldSensorAlvo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CONDICAO__SENSOR_ALVO, oldSensorAlvo, sensorAlvo));
			}
		}
		return sensorAlvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor basicGetSensorAlvo() {
		return sensorAlvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensorAlvo(Sensor newSensorAlvo) {
		Sensor oldSensorAlvo = sensorAlvo;
		sensorAlvo = newSensorAlvo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONDICAO__SENSOR_ALVO, oldSensorAlvo, sensorAlvo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CONDICAO__OPERADOR:
				return getOperador();
			case ModelPackage.CONDICAO__VALOR_COMPARACAO:
				return getValorComparacao();
			case ModelPackage.CONDICAO__SENSOR_ALVO:
				if (resolve) return getSensorAlvo();
				return basicGetSensorAlvo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.CONDICAO__OPERADOR:
				setOperador((String)newValue);
				return;
			case ModelPackage.CONDICAO__VALOR_COMPARACAO:
				setValorComparacao((String)newValue);
				return;
			case ModelPackage.CONDICAO__SENSOR_ALVO:
				setSensorAlvo((Sensor)newValue);
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
			case ModelPackage.CONDICAO__OPERADOR:
				setOperador(OPERADOR_EDEFAULT);
				return;
			case ModelPackage.CONDICAO__VALOR_COMPARACAO:
				setValorComparacao(VALOR_COMPARACAO_EDEFAULT);
				return;
			case ModelPackage.CONDICAO__SENSOR_ALVO:
				setSensorAlvo((Sensor)null);
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
			case ModelPackage.CONDICAO__OPERADOR:
				return OPERADOR_EDEFAULT == null ? operador != null : !OPERADOR_EDEFAULT.equals(operador);
			case ModelPackage.CONDICAO__VALOR_COMPARACAO:
				return VALOR_COMPARACAO_EDEFAULT == null ? valorComparacao != null : !VALOR_COMPARACAO_EDEFAULT.equals(valorComparacao);
			case ModelPackage.CONDICAO__SENSOR_ALVO:
				return sensorAlvo != null;
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
		result.append(" (operador: ");
		result.append(operador);
		result.append(", valorComparacao: ");
		result.append(valorComparacao);
		result.append(')');
		return result.toString();
	}

} //CondicaoImpl
