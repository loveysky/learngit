import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double x,y;
		x = input.nextDouble();
		y = input.nextDouble();
		Rectangle a = new Rectangle(x,y);
		System.out.println("宽为" + x + "高为" + y + "面积为" + a.getArea() + "周长为" + a.getPerimeter());
	}
}
class Rectangle{
	double width = 1;
	double heigth = 1;
	Rectangle(){
		
	}
	Rectangle(double width, double heigth){
		this.width = width;
		this.heigth = heigth;
	}
	double getArea(){
		return width * heigth;
	}
	double getPerimeter(){
		return (width + heigth) * 2;
	}

}