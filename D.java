import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String course1 = input.next();
		String course2 = input.next();
		Course c1 = new Course(course1);
		Course c2 = new Course(course2);
		Teacher t1 = new Teacher("LXH",111);
		Teacher t2 = new  Teacher("LLL",222);
		Student s1 = new Student("张三",1,course1,course2);
		Student s2 = new Student("李四",2,course1);
		System.out.println(course1);
		System.out.println("任课教师"+t1.name);
		System.out.println("选课学生");
		s1.printInfo();
		s2.printInfo();
		System.out.println();
		s1.printInfo1();
	}

}
class Student {
	String name;
	int number;
	String chooseCourse1;
	String chooseCourse2;
	
	Student(String name,int number,String chooseCourse1){ 
		this.name = name;
		this.number = number;
		this.chooseCourse1 = chooseCourse1;
		
	}
	
	Student(String name,int number,String chooseCourse1,String chooseCourse2){ 
		this.name = name;
		this.number = number;
		this.chooseCourse1 = chooseCourse1;
		this.chooseCourse2 = chooseCourse2;
	}
	
	public void printInfo() {
		System.out.println("学号 "+number+"姓名 "+name);
	}
	
	public void printInfo1() {
		System.out.println("姓名 "+name);
		System.out.println("所选课程");
		System.out.println(chooseCourse1+" "+chooseCourse2);
	}
}
class Course {
	String name;
	Course(String name){
		this.name = name;
	}
}
class Teacher {
	String name;
	int number;
	String teachCourse;
	
	Teacher(String name,int number){
		this.name = name;
		this.number = number;
	}
	
}