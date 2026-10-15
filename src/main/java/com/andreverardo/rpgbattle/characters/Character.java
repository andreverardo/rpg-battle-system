package com.andreverardo.rpgbattle.characters;

import com.andreverardo.rpgbattle.weapons.Weapon;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Character {
    private String name;
    private double currentHealth;
    private double maxHealth;
    private static final double MIN_DEFENSE_MITIGATION = 0.4;
    private static final double MAX_DEFENSE_MITIGATION = 0.7;
    private Weapon weapon;
    private CharacterClass characterClass;


    // Constructor da criação do personagem.
    public Character(double currentHealth, String name, double maxHealth, CharacterClass characterClass, Weapon weapon) {
        this.currentHealth = currentHealth;
        this.name = name;
        this.maxHealth = maxHealth;
        this.characterClass = characterClass;
        this.weapon = weapon;
    }

    // Metodo de atacar o oponente.
    public void attack(Character target) {
       double damageDealt = this.weapon.rollDamage();
        target.takeDamage(damageDealt);
    }

    // randomização da defesa dos personagens.
    private boolean rollDefense(){
        return ThreadLocalRandom.current().nextBoolean();
    }

    public void takeDamage(double damage){
        // Descobrir se defendeu (true ou false) usando o metodo rollDefense
        boolean defended = rollDefense();
        if(defended){
            damage = calculateDamageReduction(damage);

        }
        currentHealth -= damage;
    }
    // Calculo de redução de dano
    public double calculateDamageReduction (double damage){
        double mitigationRate = ThreadLocalRandom.current().nextDouble(MIN_DEFENSE_MITIGATION, MAX_DEFENSE_MITIGATION);
        double reducedDamage = mitigationRate * damage;
        return (damage - reducedDamage);
    }


    // Checagem se o personagem está vivo ou não.
    public boolean isAlive(){
        if (currentHealth <= 0) {
            return false;
        } else {
            return true;
        }
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


    public CharacterClass getcharacterClass() {
        return characterClass;
    }

    public void setTipoClasse(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }
}
