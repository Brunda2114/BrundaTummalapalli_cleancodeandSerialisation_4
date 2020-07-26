package gittasks.CleancodeandSerialisation;
import java.util.*;

public class house {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		
		System.out.format("%s","There are various types of material standards for building a house, They are:\nStandard\nAbove Standard\nHigh standard\nFully Automated");
		System.out.format("%s", "\nEnter your Material Standard:" );
		String material = sc.nextLine();
		System.out.format("%s", "\nEnter the Number of Square Feet" );
		float square_feet =sc.nextFloat();
		CostofConstruction obj = new CostofConstruction();
		float Cost = obj.calculateCostofConstruction(material,square_feet);
		System.out.format("%s","\nTotal Cost Of Construction is ");
		System.out.format("%f",Cost);
		
	}

}