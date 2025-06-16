package junt16thTask;

public class TriangleClassifier {

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c = 5;
        if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || c == a) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }

        String triangle=a==b?(b==c?"Equilateral":"Isosceles"):(b==c?"Isosceles":(a==c)?"Isosceles":"Scalene");
        System.out.println(triangle);
    }
}

