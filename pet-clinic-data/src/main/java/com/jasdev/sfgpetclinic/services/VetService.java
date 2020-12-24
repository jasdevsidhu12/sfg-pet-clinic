package com.jasdev.sfgpetclinic.services;

import com.jasdev.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long Id);
    Vet save(Vet Vet);
    Set<Vet> findAll();
}
