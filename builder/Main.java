public class Main {
    public static void main(String args[]){
        User user = new User.UserBuilder("Ken", "Kaneki", "ken@gmail.com")
                .setAge(18).setAddress("temp").setPhoneNumber("123").build();

        System.out.println(user);

        User user2 = new User.UserBuilder("Benn", "Beckman", "benn@gmail.com")
                .setAge(29).build();

        System.out.println(user2);
    }
}
