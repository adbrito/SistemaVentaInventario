create database dbInventario;
use dbInventario;
CREATE TABLE `COTIZACION` (
  `id_cotizacion` int,
  `fecha` varchar(200),
  `subtotal` float,
  `iva` float,
  `total` float,
  `id_cliente` varchar(200),
  `id_vendedor` varchar(200),
  KEY `pk` (`id_cotizacion`),
  KEY `fk` (`id_cliente`, `id_vendedor`)
);

CREATE TABLE `CLIENTE` (
  `id_cliente` varchar(200),
  `nombre` varchar(200),
  `apellido` varchar(200),
  `direccion` varchar(200),
  `telefono` varchar(200),
  `estado` varchar(200),
  KEY `pk` (`id_cliente`)
);

CREATE TABLE `ENVIO` (
  `id_envio` int,
  `fecha` varchar(200),
  `direccion` varchar(200),
  `subtotal` float,
  `iva` float,
  `total` float,
  `id_forma_pago` int,
  `id_local` int,
  `id_repartidor` varchar(200),
  KEY `pk` (`id_envio`),
  KEY `fk` (`id_forma_pago`, `id_local`, `id_repartidor`)
);

CREATE TABLE `DETALLE_COTIZACION` (
  `id_detalle_cotizacion` int,
  `id_producto` int,
  `cantidad` int,
  `subtotal` float,
  `id_cotizacion` int,
  KEY `pk` (`id_detalle_cotizacion`),
  KEY `fk` (`id_producto`, `id_cotizacion`)
);

CREATE TABLE `LOCAL` (
  `id_local` int,
  `descripcion` varchar(400),
  `ciudad` varchar(200),
  `direccion` varchar(200),
  `esSucursal` varchar(20),
  `esMatriz` varchar(20),
  `esBodega` varchar(20),
  `id_jefeBodega` varchar(200),
  `id_administrador` varchar(200),
  `id_gerente` varchar(200),
  KEY `pk` (`id_local`),
  KEY `fk` (`id_jefeBodega`, `id_administrador`, `id_gerente`)
);

CREATE TABLE `FORMA_PAGO_CLIENTE` (
  `id_cliente` varchar(200),
  `id_forma_pago` varchar(200),
  KEY `fk` (`id_cliente`, `id_forma_pago`)
);

CREATE TABLE `PRODUCTO` (
  `id_producto` int,
  `nombre` varchar(200),
  `descripcion` varchar(200),
  `cantExist` int,
  `categoria` varchar(200),
  `precioAlXMayor` float,
  `precioAlXMenor` float,
  `estado` varchar(30),
  KEY `pk` (`id_producto`)
);

CREATE TABLE `VENTA` (
  `id_venta` int,
  `fecha` varchar(200),
  `subtotal` float,
  `iva` float,
  `descuento` float,
  `total` float,
  `formaPago` int,
  `id_cliente` varchar(200),
  `id_vendedor` varchar(200),
  KEY `pk` (`id_venta`),
  KEY `fk` (`formaPago`, `id_cliente`, `id_vendedor`)
);

CREATE TABLE `REPARTIDOR` (
  `id_repartidor` varchar(200),
  `nombre` varchar(200),
  `apellido` varchar(200),
  `sueldo` float,
  `direccion` varchar(200),
  `telefono` varchar(200),
  `estado` varchar(20),
  `tieneVehiculoAsignado` varchar(200),
  `id_local` int,
  KEY `pk` (`id_repartidor`),
  KEY `fk` (`id_local`)
);

CREATE TABLE `ADMINISTRADOR` (
  `id_administrador` varchar(200),
  `nombre` varchar(200),
  `apellido` varchar(200),
  `direccion` varchar(200),
  `telefono` varchar(200),
  `sueldo` varchar(200),
  `estado` varchar(20),
  `tieneLocalAsignado` varchar(200),
  KEY `pk` (`id_administrador`)
);

CREATE TABLE `JEFE_BODEGA` (
  `id_jefeBodega` varchar(200),
  `nombre` varchar(200),
  `apellido` varchar(200),
  `bdegaAsignada` varchar(200),
  `estado` varchar(20),
  KEY `pk` (`id_jefeBodega`)
);

CREATE TABLE `FORMA_PAGO` (
  `id_forma_pago` int,
  `descripcion` varchar(200),
  `estado` varchar(30),
  KEY `pk` (`id_forma_pago`)
);

CREATE TABLE `VENDEDOR` (
  `id_vendedor` varchar(200),
  `nombre` varchar(200),
  `apellido` varchar(200),
  `direccion` varchar(200),
  `telefono` varchar(200),
  `sueldo` varchar(200),
  `estado` varchar(20),
  `tieneLocalAsignado` varchar(200),
  `id_local` int,
  KEY `pk` (`id_vendedor`),
  KEY `fk` (`id_local`)
);

CREATE TABLE `DETALLE_ENVIO` (
  `id_detalle_envio` int,
  `id_producto` int,
  `cantidad` int,
  `subtotal` float,
  `id_envio` int,
  KEY `pk` (`id_detalle_envio`),
  KEY `fk` (`id_producto`, `id_envio`)
);

CREATE TABLE `GERENTE` (
  `id_gerente` varchar(200),
  `nombre` varchar(200),
  `apellido` varchar(200),
  `direccion` varchar(200),
  `telefono` varchar(200),
  `sueldo` varchar(200),
  `estado` varchar(20),
  `tieneLocalAsignado` varchar(200),
  KEY `pk` (`id_gerente`)
);

CREATE TABLE `LOCAL_PRODUCTO` (
  `id_local` int,
  `id_producto` int,
  KEY `fk` (`id_local`, `id_producto`)
);

CREATE TABLE `DETALLE_VENTA` (
  `id_cuerpoVenta` int,
  `id_producto` int,
  `cantidad` int,
  `subtotal` float,
  `id_venta` int,
  KEY `pk` (`id_cuerpoVenta`),
  KEY `fk` (`id_producto`, `id_venta`)
);

