package inheritence;

/**
 * Created by Kitcatski on 11/5/2017.
 */
public class Animal extends Organism{
    private String owner; // Animal has owner, but organism does not.

    public Animal(){}
    public Animal(String species, double age, double health, String owner) {
        super(species, age, health); //Organism is the "Super", "Parent" or "Base" class
        this.owner = owner;          //While Animal is the "Sub" "Extended" or "Child" class
    }
    //Only needs getters and setters for its unique variables
    //The rest are inherited by the super class
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    //Example of "Overriding" a method that is in the parent class
    //It will recognize this method over the method in the parnet
    @Override
    public String toString() {
        return "Animal{" +
                "owner='" + owner + '\'' +
                '}';
    }
}
