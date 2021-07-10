# What is Class in Scala

- Similar to JAVA, blueprint of any object
- Constructor argument are mutable / immutable, based on var or val assignment
- Only when member variables defined with var or val, getter and setter are available.

** Object in SCALA is a singleton object -> no need to initiate

    ## Primary Constructor

`example - class DemoClass(var name:String, var age:Int);`

- the argument can be defined as **private**
`example - class DemoClass(private var name:String, var age:Int)`
  
# Auxiliary Constructor
- Alternative constructor(as a method) for a Class
- its default value is **"this"**
- One Class can have more than 1 auxiliary constructor, provided -
    they have different signature
    new constructor always calls the existing constructors
  
example in "DemoClass.scala"

# Encapsulation
Encapsulations, is concept of writing data, with data & method that act on the data.
Data hiding, its all about protecting data from erroneous inputs. In the main class, privatize the main data point & define method for setting it

# Overloading (Polymorphism)
when methods of **same-name** are differentiated by the passing parameter/argument is called 'Overloading in Polymorphism'
Example - OverLoadingBoxClass and OverLoadingBoxObject
  
# Inheritance
- Definition
  Inheritance - when a class acquires properties of another class
  keyword - 'extends'
  private variables and methods cannot be acquired
  the extends class can be called as base class, parent class, super class, extending class is called subclass
  
** Method overriding in SCALA needs to use keyword "Override"

example in "Inheritance" package - ShapesClass is extend by RectangleClass and SquareClass.
The default area() method of ShapesClass is 'override' by area() class of RectangleClass and SquareClass respectively.

# Abstract 
Purpose -  Key requirement for Abstract, is to mandate definition of required method for sub-class inheriting super-class.
-  Definition
   Class which has empty methods and fully defined methods, when a class has 1 abstract class, the class should be defined as abstract class.
   - Abstract class cannot be instantiated, the inheriting class should be instantiated.
   - mandatory for inheriting class to define all abstract methods
    - abstract class provide common interface for all subclasses to be interchanged with all other subclasses.
    
Definition of Abstract Class is similar to Java - keyword '**abstract**' before the class name, 
for method, its bit different. Not defining body to the method is means of definition of abstract method in SCALA.

# Traits 
- Scala like Java, doesn't allow multiple inheritance. To avoid the complexity arise from multiple inheritance.
- Scala got traits, similar to Interface in Java
- Traits = Interface = sets of methods, properties an implementing class must define.
- keyword 'trait' is used to define trait class

properties -
- trait class may contain abstract or non-abstract method, with at least one abstract method
- it's possible to inherit from multiple traits at subclass level using keyword "with"




  

