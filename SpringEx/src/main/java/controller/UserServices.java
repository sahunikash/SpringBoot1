package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import com.Repository.CustomerRepository;
import com.dto.UserEntity;
import com.service.impl.UserServiceImpl;

@RestController
@Component
public class UserServices {
@Autowired
UserServiceImpl userServices;
	
	@RequestMapping("/getuserinfo")
	public List<UserEntity> getUserDetails() {
		return userServices.findAll();
	}

	@RequestMapping(value = "/updateUserinfo", method = RequestMethod.POST)
	public ResponseEntity updateUserDetails(@RequestBody UserEntity users) {
		System.out.println(users.getFirstName());
		userServices.save(users);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

}
