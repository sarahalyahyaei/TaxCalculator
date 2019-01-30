
// The aim of doing this class is to calculate the tax on an income given .
// 5 Nov 2018
// Sarah Al Yahyaei
public class TaxCalculator {

	public static int taxPaybale(int s0) {
		
		// case 1 any value less then 0 means this value is a negative
		if (s0 < 0) {
			System.out.println("Any values less then zero is invalid income and can not be calculated");
			return -1 ;
		}
		// case 2 the first 100 pound is tax free .

		else if (s0 <= 100 && s0 != 0) {
			return 0;
		}
		// case 3 the first 100 pounds is tax free + the second value will multiply by 5 %  .
		else if (s0 > 100 && s0 <= 150) {
			return (int) Math.round( (s0 - 100) * 0.05d);
		}
		// case 4
		// Firstly, the input number should be
		// - 100 because the first 100 is tax free
		// then there is a condition
		// that the first 50 is calculated depending
		// on the previous condition which is 50 *0.05
		// so its consider that this value as a fix value which is going to be the result of input income - 100 == result - 50
		// then it will calculate the new value on the new condition * 0.1
		// after that the result will be added to the fixes values which is 0.05 
		// ** this going to apply for the rest calculation cases from 4 -7 with different values.
		else if (s0 > 150 && s0 <= 200) {
			double s1 = (s0 - 100);
			double s2 = (s1 - 50) * 0.1d;
			 s2 += 2.5d;
			 return (int) Math.round(s2);
		}
		// case 5
		// this case will need some values have been calculated from the previous
		// condition.
		else if (s0 > 200 && s0 <= 300) {
			double s1 = (s0 - 100);
			double s2 = (s1 - 100) * 0.15d;
			 s2 += 2.5d + 5;
			 return (int) Math.round(s2);
		}
		// case 6
		else if (s0 > 300 && s0 <= 400) {
			double s1 = (s0 - 100);
			double s2 = (s1 - 200) * 0.2d;
			 s2 += 2.5d + 5 + 15;
			 return (int) Math.round(s2);
		}
		// case 7
		else {
			double s1 = (s0 - 100);
			double s2 = (s1 - 300) * 1.5;
			s2 += 2.5 + 5 + 15 + 20;
           return (int) Math.round(s2);
		}
}
	}
	
	


