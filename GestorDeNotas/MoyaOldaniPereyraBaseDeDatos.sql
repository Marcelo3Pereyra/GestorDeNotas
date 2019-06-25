-- MySQL dump 10.13  Distrib 5.7.26, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: proyectoMetodologia
-- ------------------------------------------------------
-- Server version	5.7.26-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Alumno`
--

DROP TABLE IF EXISTS `Alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Alumno` (
  `dni_alu` bigint(10) unsigned NOT NULL,
  `nom_alu` varchar(30) NOT NULL,
  `ape_alu` varchar(50) NOT NULL,
  `domic_alu` varchar(100) DEFAULT NULL,
  `tel_alu` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`dni_alu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Alumno`
--

LOCK TABLES `Alumno` WRITE;
/*!40000 ALTER TABLE `Alumno` DISABLE KEYS */;
INSERT INTO `Alumno` VALUES (34610658,'Marcelo','Pereyra','Palmira, Mendoza','2616267745'),(36618841,'Agustin','Moya','San José, Mendoza','2613630397'),(39021901,'Renzo','Oldani','Villa Nueva, Mendoza','2616324756');
/*!40000 ALTER TABLE `Alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Materia`
--

DROP TABLE IF EXISTS `Materia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Materia` (
  `cod_mat` int(5) NOT NULL AUTO_INCREMENT,
  `descr_mat` varchar(100) NOT NULL,
  `cant_hor_mat` int(2) DEFAULT NULL,
  `dni_prof_mat` bigint(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`cod_mat`),
  KEY `fk_Materia_Proefsor_idx` (`dni_prof_mat`),
  CONSTRAINT `fk_Materia_Proefsor` FOREIGN KEY (`dni_prof_mat`) REFERENCES `Profesor` (`dni_prof`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Materia`
--

LOCK TABLES `Materia` WRITE;
/*!40000 ALTER TABLE `Materia` DISABLE KEYS */;
INSERT INTO `Materia` VALUES (100,'Estadistica',20,33888666),(101,'Programacion 2',30,30555777),(102,'Metodologia',10,25678900);
/*!40000 ALTER TABLE `Materia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Nota`
--

DROP TABLE IF EXISTS `Nota`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Nota` (
  `dni_alu_not` bigint(10) unsigned NOT NULL,
  `cod_mat_not` int(5) NOT NULL,
  `notas_not` int(2) DEFAULT NULL,
  PRIMARY KEY (`dni_alu_not`,`cod_mat_not`),
  KEY `fk_Nota_Materia_idx` (`cod_mat_not`),
  CONSTRAINT `fk_Nota` FOREIGN KEY (`dni_alu_not`) REFERENCES `Alumno` (`dni_alu`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Nota_Materia` FOREIGN KEY (`cod_mat_not`) REFERENCES `Materia` (`cod_mat`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Nota`
--

LOCK TABLES `Nota` WRITE;
/*!40000 ALTER TABLE `Nota` DISABLE KEYS */;
INSERT INTO `Nota` VALUES (34610658,102,7),(36618841,101,5),(39021901,101,7);
/*!40000 ALTER TABLE `Nota` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Profesor`
--

DROP TABLE IF EXISTS `Profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Profesor` (
  `dni_prof` bigint(10) unsigned NOT NULL,
  `nom_prof` varchar(30) NOT NULL,
  `ape_prof` varchar(50) NOT NULL,
  `domic_prof` varchar(100) DEFAULT NULL,
  `tel_prof` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`dni_prof`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Profesor`
--

LOCK TABLES `Profesor` WRITE;
/*!40000 ALTER TABLE `Profesor` DISABLE KEYS */;
INSERT INTO `Profesor` VALUES (25678900,'Carlos','Rodriguez','Mendoza',''),(30555777,'Martin','Vargas','Mendoza',''),(33888666,'Fernanda','Esposito','Mendoza','');
/*!40000 ALTER TABLE `Profesor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-18 18:21:49
