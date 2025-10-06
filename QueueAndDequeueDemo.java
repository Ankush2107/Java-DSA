
import java.util.LinkedList;
import java.util.Queue;

public class QueueAndDequeueDemo {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();

        tasks.offer("workout");
        tasks.offer("dance");
        tasks.offer("breakfast");
        tasks.offer("sleep");
        tasks.offer("homework");

        System.out.println(tasks);
    }
}
