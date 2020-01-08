package com.admin.Mapper;

import com.admin.Bean.Article;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author MrChang
 * @create 2019-12-30 9:48
 * @description
 */
@Repository
@Mapper
public interface ArticleMapper {

    @Select("select * from article order by create_time desc")
    List<Article> queryAll();
    @Select("select * from article where title like CONCAT('%',#{title},'%')")
    Article queryArticleByTitle(String title);
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into article (title,author,body,category,image,tip) value (#{title},#{author},#{body},#{category},#{image},#{tip})")
    void insertItem(Article article);
    @Select("select * from article where id = #{id}")
    Article queryById(int id);
    @Delete("delete from article where id = #{id}")
    void delete(Integer id);
    @Update("update article set point=point+'1'  where id = #{id}")
    void updatePoint(Integer id);
}
