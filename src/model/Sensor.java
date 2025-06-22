/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Sensor#getTipoSensor <em>Tipo Sensor</em>}</li>
 *   <li>{@link model.Sensor#getValorAtual <em>Valor Atual</em>}</li>
 *   <li>{@link model.Sensor#getUnidade <em>Unidade</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Dispositivo {
	/**
	 * Returns the value of the '<em><b>Tipo Sensor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Sensor</em>' attribute.
	 * @see #setTipoSensor(String)
	 * @see model.ModelPackage#getSensor_TipoSensor()
	 * @model
	 * @generated
	 */
	String getTipoSensor();

	/**
	 * Sets the value of the '{@link model.Sensor#getTipoSensor <em>Tipo Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Sensor</em>' attribute.
	 * @see #getTipoSensor()
	 * @generated
	 */
	void setTipoSensor(String value);

	/**
	 * Returns the value of the '<em><b>Valor Atual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Atual</em>' attribute.
	 * @see #setValorAtual(String)
	 * @see model.ModelPackage#getSensor_ValorAtual()
	 * @model
	 * @generated
	 */
	String getValorAtual();

	/**
	 * Sets the value of the '{@link model.Sensor#getValorAtual <em>Valor Atual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Atual</em>' attribute.
	 * @see #getValorAtual()
	 * @generated
	 */
	void setValorAtual(String value);

	/**
	 * Returns the value of the '<em><b>Unidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidade</em>' attribute.
	 * @see #setUnidade(String)
	 * @see model.ModelPackage#getSensor_Unidade()
	 * @model
	 * @generated
	 */
	String getUnidade();

	/**
	 * Sets the value of the '{@link model.Sensor#getUnidade <em>Unidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidade</em>' attribute.
	 * @see #getUnidade()
	 * @generated
	 */
	void setUnidade(String value);

} // Sensor
