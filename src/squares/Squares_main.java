package squares;

public class Squares_main {
	
	public static void main(String[] args) {
		
		double x[] = { 0.3, 0.6, 0.9, 1.2, 1.5, 1.8, 2.1 };
		double y[] = { 1.0, 2.3, 3.1, 4.7, 5.9, 6.8, 8.0 };
		double theta[] = new double[2];

		Squares_lib slib = new Squares_lib(x, y);
		
		for(int i = 0;i < 100;i++) {
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getObject());
		}

	}
	

}
