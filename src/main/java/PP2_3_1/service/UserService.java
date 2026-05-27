package PP2_3_1.service;

import PP2_3_1.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUser();
    void save(User user);
    void deleteById(Long id);
    void updateUser(User user);
    Optional<User> findById(Long id);
}
