package com.andreverardo.rpgbattle.ui;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ConsoleUi {
    private ResourceBundle bundle;

    public void chooseLanguage(){
        Locale selectedLocale = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a Language: "+ "1 - Português | 2 - English");
        int languageChoice = scanner.nextInt();
        switch (languageChoice) {
            case 1:
                selectedLocale = new Locale("pt", "BR");
                break;
            case 2:
                selectedLocale = new Locale("en", "US");
                break;
            default:
                selectedLocale = new Locale("pt", "BR");
        }
        this.bundle = ResourceBundle.getBundle("messages", selectedLocale);
    }
}
