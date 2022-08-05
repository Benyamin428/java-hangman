public class Main {
    public static void main(String[] args) {
        Word word = new Word();
        Display display = new Display();


        word.setWord();
        display.displayUnderscores(word.getWord());
    }
}