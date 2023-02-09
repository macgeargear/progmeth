# Behavior of Instance Variables in case of Inheritance
1. Inside the main() method, an object of class Q has been created. The reference variable q is pointing to the object of class Q.

2. Variable ‘a’ of Q is called because the reference variable for class Q has been created and is pointing to the object of class Q.

3. P p = new Q(); means the superclass reference variable is declared equal to the child class object.
4. Variable ‘a’ of P is called because, in the main() method, the reference variable for class P has been created but the object is created for the child class whereas, the object is referring itself to the superclass.

As the object is referring to the superclass at compile-time, Java compiler checks whether an instance variable is present or not in superclass.

If the instance variable is present in the superclass at the runtime, it will call the instance variable of the superclass.