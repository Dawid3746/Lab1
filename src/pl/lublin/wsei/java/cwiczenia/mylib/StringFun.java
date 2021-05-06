package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;
import java.util.Random;


public class StringFun {

    public static String anarchize(String str) {

        String res = "";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {
                res += Character.toLowerCase(str.charAt(i));
            } else {
                res += Character.toUpperCase(str.charAt(i));
            }
        }
        return res;
    }


    public static String camelize(String str) {

        String res = "";

        String[] tokens = StringUtils.split(str, ' ');
        res += tokens[0].toLowerCase();

        for (int i = 1; i < tokens.length; i++) {
            res += StringUtils.capitalize(tokens[i].toLowerCase());
        }
        return res;
    }


    public static String decamelize1(String a) {

        String res = "";

        char[] tokens = a.toCharArray();
        res += Character.toUpperCase(tokens[0]);

        for (int i = 1; i < tokens.length; i++) {
            if (Character.isUpperCase(tokens[i])) {
                res += " " + tokens[i];
            } else {
                res += tokens[i];
            }
        }

        return res;
    }

    public static String decamelize2(String a) {

        String[] tokens = StringUtils.splitByCharacterTypeCamelCase(a);
        String res = "";

        for (String token : tokens) {
            if (token.equals(tokens[0])) {
                res += StringUtils.capitalize(token);
            } else {
                res += " " + token;
            }
        }
        return res;
    }


    public static boolean isPalindrome(String str) {

        String SpecialCharactersString = ",./;'[]<>?: \"{}`-=_+|!@#$%^&*()";

        for (int i = 0; i < str.length(); i++) {
            int reverseIdx = str.length() - i - 1;

            int check1 = SpecialCharactersString.indexOf(str.charAt(i));
            int check2 = SpecialCharactersString.indexOf(str.charAt(reverseIdx));

            if (check1 != -1 || check2 != -1) continue;
            else {
                if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(reverseIdx))) {
                    return false;

                }
            }
        }
        return true;
    }

    public static String shuffle(String x){

        Random random = new Random();
        String res = "";

        int end = x.length();

        for (int i = 0; i < end; i++){

            char p = x.charAt(random.nextInt(x.length()));
            res += p;

            x = StringUtils.remove(x, p);
        }
        return res;
    }


}
