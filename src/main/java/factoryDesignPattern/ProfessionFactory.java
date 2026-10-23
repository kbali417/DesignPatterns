package factoryDesignPattern;

public class ProfessionFactory {
  public Profession getProfession(String professionType) {
    if (professionType == null) {
      return null;
    }
    if (professionType.equalsIgnoreCase("Doctor")) {
      return new Doctor();
    } else if (professionType.equalsIgnoreCase("Engineer")) {
      return new Engineer();
    } else if (professionType.equalsIgnoreCase("Teacher")) {
      return new Teacher();
    }
    return null;
  }
}
