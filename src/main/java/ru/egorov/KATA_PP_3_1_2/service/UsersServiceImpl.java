package ru.egorov.KATA_PP_3_1_2.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.egorov.KATA_PP_3_1_2.model.User;
import ru.egorov.KATA_PP_3_1_2.repositories.UsersRepository;


import java.util.List;
import java.util.Optional;

@Service
//@Transactional(readOnly = true)
public class UsersServiceImpl implements UserService {

    private final UsersRepository usersRepository;


    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
    @Override
    public List<User> findAll() {
        return usersRepository.findAll();
    }
    @Override
    public Object findOne(int id) {
        Optional<User> foundUser = usersRepository.findById(id);
        return foundUser.orElse(null);
    }
    @Override
    @Transactional
    public void save(User user) {
        usersRepository.save(user);
    }
    @Override
    @Transactional
    public void update(int id, User updatedUser) {
        updatedUser.setId(id);
        usersRepository.save(updatedUser);
    }
    @Override
    @Transactional
    public void delete(int id) {
        usersRepository.deleteById(id);
    }
}
