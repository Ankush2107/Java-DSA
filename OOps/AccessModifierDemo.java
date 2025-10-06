class Employee {

    private int id;
    private String name;

}
public class AccessModifierDemo {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.name = "Ankush";
        E1.id = 210701;
        System.out.println(E1.name);
        System.out.println(E1.id);
    }
}
