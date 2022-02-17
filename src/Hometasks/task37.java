package Hometasks;

import java.util.Locale;

public class task37 {
    public static String bomb( String foundWord) {
       String[] myString= foundWord.toLowerCase().split(" ");
       String returnValue = "";
       int i = 0;
        while (i < myString.length) {
            if(myString[i].contentEquals("bomb")) {
                returnValue= "DUCK!";
                break;
            } else {
                returnValue="Relax, there's no bomb.";

            }
            i++;
        }
       return returnValue;


    }
}
