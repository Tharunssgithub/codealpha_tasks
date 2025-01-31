import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter students' grades (enter -1 to finish):");

        while (true) {
            System.out.print("Grade: ");
            int grade = scanner.nextInt();

            if (grade == -1) {
                break;
            }

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a value between 0 and 100.");
            } else {
                grades.add(grade);
            }
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            double average = calculateAverage(grades);
            int highest = findHighest(grades);
            int lowest = findLowest(grades);

            System.out.println("\nGrade Summary:");
            System.out.println("Average Score: " + average);
            System.out.println("Highest Score: " + highest);
            System.out.println("Lowest Score: " + lowest);
        }

        scanner.close();
    }

    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public static int findHighest(ArrayList<Integer> grades) {
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int findLowest(ArrayList<Integer> grades) {
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
