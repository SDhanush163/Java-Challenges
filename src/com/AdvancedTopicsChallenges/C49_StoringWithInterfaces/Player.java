package com.AdvancedTopicsChallenges.C49_StoringWithInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write() {
        List<String> writer = new ArrayList<>();
        writer.add(name);
        writer.add(String.valueOf(hitPoints));
        writer.add(String.valueOf(strength));
        writer.add(weapon);

        return writer;
    }

    @Override
    public void read(List<String> fields) {
        if (fields == null || fields.size() == 0) return;
        this.name = fields.get(0);
        this.hitPoints = Integer.parseInt(fields.get(1));
        this.strength = Integer.parseInt(fields.get(2));
        this.weapon = fields.get(3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
