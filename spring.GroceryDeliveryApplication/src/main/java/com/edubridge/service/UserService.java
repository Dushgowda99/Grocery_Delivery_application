package com.edubridge.service;

import java.util.List;

import com.edubridge.model.User;


public interface UserService {
	public User registerUser(User user);
    public List<User> getAllUsers();
    public User getUserById(int user_id);
    public void deleteUserById(int user_id);
    public User updateUserById(int user_id,User user);
    public User findByUserName(String userName);
    public User loginUser(User user);
}
