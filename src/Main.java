public class Main {
    public static void main(String[] args) {
        Word word = new Word();
        word.setWord();

        User user = new User();
        Display display = new Display(word.getWord());

        display.displayHiddenWord(word.getWord(), -1);

        while(user.getCorrectLetters() != word.getWord().length() || user.getLives() == 0) {
            System.out.println("Lives: " + user.getLives());
            char letterEntered = user.getUserInput();
            int indexPositionOfLetter = word.indexOfLetterInWord(letterEntered);

            display.displayHiddenWord(word.getWord(), indexPositionOfLetter);

            if (indexPositionOfLetter != -1) {
                user.incrementCorrectLetter();
            }
            else {
                user.removeLife();
            }
        }

    }
}