package Credssspackage.CredsssProject.Controller;

import Credssspackage.CredsssProject.dao.CourseDAO;
import Credssspackage.CredsssProject.service.Courseservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courseapi")
public class CourseController {

    @Autowired
    private Courseservice courseservice;

    @PostMapping("/addcourse")
    public String CourseApi(@RequestBody CourseDAO courseDAO) {

        return courseservice.CourseAddlogic(courseDAO);
    }
}