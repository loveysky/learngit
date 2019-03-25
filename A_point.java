class Point{
	double x,y,z;

	Point(double a, double b, double c){
		x = a; y = b; z = c;
	}

	void setPoint(double a, double b, double c ){
		x = a;  y = b;  z = c;
	}

	double getDistance(Point p){
		return (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y) + (z-p.z)*(z-p.z);
	}
}
public class A_point{
	public static void main(String[] args){
		Point p = new Point(3.0, 6.0, 9.0);
		Point q = new Point(0.0, 0.0, 0.0);
		System.out.println(p.getDistance(q));
		p.setPoint(5.0, 6.0, 1.0);
		System.out.println(p.getDistance(new Point(1.0, 1.0, 1.0)));
	}
}
