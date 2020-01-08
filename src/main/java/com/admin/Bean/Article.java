package com.admin.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.util.Date;

/**
 * @author MrChang
 * @create 2019-12-30 9:41
 * @description
 */
@Component
public class Article {
    private Integer id;
    private String author;
    private String title;
    private String body;
    private String category;
    private Date createTime;
    private Date updateTime;
    private String image;
    private String tip;
    private String point;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", category='" + category + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", image='" + image + '\'' +
                ", tip='" + tip + '\'' +
                ", point='" + point + '\'' +
                '}';
    }
}
