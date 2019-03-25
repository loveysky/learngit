import java.util.Scanner;
public class C{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String c1,c2;
		c1 = input.next();
		c2 = input.next();
		Course c1 = new Course( "面向对象技术", "编程思维");
	}
}
class Student{
	int No;
	String name;
	String chooseCourse1;
	String chooseCourse2;
	Student(int No, String chooseCourse1, String chooseCourse2){
		this.No = No;
		this.name = name;
		this.chooseCourse1 = chooseCourse1;
		this.chooseCourse2 = chooseCourse2;
	}
}
class Teacher{
	int num;
	String name;
	String teachCourse1;
	String teachCourse2;
	String teachCourse3;
	Teacher(int num,String name,String teachCourse1,String teachCourse2,String teachCourse3){
		this.num = num;
		this.name = name;
		this.teachCourse1 = teachCourse1;
		this.teachCourse2 = teachCourse2;
		this.teachCourse3 = teachCourse3;
	}
}
class Course{
	String course1;
	String course2;
	Course(String course1, String course2){
		this.course1 = course1;
		this.course2 = course2;
	}
}