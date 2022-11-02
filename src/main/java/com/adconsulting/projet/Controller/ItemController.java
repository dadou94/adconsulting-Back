package com.adconsulting.projet.Controller;

import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import ch.qos.logback.classic.pattern.Util;

import org.hibernate.annotations.common.util.impl.Log;
import org.hibernate.mapping.Map;
import com.adconsulting.projet.Repository.UserRepository;
import com.adconsulting.projet.Repository.UserRepositoryImp;
import com.adconsulting.projet.Service.User;
import java.util.Map.Entry;  

@CrossOrigin(origins = "", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class ItemController {
	
	@Autowired
	 protected  UserRepositoryImp userRepository;
	
	
		/*
		 * @GetMapping(path="/item", produces = {"application/json", "application/xml"})
		 * public Item getItem() { Item item = new Item(); item.setCode("XV-32");
		 * item.setName("Weird stuff"); item.setQuantity(10); return item; }
		 */
	
//	@ResponseStatus(code=HttpStatus.CREATED)
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping(path="/users/create", consumes="application/json" , produces="application/json")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		
		userRepository.saveUser(user);
        return ResponseEntity
            .created(URI
                     .create(String.format("/users/%s", user.getTypeProjet())))
            .body(user);
	}
	
	
}

