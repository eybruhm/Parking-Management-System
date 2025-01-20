-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 20, 2025 at 11:06 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pmsdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `parked`
--

CREATE TABLE `parked` (
  `Floor` int(1) NOT NULL,
  `Slot_Name` varchar(50) NOT NULL,
  `Slot_Type` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pms_day1`
--

CREATE TABLE `pms_day1` (
  `Slot` varchar(50) NOT NULL,
  `Time_In` datetime NOT NULL,
  `Time_Out` datetime DEFAULT NULL,
  `Rate` decimal(50,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pms_day1`
--

INSERT INTO `pms_day1` (`Slot`, `Time_In`, `Time_Out`, `Rate`) VALUES
('1H', '2024-05-18 12:22:07', '2024-05-18 12:26:30', 0.00),
('1D', '2024-05-18 12:22:21', '2024-05-18 12:26:29', 0.00),
('1P', '2024-05-18 12:22:24', '2024-05-18 12:26:31', 0.00),
('1B', '2024-05-18 12:24:04', '2024-05-18 12:26:26', 0.00),
('1A', '2024-05-18 12:27:47', '2024-05-18 12:28:24', 20.00),
('1I', '2024-05-18 12:27:49', '2024-05-18 12:28:22', 20.00),
('1A', '2024-05-18 12:29:05', '2024-05-18 12:30:39', 380.00),
('1I', '2024-05-18 12:29:07', '2024-05-18 12:30:36', 360.00),
('2C', '2024-05-18 12:29:11', '2024-05-18 12:30:52', 420.00),
('2K', '2024-05-18 12:29:13', '2024-05-18 12:30:54', 420.00),
('3B', '2024-05-18 12:29:17', '2024-05-18 12:30:48', 380.00),
('3V', '2024-05-18 12:29:18', '2024-05-18 12:30:50', 380.00),
('4X', '2024-05-18 12:29:22', '2024-05-18 12:30:45', 340.00),
('4T', '2024-05-18 12:29:25', '2024-05-18 12:30:44', 320.00),
('4D', '2024-05-18 12:29:26', '2024-05-18 12:30:41', 320.00),
('4C', '2024-05-18 12:29:39', '2024-05-18 12:30:43', 260.00),
('3A', '2024-05-18 12:29:41', '2024-05-18 12:30:49', 280.00),
('1A', '2024-07-22 15:45:49', '2024-07-22 15:45:58', 0.00),
('4A', '2024-07-22 15:46:13', '2024-07-22 15:46:48', 0.00),
('4B', '2024-07-22 15:46:21', '2024-07-22 15:46:44', 0.00);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
