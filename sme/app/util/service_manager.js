const METHOD_GET = "GET";
const METHOD_POST = "POST";
const METHOD_PUT = "PUT";
const METHOD_DELETE = "DELETE";

const DATA_TYPE_JSON = 'json';
const CONTEN_TYPE_JSON = "application/json; charset=utf-8";

const ACCION_REGISTRAR = "Registrar";
const ACCION_ACTUALIZAR = "Actualizar";

const URL_BASE = "http://10.66.10.192/sise/sme/api/";


const ALUMNO_URL_LISTAR = URL_BASE + "alumno/listar";
const ALUMNO_URL_BUSCAR = URL_BASE + "alumno/buscar/";
const ALUMNO_URL_REGISTAR = URL_BASE + "alumno/registrar";
const ALUMNO_URL_ACTUALIZAR = URL_BASE + "alumno/actualizar";
const ALUMNO_URL_ELIMINAR = URL_BASE + "alumno/eliminar/";
const ALUMNO_URL_LOGEO = URL_BASE + "alumno/logeo";

const ACTIVIDAD_URL_LISTAR = URL_BASE + "actividad/listar";
const ACTIVIDAD_URL_BUSCAR = URL_BASE + "actividad/buscar/";
const ACTIVIDAD_URL_ULTIMO_REGISTRO = URL_BASE + "actividad/ultimoregistro";
const ACTIVIDAD_URL_REGISTAR = URL_BASE + "actividad/registrar";
const ACTIVIDAD_URL_ACTUALIZAR = URL_BASE + "actividad/actualizar";
const ACTIVIDAD_URL_ELIMINAR = URL_BASE + "actividad/eliminar/";
const ACTIVIDAD_URL_BUSCAR_NOTIFICACION = URL_BASE + "actividad/notificacion/";
const ACTIVIDAD_URL_BUSCAR_GPO = URL_BASE + "actividad/gpoacademico/";

const CURSO_URL_LISTAR = URL_BASE + "curso/listar";

const EMPLEADO_URL_LISTAR = URL_BASE + "empleado/listar";



const GRUPOACADEMICO_URL_LISTAR = URL_BASE + "grupo/listar";

const NOTA_URL_PROMEDIOALUMNOTRIMESTRE = URL_BASE + "nota/promedioalumnotrimestre"
const NOTA_URL_LISTAR_ALUMNO = URL_BASE + "nota/listarAlumno";
const NOTA_URL_LISTAR_TIPONOTA = URL_BASE + "nota/listarTipoNota";
const NOTA_URL_LISTAR_ALUMNO_DNI = URL_BASE + "nota/listarAlumnoPorDni/"
const NOTA_URL_LISTAR_CURSO = URL_BASE + "nota/listarCurso";
const NOTA_URL_LISTAR_PERIODO = URL_BASE + "nota/listarPeriodo";
const NOTA_URL_REGISTRO = URL_BASE + "nota/registrar";
const NOTA_URL_LISTAR_NOTAS_ALUMNO_CURSO_PERIODO = URL_BASE + "nota/listarNotaAlumnoCursoPeriodo";
const NOTA_URL_ELIMINAR = URL_BASE + "nota/eliminar/";
const NOTA_URL_LISTAR_EMPLEADO = URL_BASE + "nota/listarEmpleados";
const NOTA_URL_ALUMNO_NOTA = URL_BASE + "nota/alumnocurso";
