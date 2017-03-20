package de.mschneid.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.mschneid.User;

@RestController
public class RegistrationController {

	@RequestMapping(method = RequestMethod.GET, value = "/healthCheck")
	public String serviceHealthCheck() {
		return "register service is alive";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/register", produces = "application/json")
	public User register(@RequestBody User user) {

		User returnUser = null;

		if (user.getMail() == null) {
			throw new IllegalArgumentException("error.username");
		} else {

			returnUser = new User("mail", "password", "lastName", "name", "address");
		}

		return returnUser;
	}

	@ExceptionHandler
	void handleIllegalArgumentException(IllegalArgumentException e, HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.BAD_REQUEST.value());
	}

}
