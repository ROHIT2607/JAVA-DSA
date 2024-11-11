package OOP.Inheritance;

import OOP.Access_Specifier.PrivateCode;

// class Shape {
//     public int totalSide;

//     Shape() {
//         this.totalSide = -1;
//     }

//     Shape(int totalSide) {
//         this.totalSide = totalSide;
//     }
// }

// class Square extends Shape {
//     double length;

//     Square() {
//         this.length = -1;
//     }

//     Square(double length, int totalSide) {
//         super(totalSide);
//         this.length = length;
//     }

//     double getArea() {
//         System.out.println("Square has total Side : " + totalSide);
//         return length * length;
//     }
// }

// class Rectangle extends Square {

//     double width;

//     Rectangle() {
//         this.width = -1;
//     }

//     Rectangle(double length, double width, int totalSide) {
//         super(length, totalSide);
//         this.width = width;
//     }

//     double getArea() {
//         System.out.println("Reactangle has total shapes : " + totalSide);
//         return length * width;
//     }
// }

public class Inheritance extends PrivateCode {

    // Inheritance() {
    //     // super();
    //     System.out.println("Im from inheritance");
    // }

    public static void main(String args[]) {

        // Square s1 = new Square(5, 4);
        // System.out.println(s1.getArea());

        Inheritance p1 = new Inheritance();
        System.out.println(p1.num);
    }

}
