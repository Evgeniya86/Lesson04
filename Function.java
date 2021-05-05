package Lesson04;

public class Function {
    double area;
    double s;

    public boolean Square(int a, int b, int c) {
        s = 1 / 2 * (a + b + c);
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area %2 == 0;
    }
}
