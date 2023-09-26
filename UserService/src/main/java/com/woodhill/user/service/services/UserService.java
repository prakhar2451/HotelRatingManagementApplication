package com.woodhill.user.service.services;

import com.woodhill.user.service.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService interface provides methods for performing user operations.
 */
@Service
public interface UserService {

    /**
     * Saves a new user.
     *
     * @param user the user to be saved
     * @return the saved user
     */
    User saveUser(User user);

    /**
     * Gets all users.
     *
     * @return a list of all users
     */
    List<User> getAllUser();

    /**
     * Gets a single user by ID.
     *
     * @param userId the ID of the user to get
     * @return the user with the given ID
     */
    User getUser(String userId);

    /**
     * Deletes a user by ID.
     *
     * @param userId the ID of the user to delete
     */
}
