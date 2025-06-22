/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Regra#getNome <em>Nome</em>}</li>
 *   <li>{@link model.Regra#isAtivada <em>Ativada</em>}</li>
 *   <li>{@link model.Regra#getCondicoes <em>Condicoes</em>}</li>
 *   <li>{@link model.Regra#getAcaodispositivo <em>Acaodispositivo</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getRegra()
 * @model
 * @generated
 */
public interface Regra extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see model.ModelPackage#getRegra_Nome()
	 * @model
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link model.Regra#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Ativada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ativada</em>' attribute.
	 * @see #setAtivada(boolean)
	 * @see model.ModelPackage#getRegra_Ativada()
	 * @model
	 * @generated
	 */
	boolean isAtivada();

	/**
	 * Sets the value of the '{@link model.Regra#isAtivada <em>Ativada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ativada</em>' attribute.
	 * @see #isAtivada()
	 * @generated
	 */
	void setAtivada(boolean value);

	/**
	 * Returns the value of the '<em><b>Condicoes</b></em>' containment reference list.
	 * The list contents are of type {@link model.Condicao}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condicoes</em>' containment reference list.
	 * @see model.ModelPackage#getRegra_Condicoes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condicao> getCondicoes();

	/**
	 * Returns the value of the '<em><b>Acaodispositivo</b></em>' containment reference list.
	 * The list contents are of type {@link model.AcaoDispositivo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acaodispositivo</em>' containment reference list.
	 * @see model.ModelPackage#getRegra_Acaodispositivo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AcaoDispositivo> getAcaodispositivo();

} // Regra
