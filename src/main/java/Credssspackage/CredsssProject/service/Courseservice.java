package Credssspackage.CredsssProject.service;

import Credssspackage.CredsssProject.dao.CourseDAO;
import java.util.List;

public interface Courseservice {

    String CourseAddlogic(CourseDAO courseDAO);
    List<CourseDAO> Coursedisplayall();

}