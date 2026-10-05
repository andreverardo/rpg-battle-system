package com.andreverardo.rpgbattle.characters;

import com.andreverardo.rpgbattle.weapons.Dagger;

public class Assassin extends Character {
    public Assassin(String name) {
        super(90, CharacterClass.ASSASSIN.getDisplayName(), 90, CharacterClass.ASSASSIN, new Dagger());
    }

    @Override
    public void attack(Character target) {

    }
}
