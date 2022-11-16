package ru.egorov.KATA_PP_3_1_2.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.egorov.KATA_PP_3_1_2.model.User;

public interface UsersRepository extends JpaRepository<User, Integer> {

}
