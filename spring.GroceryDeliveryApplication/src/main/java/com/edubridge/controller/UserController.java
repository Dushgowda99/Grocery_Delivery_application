package com.edubridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.model.User;
import com.edubridge.service.UserService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;
	public UserController(UserService userService) {
		this.userService=userService;
	}
	@PostMapping()
	public ResponseEntity<User> registerUser(@Validated @RequestBody User user){
		return new ResponseEntity<User>(userService.registerUser(user),HttpStatus.CREATED);
	}
	@GetMapping()
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	@GetMapping("/{user_id}")
	public ResponseEntity<User> getUserById(@PathVariable("user_id") int user_id) {
		return new ResponseEntity<User>(userService.getUserById(user_id),HttpStatus.OK);
	}
	@DeleteMapping("/{user_id}")
	public ResponseEntity<String> deleteUserById(@PathVariable("user_id") int user_id) {
		userService.deleteUserById(user_id);
		return new ResponseEntity<String>("Deleted successfully",HttpStatus.OK);
	}
	@PutMapping("/{user_id}")
	public ResponseEntity<User> updateUserById(@PathVariable("user_id") int user_id, @RequestBody User user){
	return new ResponseEntity<User>(userService.updateUserById(user_id,user),HttpStatus.OK);	
	}
	 @GetMapping("/{userName}")
	  public ResponseEntity<User> findByUserName(@PathVariable("userName") String userName)
	  {
	  	return new ResponseEntity<User>(userService.findByUserName(userName),HttpStatus.OK);
	  }
	@PostMapping("/login")
	public ResponseEntity<User> loginUser(@Validated @RequestBody User user){
		System.out.println("controller");
		return new ResponseEntity<User>(userService.loginUser(user),HttpStatus.OK);
	}
	
	
}