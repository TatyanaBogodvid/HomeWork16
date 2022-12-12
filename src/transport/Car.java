package transport;

public class Car extends Transport implements Competing, com.sun.jdi.connect.Transport {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public void start(){
        System.out.println("Автомобиль \"" + getBrand() + "\" (\"" + getModel() +"\") начал движение");
    }
    @Override
    public void stop(){
        System.out.println("Автомобиль \"" + getBrand() + "\" (\"" + getModel() +"\") закончил движение");
    }

    @Override
    public void pitStop(){
        System.out.println("Автомобиль прошел пит-стоп");
    }

    @Override
    public int bestLoopTime(){
        return (int)(Math.random()*7);
    }

    @Override
    public int maxSpeed(){
        return (int)(Math.random()*200);
    }
}
