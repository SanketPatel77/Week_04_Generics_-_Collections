package regex.basicregexproblems.extractionproblems;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String[] args) {
        // input text
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        // call method extractDates, returns list of dates of type string
        ArrayList<String> dates = extractDates(text);

        // print result
        System.out.println(dates);
    }

    public static ArrayList<String> extractDates(String text){
        // regex to validate username
        String regex =  "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // create ArrayList to store words
        ArrayList<String> dates = new ArrayList<>();

        // find and add words to list
        while(matcher.find()){
            dates.add(matcher.group());
        }

        // return list of words
        return dates;
    }
}
