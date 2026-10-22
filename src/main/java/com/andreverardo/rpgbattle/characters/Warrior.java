package com.andreverardo.rpgbattle.characters;

import com.andreverardo.rpgbattle.weapons.Sword;

public class Warrior extends Character {

    public Warrior() {
        super(150.0, CharacterClass.WARRIOR.getDisplayName(), 150.0, CharacterClass.WARRIOR, new Sword());
    }
}
