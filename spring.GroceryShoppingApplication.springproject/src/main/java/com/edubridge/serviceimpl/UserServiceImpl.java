package com.edubridge.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.exception.ResourceNotFoundException;
import com.edubridge.model.User;
import com.edubridge.repository.UserRepository;
import com.edubridge.service.UserService;

@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserRepository userRepository;

 
 public UserServiceImpl(UserRepository userRepository) {
	 this.userRepository=userRepository;
 }

	@Override
	public User registerUser(User User) {

		return userRepository.save(User);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(int user_id) {
		return userRepository.findById(user_id).orElseThrow(()->new ResourceNotFoundException("User","user_id",user_id));
	}

	@Override
	public void deleteUserById(int user_id) {
		User user = getUserById(user_id);
		userRepository.deleteById(user.getUserId());;
		
	}

	@Override
	public User updateUserById(int user_id, User user) {
		User user1 = getUserById(user_id);
		user1.setUserName(user.getUserName());
		user1.setFirst_name(user.getFirst_name());
		user1.setLast_name(user.getLast_name());
		user1.setPassword(user.getPassword());
		user1.setEmail_id(user.getEmail_id());
		user1.setTem_address(user.getTem_address());
		user1.setPer_address(user.getPer_address());
		user1.setRole(user.getRole());
		return userRepository.save(user1);
	}

	@Override
	public User findByUserName(String userName) {
		
		return userRepository.findByUserName(userName);
	}

	@Override
	public User loginUser(User user) {
		
		System.out.println("sevice");
		return userRepository.findByUserNameAndPassword(user.getUserName(),user.getPassword());
	} 
	
}
