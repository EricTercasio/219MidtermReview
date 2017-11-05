package builderDesignPattern;

/**
 * Created by Kitcatski on 11/5/2017.
 */
public class Main {
    public static void main(String[] args){
        // Here is how the user is created
        User user = new User.UserBuilder("Eric","Tercasio").age(10)
                .homeAddress("1 The Road").phoneNumber("631-666-6621").build();
        //But you can leave out as many OPTIONAL fields as you want..
        User user2 = new User.UserBuilder("John","Hernandez").build();

    }
}
