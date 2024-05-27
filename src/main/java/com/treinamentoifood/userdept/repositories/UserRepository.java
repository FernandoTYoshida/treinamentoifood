package com.treinamentoifood.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.treinamentoifood.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
