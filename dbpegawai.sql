-- phpMyAdmin SQL Dump
-- version 5.2.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Mar 31, 2026 at 01:00 AM
-- Server version: 8.4.3
-- PHP Version: 8.3.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbpegawai`
--

-- --------------------------------------------------------

--
-- Table structure for table `tabel_admin`
--

CREATE TABLE `tabel_admin` (
  `id` int NOT NULL,
  `username` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tabel_admin`
--

INSERT INTO `tabel_admin` (`id`, `username`, `password`) VALUES
(1, 'userani', 'userani.'),
(2, 'user_ari', '123ari.'),
(3, 'user_eva', 'p4ssword'),
(4, 'user_fadhil', 'p4ssw0rd'),
(5, 'user_selvi', 'passw0rd'),
(6, 'admin', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_divisi`
--

CREATE TABLE `tabel_divisi` (
  `id_divisi` int NOT NULL,
  `nama_divisi` varchar(22) NOT NULL,
  `honor_divisi` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tabel_divisi`
--

INSERT INTO `tabel_divisi` (`id_divisi`, `nama_divisi`, `honor_divisi`) VALUES
(3, 'ADMINISTRASI', 1670000),
(6, 'FUGIMASI', 1800000),
(8, 'FUGIMASI', 2000000),
(5, 'INSPEKSI', 2000000),
(2, 'KEPEGAWAIAN', 1600000),
(1, 'KEUANGAN', 1500000),
(4, 'LABORATORIUM', 1450000),
(7, 'PEMASARAN', 1550000),
(9, 't', 9);

-- --------------------------------------------------------

--
-- Table structure for table `tabel_jabatan`
--

CREATE TABLE `tabel_jabatan` (
  `id_jabatan` int NOT NULL,
  `jabatan` varchar(50) NOT NULL,
  `gaji_pokok` bigint NOT NULL,
  `tunj_jabatan` bigint NOT NULL,
  `tunj_anak` bigint NOT NULL,
  `tunj_kesehatan` bigint NOT NULL,
  `perj_dinas` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tabel_jabatan`
--

INSERT INTO `tabel_jabatan` (`id_jabatan`, `jabatan`, `gaji_pokok`, `tunj_jabatan`, `tunj_anak`, `tunj_kesehatan`, `perj_dinas`) VALUES
(4, 'Kepala Bagian Fugimasi', 6700000, 1100000, 500000, 500000, 1300000),
(5, 'Kepala Bagian HRD', 5000000, 1000000, 500000, 500000, 1100000),
(2, 'Kepala Bagian Kepegawaian', 6080000, 1300000, 500000, 500000, 1200000),
(1, 'Kepala Bagian Keuangan', 5000000, 1000000, 500000, 500000, 1000000),
(3, 'Kepala Bagian Operasioanl', 5500000, 1000000, 550000, 500000, 1000000),
(6, 'Kepala Laboratorium', 5500000, 1000000, 500000, 500000, 1100000);

-- --------------------------------------------------------

--
-- Table structure for table `tabel_pegawai`
--

CREATE TABLE `tabel_pegawai` (
  `id_pegawai` int NOT NULL,
  `id_divisi` int NOT NULL,
  `id_jabatan` int NOT NULL,
  `nama` varchar(22) NOT NULL,
  `alamat` varchar(22) NOT NULL,
  `usia` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tabel_pegawai`
--

INSERT INTO `tabel_pegawai` (`id_pegawai`, `id_divisi`, `id_jabatan`, `nama`, `alamat`, `usia`) VALUES
(13071975, 1, 3, 'Nurhayati', 'Bandung', 47),
(23011978, 2, 1, 'Endar', 'Purwokerto', 44),
(21121981, 2, 2, 'Eva Nurvaizah', 'Purwokerto', 41),
(17081983, 2, 2, 'Evi Nurbaeti', 'Kerawang', 39),
(11112011, 3, 3, 'Inka', 'Jakarta', 29);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tabel_admin`
--
ALTER TABLE `tabel_admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_divisi`
--
ALTER TABLE `tabel_divisi`
  ADD PRIMARY KEY (`id_divisi`),
  ADD UNIQUE KEY `nama_divisi` (`nama_divisi`,`honor_divisi`);

--
-- Indexes for table `tabel_jabatan`
--
ALTER TABLE `tabel_jabatan`
  ADD PRIMARY KEY (`id_jabatan`),
  ADD UNIQUE KEY `jabatan` (`jabatan`,`gaji_pokok`,`tunj_jabatan`,`tunj_anak`,`tunj_kesehatan`,`perj_dinas`);

--
-- Indexes for table `tabel_pegawai`
--
ALTER TABLE `tabel_pegawai`
  ADD PRIMARY KEY (`id_pegawai`),
  ADD UNIQUE KEY `id_divisi` (`id_divisi`,`id_jabatan`,`nama`,`alamat`,`usia`),
  ADD KEY `id_jabatan` (`id_jabatan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tabel_admin`
--
ALTER TABLE `tabel_admin`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tabel_divisi`
--
ALTER TABLE `tabel_divisi`
  MODIFY `id_divisi` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=110;

--
-- AUTO_INCREMENT for table `tabel_jabatan`
--
ALTER TABLE `tabel_jabatan`
  MODIFY `id_jabatan` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tabel_pegawai`
--
ALTER TABLE `tabel_pegawai`
  MODIFY `id_pegawai` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1316464645;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tabel_pegawai`
--
ALTER TABLE `tabel_pegawai`
  ADD CONSTRAINT `tabel_pegawai_ibfk_1` FOREIGN KEY (`id_jabatan`) REFERENCES `tabel_jabatan` (`id_jabatan`),
  ADD CONSTRAINT `tabel_pegawai_ibfk_2` FOREIGN KEY (`id_divisi`) REFERENCES `tabel_divisi` (`id_divisi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
