package Credssspackage.CredsssProject.reposditory;

import Credssspackage.CredsssProject.model.Coursemodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Coursemodel,Integer> {

}
