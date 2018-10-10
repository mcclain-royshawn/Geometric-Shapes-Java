/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg3;

/**
 *
 * @author royshawnmcclain
 */
public class Triangle extends GeometricObject {

    private double numOfSides = 3;
    /*
    Three double data fields named side1, side2, and side3 with default 
    values 1.0 to denote three sides of the triangle.(2 points)
     */
    private double sideA = 1, sideB = 1, sideC = 1;

    /*
    A no-arg constructor that creates a default triangle. (2 points)
     */
    Triangle() {
    }

    /*
    A constructor that creates a triangle with the 
    specified side1, side2, and side3. (2 points)
     */
    Triangle(double sideA, double sideB, double sideC, boolean filled) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        super.setFilled(filled);
    }

    /*
    The accessor methods for all three data fields.(4 points)
     */
    double getSideA() {
        return sideA;
    }

    double getSideB() {
        return sideB;
    }

    double getSideC() {
        return sideC;
    }

    /*
    A method named getPerimeter() that returns 
    the perimeter of this triangle.(2 points)
     */
    double getPerimeter() {
        return sideA + sideB + sideC;
    }

}
