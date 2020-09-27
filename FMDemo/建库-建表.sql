create database listen_book character set utf8;

use listen_book ;

create table users(
    uid int primary key auto_increment comment '用户ID',
    username varchar(64) not null unique comment '用户名',
    password varchar(64) not null comment '密码'

);

create table books(
    bid int primary key auto_increment comment '小说ID',
    uid int not null unique comment '上传者',
    title varchar(100) not null unique comment '小说名'
);

create table sections(
    sid int primary key auto_increment comment '章节ID',
    bid int not null unique comment '小说id',
    name varchar(100) comment '小说章节名称'
);

create table audios(
    aid int primary key auto_increment comment '音频id',
    uuid char(36) not null comment 'uuid',
    sid int not null unique comment '属于哪个章节id',
    type varchar(20) not null comment '音频类型',
    content longblob default null comment '音频内容'
);