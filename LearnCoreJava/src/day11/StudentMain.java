package day11;

public class StudentMain {

	public static void main(String[] args) {

		//Student stu = new Student();
//		//1.) assign data using object reference		
//		stu.SId = 12;
//		stu.sname="Berlin";
//		stu.grade ='A';
//		stu.printStudentData();
		
		
		//2.)assign data using user defined method
		//stu.setStuData(123,"john",'B');
		//stu.printStudentData();
		
		
		//3.) using constructor
		//constructor name should be same name as method name
		//doesn't return anything,can take parameters
		//no need to invoke constructor,automatically get invoked at time of object creation
		//used to intialize values of variables
		Student stu = new Student(123,"john",'B');
		stu.printStudentData();
		//
	}

}
