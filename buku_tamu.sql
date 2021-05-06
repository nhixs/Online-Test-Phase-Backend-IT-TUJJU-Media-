-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2021 at 08:51 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `buku_tamu`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_tamu`
--

CREATE TABLE `data_tamu` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `no_ktp` varchar(16) NOT NULL,
  `email` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `address` varchar(255) NOT NULL,
  `destination` varchar(50) NOT NULL,
  `photo` varchar(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_tamu`
--

INSERT INTO `data_tamu` (`id`, `name`, `no_ktp`, `email`, `age`, `gender`, `address`, `destination`, `photo`) VALUES
(1, 'John Cena', '3.17506e15', 'john.cena@gmail.com', 41, 'Laki-Laki', 'Boston Jakarta', 'Ring', NULL),
(2, 'Sora', '31750600000000', 'Sora.cena@gmail.com', 23, 'Laki-Laki', 'Disneyland', 'Home', NULL),
(3, 'Riku', '23', 'Riku@gmail.com', 20, 'male', 'Jakarta', 'Disneyland', NULL),
(4, 'wortel', '3453453455345345', 'wortel@gmail.com', 12, 'male', 'Sawah', 'Bazaar', NULL),
(5, 'gerakmaju', '3453453455345345', 'admin@gmail.com', 22, 'female', 'jauh pokoknya', 'Stage', NULL),
(6, 'Tinkiwingki', '1050241708900001', 'Tinkiwingki@gmail.com', 20, 'male', 'Bukit Gunung', 'Disneyland', NULL),
(7, 'Dipsi', '1050241708900002', 'Dipsi@gmail.com', 21, 'male', 'Bukit Gunung Tinggi', 'Bazaar', NULL),
(8, 'Lala', '1050241708900003', 'lala@gmail.com', 21, 'female', 'Bukit Gunung Rendah', 'Disneyland', NULL),
(9, 'Poo', '1050241708900004', 'poo@gmail.com', 19, 'female', 'Bukit Gunung Tinggi Sekali', 'Stage', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_tamu`
--
ALTER TABLE `data_tamu`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_tamu`
--
ALTER TABLE `data_tamu`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
