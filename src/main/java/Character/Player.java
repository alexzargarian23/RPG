package Character;

import java.util.ArrayList;

public class Player extends Character {
    private int experience;
    private double gold;
    private ArrayList<Object> item;

    public Player(String name, int maxHp, int currentHp, int attackPower, int defense, int level, double gold) {
        // Pass stats up to the parent Character class constructor
        super(name, maxHp, currentHp, attackPower, defense, level);
        this.experience = 0;
        this.gold = gold;
        this.item = new ArrayList<>();
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }

    public ArrayList<Object> getInventory() {
        return item;
    }

    public void setInventory(ArrayList<Object> inventory) {
        this.item = inventory;
    }

    public void gainExperience(int amount) {
        this.experience += amount;
        System.out.println(getName() + " gained " + amount + " experience!");
    }

    public void loseExperience(int amount) {
        this.experience -= amount;

        if (this.experience < 0) {
            this.experience = 0;
        }

        if (this.experience == 0 && getLevel() > 1) {
            int currentLevel = getLevel();
            setLevel(currentLevel - 1);
            System.out.println("Oh no! You lost a level and are now level " + getLevel());
        }
    }
}