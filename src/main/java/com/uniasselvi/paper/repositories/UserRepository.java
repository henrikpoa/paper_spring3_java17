package com.uniasselvi.paper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniasselvi.paper.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
