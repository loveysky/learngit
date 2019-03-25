class point{
	double x;
	double y;
	double z;
	point(double a, double b, double c){
		x = a;
		y = b;
		z = c;
	}
	void setPoint(double a, double b, double c){
		x = a;
		y = b;
		z = c;
	}
	double getDistance(point p){
		return (x - p.x)*(x - p.x) + (y-p.y)*(y-p.y) + (z-p.z)*(z-p.z);
	}
}
public class TsetPoint{
		static double AAA(double x){
		int a = (int ) (x*100);
		return (a/100.0);
	}
	public static void main(String[] args){
		point p = new point(3.999, 9.044, 6.11);
		point p1 = new point(0.0, 0.0, 0.0);
		double u = p.getDistance(p1);
		System.out.println(AAA(u));
		p.setPoint(8.9, 6.7, 7.1);
		System.out.println(p.getDistance(p1));
		System.out.println(p.getDistance(new point(4.0, 4.0, 4.0)));
	}
}