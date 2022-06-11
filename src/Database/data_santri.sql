-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 30, 2022 at 03:05 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data_santri`
--

-- --------------------------------------------------------

--
-- Table structure for table `biodatasantri`
--

CREATE TABLE `biodatasantri` (
  `No` varchar(255) NOT NULL,
  `Nama` varchar(255) NOT NULL,
  `TTL` varchar(255) NOT NULL,
  `MulaiMengaji` varchar(255) NOT NULL,
  `NamaOrtu` varchar(255) NOT NULL,
  `Kelas` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `biodatasantri`
--

INSERT INTO `biodatasantri` (`No`, `Nama`, `TTL`, `MulaiMengaji`, `NamaOrtu`, `Kelas`) VALUES
('1', 'Adi', '10/12/2010', '2022', 'Budi', 'Jilid 5'),
('2', 'Dimas', '5/10/2009', '2021', 'Iswadi', 'Alquran');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `biodatasantri`
--
ALTER TABLE `biodatasantri`
  ADD PRIMARY KEY (`No`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
