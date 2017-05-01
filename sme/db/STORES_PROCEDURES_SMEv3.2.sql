use BD_SGMEv3;

-- -------------------------------------------------------------
-- TABLA:					ALUMNOS , USUARIO_ALUMNO
-- STORE PROCEDURE:			SP_ALUMNOS_SELECT_LOGIN(?,?)
-- DESCRIPCIÓN:				Buscar alumno por usuario y pasword
-- FECHA DE CREACIÓN:		2017-04-27		
-- CREADO POR:				Palomino Rojas J. Abel
-- FECHA DE MODIFICACIÓN:	
-- MODIFICADO POR:			
-- --------------------------------------------------------------

-- DROP PROCEDURE SP_ALUMNOS_SELECT_LOGIN;

DELIMITER //
CREATE PROCEDURE SP_ALUMNOS_SELECT_LOGIN(IN p_userAlumno VARCHAR(30), IN p_passAlumno VARCHAR(30))
 BEGIN
	SELECT 
		A.idAlumno, A.apPaternoAlumno, A.apMaternoAlumno, A.nombresAlumno,
        A.dniAlumno, A.fechaNacAlumno, A.direccionAlumno, A.nomCompleto, A.estadoRegistro 
	FROM ALUMNOS A INNER JOIN USUARIO_ALUMNO U ON A.idAlumno=U.idAlumno
	WHERE U.userAlumno=p_userAlumno AND U.passAlumno=p_passAlumno;
END //
DELIMITER ;

-- CALL SP_ALUMNOS_SELECT_LOGIN('apalomino@gmail.com','ap123');




-- -------------------------------------------------------------
-- TABLA:					ALUMNOS
-- STORE PROCEDURE:			SP_ALUMNOS_SELECT_ALL()
-- DESCRIPCIÓN:				Listado completo de alumnos
-- FECHA DE CREACIÓN:		2017-04-27		
-- CREADO POR:				Palomino Rojas J. Abel
-- FECHA DE MODIFICACIÓN:	
-- MODIFICADO POR:			
-- --------------------------------------------------------------

-- DROP PROCEDURE SP_ALUMNOS_SELECT_ALL;

DELIMITER //
CREATE PROCEDURE SP_ALUMNOS_SELECT_ALL()
 BEGIN
	SELECT 
		A.idAlumno, A.apPaternoAlumno, A.apMaternoAlumno, A.nombresAlumno,
        A.dniAlumno, A.fechaNacAlumno, A.direccionAlumno, A.nomCompleto, A.estadoRegistro 
	FROM ALUMNOS A;
END //
DELIMITER ;

-- CALL SP_ALUMNOS_SELECT_ALL();



-- -------------------------------------------------------------
-- TABLA:					ALUMNOS
-- STORE PROCEDURE:			SP_ALUMNOS_SELECT_BY_ID()
-- DESCRIPCIÓN:				Obtiene un alumno por Id
-- FECHA DE CREACIÓN:		2017-04-27		
-- CREADO POR:				Palomino Rojas J. Abel
-- FECHA DE MODIFICACIÓN:	
-- MODIFICADO POR:			
-- --------------------------------------------------------------

-- DROP PROCEDURE SP_ALUMNOS_SELECT_BY_ID;

DELIMITER //
CREATE PROCEDURE SP_ALUMNOS_SELECT_BY_ID(IN p_idAlumno INT)
 BEGIN
	SELECT 
		A.idAlumno, A.apPaternoAlumno, A.apMaternoAlumno, A.nombresAlumno,
        A.dniAlumno, A.fechaNacAlumno, A.direccionAlumno, A.nomCompleto, A.estadoRegistro 
	FROM ALUMNOS A WHERE A.idAlumno=p_idAlumno;
END //
DELIMITER ;

-- CALL SP_ALUMNOS_SELECT_BY_ID(1);



-- -------------------------------------------------------------
-- TABLA:					ALUMNOS 
-- STORE PROCEDURE:			SP_ALUMNOS_INSERT(?,?,?,?,?,?)
-- DESCRIPCIÓN:				Insertar datos del alumno
-- FECHA DE CREACIÓN:		2017-04-27		
-- CREADO POR:				Palomino Rojas J. Abel
-- FECHA DE MODIFICACIÓN:	
-- MODIFICADO POR:			
-- --------------------------------------------------------------

-- DROP PROCEDURE SP_ALUMNOS_INSERT;

DELIMITER //
CREATE PROCEDURE SP_ALUMNOS_INSERT
(
	IN p_apPaternoAlumno VARCHAR(60),
	IN p_apMaternoAlumno VARCHAR(60),
	IN p_nombresAlumno VARCHAR(60),
	IN p_dniAlumno CHAR(8),
    IN p_fechaNacAlumno DATE,
    IN p_direccionAlumno VARCHAR(150)
)
 BEGIN
	INSERT INTO ALUMNOS 
    (apPaternoAlumno, apMaternoAlumno, nombresAlumno, dniAlumno, fechaNacAlumno, direccionAlumno, nomCompleto) 
    VALUES 
    (p_apPaternoAlumno, p_apMaternoAlumno, p_nombresAlumno, p_dniAlumno, p_fechaNacAlumno,
     p_direccionAlumno, concat(p_apPaternoAlumno,' ',p_apMaternoAlumno,' ', p_nombresAlumno)) ;
END //
DELIMITER ;

-- CALL SP_ALUMNOS_INSERT('FLORES','GARCIA','CRISTINA','4622522','1990-06-11','Av AVANCAY 954');




-- -------------------------------------------------------------
-- TABLA:					ALUMNOS 
-- STORE PROCEDURE:			SP_ALUMNOS_UPDATE(?,?,?,?,?,?)
-- DESCRIPCIÓN:				Actualiza datos del alumno
-- FECHA DE CREACIÓN:		2017-04-27		
-- CREADO POR:				Palomino Rojas J. Abel
-- FECHA DE MODIFICACIÓN:	
-- MODIFICADO POR:			
-- --------------------------------------------------------------

-- DROP PROCEDURE SP_ALUMNOS_UPDATE;

DELIMITER //
CREATE PROCEDURE SP_ALUMNOS_UPDATE
(
	IN p_apPaternoAlumno VARCHAR(60),
	IN p_apMaternoAlumno VARCHAR(60),
	IN p_nombresAlumno VARCHAR(60),
	IN p_dniAlumno CHAR(8),
    IN p_fechaNacAlumno DATE,
    IN p_direccionAlumno VARCHAR(150),
    IN p_idAlumno INT
)
 BEGIN
	UPDATE ALUMNOS SET
    apPaternoAlumno = p_apPaternoAlumno, apMaternoAlumno = p_apMaternoAlumno,
    nombresAlumno = p_nombresAlumno, dniAlumno = p_dniAlumno, fechaNacAlumno = p_fechaNacAlumno, 
    direccionAlumno = p_direccionAlumno, nomCompleto = concat(p_apPaternoAlumno,' ',p_apMaternoAlumno,' ', p_nombresAlumno)
    WHERE idAlumno = p_idAlumno;
END //
DELIMITER ;

-- CALL SP_ALUMNOS_UPDATE('FLORES','GARCIA','CRISTINA','4622522','1990-06-11','Av AVANCAY 952',4);


