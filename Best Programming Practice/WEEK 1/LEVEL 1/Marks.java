public class Marks {
    public static void main(String[] args) {
        // Marks obtained by Sam
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;

        // Total marks obtained
        int totalMarks = mathsMark + physicsMark + chemistryMark;

        // Number of subjects
        int numberOfSubjects = 3;

        // Calculate average
        double averageMarks = (double) totalMarks / numberOfSubjects;

        // Output the result
        System.out.printf("Sam's average mark in PCM is %.2f", averageMarks);
    }
}