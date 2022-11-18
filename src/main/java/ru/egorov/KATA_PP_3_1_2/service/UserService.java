package ru.egorov.KATA_PP_3_1_2.service;

import org.springframework.transaction.annotation.Transactional;
import ru.egorov.KATA_PP_3_1_2.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Object findOne(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}
