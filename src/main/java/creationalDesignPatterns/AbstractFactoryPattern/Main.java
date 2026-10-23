package creationalDesignPatterns.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args){
        GUIFactory factory;
        String os = "MAC";
        if(os.equals("windows")){
            factory = new WindowsFactory();
        }
        else{
            factory = new MacFactory();
        }
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.paint();
        checkbox.check();
    }
}

//Advantages
//
//✅ Promotes loose coupling
//✅ Easy to switch product families
//✅ Ensures compatible objects are used together
//✅ Follows Open/Closed Principle


//Disadvantages
//
//❌ Increases number of classes
//❌ Can become complex for small projects

