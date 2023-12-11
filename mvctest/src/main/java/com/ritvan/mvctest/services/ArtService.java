package com.ritvan.mvctest.services;

import com.ritvan.mvctest.models.Art;
import com.ritvan.mvctest.repositories.ArtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtService {
    @Autowired
    private ArtRepository artRepository;

    public List<Art> getALlArts(){
        return artRepository.findAll();
    }
}
