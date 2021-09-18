package com.github.dc.menu.domain.entity;

import com.github.mybatis.crud.annotation.Id;
import com.github.mybatis.crud.annotation.Table;
import com.github.mybatis.crud.enums.CustomFillIdMethod;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 *  菜单
 *
 * @author wangpeiyuan
 * @date 2021-05-13 08:43:25
 */
@Table(name = "MENU")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Menu implements Serializable {

    /**
     * 主键
     */
    @Id(fillMethod = CustomFillIdMethod.UUID)
    private String id;
    /**
     * 菜单标题
     */
    private String title;
    /**
      * 图标
      */
    private String icon;
    /**
      * 排序号
      */
    private String orderSeq;
    /**
      * 父级菜单ID
      */
    private String parentId;
    /**
      * 菜单访问地址
      */
    private String url;
    /**
      * 是否启用
      */
    private Boolean isEnable;
}