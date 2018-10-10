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
public class GeometricObject {

    private int numOfSides;
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;

    GeometricObject() {
        dateCreated = new java.util.Date();
    }

    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
        return;
    }

    boolean isFilled() {
        return filled;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
        return;
    }

    java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

}
