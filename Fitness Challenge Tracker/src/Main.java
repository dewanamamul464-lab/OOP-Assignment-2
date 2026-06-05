import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int highest = 0;

        System.out.println("Enter steps for 7 days:");

        for (int i = 1; i <= 7; i++) {
            System.out.print("Day " + i + ": ");
            int steps = sc.nextInt();

            total += steps;

            if (steps > highest) {
                highest = steps;
            }
        }

        double average = total / 7.0;

        System.out.println("Total Steps = " + total);
        System.out.println("Average Steps = " + average);
        System.out.println("Highest Steps = " + highest);
    }
}