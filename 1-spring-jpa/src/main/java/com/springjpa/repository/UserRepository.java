package com.springjpa.repository;
//import org.springframework..data.repository.CrudRepository;
/*
 * import org.springframework.data.repository.CrudRepository;
 * 
 * import com.springjpa.entity.User; public interface UserRepository extends
 * CrudRepository<User, Integer> {
 * 
 * }
 */

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.entity.User;
//@Repository
public interface UserRepository extends JpaRepository<User , Integer>
{
	
}