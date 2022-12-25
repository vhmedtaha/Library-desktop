-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 25, 2022 at 02:49 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `img` text DEFAULT NULL,
  `genere` varchar(30) DEFAULT NULL,
  `language` varchar(30) DEFAULT NULL,
  `author` varchar(30) DEFAULT NULL,
  `rate` double DEFAULT NULL,
  `price` double DEFAULT NULL,
  `pages` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`id`, `name`, `img`, `genere`, `language`, `author`, `rate`, `price`, `pages`) VALUES
(1, 'WATER I WON\'T TOUCH', 'upload/2.jpeg', 'Poetry', 'English', 'KAYLEB RAE CANDRILLI', 4.5, 50, 200),
(2, 'SPARE', 'upload/10.jpeg', 'Poetry', 'English', 'PRINCE HARRY', 4, 50, 200),
(3, 'GREANT', 'upload/4.jpeg', 'Poetry', 'English', 'RON CHERNOW', 3.7, 70, 150),
(4, 'Infinity\'s Edge', 'upload/12.jpeg', 'Poetry', 'English', 'Kevin Emerson', 4.8, 100, 300),
(5, 'WILDER GIRLS', 'upload/14.jpeg', 'Novels', 'English', 'RORY POWER', 3.5, 90, 275),
(6, 'UGLY LOVE', 'upload/16.jpeg', 'Novels', 'English', 'COLLEEN HOOVER', 3, 60, 350),
(7, 'THE HAPPY BRAIN', 'upload/18.jpeg', 'Science', 'English', 'DEAN BURNETT', 2.5, 40, 250),
(8, 'NEIL DE GRASSE TYSON', 'upload/20.jpeg', 'Science', 'English', 'STARRY MESSENGER', 4.9, 110, 200),
(9, 'To Be a Machine', 'upload/22.jpeg', 'Science', 'English', 'Mark O\'Connell', 4, 60, 200),
(10, 'إيكادولي', 'upload/24.jpeg', 'Horror', 'Arabic', 'حنان لاشين', 3.5, 50, 150),
(11, 'الفرسان الثلاثة', 'upload/26.jpeg', 'Horror', 'Arabic', 'اسكندر دوماس الكبير', 4.5, 30, 80),
(12, 'Clean Code', 'upload/28.jpeg', 'Computer Science', 'English', 'Robert C.Martin', 4.9, 60, 200),
(13, 'hackers', 'upload/30.jpeg', 'Computer Science', 'English', 'steven levy', 4.5, 90, 160),
(14, 'Life 3.0', 'upload/32.jpeg', 'Computer Science', 'English', 'Max Tegmark', 3.5, 65, 170),
(15, 'كليلة و دمنة', 'upload/34.jpeg', 'Arts', 'Arabic', 'عبد الله بن المقفع', NULL, 70, 260);

-- --------------------------------------------------------

--
-- Table structure for table `persons`
--

CREATE TABLE `persons` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `name` varchar(30) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `role` varchar(50) NOT NULL,
  `favBooks` text DEFAULT NULL,
  `gender` char(1) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `img` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `persons`
--

INSERT INTO `persons` (`id`, `username`, `name`, `password`, `email`, `role`, `favBooks`, `gender`, `phone`, `img`) VALUES
(6, 'adminzedan', 'zedan', '013', 'ad@admin.com', 'Admin', '3,', 'M', '01556188801', 'upload/profileImgs/default.png'),
(2, 'cr7', 'Ronaldo', '123', 'cris@gmail.com', 'Admin', '20,23,4,20,23,17,', 'M', '011', 'upload/profileImgs/default.png'),
(1, 'peterj', 'Peter Joseph', '123', 'peter@gmail.com', 'Customer', '4, 8, 9, 10', 'M', '01211036617', 'upload/profileImgs/default.png'),
(5, 'zidane', 'Ahmed Zezo', '123', 'zidane@gmail.com', 'Customer', '1,10,9,', 'M', '01556188801', 'upload/profileImgs/5.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `persons`
--
ALTER TABLE `persons`
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `id` (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT for table `persons`
--
ALTER TABLE `persons`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
