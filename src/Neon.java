import java.util.*;
public class Neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m=0;
		m = n*n;
		int t=0;
		int s=0;
		while(m>0) {
			t= m%10;
			s=s+t;
			m=m/10;
		}
		if(s==n) {
			System.out.print("yes");
		}
		else {
			System.out.print("no");
		}
	}

}
