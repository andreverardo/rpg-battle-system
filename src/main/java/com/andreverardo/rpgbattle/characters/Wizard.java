package com.andreverardo.rpgbattle.characters;

import com.andreverardo.rpgbattle.weapons.Wand;

public class Wizard extends Character {


    public Wizard(String name) {
        super(110, CharacterClass.WIZARD.getDisplayName(), 110, CharacterClass.WIZARD, new Wand());
    }

    @Override
    public void attack(Character target) {

    }
}
