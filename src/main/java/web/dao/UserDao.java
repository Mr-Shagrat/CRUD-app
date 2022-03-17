package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    User getUserById(Long id);
    void deleteUser(User user);
    void updateUser(User user);
    List<User> getUsers();
}
