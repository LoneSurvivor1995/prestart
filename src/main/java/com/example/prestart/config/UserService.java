package com.example.prestart.config;

/**
 * @ProjectName: prestart-spring-boot-starter
 * @Package: com.example.prestart.config
 * @ClassName: UserService
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/3/20 15:58
 */
public class UserService {

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

    public String findUser(){
        return name+" "+age+" "+sex;
    }

    public String getUser(){
        return "[name]:"+name+" [age]:"+age+" [sex]:"+sex;
    }
}
