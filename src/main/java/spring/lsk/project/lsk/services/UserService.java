package spring.lsk.project.lsk.services;


import org.springframework.stereotype.Service;

import spring.lsk.project.lsk.models.User;
import spring.lsk.project.lsk.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public User getUsersById(Long user_id){
//        return userRepository.getUsersById(user_id);
//    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void addNewUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long userId) {

        User user = userRepository.getUsersById(userId);
        Long id = user.getId();
        userRepository.deleteById(id);
    }

    public void editUserById(User user, Long userId){
        User userToEdit = userRepository.getUsersById(userId);

        userToEdit.setName(user.getName());
        userToEdit.setPhone(user.getPhone());

        userRepository.save(userToEdit);
    }




}
