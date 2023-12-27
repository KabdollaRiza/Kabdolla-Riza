import java.lang.Math;
public class Point{
    int x;
    int y;
    public Point(int x1, int y1){
        this.x=x1;
        this.y=y1;
    }
    public double distanceTo(int x2, int y2){
        return Math.sqrt(Math.pow(x-x2, 2)+ Math.pow(y-y2, 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}