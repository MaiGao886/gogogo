package com.maigao.gogogo.repository;

import com.maigao.gogogo.entity.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
