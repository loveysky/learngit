import java.util.Scanner;
public class Two_deimal_place{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number: ");
		double a = input.nextDouble();
		System.out.println(a);
		int b = (int) (a * 100);
		System.out.println(b/100.0);
	}
}