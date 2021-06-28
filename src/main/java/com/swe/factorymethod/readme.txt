
Applicability:

1.Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
2.If we have same workflow(method) with different class(Object).



Advantage:

1. The Factory Method separates product construction code from the code that actually uses the product.
   Therefore it’s easier to extend the product construction code independently from the rest of the code



How to Implement:

1.Make all products follow the same interface. This interface should declare methods that make sense in every product.

2.Add an empty factory method inside the creator class. The return type of the method should match the common product interface.

3.In the creator’s code find all references to product constructors.
 One by one, replace them with calls to the factory method, while extracting the product creation code into the factory method.



                                     --- CreatorClass--
                                     |                 |
                            productCreatorA     productCreatorB   
                                     |                  | 
                            actualProduct A    actualProduct B
