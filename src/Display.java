import java.util.List;

public class Display {

    private String hiddenWord;

    public Display(String word) {
        this.hiddenWord = "";
        for (int i=0; i<word.length(); i++) {
            this.hiddenWord+="_";
        }
    }

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
