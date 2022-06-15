package week1.day2;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 32615374564751384L;
	boolean isPunctured = false;
	String bikeName = "Royal Enfield";
	double runningKM = 65874;

	public static void main(String[] args) {
		TwoWheeler enfield = new TwoWheeler();
		System.out.println("Number of Wheels: " + enfield.noOfWheels);
		System.out.println("Number of Mirrors: " + enfield.noOfMirrors);
		System.out.println("Chassis Number: " + enfield.chassisNumber);
		System.out.println("is Punctured: " + enfield.isPunctured);
		System.out.println("Bike Name: " + enfield.bikeName);
		System.out.println("Running KMs: " + enfield.runningKM);
	}
}
