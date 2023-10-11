import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double sideOne = 0;
        double sideTwo = 0;
        boolean doneOne = false;
        boolean doneTwo = false;
        double area;
        double hypotenuse;
        double perimeter;

        //loops until user gives valid number for side one
        do {
            System.out.println("Enter Length of Side 1: ");
            if (scan.hasNextDouble()) {
                sideOne = scan.nextDouble();
                if (sideOne <= 0) {
                    System.out.println("Yeah nice try buddy");
                    scan.nextLine();
                } else {
                    doneOne = true;
                }
            } else {
                System.out.println("Yeah nice try buddy");
                scan.nextLine();
            }
        } while (!doneOne);

        //loops until user gives valid number for side two
        do {
            System.out.println("Enter Length of Side 2: ");
            if (scan.hasNextDouble()) {
                sideTwo = scan.nextDouble();
                if (sideTwo <= 0) {
                    System.out.println("Yeah nice try buddy");
                    scan.nextLine();
                } else {
                    doneTwo = true;
                }
            } else {
                System.out.println("Yeah nice try buddy");
                scan.nextLine();
            }
        } while (!doneTwo);

        //calculates area, perimeter, diagonal, then prints it all out
        area = sideOne * sideTwo;
        perimeter = (2*sideOne)+(2*sideTwo);
        hypotenuse = (Math.sqrt(Math.pow(sideOne, 2)+(Math.pow(sideTwo, 2))));

        System.out.printf("%-11s %.2f" , "Side One:",sideOne);
        System.out.printf("\n%-11s %.2f" , "Side Two:",sideTwo);
        System.out.printf("\n%-11s %.2f" , "Area:",area);
        System.out.printf("\n%-11s %.2f" , "Perimeter:",perimeter);
        System.out.printf("\n%-11s %.2f" , "Hypotenuse:",hypotenuse);

    }
}