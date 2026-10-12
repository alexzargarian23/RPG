package Item;

public class Weapon extends Item {
    private int attackPower;

    public Weapon(String name, int maxDurability, int currentDurability, int attackPower) {
        super(name, maxDurability, currentDurability);
        this.attackPower = attackPower;
    }
    public int getAttackPower(){
        return attackPower;
    }
    public void setAttackPower(int attackPower){
        this.attackPower = attackPower;
    }

    public void durabilityChange(int durability){
        //todo
    }
}
