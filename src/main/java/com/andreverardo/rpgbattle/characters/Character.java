package com.andreverardo.rpgbattle.characters;

import java.util.Random;

public abstract class Character {
    private String name;
    private double currentHealth;
    private double maxHealth;
    private boolean isDefending;

    private CharacterClass characterClass;

    public abstract void attack(Character target);

    public Character(double currentHealth, String name, double maxHealth, CharacterClass characterClass) {
        this.currentHealth = currentHealth;
        this.name = name;
        this.maxHealth = maxHealth;
        this.characterClass = characterClass;
    }

    public boolean isAlive(){
        if (currentHealth <= 0) {
            return false;
        } else {
            return true;
        }
    }
    public boolean rollDefense(){
        Random rollDefense = new Random();
        boolean result = rollDefense.nextBoolean();
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(double currentHealth) {
        this.currentHealth = currentHealth;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public boolean isDefending() {
        return isDefending;
    }

    public void setIsDefending(boolean isDefending) {
        this.isDefending = isDefending;
    }

    public CharacterClass getcharacterClass() {
        return characterClass;
    }

    public void setTipoClasse(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }
}
