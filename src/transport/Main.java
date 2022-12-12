package transport;

import transport.Bus;
import transport.Car;
import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada","Granta", 1.7);
        Car audi = new Car ("Audi", "A8 50 L TDI quattro", 3.0);
        Car bmw = new Car ("BMW", "Z8", 2.8);
        Car kia = new Car ("Kia", "Sportage 4-го поколения", 2.4);

        Bus liAZ = new Bus("ЛиАЗ", "Курсор", 5.0);
        Bus mAZ = new Bus("МАЗ", "Междугородец", 3.5);
        Bus liaz = new Bus("ЛиАЗ", "Курсор1", 3.0);
        Bus maz = new Bus("МАЗ", "Междугородец1", 3.7);

        Truck krAZ = new Truck("КрАЗ", "С 18", 6.2);
        Truck kamAZ = new Truck("КамАЗ", "4308", 6.2);
        Truck gAZ = new Truck("ГАЗ", "22177", 6.2);
        Truck volvo = new Truck("Volvo", "FL7", 6.2);

        lada.pitStop();
        mAZ.pitStop();
        gAZ.pitStop();

        DriverB ivan = new DriverB("Иван", true, 3);
        DriverC petr = new DriverC("Петр", true, 6);
        DriverD vasiliy = new DriverD("Василий", true, 01);

        ivan.startMove(lada);
        ivan.stopMove(lada);
        ivan.refill(lada);

        ivan.printInfo(lada);


    }
}