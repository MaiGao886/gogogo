create table user
(
    tu_id           varchar(64)      not null,
    username        varchar(64)      not null,
    password        varchar(64)      not null,
    nickname        varchar(64)      null,
    age             int    default 0 not null,
    sex             tinyint(1)       null,
    mobile          varchar(20)      null,
    email           varchar(64)      null,
    create_time     datetime         not null,
    login_time      datetime         null,
    last_login_time datetime         null,
    count           bigint default 0 not null,
    constraint _user_id_uindex
        unique (tu_id)
)
    comment '用户表';

alter table user
    add primary key (tu_id);

create table role
(
    tr_id        bigint       not null comment '角色ID',
    parent_tr_id bigint       not null comment '父级角色ID',
    role_name    varchar(64)  not null comment '角色名称',
    create_time  datetime     not null comment '创建时间',
    description  varchar(255) null comment '角色描述',
    constraint role_tr_id_uindex
        unique (tr_id)
)
    comment '角色表';

alter table role
    add primary key (tr_id);

