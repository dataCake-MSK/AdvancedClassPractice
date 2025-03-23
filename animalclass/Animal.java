package animalclass;

public class Animal {
    public String name;  // default (package-private) access -> public
    int age;

    // no constructor

    public void eat(){
        System.out.println(name + " eats food");
    }
}
