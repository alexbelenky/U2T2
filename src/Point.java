public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int equal) {
        this.x = equal;
        this.y = equal;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int NewX) {
        x = NewX;
    }

    public void setY(int NewY) {
        y = NewY;
    }

    public String coordinate() {
        return String.format("(%d, %d)", x, y);
    }

    public String quadrant() {
        if (x > 0 && y > 0) {
            return "I";
        } if (x > 0 && y < 0) {
            return "IV";
        } if (x < 0 && y < 0) {
            return "III";
        } if (x < 0 && y > 0) {
            return "II";
        } if(x == 0 && y == 0) {
            return "origin";
        } if(x == 0 || y == 0) {
            return "on the axis";
        }
        return null;
    }
}
