package edu.monash.service;

import edu.monash.dao.NewsArticle;

import java.util.List;

public interface NewsArticleService {
    List<NewsArticle> getNews();
}
