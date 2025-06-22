/**
 */
package model.impl;

import java.util.Collection;

import model.AcaoDispositivo;
import model.Atuador;
import model.Cenario;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acao Dispositivo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.AcaoDispositivoImpl#getAcoesSuportadas <em>Acoes Suportadas</em>}</li>
 *   <li>{@link model.impl.AcaoDispositivoImpl#getAcoes <em>Acoes</em>}</li>
 *   <li>{@link model.impl.AcaoDispositivoImpl#getComando <em>Comando</em>}</li>
 *   <li>{@link model.impl.AcaoDispositivoImpl#getParametro <em>Parametro</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcaoDispositivoImpl extends MinimalEObjectImpl.Container implements AcaoDispositivo {
	/**
	 * The cached value of the '{@link #getAcoesSuportadas() <em>Acoes Suportadas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcoesSuportadas()
	 * @generated
	 * @ordered
	 */
	protected Atuador acoesSuportadas;

	/**
	 * The cached value of the '{@link #getAcoes() <em>Acoes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcoes()
	 * @generated
	 * @ordered
	 */
	protected EList<Cenario> acoes;

	/**
	 * The default value of the '{@link #getComando() <em>Comando</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComando()
	 * @generated
	 * @ordered
	 */
	protected static final String COMANDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComando() <em>Comando</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComando()
	 * @generated
	 * @ordered
	 */
	protected String comando = COMANDO_EDEFAULT;

	/**
	 * The default value of the '{@link #getParametro() <em>Parametro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametro()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETRO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParametro() <em>Parametro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametro()
	 * @generated
	 * @ordered
	 */
	protected String parametro = PARAMETRO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcaoDispositivoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ACAO_DISPOSITIVO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Atuador getAcoesSuportadas() {
		if (acoesSuportadas != null && acoesSuportadas.eIsProxy()) {
			InternalEObject oldAcoesSuportadas = (InternalEObject)acoesSuportadas;
			acoesSuportadas = (Atuador)eResolveProxy(oldAcoesSuportadas);
			if (acoesSuportadas != oldAcoesSuportadas) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ACAO_DISPOSITIVO__ACOES_SUPORTADAS, oldAcoesSuportadas, acoesSuportadas));
			}
		}
		return acoesSuportadas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atuador basicGetAcoesSuportadas() {
		return acoesSuportadas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcoesSuportadas(Atuador newAcoesSuportadas) {
		Atuador oldAcoesSuportadas = acoesSuportadas;
		acoesSuportadas = newAcoesSuportadas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACAO_DISPOSITIVO__ACOES_SUPORTADAS, oldAcoesSuportadas, acoesSuportadas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cenario> getAcoes() {
		if (acoes == null) {
			acoes = new EObjectResolvingEList<Cenario>(Cenario.class, this, ModelPackage.ACAO_DISPOSITIVO__ACOES);
		}
		return acoes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComando() {
		return comando;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComando(String newComando) {
		String oldComando = comando;
		comando = newComando;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACAO_DISPOSITIVO__COMANDO, oldComando, comando));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParametro() {
		return parametro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParametro(String newParametro) {
		String oldParametro = parametro;
		parametro = newParametro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACAO_DISPOSITIVO__PARAMETRO, oldParametro, parametro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ACAO_DISPOSITIVO__ACOES_SUPORTADAS:
				if (resolve) return getAcoesSuportadas();
				return basicGetAcoesSuportadas();
			case ModelPackage.ACAO_DISPOSITIVO__ACOES:
				return getAcoes();
			case ModelPackage.ACAO_DISPOSITIVO__COMANDO:
				return getComando();
			case ModelPackage.ACAO_DISPOSITIVO__PARAMETRO:
				return getParametro();
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
			case ModelPackage.ACAO_DISPOSITIVO__ACOES_SUPORTADAS:
				setAcoesSuportadas((Atuador)newValue);
				return;
			case ModelPackage.ACAO_DISPOSITIVO__ACOES:
				getAcoes().clear();
				getAcoes().addAll((Collection<? extends Cenario>)newValue);
				return;
			case ModelPackage.ACAO_DISPOSITIVO__COMANDO:
				setComando((String)newValue);
				return;
			case ModelPackage.ACAO_DISPOSITIVO__PARAMETRO:
				setParametro((String)newValue);
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
			case ModelPackage.ACAO_DISPOSITIVO__ACOES_SUPORTADAS:
				setAcoesSuportadas((Atuador)null);
				return;
			case ModelPackage.ACAO_DISPOSITIVO__ACOES:
				getAcoes().clear();
				return;
			case ModelPackage.ACAO_DISPOSITIVO__COMANDO:
				setComando(COMANDO_EDEFAULT);
				return;
			case ModelPackage.ACAO_DISPOSITIVO__PARAMETRO:
				setParametro(PARAMETRO_EDEFAULT);
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
			case ModelPackage.ACAO_DISPOSITIVO__ACOES_SUPORTADAS:
				return acoesSuportadas != null;
			case ModelPackage.ACAO_DISPOSITIVO__ACOES:
				return acoes != null && !acoes.isEmpty();
			case ModelPackage.ACAO_DISPOSITIVO__COMANDO:
				return COMANDO_EDEFAULT == null ? comando != null : !COMANDO_EDEFAULT.equals(comando);
			case ModelPackage.ACAO_DISPOSITIVO__PARAMETRO:
				return PARAMETRO_EDEFAULT == null ? parametro != null : !PARAMETRO_EDEFAULT.equals(parametro);
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
		result.append(" (comando: ");
		result.append(comando);
		result.append(", parametro: ");
		result.append(parametro);
		result.append(')');
		return result.toString();
	}

} //AcaoDispositivoImpl
