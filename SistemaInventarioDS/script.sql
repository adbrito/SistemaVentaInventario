-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema dbinventario
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dbinventario
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dbinventario` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `dbinventario` ;

-- -----------------------------------------------------
-- Table `dbinventario`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`cliente` (
  `id_cliente` VARCHAR(200) NOT NULL,
  `nombre` VARCHAR(200) NOT NULL,
  `apellido` VARCHAR(200) NULL DEFAULT NULL,
  `direccion` VARCHAR(200) NULL DEFAULT NULL,
  `telefono` VARCHAR(200) NULL DEFAULT NULL,
  `estado` CHAR(20) NOT NULL,
  PRIMARY KEY (`id_cliente`),
  INDEX `pk` (`id_cliente` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbinventario`.`empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`empleado` (
  `id_empleado` VARCHAR(200) NOT NULL,
  `rol` VARCHAR(200) NULL DEFAULT NULL,
  `nombre` VARCHAR(200) NOT NULL,
  `apellido` VARCHAR(200) NOT NULL,
  `direccion` VARCHAR(200) NULL DEFAULT NULL,
  `telefono` VARCHAR(200) NULL DEFAULT NULL,
  `sueldo` FLOAT UNSIGNED ZEROFILL NULL DEFAULT NULL,
  `estado` CHAR(20) NOT NULL,
  PRIMARY KEY (`id_empleado`),
  UNIQUE INDEX `id_vendedor_UNIQUE` (`id_empleado` ASC) VISIBLE,
  INDEX `pk` (`id_empleado` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbinventario`.`local`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`local` (
  `id_local` INT(11) NOT NULL,
  `descripcion` VARCHAR(400) NULL DEFAULT NULL,
  `ciudad` VARCHAR(200) NULL DEFAULT NULL,
  `direccion` VARCHAR(200) NULL DEFAULT NULL,
  `esSucursal` CHAR(20) NULL DEFAULT NULL,
  `esMatriz` CHAR(20) NULL DEFAULT NULL,
  `esBodega` CHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id_local`),
  UNIQUE INDEX `id_local_UNIQUE` (`id_local` ASC) VISIBLE,
  INDEX `pk` (`id_local` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbinventario`.`forma_pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`forma_pago` (
  `id_forma_pago` INT(11) NULL DEFAULT NULL,
  `descripcion` VARCHAR(200) NULL DEFAULT NULL,
  `estado` VARCHAR(30) NULL DEFAULT NULL,
  INDEX `pk` (`id_forma_pago` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbinventario`.`envio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`envio` (
  `id_envio` INT(11) NULL DEFAULT NULL,
  `fecha` VARCHAR(200) NULL DEFAULT NULL,
  `direccion` VARCHAR(200) NULL DEFAULT NULL,
  `subtotal` FLOAT NULL DEFAULT NULL,
  `iva` FLOAT NULL DEFAULT NULL,
  `total` FLOAT NULL DEFAULT NULL,
  `id_forma_pago` INT(11) NULL DEFAULT NULL,
  `id_local` INT(11) NULL DEFAULT NULL,
  `id_repartidor` VARCHAR(200) NULL DEFAULT NULL,
  `empleado_id_empleado` VARCHAR(200) NOT NULL,
  INDEX `pk` (`id_envio` ASC) VISIBLE,
  INDEX `fk` (`id_forma_pago` ASC, `id_local` ASC, `id_repartidor` ASC) VISIBLE,
  INDEX `id_local_idx` (`id_local` ASC) VISIBLE,
  PRIMARY KEY (`empleado_id_empleado`),
  CONSTRAINT `id_local`
    FOREIGN KEY (`id_local`)
    REFERENCES `dbinventario`.`local` (`id_local`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_forma_pago`
    FOREIGN KEY (`id_forma_pago`)
    REFERENCES `dbinventario`.`forma_pago` (`id_forma_pago`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_envio_empleado1`
    FOREIGN KEY (`empleado_id_empleado`)
    REFERENCES `dbinventario`.`empleado` (`id_empleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbinventario`.`cotizacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`cotizacion` (
  `id_cotizacion` INT(11) NULL DEFAULT NULL,
  `fecha` VARCHAR(200) NULL DEFAULT NULL,
  `subtotal` FLOAT NULL DEFAULT NULL,
  `iva` FLOAT NULL DEFAULT NULL,
  `total` FLOAT NULL DEFAULT NULL,
  `id_cliente` VARCHAR(200) NULL DEFAULT NULL,
  `id_vendedor` VARCHAR(200) NULL DEFAULT NULL,
  `envio_empleado_id_empleado` VARCHAR(200) NOT NULL,
  INDEX `pk` (`id_cotizacion` ASC) VISIBLE,
  INDEX `fk` (`id_cliente` ASC, `id_vendedor` ASC) VISIBLE,
  INDEX `id_empleado_idx` (`id_vendedor` ASC) VISIBLE,
  PRIMARY KEY (`envio_empleado_id_empleado`),
  CONSTRAINT `id_cliente`
    FOREIGN KEY (`id_cliente`)
    REFERENCES `dbinventario`.`cliente` (`id_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_empleado`
    FOREIGN KEY (`id_vendedor`)
    REFERENCES `dbinventario`.`empleado` (`id_empleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cotizacion_envio1`
    FOREIGN KEY (`envio_empleado_id_empleado`)
    REFERENCES `dbinventario`.`envio` (`empleado_id_empleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbinventario`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`producto` (
  `id_producto` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(200) NULL DEFAULT NULL,
  `descripcion` VARCHAR(200) NULL DEFAULT NULL,
  `cantExist` INT(11) NULL DEFAULT NULL,
  `categoria` VARCHAR(200) NOT NULL DEFAULT 'OTROS',
  `precioAlXMayor` FLOAT NULL DEFAULT NULL,
  `precioAlXMenor` FLOAT NULL DEFAULT NULL,
  `estado` CHAR(20) NOT NULL,
  PRIMARY KEY (`id_producto`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbinventario`.`detalle_cotizacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`detalle_cotizacion` (
  `id_detalle_cotizacion` INT(11) NULL DEFAULT NULL,
  `id_producto` INT(11) NULL DEFAULT NULL,
  `cantidad` INT(11) NULL DEFAULT NULL,
  `subtotal` FLOAT NULL DEFAULT NULL,
  `id_cotizacion` INT(11) NULL DEFAULT NULL,
  INDEX `pk` (`id_detalle_cotizacion` ASC) VISIBLE,
  INDEX `fk` (`id_producto` ASC, `id_cotizacion` ASC) VISIBLE,
  INDEX `id_cotizacion_idx` (`id_cotizacion` ASC) VISIBLE,
  CONSTRAINT `id_cotizacion`
    FOREIGN KEY (`id_cotizacion`)
    REFERENCES `dbinventario`.`cotizacion` (`id_cotizacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_producto`
    FOREIGN KEY (`id_producto`)
    REFERENCES `dbinventario`.`producto` (`id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbinventario`.`detalle_envio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`detalle_envio` (
  `id_detalle_envio` INT(11) NULL DEFAULT NULL,
  `id_producto` INT(11) NULL DEFAULT NULL,
  `cantidad` INT(11) NULL DEFAULT NULL,
  `subtotal` FLOAT NULL DEFAULT NULL,
  `id_envio` INT(11) NULL DEFAULT NULL,
  INDEX `pk` (`id_detalle_envio` ASC) VISIBLE,
  INDEX `fk` (`id_producto` ASC, `id_envio` ASC) VISIBLE,
  INDEX `id_envio_idx` (`id_envio` ASC) VISIBLE,
  CONSTRAINT `id_envio`
    FOREIGN KEY (`id_envio`)
    REFERENCES `dbinventario`.`envio` (`id_envio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_producto`
    FOREIGN KEY (`id_producto`)
    REFERENCES `dbinventario`.`producto` (`id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbinventario`.`venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`venta` (
  `id_venta` INT(11) NULL DEFAULT NULL,
  `fecha` VARCHAR(200) NULL DEFAULT NULL,
  `subtotal` FLOAT NULL DEFAULT NULL,
  `iva` FLOAT NULL DEFAULT NULL,
  `descuento` FLOAT NULL DEFAULT NULL,
  `total` FLOAT NULL DEFAULT NULL,
  `formaPago` INT(11) NULL DEFAULT NULL,
  `id_cliente` VARCHAR(200) NULL DEFAULT NULL,
  `id_vendedor` VARCHAR(200) NULL DEFAULT NULL,
  INDEX `pk` (`id_venta` ASC) VISIBLE,
  INDEX `fk` (`formaPago` ASC, `id_cliente` ASC, `id_vendedor` ASC) VISIBLE,
  INDEX `id_cliente_idx` (`id_cliente` ASC) VISIBLE,
  INDEX `id_empleado_idx` (`id_vendedor` ASC) VISIBLE,
  CONSTRAINT `id_cliente`
    FOREIGN KEY (`id_cliente`)
    REFERENCES `dbinventario`.`cliente` (`id_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_empleado`
    FOREIGN KEY (`id_vendedor`)
    REFERENCES `dbinventario`.`empleado` (`id_empleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbinventario`.`detalle_venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`detalle_venta` (
  `id_cuerpoVenta` INT(11) NULL DEFAULT NULL,
  `id_producto` INT(11) NULL DEFAULT NULL,
  `cantidad` INT(11) NULL DEFAULT NULL,
  `subtotal` FLOAT NULL DEFAULT NULL,
  `id_venta` INT(11) NULL DEFAULT NULL,
  INDEX `pk` (`id_cuerpoVenta` ASC) VISIBLE,
  INDEX `fk` (`id_producto` ASC, `id_venta` ASC) VISIBLE,
  INDEX `id_venta_idx` (`id_venta` ASC) VISIBLE,
  CONSTRAINT `id_venta`
    FOREIGN KEY (`id_venta`)
    REFERENCES `dbinventario`.`venta` (`id_venta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_producto`
    FOREIGN KEY (`id_producto`)
    REFERENCES `dbinventario`.`producto` (`id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbinventario`.`forma_pago_cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`forma_pago_cliente` (
  `id_cliente` VARCHAR(200) NULL DEFAULT NULL,
  `id_forma_pago` INT(11) NULL DEFAULT NULL,
  INDEX `fk` (`id_cliente` ASC, `id_forma_pago` ASC) VISIBLE,
  INDEX `id_foma_pago_idx` (`id_forma_pago` ASC) VISIBLE,
  CONSTRAINT `id_cliente`
    FOREIGN KEY (`id_cliente`)
    REFERENCES `dbinventario`.`cliente` (`id_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_foma_pago`
    FOREIGN KEY (`id_forma_pago`)
    REFERENCES `dbinventario`.`forma_pago` (`id_forma_pago`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbinventario`.`local_empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`local_empleado` (
  `id_empleado` VARCHAR(200) NOT NULL,
  `id_local` VARCHAR(200) NOT NULL,
  INDEX `id_empleado_idx` (`id_empleado` ASC) VISIBLE,
  CONSTRAINT `id_empleado`
    FOREIGN KEY (`id_empleado`)
    REFERENCES `dbinventario`.`empleado` (`id_empleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_local`
    FOREIGN KEY ()
    REFERENCES `dbinventario`.`local` ()
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbinventario`.`local_producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`local_producto` (
  `id_local` INT(11) NULL DEFAULT NULL,
  `id_producto` INT(11) NULL DEFAULT NULL,
  INDEX `id_local_idx` (`id_local` ASC) VISIBLE,
  INDEX `id_producto_idx` (`id_producto` ASC) VISIBLE,
  CONSTRAINT `id_producto`
    FOREIGN KEY (`id_producto`)
    REFERENCES `dbinventario`.`producto` (`id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_local`
    FOREIGN KEY (`id_local`)
    REFERENCES `dbinventario`.`local` (`id_local`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbinventario`.`repartidor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`repartidor` (
  `id_repartidor` VARCHAR(200) NULL DEFAULT NULL,
  `nombre` VARCHAR(200) NULL DEFAULT NULL,
  `apellido` VARCHAR(200) NULL DEFAULT NULL,
  `sueldo` FLOAT NULL DEFAULT NULL,
  `direccion` VARCHAR(200) NULL DEFAULT NULL,
  `telefono` VARCHAR(200) NULL DEFAULT NULL,
  `estado` VARCHAR(20) NULL DEFAULT NULL,
  `tieneVehiculoAsignado` VARCHAR(200) NULL DEFAULT NULL,
  `id_local` INT(11) NULL DEFAULT NULL,
  INDEX `pk` (`id_repartidor` ASC) VISIBLE,
  INDEX `fk` (`id_local` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbinventario`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinventario`.`usuario` (
  `id_empleado` VARCHAR(200) NULL DEFAULT NULL,
  `username` VARCHAR(16) NOT NULL,
  `password` VARCHAR(32) NOT NULL,
  `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  INDEX `id_empleado_idx` (`id_empleado` ASC) VISIBLE,
  CONSTRAINT `id_empleado`
    FOREIGN KEY (`id_empleado`)
    REFERENCES `dbinventario`.`empleado` (`id_empleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
