package bnv.com.sfpetclinic.service;

import bnv.com.sfpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Set<Pet> findAll();
    Pet save(Pet pet);
}
