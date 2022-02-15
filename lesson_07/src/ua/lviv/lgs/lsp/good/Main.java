package ua.lviv.lgs.lsp.good;

public class Main {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		r1.setWidth(5);
		r1.setHeight(10);
		System.out.println(r1.calculateSquire());
		
		Squares r2 = new Squares();
		
		r2.setWidth(5);

		System.out.println(r2.calculateSquire());
		
		calculateSquare(r1);
		calculateSquare(r2);
		
	}
	
	static void calculateSquare(Square sc) {
		
		System.out.println(sc.calculateSquire());
		
	}

}
