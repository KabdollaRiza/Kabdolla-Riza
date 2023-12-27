import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\user\\IdeaProjects\\untitled2\\src\\coordinates");
        Scanner scan = new Scanner(file);
        Point point = new Point(scan.nextInt(), scan.nextInt());
        Point point1  = new Point(scan.nextInt(), scan.nextInt());
        Point point2 = new Point(scan.nextInt(), scan.nextInt());
        Point point3 = new Point(scan.nextInt(), scan.nextInt());
        Point point4 = new Point(scan.nextInt(), scan.nextInt());
        Point point5 = new Point(scan.nextInt(), scan.nextInt());
        Point point6 = new Point(scan.nextInt(), scan.nextInt());
        Point point7 = new Point(scan.nextInt(), scan.nextInt());
        Point point8 = new Point(scan.nextInt(), scan.nextInt());
        Point point9 = new Point(scan.nextInt(), scan.nextInt());

        Shape shape = new Shape();
        shape.addPoint(point);
        shape.addPoint(point1);
        shape.addPoint(point2);
        shape.addPoint(point3);
        shape.addPoint(point4);
        shape.addPoint(point5);
        shape.addPoint(point6);
        shape.addPoint(point7);
        shape.addPoint(point8);
        shape.addPoint(point9);

        System.out.println(point.toString());
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongestSide());
        System.out.println(shape.getAverageSide());

    }
}