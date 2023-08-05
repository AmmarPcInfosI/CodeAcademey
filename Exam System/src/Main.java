import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalMark = 0;

        ExamQuestion[] questions = {
                new ExamQuestion("1. What is the capital city of Australia?",
                        new String[]{"A. Sydney", "B. Melbourne", "C. Canberra", "D. Perth"}, "C", 2),

                new ExamQuestion("2. What is the largest ocean in the world?",
                        new String[]{"A. Pacific Ocean", "B. Atlantic Ocean", "C. Indian Ocean", "D. Arctic Ocean"}, "A", 4),

                new ExamQuestion("3. What is the chemical formula for water?",
                        new String[]{"A. H2O", "B. CO2", "C. NaCl", "D. O2"}, "A", 3),

                new ExamQuestion("4. What is the name of the mathematical process that involves finding the number that, when multiplied by itself, equals another number?",
                        new String[]{"A. Addition", "B. Subtraction", "C. Multiplication", "D. Division"}, "C", 1),

                new ExamQuestion("5. Which planet is known as the \"Red Planet\"?",
                        new String[]{"A. Venus", "B. Mars", "C. Jupiter", "D. Saturn"}, "B", 3)
        };

        Scanner scanner = new Scanner(System.in);

        for (ExamQuestion question : questions) {
            System.out.println(question.question);
            for (String answer : question.answers) {
                System.out.println(answer);
            }

            String userAnswer = scanner.next().toUpperCase();
            if (userAnswer.equals(question.rightAnswer)) {
                totalMark += question.mark;
            }
        }

        scanner.close();

        System.out.println("Your Exam Mark = " + totalMark);
    }
}

class ExamQuestion {
    String question;
    String[] answers;
    String rightAnswer;
    int mark;

    ExamQuestion(String q, String[] ans, String ra, int m) {
        question = q;
        answers = ans;
        rightAnswer = ra.toUpperCase();
        mark = m;
    }
}
