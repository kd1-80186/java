import java.util.Scanner;

public class Dailydrivingcost 
{
	private double miles;
	private double gasolineCost;
	private double avgMiles;
	private double parkingFees;
	private double tollCost;
	
	public Dailydrivingcost() {
		super();
		this.miles = 0;
		this.gasolineCost = 0;
		this.avgMiles = 0;
		this.parkingFees = 0;
		this.tollCost = 0;
	}

	
	public Dailydrivingcost(double miles, double gasolineCost, double avgMiles, double parkingFees, double tollCost) {
		super();
		this.miles = miles;
		this.gasolineCost = gasolineCost;
		this.avgMiles = avgMiles;
		this.parkingFees = parkingFees;
		this.tollCost = tollCost;
	}



	public double getMiles() {
		return miles;
	}



	public void setMiles(double miles) {
		this.miles = miles;
	}



	public double getGasolineCost() {
		return gasolineCost;
	}



	public void setGasolineCost(double gasolineCost) {
		this.gasolineCost = gasolineCost;
	}



	public double getAvgMiles() {
		return avgMiles;
	}



	public void setAvgMiles(double avgMiles) {
		this.avgMiles = avgMiles;
	}



	public double getParkingFees() {
		return parkingFees;
	}



	public void setParkingFees(double parkingFees) {
		this.parkingFees = parkingFees;
	}



	public double getTollCost() {
		return tollCost;
	}



	public void setTollCost(double tollCost) {
		this.tollCost = tollCost;
	}

		
	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter miles driven per day");
		this.miles = sc.nextDouble(); 
		System.out.println("Enter cost per gallon of gasoline.");
		this.gasolineCost = sc.nextDouble(); 
		System.out.println("Enter average miles per gallon.");
		this.avgMiles = sc.nextDouble(); 
		System.out.println("Enter parking fees per day");
		this.parkingFees = sc.nextDouble();  
		System.out.println("Enter tolls per day");
		this.tollCost = sc.nextDouble(); 
	}
	
	public void drivingCost()
	{
		double cost =  this.miles+this.gasolineCost+this.avgMiles+this.parkingFees+this.tollCost;
		System.out.println("Total driving cost : "+cost);
	}


	public static void main(String[] args) 
	{
		Dailydrivingcost d1 = new Dailydrivingcost();
		d1.acceptData();
		d1.drivingCost();
		
		Dailydrivingcost d2 = new Dailydrivingcost(10,20,30,40,50);
		d2.drivingCost();
		
		
	}

}
