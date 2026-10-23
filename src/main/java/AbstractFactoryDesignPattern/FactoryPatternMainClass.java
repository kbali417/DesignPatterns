package AbstractFactoryDesignPattern;

public class FactoryPatternMainClass {
  public static void main(String[] args) {
    AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
    Profession engineer = abstractFactory.getProfession("Engineer");
    engineer.print();
  }
}
