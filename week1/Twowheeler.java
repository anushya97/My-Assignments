package Assignments.week1;

public class Twowheeler {
	
	int noOfWheels = 2 ;
	short noOfMirrors = 2 ;
	long chassisNumber = 37648347;
	boolean isPunctured = false;
	String bikeName = "Kawasaki";
	double runningKM = 566.89;


public static void main(String args[]) {
	
	Twowheeler tw = new Twowheeler();
	

System.out.println("Bike name is : "+tw.bikeName);
System.out.println("ChassisNumber is : "+tw.chassisNumber);
System.out.println("If the Bike is Punctured : "+tw.isPunctured);
System.out.println("No Of Mirrors in bike is : "+tw.noOfMirrors);
System.out.println("No Of Wheels in bike is : "+tw.noOfWheels);
System.out.println("Running KM in bike is : "+tw.runningKM);

}}