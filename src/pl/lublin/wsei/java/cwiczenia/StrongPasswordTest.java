package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StrongPasswordGenerator;


public class StrongPasswordTest {


    public static void main(String[] args){


        String password = new StrongPasswordGenerator(12, true, true,
                true, true, "!?@#$%^.").generate();
        System.out.println(password);


    }
}