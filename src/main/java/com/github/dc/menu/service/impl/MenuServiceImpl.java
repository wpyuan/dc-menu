package com.github.dc.menu.service.impl;

import com.github.dc.common.base.service.impl.DefaultServiceImpl;
import com.github.dc.menu.constant.MenuField;
import com.github.dc.menu.domain.entity.Menu;
import com.github.dc.menu.mapper.MenuMapper;
import com.github.dc.menu.service.MenuService;
import com.github.dc.menu.util.TreeUtil;
import com.github.dc.menu.vo.MenuVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  菜单 service-impl
 *
 * @author wangpeiyuan
 * @date 2021-05-13 08:43:25
 */
@Service
public class MenuServiceImpl extends DefaultServiceImpl<Menu> implements MenuService {

    @Override
    public List<MenuVO> listView() {
        List<Menu> menus = this.list(Menu.builder().isEnable(true).build());
        return TreeUtil.toTree(menus, MenuField.ID, MenuField.PARENT_ID, "children", "0", MenuVO.class);
    }
}