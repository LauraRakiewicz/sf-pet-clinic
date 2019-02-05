package sfpetclinic.model;

import java.util.Locale;

public class Visit extends BaseEntity {

    private Locale date;
    private String description;
    private Pet pet;

    public Locale getDate() {
        return date;
    }

    public void setDate(Locale date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
