import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes conducted: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int attended = sc.nextInt();

        double percentage = (double) attended / totalClasses * 100;

        System.out.println("Attendance Percentage: " + percentage + "%");

        if (percentage >= 75) {
            System.out.println("Eligible for Exam");
        } else {
            System.out.println("Not Eligible");
        }
    }
}