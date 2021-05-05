package edu.monash.controller;

import edu.monash.dao.HospitalList;
import edu.monash.service.HospitalListService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("/hospital")
public class HospitalListController {

    @Resource
    private HospitalListService hospitalListService;

    @RequestMapping("/getHospital")
    public @ResponseBody
    List<HospitalList> getHospital(){
        List<HospitalList> all = hospitalListService.getHospital();
        return all;
    }
}
