package Hometasks;

import java.util.Locale;

public class task38 {
    public static int countVowels(String str) {
        char[] vowels = new char[] {'a','e', 'i','o','u'};
        char[] strToArray=str.toLowerCase().toCharArray();
        int count =0; // количество гласных букв в строке
        // i - количество итераций
         for(int i = 0; i <strToArray.length; i++) {
             for (int j=0; j<vowels.length; j++) {
                 if(strToArray[i]==vowels[j]) {
                     count++;

                 }
             }

         } return count;

    }
}
