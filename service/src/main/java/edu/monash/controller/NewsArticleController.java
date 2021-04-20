package edu.monash.controller;

import edu.monash.dao.NewsArticle;
import edu.monash.service.NewsArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("/news")
public class NewsArticleController {

    @Resource
    private NewsArticleService newsArticleService;

    @RequestMapping("/getNews")
    public @ResponseBody
    List<NewsArticle> getNews(){
        List<NewsArticle> all = newsArticleService.getNews();
        return all;
    }
}
