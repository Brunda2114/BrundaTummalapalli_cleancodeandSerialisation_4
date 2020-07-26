package gittasks.CleancodeandSerialisation;
public class CostofConstruction {
	
	float calculateCostofConstruction(String material,float square_feet)
	{
		
		if(material.equals("standard"))
		{
			return 1200*square_feet;
		}
		else if(material.equals("above standard"))
		{
			return 1500*square_feet;
		}
		else if(material.equals("high standard"))
		{
			return 1800*square_feet;
		}
		else if(material.equals("hidh standard and fully automated home"))
		{
			return 2500*square_feet;
		}
		else {
		return 0;
		}
	}

}