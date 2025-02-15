package regex.basicregexproblems.extractionproblems;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public static void main(String[] args) {
        //print result
        String text = "Visit https://www.google.com and http://example.org for more info.";
        // call extractEmail method and it returns list of emails
        ArrayList<String> links = extractLinks(text);

        // print email
        System.out.println(links);
    }

    public static ArrayList<String> extractLinks(String text){
        // regex to validate username
        String regex =  "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(\\S*)?\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // create ArrayList to store links
        ArrayList<String> links = new ArrayList<>();

        // find and add emails to list
        while(matcher.find()){
            links.add(matcher.group());
        }

        // return list of emails
        return links;
    }
}
