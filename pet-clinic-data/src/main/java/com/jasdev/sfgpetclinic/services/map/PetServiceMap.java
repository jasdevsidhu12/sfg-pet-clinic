package com.jasdev.sfgpetclinic.services.map;

import com.jasdev.sfgpetclinic.model.Pet;
import com.jasdev.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void delete(Pet owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
