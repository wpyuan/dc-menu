package com.github.dc.menu.constant;

/**
 *  菜单字段常量，供查询方法使用
 *
 * @author wangpeiyuan
 * @date 2021-05-13 08:43:25
 */
public interface MenuField {

    /**
      * 主键
      */
    String ID = "id";
    /**
      * 菜单标题
      */
    String TITLE = "title";
    /**
      * 图标
      */
    String ICON = "icon";
    /**
      * 排序号
      */
    String ORDER_SEQ = "orderSeq";
    /**
      * 父级菜单ID
      */
    String PARENT_ID = "parentId";
    /**
      * 菜单访问地址
      */
    String URL = "url";
    /**
      * 是否启用
      */
    String IS_ENABLE = "isEnable";

}