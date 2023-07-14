package com.edubridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	public User findByUserName(String userName);
	
	public User findByUserNameAndPassword(String userName,String password);
}
