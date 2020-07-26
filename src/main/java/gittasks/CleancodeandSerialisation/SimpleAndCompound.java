package gittasks.CleancodeandSerialisation;
import java.util.Scanner;
public class SimpleAndCompound
{
    public static void main(String args[]) 
    {
        float p, r, t, sinterest;
		double cinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        t = scan.nextFloat();
        scan.close();
        sinterest = (p * r * t) / 100;
        cinterest = p * (Math.pow((1 + r/ 100), t)); 
        System.out.println("Compound Interest is "+ cinterest); 
        System.out.print("Simple Interest is: " +sinterest);
    }
}