package com.lastofus.player;

public class Player {

    private String name;
    private int health = 100;
    public int attack = 0;
    private Backpack jansport = null;
    private boolean hasGun = false;
    private boolean hasFriend = false;
    private boolean hasHatchet = false;

    public Player(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public boolean hasGun() {
        return hasGun;
    }

    public void setHasGun(boolean hasGun) {
        if(hasGun) {
            System.out.println("You equipped a gun");
        }
        else {
            System.out.println("The gun is now broken. You throw it away.");
        }
        this.hasGun = hasGun;
    }

    public boolean hasHatchet() {
        return hasHatchet;
    }

    public void setHasHatchet(boolean hasHatchet) {
        if(hasHatchet) {
            System.out.println("You equipped a hatchet");
        }
        else {
            System.out.println("The hatchet is now broken. You throw it away.");
        }
        this.hasHatchet = hasHatchet;
    }

    public void wearBackpack (Backpack pack) {
        jansport = pack;
    }

    public Backpack getBackpack() {
        return jansport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health < 0) {
            health = 0;
        }
        if(health > 100) {
            health = 100;
        }
        this.health = health;
    }

    public void setAttack(int value) {
        this.attack = value;
    }

    public int getAttack() {
        return attack;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", jansport=" + jansport +
                '}';
    }

    public boolean hasFriend() {
        return this.hasFriend;
    }

    public void setFriend(boolean b) {
        this.hasFriend = b;
    }
}