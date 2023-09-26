package com.woodhill.user.service.entities;

import com.woodhill.hotel.entities.Hotel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Rating entity represents a rating that a user has given to a hotel.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    /**
     * The unique identifier of the rating.
     */
    private String ratingId;

    /**
     * The identifier of the user who gave the rating.
     */
    private String userId;

    /**
     * The identifier of the hotel that the rating is for.
     */
    private String hotelId;

    /**
     * The feedback that the user provided with the rating.
     */
    private String feedback;

    /**
     * The rating that the user gave, on a scale of 1 to 10.
     */
    private int rating;

    private Hotel hotel;

}
