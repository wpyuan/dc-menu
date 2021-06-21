package com.github.dc.menu.config;

import com.github.mybatis.crud.config.MyBatisSqlSessionFactoryConfig;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *     默认实现mapper自动配置
 * </p>
 *
 * @author wangpeiyuan
 * @date 2021/4/18 11:38
 */
@Configuration
@AutoConfigureAfter(MyBatisSqlSessionFactoryConfig.class)
public class DCMenuMapperScannerAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(name = "dcMenuMapperScannerAutoConfiguration")
    public MapperScannerConfigurer dcMenuMapperScannerAutoConfiguration() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.github.dc.menu.mapper");
        return mapperScannerConfigurer;
    }
}
