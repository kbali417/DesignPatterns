package creationalDesignPatterns.PrototypePattern;

/*  Prototype Design Pattern
It is used to create copy of an existing object instead of creating new one from Scratch .
When do we need it ?
=> When object creation is complex or costly
=>Network call , file read , Db fetch

Person Profile cloning (resume cloner )
=> Student Learnt -> JFS
-> Front end developer
-> Back end developer
-> React js developer
-> Java fulla stack developer

Person original = new Person("Srinivas" , "JFS", "Hyderabad", 5);
Person copy1 = new Person("Srinivas" , "Frontend developer", "Hyderabad", 5);
Person copy2 = new Person("Srinivas" , "Backend developer", "Hyderabad", 5);
Person copy3 = new Person("Srinivas" , "react developer", "Hyderabad", 5);

 */

public class Person implements  Cloneable{
    private String name;
    private String role;
    private String location;
    private int experience;

    public Person(String name,String role, String location,int experience){
        this.name = name;
        this.role = role;
        this.location = location;
        this.experience = experience;
    }

    public Person clone() throws CloneNotSupportedException {
        try{
            return (Person)super.clone();
        }catch (CloneNotSupportedException e){
            return null;
    }
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getLocation() {
        return location;
    }

    public int getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", location='" + location + '\'' +
                ", experience=" + experience +
                '}';
    }
}
