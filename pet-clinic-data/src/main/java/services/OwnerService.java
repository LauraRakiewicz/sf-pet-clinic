package services;

import model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    OwnerService findByLastName(String lastName);

}
