package com.qfedu.boot1806.config;

import com.qfedu.boot1806.cros.CROSFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.servlet.Filter;

/**
 *@Author feri
 *@Date Created in 2019/1/9 15:47
 *
 * SpringBoot 实现过滤器注册
 */
@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean myFilter = new FilterRegistrationBean();
        myFilter.addUrlPatterns("/*");
        myFilter.setFilter(new CROSFilter());
        return myFilter;
    }
}
