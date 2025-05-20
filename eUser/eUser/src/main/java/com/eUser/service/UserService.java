package com.eUser.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eUser.dto.ApiResponse;
import com.eUser.dto.LoginDTO;
import com.eUser.entity.User;
import com.eUser.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public ApiResponse getAllUsers() {
		ApiResponse apiResponse=new ApiResponse();
		apiResponse.setData(userRepository.findAll());
		return apiResponse;
	}
//	    public List<User> getAllUsers() {

	public ApiResponse getUser(LoginDTO dto) {
		ApiResponse apiResponse=new ApiResponse();
		Optional<User> user=userRepository.findById(dto.getId());
		if(user==null)
		{
			apiResponse.setData("Need to change Exception User Not Found....");
		}
		else {
		apiResponse.setData(user);
		}
		return apiResponse;
	}
	
	public ApiResponse addOne(User user) {
		User saveuser=userRepository.save(user);
		ApiResponse apiResponse=new ApiResponse();
		apiResponse.setData(saveuser);
		return apiResponse;
	}
}
