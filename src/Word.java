import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Word {
    private String word;
    private List<String> words;
    private int length;

    public Word() {
        this.word = "";
        this.words = new ArrayList<>();

        try
        {
            File file = new File("WordList.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null)
            {
                words.add(line);
            }
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println(e);;
        }

        this.length = words.size();
    }

    public String getWord() {
        return word;
    }
    public void setWord() {
        int randomIndexPosition = (int)(Math.random() * (length + 1));
        this.word = words.get(randomIndexPosition);
    }

    public ArrayList<Integer> indexOfLetterInWord(char letter) {
        ArrayList<Integer> indexPositions = new ArrayList<Integer>();
        for (int i=0; i<word.length(); i++) {
            if (word.charAt(i) == letter) {
                indexPositions.add(i);
            }
        }
        return indexPositions;
    }
}

