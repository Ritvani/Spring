package com.ritvan.dojosninjas.services;

import com.ritvan.dojosninjas.models.Dojo;
import com.ritvan.dojosninjas.repositories.DojoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {
    @Autowired
    private DojoRepository dojoRepository;

    public List<Dojo>getAllDojos(){
        return dojoRepository.findAll();
    }

    public Dojo createDojo(Dojo dojos){
        return dojoRepository.save(dojos);
    }

    public Dojo findDojo(Long id){
        Optional<Dojo>optionalDojo = dojoRepository.findById(id);
        if (optionalDojo.isPresent()){
            return optionalDojo.get();
        }else {
            return null;
        }
    }
}
