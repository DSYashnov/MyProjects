package les24.test2;

public class Test2 {
    public static void main(String[] args) {
        Figure f1 = new Square();
        System.out.println(f1.quantitySide);
        f1.area();
        f1.perimeter();
    }
}
abstract class Figure{
    int quantitySide = 0;
    abstract void area();
    abstract void perimeter();
    void showInfo(){
        System.out.println("This is figure");
    }
}

class Circle extends Figure{
    int radius = 3;

    void perimeter(){
        System.out.println("Perimeter square = " + 2 * 3.14 * radius);
    }
    void area(){
        System.out.println("Area square = " + 3.14 * radius * radius);
    }
}
class Square extends Figure{
    int side = 10;
    void perimeter(){
        System.out.println("Perimeter square = " + side * 4);
    }
    void area(){
        System.out.println("Area square = " + side * side);
    }
}
class Rectangle extends Figure{
    int quantitySide = 4;
    int side1 = 8;
    int side2 = 5;
    void perimeter(){
        System.out.println("Perimeter square = " + (side1 * 2) + (side2 * 2));
    }
    void area(){
        System.out.println("Area square = " + side1 * side2);
    }
}
abstract class Quadrilateral extends Figure{
    void def(){
        System.out.println("This is Quadrilateral");
    }
}
