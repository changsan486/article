package com.example.Service;

import com.example.Bean.Article;

import java.util.List;

/**
 * @author MrChang
 * @create 2019-12-30 9:58
 * @description
 */
public interface ArticleService {

    List<Article> queryAll();
    Article queryArticleByTitle(String title);
    void insertItem(Article article);
}
