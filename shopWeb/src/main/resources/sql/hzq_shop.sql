/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : hzq_shop

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2016-10-12 20:48:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `addr_id` bigint(12) NOT NULL,
  `cust_detail_id` bigint(12) DEFAULT NULL,
  `province` varchar(10) DEFAULT NULL,
  `city` varchar(10) DEFAULT NULL,
  `county` varchar(10) DEFAULT NULL,
  `detail_addr` varchar(50) DEFAULT NULL,
  `receipt_name` varchar(20) DEFAULT NULL,
  `receipt_tel` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`addr_id`),
  KEY `FK_Reference_8` (`cust_detail_id`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`cust_detail_id`) REFERENCES `cust_detail` (`cust_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address
-- ----------------------------

-- ----------------------------
-- Table structure for custs
-- ----------------------------
DROP TABLE IF EXISTS `custs`;
CREATE TABLE `custs` (
  `cust_id` bigint(12) NOT NULL,
  `cust_name` varchar(50) DEFAULT NULL,
  `cust_pass` varchar(50) DEFAULT NULL,
  `cust_role` varchar(50) DEFAULT NULL,
  `register_date` date DEFAULT NULL,
  `last_login_date` date DEFAULT NULL,
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of custs
-- ----------------------------
INSERT INTO `custs` VALUES ('1', 'admin', '21232f297a57a5a743894a0e4a801fc3', '12', null, null);

-- ----------------------------
-- Table structure for cust_detail
-- ----------------------------
DROP TABLE IF EXISTS `cust_detail`;
CREATE TABLE `cust_detail` (
  `cust_detail_id` bigint(12) NOT NULL,
  `cust_id` bigint(12) DEFAULT NULL,
  `cust_sstatus` varchar(6) DEFAULT NULL,
  `cust_pass_msg` varchar(50) DEFAULT NULL,
  `cust_pass_msg_answer` varchar(50) DEFAULT NULL,
  `cust_email` varchar(50) DEFAULT NULL,
  `cust_true_name` varchar(50) DEFAULT NULL,
  `cust_identity` varchar(18) DEFAULT NULL,
  `cust_tel` varchar(50) DEFAULT NULL,
  `cust_sex` char(2) DEFAULT NULL,
  `addr_id` bigint(12) DEFAULT NULL,
  `post_code` varchar(6) DEFAULT NULL,
  `vip_lever` int(2) DEFAULT NULL,
  PRIMARY KEY (`cust_detail_id`),
  KEY `FK_Reference_1` (`cust_id`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`cust_id`) REFERENCES `custs` (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cust_detail
-- ----------------------------

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `menu_id` bigint(12) NOT NULL,
  `menu_name` varchar(10) DEFAULT NULL,
  `menu_url` varchar(30) DEFAULT NULL,
  `parent_menu_id` bigint(12) DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `order_code` varchar(50) NOT NULL,
  `point_discount` float DEFAULT NULL,
  `order_date` date DEFAULT NULL,
  `cust_detail_id` bigint(12) DEFAULT NULL,
  `addr_id` bigint(12) DEFAULT NULL,
  PRIMARY KEY (`order_code`),
  KEY `FK_Reference_4` (`cust_detail_id`),
  KEY `FK_Reference_7` (`addr_id`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`cust_detail_id`) REFERENCES `cust_detail` (`cust_detail_id`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`addr_id`) REFERENCES `address` (`addr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------

-- ----------------------------
-- Table structure for order_items
-- ----------------------------
DROP TABLE IF EXISTS `order_items`;
CREATE TABLE `order_items` (
  `order_item_id` varchar(50) NOT NULL,
  `order_code` varchar(50) DEFAULT NULL,
  `prod_price` float DEFAULT NULL,
  `prod_vip_price` float DEFAULT NULL,
  `order_date` date DEFAULT NULL,
  `points` int(5) DEFAULT NULL,
  `prod_id` bigint(12) DEFAULT NULL,
  PRIMARY KEY (`order_item_id`),
  KEY `FK_Reference_3` (`order_code`),
  KEY `FK_Reference_5` (`prod_id`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`order_code`) REFERENCES `orders` (`order_code`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`prod_id`) REFERENCES `product_messg` (`prod_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_items
-- ----------------------------

-- ----------------------------
-- Table structure for product_messg
-- ----------------------------
DROP TABLE IF EXISTS `product_messg`;
CREATE TABLE `product_messg` (
  `prod_id` bigint(12) NOT NULL,
  `prod_name` varchar(50) DEFAULT NULL,
  `prod_status` varchar(50) DEFAULT NULL,
  `sort_id` bigint(12) DEFAULT NULL,
  `prod_publish_date` date DEFAULT NULL,
  `prod_photo_url` varchar(50) DEFAULT NULL,
  `prod_price` float DEFAULT NULL,
  `prod_vip_price` float DEFAULT NULL,
  `prod_num` int(11) DEFAULT NULL,
  `prod_unit` varchar(8) DEFAULT NULL,
  `prod_introduction` varchar(3000) DEFAULT NULL,
  `prod_start_sale` date DEFAULT NULL,
  `prod_stop_sale` date DEFAULT NULL,
  `prod_points` int(11) DEFAULT NULL,
  PRIMARY KEY (`prod_id`),
  KEY `FK_Reference_2` (`sort_id`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`sort_id`) REFERENCES `product_sort` (`sort_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_messg
-- ----------------------------

-- ----------------------------
-- Table structure for product_photos
-- ----------------------------
DROP TABLE IF EXISTS `product_photos`;
CREATE TABLE `product_photos` (
  `photo_id` bigint(12) NOT NULL,
  `photo_name` varchar(50) DEFAULT NULL,
  `photo_url` varchar(50) DEFAULT NULL,
  `prod_id` bigint(12) DEFAULT NULL,
  PRIMARY KEY (`photo_id`),
  KEY `FK_Reference_6` (`prod_id`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`prod_id`) REFERENCES `product_messg` (`prod_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_photos
-- ----------------------------

-- ----------------------------
-- Table structure for product_sort
-- ----------------------------
DROP TABLE IF EXISTS `product_sort`;
CREATE TABLE `product_sort` (
  `sort_id` bigint(12) NOT NULL,
  `sort_name` varchar(12) DEFAULT NULL,
  `sort_desc` varchar(50) DEFAULT NULL,
  `parent_id` bigint(12) DEFAULT NULL,
  PRIMARY KEY (`sort_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_sort
-- ----------------------------

-- ----------------------------
-- Table structure for shop_car
-- ----------------------------
DROP TABLE IF EXISTS `shop_car`;
CREATE TABLE `shop_car` (
  `cart_id` bigint(12) NOT NULL,
  `cust_detail_id` bigint(12) DEFAULT NULL,
  `prod_id` bigint(12) DEFAULT NULL,
  `num` int(2) DEFAULT NULL,
  `add_time` date DEFAULT NULL,
  PRIMARY KEY (`cart_id`),
  KEY `FK_Reference_9` (`cust_detail_id`),
  CONSTRAINT `FK_Reference_9` FOREIGN KEY (`cust_detail_id`) REFERENCES `cust_detail` (`cust_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shop_car
-- ----------------------------
