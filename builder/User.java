public class User {

    //required
    private String firstName;
    private String lastName;
    private String email;

    //optional
    private int age;
    private String address;
    private String phoneNumber;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public User(UserBuilder userBuilder){
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.email = userBuilder.email;
        this.address = userBuilder.address;
        this.phoneNumber = userBuilder.phoneNumber;
    }

    public static class UserBuilder{
        private String firstName;
        private String lastName;
        private String email;
        private int age;
        private String address;
        private String phoneNumber;

        public UserBuilder(String firstName, String lastName, String email){
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public UserBuilder setAge(int age){
            this.age = age;
            return  this;
        }

        public UserBuilder setAddress(String address){
            this.address = address;
            return  this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return  this;
        }

        public User build(){
            return new User(this);
        }
    }
}
