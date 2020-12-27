package com.jasdev.sfgpetclinic.services.map;

import com.jasdev.sfgpetclinic.model.Vet;
import com.jasdev.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
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
