package sfpetclinic.bootstrap;

import sfpetclinic.model.Owner;
import sfpetclinic.model.PetType;
import sfpetclinic.model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sfpetclinic.services.OwnerService;
import sfpetclinic.services.PetTypeService;
import sfpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");
        petTypeService.save(cat);

        PetType fish = new PetType();
        fish.setName("fish");
        petTypeService.save(fish);

        Owner owner1 = new Owner();
        owner1.setFirstName("Mateusz");
        owner1.setLastName("Koza");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Kazimierz");
        owner2.setLastName("Nos");

        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Waldemar");
        owner3.setLastName("Biesik");

        ownerService.save(owner3);

        System.out.println("Loaded: owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Jan");
        vet1.setLastName("Bak");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jakub");
        vet2.setLastName("Kamar");

        vetService.save(vet2);

        System.out.println("Loaded: vets");

    }
}
