package week1.day2;

public class EmployeeDetails {
	public static void main(String[] args) {
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.printEmployeeName("SampleName", 265365);
		employeeDetails.getEmployeAddress("Chennai");
		employeeDetails.printEmployeeSalary(48768.00);
		employeeDetails.printEmployeeMobileNumber(9876543205L);
		}
	void printEmployeeName(String empName , int empId) {
		System.out.println("Employee Name: "+empName+" "+"Employee Id: "+empId);
	}
	void getEmployeAddress(String empAddress) {
		System.out.println("Employee Address: "+empAddress);
	}
	void printEmployeeSalary(double empSalary) {
		System.out.println("Salary: "+empSalary);
	}
	void printEmployeeMobileNumber(long mobNum) {
		System.out.println("Mobile "
				+ "Number: "+mobNum);
	}
}