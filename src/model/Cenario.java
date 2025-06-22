/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Cenario#getNome <em>Nome</em>}</li>
 *   <li>{@link model.Cenario#getDescricao <em>Descricao</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getCenario()
 * @model
 * @generated
 */
public interface Cenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see model.ModelPackage#getCenario_Nome()
	 * @model
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link model.Cenario#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Descricao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descricao</em>' attribute.
	 * @see #setDescricao(String)
	 * @see model.ModelPackage#getCenario_Descricao()
	 * @model
	 * @generated
	 */
	String getDescricao();

	/**
	 * Sets the value of the '{@link model.Cenario#getDescricao <em>Descricao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descricao</em>' attribute.
	 * @see #getDescricao()
	 * @generated
	 */
	void setDescricao(String value);

} // Cenario
