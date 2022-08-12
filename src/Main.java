import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Word word = new Word();
        word.setWord();

        User user = new User();
        Display display = new Display(word.getWord());

        display.displayHiddenWord(word.getWord(), new ArrayList<Integer>());

        System.out.println(word.getWord());

        while(user.getCorrectLetters() != word.getWord().length()) {
            if (user.getLives() == 0) {
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

    }
}