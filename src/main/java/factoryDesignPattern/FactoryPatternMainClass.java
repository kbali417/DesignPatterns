package factoryDesignPattern;

public class FactoryPatternMainClass {
  public static void main(String[] args) {
    ProfessionFactory professionFactory = new ProfessionFactory();
    Profession profession = professionFactory.getProfession("Doctor");
    profession.print();
    profession = professionFactory.getProfession("Engineer");
    profession.print();
    profession = professionFactory.getProfession("Teacher");
    profession.print();
  }
}
