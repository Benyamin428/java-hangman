public class Display {

    private String hiddenWord;

    public Display(String word) {
        this.hiddenWord = "";
        for (int i=0; i<word.length(); i++) {
            this.hiddenWord+="_";
        }
    }

    public void displayHiddenWord(String word, int indexPosition) {
        if (indexPosition != -1) {
            char[] letterArr = this.hiddenWord.toCharArray();
            letterArr[indexPosition] = word.charAt(indexPosition);
            this.hiddenWord = String.valueOf(letterArr);
        }
        System.out.println(this.hiddenWord);
    }

}
