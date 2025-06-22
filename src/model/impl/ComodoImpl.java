/**
 */
package model.impl;

import java.util.Collection;

import model.Comodo;
import model.Dispositivo;
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
 * An implementation of the model object '<em><b>Comodo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.ComodoImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link model.impl.ComodoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link model.impl.ComodoImpl#getDispositivos <em>Dispositivos</em>}</li>
 *   <li>{@link model.impl.ComodoImpl#getSensores <em>Sensores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComodoImpl extends MinimalEObjectImpl.Container implements Comodo {
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
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDispositivos() <em>Dispositivos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositivos()
	 * @generated
	 * @ordered
	 */
	protected EList<Dispositivo> dispositivos;

	/**
	 * The cached value of the '{@link #getSensores() <em>Sensores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensores()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComodoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMODO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMODO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMODO__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dispositivo> getDispositivos() {
		if (dispositivos == null) {
			dispositivos = new EObjectContainmentEList<Dispositivo>(Dispositivo.class, this, ModelPackage.COMODO__DISPOSITIVOS);
		}
		return dispositivos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sensor> getSensores() {
		if (sensores == null) {
			sensores = new EObjectContainmentEList<Sensor>(Sensor.class, this, ModelPackage.COMODO__SENSORES);
		}
		return sensores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.COMODO__DISPOSITIVOS:
				return ((InternalEList<?>)getDispositivos()).basicRemove(otherEnd, msgs);
			case ModelPackage.COMODO__SENSORES:
				return ((InternalEList<?>)getSensores()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.COMODO__NOME:
				return getNome();
			case ModelPackage.COMODO__TIPO:
				return getTipo();
			case ModelPackage.COMODO__DISPOSITIVOS:
				return getDispositivos();
			case ModelPackage.COMODO__SENSORES:
				return getSensores();
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
			case ModelPackage.COMODO__NOME:
				setNome((String)newValue);
				return;
			case ModelPackage.COMODO__TIPO:
				setTipo((String)newValue);
				return;
			case ModelPackage.COMODO__DISPOSITIVOS:
				getDispositivos().clear();
				getDispositivos().addAll((Collection<? extends Dispositivo>)newValue);
				return;
			case ModelPackage.COMODO__SENSORES:
				getSensores().clear();
				getSensores().addAll((Collection<? extends Sensor>)newValue);
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
			case ModelPackage.COMODO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelPackage.COMODO__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case ModelPackage.COMODO__DISPOSITIVOS:
				getDispositivos().clear();
				return;
			case ModelPackage.COMODO__SENSORES:
				getSensores().clear();
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
			case ModelPackage.COMODO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelPackage.COMODO__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case ModelPackage.COMODO__DISPOSITIVOS:
				return dispositivos != null && !dispositivos.isEmpty();
			case ModelPackage.COMODO__SENSORES:
				return sensores != null && !sensores.isEmpty();
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
		result.append(", tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //ComodoImpl
