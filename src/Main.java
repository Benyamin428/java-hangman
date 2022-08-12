import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Word word = new Word();
        word.setWord();

        User user = new User();
        Display display = new Display(word.getWord());

        //Displays the initial underscores to represent the word length
        display.displayHiddenWord(word.getWord(), new ArrayList<Integer>());

        System.out.println(word.getWord());

        //Loops through until the user has guessed the word
        while(user.getCorrectLetters() < word.getWord().length()) {
            //Breaks the loops if the user's life has dropped to 0
            if (user.getLives() == 0) {
                display.drawHangman(user.getLives());
                System.out.println("The word was " + word.getWord());
                break;
            }

            display.drawHangman(user.getLives());

            System.out.println("Lives: " + user.getLives());
            char letterEntered = user.getUserInput();
            List<Integer> indexPositionsOfLetter = word.indexOfLetterInWord(letterEntered);

            //Checks to see if the letter the user has entered is in the word
            if (!indexPositionsOfLetter.isEmpty()) {
                if (!display.getHiddenWord().contains(String.valueOf(letterEntered))) {
                    user.incrementCorrectLetter(indexPositionsOfLetter.size());
                }
            }
            else {
                user.removeLife();
            }

            display.displayHiddenWord(word.getWord(), indexPositionsOfLetter);

        }

        if (user.getLives() > 0) {
            System.out.println("Well done you guessed the word!");
        }

    }
}