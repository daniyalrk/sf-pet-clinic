package bnv.com.sfpetclinic.service;

import bnv.com.sfpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
