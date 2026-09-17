package com.andreverardo.rpgbattle.engine;

import com.andreverardo.rpgbattle.characters.*;
import com.andreverardo.rpgbattle.characters.Character;

import java.util.Random;

public class EnemyFactory {

    public static com.andreverardo.rpgbattle.characters.Character createRandomEnemy(){
        Random random = new Random();
        CharacterClass[] allClasses = CharacterClass.values();
        CharacterClass drawnClass = allClasses[random.nextInt(allClasses.length)];
        Character enemy;

        switch (drawnClass) {
            case WARRIOR:
                enemy = new Warrior(drawnClass.getDisplayName());
                break;
            case WIZARD:
                enemy = new Wizard(drawnClass.getDisplayName());
                break;
            case HUNTER:
                enemy = new Hunter(drawnClass.getDisplayName());
                break;
            case ASSASSIN:
                enemy = new Assassin(drawnClass.getDisplayName());
                break;
                default:
                    enemy = null;
        }
        return enemy;
    }
}
