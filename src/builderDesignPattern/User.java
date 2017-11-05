package builderDesignPattern;

/**
 * Created by Kitcatski on 11/5/2017.
 */
public class User {
    private final String firstName; // REQUIRED
    private final String lastName; //REQUIRED
    private int age; //OPTIONAL
    private String phoneNumber; //OPTIONAL
    private String homeAddress; //OPTIONAL

    private User(UserBuilder user) { // PRIVATE SO CAN NEVER BE CALLED!! (Outside of here)
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.age = user.age;
        this.phoneNumber = user.phoneNumber;
        this.homeAddress = user.homeAddress;
    }


    public static class UserBuilder { // INNER CLASS
        private final String firstName;
        private final String lastName;
        private int age;
        private String phoneNumber;
        private String homeAddress;

        public UserBuilder(String firstName, String lastName) { //Constructor for only required fields
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder homeAddress(String homeAddress) {
            this.homeAddress = homeAddress;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

