package builder;


public class Main {

    public static void main(String[] args) {
        User user = User.builder().name("Lesi").age(18).occupation("BAnalyst").occupation("Procrastinator").build();
        System.out.println(user);
    }
}
