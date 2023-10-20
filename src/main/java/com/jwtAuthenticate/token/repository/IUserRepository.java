package com.jwtAuthenticate.token.repository;


import com.jwtAuthenticate.token.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {


    public Optional<User> findByEmail(String email);
}
