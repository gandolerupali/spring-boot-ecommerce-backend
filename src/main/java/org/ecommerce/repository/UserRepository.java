package org.ecommerce.repository;


import java.util.Optional;

import org.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByuserName(String userName);
	Optional<User> findByEmailAndPasswordAndUserType(String email, String password, String userType);
}
