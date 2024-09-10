package hw2.task1;

public class Main {

    public static void main(String[] args) {
        User user = new User(
                "Max",
                "Popov",
                "admin@gmail.com",
                new Address("street", "suit", "city", "303000", "03254", "4444"),
                "0265444555555",
                "www.com",
                new Company("Apple", "sdfjhskjfsjdf", "sdfjhsjfkh")
        );

        System.out.println(user);
    }
}
