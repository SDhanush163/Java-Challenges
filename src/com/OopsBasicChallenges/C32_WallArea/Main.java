package com.OopsBasicChallenges.C32_WallArea;

/*--------------------------------------------------------------------------------------------------
Wall Area Computation
Write a class with the name Wall. The class needs two fields (instance variables) with name width
and height of type double.

The class needs to have two constructors:
 - The first constructor does not have any parameters (no-args constructor).
 - The second constructor has parameters width and height of type double,
        and it needs to initialize the fields.

In case the width parameter is less than 0 it needs to set the width field value to 0. In case the
height parameter is less than 0 it needs to set the height field value to 0.



Write the following methods (instance methods):
 - Method named getWidth without any parameters, it needs to return the value of width field.
 - Method named getHeight without any parameters, it needs to return the value of height field.
 - Method named setWidth with one parameter of type double, it needs to set the value of the width
        field. If the parameter is less than 0 it needs to set the width field value to 0.
 - Method named setHeight with one parameter of type double, it needs to set the value of the height
        field. If the parameter is less than 0 it needs to set the height field value to 0.
 - Method named getArea without any parameters, it needs to return the area of the wall.

TEST EXAMPLE
→ TEST CODE:
Wall wall = new Wall(5,4);
System.out.println("area= " + wall.getArea());

wall.setHeight(-1.5);
System.out.println("width= " + wall.getWidth());
System.out.println("height= " + wall.getHeight());
System.out.println("area= " + wall.getArea());
→ OUTPUT:
area= 20.0
width= 5.0
height= 0.0
area= 0.0

NOTE: All ​methods should be defined as public NOT public static.
NOTE: In total, you have to write 5 methods and 2 constructors.
--------------------------------------------------------------------------------------------------*/

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
