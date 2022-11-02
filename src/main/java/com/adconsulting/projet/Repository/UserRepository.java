package com.adconsulting.projet.Repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.transaction.annotation.Transactional;


import com.adconsulting.projet.Service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
public interface UserRepository extends JpaRepository<User, Long> {


	@Transactional
	public void saveUser(User user);

  
     
     List<User> findAll();

	 User findByNameOrFirstname(String name,String firstname);
	 
	
	 User  getUserById(int id);

	 @Query(value = "SELECT * FROM User AS u WHERE u.Id = :id", nativeQuery = true)
	User getById(int id);
	 
	 @Query(value = "select * from User u where u.Id = :id",nativeQuery = true)
	 User findUser(int id);
	
	 @Modifying
	 @Transactional
	 public void deleteById(int id);


		/*
		 * @Transactional
		 * 
		 * @Modifying(clearAutomatically = true) void update(User use,int id);
		 */
	 
	
	

}
