package creationalDesignPatterns.FactoryPattern;

public class CarTest {
    public static void main(String[] args){
        CarFactory factory = new CarFactory();
        Car suvCar = factory.getCar("SUV");
        Car sedan = factory.getCar("sedan");
        Car mini = factory.getCar("mini");
        suvCar.assemble();
        sedan.assemble();
        mini.assemble();
    }
}
