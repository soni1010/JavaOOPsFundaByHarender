package org.harender.stringScenarios;

import java.util.Arrays;

public class PlayWithStringInJava {

    public static void main(String[] args) {
    //program to check whether a string is a Palindrome
        //checkWhetherStringIsPalindrome("abba");

    //Insert a String into another String in Java
        //insertOneStringIntoAnotherString("i am  for Geeks and a Geek","Geeks",4);

    //Java program to print Even length words in a String
        //evenLengthWordsInString("i am   G eeks for Geeks and a Geek");

    //Program To Check Whether Two Strings Are Anagram - same characters with same number of times only location different
        //System.out.println(isAnagram("silent","ientSl"));

    //Reverse a string in Java
    /*
    Objects of String are immutable.
    String class in Java does not have reverse() method, however, the StringBuilder class has built-in
    reverse() method.
    StringBuilder class do not have toCharArray() method, while String class does have toCharArray() method


    */
        reverseAStringInJava("Harender");

    }

    public static void reverseAStringInJava(String inputString){

    }

    public static boolean isAnagram(String str1,String str2){

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char[] str1Chars=str1.toCharArray();
        char[] str2Chars=str2.toCharArray();

        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

        if(str1Chars.length!=str2Chars.length){
            System.out.println("String "+str1+" and "+str2+" are Anagram: ");
            return false;
        }

        for(int i=0;i<str1Chars.length;i++)
            if(str1Chars[i]!=str2Chars[i]) {
                System.out.println("String "+str1+" and "+str2+" are Anagram: ");
                return false;
            }

        System.out.println("String "+str1+" and "+str2+" are Anagram: ");
        return true;
    }

    public static void checkWhetherStringIsPalindrome(String inputString){
        System.out.println("String is Palindrome or not :");
        boolean result=false;
        //Naive Approach to Check Palindrome String in Java
        String rev = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            rev = rev + inputString.charAt(i);
        }
        if (inputString.equals(rev)) {
            result = true;
        }
        System.out.println("Input String is Palindrome (Native Approach):"+result);

        //Two Pointer Approach for Palindrome Program in Java
        int i=0,j=inputString.length()-1;
        while (i < j) {
            if (inputString.charAt(i) != inputString.charAt(j))
                result=false;
            i++; j--;
        }
        System.out.println("Input String is Palindrome (Two Pointer Approach):"+result);

        //Recursive Approach for Palindrome Program in Java
        //We need to create another method to make it recursive
        isPalindrome(inputString);

    }
    public static boolean isPalindrome(int i,int j,String str) {
        if (i >= j)
             return true;
        if (str.charAt(i) != str.charAt(j))
            return false;
        // checking everything again recursively
        return isPalindrome(i + 1, j - 1, str);
    }
    public static void isPalindrome(String inputString) {
        System.out.println("Input String is Palindrome or not (Recursive Approach):"+isPalindrome(0, inputString.length() - 1, inputString));
    }

    public static void insertOneStringIntoAnotherString(String originalString,String stringToBeInserted,int index){
        System.out.println("New String Become :");
        System.out.println(originalString.substring(0,index+1)+stringToBeInserted+originalString.substring(index+1));

//
// Create a new string
//       String newString = new String();
//        for (int i = 0; i < originalString.length(); i++) {
//
//            // Insert the original string character
//            // into the new string
//            newString += originalString.charAt(i);
//
//            if (i == index) {
//
//                // Insert the string to be inserted
//                // into the new string
//                newString += stringToBeInserted;
//            }
//        }
//
        // return the modified String
 //       System.out.println(newString);
    }

    public static void evenLengthWordsInString(String inputString){
        System.out.println("Even Length words in Input String - \""+inputString+"\""+ " are :");
        inputString=inputString.replaceAll("\\s+"," ");
        // Splits Str into all possible tokens
        for (String word : inputString.split(" ")) {
            // if length is even
            if (word.length() % 2 == 0) {
                // Print the word
                System.out.println(word);
            }

        }
    }

}
