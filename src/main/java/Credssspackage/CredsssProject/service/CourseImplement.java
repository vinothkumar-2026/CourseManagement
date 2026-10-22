package Credssspackage.CredsssProject.service;

import Credssspackage.CredsssProject.dao.CourseDAO;
import Credssspackage.CredsssProject.model.Coursemodel;
import Credssspackage.CredsssProject.reposditory.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


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
    @Override
    public List<CourseDAO> Coursedisplayall(){
        List<Coursemodel> getdata=courseRepository.findAll();
        List<CourseDAO> transfer= new ArrayList<>();
        for(Coursemodel getdataall:getdata ) {
            CourseDAO set = new CourseDAO();
            set.setStudentid(getdataall.getStudentId());
            set.setSname(getdataall.getSname());
            set.setCourseduration(getdataall.getCourseduration());
            set.setCoursename(getdataall.getCoursename());
            set.setDays(getdataall.getDays());
            set.setPhoneno(getdataall.getPhoneno());
            set.setCoursetime(getdataall.getCoursetime());
            transfer.add(set);
        }
        return transfer;
    }
}

