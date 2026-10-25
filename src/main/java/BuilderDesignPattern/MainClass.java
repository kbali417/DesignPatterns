package BuilderDesignPattern;

public class MainClass {
  public static void main(String[] args) {

    // create the required homebuilder
    EarthQuaqeResistantBuilder earthQuaqeResistantBuilder = new EarthQuaqeResistantBuilder();

    // create an object of Director that will keep an eye on builder
    Director director = new Director(earthQuaqeResistantBuilder);

    director.manageRequiredHomeConstruction();
    Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();
    System.out.println(homeConstructedAtTheEnd);
    System.out.println(homeConstructedAtTheEnd.floor);
  }
}
