import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        
        String[][] questions = {
            {"What is the largest mammal?", "A. Elephant", "B. Blue Whale", "C. Giraffe", "D. Lion", "B"},
            {"Which country is known as the Land of the Rising Sun?", "A. China", "B. India", "C. Japan", "D. South Korea", "C"},
            {"Who wrote the play 'Romeo and Juliet'?", "A. William Shakespeare", "B. Charles Dickens", "C. Jane Austen", "D. Mark Twain", "A"},
            {"What is the chemical symbol for water?", "A. H2O", "B. CO2", "C. NaCl", "D. O2", "A"},
            {"Which planet is closest to the Sun?", "A. Venus", "B. Mercury", "C. Mars", "D. Jupiter", "B"}
        };
        
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i][0]);
      
            for (int j = 1; j <= 4; j++) {
                System.out.println(questions[i][j]);
            }
            
            System.out.print("Enter your answer (A, B, C, or D): ");
            String userAnswer = scanner.nextLine().toUpperCase(); 
            
            if (userAnswer.equals(questions[i][5])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + questions[i][5] + ".\n");
            }
        }
        
        double percentage = (double) score / questions.length * 100;
        System.out.println("Your final score: " + percentage + "%");
        
        scanner.close();
    }
}
