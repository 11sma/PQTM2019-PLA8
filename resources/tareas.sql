CREATE TABLE `tarea` (
	`idtarea` int(11) NOT NULL AUTO_INCREMENT,
	`nombre` varchar(45) DEFAULT NULL,
	`prioridad` varchar(45) DEFAULT NULL,
	`vencimiento` date DEFAULT NULL,
	PRIMARY KEY (`idtarea`)
) ENGINE=InnoDB;