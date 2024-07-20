import java.io.*;
import java.util.Scanner;
class temperature{
    static double ConvertToKel(double c){
            double cal=c;
            double kel;
            kel=cal+273.15; 
            System.out.println("Temperature in Kelvin :"+kel);
      return kel;
    }
    static double ConvertTofer(double c){
        double cal=c;
        double fer;
        fer=(cal*1.8)+32;
        System.out.println("Temperature in Fahrenheit :"+fer);
        return fer;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temperature in Celsius");
        double c= sc.nextDouble();
        System.out.println("The conversion of Celsius to Kelvin and Fahrenheit are ");
        ConvertToKel(c);
        ConvertTofer(c);

    }
} 