package com.pluralsight.conferencemvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ConferenceConfig {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver(); // The same one that is defined by default
        bean.setPrefix("/WEB-INF/jsp/");
        bean.setSuffix(".jsp");
        bean.setOrder(0); // The order of a ViewResolver. We can have multiple ViewResolvers and they get invoked in this
        // order. The first ViewResolver that successfully resolves will return the page.
        return bean;
    }
}
