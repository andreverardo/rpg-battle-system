package com.andreverardo.rpgbattle.characters;

import com.andreverardo.rpgbattle.weapons.Handaxe;

public class Hunter extends Character {

    public Hunter() {
        super(130, CharacterClass.HUNTER.getDisplayName(), 130, CharacterClass.HUNTER, new Handaxe());
    }
}

