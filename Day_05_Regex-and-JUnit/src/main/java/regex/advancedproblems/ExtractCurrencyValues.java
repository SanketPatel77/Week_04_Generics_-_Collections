package regex.advancedproblems;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        // input text
        String text ="The price is $45.99, and the discount is 10.50.";

        // call extractCurrencyValues method
        ArrayList<String> result = extractCurrencyValues(text);

        // print result
        System.out.println(result);
    }

    public static ArrayList<String> extractCurrencyValues(String text){
        // regex
        String regex =  "\\$?\\d+\\.\\d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // create list of currency values
        ArrayList<String> currencies = new ArrayList<>();

        // find and add programming language from the text
        while(matcher.find()){
            currencies.add(matcher.group());
        }

        // return list of currency values
        return currencies;
    }
}
