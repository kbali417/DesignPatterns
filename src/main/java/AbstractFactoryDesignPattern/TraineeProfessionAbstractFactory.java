package AbstractFactoryDesignPattern;

public class TraineeProfessionAbstractFactory extends AbstractFactory {
  public Profession getProfession(String professionType) {
    if (professionType == null) {
      return null;
    }
    if (professionType.equalsIgnoreCase("Engineer")) {
      return new TraineeEngineer();
    } else if (professionType.equalsIgnoreCase("Teacher")) {
      return new TraineeTeacher();
    }
    return null;
  }
}
