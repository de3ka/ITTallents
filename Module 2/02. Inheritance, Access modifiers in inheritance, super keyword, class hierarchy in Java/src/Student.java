public class Student extends Person{
	protected double score;
	

	protected Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.score=score;
	}
	
	protected void showStudentInfo(){
		super.showPersonInfo();
		System.out.println("Student's score is: "+ this.score);
	}
	

}
