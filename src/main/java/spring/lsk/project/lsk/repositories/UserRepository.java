package spring.lsk.project.lsk.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import spring.lsk.project.lsk.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User getUsersById(Long User_id);


}
