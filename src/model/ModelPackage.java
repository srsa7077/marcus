/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.CasaImpl <em>Casa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CasaImpl
	 * @see model.impl.ModelPackageImpl#getCasa()
	 * @generated
	 */
	int CASA = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASA__NOME = 0;

	/**
	 * The feature id for the '<em><b>Endereco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASA__ENDERECO = 1;

	/**
	 * The feature id for the '<em><b>Comodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASA__COMODOS = 2;

	/**
	 * The number of structural features of the '<em>Casa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Casa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.ComodoImpl <em>Comodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ComodoImpl
	 * @see model.impl.ModelPackageImpl#getComodo()
	 * @generated
	 */
	int COMODO = 1;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMODO__NOME = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMODO__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Dispositivos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMODO__DISPOSITIVOS = 2;

	/**
	 * The feature id for the '<em><b>Sensores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMODO__SENSORES = 3;

	/**
	 * The number of structural features of the '<em>Comodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMODO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Comodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMODO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.DispositivoImpl <em>Dispositivo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DispositivoImpl
	 * @see model.impl.ModelPackageImpl#getDispositivo()
	 * @generated
	 */
	int DISPOSITIVO = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPOSITIVO__ID = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPOSITIVO__NOME = 1;

	/**
	 * The feature id for the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPOSITIVO__MODELO = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPOSITIVO__STATUS = 3;

	/**
	 * The number of structural features of the '<em>Dispositivo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPOSITIVO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dispositivo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPOSITIVO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SensorImpl
	 * @see model.impl.ModelPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = DISPOSITIVO__ID;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NOME = DISPOSITIVO__NOME;

	/**
	 * The feature id for the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MODELO = DISPOSITIVO__MODELO;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__STATUS = DISPOSITIVO__STATUS;

	/**
	 * The feature id for the '<em><b>Tipo Sensor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TIPO_SENSOR = DISPOSITIVO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valor Atual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__VALOR_ATUAL = DISPOSITIVO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__UNIDADE = DISPOSITIVO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = DISPOSITIVO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = DISPOSITIVO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.AtuadorImpl <em>Atuador</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AtuadorImpl
	 * @see model.impl.ModelPackageImpl#getAtuador()
	 * @generated
	 */
	int ATUADOR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATUADOR__ID = DISPOSITIVO__ID;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATUADOR__NOME = DISPOSITIVO__NOME;

	/**
	 * The feature id for the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATUADOR__MODELO = DISPOSITIVO__MODELO;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATUADOR__STATUS = DISPOSITIVO__STATUS;

	/**
	 * The feature id for the '<em><b>Tipo Atuador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATUADOR__TIPO_ATUADOR = DISPOSITIVO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Estado Atual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATUADOR__ESTADO_ATUAL = DISPOSITIVO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Acaodispositivo</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATUADOR__ACAODISPOSITIVO = DISPOSITIVO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Atuador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATUADOR_FEATURE_COUNT = DISPOSITIVO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Atuador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATUADOR_OPERATION_COUNT = DISPOSITIVO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.AcaoDispositivoImpl <em>Acao Dispositivo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AcaoDispositivoImpl
	 * @see model.impl.ModelPackageImpl#getAcaoDispositivo()
	 * @generated
	 */
	int ACAO_DISPOSITIVO = 5;

	/**
	 * The feature id for the '<em><b>Acoes Suportadas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAO_DISPOSITIVO__ACOES_SUPORTADAS = 0;

	/**
	 * The feature id for the '<em><b>Acoes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAO_DISPOSITIVO__ACOES = 1;

	/**
	 * The feature id for the '<em><b>Comando</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAO_DISPOSITIVO__COMANDO = 2;

	/**
	 * The feature id for the '<em><b>Parametro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAO_DISPOSITIVO__PARAMETRO = 3;

	/**
	 * The number of structural features of the '<em>Acao Dispositivo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAO_DISPOSITIVO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Acao Dispositivo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAO_DISPOSITIVO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.LeituraSensorImpl <em>Leitura Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.LeituraSensorImpl
	 * @see model.impl.ModelPackageImpl#getLeituraSensor()
	 * @generated
	 */
	int LEITURA_SENSOR = 6;

	/**
	 * The feature id for the '<em><b>Leituras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEITURA_SENSOR__LEITURAS = 0;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEITURA_SENSOR__VALOR = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEITURA_SENSOR__TIMESTAMP = 2;

	/**
	 * The number of structural features of the '<em>Leitura Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEITURA_SENSOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Leitura Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEITURA_SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.CenarioImpl <em>Cenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CenarioImpl
	 * @see model.impl.ModelPackageImpl#getCenario()
	 * @generated
	 */
	int CENARIO = 7;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENARIO__NOME = 0;

	/**
	 * The feature id for the '<em><b>Descricao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENARIO__DESCRICAO = 1;

	/**
	 * The number of structural features of the '<em>Cenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENARIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.RegraImpl <em>Regra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RegraImpl
	 * @see model.impl.ModelPackageImpl#getRegra()
	 * @generated
	 */
	int REGRA = 8;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRA__NOME = 0;

	/**
	 * The feature id for the '<em><b>Ativada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRA__ATIVADA = 1;

	/**
	 * The feature id for the '<em><b>Condicoes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRA__CONDICOES = 2;

	/**
	 * The feature id for the '<em><b>Acaodispositivo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRA__ACAODISPOSITIVO = 3;

	/**
	 * The number of structural features of the '<em>Regra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Regra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.CondicaoImpl <em>Condicao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CondicaoImpl
	 * @see model.impl.ModelPackageImpl#getCondicao()
	 * @generated
	 */
	int CONDICAO = 9;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICAO__OPERADOR = 0;

	/**
	 * The feature id for the '<em><b>Valor Comparacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICAO__VALOR_COMPARACAO = 1;

	/**
	 * The feature id for the '<em><b>Sensor Alvo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICAO__SENSOR_ALVO = 2;

	/**
	 * The number of structural features of the '<em>Condicao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICAO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Condicao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICAO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link model.Casa <em>Casa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Casa</em>'.
	 * @see model.Casa
	 * @generated
	 */
	EClass getCasa();

	/**
	 * Returns the meta object for the attribute '{@link model.Casa#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see model.Casa#getNome()
	 * @see #getCasa()
	 * @generated
	 */
	EAttribute getCasa_Nome();

	/**
	 * Returns the meta object for the attribute '{@link model.Casa#getEndereco <em>Endereco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endereco</em>'.
	 * @see model.Casa#getEndereco()
	 * @see #getCasa()
	 * @generated
	 */
	EAttribute getCasa_Endereco();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Casa#getComodos <em>Comodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comodos</em>'.
	 * @see model.Casa#getComodos()
	 * @see #getCasa()
	 * @generated
	 */
	EReference getCasa_Comodos();

	/**
	 * Returns the meta object for class '{@link model.Comodo <em>Comodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comodo</em>'.
	 * @see model.Comodo
	 * @generated
	 */
	EClass getComodo();

	/**
	 * Returns the meta object for the attribute '{@link model.Comodo#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see model.Comodo#getNome()
	 * @see #getComodo()
	 * @generated
	 */
	EAttribute getComodo_Nome();

	/**
	 * Returns the meta object for the attribute '{@link model.Comodo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see model.Comodo#getTipo()
	 * @see #getComodo()
	 * @generated
	 */
	EAttribute getComodo_Tipo();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Comodo#getDispositivos <em>Dispositivos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dispositivos</em>'.
	 * @see model.Comodo#getDispositivos()
	 * @see #getComodo()
	 * @generated
	 */
	EReference getComodo_Dispositivos();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Comodo#getSensores <em>Sensores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensores</em>'.
	 * @see model.Comodo#getSensores()
	 * @see #getComodo()
	 * @generated
	 */
	EReference getComodo_Sensores();

	/**
	 * Returns the meta object for class '{@link model.Dispositivo <em>Dispositivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispositivo</em>'.
	 * @see model.Dispositivo
	 * @generated
	 */
	EClass getDispositivo();

	/**
	 * Returns the meta object for the attribute '{@link model.Dispositivo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.Dispositivo#getId()
	 * @see #getDispositivo()
	 * @generated
	 */
	EAttribute getDispositivo_Id();

	/**
	 * Returns the meta object for the attribute '{@link model.Dispositivo#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see model.Dispositivo#getNome()
	 * @see #getDispositivo()
	 * @generated
	 */
	EAttribute getDispositivo_Nome();

	/**
	 * Returns the meta object for the attribute '{@link model.Dispositivo#getModelo <em>Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modelo</em>'.
	 * @see model.Dispositivo#getModelo()
	 * @see #getDispositivo()
	 * @generated
	 */
	EAttribute getDispositivo_Modelo();

	/**
	 * Returns the meta object for the attribute '{@link model.Dispositivo#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see model.Dispositivo#isStatus()
	 * @see #getDispositivo()
	 * @generated
	 */
	EAttribute getDispositivo_Status();

	/**
	 * Returns the meta object for class '{@link model.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see model.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link model.Sensor#getTipoSensor <em>Tipo Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Sensor</em>'.
	 * @see model.Sensor#getTipoSensor()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_TipoSensor();

	/**
	 * Returns the meta object for the attribute '{@link model.Sensor#getValorAtual <em>Valor Atual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Atual</em>'.
	 * @see model.Sensor#getValorAtual()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_ValorAtual();

	/**
	 * Returns the meta object for the attribute '{@link model.Sensor#getUnidade <em>Unidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unidade</em>'.
	 * @see model.Sensor#getUnidade()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Unidade();

	/**
	 * Returns the meta object for class '{@link model.Atuador <em>Atuador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atuador</em>'.
	 * @see model.Atuador
	 * @generated
	 */
	EClass getAtuador();

	/**
	 * Returns the meta object for the attribute '{@link model.Atuador#getTipoAtuador <em>Tipo Atuador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Atuador</em>'.
	 * @see model.Atuador#getTipoAtuador()
	 * @see #getAtuador()
	 * @generated
	 */
	EAttribute getAtuador_TipoAtuador();

	/**
	 * Returns the meta object for the attribute '{@link model.Atuador#getEstadoAtual <em>Estado Atual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado Atual</em>'.
	 * @see model.Atuador#getEstadoAtual()
	 * @see #getAtuador()
	 * @generated
	 */
	EAttribute getAtuador_EstadoAtual();

	/**
	 * Returns the meta object for the reference list '{@link model.Atuador#getAcaodispositivo <em>Acaodispositivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Acaodispositivo</em>'.
	 * @see model.Atuador#getAcaodispositivo()
	 * @see #getAtuador()
	 * @generated
	 */
	EReference getAtuador_Acaodispositivo();

	/**
	 * Returns the meta object for class '{@link model.AcaoDispositivo <em>Acao Dispositivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acao Dispositivo</em>'.
	 * @see model.AcaoDispositivo
	 * @generated
	 */
	EClass getAcaoDispositivo();

	/**
	 * Returns the meta object for the reference '{@link model.AcaoDispositivo#getAcoesSuportadas <em>Acoes Suportadas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acoes Suportadas</em>'.
	 * @see model.AcaoDispositivo#getAcoesSuportadas()
	 * @see #getAcaoDispositivo()
	 * @generated
	 */
	EReference getAcaoDispositivo_AcoesSuportadas();

	/**
	 * Returns the meta object for the reference list '{@link model.AcaoDispositivo#getAcoes <em>Acoes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Acoes</em>'.
	 * @see model.AcaoDispositivo#getAcoes()
	 * @see #getAcaoDispositivo()
	 * @generated
	 */
	EReference getAcaoDispositivo_Acoes();

	/**
	 * Returns the meta object for the attribute '{@link model.AcaoDispositivo#getComando <em>Comando</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comando</em>'.
	 * @see model.AcaoDispositivo#getComando()
	 * @see #getAcaoDispositivo()
	 * @generated
	 */
	EAttribute getAcaoDispositivo_Comando();

	/**
	 * Returns the meta object for the attribute '{@link model.AcaoDispositivo#getParametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parametro</em>'.
	 * @see model.AcaoDispositivo#getParametro()
	 * @see #getAcaoDispositivo()
	 * @generated
	 */
	EAttribute getAcaoDispositivo_Parametro();

	/**
	 * Returns the meta object for class '{@link model.LeituraSensor <em>Leitura Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leitura Sensor</em>'.
	 * @see model.LeituraSensor
	 * @generated
	 */
	EClass getLeituraSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link model.LeituraSensor#getLeituras <em>Leituras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Leituras</em>'.
	 * @see model.LeituraSensor#getLeituras()
	 * @see #getLeituraSensor()
	 * @generated
	 */
	EReference getLeituraSensor_Leituras();

	/**
	 * Returns the meta object for the attribute '{@link model.LeituraSensor#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see model.LeituraSensor#getValor()
	 * @see #getLeituraSensor()
	 * @generated
	 */
	EAttribute getLeituraSensor_Valor();

	/**
	 * Returns the meta object for the attribute '{@link model.LeituraSensor#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see model.LeituraSensor#getTimestamp()
	 * @see #getLeituraSensor()
	 * @generated
	 */
	EAttribute getLeituraSensor_Timestamp();

	/**
	 * Returns the meta object for class '{@link model.Cenario <em>Cenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cenario</em>'.
	 * @see model.Cenario
	 * @generated
	 */
	EClass getCenario();

	/**
	 * Returns the meta object for the attribute '{@link model.Cenario#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see model.Cenario#getNome()
	 * @see #getCenario()
	 * @generated
	 */
	EAttribute getCenario_Nome();

	/**
	 * Returns the meta object for the attribute '{@link model.Cenario#getDescricao <em>Descricao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descricao</em>'.
	 * @see model.Cenario#getDescricao()
	 * @see #getCenario()
	 * @generated
	 */
	EAttribute getCenario_Descricao();

	/**
	 * Returns the meta object for class '{@link model.Regra <em>Regra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regra</em>'.
	 * @see model.Regra
	 * @generated
	 */
	EClass getRegra();

	/**
	 * Returns the meta object for the attribute '{@link model.Regra#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see model.Regra#getNome()
	 * @see #getRegra()
	 * @generated
	 */
	EAttribute getRegra_Nome();

	/**
	 * Returns the meta object for the attribute '{@link model.Regra#isAtivada <em>Ativada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ativada</em>'.
	 * @see model.Regra#isAtivada()
	 * @see #getRegra()
	 * @generated
	 */
	EAttribute getRegra_Ativada();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Regra#getCondicoes <em>Condicoes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condicoes</em>'.
	 * @see model.Regra#getCondicoes()
	 * @see #getRegra()
	 * @generated
	 */
	EReference getRegra_Condicoes();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Regra#getAcaodispositivo <em>Acaodispositivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acaodispositivo</em>'.
	 * @see model.Regra#getAcaodispositivo()
	 * @see #getRegra()
	 * @generated
	 */
	EReference getRegra_Acaodispositivo();

	/**
	 * Returns the meta object for class '{@link model.Condicao <em>Condicao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condicao</em>'.
	 * @see model.Condicao
	 * @generated
	 */
	EClass getCondicao();

	/**
	 * Returns the meta object for the attribute '{@link model.Condicao#getOperador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operador</em>'.
	 * @see model.Condicao#getOperador()
	 * @see #getCondicao()
	 * @generated
	 */
	EAttribute getCondicao_Operador();

	/**
	 * Returns the meta object for the attribute '{@link model.Condicao#getValorComparacao <em>Valor Comparacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Comparacao</em>'.
	 * @see model.Condicao#getValorComparacao()
	 * @see #getCondicao()
	 * @generated
	 */
	EAttribute getCondicao_ValorComparacao();

	/**
	 * Returns the meta object for the reference '{@link model.Condicao#getSensorAlvo <em>Sensor Alvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor Alvo</em>'.
	 * @see model.Condicao#getSensorAlvo()
	 * @see #getCondicao()
	 * @generated
	 */
	EReference getCondicao_SensorAlvo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.CasaImpl <em>Casa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CasaImpl
		 * @see model.impl.ModelPackageImpl#getCasa()
		 * @generated
		 */
		EClass CASA = eINSTANCE.getCasa();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASA__NOME = eINSTANCE.getCasa_Nome();

		/**
		 * The meta object literal for the '<em><b>Endereco</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASA__ENDERECO = eINSTANCE.getCasa_Endereco();

		/**
		 * The meta object literal for the '<em><b>Comodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASA__COMODOS = eINSTANCE.getCasa_Comodos();

		/**
		 * The meta object literal for the '{@link model.impl.ComodoImpl <em>Comodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ComodoImpl
		 * @see model.impl.ModelPackageImpl#getComodo()
		 * @generated
		 */
		EClass COMODO = eINSTANCE.getComodo();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMODO__NOME = eINSTANCE.getComodo_Nome();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMODO__TIPO = eINSTANCE.getComodo_Tipo();

		/**
		 * The meta object literal for the '<em><b>Dispositivos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMODO__DISPOSITIVOS = eINSTANCE.getComodo_Dispositivos();

		/**
		 * The meta object literal for the '<em><b>Sensores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMODO__SENSORES = eINSTANCE.getComodo_Sensores();

		/**
		 * The meta object literal for the '{@link model.impl.DispositivoImpl <em>Dispositivo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DispositivoImpl
		 * @see model.impl.ModelPackageImpl#getDispositivo()
		 * @generated
		 */
		EClass DISPOSITIVO = eINSTANCE.getDispositivo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPOSITIVO__ID = eINSTANCE.getDispositivo_Id();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPOSITIVO__NOME = eINSTANCE.getDispositivo_Nome();

		/**
		 * The meta object literal for the '<em><b>Modelo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPOSITIVO__MODELO = eINSTANCE.getDispositivo_Modelo();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPOSITIVO__STATUS = eINSTANCE.getDispositivo_Status();

		/**
		 * The meta object literal for the '{@link model.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.SensorImpl
		 * @see model.impl.ModelPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Tipo Sensor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TIPO_SENSOR = eINSTANCE.getSensor_TipoSensor();

		/**
		 * The meta object literal for the '<em><b>Valor Atual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__VALOR_ATUAL = eINSTANCE.getSensor_ValorAtual();

		/**
		 * The meta object literal for the '<em><b>Unidade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__UNIDADE = eINSTANCE.getSensor_Unidade();

		/**
		 * The meta object literal for the '{@link model.impl.AtuadorImpl <em>Atuador</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AtuadorImpl
		 * @see model.impl.ModelPackageImpl#getAtuador()
		 * @generated
		 */
		EClass ATUADOR = eINSTANCE.getAtuador();

		/**
		 * The meta object literal for the '<em><b>Tipo Atuador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATUADOR__TIPO_ATUADOR = eINSTANCE.getAtuador_TipoAtuador();

		/**
		 * The meta object literal for the '<em><b>Estado Atual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATUADOR__ESTADO_ATUAL = eINSTANCE.getAtuador_EstadoAtual();

		/**
		 * The meta object literal for the '<em><b>Acaodispositivo</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATUADOR__ACAODISPOSITIVO = eINSTANCE.getAtuador_Acaodispositivo();

		/**
		 * The meta object literal for the '{@link model.impl.AcaoDispositivoImpl <em>Acao Dispositivo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AcaoDispositivoImpl
		 * @see model.impl.ModelPackageImpl#getAcaoDispositivo()
		 * @generated
		 */
		EClass ACAO_DISPOSITIVO = eINSTANCE.getAcaoDispositivo();

		/**
		 * The meta object literal for the '<em><b>Acoes Suportadas</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACAO_DISPOSITIVO__ACOES_SUPORTADAS = eINSTANCE.getAcaoDispositivo_AcoesSuportadas();

		/**
		 * The meta object literal for the '<em><b>Acoes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACAO_DISPOSITIVO__ACOES = eINSTANCE.getAcaoDispositivo_Acoes();

		/**
		 * The meta object literal for the '<em><b>Comando</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACAO_DISPOSITIVO__COMANDO = eINSTANCE.getAcaoDispositivo_Comando();

		/**
		 * The meta object literal for the '<em><b>Parametro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACAO_DISPOSITIVO__PARAMETRO = eINSTANCE.getAcaoDispositivo_Parametro();

		/**
		 * The meta object literal for the '{@link model.impl.LeituraSensorImpl <em>Leitura Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.LeituraSensorImpl
		 * @see model.impl.ModelPackageImpl#getLeituraSensor()
		 * @generated
		 */
		EClass LEITURA_SENSOR = eINSTANCE.getLeituraSensor();

		/**
		 * The meta object literal for the '<em><b>Leituras</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEITURA_SENSOR__LEITURAS = eINSTANCE.getLeituraSensor_Leituras();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEITURA_SENSOR__VALOR = eINSTANCE.getLeituraSensor_Valor();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEITURA_SENSOR__TIMESTAMP = eINSTANCE.getLeituraSensor_Timestamp();

		/**
		 * The meta object literal for the '{@link model.impl.CenarioImpl <em>Cenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CenarioImpl
		 * @see model.impl.ModelPackageImpl#getCenario()
		 * @generated
		 */
		EClass CENARIO = eINSTANCE.getCenario();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENARIO__NOME = eINSTANCE.getCenario_Nome();

		/**
		 * The meta object literal for the '<em><b>Descricao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENARIO__DESCRICAO = eINSTANCE.getCenario_Descricao();

		/**
		 * The meta object literal for the '{@link model.impl.RegraImpl <em>Regra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RegraImpl
		 * @see model.impl.ModelPackageImpl#getRegra()
		 * @generated
		 */
		EClass REGRA = eINSTANCE.getRegra();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGRA__NOME = eINSTANCE.getRegra_Nome();

		/**
		 * The meta object literal for the '<em><b>Ativada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGRA__ATIVADA = eINSTANCE.getRegra_Ativada();

		/**
		 * The meta object literal for the '<em><b>Condicoes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGRA__CONDICOES = eINSTANCE.getRegra_Condicoes();

		/**
		 * The meta object literal for the '<em><b>Acaodispositivo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGRA__ACAODISPOSITIVO = eINSTANCE.getRegra_Acaodispositivo();

		/**
		 * The meta object literal for the '{@link model.impl.CondicaoImpl <em>Condicao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CondicaoImpl
		 * @see model.impl.ModelPackageImpl#getCondicao()
		 * @generated
		 */
		EClass CONDICAO = eINSTANCE.getCondicao();

		/**
		 * The meta object literal for the '<em><b>Operador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDICAO__OPERADOR = eINSTANCE.getCondicao_Operador();

		/**
		 * The meta object literal for the '<em><b>Valor Comparacao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDICAO__VALOR_COMPARACAO = eINSTANCE.getCondicao_ValorComparacao();

		/**
		 * The meta object literal for the '<em><b>Sensor Alvo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDICAO__SENSOR_ALVO = eINSTANCE.getCondicao_SensorAlvo();

	}

} //ModelPackage
