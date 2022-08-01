package rikkei.academy;

public class Point_2d {
    private float x= 0.0f;
    private float y= 0.0f;

    public Point_2d() {
    }

    public Point_2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[]XY= {this.x,this.y};
        return XY;
    }
    public void setXY(float x, float y) {
        float[] XY = {this.x, this.y};
    }

    @Override
    public String toString() {
        return "Point_2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
