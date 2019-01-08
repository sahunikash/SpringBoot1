package com.services;

import java.util.List;
import com.dto.UserEntity;

public interface UserServices {
	List<UserEntity> findUserEntity(String name);
	void save(UserEntity entity);
	List<UserEntity> findAll();
}
