package day11;

public class Student {
	int SId;
	String sname;
	char grade;
	
	void printStudentData() {
		System.out.println(SId+"     "+sname+"        "+grade);
	}
	
	void setStuData(int id,String name,char g) {
		SId=id;
		sname=name;
		grade=g;
	}
	
	Student(int id,String name,char g){
		SId=id;
		sname=name;
		grade=g;
		
	}
	

}
