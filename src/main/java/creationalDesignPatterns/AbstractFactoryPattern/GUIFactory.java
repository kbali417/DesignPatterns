package creationalDesignPatterns.AbstractFactoryPattern;

public interface GUIFactory {
  Button createButton();

  Checkbox createCheckbox();
}
