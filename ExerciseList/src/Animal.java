public class Animal {
    public String species;
    public String typology;
    public String habitat;

    public Animal(String species, String typology, String habitat) {
        this.species = species;
        this.typology = typology;
        this.habitat = habitat;
    }

    public void infoSpecies(){
        System.out.println("Species: " + species + "Typology: " + typology + "Habitat: " + habitat);
    }
}
