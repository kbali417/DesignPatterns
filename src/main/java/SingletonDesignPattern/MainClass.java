package SingletonDesignPattern;

import factoryDesignPattern.Teacher;

public class MainClass {
  public static void main(String[] args) {
    SingletonClass singletonObject = SingletonClass.getSingletonInstance();
    singletonObject.simpleMethod();

    SingletonClass singletonObject2 = SingletonClass.getSingletonInstance();
    singletonObject2.simpleMethod();

    Teacher teacher = new Teacher();
    System.out.println(teacher);

    Teacher teacher2 = new Teacher();
    System.out.println(teacher2);
  }
}
