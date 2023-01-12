public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.legs = 4;
        dobby.breed = "Labrador";
        System.out.println(dobby.breed);
    }
}

class Animals {
    void eats() {
        System.out.println("Eats anything");
    }

    void breathes() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal {
    String breed;
}
