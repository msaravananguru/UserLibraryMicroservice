package com.eUser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eUser.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
