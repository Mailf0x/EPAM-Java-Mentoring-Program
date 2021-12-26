package mvc.service;

import mvc.exception.InvalidDataException;
import mvc.model.User;

import java.util.List;

public interface UserService {
    User getUserById(long userId) throws InvalidDataException;
    User getUserByEmail(String email) throws InvalidDataException;
    List<User> getUsersByName(String name);
    User createUser(User user);
    User updateUser(User user);
    boolean deleteUser(long userId);
}
