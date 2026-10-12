package Character;

public abstract class Character {
    private String name;
    private int maxHp;
    private int currentHp;
    private int attackPower;
    private int defense;
    private int level;


    public Character(String name, int maxHp,int currentHp, int attackPower,int defense,int level ) {
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = currentHp;
        this.attackPower = attackPower;
        this.defense = defense;
        this.level = level;
    }

    public Character() {

    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getCurrentHpMax() {
        return currentHp;
    }
    public void setCurrentHpMax(int currentHpMax) {
        this.currentHp = currentHpMax;
    }
    public int takeDamage(int damage) {
        currentHp -= damage;
        return currentHp;
    }
    public boolean isAlive(int currentHp) {
        if (currentHp <= 0) {
            return false;
        }
        return true;
    }
    public void attack(Character target) {
           int damage = attackPower * level;
           if (damage <1) {
               damage = 1;
           }
           target.takeDamage(damage);
    }

}
