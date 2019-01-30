// this class is to call the methods in the two other classes Tax Calculator and Tax Chart .
// 5 Nov 2018
// Sarah Al Yahyaei
public class Test {

	private static int[] INCOMES = {25, 50, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 401, 425, 450, 500,
			550, 600 };

	public static void main(String[] args) {
		taxTables();
        smallest();
	}

	private static void taxTables() {
		TaxChart t = new TaxChart(INCOMES);
		t.draw();
		t.printTable();



	}
	// to find the smallest salary thats will equal to zero after applying the tax
	private static void smallest (){
		System.out.println("The Smallest salary is : ");
		// Assuming that a child will have an income between 0 pound and 4000 pounds
		for (int i=0; i<= 4000; i++){
			int tax = TaxCalculator.taxPaybale(i);
			if (i == tax){
				System.out.printf("%-3d%n" , i);

			}
		}

	}
}
