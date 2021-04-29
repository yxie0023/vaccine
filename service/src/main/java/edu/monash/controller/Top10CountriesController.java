package edu.monash.controller;

import edu.monash.dao.Top10Countries;
import edu.monash.service.Top10CountriesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/top")
public class Top10CountriesController {

    @Resource
    private Top10CountriesService top10CountriesService;

    @RequestMapping("/getAllCountries")
    public @ResponseBody List<Top10Countries> getAllCountries(){
        List<Top10Countries> all = top10CountriesService.getAllCountries();
        return all;
    }
}
