package com.github.dc.menu.controller;

import com.github.dc.common.base.controller.DefaultController;
import com.github.dc.menu.domain.entity.Menu;
import com.github.dc.menu.service.MenuService;
import com.github.dc.menu.vo.MenuVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *  菜单 控制器
 *
 * @author wangpeiyuan
 * @date 2021-05-13 08:43:25
 */
@RestController
@RequestMapping("/menu")
@Slf4j
public class MenuController extends DefaultController<Menu>{

    @Autowired
    private MenuService service;

    @GetMapping("/list/view")
    public ResponseEntity<List<MenuVO>> view() {
        return ResponseEntity.ok(service.listView());
    }

}