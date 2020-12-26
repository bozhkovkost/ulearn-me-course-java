package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolygonalLine
{

    private ArrayList<Point> points = new ArrayList<>();
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points)
    {
        // TODO: реализовать
        for(Point p : points){
            this.points.add(new Point(p.getX(), p.getY()));
        }
    }

    /**
     @@ -20,7 +28,7 @@ public void setPoints(Point[] points) {
      * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point)
    {
        // TODO: реализовать
        points.add(new Point(point.getX(),point.getY()));
    }

    /**
     @@ -30,7 +38,7 @@ public void addPoint(Point point) {
      * @param y координата по оси ординат
     */
    public void addPoint(double x, double y)
    {
        // TODO: реализовать
        points.add(new Point(x,y));
    }

    /**
     @@ -39,8 +47,10 @@ public void addPoint(double x, double y){
      * @return длину ломаной линии
     */
    public double getLength()
    {
        // TODO: реализовать
        throw new AssertionError();
        double sum = 0;
        for (int i=0; i<points.size()-1; i++){
            sum+=points.get(i).getLength(points.get(i+1));
        }
        return sum;
    }
}
