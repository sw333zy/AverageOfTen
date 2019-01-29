import java.util.Scanner;

public class AverageOfTen {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter exam score: ");

        int score1 = keyboard.nextInt();
        int score2 = keyboard.nextInt();
        int score3 = keyboard.nextInt();
        int score4 = keyboard.nextInt();
        int score5 = keyboard.nextInt();
        int score6 = keyboard.nextInt();
        int score7 = keyboard.nextInt();
        int score8 = keyboard.nextInt();
        int score9 = keyboard.nextInt();
        int score10 = keyboard.nextInt();

        int total = (score1 + score2 + score3+ score4 + score5 +score6 + score7 + score8 + score9 + score10);
        int avg = (total / 10);

        System.out.println("The average exam score is: " + avg);
    }
}
