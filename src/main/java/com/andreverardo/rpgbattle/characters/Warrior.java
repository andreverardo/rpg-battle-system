package com.andreverardo.rpgbattle.characters;

import com.andreverardo.rpgbattle.weapons.Sword;

public class Warrior extends Character {

    public Warrior(String name) {
        super(150.0, CharacterClass.WARRIOR.getDisplayName(), 150.0, CharacterClass.WARRIOR, new Sword());
    }
    @Override
    public void attack(Character target) {

    }
}
