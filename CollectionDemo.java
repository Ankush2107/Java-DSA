import java.util.HashSet;
public class CollectionDemo {
    public static void main(String[] args) {
        HashSet<String> uniqueAttendance = new HashSet<>();

        uniqueAttendance.add("Alice");
        uniqueAttendance.add("Bob");
        uniqueAttendance.add("Charlie");
        uniqueAttendance.add("Alice");
        uniqueAttendance.add("Alice");

        System.out.println(uniqueAttendance);
    }
}
