package edu.monash.service.impl;

import edu.monash.dao.NewsArticle;
import edu.monash.mapper.NewsArticleMapper;
import edu.monash.service.NewsArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NewsArticleServiceImpl implements NewsArticleService {

    @Resource
    private NewsArticleMapper newsArticleMapper;

    @Override
    public List<NewsArticle> getNews() {
        List<NewsArticle> all = newsArticleMapper.getNews();

        return all;
    }
}
