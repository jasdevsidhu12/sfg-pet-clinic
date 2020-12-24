package com.jasdev.sfgpetclinic.services;

import com.jasdev.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long Id);
    Owner save(Owner owner);
    Set<Owner>  findAll();
}