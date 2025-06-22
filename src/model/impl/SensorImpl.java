/**
 */
package model.impl;

import model.ModelPackage;
import model.Sensor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.SensorImpl#getTipoSensor <em>Tipo Sensor</em>}</li>
 *   <li>{@link model.impl.SensorImpl#getValorAtual <em>Valor Atual</em>}</li>
 *   <li>{@link model.impl.SensorImpl#getUnidade <em>Unidade</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends DispositivoImpl implements Sensor {
	/**
	 * The default value of the '{@link #getTipoSensor() <em>Tipo Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoSensor()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_SENSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoSensor() <em>Tipo Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoSensor()
	 * @generated
	 * @ordered
	 */
	protected String tipoSensor = TIPO_SENSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorAtual() <em>Valor Atual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorAtual()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_ATUAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValorAtual() <em>Valor Atual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorAtual()
	 * @generated
	 * @ordered
	 */
	protected String valorAtual = VALOR_ATUAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnidade() <em>Unidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidade()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIDADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnidade() <em>Unidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidade()
	 * @generated
	 * @ordered
	 */
	protected String unidade = UNIDADE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTipoSensor() {
		return tipoSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoSensor(String newTipoSensor) {
		String oldTipoSensor = tipoSensor;
		tipoSensor = newTipoSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SENSOR__TIPO_SENSOR, oldTipoSensor, tipoSensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValorAtual() {
		return valorAtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValorAtual(String newValorAtual) {
		String oldValorAtual = valorAtual;
		valorAtual = newValorAtual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SENSOR__VALOR_ATUAL, oldValorAtual, valorAtual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnidade() {
		return unidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnidade(String newUnidade) {
		String oldUnidade = unidade;
		unidade = newUnidade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SENSOR__UNIDADE, oldUnidade, unidade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SENSOR__TIPO_SENSOR:
				return getTipoSensor();
			case ModelPackage.SENSOR__VALOR_ATUAL:
				return getValorAtual();
			case ModelPackage.SENSOR__UNIDADE:
				return getUnidade();
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
			case ModelPackage.SENSOR__TIPO_SENSOR:
				setTipoSensor((String)newValue);
				return;
			case ModelPackage.SENSOR__VALOR_ATUAL:
				setValorAtual((String)newValue);
				return;
			case ModelPackage.SENSOR__UNIDADE:
				setUnidade((String)newValue);
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
			case ModelPackage.SENSOR__TIPO_SENSOR:
				setTipoSensor(TIPO_SENSOR_EDEFAULT);
				return;
			case ModelPackage.SENSOR__VALOR_ATUAL:
				setValorAtual(VALOR_ATUAL_EDEFAULT);
				return;
			case ModelPackage.SENSOR__UNIDADE:
				setUnidade(UNIDADE_EDEFAULT);
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
			case ModelPackage.SENSOR__TIPO_SENSOR:
				return TIPO_SENSOR_EDEFAULT == null ? tipoSensor != null : !TIPO_SENSOR_EDEFAULT.equals(tipoSensor);
			case ModelPackage.SENSOR__VALOR_ATUAL:
				return VALOR_ATUAL_EDEFAULT == null ? valorAtual != null : !VALOR_ATUAL_EDEFAULT.equals(valorAtual);
			case ModelPackage.SENSOR__UNIDADE:
				return UNIDADE_EDEFAULT == null ? unidade != null : !UNIDADE_EDEFAULT.equals(unidade);
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
		result.append(" (tipoSensor: ");
		result.append(tipoSensor);
		result.append(", valorAtual: ");
		result.append(valorAtual);
		result.append(", unidade: ");
		result.append(unidade);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
