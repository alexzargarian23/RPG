package Character;

public class Monster extends Character{
    private int goldGiven;
    private int exGiven;

    public Monster(String name, int maxHp, int currentHp,
                   int attackPower, int defense,
                   int level, int goldGiven, int exGiven) {
        super(name, maxHp, currentHp, attackPower, defense, level);
        this.goldGiven = goldGiven;
        this.exGiven = exGiven;
    }

    public int getGoldGiven() {
        return goldGiven;
    }
    public void setGoldGiven(int goldGiven) {
        this.goldGiven = goldGiven;
    }
    public int getExGiven() {
        return exGiven;
    }
    public void setExGiven(int exGiven) {
        this.exGiven = exGiven;
    }

}
