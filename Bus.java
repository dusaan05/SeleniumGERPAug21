package week1.day1;

public class Bus 
{
	
	// Global Variables
	//accessSpecifier dataType variableName = Value;
//	public int speed = 180;
//	public long busPrice = 150000L;
//	public float fuelCapacity = 100.5F;
//	public double kmRun = 4324324.4622;
//	public String color = "White";
//	public char fuelType = 'P';
	public String s = "Super";
	
	
	public void isSpeed() 
	{
		System.out.println("Bus is much speeder than Car");
	}
	
	
	public static void main(String args[])
	{
		System.out.println("THis is the main method");
		
		Bus schoolBus = new Bus();
		// className ObjectName = memory className();
		//Object reference or name to be created under the main method
		
		schoolBus.isSpeed();
		
		//local variables
		
		//dataType variableName = value;
		int speed = 180;
		long busPrice = 150000L;
		float fuelCapacity  = 100.5F;
		double kmRun = 4324324.4622;
		String color = "White";
		char fuelType = 'P';
		
		System.out.println("Max Speed of the Bus is 180Km");
		System.out.println("The speed of the bus is:" + speed);
		System.out.println("The Bus Price is" + busPrice);
		System.out.println("FuelCapacity is" + fuelCapacity);
		System.out.println("Km that can run" + kmRun);
		System.out.println("Color of the bus is" + color);
		System.out.println("Fuel Type is" + fuelType);
		
				
	}

}
