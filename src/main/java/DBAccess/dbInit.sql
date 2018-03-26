CREATE DATABASE  IF NOT EXISTS `useradmin`;


USE `useradmin`;
DROP TABLE IF EXISTS `order`;
DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(90) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(20) NOT NULL DEFAULT 'customer',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

CREATE TABLE `order`(
`order_id` int(11) NOT NULL AUTO_INCREMENT,
`length` int(11) NOT NULL,
`width` int(11) NOT NULL,
`hight` int(11) NOT NULL,
`fourblock` int(11) NOT NULL,
`twoblock` int(11) NOT NULL,
`oneblock` int(11) NOT NULL,
`user_id` int(11) NOT NULL,
`status` int(11) NOT NULL,
PRIMARY KEY (`order_id`),
FOREIGN KEY (`user_id`) REFERENCES `user`(`user_id`)
)ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

LOCK TABLES `user` WRITE;
INSERT INTO `user` VALUES 
(1,'jens@somewhere.com','jensen','customer'),
(2,'ken@somewhere.com','kensen','customer'),
(3,'robin@somewhere.com','batman','employee');
LOCK TABLES `order` WRITE;
INSERT INTO `order` VALUES
(1,4,4,1,2,2,0,1,0);
UNLOCK TABLES;

