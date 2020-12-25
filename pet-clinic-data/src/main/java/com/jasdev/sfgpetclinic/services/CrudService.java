package com.jasdev.sfgpetclinic.services;

import java.util.Set;

// <T, ID> represents generic template, it can <class, integer>  <integer, integer>
public interface CrudService<T, ID> {
    Set<T> findAll();
    T findById(ID id);
    T save(T t);
    void delete(ID id);
}
