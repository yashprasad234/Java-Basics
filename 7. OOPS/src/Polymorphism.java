public class Polymorphism {
    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        System.out.println(calc.sum(3,4));
//        System.out.println(calc.sum(2.5f,4.5f));
//        System.out.println(calc.sum(2,4, 1));
        Deer thehiran = new Deer();
        thehiran.eats();
    }
}

//Compile time Polymorphism (method overloading)
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

//Run time polymorphism method overriding
class Deer extends Animal { //class animal is defined in a different file within the same package
    void eats() {
        System.out.println("eats grass");
    }
}
