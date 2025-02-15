package regex.basicregexproblems.extractionproblems;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllCapitalizedWord {
    public static void main(String[] args) {
        // input text
        String text = "The EiffelTower is in Paris and the Statue of Liberty is in New York.";

        // extract all words start with Capital letter and store in ArrayList
        ArrayList<String> capitalWords = extractAllCapitalWords(text);

        // print result
        System.out.println(capitalWords);
    }

    public static ArrayList<String> extractAllCapitalWords(String text){
        // regex to validate username
        String regex =  "\\b[A-Z]+[a-zA-Z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // create ArrayList to store words
        ArrayList<String> capitalWords = new ArrayList<>();

        // find and add words to list
        while(matcher.find()){
            capitalWords.add(matcher.group());
        }

        // return list of words
        return capitalWords;
    }
}
