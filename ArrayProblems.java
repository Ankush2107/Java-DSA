public class ArrayProblems {
    public static void main(String[] args) {
        int numbers[];
        // numbers = new int[]{1, 2, 3, 4, 5};
        numbers = new int[5];
        numbers[0] = 25;
        numbers[1] = 2;
        numbers[2] = 5;
        numbers[3] = 65;
        numbers[4] = 45;

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
