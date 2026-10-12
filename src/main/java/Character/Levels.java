package Character;

public enum Levels {
FIRST(1,1),
SECOND(2,2),
THIRD(3,3),
FOURTH(4,4);

private final int level;
private final int boost;

    Levels(int level, int boost) {
        this.level = level;
        this.boost = boost;
    }
    public int getLevel() {
        return level;
    }
    public int getBoost() {
       return boost;
    }

}
