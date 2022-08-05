import java.util.Scanner;

public class User {

    private int lives;
    private int correctLetters;

    public User() {
        this.lives = 9;
        this.correctLetters = 0;
    }

    public int getLives() {
        return lives;
    }

    public int getCorrectLetters() {
        return correctLetters;
    }

    public void incrementCorrectLetter() {
        this.correctLetters+=1;
    }

    public void removeLife() {
        this.lives-=1;
    }

    public char getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter");

        char letter = scanner.nextLine().charAt(0);

        return letter;
    }
}
