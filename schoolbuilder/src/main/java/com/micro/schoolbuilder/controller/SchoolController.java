package com.micro.schoolbuilder.controller;

import com.micro.schoolbuilder.entity.School;
import com.micro.schoolbuilder.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ModelAndView schoolList(){
        ModelAndView modelAndView = new ModelAndView("schoolList");
        modelAndView.addObject("mySchool", schoolService.getSchool());
        return modelAndView;
    }

    @RequestMapping("add")
    public String addSchoolPage(){
        return "addSchool";
    }

    @RequestMapping(value = "list", method = RequestMethod.POST)
    public ModelAndView addSchool(@RequestParam("schoolName") String schoolName){
        School school = new School();
        school.setSchoolId(new Random().nextLong());
        school.setSchoolName(schoolName);
        schoolService.addSchool(school);
        return schoolList();
    }

    @RequestMapping("delete/{schoolId}")
    public ModelAndView deleteSchool(@PathVariable("schoolId") String schoolId){
        schoolService.deleteSchool(schoolId);
        return schoolList();
    }
}
