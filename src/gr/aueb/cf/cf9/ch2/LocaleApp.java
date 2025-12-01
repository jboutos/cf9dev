package gr.aueb.cf.cf9.ch2;

import java.util.Locale;

public class LocaleApp {
    public static void main(String[] args) {
        int num = 123456789;
        System.out.printf(Locale.forLanguageTag("el"), "GR locale: %,d%n", num);
        System.out.printf(Locale.US, "US locale: %,d", num);
    }
}
