public class Rectangle{
	public static void main(String[] args){
		Rectangle t (4,40);
		System.out.println("宽为" + weith + "高为" + heigth + "面积为" + t.getArea + "周长为" + t.getPerimeter);
	}
}
class Rectangle{
	double width = 1;
	double height = 1;
	Rectangle(){

	}
	Rectangle(double a ,double b){
		width = a;
		heigth = b;
	}
	public double getArea{
		return width * heigth;
	}
	public double getPerimeter{
		return (width + heigth) * 2;
	}
}