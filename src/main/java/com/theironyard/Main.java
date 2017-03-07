package com.theironyard;

/**
 * For this exercise you will create a class named Volume that contains methods
 * to calculate the volume of 3D shapes. Start by following the instructions in
 * the Volume class.
 *
 * In this Main class write a main method that invokes each of Volume class'
 * methods.
 */
public class Main {

    // todo: create a main() method that invokes each of the methods in the Volume class
    public static void main(String[] args) {
        double side = 56;
        double radius = 45;
        double height = 60;
        double volume = Volume.cube(side);
        double volume_of_cube = Volume.cone(radius, height);
        double volume_sphere = Volume.sphere(radius);


    }
}
