
public class RealNumberDigits {

	public static void main(String[] args) {
		int n = -252346375;
		int digits = 0;
		while (n!=0) {
			n=n/10;
			digits++;
		}
		System.out.print(digits);

	}

}
