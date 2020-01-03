package com.admin.Service;

import com.admin.Bean.Article;

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

    Article queryById(int id);
}
