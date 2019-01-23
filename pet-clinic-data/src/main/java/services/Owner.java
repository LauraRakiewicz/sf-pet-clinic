package services;

import java.util.Set;

public interface Owner extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
