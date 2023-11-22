package rezolvare;

public class Pixel {
    private int red;
    private int green;
    private int blue;
    private int x;
    private int y;

    public Pixel() {
        this.red = 0;
        this.green = 0;
        this.blue = 0;
        this.x = 0;
        this.y = 0;
    }

    public Pixel(int red, int green, int blue, int x, int y) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pixel{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int calcLuminosity(){
        return (int) (0.21 * red + 0.72 * green + 0.07 * blue);
    }
    public int calcLightness(){
        return (int) ((Math.max(red,Math.max(green,blue))+(Math.min(red,Math.min(blue,green))))/2);
    }
}
