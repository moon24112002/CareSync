package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.web.models.User;

public interface IUserRepository extends JpaRepository<User,Long>{

	 @Query("SELECT e FROM User e WHERE e.email = :email")
	 User getUserByEmailAndPassword(@Param("email") String email);
}
