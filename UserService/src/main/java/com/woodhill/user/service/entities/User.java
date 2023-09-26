package com.woodhill.user.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * User entity represents a user in the system.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "micro_users")
public class User {

    /**
     * The unique identifier of the user.
     */
    @Id
    @Column(name = "ID")
    private String userId;

    /**
     * The name of the user.
     */
    @Column(name = "NAME", length = 20)
    private String name;

    /**
     * The email address of the user.
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * A brief description of the user.
     */
    @Column(name = "ABOUT")
    private String about;

    /**
     * A list of ratings that the user has received.
     *
     * This field is transient, meaning that it is not persisted to the database.
     * This is because the ratings of a user can be fetched from a separate service, such as a rating service.
     */
    @Transient
    private List<Rating> ratings = new ArrayList<>();
}
