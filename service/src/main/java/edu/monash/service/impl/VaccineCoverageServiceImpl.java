package edu.monash.service.impl;

import edu.monash.dao.VacTenToNineteen;
import edu.monash.dao.VaccineCoverage;
import edu.monash.mapper.VacTenToNineteenMapper;
import edu.monash.mapper.VaccineCoverageMapper;
import edu.monash.service.VaccineCoverageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VaccineCoverageServiceImpl implements VaccineCoverageService {

    @Resource
    private VaccineCoverageMapper vaccineCoverageMapper;

    @Override
    public List<VaccineCoverage> getVaccineRate() {
        List<VaccineCoverage> all = vaccineCoverageMapper.getVaccineRate();

        return all;
    }

}
