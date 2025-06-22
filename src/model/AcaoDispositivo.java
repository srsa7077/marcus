/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acao Dispositivo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.AcaoDispositivo#getAcoesSuportadas <em>Acoes Suportadas</em>}</li>
 *   <li>{@link model.AcaoDispositivo#getAcoes <em>Acoes</em>}</li>
 *   <li>{@link model.AcaoDispositivo#getComando <em>Comando</em>}</li>
 *   <li>{@link model.AcaoDispositivo#getParametro <em>Parametro</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getAcaoDispositivo()
 * @model
 * @generated
 */
public interface AcaoDispositivo extends EObject {
	/**
	 * Returns the value of the '<em><b>Acoes Suportadas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acoes Suportadas</em>' reference.
	 * @see #setAcoesSuportadas(Atuador)
	 * @see model.ModelPackage#getAcaoDispositivo_AcoesSuportadas()
	 * @model required="true"
	 * @generated
	 */
	Atuador getAcoesSuportadas();

	/**
	 * Sets the value of the '{@link model.AcaoDispositivo#getAcoesSuportadas <em>Acoes Suportadas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acoes Suportadas</em>' reference.
	 * @see #getAcoesSuportadas()
	 * @generated
	 */
	void setAcoesSuportadas(Atuador value);

	/**
	 * Returns the value of the '<em><b>Acoes</b></em>' reference list.
	 * The list contents are of type {@link model.Cenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acoes</em>' reference list.
	 * @see model.ModelPackage#getAcaoDispositivo_Acoes()
	 * @model required="true"
	 * @generated
	 */
	EList<Cenario> getAcoes();

	/**
	 * Returns the value of the '<em><b>Comando</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comando</em>' attribute.
	 * @see #setComando(String)
	 * @see model.ModelPackage#getAcaoDispositivo_Comando()
	 * @model
	 * @generated
	 */
	String getComando();

	/**
	 * Sets the value of the '{@link model.AcaoDispositivo#getComando <em>Comando</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comando</em>' attribute.
	 * @see #getComando()
	 * @generated
	 */
	void setComando(String value);

	/**
	 * Returns the value of the '<em><b>Parametro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametro</em>' attribute.
	 * @see #setParametro(String)
	 * @see model.ModelPackage#getAcaoDispositivo_Parametro()
	 * @model
	 * @generated
	 */
	String getParametro();

	/**
	 * Sets the value of the '{@link model.AcaoDispositivo#getParametro <em>Parametro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametro</em>' attribute.
	 * @see #getParametro()
	 * @generated
	 */
	void setParametro(String value);

} // AcaoDispositivo
