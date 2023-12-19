package com.ritvan.dojosninjas.services;

import com.ritvan.dojosninjas.models.Dojo;
import com.ritvan.dojosninjas.models.Ninja;
import com.ritvan.dojosninjas.repositories.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    @Autowired
    private NinjaRepository ninjaRepository;

    public List<Ninja>getAllNinjas(){
        return ninjaRepository.findAll();
    }

    public Ninja createNinja(Ninja ninja){
        return ninjaRepository.save(ninja);
    }

    public Ninja findNinja(Long id){
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if (optionalNinja.isPresent()){
            return optionalNinja.get();
        }else {
            return null;
        }
    }
}
