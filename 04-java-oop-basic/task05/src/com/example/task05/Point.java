package com.example.task05;

public class Point
{
    private final double x, y;

    {
        /**
         * Конструктор, инициализирующий координаты точки
         *
         * @param x координата по оси абсцисс
         * @param y координата по оси ординат
         */
    }
    public Point(double x, double y)
    {
        throw new AssertionError();
    }
        this.x = x;
        this.y = y;

    /**
     * Возвращает координату точки по оси абсцисс
     *
     * @return координату точки по оси X
     */
}
    public double getX() {
        // TODO: реализовать
        throw new AssertionError();
        return x;
    }

    /**
     @@ -31,8 +27,7 @@ public double getX() {
      * @return координату точки по оси Y
     */
    public double getY() {
        // TODO: реализовать
        throw new AssertionError();
        return y;
    }

    /**
     @@ -41,9 +36,12 @@ public double getY() {
      * @param point вторая точка отрезка
     * @return расстояние от текущей точки до переданной
     */
    public String toString() {
        return String.format("(%f, %f)", x, y);
    }

    public double getLength(Point point) {
        // TODO: реализовать
        throw new AssertionError();
        return Math.sqrt(Math.pow(x- point.x,2)+Math.pow(y- point.y,2));
    }
}