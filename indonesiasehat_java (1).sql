-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 20 Jul 2023 pada 04.30
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `indonesiasehat_java`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftarvaksin`
--

CREATE TABLE `daftarvaksin` (
  `nik` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `notelp` varchar(100) NOT NULL,
  `jk` varchar(50) NOT NULL,
  `jv` varchar(100) NOT NULL,
  `alamat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `daftarvaksin`
--

INSERT INTO `daftarvaksin` (`nik`, `nama`, `notelp`, `jk`, `jv`, `alamat`) VALUES
('317608090003', 'Kyrie Irving', '090878987654', 'Laki - Laki', 'Pfizer', 'Jl. Chicago'),
('31761025030005', 'Stephen Curry', '089678989910', 'Laki-Laki', 'AstraZeneca', 'Jl. Washington Dc'),
('317680907680006', 'Kendall Jenner', '909889907676', 'Perempuan', 'Sinopharm', 'Jl. BaverHills'),
('3176898790005', 'Kylie Thompson', '089098792034', 'Laki - Laki', 'Moderna', 'Jl. Brimingham');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `nik` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `level` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`nik`, `username`, `password`, `level`) VALUES
(0, 'iqbal', 'admin', 'admin'),
(3175, 'tawakal', 'user', 'Masyarakat');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `daftarvaksin`
--
ALTER TABLE `daftarvaksin`
  ADD PRIMARY KEY (`nik`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`nik`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
