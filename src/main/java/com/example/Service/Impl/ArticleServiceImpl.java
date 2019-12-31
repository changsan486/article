package com.example.Service.Impl;

import com.example.Bean.Article;
import com.example.Mapper.ArticleMapper;
import com.example.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MrChang
 * @create 2019-12-30 9:59
 * @description
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public List<Article> queryAll() {
        return articleMapper.queryAll();
    }

    @Override
    public Article queryArticleByTitle(String title) {
        return articleMapper.queryArticleByTitle(title);
    }

    @Override
    public void insertItem(Article article) {

    }

    @Override
    public Article queryById(int id) {
        return articleMapper.queryById(id);
    }
}
