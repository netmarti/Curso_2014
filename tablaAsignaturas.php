$sql = "CREATE TABLE `stucom`.`asignaturas` (`idasig` INT(2) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT \'id autoincremental\', `asignatura` VARCHAR(30) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL COMMENT \'nombre de la asignatura\', UNIQUE (`asignatura`)) ENGINE = MyISAM CHARACTER SET utf8 COLLATE utf8_spanish_ci COMMENT = \'tabla asignaturas de la bbdd stucom\';";
