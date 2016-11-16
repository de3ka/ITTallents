
public class Demo {

	public static void main(String[] args) {
		
		Person[] people = new Person[10];

		Person jana = new Person("Janeta Kaludova", 18, false);
		Person pencho = new Person("Pencho Georgiev", 28, true);

		Employee stancho = new Employee("Stanislav Zahariev", 33, true, 15.80);
		Employee valentina = new Employee("Valentina Krumova", 17, false, 10.00);

		Student stoqn = new Student("Stoyan Georgiev", 22, true, 5.50);
		Student anelia = new Student("Anelia Alexandrova", 19, false, 4.44);
		
		
		people[0] = jana;
		people[1] = pencho;
		people[2] = stancho;
		people[3] = valentina;
		people[4] = stoqn;
		people[5] = anelia;

		for (int i = 0; i < people.length; i++) {
			if (people[i] != null) {
				if (people[i] instanceof Student) {
					((Student) people[i]).showStudentInfo();
					System.out.println();
				} else if (people[i] instanceof Employee) {
					((Employee) people[i]).showEmployeeInfo();
					System.out.println();
				} else {
					people[i].showPersonInfo();
					System.out.println();
				}
			}
		}
		
		for (int i = 0; i < people.length; i++) {
			if (people[i] instanceof Employee) {
				System.out.println("Employee name: " + people[i].name);
				System.out.println("Employee's overtime payment for 2 hours additional work: "
						+((Employee) people[i]).calculateOvertime(2) + " BGN");
				System.out.println();
			}
		}
		
	}

}
