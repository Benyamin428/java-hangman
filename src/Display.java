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

    public String getHiddenWord() {
        return hiddenWord;
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

    public void drawHangman(int lives) {
        switch(lives) {
            case 6:
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("___|___");
                break;
            case 5:
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 4:
                System.out.println("   ____________");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   | ");
                System.out.println("___|___");
                break;
            case 3:
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 2:
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |           |");
                System.out.println("   |           |");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 1:
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |           |");
                System.out.println("   |           |");
                System.out.println("   |          / \\ ");
                System.out.println("___|___      /   \\");
                break;
            case 0:
                System.out.println("Game Over");
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |          _|_");
                System.out.println("   |         / | \\");
                System.out.println("   |          / \\ ");
                System.out.println("___|___      /   \\");
                break;
        }
    }

}
