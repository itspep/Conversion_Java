import java.util.Scanner;
public class Conversion{
    public static void main(String[]args){
int userChoice;
double distance;
Scanner input=new Scanner(System.in);
        System.out.println("This program converts meters in other units of conversion");
        System.out.println("Enter the unit of measurement you want to convert to:");
        System.out.println("1. Convert to Kilometers");
        System.out.println("2. Convert to Inches");
        System.out.println("3. Convert to Feet");
        System.out.println("4. Quit the program");
        userChoice=input.nextInt();
        System.out.println("Enter the distance you wish to convert");
        distance=input.nextDouble();
        switch(userChoice)
        {
            case 1:
                showKilometers(distance);
                break;
            case 2:
                showInches(distance);
                break;
            case 3:
                showFeet(distance);
            case 4:
                System.exit(0);
        }
    }
    public static void showKilometers(dis){

    }
}