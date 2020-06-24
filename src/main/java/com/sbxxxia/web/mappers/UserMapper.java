package com.sbxxxia.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sbxxxia.web.domains.UserDTO;

@Repository
public interface UserMapper {
	public void insertUser(UserDTO user);
	public void updateUser(UserDTO user);
	public void deleteUser(UserDTO user);
	public int count();
	public List<UserDTO> selectUsers();
	public UserDTO selectUser(String userid);
}
