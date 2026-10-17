package Movment;

import java.io.Console;

public class Move {

    private int x_axis;
    private int y_axis;

    private int x_MaxSize;
    private int y_MaxSize;

    public Move(int startX, int startY, int x_MaxSize, int y_MaxSize) {
        this.x_axis = startX;
        this.y_axis = startY;
        this.x_MaxSize = x_MaxSize;
        this.y_MaxSize = y_MaxSize;
    }

    public void changeRoom(int newX, int newY, int newMaxX, int newMaxY) {
        this.x_axis = newX;
        this.y_axis = newY;
        this.x_MaxSize = newMaxX;
        this.y_MaxSize = newMaxY;
        System.out.println("Entered a new room! Boundaries are now: " + newMaxX + "x" + newMaxY);
    }

    public void move() {
        Console console = System.console();
        if (console == null) return;

        System.out.print("Enter move (W/A/S/D): ");
        String input = console.readLine();

        int nextX = this.x_axis;
        int nextY = this.y_axis;

        switch (input.toUpperCase()) {
            case "W" -> nextY++;
            case "S" -> nextY--;
            case "A" -> nextX--;
            case "D" -> nextX++;
            default -> {
                System.out.println("Invalid input!");
                return;
            }
        }

        if (MovmentAllowed(nextX, nextY)) {
            this.x_axis = nextX;
            this.y_axis = nextY;
        } else {
            System.out.println("Movement blocked! You hit the wall of this room.");
        }
    }

    public boolean MovmentAllowed(int targetX, int targetY) {
        return targetX >= 0 && targetY >= 0 && targetX <= x_MaxSize && targetY <= y_MaxSize;
    }

    public int getX_axis() { return x_axis; }
    public int getY_axis() { return y_axis; }
    public void setX_axis(int x_axis) { this.x_axis = x_axis; }
    public void setY_axis(int y_axis) { this.y_axis = y_axis; }
}
