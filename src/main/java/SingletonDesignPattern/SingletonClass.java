package SingletonDesignPattern;

public class SingletonClass {
  public static SingletonClass singletonInstance = new SingletonClass();

  private SingletonClass() {}

  // create only getters
  public static SingletonClass getSingletonInstance() {
    return singletonInstance;
  }

  public void simpleMethod() {
    System.out.println("hashcode of singletonInstance: " + singletonInstance);
  }
}
