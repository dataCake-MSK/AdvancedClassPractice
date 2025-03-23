package animalclass;

public class Dog extends Animal{
    String breed; // Field only in Dog

    public void roll(){
        System.out.println(name + " rolls around.");
    }

    public void roll(int cycles){
        System.out.println(name + " rolls around " + cycles + " times.");
    }
}
