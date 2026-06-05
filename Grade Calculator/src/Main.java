import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String grade =
                (marks >= 90) ? "A+" :
                        (marks >= 80) ? "A" :
                        (marks >= 70) ? "B+" :
                        (marks >= 60) ? "B" :
                        (marks >= 50) ? "C+" :
                        (marks >= 40) ? "C" :
                        "F";

        System.out.println("Grade = " + grade);
    }
}