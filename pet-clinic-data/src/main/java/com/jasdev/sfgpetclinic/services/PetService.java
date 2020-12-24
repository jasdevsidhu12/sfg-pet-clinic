package com.jasdev.sfgpetclinic.services;

import com.jasdev.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long Id);
    Pet save(Pet Pet);
    Set<Pet> findAll();
}
