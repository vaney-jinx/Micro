package com.micro.schoolbuilder.mapper;

import com.micro.schoolbuilder.entity.School;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolMapper {
    List<School> getSchoolList();

    void addSchool(School school);

    void deleteSchool(String schoolId);
}
