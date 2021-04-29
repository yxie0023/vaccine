package edu.monash.service.impl;

import edu.monash.dao.Top10Countries;
import edu.monash.mapper.Top10CountriesMapper;
import edu.monash.service.Top10CountriesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Top10CountriesServiceImpl implements Top10CountriesService {

    @Resource
    private Top10CountriesMapper top10CountriesMapper;

    @Override
    public List<Top10Countries> getAllCountries() {

        List<Top10Countries> all = top10CountriesMapper.getAllCountries();
        return all;
    }
}