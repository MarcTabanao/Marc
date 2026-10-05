import java.util.Scanner;

public class MarcClark {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int score;
        int Quizzes= 0;
        int AVGscore = 0;
            double Avgscore = 0;
        System.out.println("Enter the amountp);");
        score = input.nextInt();// first input

        while (score != -1) {

            AVGscore += score;
            Quizzes++;

            System.out.println("Enter a score (-1 to stop);");
            score = input.nextInt();
        }
        System.out.println("Total Score= " + AVGscore);
        System.out.println("Number of Quizzes= " + Quizzes);
        System.out.println("Average Score= " + AVGscore/Quizzes);

        input.close();
    }
}
