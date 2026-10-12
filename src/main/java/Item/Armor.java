package Item;

import Character.Player; // Make sure to import your Player class

public class Armor extends Item {
    private int absorbe;

    public Armor(String name, int maxDurability, int currentDurability, int absorbe) {
        super(name, maxDurability, currentDurability);
        this.absorbe = absorbe;
    }

    public int getAbsorbe() {
        return absorbe;
    }

    public void setAbsorbe(int absorbe) {
        this.absorbe = absorbe;
    }

    // Pass the Player object as a parameter so we can modify their stats!
    public void additionalHealth(Player player) {
        // Use the correct getter methods from your Character/Player class
        if (player.getCurrentHp() < player.getMaxHp()) {
            player.setCurrentHp(player.getMaxHp());
        } else {
            // Fix field naming consistency
            int newHp = player.getCurrentHp() + absorbe;
            player.setCurrentHp(newHp);
        }
    }
}