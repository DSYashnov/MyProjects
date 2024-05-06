package les24.test4;

public class Test4 {
    JumpAble j1 = new Human();
    JumpAble j2 = new Animal();

}
class Human implements JumpAble{
    public void jump() {
        System.out.println("human jumps");
    }
}
class Animal implements JumpAble{
    public void jump() {
        System.out.println("animal jumps");
    }
}
interface JumpAble {
    void jump();
}
interface A {
    void abc();
}
interface B extends A, JumpAble {
    void def();
}
abstract class C implements B {
}
