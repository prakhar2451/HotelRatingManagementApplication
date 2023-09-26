package com.woodhill.hotel.services;

import com.woodhill.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {
    //create

    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get single
    Hotel getHotel(String hotelId);
}
