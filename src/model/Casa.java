/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Casa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Casa#getNome <em>Nome</em>}</li>
 *   <li>{@link model.Casa#getEndereco <em>Endereco</em>}</li>
 *   <li>{@link model.Casa#getComodos <em>Comodos</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getCasa()
 * @model
 * @generated
 */
public interface Casa extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see model.ModelPackage#getCasa_Nome()
	 * @model
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link model.Casa#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Endereco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endereco</em>' attribute.
	 * @see #setEndereco(String)
	 * @see model.ModelPackage#getCasa_Endereco()
	 * @model
	 * @generated
	 */
	String getEndereco();

	/**
	 * Sets the value of the '{@link model.Casa#getEndereco <em>Endereco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endereco</em>' attribute.
	 * @see #getEndereco()
	 * @generated
	 */
	void setEndereco(String value);

	/**
	 * Returns the value of the '<em><b>Comodos</b></em>' containment reference list.
	 * The list contents are of type {@link model.Comodo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comodos</em>' containment reference list.
	 * @see model.ModelPackage#getCasa_Comodos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Comodo> getComodos();

} // Casa
