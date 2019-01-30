
// The aim of this class is to draw a bar chart that shows the incomes changes with the taxes 
// 5 Nov 2018 .
// Sarah Al Yahyaei
import java.io.PrintStream;

public class TaxChart {

// Declaration for incomes variable which will be used within the class  .
	private static int[] incomess;

//Calling the private variable in the new public method .
	public TaxChart(int[] incomes) {
		incomess = incomes;

	}

	public void draw() {
		int distance = 6; // distance between each bar
		Bar barchart = new Bar(); //x axis
		Bar y = new Bar(); // y axis
        Bar[] netincomes = new Bar[incomess.length]; // net income
        Bar[] tax = new Bar[incomess.length]; // tax

		// draw line for x axis
		barchart.makeVisible();
		barchart.changeColour(Colour.GREEN);
		barchart.changeSize(230, 1);
		barchart.moveVertical(240);
		barchart.moveHorizontal(-50);


		// draw line for the y axis
		y.makeVisible();
		y.changeColour(Colour.GREEN); // the color of the line
		y.changeSize(1, 200); // the size of the line
		y.slowMoveHorizontal(-50); // direction of the line
		y.moveVertical(37);

		// Drawing the bars
		for (int i = 0; i < incomess.length; i++) {
           // number of elements
            tax[i] = new Bar();
            netincomes[i] = new Bar();

			// Drawing a thin bar for net incomes in yellow
			netincomes[i].makeVisible();
			netincomes[i].changeSize(3, (incomess[i] - TaxCalculator.taxPaybale(incomess[i])) / 3);
			netincomes[i].changeColour(Colour.YELLOW);
			netincomes[i].moveVertical(270 - ((incomess[i] - TaxCalculator.taxPaybale(incomess[i])) / 3));
			netincomes[i].moveHorizontal(distance);
			netincomes[i].moveVertical(3);
			netincomes[i].moveLeft();
			netincomes[i].moveLeft();
			netincomes[i].moveUp();
			netincomes[i].moveUp();

			// Drawing a thin bar for taxes
			tax[i].changeSize(3, TaxCalculator.taxPaybale(incomess[i]) / 3);
			tax[i].changeColour(Colour.RED);
			// distance between the yellow bar and this bar
			tax[i].moveVertical(270 - (incomess[i] / 3));
			tax[i].moveUp();
			tax[i].moveUp();
			tax[i].makeVisible();
			tax[i].moveLeft();
			tax[i].moveLeft();
			tax[i].moveHorizontal(distance);

         // to make a distance between each bar
			distance = distance + 10;

		}

	}
       // To print a table of incomes , taxes and net income
	public void printTable() {
          System.out.println("Income   Tax   Net income ");
		for (int i = 0; i < incomess.length; i++) {
			int netIncome = incomess[i]- TaxCalculator.taxPaybale(incomess[i]);
			int taxx = TaxCalculator.taxPaybale(incomess[i]);
            final PrintStream printf = System.out.printf("%-11d%-11d%-11d%n", incomess[i], taxx, netIncome);

        }
	}
		
	}


