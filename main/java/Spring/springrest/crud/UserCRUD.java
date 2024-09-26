package Spring.springrest.crud;

import Spring.springrest.user.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserCRUD {

    private List<User> userList = new ArrayList<>();

    public User saveUser(User user) {
        userList.add(user);
        return user;
    }

    public void deleteUserById(long id) {
        userList.removeIf(user -> user.getId() == id);
    }

    public User getUserById(long id) {
        return userList.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<User> findAllUsers() {
        return userList;
    }

    public void updateUserById(long id, User user) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                userList.set(i, user);
                break;
            }
        }
    }
}
