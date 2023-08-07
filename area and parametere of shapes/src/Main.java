import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        char cont='a';
        Scanner usr= new Scanner(System.in);
        System.out.println("Welcome to the Area and Perimeter calculation App");
        do {
            System.out.println("Plz enter:\n 1 for Rectangle\n 2 for Triangle\n 3 for Circle");
            int option = usr.nextInt();
            if (option == 1) {
                System.out.println("Enter the width of the Rectangle in cm");
                double rectWidth = usr.nextDouble();
                System.out.println("Enter the height of the Rectangle in cm");
                double rectHeight = usr.nextDouble();
                Rectangle rect = new Rectangle(rectWidth, rectHeight);
                rect.calcArea();
                rect.calcPerimeter();
            } else if (option == 2) {
                System.out.println("Enter the base of Triangle");
                double triBase = usr.nextDouble();
                System.out.println("Enter the Adjacent side  of Triangle");
                double triِAdjSide = usr.nextDouble();
                System.out.println("Enter the Opposite  side  of Triangle");
                double triِOpsSide = usr.nextDouble();
                System.out.println("Enter the Height of Triangle");
                double triِHeight = usr.nextDouble();
                Triangle tri = new Triangle(triBase, triِAdjSide, triِOpsSide, triِHeight);
                tri.calcArea();
                tri.calcPerimeter();

            } else if (option == 3) {
                System.out.println("Enter the Radius of the Circle");
                double cirRadius = usr.nextDouble();

                Circle cir = new Circle(cirRadius);
                cir.calcArea();
                cir.calcPerimeter();
            } else {
                System.out.println("Invalid option choice again ");
            }
            System.out.println("Do you want to calculate Another shape (y/n)");
            cont=Character.toLowerCase(usr.next().charAt(0));
        }while (cont=='y');
        System.out.println("Thanks have a good day");

    }
}
abstract class Shape{
     abstract void calcArea();
     abstract void calcPerimeter();
}
class Rectangle extends Shape{
    Rectangle(){

    }
    private double width;
    private double height;

    Rectangle(double b, double h){
        width=b;
        height= h;

    }

    @Override
    void calcArea() {
        System.out.println("The Area of Rectangle= "+(width*height)+" cm2");
    }

    @Override
    void calcPerimeter() {
        System.out.println("The Perimeter of Rectangle="+(2*(width+height))+" cm")
        ;
    }
}

class Triangle extends Shape{
    Triangle(){

    }

    double adj1;
    double adj2;
    double adj3;
    double height;
    Triangle(double a,double b,double c,double d){
        adj1=a;
        adj2=b;
        adj3=c;
        height =d;
    }


    @Override
    void calcArea() {
        System.out.println("The Area of the Triangle="+(0.5*adj1*height)+" cm2");
    }

    @Override
    void calcPerimeter() {
        System.out.println("The Perimeter of the Triangle ="+(adj1+adj2+adj3)+ " cm");

    }
}

class Circle extends Shape {
    Circle(){

    }
    double radius;
    Circle(double r){
        radius=r;
    }

    @Override
    void calcPerimeter() {
        System.out.println("The Perimeter of  the Circle= "+(2*3.14*radius)+" cm");
    }

    @Override
    void calcArea() {
        System.out.println("The Area of Circle ="+(3.14*radius*radius)+" cm2");
    }
}