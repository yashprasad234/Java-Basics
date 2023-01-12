public class SuperKeywordImplementation {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Aneemal {
    String color;
    Aneemal() {
        System.out.println("animal constructor called");
    }
}

class Horse extends Aneemal {
    Horse() {
        super(); //done automatically by java
        System.out.println("horse constructor called");
        super.color = "brown";
    }
}
