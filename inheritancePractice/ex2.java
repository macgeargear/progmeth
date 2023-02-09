public class ex2 extends ChildClass{
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.msg();
        obj.msg2();

        BaseClass obj2 = new ChildClass();
        System.out.println("value of x: " + obj2.x);
        obj2.msg();
    }
}

class BaseClass {
    int x = 20;
    // Overridden method.
    void msg() {
        System.out.println("Base class method");

    }
}

class ChildClass extends BaseClass {
    int x = 50;
    int y = 100;
    // Overridden method.
    void msg() {
        System.out.println("Child class first method");

    }

    void msg2() {
        System.out.println("Child class second method");

    }
}