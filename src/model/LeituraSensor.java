/**
 */
package model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leitura Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.LeituraSensor#getLeituras <em>Leituras</em>}</li>
 *   <li>{@link model.LeituraSensor#getValor <em>Valor</em>}</li>
 *   <li>{@link model.LeituraSensor#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getLeituraSensor()
 * @model
 * @generated
 */
public interface LeituraSensor extends EObject {
	/**
	 * Returns the value of the '<em><b>Leituras</b></em>' containment reference list.
	 * The list contents are of type {@link model.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leituras</em>' containment reference list.
	 * @see model.ModelPackage#getLeituraSensor_Leituras()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getLeituras();

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(String)
	 * @see model.ModelPackage#getLeituraSensor_Valor()
	 * @model
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link model.LeituraSensor#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see model.ModelPackage#getLeituraSensor_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link model.LeituraSensor#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

} // LeituraSensor
