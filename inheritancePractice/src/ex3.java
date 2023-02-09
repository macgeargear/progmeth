public class ex3 {
    public static void main(String[] args) {
        Hi obj = new Hi();
        obj.show(); 


        Hello obj1 = new Hi();
        obj1.show();
    }
}

class Hello {
    // Declare an instance block.
    { 
        show();
    }

    Hello() {
        System.out.println("Hello constructor");
        show();
    }

    void show() {
        System.out.println("Hello method");
    }
}

class Hi extends Hello {
    Hi () {
        System.out.println("Hi constructor");
    }

    @Override
    void show() {
        System.out.println("Hi method");
    }
}
