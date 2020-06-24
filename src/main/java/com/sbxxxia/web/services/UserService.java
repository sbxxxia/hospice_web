package com.sbxxxia.web.services;

import org.springframework.stereotype.Component;

import com.sbxxxia.web.domains.UserDTO;

@Component
public interface UserService {
	public UserDTO insert(UserDTO user);
	public UserDTO update(UserDTO user);
	public UserDTO delete(UserDTO user);
	public UserDTO findAll(UserDTO user);
	public UserDTO findOne(String userid);
}
