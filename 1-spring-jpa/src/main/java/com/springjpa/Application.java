package com.springjpa;

import java.lang.reflect.Array;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.springjpa.entity.User;
import com.springjpa.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository userRepo = context.getBean(UserRepository.class);
		User entity = new User();
		entity.setUserAge(34);
		entity.setUserCountry("India");
		entity.setUserId(3);
		entity.setUsername("vrush");
		entity.setUserPhno(123456789);
		
		User entity1 = new User();
		entity1.setUserAge(3);
		entity1.setUserCountry("India");
		entity1.setUserId(2);
		entity1.setUsername("vrta");
		entity1.setUserPhno(12345678);
		
		List<User> entitiesList = Array.asList(entity, entity1);
		userRepo.saveAll(entitiesList);
		
		Optional<User> findById=userRepo.findById(102);
		if(findById.isPresent())
		{
			System.out.println(findById.get());
		}
		
		Iterable<User> findById = userRepo.findById(Array.asList(102,34));
		findAllById.forEach(user ->{
			System.out.println(user);
		});
		
		Iterable<User> findAll =userRepo.findAll();
		findAll.forEach(user ->{
			System.out.println(user);
		});
		System.out.println("Total record :: "+userRepo.count());
		
		
		userRepo.save(entity);
		
		List<User> findAll = userRepo.findAll();
		List<User> findAll = userRepo.findAll(Sort.by("userId").ascending());
		List<User> findAll = userRepo.findAll().getContent();
		
		User userEntity = new User();
		userEntity = new User();
		Example<User> example = Example.of(userEntity);
		
		List<User> findAll1 = (List<User>) userRepo.findAll();
		
		for(User user : findAll1)
		{
			System.out.println(user);
		}
	}

}
