package com.example.Bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author MrChang
 * @create 2019-12-20 9:24
 */
@Component//将本组件加入spring容器中
@ConfigurationProperties(prefix = "user")
/*将配置文件(用@propertySource(value="")可指定读取哪个配置文件，无指定会读取默认配置文件)
 *中配置的每个属性的值映射到该组件中，
 *告诉springboot将本实体类中属性与配置文件相关配置对应，
 *prefix指定配置文件中前缀为""的属性进行对应
 */
public class User {
    private String userName;
    private String password;
    private Integer age;
    private Boolean female;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Vip vip;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", female=" + female +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", vip=" + vip +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getFemale() {
        return female;
    }

    public void setFemale(Boolean female) {
        this.female = female;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Vip getVip() {
        return vip;
    }

    public void setVip(Vip vip) {
        this.vip = vip;
    }
}





