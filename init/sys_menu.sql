/*
Navicat MySQL Data Transfer

Source Server         : 101.201.114.223
Source Server Version : 50620
Source Host           : 101.201.114.223:3306
Source Database       : jeesite

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2017-03-15 10:17:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` varchar(64) NOT NULL COMMENT '编号',
  `parent_id` varchar(64) NOT NULL COMMENT '父级编号',
  `parent_ids` varchar(2000) NOT NULL COMMENT '所有父级编号',
  `name` varchar(100) NOT NULL COMMENT '名称',
  `sort` decimal(10,0) NOT NULL COMMENT '排序',
  `href` varchar(2000) DEFAULT NULL COMMENT '链接',
  `target` varchar(20) DEFAULT NULL COMMENT '目标',
  `icon` varchar(100) DEFAULT NULL COMMENT '图标',
  `is_show` char(1) NOT NULL COMMENT '是否在菜单中显示',
  `permission` varchar(200) DEFAULT NULL COMMENT '权限标识',
  `create_by` varchar(64) NOT NULL COMMENT '创建者',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_by` varchar(64) NOT NULL COMMENT '更新者',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`),
  KEY `sys_menu_parent_id` (`parent_id`),
  KEY `sys_menu_del_flag` (`del_flag`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='菜单表';

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('08344aaeb5594684b437992ae91d4bcf', 'ec8e3cfa1d4d4a2e921b383377149b18', '0,1,ec8e3cfa1d4d4a2e921b383377149b18,', '测试1', '30', 'www.baidu.com', '', '', '1', 'sys:office:view', '1', '2016-03-15 19:37:18', '1', '2016-03-15 19:37:18', '', '1');
INSERT INTO `sys_menu` VALUES ('1', '0', '0,', '功能菜单', '0', '', '', '', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('10', '3', '0,1,2,3,', '字典管理', '60', '/sys/dict/', '', 'th-list', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('11', '10', '0,1,2,3,10,', '查看', '30', '', '', '', '0', 'sys:dict:view', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('12', '10', '0,1,2,3,10,', '修改', '40', '', '', '', '0', 'sys:dict:edit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('13', '2', '0,1,2,', '机构用户', '970', '', '', '', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('14', '13', '0,1,2,13,', '区域管理', '50', '/sys/area/', '', 'th', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('15', '14', '0,1,2,13,14,', '查看', '30', '', '', '', '0', 'sys:area:view', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('16', '14', '0,1,2,13,14,', '修改', '40', '', '', '', '0', 'sys:area:edit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('17', '13', '0,1,2,13,', '机构管理', '40', '/sys/office/', '', 'th-large', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('18', '17', '0,1,2,13,17,', '查看', '30', '', '', '', '0', 'sys:office:view', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('19', '17', '0,1,2,13,17,', '修改', '40', '', '', '', '0', 'sys:office:edit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('2', '1', '0,1,', '系统设置', '900', '', '', '', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('20', '13', '0,1,2,13,', '用户管理', '30', '/sys/user/index', '', 'user', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('21', '20', '0,1,2,13,20,', '查看', '30', '', '', '', '0', 'sys:user:view', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('22', '20', '0,1,2,13,20,', '修改', '40', '', '', '', '0', 'sys:user:edit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('23', '2', '0,1,2,', '关于帮助', '990', '', '', '', '0', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('24', '23', '0,1,2,23', '官方首页', '30', 'http://jeesite.com', '_blank', '', '0', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('25', '23', '0,1,2,23', '项目支持', '50', 'http://jeesite.com/donation.html', '_blank', '', '0', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('26', '23', '0,1,2,23', '论坛交流', '80', 'http://bbs.jeesite.com', '_blank', '', '0', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('27', '1', '0,1,', '我的面板', '100', '', '', '', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('28', '27', '0,1,27,', '个人信息', '30', '', '', '', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('29', '28', '0,1,27,28,', '个人信息', '30', '/sys/user/info', '', 'user', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('3', '2', '0,1,2,', '系统设置', '980', '', '', '', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('30', '28', '0,1,27,28,', '修改密码', '40', '/sys/user/modifyPwd', '', 'lock', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('31', '1', '0,1,', '内容管理', '500', '', '', '', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('32', '31', '0,1,31,', '栏目设置', '990', '', '', '', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('33', '32', '0,1,31,32', '栏目管理', '30', '/cms/category/', '', 'align-justify', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('34', '33', '0,1,31,32,33,', '查看', '30', '', '', '', '0', 'cms:category:view', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('35', '33', '0,1,31,32,33,', '修改', '40', '', '', '', '0', 'cms:category:edit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('36', '32', '0,1,31,32', '站点设置', '40', '/cms/site/', '', 'certificate', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('37', '36', '0,1,31,32,36,', '查看', '30', '', '', '', '0', 'cms:site:view', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('38', '36', '0,1,31,32,36,', '修改', '40', '', '', '', '0', 'cms:site:edit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('39', '32', '0,1,31,32', '切换站点', '50', '/cms/site/select', '', 'retweet', '1', 'cms:site:select', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('4', '3', '0,1,2,3,', '菜单管理', '30', '/sys/menu/', '', 'list-alt', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('40', '31', '0,1,31,', '内容管理', '500', '', '', '', '1', 'cms:view', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('41', '40', '0,1,31,40,', '内容发布', '30', '/cms/', '', 'briefcase', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('42', '41', '0,1,31,40,41,', '文章模型', '40', '/cms/article/', '', 'file', '0', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('43', '42', '0,1,31,40,41,42,', '查看', '30', '', '', '', '0', 'cms:article:view', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('44', '42', '0,1,31,40,41,42,', '修改', '40', '', '', '', '0', 'cms:article:edit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('45', '42', '0,1,31,40,41,42,', '审核', '50', '', '', '', '0', 'cms:article:audit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('46', '41', '0,1,31,40,41,', '链接模型', '60', '/cms/link/', '', 'random', '0', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('47', '46', '0,1,31,40,41,46,', '查看', '30', '', '', '', '0', 'cms:link:view', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('48', '46', '0,1,31,40,41,46,', '修改', '40', '', '', '', '0', 'cms:link:edit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('49', '46', '0,1,31,40,41,46,', '审核', '50', '', '', '', '0', 'cms:link:audit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('5', '4', '0,1,2,3,4,', '查看', '30', '', '', '', '0', 'sys:menu:view', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('50', '40', '0,1,31,40,', '评论管理', '40', '/cms/comment/?status=2', '', 'comment', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('51', '50', '0,1,31,40,50,', '查看', '30', '', '', '', '0', 'cms:comment:view', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('52', '50', '0,1,31,40,50,', '审核', '40', '', '', '', '0', 'cms:comment:edit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('53', '40', '0,1,31,40,', '公共留言', '80', '/cms/guestbook/?status=2', '', 'glass', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('54', '53', '0,1,31,40,53,', '查看', '30', '', '', '', '0', 'cms:guestbook:view', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('55', '53', '0,1,31,40,53,', '审核', '40', '', '', '', '0', 'cms:guestbook:edit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('56', '71', '0,1,27,71,', '文件管理', '90', '/../static/ckfinder/ckfinder.html', '', 'folder-open', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('57', '56', '0,1,27,40,56,', '查看', '30', '', '', '', '0', 'cms:ckfinder:view', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('58', '56', '0,1,27,40,56,', '上传', '40', '', '', '', '0', 'cms:ckfinder:upload', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('59', '56', '0,1,27,40,56,', '修改', '50', '', '', '', '0', 'cms:ckfinder:edit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('6', '4', '0,1,2,3,4,', '修改', '40', '', '', '', '0', 'sys:menu:edit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('60', '31', '0,1,31,', '统计分析', '600', '', '', '', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('61', '60', '0,1,31,60,', '信息量统计', '30', '/cms/stats/article', '', 'tasks', '1', 'cms:stats:article', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('62', '1', '0,1,', '在线办公', '200', '', '', '', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('63', '62', '0,1,62,', '个人办公', '30', '', '', '', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('64', '63', '0,1,62,63,', '请假办理', '300', '/oa/leave', '', 'leaf', '0', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('65', '64', '0,1,62,63,64,', '查看', '30', '', '', '', '0', 'oa:leave:view', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('66', '64', '0,1,62,63,64,', '修改', '40', '', '', '', '0', 'oa:leave:edit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('67', '2', '0,1,2,', '日志查询', '985', '', '', '', '1', '', '1', '2013-06-03 00:00:00', '1', '2013-06-03 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('68', '67', '0,1,2,67,', '日志查询', '30', '/sys/log', '', 'pencil', '1', 'sys:log:view', '1', '2013-06-03 00:00:00', '1', '2013-06-03 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('69', '62', '0,1,62,', '流程管理', '300', '', '', '', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('7', '3', '0,1,2,3,', '角色管理', '50', '/sys/role/', '', 'lock', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('70', '69', '0,1,62,69,', '流程管理', '50', '/act/process', '', 'road', '1', 'act:process:edit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('71', '27', '0,1,27,', '文件管理', '90', '', '', '', '1', '', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('72', '69', '0,1,62,69,', '模型管理', '100', '/act/model', '', 'road', '1', 'act:model:edit', '1', '2013-09-20 00:00:00', '1', '2013-09-20 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('73', '63', '0,1,62,63,', '我的任务', '50', '/act/task/todo/', '', 'tasks', '1', '', '1', '2013-09-24 00:00:00', '1', '2013-09-24 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('74', '63', '0,1,62,63,', '审批测试', '100', '/oa/testAudit', '', '', '1', 'oa:testAudit:view,oa:testAudit:edit', '1', '2013-09-24 00:00:00', '1', '2013-09-24 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('75', '1', '0,1,', '在线演示', '3000', '', '', '', '1', '', '1', '2013-10-08 00:00:00', '1', '2013-10-08 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('79', '1', '0,1,', '代码生成', '5000', '', '', '', '1', '', '1', '2013-10-16 00:00:00', '1', '2013-10-16 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('8', '7', '0,1,2,3,7,', '查看', '30', '', '', '', '0', 'sys:role:view', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('80', '79', '0,1,79,', '代码生成', '50', '', '', '', '1', '', '1', '2013-10-16 00:00:00', '1', '2013-10-16 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('81', '80', '0,1,79,80,', '生成方案配置', '30', '/gen/genScheme', '', '', '1', 'gen:genScheme:view,gen:genScheme:edit', '1', '2013-10-16 00:00:00', '1', '2013-10-16 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('82', '80', '0,1,79,80,', '业务表配置', '20', '/gen/genTable', '', '', '1', 'gen:genTable:view,gen:genTable:edit,gen:genTableColumn:view,gen:genTableColumn:edit', '1', '2013-10-16 00:00:00', '1', '2013-10-16 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('83', '80', '0,1,79,80,', '代码模板管理', '90', '/gen/genTemplate', '', '', '1', 'gen:genTemplate:view,gen:genTemplate:edit', '1', '2013-10-16 00:00:00', '1', '2013-10-16 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('84', '67', '0,1,2,67,', '连接池监视', '40', '/../druid', '', '', '1', '', '1', '2013-10-18 00:00:00', '1', '2013-10-18 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('85', '76', '0,1,75,76,', '行政区域', '80', '/../static/map/map-city.html', '', '', '1', '', '1', '2013-10-22 00:00:00', '1', '2013-10-22 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('86', '75', '0,1,75,', '组件演示', '50', '', '', '', '1', '', '1', '2013-10-22 00:00:00', '1', '2013-10-22 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('87', '86', '0,1,75,86,', '组件演示', '30', '/test/test/form', '', '', '1', 'test:test:view,test:test:edit', '1', '2013-10-22 00:00:00', '1', '2013-10-22 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('88', '62', '0,1,62,', '通知通告', '20', '', '', '', '1', '', '1', '2013-11-08 00:00:00', '1', '2013-11-08 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('89', '88', '0,1,62,88,', '我的通告', '30', '/oa/oaNotify/self', '', '', '1', '', '1', '2013-11-08 00:00:00', '1', '2013-11-08 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('9', '7', '0,1,2,3,7,', '修改', '40', '', '', '', '0', 'sys:role:edit', '1', '2013-05-27 00:00:00', '1', '2013-05-27 00:00:00', '', '0');
INSERT INTO `sys_menu` VALUES ('90', '88', '0,1,62,88,', '通告管理', '50', '/oa/oaNotify', '', '', '1', 'oa:oaNotify:view,oa:oaNotify:edit', '1', '2013-11-08 00:00:00', '1', '2013-11-08 00:00:00', '', '1');
INSERT INTO `sys_menu` VALUES ('ec8e3cfa1d4d4a2e921b383377149b18', '1', '0,1,', '测试功能', '5030', '', '', '', '1', 'sys:office:view', '1', '2016-03-15 19:36:35', '1', '2016-03-15 19:36:35', '', '1');
INSERT INTO `sys_menu` VALUES ('6c663171bd114d7b8b7c4cf335e90250', '1', '0,1,', '数据导入', '5060', '', '', '', '1', '', '1', '2016-12-31 19:52:42', '1', '2016-12-31 19:52:42', '', '0');
INSERT INTO `sys_menu` VALUES ('108566a9e5524092badf2d2216df9203', '6c663171bd114d7b8b7c4cf335e90250', '0,1,6c663171bd114d7b8b7c4cf335e90250,', '报道库导入', '30', '', '', '', '1', '', '1', '2016-12-31 19:53:11', '1', '2016-12-31 19:53:11', '', '0');
INSERT INTO `sys_menu` VALUES ('1068d2afd6174b1099bae785f9a21f79', '108566a9e5524092badf2d2216df9203', '0,1,6c663171bd114d7b8b7c4cf335e90250,108566a9e5524092badf2d2216df9203,', '导入', '30', '/gov/govOpinion/dataImport', '', '', '1', 'gov:govOpinion:edit,gov:govOpinion:view', '1', '2016-12-31 19:54:42', '1', '2016-12-31 19:54:42', '', '0');
INSERT INTO `sys_menu` VALUES ('5ba13076370a452baa7e8c18e763f9fd', '1', '0,1,', '案例库配置', '5090', '', '', '', '1', '', '1', '2016-12-31 19:59:31', '1', '2017-01-02 19:57:29', '', '0');
INSERT INTO `sys_menu` VALUES ('1efdfb6983cf4a49b7aed95d8b60303c', '5ba13076370a452baa7e8c18e763f9fd', '0,1,5ba13076370a452baa7e8c18e763f9fd,', '案例库类别', '30', '', '', '', '1', '', '1', '2016-12-31 19:59:50', '1', '2016-12-31 19:59:50', '', '0');
INSERT INTO `sys_menu` VALUES ('de3034ee2f284e96bac957a85103f024', '5ba13076370a452baa7e8c18e763f9fd', '0,1,5ba13076370a452baa7e8c18e763f9fd,', '轮播图管理', '60', '', '', '', '1', '', '1', '2016-12-31 20:00:09', '1', '2016-12-31 20:00:09', '', '0');
INSERT INTO `sys_menu` VALUES ('8b9b25bb7873482ba295168c3d1285a9', '1efdfb6983cf4a49b7aed95d8b60303c', '0,1,5ba13076370a452baa7e8c18e763f9fd,1efdfb6983cf4a49b7aed95d8b60303c,', '类别管理', '30', '/ct/ctCategory', '', '', '1', 'ct:ctCategory:view,ct:ctCategory:edit', '1', '2016-12-31 20:00:38', '1', '2016-12-31 20:03:01', '', '0');
INSERT INTO `sys_menu` VALUES ('fa78afc4e0184279952fcc1b920da80f', '6c663171bd114d7b8b7c4cf335e90250', '0,1,6c663171bd114d7b8b7c4cf335e90250,', '外语案例库', '60', '', '', '', '1', '', '1', '2017-01-01 15:20:59', '1', '2017-01-01 15:21:18', '', '0');
INSERT INTO `sys_menu` VALUES ('72dfff8bdf5841819a3a56ab660d2e05', 'fa78afc4e0184279952fcc1b920da80f', '0,1,6c663171bd114d7b8b7c4cf335e90250,fa78afc4e0184279952fcc1b920da80f,', '外语案例库导入', '30', '/lg/lgForeign/dataImport', '', '', '1', 'lg:lgForeign:edit,lg:lgForeign:view', '1', '2017-01-01 15:23:15', '1', '2017-01-01 15:23:15', '', '0');
INSERT INTO `sys_menu` VALUES ('c6de105578d842b28e17d30de3476512', '6c663171bd114d7b8b7c4cf335e90250', '0,1,6c663171bd114d7b8b7c4cf335e90250,', '简历库', '90', '', '', '', '1', '', '1', '2017-01-01 15:52:24', '1', '2017-01-01 15:52:24', '', '0');
INSERT INTO `sys_menu` VALUES ('edd24cef58cf4980919584fd5f8dae17', 'c6de105578d842b28e17d30de3476512', '0,1,6c663171bd114d7b8b7c4cf335e90250,c6de105578d842b28e17d30de3476512,', '简历库导入', '30', '/pf/pfResume/dataImport', '', '', '1', 'pf:pfResume:view,pf:pfResume:edit', '1', '2017-01-01 15:53:38', '1', '2017-01-01 15:53:38', '', '0');
INSERT INTO `sys_menu` VALUES ('544efd9c1ed94ed39e0f44d6da9a628e', '6c663171bd114d7b8b7c4cf335e90250', '0,1,6c663171bd114d7b8b7c4cf335e90250,', '政府公报', '120', '', '', '', '1', '', '1', '2017-01-01 22:18:48', '1', '2017-01-01 22:18:48', '', '0');
INSERT INTO `sys_menu` VALUES ('a49d20fde0ea42d280cba719b3f10abd', '544efd9c1ed94ed39e0f44d6da9a628e', '0,1,6c663171bd114d7b8b7c4cf335e90250,544efd9c1ed94ed39e0f44d6da9a628e,', '政府公报导入', '30', '/gov/govGazette/dataImport', '', '', '1', 'gov:govGazette:edit,gov:govGazette:view', '1', '2017-01-01 22:19:42', '1', '2017-01-01 22:19:42', '', '0');
INSERT INTO `sys_menu` VALUES ('8bb87bb4cd54436d8ce094fac37cd3c2', '6c663171bd114d7b8b7c4cf335e90250', '0,1,6c663171bd114d7b8b7c4cf335e90250,', '反腐倡廉分析', '150', '', '', '', '1', '', '1', '2017-01-02 11:57:55', '1', '2017-01-02 11:57:55', '', '0');
INSERT INTO `sys_menu` VALUES ('9e04a261b9ad4cf3b55a0d37fd0140d9', '8bb87bb4cd54436d8ce094fac37cd3c2', '0,1,6c663171bd114d7b8b7c4cf335e90250,8bb87bb4cd54436d8ce094fac37cd3c2,', '导入', '30', '/ac/acAnalysis/dataImport', '', '', '1', 'ac:acAnalysis:edit,ac:acAnalysis:view', '1', '2017-01-02 11:59:12', '1', '2017-01-02 11:59:12', '', '0');
INSERT INTO `sys_menu` VALUES ('79deedf89a3d4cc592315400cfe0845d', 'de3034ee2f284e96bac957a85103f024', '0,1,5ba13076370a452baa7e8c18e763f9fd,de3034ee2f284e96bac957a85103f024,', '轮播图', '30', '/ct/ctBanner', '', '', '1', 'ct:ctBanner:view,ct:ctBanner:edit', '1', '2017-01-02 19:40:11', '1', '2017-01-02 19:42:59', '', '0');
INSERT INTO `sys_menu` VALUES ('2bcbd12aabfd4fe78f7c60eb37b7d742', '1', '0,1,', '案例库', '5120', '', '', '', '1', '', '1', '2017-01-02 19:58:28', '1', '2017-01-02 19:58:28', '', '0');
INSERT INTO `sys_menu` VALUES ('e3d94a19b59547c5b45662340f16d231', '2bcbd12aabfd4fe78f7c60eb37b7d742', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,', '政务文献库', '30', '', '', '', '1', '', '1', '2017-01-02 19:58:48', '1', '2017-01-02 19:58:48', '', '0');
INSERT INTO `sys_menu` VALUES ('5606a09106264fefb11f6aa36b49df05', 'e3d94a19b59547c5b45662340f16d231', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,e3d94a19b59547c5b45662340f16d231,', '简历库', '30', '/pf/pfResume', '', '', '1', 'pf:pfResume:view,pf:pfResume:edit', '1', '2017-01-02 19:59:38', '1', '2017-01-02 19:59:38', '', '0');
INSERT INTO `sys_menu` VALUES ('ae9e64b40bd541ebb6bb1c5d8d213324', 'e3d94a19b59547c5b45662340f16d231', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,e3d94a19b59547c5b45662340f16d231,', '公务员库', '60', '/gov/govOpinion?categoryPid=1', '', '', '1', 'gov:govOpinion:edit,gov:govOpinion:view', '1', '2017-01-02 20:55:52', '1', '2017-01-09 12:46:45', '', '0');
INSERT INTO `sys_menu` VALUES ('3bb8b931c4be4f919bced31c55d09473', '2bcbd12aabfd4fe78f7c60eb37b7d742', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,', '司法案例库', '60', '', '', '', '1', '', '1', '2017-01-03 22:54:13', '1', '2017-01-03 22:54:13', '', '0');
INSERT INTO `sys_menu` VALUES ('d6596628a2f2411f846b753bf10c8652', '3bb8b931c4be4f919bced31c55d09473', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,3bb8b931c4be4f919bced31c55d09473,', '司法案例', '30', '/gov/govOpinion?categoryPid=29', '', '', '1', 'gov:govOpinion:view,gov:govOpinion:edit', '1', '2017-01-03 22:55:30', '1', '2017-01-09 12:47:40', '', '0');
INSERT INTO `sys_menu` VALUES ('e213eed934b1425ba9abc42ec74d895f', '2bcbd12aabfd4fe78f7c60eb37b7d742', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,', '政务舆情库', '90', '', '', '', '1', '', '1', '2017-01-03 22:58:02', '1', '2017-01-03 22:58:02', '', '0');
INSERT INTO `sys_menu` VALUES ('9be544c279694669b8608ec03bec2734', 'e213eed934b1425ba9abc42ec74d895f', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,e213eed934b1425ba9abc42ec74d895f,', '舆情案例', '30', '/gov/govOpinion?categoryPid=38', '', '', '1', 'gov:govOpinion:view,gov:govOpinion:edit', '1', '2017-01-03 22:58:56', '1', '2017-01-09 12:48:00', '', '0');
INSERT INTO `sys_menu` VALUES ('450fa4c936054f8cb44dd65dd6f7b9a1', '2bcbd12aabfd4fe78f7c60eb37b7d742', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,', '决策案例库', '120', '', '', '', '1', '', '1', '2017-01-03 22:59:45', '1', '2017-01-03 22:59:45', '', '0');
INSERT INTO `sys_menu` VALUES ('0d44dee2ed4644a28d5e27bf0f63c6ea', '450fa4c936054f8cb44dd65dd6f7b9a1', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,450fa4c936054f8cb44dd65dd6f7b9a1,', '决策案例', '30', '/gov/govOpinion?categoryPid=52', '', '', '1', 'gov:govOpinion:view,gov:govOpinion:edit', '1', '2017-01-03 23:00:36', '1', '2017-01-09 12:48:39', '', '0');
INSERT INTO `sys_menu` VALUES ('0bf9909c855b4dfeaf8f83da98b35ce7', '2bcbd12aabfd4fe78f7c60eb37b7d742', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,', '反腐倡廉', '150', '', '', '', '1', '', '1', '2017-01-03 23:02:05', '1', '2017-01-03 23:02:05', '', '0');
INSERT INTO `sys_menu` VALUES ('b70733429f78452898448007926d301a', '0bf9909c855b4dfeaf8f83da98b35ce7', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,0bf9909c855b4dfeaf8f83da98b35ce7,', '反腐倡廉案例库', '30', '/gov/govOpinion?categoryPid=49', '', '', '1', 'gov:govOpinion:view,gov:govOpinion:edit', '1', '2017-01-03 23:02:58', '1', '2017-01-09 12:47:11', '', '0');
INSERT INTO `sys_menu` VALUES ('ae175519e4624455bf63242176ba467c', '0bf9909c855b4dfeaf8f83da98b35ce7', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,0bf9909c855b4dfeaf8f83da98b35ce7,', '反腐倡廉分析', '60', '/ac/acAnalysis', '', '', '1', 'ac:acAnalysis:view,ac:acAnalysis:edit', '1', '2017-01-03 23:03:50', '1', '2017-01-03 23:03:50', '', '0');
INSERT INTO `sys_menu` VALUES ('5d43b69f1f9042d3bf8a2998e74159a2', '4636ab4a0e70405a91eafe820ac07c65', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,4636ab4a0e70405a91eafe820ac07c65,', '外语案例库', '180', '/lg/lgForeign', '', '', '1', 'lg:lgForeign:view,lg:lgForeign:edit', '1', '2017-01-03 23:06:15', '1', '2017-01-03 23:07:37', '', '0');
INSERT INTO `sys_menu` VALUES ('4636ab4a0e70405a91eafe820ac07c65', '2bcbd12aabfd4fe78f7c60eb37b7d742', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,', '外语案例', '210', '', '', '', '1', '', '1', '2017-01-03 23:07:19', '1', '2017-01-03 23:07:19', '', '0');
INSERT INTO `sys_menu` VALUES ('0758f2dd0f8f43719e16de290a3671f4', '2bcbd12aabfd4fe78f7c60eb37b7d742', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,', '政情案例库', '240', '', '', '', '1', '', '1', '2017-01-03 23:22:50', '1', '2017-01-03 23:22:50', '', '0');
INSERT INTO `sys_menu` VALUES ('7e79829ffc10488594cefcfa10a19d33', '0758f2dd0f8f43719e16de290a3671f4', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,0758f2dd0f8f43719e16de290a3671f4,', '政情数据库', '30', '/geo/geoIntro', '', '', '1', 'geo:geoIntro:view,geo:geoIntro:edit', '1', '2017-01-03 23:23:49', '1', '2017-01-09 19:57:18', '', '0');
INSERT INTO `sys_menu` VALUES ('a5110ab8994e4ae79beb845be128a18d', 'e3d94a19b59547c5b45662340f16d231', '0,1,2bcbd12aabfd4fe78f7c60eb37b7d742,e3d94a19b59547c5b45662340f16d231,', '政府公报', '90', '/gov/govGazette', '', '', '1', 'gov:govGazette:view,gov:govGazette:edit', '1', '2017-01-03 23:24:57', '1', '2017-01-03 23:24:57', '', '0');
INSERT INTO `sys_menu` VALUES ('a5bd82b59e8d43db9c0b0255645e330c', '5ba13076370a452baa7e8c18e763f9fd', '0,1,5ba13076370a452baa7e8c18e763f9fd,', '前台用户配置', '90', '', '', '', '1', '', '1', '2017-01-06 16:29:51', '1', '2017-01-06 16:29:51', '', '0');
INSERT INTO `sys_menu` VALUES ('c50a0123647c4902bec8c2650cd78eed', 'a5bd82b59e8d43db9c0b0255645e330c', '0,1,5ba13076370a452baa7e8c18e763f9fd,a5bd82b59e8d43db9c0b0255645e330c,', '前台用户管理', '30', '/user/frontUser', '', '', '1', 'user:frontUser:view,user:frontUser:edit', '1', '2017-01-06 16:30:31', '1', '2017-01-06 16:30:31', '', '0');
INSERT INTO `sys_menu` VALUES ('0966cc0efbf7453290f996c5f6e3b5e1', '6c663171bd114d7b8b7c4cf335e90250', '0,1,6c663171bd114d7b8b7c4cf335e90250,', '政情数据库', '180', '', '', '', '1', '', '1', '2017-01-12 16:06:36', '1', '2017-01-12 16:06:36', '', '0');
INSERT INTO `sys_menu` VALUES ('b658b44710554c3893bfada35ede47ea', '0966cc0efbf7453290f996c5f6e3b5e1', '0,1,6c663171bd114d7b8b7c4cf335e90250,0966cc0efbf7453290f996c5f6e3b5e1,', '政情数据库导入', '30', '/geo/geoIntro/dataImport', '', '', '1', 'geo:geoIntro:edit,geo:geoIntro:view', '1', '2017-01-12 16:08:26', '1', '2017-01-12 16:08:26', '', '0');
INSERT INTO `sys_menu` VALUES ('21bbc3d454494722a246f94c046fd097', '1', '0,1,', '后台统计', '5150', '', '', '', '1', '', '1', '2017-01-19 21:18:43', '1', '2017-01-19 21:18:43', '', '0');
INSERT INTO `sys_menu` VALUES ('ba05af3f5192496c8a76a8bc94120a24', '21bbc3d454494722a246f94c046fd097', '0,1,21bbc3d454494722a246f94c046fd097,', '下载量统计', '30', '', '', '', '1', '', '1', '2017-01-19 21:19:11', '1', '2017-01-19 21:19:11', '', '0');
INSERT INTO `sys_menu` VALUES ('d67588b9c12e46ca8343492ad085e4e2', 'ba05af3f5192496c8a76a8bc94120a24', '0,1,21bbc3d454494722a246f94c046fd097,ba05af3f5192496c8a76a8bc94120a24,', '用户下载量统计', '30', '/statistics/downloadList', '', '', '1', '', '1', '2017-01-19 21:19:58', '1', '2017-01-19 21:19:58', '', '0');
