package com.systex.lottery.filter;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    FilterRegistrationBean<LoginFilter> authFilter() {
        FilterRegistrationBean<LoginFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new LoginFilter());
        registrationBean.addUrlPatterns("/*"); // 過濾所有頁面
        registrationBean.setOrder(1); // 設置過濾器順序

        return registrationBean;
    }
}
