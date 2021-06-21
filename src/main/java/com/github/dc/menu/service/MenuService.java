package com.github.dc.menu.service;

import com.github.dc.common.base.service.DefaultService;
import com.github.dc.menu.domain.entity.Menu;
import com.github.dc.menu.vo.MenuVO;

import java.util.List;

/**
 *  菜单 service
 *
 * @author wangpeiyuan
 * @date 2021-05-13 08:43:25
 */
public interface MenuService extends DefaultService<Menu> {

    /**
     * 获取菜单视图
     * @return
     */
    List<MenuVO> listView();
}