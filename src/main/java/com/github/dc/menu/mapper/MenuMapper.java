package com.github.dc.menu.mapper;

import com.github.dc.menu.domain.entity.Menu;
import com.github.mybatis.crud.mapper.BatchInsertMapper;
import com.github.mybatis.crud.mapper.DefaultMapper;

/**
 *  菜单 mapper
 *
 * @author wangpeiyuan
 * @date 2021-05-13 08:43:25
 */
public interface MenuMapper extends DefaultMapper<Menu>, BatchInsertMapper<Menu> {
}