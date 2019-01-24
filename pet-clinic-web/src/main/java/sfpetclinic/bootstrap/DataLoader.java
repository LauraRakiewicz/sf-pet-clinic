package sfpetclinic.bootstrap;

import model.Owner;
import model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import services.OwnerService;
import services.VetService;
import services.map.OwnerServiceMap;
import services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Mateusz");
        owner1.setFirstName("Koza");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Kazimierz");
        owner2.setFirstName("Nos");

        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setId(3L);
        owner3.setFirstName("Waldemar");
        owner3.setFirstName("Biesik");

        ownerService.save(owner3);

        System.out.println("Loaded: owners");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Jan");
        vet1.setLastName("Bak");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Jakub");
        vet2.setLastName("Kamar");

        vetService.save(vet2);

        System.out.println("Loaded: vets");

    }
}
