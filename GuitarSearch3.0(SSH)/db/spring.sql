/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50629
Source Host           : localhost:3306
Source Database       : spring

Target Server Type    : MYSQL
Target Server Version : 50629
File Encoding         : 65001

Date: 2016-06-12 13:53:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `guitar_inf`
-- ----------------------------
DROP TABLE IF EXISTS `guitar_inf`;
CREATE TABLE `guitar_inf` (
  `guitar_id` int(11) NOT NULL AUTO_INCREMENT,
  `guitar_model` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `builder` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`guitar_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of guitar_inf
-- ----------------------------
INSERT INTO `guitar_inf` VALUES ('16', 'A1', '150', 'Apple');
INSERT INTO `guitar_inf` VALUES ('17', 'A2', '150', 'Apple');
INSERT INTO `guitar_inf` VALUES ('18', 'A3', '200', 'SAMSUNG');
INSERT INTO `guitar_inf` VALUES ('19', 'A4', '250', 'SAMSUNG');
INSERT INTO `guitar_inf` VALUES ('21', 'A5', '500', 'MI');
