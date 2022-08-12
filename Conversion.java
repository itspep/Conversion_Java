import java.util.Scanner;
public class Conversion{
    public static void main(String[] args){
int userChoice;
double meters;
Scanner input=new Scanner(System.in);

        System.out.println("This program converts meters in other units of conversion");
        System.out.println("Enter the unit of measurement you want to convert to:");
        System.out.println("1. Convert to Kilometers");
        System.out.println("2. Convert to Inches");
        System.out.println("3. Convert to Feet");
        System.out.println("4. Quit the program");
        userChoice=input.nextInt();
        switch(userChoice)
        {
            case 1:
                showKilometers();
                break;
            case 2:
                showInches();
                break;
            case 3:
                showFeet();
            case 4:
                System.exit(0);
        }
    }
    public static void showKilometers(){
        System.out.print("Enter the distance in meters: ");
        Scanner read =new Scanner(System.in);
       double meters=read.nextDouble();
        System.out.println(meters*0.001);
    }
public static void showInches(){
    System.out.print("Enter the distance in meters: ");
    Scanner read =new Scanner(System.in);
    double meters=read.nextDouble();
    System.out.println(meters*39.37);
        }
public static void showFeet(){
    System.out.print("Enter the distance in meters: ");
    Scanner read =new Scanner(System.in);
    double meters=read.nextDouble();
    System.out.println(meters*3.281);
        }
}