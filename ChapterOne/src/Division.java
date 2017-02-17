import java.util.Scanner;

public class Division {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n =-3;
		int m=-7;
		double quotient = n/m;
		System.out.printf("Quotient is %.2f.The remaider is %d",quotient,n%m);
	}
}
