import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubs = sc.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numSubs; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100 : )");
            int marks = sc.nextInt();
            while (marks < 0 || marks > 100) {
                System.out.print("Invalid marks. Please enter again (0-100): ");
                marks = sc.nextInt();
            }
            totalMarks += marks;
        }

        double avgPercentage = (double) totalMarks / numSubs;
        char grade;

        if (avgPercentage >= 90) {
            grade = 'A';
        } else if (avgPercentage >= 80) {
            grade = 'B';
        } else if (avgPercentage >= 70) {
            grade = 'C';
        } else if (avgPercentage >= 60) {
            grade = 'D';
        } else if (avgPercentage >= 36) {
            grade = 'E';  
        } else {
            System.out.println("\nFail");
            System.out.println("\nBetter Luck Next Time");
            grade = 'F';
        }

        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", avgPercentage) + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
