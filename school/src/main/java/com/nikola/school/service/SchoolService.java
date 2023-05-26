package com.nikola.school.service;

import com.nikola.school.model.FullSchoolResponse;
import com.nikola.school.model.School;

import java.util.List;

public interface SchoolService {
    public void saveSchool(School school);
    public List<School> findAllSchools();
    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId);
}
