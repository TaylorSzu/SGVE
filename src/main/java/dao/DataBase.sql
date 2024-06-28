-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sgve
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `id` int NOT NULL AUTO_INCREMENT,
  `categoria` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Teste'),(2,'teste 2'),(3,'teste3');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `codigo` int DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `fabricante` varchar(255) DEFAULT NULL,
  `estoque` int DEFAULT NULL,
  `estoque_minimo` int DEFAULT NULL,
  `estoque_maximo` int DEFAULT NULL,
  `categoria` varchar(100) DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `preco_compra` decimal(10,2) DEFAULT NULL,
  `preco_venda` decimal(10,2) DEFAULT NULL,
  `unidade_medida` varchar(50) DEFAULT NULL,
  `descricao` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,1234567,'1234567','Fabricante Teste',2,NULL,NULL,'teste 2',300,10.00,20.00,'ml','testegdgysvdfsbfsfsofjgdpohfpfpoçfopfpofpoff'),(2,2679860,'2679860','fabricante teste 2',2,NULL,NULL,'teste3',500,10.00,12.00,'kg',''),(3,1233456,'1233456','adaafasf',3,NULL,NULL,'teste3',240,7.00,14.00,'ml','dgdgsasdfsgsgsd'),(4,133567,'133567','asasfasfa',2,NULL,NULL,'teste 2',300,13.00,26.00,'kg','igsidgfuhsighshgpjsgpjspigoheipghipuedg'),(6,1242556,'samsung','fasdsdsdg',-1,NULL,NULL,'Teste',300,12.00,16.00,'ml','jegfysyuduhsdfsf'),(7,123456,'Teste','Teste fabri',18,5,50,'teste 2',123,12.00,16.00,'g','ogf88ofn 8hcsbvo8hfnsd  hw8hucbdb8h v '),(8,7654321,'teste','fabricante',8,5,100,'Teste',13,11.00,22.00,'g','sdfsdsgsdgg');
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venda` (
  `id` int NOT NULL AUTO_INCREMENT,
  `produto` varchar(255) DEFAULT NULL,
  `quantidade` int DEFAULT NULL,
  `valor_pago` decimal(10,2) DEFAULT NULL,
  `pagamento` varchar(255) DEFAULT NULL,
  `data_venda` date DEFAULT NULL,
  `lucro` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
INSERT INTO `venda` VALUES (1,'samsung',1,16.00,'pix','2024-05-12',NULL),(2,'samsung',1,16.00,'Pix','2024-05-19',NULL),(3,'samsung',1,16.00,'Credito a vista','2024-05-19',NULL),(4,'samsung',1,16.00,'Pix','2024-05-20',NULL),(5,'teste',1,16.00,'Pix','2024-05-20',NULL),(6,'teste',1,16.00,'Pix','2024-05-20',NULL);
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'sgve'
--

--
-- Dumping routines for database 'sgve'
--
/*!50003 DROP PROCEDURE IF EXISTS `sp_add_produto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`Taylor`@`localhost` PROCEDURE `sp_add_produto`(
 vcodigo int, 
 vnome varchar(255), 
 vfabricante varchar(255),
 vestoque int, 
 vestoque_minimo int,
 vestoque_maximo int, 
 vcategoria varchar(100),
 vpeso float, 
 vpreco_compra decimal(10,2), 
 vpreco_venda decimal(10,2),
 vunidade_medida varchar(50), 
 vdescricao text)
BEGIN
insert into produto (codigo,nome,fabricante,estoque,estoque_minimo,estoque_maximo,categoria,peso,preco_compra,preco_venda,unidade_medida,descricao)
values(vcodigo,vnome,vfabricante,vestoque,vestoque_minimo,vestoque_maximo,vcategoria,vpeso,vpreco_compra,vpreco_venda,vunidade_medida,vdescricao);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_add_venda` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`Taylor`@`localhost` PROCEDURE `sp_add_venda`(
    vproduto VARCHAR(255),
    vquantidade INT,
    vvalor_pago DECIMAL(10,2),
    vpagamento VARCHAR(255))
BEGIN
    INSERT INTO venda (produto, quantidade, valor_pago, pagamento, data_venda)
    VALUES (vproduto, vquantidade, vvalor_pago, vpagamento, NOW()); -- Utilizando a função NOW() para capturar a data e hora atuais
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_atualizar_produto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`Taylor`@`localhost` PROCEDURE `sp_atualizar_produto`(
    p_id INT,
    p_codigo INT, 
    p_nome VARCHAR(255), 
    p_fabricante VARCHAR(255),
    p_estoque INT, 
    p_estoque_minimo INT,
    p_estoque_maximo INT, 
    p_categoria VARCHAR(100),
    p_peso FLOAT, 
    p_preco_compra DECIMAL(10,2), 
    p_preco_venda DECIMAL(10,2),
    p_unidade_medida VARCHAR(50), 
    p_descricao TEXT
)
BEGIN
    UPDATE produto 
    SET 
        codigo = p_codigo, 
        nome = p_nome, 
        fabricante = p_fabricante, 
        estoque = p_estoque, 
        estoque_minimo = p_estoque_minimo, 
        estoque_maximo = p_estoque_maximo,
        categoria = p_categoria, 
        peso = p_peso, 
        preco_compra = p_preco_compra, 
        preco_venda = p_preco_venda, 
        unidade_medida = p_unidade_medida, 
        descricao = p_descricao
    WHERE id = p_id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_deletar_produto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`Taylor`@`localhost` PROCEDURE `sp_deletar_produto`(vid int)
BEGIN
delete from produto
where id = vid;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_deletar_venda` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`Taylor`@`localhost` PROCEDURE `sp_deletar_venda`(vid int)
BEGIN
delete from venda
where id = vid;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-21 13:24:49
