import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Word word = new Word();
        word.setWord();

        User user = new User();
        Display display = new Display(word.getWord());

        display.displayHiddenWord(word.getWord(), new ArrayList<Integer>());

        while(user.getCorrectLetters() != word.getWord().length()) {
            if (user.getLives() == 0) {
                System.out.println("Game Over");
                System.out.println("The word was " + word.getWord());
                break;
            }
            System.out.println("Lives: " + user.getLives());
            char letterEntered = user.getUserInput();
            List<Integer> indexPositionsOfLetter = word.indexOfLetterInWord(letterEntered);

            display.displayHiddenWord(word.getWord(), indexPositionsOfLetter);

            if (!indexPositionsOfLetter.isEmpty()) {
                user.incrementCorrectLetter(indexPositionsOfLetter.size());
            }
            else {
                user.removeLife();
            }
        }

        System.out.println("Well done you guessed the word!");

    }
}