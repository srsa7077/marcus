/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atuador</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Atuador#getTipoAtuador <em>Tipo Atuador</em>}</li>
 *   <li>{@link model.Atuador#getEstadoAtual <em>Estado Atual</em>}</li>
 *   <li>{@link model.Atuador#getAcaodispositivo <em>Acaodispositivo</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getAtuador()
 * @model
 * @generated
 */
public interface Atuador extends Dispositivo {
	/**
	 * Returns the value of the '<em><b>Tipo Atuador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Atuador</em>' attribute.
	 * @see #setTipoAtuador(String)
	 * @see model.ModelPackage#getAtuador_TipoAtuador()
	 * @model
	 * @generated
	 */
	String getTipoAtuador();

	/**
	 * Sets the value of the '{@link model.Atuador#getTipoAtuador <em>Tipo Atuador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Atuador</em>' attribute.
	 * @see #getTipoAtuador()
	 * @generated
	 */
	void setTipoAtuador(String value);

	/**
	 * Returns the value of the '<em><b>Estado Atual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado Atual</em>' attribute.
	 * @see #setEstadoAtual(String)
	 * @see model.ModelPackage#getAtuador_EstadoAtual()
	 * @model
	 * @generated
	 */
	String getEstadoAtual();

	/**
	 * Sets the value of the '{@link model.Atuador#getEstadoAtual <em>Estado Atual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado Atual</em>' attribute.
	 * @see #getEstadoAtual()
	 * @generated
	 */
	void setEstadoAtual(String value);

	/**
	 * Returns the value of the '<em><b>Acaodispositivo</b></em>' reference list.
	 * The list contents are of type {@link model.AcaoDispositivo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acaodispositivo</em>' reference list.
	 * @see model.ModelPackage#getAtuador_Acaodispositivo()
	 * @model
	 * @generated
	 */
	EList<AcaoDispositivo> getAcaodispositivo();

} // Atuador
