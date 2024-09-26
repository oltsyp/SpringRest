package Spring.springrest.controller;

import Spring.springrest.crud.UserCRUD;
import Spring.springrest.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class UserController {
    @Autowired
    private UserCRUD userCRUD;

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        return userCRUD.saveUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable long id) {
        userCRUD.deleteUserById(id);
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable long id) {
        return userCRUD.getUserById(id);
    }

    @GetMapping("/users")
    public List<User> findAllUsers() {
        return userCRUD.findAllUsers();
    }

    @PutMapping("/users/{id}")
    public User updateUserById(@PathVariable long id, @RequestBody User user) {
        User existingUser = userCRUD.getUserById(id);
        if (existingUser != null) {
            user.setId(id);
            return userCRUD.saveUser(user);
        }
        return null;
    }
}
