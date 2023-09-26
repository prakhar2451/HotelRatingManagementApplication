package com.woodhill.user.service.repositories;

import com.woodhill.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository interface provides methods for performing CRUD operations on users.
 */
public interface UserRepository extends JpaRepository<User, String> {

}
