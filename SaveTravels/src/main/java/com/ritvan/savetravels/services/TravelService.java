package com.ritvan.savetravels.services;

import com.ritvan.savetravels.models.SaveTravels;
import com.ritvan.savetravels.repositories.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelService {
    @Autowired
    private TravelRepository travelRepository;

    public List<SaveTravels>getAllTravels(){
        return (List<SaveTravels>) travelRepository.findAll();
    }
}
