package study1;

import java.util.ArrayList;

abstract class Vehicles {
    private String name;
    private int maxSpeed;
    abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

interface Flyable2 {
    void fly();
}

class Car2 extends Vehicles{

    public Car2 (int speed, String name) {
        setMaxSpeed(speed);
        setName(name);
    }
    @Override
    public void move(){
        System.out.println("도로를 따라 이동 중");
    }
}

class Airplane2 extends Vehicles implements Flyable2{
    public Airplane2 (int speed, String name) {
        setMaxSpeed(speed);
        setName(name);
    }
    @Override
    public void move(){
        System.out.println("하늘을 날아가는 중");
    }
    @Override
    public void fly(){
        System.out.println("고도 10,000피트에서 비행 중");
    }
}
public class Prac15 {
    public static void main(String[] args) {

        Vehicles car = new Car2(180, "bmw");
        Vehicles plane = new Airplane2(2400, "Boeing");
        ArrayList<Vehicles> vehicle = new ArrayList<>();
        vehicle.add(car);
        vehicle.add(plane);
        for (Vehicles vehicles : vehicle) {
            System.out.println(vehicles.getName() + "속도는: " + vehicles.getMaxSpeed());
            vehicles.move();
            if (vehicles instanceof Flyable2) {
                ((Flyable2) vehicles).fly();
            }
        }
    }
}
