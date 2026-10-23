package creationalDesignPatterns.PrototypePattern;

public class Main{
    public static void main(String args[]) throws CloneNotSupportedException {
        Person original = new Person("Srinivas" , "JFS", "Hyderabad", 5);
        System.out.println("Printing Original " + original);

        Person copy1 = original.clone();
        copy1.setRole("React Developer");
        System.out.println("Printing copy " + copy1);


        
    }
}
