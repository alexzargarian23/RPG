package Item;

public abstract class Item {
    private String name;
    private int MaxDurability;
    private int CurrentDurability;

    public Item(String name, int maxDurability, int currentDurability) {
        this.MaxDurability = maxDurability;
        this.name = name;
        this.CurrentDurability = currentDurability;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getMaxDurability() {
        return this.MaxDurability;
    }
    public void setMaxDurability(int maxDurability) {
        this.MaxDurability = maxDurability;
    }
    public int getCurrentDurability() {
        return this.CurrentDurability;
    }
    public void setCurrentDurability(int currentDurability) {
        this.CurrentDurability = currentDurability;
    }


}
