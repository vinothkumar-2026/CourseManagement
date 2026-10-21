package Credssspackage.CredsssProject.service;

import Credssspackage.CredsssProject.dao.CourseDAO;
import Credssspackage.CredsssProject.model.Coursemodel;
import Credssspackage.CredsssProject.reposditory.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseImplement implements Courseservice {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public String CourseAddlogic(CourseDAO courseDAO) {

        Coursemodel saveTheInfo = new Coursemodel(
                courseDAO.getSname(),
                courseDAO.getCourseduration(),
                courseDAO.getCoursename(),
                courseDAO.getCoursetime(),
                courseDAO.getDays(),
                courseDAO.getPhoneno()
        );

        courseRepository.save(saveTheInfo);

        return "Data stored successfully";
    }
}