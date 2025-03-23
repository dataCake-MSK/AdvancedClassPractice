import animalclass.*;

public class InheritedClassPracticeApplication {
    public static void main(String[] args) {  // pvsm tab
        Dog myDog = new Dog();
        myDog.name = "Coco";  // name is public
        myDog.roll(3);
        myDog.eat();
    }
}
