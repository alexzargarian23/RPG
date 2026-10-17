package Location;

public enum Tile {
    ENEMY('+'),
    PLAYER('*'),
    EMPTY(' '),
    WALL('|'),
    FLOOR('_');



    private final char c;

    Tile(char c) {
        this.c = c;
    }
    public char getChar() {
        return c;
    }
    public boolean isWalkable(){
        return (this == WALL || this == FLOOR) ;
    }

}
