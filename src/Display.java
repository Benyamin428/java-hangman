public class Display {

    public void displayUnderscores(String word) {
        String wordHidden = "";
        for (int i=0; i<word.length(); i++) {
            wordHidden+=" _ ";
        }
        System.out.println(wordHidden);
    }

}
