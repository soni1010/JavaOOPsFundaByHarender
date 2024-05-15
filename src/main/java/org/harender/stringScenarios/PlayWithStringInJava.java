package org.harender.stringScenarios;

public class PlayWithStringInJava {

    public static void main(String[] args) {
    //

    //Insert a String into another String in Java
        //insertOneStringIntoAnotherString("i am  for Geeks and a Geek","Geeks",4);

    //Java program to print Even length words in a String
        //evenLengthWordsInString("i am   G eeks for Geeks and a Geek");

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
