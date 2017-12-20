-- ----------------------------
-- Create girl
-- ----------------------------
DROP TABLE IF EXISTS `girl`;
CREATE TABLE `girl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `cup_size` varchar(1) DEFAULT NULL,
  `money` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of girl
-- ----------------------------
INSERT INTO `girl` VALUES ('1', '18', 'C', '0');
INSERT INTO `girl` VALUES ('2', '20', 'B', '0');
INSERT INTO `girl` VALUES ('3', '22', 'E', '0');
INSERT INTO `girl` VALUES ('4', '19', 'D', '0');
INSERT INTO `girl` VALUES ('5', '22', 'E', '0');
INSERT INTO `girl` VALUES ('7', '18', 'A', '0');
INSERT INTO `girl` VALUES ('8', '19', 'B', '0');
INSERT INTO `girl` VALUES ('9', '18', 'A', '0');
INSERT INTO `girl` VALUES ('10', '19', 'B', '0');
INSERT INTO `girl` VALUES ('11', '18', 'A', '0');
INSERT INTO `girl` VALUES ('12', '23', 'C', '0');
INSERT INTO `girl` VALUES ('13', '24', 'B', '0');
INSERT INTO `girl` VALUES ('14', '16', 'B', '0');
INSERT INTO `girl` VALUES ('15', '19', 'B', '0');
INSERT INTO `girl` VALUES ('16', '15', 'D', '12.2');
