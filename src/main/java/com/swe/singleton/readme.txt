
Problems:

1.Ensure that a class has just a single instance. Why would anyone want to control how many instances a class has? 
The most common reason for this is to control access to some shared resource—for example, a database or a file.

2.Provide a global access point to that instance. 
 Remember those global variables that you (all right, me) used to store some essential objects?
 While they’re very handy, they’re also very unsafe since any code can potentially overwrite 
 the contents of those variables and crash the app.

Solutions:

1.Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.

2.Create a static creation method that acts as a constructor. Under the hood, 
  this method calls the private constructor to create an object and saves it in a static field.
  All following calls to this method return the cached object.