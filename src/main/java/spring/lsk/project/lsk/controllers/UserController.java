package spring.lsk.project.lsk.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.lsk.project.lsk.models.User;
import spring.lsk.project.lsk.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public void addNewUser(@RequestBody User user) {
        userService.addNewUser(user);
    }

    @DeleteMapping("/{usersId}")
    public void deleteUser(@PathVariable("usersId") Long userId) {
        userService.deleteUser(userId);
    }

    @PutMapping("/{usersId}")
    public void editStudentById(@RequestBody User user, @PathVariable("usersId") Long usersId){
        userService.editUserById(user, usersId);

    }


}
