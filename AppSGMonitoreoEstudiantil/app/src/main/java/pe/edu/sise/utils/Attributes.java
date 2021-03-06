package pe.edu.sise.utils;

/**
 * Created by ASUS on 12/03/2017.
 */

//Attributes
public class Attributes {

    //Las Costantes Siempre en Mayusculas
    public static final int SPLASHTIME = 3000;
    public static final String USUARIO_ADMIN = "Admin";
    public static final String PASS_ADMIN = "Admin";


    //ATRIBUTOS DE USUARIO EN JSON
    public static final String USU_ID_USUARIO = "idusu";
    public static final String USU_NOMBRES = "nomusu";
    public static final String USU_APELLIDOS = "apeusu";
    public static final String USU_EMAIL = "emailusu";

    //ATRIBUTOS DE ALUMNO EN JSON
    public static final String ALUM_ID="idAlumno";
    public static final String ALUM_AP_PATERNO="apPaternoAlumno";
    public static final String ALUM_AP_MATERNO="apMaternoAlumno";
    public static final String ALUM_NOMBRES="nombresAlumno";
    public static final String ALUM_NOM_COMPLETO="nomCompleto";
    public static final String ALUM_DNI="dniAlumno";
    public static final String ALUM_FECHA_NAC="fechaNacAlumno";
    public static final String ALUM_DIRECCION="direccionAlumno";
    public static final String ALUM_ESTADO_REG="estadoRegistro";
    public static final String ALUM_USUARIO="userAlumno";
    public static final String ALUM_PASSWORD="passAlumno";
    public static final String ALUM_IS_LOGGED="isLogged";
    public static final String ALUM_TRIMESTRE="trimestre";
    public static final String ALUM_ANIO="anio";
    public static final String ALUM_GRADO="idGrado";
    public static final String ALUM_COD_SECCION="codSeccion";
    public static final String ALUM_CANT_ACTIVIDAD="CantAC";
    public static final String ALUM_PROMEDIO_TOTAL="totalPromedio";
    public static final String ALUM_FCM_TOKEN="fcmToken";
    public static final String ALUM_COD_GPO_ACADEMICO="codGrupoAcademico";

    //ATRIBUTOS DE APODERADO EN JSON
    public static final String APOD_ID="idApoderado";
    public static final String APOD_AP_PATERNO="apPaternoApoderado";
    public static final String APOD_AP_MATERNO="apMaternoApoderado";
    public static final String APOD_NOMBRES="nombresApoderado";
    public static final String APOD_NOM_COMPLETO="nomCompleto";
    public static final String APOD_DNI="dniApoderado";
    public static final String APOD_FECHA_NAC="fechaNacApoderado";
    public static final String APOD_DIRECCION="direccionApoderado";
    public static final String APOD_ESTADO_REG="estadoRegistro";
    public static final String APOD_USUARIO="userApoderado";
    public static final String APOD_PASSWORD="passApoderado";
    public static final String APOD_IS_LOGGED="isLogged";


    //ATRIBUTOS DE EMPLEADO EN JSON
    public static final String EMP_ID="idEmpleado";
    public static final String EMP_AP_PATERNO="apPaternoEmpleado";
    public static final String EMP_AP_MATERNO="apMaternoEmpleado";
    public static final String EMP_NOMBRES="nombresEmpleado";
    public static final String EMP_NOM_COMPLETO="nomCompleto";
    public static final String EMP_DNI="dniEmpleado";
    public static final String EMP_FECHA_NAC="fechaNacEmpleado";
    public static final String EMP_DIRECCION="direccionEmpleado";
    public static final String EMP_ESTADO_REG="estadoRegistro";
    public static final String EMP_ID_CARGO="idCargo";
    public static final String EMP_NOM_CARGO="nomCargo";
    public static final String EMP_USUARIO="userEmpleado";
    public static final String EMP_PASSWORD="passEmpleado";

    //ATRIBUTOS DE NOTAS EN JSON
    public static final String NOTA_ID="";
    public static final String NOTA_ID_CURSO="idCurso";
    public static final String NOTA_ID_ALUMNO="idAlumno";
    public static final String NOTA_PROMEDIO="promedio";
    public static final String NOTA_TIMESTRE="trimestre";

    //ATRIBUTOS DE CURSO EN JSON
    public static final String CURSO_ID="idCurso";
    public static final String CURSO_NOMBRE="nomCurso";
    public static final String CURSO_ABREV="abrevCurso";
    public static final String CURSO_ESTADO_REG="estadoRegistro";

    //ATRIBUTOS DE ALUMNO - LLAVES DE INTENT
    public static final String KEY_NOMBRE="Nombre";
    public static final String KEY_IDALUMNO="idAlumno";
    public static final String KEY_PROMEDIO="trimestre";

    //ATRIBUTOS DE ACTIVIDAD EN JSON
    public static final String ACT_ID="idActividad";
    public static final String ACT_ID_EMPLEADO="idEmpleado";
    public static final String ACT_ID_CURSO="idCurso";
    public static final String ACT_NOMB_CURSO="nomCurso";
    public static final String ACT_GPO_ACADEMICO="codGrupoAcademico";
    public static final String ACT_NOMBRE="nomActividad";
    public static final String ACT_DESCRIPCION="descrActividad";
    public static final String ACT_FECH_REALIZACION="fechaRealizacion";
    public static final String ACT_HORA_INICIO="horaInicio";
    public static final String ACT_HORA_FIN="horaFin";
    public static final String ACT_FREC_AVISO="frecuenciaAviso";
    public static final String ACT_FLAG_NOTIFICADO="flag_Notificado";
    public static final String ACT_NOM_ALUMNO="nombresAlumno";

    public static final String KEY_LIST_ALUMNO="listAlumno";

    //VARIABLE PARA LA  NOTIFICACION
    public static final String MSG_ID ="id";
    public static final String MSG_ACTIVIDAD ="actividad";
    public static final String MSG_FECHA_REALIZARSE ="fecha";
    public static final String MSG_TIPO_NOTIFICACION ="tipoNotificacion";

    public static final String TIPO_NOTIFICACION_ACTIVIDAD ="A";
    public static final String TIPO_NOTIFICACION_NOTA ="N";


    //ATRIBUTOS DE RESPONSE EN JSON
    public static final String RES_STATE = "state";
    public static final String RES_MSG = "msg";


}
