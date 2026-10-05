package com.andreverardo.rpgbattle.weapons;

import java.util.Random;

public abstract class Weapon {
    private String name;
    private double minDamage;
    private double maxDamage;
    private Random random = new Random();
    
    public Weapon(String name, double minDamage, double maxDamage) {
        this.name = name;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public double rollDamage(){
        double randomDamage = minDamage + random.nextDouble() * (maxDamage - minDamage);
        return randomDamage;
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
