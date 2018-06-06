-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: dbgamepayment
-- ------------------------------------------------------
-- Server version	5.7.22-log

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
-- Table structure for table `membership`
--

DROP TABLE IF EXISTS `membership`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `membership` (
  `kodeMembership` int(12) NOT NULL,
  `nama` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `noHP` int(12) NOT NULL,
  `kelamin` varchar(45) NOT NULL,
  `catatan` varchar(255) NOT NULL,
  PRIMARY KEY (`kodeMembership`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `membership`
--

LOCK TABLES `membership` WRITE;
/*!40000 ALTER TABLE `membership` DISABLE KEYS */;
/*!40000 ALTER TABLE `membership` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ms_admin`
--

DROP TABLE IF EXISTS `ms_admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ms_admin` (
  `id_user` varchar(12) NOT NULL,
  `password_admin` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ms_admin`
--

LOCK TABLES `ms_admin` WRITE;
/*!40000 ALTER TABLE `ms_admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `ms_admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ms_available`
--

DROP TABLE IF EXISTS `ms_available`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ms_available` (
  `kode_available` varchar(12) NOT NULL,
  `kode_item` varchar(12) NOT NULL,
  `kode_game` varchar(12) NOT NULL,
  `tgl_pembelian` date NOT NULL,
  `status_item` varchar(255) NOT NULL,
  `kuota_item` int(255) NOT NULL,
  `Harga_item` int(12) NOT NULL,
  PRIMARY KEY (`kode_available`),
  UNIQUE KEY `kode_item_UNIQUE` (`kode_item`),
  UNIQUE KEY `kode_game_UNIQUE` (`kode_game`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ms_available`
--

LOCK TABLES `ms_available` WRITE;
/*!40000 ALTER TABLE `ms_available` DISABLE KEYS */;
/*!40000 ALTER TABLE `ms_available` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ms_item`
--

DROP TABLE IF EXISTS `ms_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ms_item` (
  `kode_item` varchar(12) NOT NULL,
  `Nama_item` varchar(255) DEFAULT NULL,
  `type_item` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`kode_item`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ms_item`
--

LOCK TABLES `ms_item` WRITE;
/*!40000 ALTER TABLE `ms_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `ms_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ms_judulgames`
--

DROP TABLE IF EXISTS `ms_judulgames`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ms_judulgames` (
  `kodegame` varchar(12) NOT NULL,
  `kodedeveloper` varchar(12) DEFAULT NULL,
  `namagame` varchar(49) DEFAULT NULL,
  `device` varchar(45) DEFAULT NULL,
  `tipe_game` varchar(45) DEFAULT NULL,
  `status_game` varchar(49) DEFAULT NULL,
  PRIMARY KEY (`kodegame`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ms_judulgames`
--

LOCK TABLES `ms_judulgames` WRITE;
/*!40000 ALTER TABLE `ms_judulgames` DISABLE KEYS */;
/*!40000 ALTER TABLE `ms_judulgames` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ms_payment`
--

DROP TABLE IF EXISTS `ms_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ms_payment` (
  `kode_payment` varchar(12) NOT NULL,
  `nama_game` varchar(45) NOT NULL,
  `Id_game` varchar(12) NOT NULL,
  `nama_item` varchar(45) NOT NULL,
  `kode_reddem` varchar(6) NOT NULL,
  `waktu_pemesanan` date NOT NULL,
  `jam_pemesanan` time NOT NULL,
  `total_harga` bigint(200) NOT NULL,
  `metode_pembayaran` varchar(45) NOT NULL,
  PRIMARY KEY (`kode_payment`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ms_payment`
--

LOCK TABLES `ms_payment` WRITE;
/*!40000 ALTER TABLE `ms_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `ms_payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ms_time`
--

DROP TABLE IF EXISTS `ms_time`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ms_time` (
  `id_time` varchar(12) NOT NULL,
  `kodepayment` varchar(12) DEFAULT NULL,
  `start_time` date NOT NULL,
  `limit_time` date NOT NULL,
  `end_time` date NOT NULL,
  PRIMARY KEY (`id_time`),
  UNIQUE KEY `kodepayment` (`kodepayment`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ms_time`
--

LOCK TABLES `ms_time` WRITE;
/*!40000 ALTER TABLE `ms_time` DISABLE KEYS */;
/*!40000 ALTER TABLE `ms_time` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ms_user`
--

DROP TABLE IF EXISTS `ms_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ms_user` (
  `iduser` bigint(200) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `namauser` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `id_game` varchar(45) NOT NULL,
  `contactuser` int(12) NOT NULL,
  `password` varchar(255) NOT NULL,
  `confirmpassword` varchar(255) NOT NULL,
  PRIMARY KEY (`iduser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ms_user`
--

LOCK TABLES `ms_user` WRITE;
/*!40000 ALTER TABLE `ms_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `ms_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `msreddem`
--

DROP TABLE IF EXISTS `msreddem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `msreddem` (
  `kodereddem` varchar(12) NOT NULL,
  `kodegame` int(11) NOT NULL,
  `kodepayment` int(11) NOT NULL,
  PRIMARY KEY (`kodereddem`),
  UNIQUE KEY `kodegame_UNIQUE` (`kodegame`),
  UNIQUE KEY `kodepayment_UNIQUE` (`kodepayment`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `msreddem`
--

LOCK TABLES `msreddem` WRITE;
/*!40000 ALTER TABLE `msreddem` DISABLE KEYS */;
/*!40000 ALTER TABLE `msreddem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mstransaksi`
--

DROP TABLE IF EXISTS `mstransaksi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mstransaksi` (
  `kodetransaksi` varchar(12) NOT NULL,
  `tgl_transaksi` date NOT NULL,
  `jam_transaksi` time NOT NULL,
  `id_Game` varchar(12) NOT NULL,
  `nama_game` varchar(45) NOT NULL,
  `nama_item` varchar(45) NOT NULL,
  `jumlah_item` int(255) NOT NULL,
  `harga` bigint(200) NOT NULL,
  `total_harga` bigint(200) NOT NULL,
  PRIMARY KEY (`kodetransaksi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mstransaksi`
--

LOCK TABLES `mstransaksi` WRITE;
/*!40000 ALTER TABLE `mstransaksi` DISABLE KEYS */;
/*!40000 ALTER TABLE `mstransaksi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-06 22:23:50
