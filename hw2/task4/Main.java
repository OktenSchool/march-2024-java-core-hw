package hw2.task4;

public class Main {
    public static void main(String[] args) {
        User user = new User(
                1,
                "Popov",
                "popov@gmail.com",
                5,
                Gender.MALE,
                new Car("BMW", 2000, 250)
        );
        user.getSkills().add(new Skill("js", 5));
        user.getSkills().add(new Skill("python", 15));
        user.getSkills().add(new Skill("java", 20));

        System.out.println(user);
    }
}
