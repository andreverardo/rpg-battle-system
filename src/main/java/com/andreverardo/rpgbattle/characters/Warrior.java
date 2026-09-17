package com.andreverardo.rpgbattle.characters;

public class Warrior extends Character {

    public Warrior(String name) {
        super(150.0, CharacterClass.WARRIOR.getDisplayName(), 150.0, CharacterClass.WARRIOR);
    }

    @Override
    public void attack(Character target) {

    }
}
