-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Jun 2022 pada 01.25
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `agendaguru`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `kegiatan`
--

CREATE TABLE `kegiatan` (
  `No` varchar(20) NOT NULL,
  `Hari/Tanggal` varchar(50) NOT NULL,
  `Kegiatan` varchar(300) NOT NULL,
  `Keterangan` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `kegiatan`
--

INSERT INTO `kegiatan` (`No`, `Hari/Tanggal`, `Kegiatan`, `Keterangan`) VALUES
('01.', 'Senin, 9 Mei 2022', 'Kegiatan Halal Bi Halal Santri & asatidz/ah TPQ', 'Santri & asatidz/ah tetap menerapkan protokol kesehatan'),
('02.', 'Selasa-Kamis, 10-12 Mei 2022', 'A. Kegiatan KBM PTM\r\nB. Tambahan materi tajwid (15 menit sebelum mengaji) berlaku semua jilid 1-6 & Al-Qur\'an', 'Santri & asatidz/ah tetap menerapkan protokol kesehatan'),
('03.', 'Jum\'at, 13 Mei 2022', 'Jum\'at Ke-2\r\nHafalan surat-surat pendek juz ke-30 (melanjutkan hafalan santri dikelas masing-masing)', 'Santri & asatidz/ah tetap menerapkan protokol kesehatan'),
('04.', 'Senin, 16 Mei 2022', 'LIBUR NASIONAL (HARI RAYA WAISAK)', '-'),
('05.', 'Senin, 16 Mei 2022', 'Kegiatan Di\'baiyah Rutin\r\nPeserta: Khusus santri kelas/jilid 5,6 & Al-Qur\'an ', 'Pukul 19.15 WIB (Ba\'da Sholat Isya)'),
('06.', 'Selasa-Kamis, 17-19 Mei 2022', 'A. Kegiatan KBM PTM\r\nB. Tambahan materi Fiqih (15 menit sebelum mengaji) berlaku semua jilid 1-6 & Al-Qur\'an', 'Santri & asatidz/ah tetap menerapkan protokol kesehatan'),
('07.', 'Jum\'at, 20 Mei 2022', 'Jum\'at Ke-2\r\nA. Jilid 1-3 materi hafalan niat+wudhu dan gerakan wudhu\r\nB. Jilid 4-6 materi gerakan wudhu, hal-hal yang membatalkan wudhu\r\nC. Al-Qur\'an menyesuaikan jadwal', 'Santri & asatidz/ah tetap menerapkan protokol kesehatan'),
('08.', 'Sabtu, 21 Mei 2022', 'Kegiatan Ekstrakulikuler TPQ\r\nQiroah dan pembaca Diba\' untuk kelas jilid 4-6 & Al-Qur,an (Pukul 15.30-17.30 WIB)', 'Santri & asatidz/ah tetap menerapkan protokol kesehatan'),
('09.', 'Senin-Rabu, 23-25 Mei 2022', 'A. Kegiatan KBM PTM\r\nB. Tambahan materi Aqidah (15 menit sebelum mengaji)', 'Santri & asatidz/ah tetap menerapkan protokol kesehatan'),
('10.', 'Senin, 23 Mei 2022', 'Kegiatan Diba\'iyah Rutin\r\nPesrta: Khusus santri Kelas/Jilid 5,6 & Al-Qur\'an ', 'Pukul 19.15 WIB (Ba\'da Sholat Isya)'),
('11.', 'Kamis, 26 Mei 2022', 'LIBUR NASIONAL (Kenaikan Isa Al-Masih)', '-'),
('12.', 'Jum\'at, 27 Mei 2022', 'Jumat Ke-4 \r\nIstighosah Rutin dalam Rangka Peringatan Isra\' Mi\'raj Nabi Muhammad SAW', 'Santri & asatidz/ah tetap menerapkan protokol kesehatan'),
('13', 'Sabtu, 28 Mei 2022', 'Kegiatan Ekstrakulikuler TPQ\r\nKegiatan ektrakulikuler Al-Banjari #7 khusus untuk santri kelas/jilid 4-6 & Al-Qur\'an\r\n', 'Santri & asatidz/ah tetap menerapkan protokol kesehatan'),
('14.', 'Ahad, 29 Mei 2022', 'Khotmil Qur,an\r\nKhusus santri kelas Al-Qur\'an & Ustadz/ah ', 'Pukul 07.30 WIB s.d. selesai'),
('15.', 'Senin-Selasa, 30-31 Mei 2022', 'A. Kegiatan KBM PTM\r\nB. Tambahan materi doa sehari-hari (15 menit sebelum mengaji)', 'Santri & asatidz/ah tetap menerapkan protokol kesehatan');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `kegiatan`
--
ALTER TABLE `kegiatan`
  ADD PRIMARY KEY (`No`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
