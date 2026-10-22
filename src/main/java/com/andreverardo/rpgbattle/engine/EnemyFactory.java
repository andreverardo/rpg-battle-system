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
                enemy = new Warrior();
                break;
            case WIZARD:
                enemy = new Wizard();
                break;
            case HUNTER:
                enemy = new Hunter();
                break;
            case ASSASSIN:
                enemy = new Assassin();
                break;
                default:
                    enemy = null;
        }
        return enemy;
    }
}
