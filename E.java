import java.util.Scanner;

public class C{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		String c1,c2;
		c1 = input.next();
		c2 = input.next();
		Course C1 = new Course( c1, c2);
		Teacher a = new Teacher("LXH");
		Teacher b = new Teacher("NN");
		Student m = new Student(1,"张三",c1,c2);
		Student n = new Student(2,"牛牛",c1);
		System.out.println(c1 + "\n" + "任课老师" + a.name + "\n" + "选课学生");
		System.out.println("学号"+ m.No + "姓名" + m.name);
		System.out.println("学号"+ n.No + "姓名" + n.name);
		System.out.println(c2 + "\n" + "任课老师" + b.name + "\n" + "选课学生");
		System.out.println("学号"+ m.No + "姓名" + m.name);
		System.out.println();
		System.out.println("姓名" + m.name + "\n" + "所选课程\n" + c1 + ' '+ c2);
		System.out.println("姓名" + n.name + "\n所选课程\n" + c1);
		
	}
}
class Student{
	int No;
	String name;
	String chooseCourse1;
	String chooseCourse2;
	Student(int No, String name, String chooseCourse1, String chooseCourse2){
		this.No = No;
		this.name = name;
		this.chooseCourse1 = chooseCourse1;
		this.chooseCourse2 = chooseCourse2;
	}
	Student(int No, String name, String chooseCourse1){
		this.No = No;
		this.name = name;
		this.chooseCourse1 = chooseCourse1;
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
	Teacher(String name){
		this.name = name;
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