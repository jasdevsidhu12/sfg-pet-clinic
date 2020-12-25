package com.jasdev.sfgpetclinic.services.map;

import com.jasdev.sfgpetclinic.model.Vet;
import com.jasdev.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>  {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet save(Vet Vet) {
        return super.save(Vet.getId(), Vet);
    }

    @Override
    public void delete(Vet Vet) {
        super.delete(Vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
