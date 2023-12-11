package com.ritvan.savetravels.repositories;

import com.ritvan.savetravels.models.SaveTravels;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelRepository extends CrudRepository<SaveTravels, Long> {
    List<SaveTravels>findAllBy();
}
