package creationalDesignPatterns.SingletonPattern;

// Creational patterns are all about object creation mechanisms—how objects are created, controlled,
// and reused.
//
// The Singleton pattern specifically ensures:
//
// Only one instance of a class is created
//
// Provides a global access point to that instance
//
// 🧠 Simple way to remember:
//
// Creational → Creating objects
//
// Singleton → Control creation (only one object)

public class SingletonDesignPattern {

  // private static instance of the class
  private static volatile SingletonDesignPattern singletonDesignPattern;

  // private constructor to prevent/avoid instantiation/object
  private SingletonDesignPattern() {}

  // public static getInstance method to get access to the Instance/Object
  public static SingletonDesignPattern getInstance() {

    if (singletonDesignPattern == null) {
      synchronized (SingletonDesignPattern.class) {
        singletonDesignPattern = new SingletonDesignPattern();
      }
    }
    return singletonDesignPattern;
  }

  // Individual public method of the class
  public void displayMessage() {
    System.out.println("Design patterns info");
  }
}
