package week1.day2;

public class Car {

	public boolean applyBreak() {
		return false;
	}

	public int applyGear() {
		return 3;
	}

	public boolean switchOnAC() {
		return true;
	}

	public String applyAccelerate() {
		return "60 kmph";
	}

	public static void main(String[] args) {
		Car Car1 = new Car();
		System.out.println(Car1.applyBreak());
		System.out.println(Car1.applyGear());
		System.out.println(Car1.switchOnAC());
		System.out.println(Car1.applyAccelerate());
	}
}
