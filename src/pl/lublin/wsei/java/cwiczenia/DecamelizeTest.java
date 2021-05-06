package pl.lublin.wsei.java.cwiczenia;

import org.apache.commons.lang3.StringUtils;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

public class DecamelizeTest {

    public static void main(String[] args){

        System.out.println(StringFun.decamelize1("krótkaZabawnaFunkcja"));
        System.out.println(StringFun.decamelize2("krótkaZabawnaFunkcja"));
    }
}
