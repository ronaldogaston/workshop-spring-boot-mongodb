package com.ronaldogaston.workshopmongo.resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldogaston.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User ronaldo = new User("1", "Ronaldo Gaston", "ronaldogaston@outlook.com");
		User rafael = new User("2", "Rafael Gaston", "rafaelgaston@outlook.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(ronaldo, rafael));
		return ResponseEntity.ok().body(list);
	}

}
