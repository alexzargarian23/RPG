package Item;

import Character.Player;
public class Potion extends Item {
        private int effect;
    public Potion(String name, int maxDurability,  int CurrentDurability ,int effect) {
        super(name, maxDurability, CurrentDurability);
        this.effect = effect;
    }
    public int getEffect() {
        return effect;
    }
    public void setEffect(int effect) {
        this.effect = effect;
    }
    public void usePotion(Player player) {
        int currentHp = player.getCurrentHp();
        int newHp = currentHp + effect;

        if (newHp > player.getMaxHp()) {
            newHp = player.getMaxHp(); // Cap at max HP
        }

        player.setCurrentHp(newHp);
        System.out.println(player.getName() + " healed for " + effect + " HP!");
    }


}
