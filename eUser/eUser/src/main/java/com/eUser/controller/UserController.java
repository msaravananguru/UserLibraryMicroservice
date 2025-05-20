package com.eUser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eUser.dto.ApiResponse;
import com.eUser.dto.LoginDTO;
import com.eUser.entity.User;
import com.eUser.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/addOne")
	public ResponseEntity<ApiResponse>addOne(@RequestBody User user){
		ApiResponse apiResponse=new ApiResponse();
		apiResponse=userService.addOne(user);
		return ResponseEntity.status(HttpStatus.CREATED.value()).body(apiResponse);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<ApiResponse> getAll(){
		ApiResponse apiResponse=new ApiResponse();
		apiResponse=userService.getAllUsers();
		return ResponseEntity.status(HttpStatus.CREATED.value()).body(apiResponse);
	}
	
	@PostMapping("/login")
	public ResponseEntity<ApiResponse>addOne(@RequestBody LoginDTO dto){
		ApiResponse apiResponse=new ApiResponse();
		apiResponse=userService.getUser(dto);
		return ResponseEntity.status(HttpStatus.CREATED.value()).body(apiResponse);
	}
	
	@GetMapping("/userController")
	public String user() {
		return "From User Controller...";
	}
}
