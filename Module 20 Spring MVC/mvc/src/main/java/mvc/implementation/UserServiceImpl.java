package mvc.implementation;

import mvc.exception.InvalidDataException;
import mvc.model.User;
import org.springframework.stereotype.Component;
import mvc.service.UserService;

import java.util.*;

@Component
public class UserServiceImpl implements UserService {
    private Map<String, Map<String, String>> storage;
    private long idCounter;

    public UserServiceImpl(Map<String, Map<String, String>> storage) {
        this.storage = storage;
        idCounter = 1;
    }

    public User getUserById(long userId) throws InvalidDataException {
        final int PREFIX = 5;
        User result = null;

        for (String s : storage.keySet()) {

            if (!s.contains("user")) continue;
            long id = Long.parseLong(s.substring(PREFIX));

            if (id != userId) continue;
            Map<String, String> entry = storage.get(s);
            String name = entry.get("name");
            String email = entry.get("email");

            result = new UserImpl(id, name, email);
            break;
        }

        if (result == null) throw new InvalidDataException();
        return result;
    }

    public User getUserByEmail(String email) throws InvalidDataException {
        User result = null;

        for (String s : storage.keySet()) {

            if (!s.contains("user")) continue;
            String tempEmail = storage.get(s).get("email");

            if (!tempEmail.equals(email)) continue;
            Map<String, String> entry = storage.get(s);
            long id = Long.parseLong(entry.get("id"));
            String name = entry.get("name");

            result = new UserImpl(id, name, email);
            break;
        }

        if (result == null) throw new InvalidDataException();
        return result;
    }

    public List<User> getUsersByName(String name) {
        List<User> result = new ArrayList<User>();

        for (String s : storage.keySet()) {

            if (!s.contains("user")) continue;
            String tempName = storage.get(s).get("name");

            if (!tempName.equals(name)) continue;
            Map<String, String> entry = storage.get(s);
            long id = Long.parseLong(entry.get("id"));
            String email = entry.get("email");

            result.add(new UserImpl(id, name, email));
        }
        return result;
    }

    public User createUser(User user) {
        Map<String, String> entry = new HashMap<>();
        String key = String.format("user:%d", idCounter);

        entry.put("id", String.valueOf(idCounter));
        entry.put("name", user.getName());
        entry.put("email", user.getEmail());
        storage.put(key, entry);
        return getUserById(idCounter++);
    }

    public User updateUser(User user) {
        String key = String.format("user:%d", user.getId());
        Map<String, String> entry = storage.get(key);

        entry.put("name", user.getName());
        entry.put("email", user.getEmail());
        return getUserById(user.getId());
    }

    public boolean deleteUser(long userId) {
        String key = String.format("user:%d", userId);
        Map<String, String> value = storage.get(key);

        return storage.remove(key, value);
    }
}
