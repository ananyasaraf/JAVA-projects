import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class Gussing {
    public static void main(String[] args) {
         Random rand=new Random();
        int b;
         int a = rand.nextInt(100);
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to gussing game \n Enter a no between 1 to 100");
        for(int i=100;i>0;i--){
            b=sc.nextInt();
            if(a==b){
                break;
            }
            else if(a>b){
                System.out.println("select a grater number");
            }
            else if(a<b){
                System.out.println("Select aa smaller no.");
            }
          

        }
        System.out.println("Cong!! you win");
    }
}
