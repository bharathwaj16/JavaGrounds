package Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		
		CalculatorService cs = new CalculatorService();
		
		cs.add(141, 22);
		cs.subtract(200, 93);
		cs.multiply(234, 67);
		cs.divide(44, 8);
		cs.percentage(22, 9);
	}
}
