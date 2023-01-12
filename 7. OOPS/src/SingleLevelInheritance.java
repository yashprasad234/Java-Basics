public class SingleLevelInheritance {
    public static void main(String[] args) {
        Fish sharks = new Fish();
        sharks.eats();
    }

}

//Base or Parent Class
class Animal {
    void eats() {
        System.out.println("Eats anything");
    }

    void breathes() {
        System.out.println("Breathes");
    }
}

//Derived or Child Class
class Fish extends Animal {
    int fins;
    void swims() {
        System.out.println("Swims");
    }
}
