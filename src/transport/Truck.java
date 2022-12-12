package transport;

import transport.Competing;
import transport.Transport;

public class Truck extends Transport implements Competing, com.sun.jdi.connect.Transport {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void start(){
        System.out.println("Грузовик \"" + getBrand() + "\" (\"" + getModel() +"\") начал движение");
    }
    @Override
    public void stop(){
        System.out.println("Грузовик \"" + getBrand() + "\" (\"" + getModel() +"\") закончил движение");
    }

    @Override
    public void pitStop(){
        System.out.println("Грузовик прошел пит-стоп");
    }

    @Override
    public int bestLoopTime(){
        return (int)(Math.random()*13);
    }

    @Override
    public int maxSpeed(){
        return (int)(Math.random()*110);
    }
}
