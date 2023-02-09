public class ex4 extends Lion {
    public static void main(String[] args) {
        Animal a = new Lion();
        a.food(); // food() method of class Animal is called.
        // a.food(20); // Compile time error

        Lion L = new Lion();
        L.food(); // food() method of class Lion is called.
        L.food(10); // food() method of class Lion is called.
    }
}

class Animal {
    void food() {
        System.out.println("What kind of food do lions eat?");
    } 
}

class Lion extends Animal {
    void food(int x) {
        System.out.println("Lions eat flesh");
    }
}
