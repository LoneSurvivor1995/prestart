package com.example.prestart.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: prestart-spring-boot-starter
 * @Package: com.example.prestart.config
 * @ClassName: MeiAutoConfiguration
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/3/20 16:03
 */

@Configuration
@EnableConfigurationProperties(MeiProperties.class)
@ConditionalOnClass(UserService.class)
public class MeiAutoConfiguration {

    @Autowired
    MeiProperties meiProperties;

    @Bean
    @ConditionalOnMissingBean(UserService.class)
    public UserService userService(){
        UserService userService = new UserService();
        userService.setName(meiProperties.getName());
        userService.setAge(meiProperties.getAge());
        userService.setSex(meiProperties.getSex());
        return userService;
    }
}
