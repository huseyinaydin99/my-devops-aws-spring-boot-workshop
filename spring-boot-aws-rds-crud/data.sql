CREATE DATABASE IF NOT EXISTS huseyinReisDB DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;

CREATE TABLE `huseyinReisDB`.`user` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME = 'huseyinReisDB';
SHOW DATABASES LIKE 'huseyinReisDB';
INSERT INTO `huseyinReisDB`.`user` (`id`, `name`) VALUES ('1', 'Haydar');
INSERT INTO `huseyinReisDB`.`user` (`id`, `name`) VALUES ('2', 'Yusuf');
INSERT INTO `huseyinReisDB`.`user` (`id`, `name`) VALUES ('3', 'Hasan');
SELECT * FROM huseyinReisDB.user;
