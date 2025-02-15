package regex.advancedproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguage {
    public static void main(String[] args) {
        // input text
        String text ="I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        ArrayList<String> languages = new ArrayList<>(Arrays.asList(new String[] {"java","python","JavaScript"}));

        // call extractProgrammingLanguage method to extract all programming language
        ArrayList<String> result = extractProgrammingLanguage(text, languages);

        // print result
        System.out.println(result);
    }

    public static ArrayList<String> extractProgrammingLanguage(String text, ArrayList<String> languages){
        // regex
        String regex =  "(?i)\\b("+String.join("|",languages)+")\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // create list of programming language
        ArrayList<String> languageList = new ArrayList<>();

        // find and add programming language from the text
       while(matcher.find()){
           languageList.add(matcher.group());
       }

       // return list of programming language
       return languageList;
    }
}
