package com.andreverardo.rpgbattle.weapons;

import java.util.Random;

public abstract class Weapon {
    private final String name;
    private final double minDamage;
    private final double maxDamage;
    private final Random random = new Random();
    
    protected Weapon(String name, double minDamage, double maxDamage) {
        this.name = name;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public double rollDamage(){
        return minDamage + random.nextDouble() * (maxDamage - minDamage);
    }


    public String getName() {
        return name;
    }

    public double getMinDamage() {
        return minDamage;
    }

    public double getMaxDamage() {
        return maxDamage;
    }
}
