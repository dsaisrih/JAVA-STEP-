public class Pens {
    public static void main(String[] args) {
        // Total number of pens and number of students
        int totalPens = 14;
        int numberOfStudents = 3;

        // Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;

        // Output the results
        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed is %d",pensPerStudent, remainingPens);
    }
}