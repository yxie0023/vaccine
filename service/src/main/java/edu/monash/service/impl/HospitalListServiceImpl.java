package edu.monash.service.impl;
import edu.monash.dao.HospitalList;
import edu.monash.mapper.HospitalListmapper;
import edu.monash.service.HospitalListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HospitalListServiceImpl implements HospitalListService{

    @Resource
    private HospitalListmapper hospitalListmapper;

    @Override
    public List<HospitalList> getHospital() {

        List<HospitalList> all = hospitalListmapper.getHospital();
        return all;
    }
}
