package inheritence;

/**
 * Created by Kitcatski on 11/5/2017.
 */
public class Organism {
    private String species;
    private double age;
    private double health;

    public Organism(){}

    public Organism(String species, double age, double health) {
        this.species = species;
        this.age = age;
        this.health = health;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Organism{" +
                "species='" + species + '\'' +
                ", age=" + age +
                ", health=" + health +
                '}';
    }
}
