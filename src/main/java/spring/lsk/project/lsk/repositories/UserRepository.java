package spring.lsk.project.lsk.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import spring.lsk.project.lsk.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User getUsersById(Long User_id);
    Optional<User> findByUsername(String username);


}
