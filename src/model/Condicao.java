/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condicao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Condicao#getOperador <em>Operador</em>}</li>
 *   <li>{@link model.Condicao#getValorComparacao <em>Valor Comparacao</em>}</li>
 *   <li>{@link model.Condicao#getSensorAlvo <em>Sensor Alvo</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getCondicao()
 * @model
 * @generated
 */
public interface Condicao extends EObject {
	/**
	 * Returns the value of the '<em><b>Operador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador</em>' attribute.
	 * @see #setOperador(String)
	 * @see model.ModelPackage#getCondicao_Operador()
	 * @model
	 * @generated
	 */
	String getOperador();

	/**
	 * Sets the value of the '{@link model.Condicao#getOperador <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' attribute.
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(String value);

	/**
	 * Returns the value of the '<em><b>Valor Comparacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Comparacao</em>' attribute.
	 * @see #setValorComparacao(String)
	 * @see model.ModelPackage#getCondicao_ValorComparacao()
	 * @model
	 * @generated
	 */
	String getValorComparacao();

	/**
	 * Sets the value of the '{@link model.Condicao#getValorComparacao <em>Valor Comparacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Comparacao</em>' attribute.
	 * @see #getValorComparacao()
	 * @generated
	 */
	void setValorComparacao(String value);

	/**
	 * Returns the value of the '<em><b>Sensor Alvo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Alvo</em>' reference.
	 * @see #setSensorAlvo(Sensor)
	 * @see model.ModelPackage#getCondicao_SensorAlvo()
	 * @model required="true"
	 * @generated
	 */
	Sensor getSensorAlvo();

	/**
	 * Sets the value of the '{@link model.Condicao#getSensorAlvo <em>Sensor Alvo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Alvo</em>' reference.
	 * @see #getSensorAlvo()
	 * @generated
	 */
	void setSensorAlvo(Sensor value);

} // Condicao
