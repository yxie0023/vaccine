package edu.monash.controller;

import edu.monash.dao.CombinedVaccineDescEffects;
import edu.monash.service.CombinedVaccineDescEffectsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/combinedVaccineDescEffects")
public class CombinedVaccineDescEffectsController {

    @Resource
    private CombinedVaccineDescEffectsService combinedVaccineDescEffectsService;

    @RequestMapping("/getAllList")
    public @ResponseBody List<CombinedVaccineDescEffects> getAllList(){
        List<CombinedVaccineDescEffects> all = combinedVaccineDescEffectsService.getAllList();
        return all;
    }
}
