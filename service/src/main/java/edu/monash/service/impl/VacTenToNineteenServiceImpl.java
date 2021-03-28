package edu.monash.service.impl;

import edu.monash.dao.VacTenToNineteen;
import edu.monash.mapper.VacTenToNineteenMapper;
import edu.monash.service.VacTenToNineteenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VacTenToNineteenServiceImpl implements VacTenToNineteenService {

    @Resource
    private VacTenToNineteenMapper vacTenToNineteenMapper;

    @Override
    public List<VacTenToNineteen> getAll() {
        List<VacTenToNineteen> all = vacTenToNineteenMapper.getAll();

        return all;
    }
}
