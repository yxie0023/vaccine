package edu.monash.controller;

import edu.monash.dao.VacTenToNineteen;
import edu.monash.dao.VaccineCoverage;
import edu.monash.service.VacTenToNineteenService;
import edu.monash.service.VaccineCoverageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/vacRate")
public class VaccineCoverageController {

    @Resource
    private VaccineCoverageService vaccineCoverageService;

    // the new interface to do the echarts ---- vaccine compare
    @RequestMapping("/getVaccineRate")
    public @ResponseBody
    List<VaccineCoverage> getVaccineRate(){
        List<VaccineCoverage> all = vaccineCoverageService.getVaccineRate();
        return all;
    }
}
