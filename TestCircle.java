public class TestCircle{
	public static void main(String[] args){
		Circle circle1 = new Circle();
		System.out.println("The circle1's radius is " + circle1.radius);
		System.out.println("The circle1's area is " + circle1.getArea());
		Circle circle2 = new Circle(5);
		System.out.println("The circle2's radius is " + circle2.radius);
		System.out.println("The circle2's area is " + circle2.getArea());
		circle2.setRadius(50);
		System.out.println("The circle2's radius is " + circle2.radius);
	}
}
class Circle{
	double radius;
	Circle (){
		radius = 1;
	}
	Circle(double newRadius){
		radius = newRadius;
	}
	double getArea(){
		return radius * radius * Math.PI;
	}
	double getPreimeter(){
		return 2 * radius * Math.PI;
	}
	void setRadius(double newRadius){
		radius = newRadius;
	}
}