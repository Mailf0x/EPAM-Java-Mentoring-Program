package service;

import exception.InvalidDataException;
import model.User;

import java.util.List;

public interface UserService {
    public User getUserById(long userId) throws InvalidDataException;
    public User getUserByEmail(String email) throws InvalidDataException;
    public List<User> getUsersByName(String name);
    public User createUser(User user);
    public User updateUser(User user);
    public boolean deleteUser(long userId);
}
