import java.text.DecimalFormat;

public class Employee extends Person {
	protected double daySalary;

	protected Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.daySalary = daySalary;
	}

	protected String calculateOvertime(double hours) {
		DecimalFormat formatter = new DecimalFormat("#0.00");
		if (super.age > 0 && super.age < 18) {
			hours = 0;
		}
		double overtimePayment = ((this.daySalary / 8) * 1.5) * hours;
		return formatter.format(overtimePayment);
	}

	protected void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.println("Employee's day salary is: " + this.daySalary + " BGN");
	}

}
