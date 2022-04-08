package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.Model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner indById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
