/**
 */
package model.impl;

import java.util.Collection;
import java.util.Date;

import model.LeituraSensor;
import model.ModelPackage;
import model.Sensor;

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
 * An implementation of the model object '<em><b>Leitura Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.LeituraSensorImpl#getLeituras <em>Leituras</em>}</li>
 *   <li>{@link model.impl.LeituraSensorImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link model.impl.LeituraSensorImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeituraSensorImpl extends MinimalEObjectImpl.Container implements LeituraSensor {
	/**
	 * The cached value of the '{@link #getLeituras() <em>Leituras</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeituras()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> leituras;

	/**
	 * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected String valor = VALOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeituraSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LEITURA_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sensor> getLeituras() {
		if (leituras == null) {
			leituras = new EObjectContainmentEList<Sensor>(Sensor.class, this, ModelPackage.LEITURA_SENSOR__LEITURAS);
		}
		return leituras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValor() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValor(String newValor) {
		String oldValor = valor;
		valor = newValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEITURA_SENSOR__VALOR, oldValor, valor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEITURA_SENSOR__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.LEITURA_SENSOR__LEITURAS:
				return ((InternalEList<?>)getLeituras()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.LEITURA_SENSOR__LEITURAS:
				return getLeituras();
			case ModelPackage.LEITURA_SENSOR__VALOR:
				return getValor();
			case ModelPackage.LEITURA_SENSOR__TIMESTAMP:
				return getTimestamp();
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
			case ModelPackage.LEITURA_SENSOR__LEITURAS:
				getLeituras().clear();
				getLeituras().addAll((Collection<? extends Sensor>)newValue);
				return;
			case ModelPackage.LEITURA_SENSOR__VALOR:
				setValor((String)newValue);
				return;
			case ModelPackage.LEITURA_SENSOR__TIMESTAMP:
				setTimestamp((Date)newValue);
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
			case ModelPackage.LEITURA_SENSOR__LEITURAS:
				getLeituras().clear();
				return;
			case ModelPackage.LEITURA_SENSOR__VALOR:
				setValor(VALOR_EDEFAULT);
				return;
			case ModelPackage.LEITURA_SENSOR__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
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
			case ModelPackage.LEITURA_SENSOR__LEITURAS:
				return leituras != null && !leituras.isEmpty();
			case ModelPackage.LEITURA_SENSOR__VALOR:
				return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
			case ModelPackage.LEITURA_SENSOR__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
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
		result.append(" (valor: ");
		result.append(valor);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //LeituraSensorImpl
