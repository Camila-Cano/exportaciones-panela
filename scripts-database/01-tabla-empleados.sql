CREATE TABLE `empleados` (
  `ID_Empleado` int NOT NULL AUTO_INCREMENT,
  `Nombres` varchar(100) DEFAULT NULL,
  `Apellidos` varchar(100) DEFAULT NULL,
  `Identificacion` varchar(100) DEFAULT NULL,
  `Telefono` varchar(20) DEFAULT NULL,
  `Departamento` varchar(50) DEFAULT NULL,
  `Correo_electronico` varchar(100) DEFAULT NULL,
  `Empresa` varchar(100) DEFAULT NULL,
  `rol` varchar(100) DEFAULT NULL,
  `login` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_Empleado`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci