CREATE TABLE `exportaciones` (
  `ID_Exportacion` int NOT NULL AUTO_INCREMENT,
  `ID_empleado_emisor` int NOT NULL,
  `ID_funcionario_receptor` int NOT NULL,
  `cantidad` int DEFAULT NULL,
  `Presentacion` varchar(50) DEFAULT NULL,
  `Tipo_envio` varchar(50) DEFAULT NULL,
  `Ciudad_origen` varchar(100) DEFAULT NULL,
  `Tipo_pago` varchar(50) DEFAULT NULL,
  `Fecha_envio` date DEFAULT NULL,
  `Fecha_estimada_entrega` date DEFAULT NULL,
  PRIMARY KEY (`ID_Exportacion`),
  KEY `ID_funcionario_receptor` (`ID_funcionario_receptor`),
  KEY `ID_empleado_emisor` (`ID_empleado_emisor`),
  CONSTRAINT `exportaciones_ibfk_1` FOREIGN KEY (`ID_funcionario_receptor`) REFERENCES `empleados` (`ID_Empleado`),
  CONSTRAINT `exportaciones_ibfk_2` FOREIGN KEY (`ID_empleado_emisor`) REFERENCES `empleados` (`ID_Empleado`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci