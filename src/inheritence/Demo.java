package inheritence;

/**
 * Created by Kitcatski on 11/5/2017.
 */
public class Demo {
    public static void main(String[] args){
        Organism organism = new Organism("Worm",20,1);
        Animal cat = new Animal("Cat",20,1,"Jeffery");
        System.out.println(organism.toString());
        System.out.println(cat.toString());
        organism = new Animal();// Works because organism is parent class
                                // Is not "Destroying" any field
        //cat = new Organism(); // Compile-time error because we are destorying fields
        System.out.println(organism.toString()); //simply sets the owner to null
    }
}
