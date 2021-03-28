package edu.monash.controller;

import edu.monash.dao.VacTenToNineteen;
import edu.monash.service.VacTenToNineteenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/vacTenToNineteen")
public class VacTenToNineteenController {

    @Resource
    private VacTenToNineteenService vacTenToNineteenService;

    @RequestMapping("/getAll")
    public @ResponseBody List<VacTenToNineteen> getAll(){
        List<VacTenToNineteen> all = vacTenToNineteenService.getAll();
        return all;
    }
}
