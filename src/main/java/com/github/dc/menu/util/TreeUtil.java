package com.github.dc.menu.util;

import com.github.mybatis.crud.util.EntityUtil;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.beans.BeanMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * </p>
 *
 * @author wangpeiyuan
 * @date 2021/6/18 17:34
 */
@Slf4j
@UtilityClass
public class TreeUtil {

    /**
     * 将指定的list转换成为树结构的数据
     *
     * @param list     集合对象，每个对象都有用来表示上下级关系的属性结构
     * @param idName       集合中用来表示id列
     * @param parentIdName 集合对象中用来表示parentId的列
     * @param childName   父子级关系表现出来时，将会在父级节点内添加本属性数组集合，并将自己点放置到本数组集合内
     * @param parentId 最顶级的id
     * @param returnType 返回类型
     * @return 树结构的 List<?> 对象
     */
    public static <T> List<T> toTree(List<?> list, String idName, String parentIdName, String childName, Object parentId, Class<T> returnType) {
        List<Map<String, Object>> mapList = toTree(list, idName, parentIdName, childName, parentId);
        return EntityUtil.map2Bean(mapList, returnType);
    }

    /**
     * 将指定的list转换成为树结构的数据
     *
     * @param list     集合对象，每个对象都有用来表示上下级关系的属性结构
     * @param idName       集合中用来表示id列
     * @param parentIdName 集合对象中用来表示parentId的列
     * @param childName   父子级关系表现出来时，将会在父级节点内添加本属性数组集合，并将自己点放置到本数组集合内
     * @param parentId 最顶级的id
     * @return 树结构的 List<Map<String, Object>> 对象
     */
    public static List<Map<String, Object>> toTree(List<?> list, String idName, String parentIdName, String childName, Object parentId) {
        List<Map<String, Object>> obj = new ArrayList<>();
        for (Object object : list) {
            // bean -> map
            Map<String, Object> tmepOjb = new HashMap<>();
            BeanMap beanMap = BeanMap.create(object);
            beanMap.forEach((key, value) -> {
                tmepOjb.put(String.valueOf(key), value);
            });
            Object menuId = tmepOjb.get(idName);
            Object pid = tmepOjb.get(parentIdName);
            if (parentId.toString().equals(pid.toString())) {
                List<Map<String, Object>> c_node = toTree(list, idName, parentIdName, childName, menuId);
                tmepOjb.put(childName, c_node);
                obj.add(tmepOjb);
            }
        }
        return obj;
    }
}
