/**
 */
package model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Casa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Casa</em>'.
	 * @generated
	 */
	Casa createCasa();

	/**
	 * Returns a new object of class '<em>Comodo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comodo</em>'.
	 * @generated
	 */
	Comodo createComodo();

	/**
	 * Returns a new object of class '<em>Dispositivo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dispositivo</em>'.
	 * @generated
	 */
	Dispositivo createDispositivo();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Atuador</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atuador</em>'.
	 * @generated
	 */
	Atuador createAtuador();

	/**
	 * Returns a new object of class '<em>Acao Dispositivo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acao Dispositivo</em>'.
	 * @generated
	 */
	AcaoDispositivo createAcaoDispositivo();

	/**
	 * Returns a new object of class '<em>Leitura Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leitura Sensor</em>'.
	 * @generated
	 */
	LeituraSensor createLeituraSensor();

	/**
	 * Returns a new object of class '<em>Cenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cenario</em>'.
	 * @generated
	 */
	Cenario createCenario();

	/**
	 * Returns a new object of class '<em>Regra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regra</em>'.
	 * @generated
	 */
	Regra createRegra();

	/**
	 * Returns a new object of class '<em>Condicao</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condicao</em>'.
	 * @generated
	 */
	Condicao createCondicao();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
