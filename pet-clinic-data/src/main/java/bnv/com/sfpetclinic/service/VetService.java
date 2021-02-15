package bnv.com.sfpetclinic.service;

import bnv.com.sfpetclinic.model.Owner;
import bnv.com.sfpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Set<Vet> findAll();
    Vet save(Vet vet);
}
