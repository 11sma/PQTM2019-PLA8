CREATE TABLE `contacto` (
	`idcontacto` int(11) NOT NULL AUTO_INCREMENT,
	`nombre` varchar(45) DEFAULT NULL,
	`email` varchar(45) DEFAULT NULL,
	`telefono` varchar(10) DEFAULT NULL,
	PRIMARY KEY (`idcontacto`)
) ENGINE=InnoDB;
