package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Scanner;
import java.util.Random;

public class Main {
    /**
     * Funkcja main
     *
     * @param args argumenty funkcji main
     */
    public static void main(String[] args) {

        Account ac = new Account();
        ac.setName("dawid Sałek");
        System.out.println(ac.getName());


    }
}