import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("CSE1301 Grade for:");
        String name = in.nextLine();
        System.out.println("Number of studios attended (out of 8):");
        double studiosAttended = in.nextDouble();
        double studiosWeighted = ((studiosAttended/8.0) * 0.15) * 100.0;
        System.out.println("Weighted studio grade (out of 15): " + studiosWeighted + "%");
        System.out.println("Average grade (as a percentage) on all quizzes after dropping the lowest two grades:");
        double averageQuizGrade = in.nextDouble();
        double quizzesWeighted = averageQuizGrade * 0.25;
        System.out.println("Weighted quiz grade (out of 25): " + quizzesWeighted + "%");
        System.out.println("Average grade (as a percentage) on all exams:");
        double averageExamGrade = in.nextDouble();
        double examsWeighted = averageExamGrade * 0.6;
        System.out.println("Weighted exam grade (out of 60): " + examsWeighted + "%");
        double totalGrade100 = (studiosWeighted + quizzesWeighted + examsWeighted) * 100.0;
        System.out.println("Total Grade: " + (Math.round(totalGrade100)/100.0) + "%");
    }

}
