public class MultipleInheritanceThroughInterfaces {
    public static void main(String[] args) {
        Bear polarBear = new Bear();
        polarBear.eats();
    }
}

interface Herbivore {
    void eats();
}

interface Carnivore {
    void eats();
}

class Bear implements Herbivore, Carnivore {
    public void eats() {
        System.out.println("Eats other animals and plants");
    }
}