class testpoint{
	double x;
	double y;
	double z;
	testpoint (double a, double b, double c){
		x = a;
		y = b;
		z = c;
	}
	void setX(double a){
		x = a;
	}
	void setY(double b){
		y = b;
	}
	void setZ(double c){
		z = c;
	}
	double getDistance(testpoint p){
		return (x - p.x)*(x - p.x) + (y - p.y)*(y - p.y) + (z - p.z)*(z - p.z);
	}
}
public class Point{
	
	public static void main(String[] args){
		testpoint p = new testpoint(2.3, 4.6, 8.0);
		testpoint p1 = new testpoint(0.0, 0.0, 0.0);
		System.out.println(p.getDistance(p1));

		p.setX(4.0);
		p.setY(8.0);
		p.setZ(10.0);
		System.out.println(p.getDistance(p1));
	}

}



