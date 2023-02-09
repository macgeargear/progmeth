1. Inside the main method,

a. When an object of class Hi will create, the constructor of class Hi will be called immediately. But, the super keyword present in the first line of class Hi will call its parent class Hello.

Since the instance block is present in the parent class, it will be executed first before the execution of parent class constructor and calls the show() method.

Since the show() method has been overridden in the child class, therefore, show() method of class Hi will be called. Hence, the output will be “Hi method”.

b. After executing the instance block, the constructor of the parent class will be executed. The output will be “Hello constructor”.

c. Inside the parent class constructor, the show() method of class Hi will be called. So, the output is “Hi method” because the object is created for the child class Hi.

d. After execution of complete parent class constructor, the constructor of Hi (child class) will be called.

2. The show() method of class Hi is called because the object is created for the child class.

3. The output will be the same for lines Hello obj1 = new Hi(); and obj1.show();.