import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double a,b,c;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		Point p = new Point (3,4,5);
		Point p1 = new Point(a, b, c);
		System.out.println("p距离原点的距离为： " + p.getDistanceToBase() + "\n" + "p1距离原点的距离为： " + p1.getDistanceToBase());
	}
}
class Point{
	double x;
	double y;
	double z;
	Point(){

	}
	Point(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public double getDistanceToBase(){
		return Math.sqrt(x * x + y * y + z * z);
	}
}