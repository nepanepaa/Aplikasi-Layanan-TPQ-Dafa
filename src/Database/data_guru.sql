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
-- Database: `data_guru`
--

-- --------------------------------------------------------

--
-- Table structure for table `biodataguru`
--

CREATE TABLE `biodataguru` (
  `No` varchar(255) NOT NULL,
  `Nama` varchar(255) NOT NULL,
  `PendidikanTerakhir` varchar(255) NOT NULL,
  `MulaiMengajar` varchar(255) NOT NULL,
  `Alamat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `biodataguru`
--

INSERT INTO `biodataguru` (`No`, `Nama`, `PendidikanTerakhir`, `MulaiMengajar`, `Alamat`) VALUES
('1', 'Ahmad', 'SMA', '2021', 'Surabaya'),
('2', 'Vina', 'SMA', '2021', 'Surabaya'),
('3', 'Rahma', 'SMA', '2021', 'Surabaya'),
('4', 'Alpa', 'SMA', '2021', 'Surabaya');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `biodataguru`
--
ALTER TABLE `biodataguru`
  ADD PRIMARY KEY (`No`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
