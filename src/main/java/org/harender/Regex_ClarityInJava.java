package org.harender;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_ClarityInJava {

    /*
    Regex in Java provides 3 classes and 1 interface which are as follows:
    1- Pattern Class :
                Used for defining patterns
    2- Matcher Class :
                Used for performing match operations on text using patterns
    3- PatternSyntaxException Class :
                Used for indicating syntax error in a regular expression pattern
    4- MatchResult Interface :
                Used for representing the result of a match operation

    */
    public static void main(String[] args) {
        patternClassInRegex();
    }

    public static void patternClassInRegex(){

        System.out.println("Extract Digits from String");
        Pattern pattern= Pattern.compile("-\\d+");
        String input="dqdcw233sf fs eef33-3q4s56-78";
        Matcher matcher=pattern.matcher(input);
        int negatives=0;
        while (matcher.find()) {
            System.out.print(matcher.group()+" ");
            negatives = negatives + Integer.parseInt(matcher.group());
        }
        int positives=0;
        System.out.println("");
        pattern=Pattern.compile("-?\\d+");
        matcher=pattern.matcher(input);
        while (matcher.find()){
            System.out.print(matcher.group()+" ");
            positives+=Integer.parseInt(matcher.group());
        }

        System.out.println("\nTotal of Negatives : "+negatives);
        System.out.println("Total of Positives : "+positives);
        negatives*=2;
        System.out.println("Output= "+ (positives+negatives));

        int ans=0;
        Pattern ptrn=Pattern.compile("-?\\d+");
        Matcher mtchr=ptrn.matcher(input);
        while (mtchr.find())
            ans+=Integer.parseInt(mtchr.group());
        System.out.print("bkjw"+ans);
    }
}
