/*
Navicat MySQL Data Transfer

Source Server         : 101.201.114.223
Source Server Version : 50620
Source Host           : 101.201.114.223:3306
Source Database       : jeesite

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2017-03-15 10:18:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_office`
-- ----------------------------
DROP TABLE IF EXISTS `sys_office`;
CREATE TABLE `sys_office` (
  `id` varchar(64) NOT NULL COMMENT '编号',
  `parent_id` varchar(64) NOT NULL COMMENT '父级编号',
  `parent_ids` varchar(2000) NOT NULL COMMENT '所有父级编号',
  `name` varchar(100) NOT NULL COMMENT '名称',
  `sort` decimal(10,0) NOT NULL COMMENT '排序',
  `area_id` varchar(64) NOT NULL COMMENT '归属区域',
  `code` varchar(100) DEFAULT NULL COMMENT '区域编码',
  `type` char(1) NOT NULL COMMENT '机构类型',
  `grade` char(1) NOT NULL COMMENT '机构等级',
  `address` varchar(255) DEFAULT NULL COMMENT '联系地址',
  `zip_code` varchar(100) DEFAULT NULL COMMENT '邮政编码',
  `master` varchar(100) DEFAULT NULL COMMENT '负责人',
  `phone` varchar(200) DEFAULT NULL COMMENT '电话',
  `fax` varchar(200) DEFAULT NULL COMMENT '传真',
  `email` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `USEABLE` varchar(64) DEFAULT NULL COMMENT '是否启用',
  `PRIMARY_PERSON` varchar(64) DEFAULT NULL COMMENT '主负责人',
  `DEPUTY_PERSON` varchar(64) DEFAULT NULL COMMENT '副负责人',
  `create_by` varchar(64) NOT NULL COMMENT '创建者',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_by` varchar(64) NOT NULL COMMENT '更新者',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`),
  KEY `sys_office_parent_id` (`parent_id`),
  KEY `sys_office_del_flag` (`del_flag`),
  KEY `sys_office_type` (`type`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='机构表';

-- ----------------------------
-- Records of sys_office
-- ----------------------------
INSERT INTO `sys_office` VALUES ('1', '0', '0,', '北京总公司', '10', '110100', '100000', '1', '1', '', '', '', '', '', '', '1', '', '', '1', '2013-05-27 00:00:00', '1', '2017-01-04 17:26:14', '', '0');
INSERT INTO `sys_office` VALUES ('10', '7', '0,1,7,', '市场部', '30', '3', '200003', '2', '2', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('11', '7', '0,1,7,', '技术部', '40', '3', '200004', '2', '2', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('12', '7', '0,1,7,', '历城区分公司', '0', '4', '201000', '1', '3', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('13', '12', '0,1,7,12,', '公司领导', '10', '4', '201001', '2', '3', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('14', '12', '0,1,7,12,', '综合部', '20', '4', '201002', '2', '3', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('15', '12', '0,1,7,12,', '市场部', '30', '4', '201003', '2', '3', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('16', '12', '0,1,7,12,', '技术部', '40', '4', '201004', '2', '3', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('17', '7', '0,1,7,', '历下区分公司', '40', '5', '201010', '1', '3', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('18', '17', '0,1,7,17,', '公司领导', '10', '5', '201011', '2', '3', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('19', '17', '0,1,7,17,', '综合部', '20', '5', '201012', '2', '3', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('2', '1', '0,1,', '公司领导', '10', '2', '100001', '2', '1', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_office` VALUES ('20', '17', '0,1,7,17,', '市场部', '30', '5', '201013', '2', '3', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('21', '17', '0,1,7,17,', '技术部', '40', '5', '201014', '2', '3', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('22', '7', '0,1,7,', '高新区分公司', '50', '6', '201010', '1', '3', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('23', '22', '0,1,7,22,', '公司领导', '10', '6', '201011', '2', '3', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('24', '22', '0,1,7,22,', '综合部', '20', '6', '201012', '2', '3', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('25', '22', '0,1,7,22,', '市场部', '30', '6', '201013', '2', '3', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('26', '22', '0,1,7,22,', '技术部', '40', '6', '201014', '2', '3', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('3', '1', '0,1,', '综合部', '20', '2', '100002', '2', '1', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_office` VALUES ('4', '1', '0,1,', '市场部', '30', '2', '100003', '2', '1', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_office` VALUES ('5', '1', '0,1,', '技术部', '40', '2', '100004', '2', '1', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_office` VALUES ('6', '1', '0,1,', '研发部', '50', '2', '100005', '2', '1', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_office` VALUES ('7', '1', '0,1,', '济南市分公司', '20', '3', '200000', '1', '2', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('8', '7', '0,1,7,', '公司领导', '10', '3', '200001', '2', '2', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_office` VALUES ('9', '7', '0,1,7,', '综合部', '20', '3', '200002', '2', '2', '', '', '', '', '', '', '1', null, null, '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
