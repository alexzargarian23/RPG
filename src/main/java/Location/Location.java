package Location;

public class Location {
    private final String name;
    private final Tile[][] grid;
    private final int width;
    private final int height;

    public Location(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.grid = new Tile[height][width];


        for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++)
                grid[y][x] = Tile.FLOOR;
    }


    public static Location createRoom(String name, int width, int height) {
        Location loc = new Location(name, width, height);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                boolean border = (x == 0 || y == 0 || x == width - 1 || y == height - 1);
                loc.grid[y][x] = border ? Tile.WALL : Tile.FLOOR;
            }
        }
        return loc;
    }

    public Tile getTile(int x, int y) {
        if (!inBounds(x, y)) return Tile.WALL;
        return grid[y][x];
    }

    public void setTile(int x, int y, Tile tile) {
        if (inBounds(x, y)) grid[y][x] = tile;
    }

    public boolean inBounds(int x, int y) {
        return x >= 0 && y >= 0 && x < width && y < height;
    }

    public boolean isWalkable(int x, int y) {
        return inBounds(x, y) && getTile(x, y).isWalkable();
    }

    public int getWidth()  { return width; }
    public int getHeight() { return height; }
    public String getName() { return name; }
}