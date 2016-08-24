# Hunt103
public class Act3 {

	public static void main(String[] args) {

		int n = 1234;
		int d = 0;
		d = n % 10;
		int d2 = 0;
		int p = 1;
		int r = 0;

		while (n > 0) {
			d2 = n % 10;

			for (int j = 0; j < d; j++) {
				p *= d2;
			}
			r += p;
			n = n / 10;
			p = 1;
			
		}
		System.out.println(r);
	}

}
