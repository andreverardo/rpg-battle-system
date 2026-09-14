package com.andreverardo.rpgbattle;

public enum CharacterClass {
    HUNTER("Caçador"),
    WIZARD("Mago"),
    ASSASSIN("Assassino" ),
    WARRIOR("Cavaleiro");

    private final String displayName;


    CharacterClass(String displayName) {

        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
