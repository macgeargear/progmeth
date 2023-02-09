. Method overriding is only possible in the case of inheritance when the superclass method is overridden in its subclass. In the method overriding, method name, its argument type, the number of arguments, and return type must be the same.


2. The variable ‘x’ of Childclass is called because the object is created for the Childclass (subclass). The reference variable obj is pointing to the object of the child class.
3. When statement obj.msg() will be executed by JVM, msg() method of the child class is called because when any overridden method is called, it completely depends on the object through which it is called and the appropriate method call takes place according to this object.

Since the object has been created for the child class, so msg() method of the child class will be called, not of a parent class.

4. Baseclass obj2=new Childclass() implies that the superclass reference variable is declared equal to the child class objects.

In other words, the superclass reference variable holds the address of the created subclass objects. The reference variable ‘obj2’ is eligible to call only the members of a superclass.

5. When statement obj2.msg() will be executed by JVM, msg() method of Childclass is called. This is because the object is created for the child class.

6. When obj2.x will be executed by JVM, variable “x” of Baseclass will be called because obj2 is the reference of Baseclass (superclass).

7. obj2.y; an error will occur because variable “y” does not exist in Baseclass.

8. When obj2.msg(); will be executed, msg() of Childclass will be called because the object has been created for Childclass (subclass).

9. On the execution of obj2.msg2();, an error will occur because msg2() is a newly created method in Childclass.

Therefore, we cannot access the newly created method by creating the reference of super class and pointing to the object of subclass.