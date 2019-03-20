package com.example.prestart.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ProjectName: prestart-spring-boot-starter
 * @Package: com.example.prestart.config
 * @ClassName: MeiProperties
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/3/20 15:56
 */

@ConfigurationProperties(prefix = "mei")
public class MeiProperties {

    public String name;

    public int age;

    public String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "MeiProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
