package com.aojie.chen.microserversimpleprovideruser.repository;

import com.aojie.chen.microserversimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
