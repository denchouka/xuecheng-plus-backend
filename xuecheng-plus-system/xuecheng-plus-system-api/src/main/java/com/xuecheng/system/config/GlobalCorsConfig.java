package com.xuecheng.system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author denchouka
 * @description 跨域过滤
 * @date 2024/9/7 23:45
 */
@Configuration
public class GlobalCorsConfig {

    /**
     * 允许跨域调用的过滤器
     * @return
     */
    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration configuration = new CorsConfiguration();
        // 允许白名单域名进行跨域调用
        configuration.addAllowedOrigin("*");
        // 允许跨域发送cookie
        configuration.setAllowCredentials(true);
        // 方形全部原始头信息
        configuration.addAllowedHeader("*");
        // 允许所有请求方法跨域调用
        configuration.addAllowedMethod("*");

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);

        return new CorsFilter(source);
    }
}
