CREATE DATABASE analytics;
use analytics;

DROP TABLE event_category;
CREATE TABLE event_category(
`id` int not null AUTO_INCREMENT COMMENT 'ID',
`event_name` varchar(128) NOT null  COMMENT '事件名称',
`group_name` varchar(128) NOT null COMMENT '事件分组名称',
`category` int not null COMMENT '事件类型',
`alias` VARCHAR (128) COMMENT '别名',
`description` varchar(256)  comment '描述',
`created_time` TIMESTAMP  not null comment '记录生成时间',
primary key (id),
key idx_event_name(event_name),
key idx_description(description)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT  CHARSET=utf8 comment='事件描述表';

drop TABLE  event_mapping;
CREATE TABLE event_mapping(
`id` int not null AUTO_INCREMENT COMMENT 'ID',
`event_name` VARCHAR (128) not null COMMENT '事件名称',
`property` VARCHAR (128) not null COMMENT '原属性名称',
`mapping` VARCHAR(128) not null COMMENT '原属性映射到的字段',
`alias` VARCHAR (128) COMMENT '别名',
`description` VARCHAR(256) not null COMMENT '描述',
`created_time` TIMESTAMP  not null comment '记录生成时间',
primary key (id),
key idx_event_name(event_name),
key idx_preproty(property)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 comment='事件属性映射表';
drop table event_report;
CREATE TABLE event_report(
`id` bigint not null AUTO_INCREMENT COMMENT 'ID',
`event_name` varchar(128) not null COMMENT '事件名称',
`category` int not null COMMENT '事件类型',
`property` text COMMENT '日志属性',
`created_time` TIMESTAMP  COMMENT '客户端创建时间',
`user_id` VARCHAR(128)  COMMENT '用户ID',
`user_token` VARCHAR (1024)  COMMENT '用户标示',
`device_id` VARCHAR (256)   COMMENT '设备标示',
`platform` VARCHAR(64) COMMENT '平台',
`channel` VARCHAR (256) COMMENT '渠道',
`model` VARCHAR (64) COMMENT '设备型号',
`client_version` VARCHAR (32) COMMENT '客户端版本号',
`system_version` VARCHAR (32) COMMENT '客户端系统版本',
`url` VARCHAR (2048) COMMENT '当前链接',
`refererurl` VARCHAR (2048) COMMENT '引用链接',
`browser` VARCHAR (128) COMMENT '浏览器类型',
`useragent` VARCHAR (256) COMMENT '用户代理',
`system_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '系统创建日志时间',
`extra1` text COMMENT '附加映射用字段',
`extra2` text COMMENT '附加映射用字段',
`extra3` text COMMENT '附加映射用字段',
`extra4` text COMMENT '附加映射用字段',
`extra5` text COMMENT '附加映射用字段',
`extra6` text COMMENT '附加映射用字段',
`extra7` text COMMENT '附加映射用字段',
`extra8` text COMMENT '附加映射用字段',
`extra9` text COMMENT '附加映射用字段',
`extra10` text COMMENT '附加映射用字段',
`extra11` text COMMENT '附加映射用字段',
`extra12` text COMMENT '附加映射用字段',
`extra13` text COMMENT '附加映射用字段',
`extra14` text COMMENT '附加映射用字段',
`extra15` text COMMENT '附加映射用字段',
`extra16` text COMMENT '附加映射用字段',
`extra17` text COMMENT '附加映射用字段',
`extra18` text COMMENT '附加映射用字段',
`extra19` text COMMENT '附加映射用字段',
`extra20` text COMMENT '附加映射用字段',
primary key (id),
key idx_event_name(event_name),
key idx_device_id(device_id),
key idx_created_time(created_time),
key idx_system_time(system_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 comment='事件日志表';