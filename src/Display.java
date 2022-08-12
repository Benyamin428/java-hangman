import java.util.List;

public class Display {

    private String hiddenWord;

    //Displays the underscores to represent the amount of letters in the word
    public Display(String word) {
        this.hiddenWord = "";
        for (int i=0; i<word.length(); i++) {
            this.hiddenWord+="_";
        }
    }

    //Displays the letter to the user if they have guessed the corresponding letter correctly
    public void displayHiddenWord(String word, List<Integer> indexPositions) {
        if (!indexPositions.isEmpty()) {
            char[] letterArr = this.hiddenWord.toCharArray();
            for(int i=0; i<indexPositions.size(); i++) {
                letterArr[indexPositions.get(i)] = word.charAt(indexPositions.get(i));
            }
            this.hiddenWord = String.valueOf(letterArr);
        }
        System.out.println(this.hiddenWord);
    }

}
