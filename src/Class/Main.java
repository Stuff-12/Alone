package Class;

public class Main {
    public static void main(String[] args) {
        Employee em = new Employee("Alex", "Ts", 100500, "developer");

        System.out.println(em.getName());

        System.out.println(em.hashCode());
    }
}
