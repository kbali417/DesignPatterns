package creationalDesignPatterns.AbstractFactoryPattern;

public class WindowsButton implements Button {
  public void paint() {
    System.out.println("Windows Button");
  }
}
