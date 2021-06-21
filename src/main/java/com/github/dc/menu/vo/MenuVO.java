package com.github.dc.menu.vo;

import com.github.dc.menu.domain.entity.Menu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * <p>
 *     菜单VO
 * </p>
 *
 * @author wangpeiyuan
 * @date 2021/5/13 8:46
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MenuVO extends Menu {
    private List<Menu> children;
}
