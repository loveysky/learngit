import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Account a = new Account();
		int x = input.nextInt();
		a.setId(x);
		double y = input.nextDouble();
		a.setBalance(y);
		System.out.println("账户是" + a.getId() + "初始余额是" + a.getBalance());
		double m,n;
		m = input.nextDouble();
		n = input.nextDouble();
		a.withDraw(m);
		a.deposit(n,m);
	}
}
class Account{
	private int id = 0;
	private  double balance = 0;
	Account(){

	}
	Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void withDraw(double a){
		if(a <= balance){
			System.out.println("取款后余额是" + (balance - a));
		}
		else System.out.println("余额不足");
	}
	public void deposit(double a, double b){
		System.out.println("存款后余额是" + (balance - b  + a));
	}
}
