package com.technicalajeet.learnerlession;

public class TA2_strings {
    public static void main(String[] args) {
//        String concat(String s)  -> concat(..) method is used to concatenate two Strings.
        String firstString = "Technical ";
        String secondString = "Ajeet";
        String finalString = firstString.concat(secondString);
        System.out.println("combined string is  " + finalString);
        System.out.println("===========================");

        //int length() -> length(..) method is used to find the length of a String.

        String thirdString = "Ajeet Yadav";
        int length = thirdString.length();
        System.out.println("length of thirdString is " + length);
        System.out.println("===========================");

//        char charAt(int index) -> charAt(..) method is used to return us the character of a String if we supply it with index value.

        char pos = finalString.charAt(2);
        System.out.println("the character is " + pos);
        System.out.println("Note :Index starts counting from 0.");
        System.out.println("===========================");


//        String replace (char oldCharacter, char newCharacter) -> replace(..) method is used to replace an existing character with a new character.
        String fouthString = "Hello";
        String replacedString = fouthString.replace('l', 'g');
        System.out.println("Replaced string " + replacedString);
        System.out.println("================================");


//String toLowerCase() -> toLowerCase() replaces all uppercase letters to lowercase.
        String lowerCaseString = finalString.toLowerCase();
        System.out.println(lowerCaseString);
        System.out.println("=============================");

        //String toUpperCase() -> toUpperCase() replaces all uppercase letters to toUpperCase.

        String upperCaseString = finalString.toUpperCase();
        System.out.println(upperCaseString);
        System.out.println("=============================");

//        String trim() -> If there are any additional spaces in a String. trim() is used to delete those extra spaces.
        String trimString = "Technical Ajeet    ";
        System.out.println(trimString.trim());
        System.out.println("============================");


//        String substring(int index) & String substring(int index,int length) -> substring(..) method is used to fetch a chunk of letters from a String.
        String string1 = "Hello";
        String subStr1 = string1.substring(2);
        String substr2 = string1.substring(1, 3);
        System.out.println(subStr1);
        System.out.println(substr2);
        System.out.println("============================");


    }


}
