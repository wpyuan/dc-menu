create table MENU
(
    ID        VARCHAR2(300) not null
        constraint MENU_PK
        primary key,
    TITLE     VARCHAR2(60)  not null,
    ICON      VARCHAR2(100),
    ORDER_SEQ NUMBER    default 10,
    PARENT_ID VARCHAR2(300),
    URL       VARCHAR2(1000),
    IS_ENABLE NUMBER(1) default 1
)
    /

comment on table MENU is '菜单'
/

comment on column MENU.ID is '主键'
/

comment on column MENU.TITLE is '菜单标题'
/

comment on column MENU.ICON is '图标'
/

comment on column MENU.ORDER_SEQ is '排序号'
/

comment on column MENU.PARENT_ID is '父级菜单ID'
/

comment on column MENU.URL is '菜单访问地址'
/

comment on column MENU.IS_ENABLE is '是否启用'
/

create unique index MENU_TITLE_UINDEX
    on MENU (TITLE)
/

