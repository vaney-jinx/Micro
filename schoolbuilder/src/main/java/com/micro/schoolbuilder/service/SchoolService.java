package com.micro.schoolbuilder.service;

import com.micro.schoolbuilder.entity.School;
import com.micro.schoolbuilder.mapper.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    SchoolMapper schoolMapper;
    public List<School> getSchool(){
        return schoolMapper.getSchoolList();
    }

    public void addSchool(School school) {
        schoolMapper.addSchool(school);
    }

    public void deleteSchool(String schoolId) {
        schoolMapper.deleteSchool(schoolId);
    }
}
