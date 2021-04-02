package edu.monash.service.impl;

import edu.monash.dao.CombinedVaccineDescEffects;
import edu.monash.mapper.CombinedVaccineDescEffectsMapper;
import edu.monash.service.CombinedVaccineDescEffectsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CombinedVaccineDescEffectsServiceImpl implements CombinedVaccineDescEffectsService {

    @Resource
    private CombinedVaccineDescEffectsMapper combinedVaccineDescEffectsMapper;

    @Override
    public List<CombinedVaccineDescEffects> getAllList() {

        List<CombinedVaccineDescEffects> all = combinedVaccineDescEffectsMapper.getAllList();
        return all;
    }
}
