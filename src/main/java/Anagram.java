import java.util.Arrays;

/**
 * To find if two given strings are an Anagram of each other
 * Ex:- SILENT = LISTEN
 */
public class Anagram {

    public void findAnagram(String str1, String str2) {

        if (str1.length() == str2.length()) {

            char[] charArr1 = str1.toCharArray();
            char[] charArr2 = str2.toCharArray();
            Arrays.sort(charArr1);
            Arrays.sort(charArr2);

            if (Arrays.equals(charArr1,charArr2)) {
                System.out.println(str1 + " and " + str2 + " are ANAGRAMS of each other!");
            }
        }
    }

}
