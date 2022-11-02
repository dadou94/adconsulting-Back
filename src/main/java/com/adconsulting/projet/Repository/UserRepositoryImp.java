package com.adconsulting.projet.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Entity;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.adconsulting.projet.Service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserRepositoryImp implements UserRepository {

	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("monUniteDePersistance");

	protected EntityManager em = emf.createEntityManager();
	//  EntityManager em;

	  public UserRepositoryImp(EntityManager em) {
	    this.em = em;
	  }
	  public void saveUser(User use) {
		  em.createNativeQuery("INSERT INTO User (Id, firstName, lastName, email, typeProjet, descriptionProjet) " +
				    "       VALUES(:id,:firstName, :lastName,:email, :typeProjet, :descriptionProjet)")
				      .setParameter("id", use.getId())
				      .setParameter("firstName", use.getFirstName())
				      .setParameter("lastName", use.getLastName())
				      .setParameter("email", use.getEmail())
				      .setParameter("typeProjet", use.getTypeProjet())
				      .setParameter("descriptionProjet", use.getDescriptionProjet())
				      .executeUpdate();
			
		}

	 

	/*
	 * @Override public void update(User use,int id) {
	 * 
	 * em.
	 * createNativeQuery("Update User u SET u.name= :name,u.firstname= :firstname, u.date_naissance= :date_naissance, u.date_creation= :date_creation WHERE u.Id=:id"
	 * ) .setParameter("id", id) .setParameter("name", use.getName())
	 * .setParameter("firstname", use.getFirstname())
	 * .setParameter("date_naissance", use.getDateNaissance())
	 * .setParameter("date_creation", use.getDateCreation()) .executeUpdate();
	 * 
	 * }
	 */

	@Override
	public User findUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByNameOrFirstname(String name, String firstname) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		//String requete = "SELECT u.name FROM User u";   
		List<User> results = em.createNativeQuery("SELECT * FROM User u",User.class).getResultList();
	    		  
	    return results;
	}

	@Override
	public List<User> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends User> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<User> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return null;
		
	}

	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
		
	}
	@Override
	public <S extends User> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<User> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
		em.createNativeQuery("DELETE from User u WHERE u.Id = :id")
		  .setParameter("id", id) 
		  .executeUpdate();
		
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends User> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends User> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends User> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends User, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return (User) em.createNativeQuery("SELECT * FROM User AS u WHERE u.Id = :id",User.class)
				     .setParameter("id", id)
					 .getSingleResult();
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}



	
	/*
	 * @Override public void update(User use, int id) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 */

	
}
