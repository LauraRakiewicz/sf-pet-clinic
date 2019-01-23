package services;

public interface OwnerService extends CrudService<OwnerService, Long> {

    OwnerService findByLastName(String lastName);

}
