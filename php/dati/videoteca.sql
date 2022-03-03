-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mar 01, 2022 alle 22:42
-- Versione del server: 5.7.17
-- Versione PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `videoteca`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `attori`
--

CREATE TABLE `attori` (
  `idattore` int(11) NOT NULL,
  `cognomea` varchar(200) DEFAULT NULL,
  `nomea` varchar(200) DEFAULT NULL,
  `dataa` date DEFAULT NULL,
  `luogoa` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `attori`
--

INSERT INTO `attori` (`idattore`, `cognomea`, `nomea`, `dataa`, `luogoa`) VALUES
(1, 'Bacall', 'Lauren', '0000-00-00', 'USA'),
(2, 'Widmark', 'Richard', '0000-00-00', 'USA'),
(3, 'Carotenuto', 'Memmo', '0000-00-00', 'Italia'),
(4, 'Riento', 'Virginio', '0000-00-00', 'Italia'),
(5, 'De Luca', 'Lorella', '0000-00-00', 'Italia'),
(6, 'Loren', 'Sophia', '0000-00-00', 'Napoli'),
(7, 'Loggia', 'Robert', '0000-00-00', 'USA'),
(8, 'Gasmann', 'Vittorio', '1922-09-01', 'Genova'),
(9, 'Momo', 'Alessandro', '0000-00-00', 'Italia'),
(10, 'Giannini', 'Giancarlo', '0000-00-00', 'Genova'),
(11, 'Rey', 'Fernando', '0000-00-00', 'un luogo'),
(12, 'Fiore', 'Elena', '0000-00-00', 'Italia'),
(13, 'Melato', 'Mariangela', '0000-00-00', 'Milano'),
(14, 'Mastroianni', 'Marcello', '0000-00-00', 'Roma'),
(15, 'Totò', 'Totò', '0000-00-00', 'Napoli'),
(16, 'Sordi', 'Alberto', '0000-00-00', 'Roma'),
(17, 'Berg', 'Caroline', '0000-00-00', 'un luogo');

-- --------------------------------------------------------

--
-- Struttura della tabella `film`
--

CREATE TABLE `film` (
  `idfilm` int(10) NOT NULL,
  `titolo` varchar(1000) DEFAULT NULL,
  `anno` year(4) DEFAULT NULL,
  `nazionalita` varchar(25) DEFAULT NULL,
  `lingua` varchar(50) DEFAULT NULL,
  `codicer` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `film`
--

INSERT INTO `film` (`idfilm`, `titolo`, `anno`, `nazionalita`, `lingua`, `codicer`) VALUES
(1, 'The Cobweb', 1955, 'USA', NULL, 5),
(2, 'Poveri ma belli', 1957, 'Italia', NULL, 2),
(3, 'La ciociara', 1989, 'Italia', NULL, 2),
(4, 'Profumo di donna', 1974, 'Italia', NULL, 2),
(5, 'Pasqualino Settebellezze', 1975, 'Italia', NULL, 3),
(6, 'travolti da un insolito destino nell\'azzurro mare di agosto', 1974, 'Italia', NULL, 3),
(7, 'I soliti ignoti', 1958, 'Italia', NULL, 4),
(8, 'Il marchese del Grillo', 1981, 'Italia', NULL, 4);

-- --------------------------------------------------------

--
-- Struttura della tabella `recensioni`
--

CREATE TABLE `recensioni` (
  `id` int(11) NOT NULL,
  `voto` int(1) NOT NULL,
  `testo` text NOT NULL,
  `coduser` int(11) NOT NULL,
  `codfilm` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `recensioni`
--

INSERT INTO `recensioni` (`id`, `voto`, `testo`, `coduser`, `codfilm`) VALUES
(9, 5, 'wow!', 10, 3),
(37, 1, 'nah', 9, 3),
(38, 4, 'yoo', 9, 7),
(39, 3, 'carino', 11, 6),
(44, 2, 'yoo', 9, 1),
(46, 3, 'ez', 9, 4),
(62, 4, 'underrated', 15, 8),
(63, 3, 'yoo', 15, 3),
(65, 0, 'no scherzo', 16, 8),
(67, 0, 'ci ho ripensato. fa schifo', 17, 4),
(69, 2, 'ripensandoci... meh', 17, 1),
(70, 5, 'grande capolavoro!', 17, 7),
(72, 4, '1000010101', 17, 2),
(78, 5, 'che attenzione ai dettagli! se potessi darei 10', 17, 6);

-- --------------------------------------------------------

--
-- Struttura della tabella `recita`
--

CREATE TABLE `recita` (
  `idrecita` int(10) NOT NULL,
  `codfilm` int(10) NOT NULL,
  `codicea` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `recita`
--

INSERT INTO `recita` (`idrecita`, `codfilm`, `codicea`) VALUES
(1, 1, 2),
(2, 1, 1),
(3, 2, 4),
(4, 2, 5),
(5, 3, 6),
(6, 3, 7),
(7, 4, 8),
(8, 4, 9),
(9, 5, 10),
(10, 5, 11),
(11, 5, 12),
(12, 6, 10),
(13, 6, 13),
(14, 7, 8),
(15, 7, 14),
(16, 7, 15),
(17, 8, 16),
(18, 8, 17);

-- --------------------------------------------------------

--
-- Struttura della tabella `registi`
--

CREATE TABLE `registi` (
  `idregista` int(10) NOT NULL,
  `cognomer` varchar(25) DEFAULT NULL,
  `nomer` varchar(25) DEFAULT NULL,
  `datar` date DEFAULT NULL,
  `luogor` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `registi`
--

INSERT INTO `registi` (`idregista`, `cognomer`, `nomer`, `datar`, `luogor`) VALUES
(2, 'Risi', 'Dino', '0000-00-00', NULL),
(3, 'Wertmüller ', 'Lina', '0000-00-00', NULL),
(4, 'Monicelli', 'Mario', '0000-00-00', NULL),
(5, 'Minnelli', 'Vincent', '0000-00-00', NULL);

-- --------------------------------------------------------

--
-- Struttura della tabella `supporti`
--

CREATE TABLE `supporti` (
  `idsupporto` int(5) NOT NULL,
  `posizione` varchar(5) DEFAULT NULL,
  `codfilm` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `supporti`
--

INSERT INTO `supporti` (`idsupporto`, `posizione`, `codfilm`) VALUES
(1, 'abc00', 1),
(2, 'abc01', 1),
(3, 'abc02', 2),
(4, 'abc03', 2),
(5, 'abc04', 3),
(6, 'abc05', 3),
(7, 'abc06', 3),
(8, 'abc07', 4),
(9, 'abc08', 4),
(10, 'abc09', 5),
(11, 'abc10', 5),
(12, 'abc11', 5),
(13, 'abc12', 6),
(14, 'abc13', 6),
(15, 'abc14', 6),
(16, 'abc15', 7),
(17, 'abc16', 7),
(18, 'abc17', 7),
(19, 'abc18', 7),
(20, 'abc19', 8),
(21, 'abc20', 8);

-- --------------------------------------------------------

--
-- Struttura della tabella `users`
--

CREATE TABLE `users` (
  `iduser` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cognome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `pass` text NOT NULL,
  `indirizzo` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `users`
--

INSERT INTO `users` (`iduser`, `username`, `nome`, `cognome`, `email`, `pass`, `indirizzo`) VALUES
(9, '123', '123', '123', '123@12.3', '123', '123'),
(10, 'i', 'a', 'b', 'd@g.h', 'j', 'c'),
(11, 'pazzone', 'mr', 'pazzo', 'mrpazzo@itismateei.net', 'pazzo', 'mrpazz'),
(14, 'ezzzz', '123', '123', '123@1.1', 'ez', '123'),
(15, 'abc', 'a', 'b', 'd@e.f', 'def', 'c'),
(16, 'cr7', 'cristiano', 'ronaldo', 'cristiano.ronaldo@cr7.com', 'allah', 'isola privata'),
(17, 'spamton', 'spamton', 'spamton', 'napoli@gmail.com', 'ggg', 'napoli'),
(18, 'spamton', 'mario', 'rossi', 'a@b.c', 'allah', 'napoli');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `attori`
--
ALTER TABLE `attori`
  ADD PRIMARY KEY (`idattore`);

--
-- Indici per le tabelle `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`idfilm`),
  ADD KEY `codicer` (`codicer`);

--
-- Indici per le tabelle `recensioni`
--
ALTER TABLE `recensioni`
  ADD PRIMARY KEY (`id`),
  ADD KEY `_ID_account` (`coduser`),
  ADD KEY `_ID_film` (`codfilm`);

--
-- Indici per le tabelle `recita`
--
ALTER TABLE `recita`
  ADD PRIMARY KEY (`idrecita`),
  ADD KEY `codicea` (`codicea`),
  ADD KEY `codfilm` (`codfilm`);

--
-- Indici per le tabelle `registi`
--
ALTER TABLE `registi`
  ADD PRIMARY KEY (`idregista`);

--
-- Indici per le tabelle `supporti`
--
ALTER TABLE `supporti`
  ADD PRIMARY KEY (`idsupporto`),
  ADD KEY `codfilm` (`codfilm`);

--
-- Indici per le tabelle `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`iduser`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `recensioni`
--
ALTER TABLE `recensioni`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=79;
--
-- AUTO_INCREMENT per la tabella `users`
--
ALTER TABLE `users`
  MODIFY `iduser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `recensioni`
--
ALTER TABLE `recensioni`
  ADD CONSTRAINT `Review_ibfk_1` FOREIGN KEY (`coduser`) REFERENCES `users` (`iduser`),
  ADD CONSTRAINT `Review_ibfk_2` FOREIGN KEY (`codfilm`) REFERENCES `film` (`idfilm`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
