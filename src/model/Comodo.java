/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Comodo#getNome <em>Nome</em>}</li>
 *   <li>{@link model.Comodo#getTipo <em>Tipo</em>}</li>
 *   <li>{@link model.Comodo#getDispositivos <em>Dispositivos</em>}</li>
 *   <li>{@link model.Comodo#getSensores <em>Sensores</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getComodo()
 * @model
 * @generated
 */
public interface Comodo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see model.ModelPackage#getComodo_Nome()
	 * @model
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link model.Comodo#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see model.ModelPackage#getComodo_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link model.Comodo#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Dispositivos</b></em>' containment reference list.
	 * The list contents are of type {@link model.Dispositivo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispositivos</em>' containment reference list.
	 * @see model.ModelPackage#getComodo_Dispositivos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dispositivo> getDispositivos();

	/**
	 * Returns the value of the '<em><b>Sensores</b></em>' containment reference list.
	 * The list contents are of type {@link model.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensores</em>' containment reference list.
	 * @see model.ModelPackage#getComodo_Sensores()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensores();

} // Comodo
