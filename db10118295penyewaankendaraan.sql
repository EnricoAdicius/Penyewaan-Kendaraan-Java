/*
SQLyog Ultimate v12.5.1 (64 bit)
MySQL - 10.4.11-MariaDB : Database - db10118295penyewaankendaraan
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db10118295penyewaankendaraan` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `db10118295penyewaankendaraan`;

/*Table structure for table `merek_mobil` */

DROP TABLE IF EXISTS `merek_mobil`;

CREATE TABLE `merek_mobil` (
  `kode_merek` varchar(10) NOT NULL,
  `nama_merek` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`kode_merek`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `merek_mobil` */

insert  into `merek_mobil`(`kode_merek`,`nama_merek`) values 
('M0001','Nissan'),
('M0002','Datsun'),
('M0003','Smart'),
('M0004','Lincoln'),
('M0005','Acura'),
('M0006','Dacia'),
('M0007','Renault'),
('M0008','MINI'),
('M0009','Suzuki'),
('M0010','Porsche'),
('M0011','Ferrari'),
('M0012','Dodge'),
('M0013','Jeep'),
('M0014','Hyundai'),
('M0015','RAM Truck'),
('M0016','Kenworth'),
('M0017','Mazda'),
('M0018','Kia'),
('M0019','Volkswagen'),
('M0020','Honda'),
('M0021','Lamborghini'),
('M0022','Toyota'),
('M0023','Ford'),
('M0024','Daihatsu'),
('M0025','Audi');

/*Table structure for table `mobil` */

DROP TABLE IF EXISTS `mobil`;

CREATE TABLE `mobil` (
  `nomor_polisi` varchar(9) NOT NULL,
  `kode_tipe` varchar(10) DEFAULT NULL,
  `warna` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`nomor_polisi`),
  KEY `kode_tipe` (`kode_tipe`),
  CONSTRAINT `mobil_ibfk_1` FOREIGN KEY (`kode_tipe`) REFERENCES `tipe_mobil` (`kode_tipe`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `mobil` */

insert  into `mobil`(`nomor_polisi`,`kode_tipe`,`warna`) values 
('D1234WE','TY02','putih'),
('D1376F','MZ11','hitam'),
('D1823TY','HD01','putih'),
('D2112ON','SZ21','putih'),
('D2122R','MZ01','putih'),
('D2163XA','TY11','hitam'),
('D2304EY','DT01','Hitam'),
('D2311PU','MZ11','putih'),
('D2351M','DT03','putih'),
('D2389IO','HD01','hitam'),
('D2423RA','DT02','putih'),
('D2433DP','MZ01','hitam'),
('D2462XX','TY02','merah'),
('D2472XA','SZ21','hitam'),
('D2637SA','DT03','hitam'),
('D2712ON','SZ21','merah'),
('D2713RU','DT12','merah'),
('D2716PP','SZ03','putih'),
('D2731RA','DT01','Putih'),
('D2736LU','SZ03','hitam'),
('D2812LP','TY11','putih'),
('D2901XY','HD21','hitam'),
('D7182P','TY21','hitam'),
('D7281MO','DT01','Merah'),
('D8192NT','SZ01','hitam');

/*Table structure for table `penyewa` */

DROP TABLE IF EXISTS `penyewa`;

CREATE TABLE `penyewa` (
  `id_penyewa` int(10) NOT NULL AUTO_INCREMENT,
  `nama_penyewa` varchar(20) DEFAULT NULL,
  `no_telp` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`id_penyewa`)
) ENGINE=InnoDB AUTO_INCREMENT=20200842 DEFAULT CHARSET=utf8mb4;

/*Data for the table `penyewa` */

insert  into `penyewa`(`id_penyewa`,`nama_penyewa`,`no_telp`) values 
(20200801,'Christine Q. Haney','081251702056'),
(20200802,'Bree H. Knapp','081278075610'),
(20200803,'Zachery O. Lee','081225891082'),
(20200804,'Omar O. Day','081225868032'),
(20200805,'Chester X. Mendoza','081241132798'),
(20200806,'Bruce R. Dotson','081289975976'),
(20200807,'Charissa M. Schroede','081276526927'),
(20200808,'Patience J. Booker','081256680144'),
(20200809,'Keely W. Peters','081295259315'),
(20200810,'Moses L. Fisher','081252984858'),
(20200811,'Hedda M. Garrison','081284566852'),
(20200812,'Iona G. Hodge','081271690595'),
(20200813,'Katell L. Espinoza','081287835254'),
(20200814,'Lavinia A. Haley','081285712942'),
(20200815,'Aiko D. Leon','081255929874'),
(20200816,'Lionel L. Harrell','081229035538'),
(20200817,'Kadeem M. Conway','081251300037'),
(20200818,'Emery U. Cantrell','081240641972'),
(20200819,'Donna J. Tyler','081286966517'),
(20200820,'Beatrice C. Watts','081271581839'),
(20200821,'Fritz Y. Finch','081240671636'),
(20200822,'Hector K. Walton','081232047960'),
(20200823,'Kirestin P. Thompson','081241206381'),
(20200824,'Skyler F. Roy','081229812787'),
(20200825,'Stacey A. Alvarez','081229621765'),
(20200826,'Amos L. Tate','081287437086'),
(20200841,'Omar B. Khatab','081288657648');

/*Table structure for table `petugas` */

DROP TABLE IF EXISTS `petugas`;

CREATE TABLE `petugas` (
  `id_petugas` int(10) NOT NULL AUTO_INCREMENT,
  `nama_petugas` varchar(20) DEFAULT NULL,
  `alamat` varchar(25) DEFAULT NULL,
  `no_telp` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id_petugas`)
) ENGINE=InnoDB AUTO_INCREMENT=21880027 DEFAULT CHARSET=utf8mb4;

/*Data for the table `petugas` */

insert  into `petugas`(`id_petugas`,`nama_petugas`,`alamat`,`no_telp`) values 
(21880001,'Allegra Armstrong','Bogor','081245756888'),
(21880002,'Ina Cantu','Karawang','081281015560'),
(21880003,'Chantale Doyle','Bekasi','081292658621'),
(21880004,'Merritt Reynolds','Bandung','081291000135'),
(21880005,'Minerva Witt','Cimahi','081291753502'),
(21880006,'Unity Andrews','Bogor','081269351817'),
(21880007,'Scott Mcpherson','Bekasi','081203622144'),
(21880008,'Lionel Gordon','Bekasi','081278196572'),
(21880009,'Larissa Jensen','Surabaya','081283231861'),
(21880010,'Anastasia Sweeney','Bogor','081226034934'),
(21880011,'Phillip Farrell','Cimahi','081223213444'),
(21880012,'Cooper Cooke','Cimahi','081212945838'),
(21880013,'Sharon Cameron','Bogor','081201436307'),
(21880014,'Echo Mcintyre','Bandung','081233772241'),
(21880015,'Darryl Gibbs','Surabaya','081213340879'),
(21880016,'Whoopi Holt','Surabaya','081234556147'),
(21880017,'Vivien Garrison','Depok','081282040169'),
(21880018,'Yuri Livingston','Karawang','081244124744'),
(21880019,'Winifred Brewer','Karawang','081270013468'),
(21880020,'Hilary Mcdaniel','Jakarta','081276198193'),
(21880021,'Gavin Mcbride','Depok','081208401562'),
(21880022,'Heather Barry','Bandung','081240336081'),
(21880023,'Martina Sanford','Jakarta','081266722784'),
(21880024,'Maite Bailey','Jakarta','081299387729'),
(21880025,'John Teddy','Purwakarta','081276972632');

/*Table structure for table `sewa` */

DROP TABLE IF EXISTS `sewa`;

CREATE TABLE `sewa` (
  `no_sewa` int(10) NOT NULL AUTO_INCREMENT,
  `id_penyewa` int(10) DEFAULT NULL,
  `id_petugas` int(10) DEFAULT NULL,
  `tgl_sewa` date DEFAULT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `tgl_transaksi` date DEFAULT NULL,
  `lama_sewa` int(4) DEFAULT NULL,
  `nomor_polisi` varchar(9) DEFAULT NULL,
  `harga_sewa` int(15) DEFAULT NULL,
  KEY `id_penyewa` (`id_penyewa`),
  KEY `nomor_polisi` (`nomor_polisi`),
  KEY `id_petugas` (`id_petugas`),
  KEY `no_sewa` (`no_sewa`),
  CONSTRAINT `sewa_ibfk_1` FOREIGN KEY (`id_penyewa`) REFERENCES `penyewa` (`id_penyewa`),
  CONSTRAINT `sewa_ibfk_3` FOREIGN KEY (`nomor_polisi`) REFERENCES `mobil` (`nomor_polisi`),
  CONSTRAINT `sewa_ibfk_4` FOREIGN KEY (`id_petugas`) REFERENCES `petugas` (`id_petugas`)
) ENGINE=InnoDB AUTO_INCREMENT=5760032 DEFAULT CHARSET=utf8mb4;

/*Data for the table `sewa` */

insert  into `sewa`(`no_sewa`,`id_penyewa`,`id_petugas`,`tgl_sewa`,`tgl_kembali`,`tgl_transaksi`,`lama_sewa`,`nomor_polisi`,`harga_sewa`) values 
(2011201,20200801,21880001,'2020-06-09','2020-06-11','2020-06-05',2,'D2389IO',650000),
(2011202,20200803,21880001,'2020-06-09','2020-06-14','2020-06-09',5,'D1823TY',1625000),
(2011203,20200807,21880001,'2020-06-09','2020-06-10','2020-06-08',1,'D2304EY',250000),
(2011204,20200809,21880025,'2020-07-04','2020-07-05','2020-07-04',1,'D2736LU',300000),
(2011205,20200814,21880025,'2020-07-04','2020-07-06','2020-07-01',2,'D2731RA',500000),
(2011206,20200817,21880023,'2020-07-07','2020-07-10','2020-07-03',3,'D2901XY',930000),
(2011207,20200820,21880021,'2020-07-09','2020-07-10','2020-07-09',1,'D2812LP',290000),
(2011208,20200807,21880021,'2020-07-09','2020-07-11','2020-07-07',2,'D2304EY',500000),
(2011209,20200826,21880021,'2020-07-09','2020-07-12','2020-07-09',3,'D7182P',780000),
(2011210,20200824,21880019,'2020-07-12','2020-07-14','2020-07-12',2,'D1234WE',660000),
(2011211,20200801,21880017,'2020-07-14','2020-07-15','2020-07-12',1,'D2389IO',325000),
(2011212,20200811,21880016,'2020-07-15','2020-07-17','2020-07-08',2,'D7281MO',500000),
(2011213,20200825,21880016,'2020-07-15','2020-07-16','2020-07-13',1,'D1376F',500000),
(2011214,20200807,21880014,'2020-07-17','2020-07-19','2020-07-17',2,'D2351M',500000),
(2011215,20200822,21880013,'2020-08-01','2020-08-04','2020-07-14',3,'D2731RA',750000),
(2011216,20200817,21880010,'2020-07-21','2020-07-23','2020-07-20',2,'D2462XX',660000),
(2011217,20200825,21880008,'2020-07-23','2020-07-24','2020-07-21',1,'D2712ON',280000),
(2011218,20200804,21880008,'2020-07-23','2020-07-24','2020-07-23',1,'D2736LU',300000),
(2011219,20200824,21880008,'2020-07-23','2020-07-26','2020-07-23',3,'D8192NT',900000),
(2011220,20200812,21880006,'2020-07-25','2020-07-26','2020-07-18',1,'D2716PP',300000),
(2011221,20200820,21880006,'2020-07-25','2020-07-27','2020-07-22',2,'D1234WE',660000),
(2011222,20200822,21880005,'2020-07-26','2020-07-27','2020-07-26',1,'D2716PP',300000),
(2011223,20200814,21880005,'2020-07-26','2020-07-29','2020-07-25',3,'D2637SA',750000),
(2011224,20200816,21880005,'2020-07-26','2020-07-27','2020-07-26',1,'D8192NT',300000),
(2011225,20200803,21880003,'2020-08-01','2020-08-04','2020-07-29',3,'D2712ON',840000),
(5760027,20200801,21880001,'2020-08-10','2020-08-13','2020-08-09',3,'D2304EY',750000),
(5760030,20200815,21880022,'2020-08-11','2020-08-14','2020-08-09',3,'D2713RU',900000);

/*Table structure for table `tipe_mobil` */

DROP TABLE IF EXISTS `tipe_mobil`;

CREATE TABLE `tipe_mobil` (
  `kode_tipe` varchar(10) NOT NULL,
  `kode_merek` varchar(10) DEFAULT NULL,
  `nama_tipe` varchar(20) DEFAULT NULL,
  `biaya_mobil` int(15) DEFAULT NULL,
  PRIMARY KEY (`kode_tipe`),
  KEY `kode_merk` (`kode_merek`),
  CONSTRAINT `tipe_mobil_ibfk_1` FOREIGN KEY (`kode_merek`) REFERENCES `merek_mobil` (`kode_merek`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tipe_mobil` */

insert  into `tipe_mobil`(`kode_tipe`,`kode_merek`,`nama_tipe`,`biaya_mobil`) values 
('DT01','M0002','Go Panca',250000),
('DT02','M0002','Go Panca',250000),
('DT03','M0002','Go Panca',250000),
('DT11','M0002','Go+',300000),
('DT12','M0002','Go+',300000),
('DT13','M0002','Go+',300000),
('HD01','M0020','Civic',325000),
('HD02','M0020','Civic',325000),
('HD11','M0020','Brio',270000),
('HD21','M0020','Genio',310000),
('HD31','M0020','Jazz',260000),
('HD32','M0020','Jazz',260000),
('HD33','M0020','Jazz',260000),
('MZ01','M0017','Cx-5',450000),
('MZ02','M0017','Cx-5',450000),
('MZ11','M0017','Rx-7',500000),
('MZ12','M0017','Rx-7',500000),
('SZ01','M0009','Ertiga',300000),
('SZ02','M0009','Ertiga',300000),
('SZ03','M0009','Ertiga',300000),
('SZ11','M0009','Ignis',240000),
('SZ21','M0009','Katana',280000),
('TY01','M0022','Avanza',330000),
('TY02','M0022','Avanza',330000),
('TY11','M0022','Yaris',290000),
('TY12','M0022','Yaris',290000),
('TY21','M0022','Vios',260000),
('TY22','M0022','Vios',260000);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
