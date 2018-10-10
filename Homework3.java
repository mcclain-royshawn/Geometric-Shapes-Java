/*
1.Define the role of this keyword 
It refers to an object and can be used in a constructor to invoke another constructor.

2.Read the code below and answer questions: 
public class Circle {
private double radius;
	
	public Circle(double radius) {
	      this.radius = radius;  // What is the functionality of keyword this used for here? 
}   To refer to the class variable Radiu.
  	public 	Circle() {
	      this(1.0); // What is the functionality of keyword this used for? 
}   To invoke a constructor in a constructor.
…
}

2.Define class abstraction and class encapsulation in OOP
Abstract classes can't create objects. Abstract classes are implemented in subclasses.

3.Define inheritance in OOP
When you define a class from an existing class.

4.Define superclass and subclass and give their alternative names.
A superclass is a general class: Parent class. A subclass is a more general class: Child Class.

5.What is single inheritance? What is multiple inheritance? Does Java support multiple inheritance?
Single Inheritance-A java class can onlu inherit from one superclass.
Multiple inheritance- When a class is derived from multiple superclasses.
Java does not support multiple inheritance.

6.Explain why a subclass is NOT a subset of a superclass.
Because their is more specified methods and data in a subclass.

7.Discuss keyword super, give the syntax with examples of calling superclass’s constructor AND method?
Super is used to call a super class's constructor or method.
super.parentclassmethod();
super()
8.Discuss constructor chaining
When a constructor is called from a parent's parent.

9.Contrast overriding and overloading
Overriding is providing a new implementation for a method while overloading
defines multiple methods with the same name but different signatures.

 */
package homework.pkg3;

/**
 *
 * @author royshawnmcclain
 */
import java.util.Scanner;

public class Homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       
       /* Write a main function to test your class file,
        all the methods in it need to be tested,which  (2 points)
         */

        //////////////////////Num 13///////////////////////////////////////////////////
        boolean f=true;

        System.out.println("Enter three lengths for a triangle.");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        System.out.println("\n Is the triangle filled? Yes for yes, No for no.");
        String t = input.next();

        if (t == "Yes") {
            f = true;
        }

        if (t == "No")
                {
            f = false;
        }

        Triangle t1 = new Triangle(a, b, c, f);
        System.out.println(t1.toString()+"The perimeter is: "+t1.getPerimeter());
      
    }
}
