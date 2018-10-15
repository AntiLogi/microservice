/*
Navicat MySQL Data Transfer

Source Server         : cxb
Source Server Version : 50617
Source Host           : 127.0.0.1:3306
Source Database       : micro

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2018-10-15 17:27:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `balance` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', 'account1', '20', '180.00');
INSERT INTO `user` VALUES ('2', '李四', 'account2', '26', '300.00');
INSERT INTO `user` VALUES ('3', '王五', 'account3', '30', '500.00');
