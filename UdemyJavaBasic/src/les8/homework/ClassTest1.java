package les8.homework;

// формула для площади круга S = p r квадрат
//диаметр равен двум радиусам круга D = 2 * R
//Длина окружности круга вычисляется по формуле: P = 2 × π × r,


public class ClassTest1 {
    static final double pi = 3.14;

    static double calc(double a, double b, double c){
        double result = a * b * c;
        return result;
    }
    static void calc2(double e, double f){
        double result = e /f;
        System.out.println(result);
    }
    void radis (double rad){
        System.out.println("Radius  = " + rad);
        double a = calc(pi,2, rad);
        System.out.println("Dlinna okryjnosti = " + a);
        double sq = calc(pi, rad, rad);
        System.out.println("Square = " + sq);

    }
}
