import java.util.*;
public class Shape {
    private ArrayList<Point> array;

    int i = 0;
    double resultperimeter = 0;
    int k = 0;
    double maxSideLength = 0;

    public Shape() {
        array = new ArrayList<Point>();
    }

    public void addPoint(Point thispoint) {
        array.add(thispoint);
    }



    public double getAverageSide() {
        return calculatePerimeter() / 10;
    }
    public double getLongestSide() {
        while (k < 9) {
            if (maxSideLength < array.get(k).distanceTo(array.get(k + 1).x, array.get(k + 1).y)) {
                maxSideLength = array.get(k).distanceTo(array.get(k + 1).x, array.get(k + 1).y);

            }
            k++;
        }
        if (array.get(9).distanceTo(array.get(0).x, array.get(0).y) > maxSideLength) {
            return array.get(9).distanceTo(array.get(0).x, array.get(0).y);
        }
        return maxSideLength;
    }

    public double calculatePerimeter() {
        while (i < 9) {
            resultperimeter = resultperimeter + array.get(i).distanceTo(array.get(i + 1).x, array.get(i + 1).y);
            i++;
        }

        return resultperimeter + array.get(9).distanceTo(array.get(0).x, array.get(0).y);
    }


}