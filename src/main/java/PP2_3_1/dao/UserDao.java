package PP2_3_1.dao;

import PP2_3_1.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    List<User> getAllUser();
    void save(User user);
    void deleteById(Long id);
    void updateUser(User user);
    Optional<User> findById(Long id);

}
