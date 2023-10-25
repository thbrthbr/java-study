package study1;


// 다형성
// 하나의 인터페이스나 클래스를 여러가지 방식으로 동작하게 하는 것

// 1. 일반 클래스를 사용한 다형성
class Animal2 {
    public void sound(){
        System.out.println("동물은 소리를 냅니다");
    }
}
class Dog2 extends Animal2{
    @Override
    public void sound(){
        System.out.println("멍멍");
    }
}
class Cat2 extends Animal2{
    @Override
    public void sound(){
        System.out.println("멍멍");
    }
}

// 추상클래스를 사용한 다형성
abstract class Shape {
    abstract double area();
}

class Circle2 extends Shape{
    private double radius;
    public Circle2(double r){
        this.radius = r;
    }
    @Override
    double area() {
        return radius * radius * Math.PI;
    }
}

class Rectangle2 extends Shape {
    private double width;
    private double height;
    public Rectangle2(double w, double h){
        this.width = w;
        this.height = h;
    }
    @Override
    double area(){
        return width * height;
    }
}

// 인터페이스를 사용한 다형성

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly(){
        System.out.println("새가 난다");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly(){
        System.out.println("비행기가 난다");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // 다형성을 활용하여 Animal 타입의 참조변수로 Dog와 Cat객체를 참조
        Dog2 dog = new Dog2();
        Cat2 cat = new Cat2();
        dog.sound();
        cat.sound();

        Shape s1 = new Circle2(3.3);
        Shape s2 = new Rectangle2(3, 6.1);
        Shape[] s3 = {new Circle2(3.4), new Rectangle2(4,7)};
//        System.out.printf("%.2f", s1.area()).println();
//        System.out.printf("%.2f", s2.area()).println();
        for(Shape s : s3){
            System.out.printf("%.2f", s1.area()).println();
        }
        // 객체가 특정 클래스나 인터페이스의 인스턴스인지 확인하는 연산자
//        instanceof


        Flyable f1 = new Bird();
        Flyable f2 = new Airplane();
        f1.fly();
        f2.fly();
    }
}
