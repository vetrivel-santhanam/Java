//#include package-info.java;
package Calculator;

interface ICalculator {	
	Object operand1 = new Object();
	Object operand2 = new Object();
	String operation = "Add";
	
	public void doOperation( Object operand1, Object operand2, String operation);	
}

class NumericCalculator implements ICalculator {
	int result;
	
	public void doOperation(Object operand1, Object operand2, String operation) {
		if (operation == "Add") {
			result = (int) operand1 + (int) operand2;
		} else if (operation == "Subtract") {
			result = (int) operand1 - (int) operand2;
		} else if (operation == "Multiply") {
			result = (int) operand1 * (int) operand2;
		} else if (operation == "Divide") {
			try {
				result = (int) operand1 / (int) operand2;
			} catch (Exception e) {
				System.out.println("NumericCalculator: Division by 0");
			//} catch (ClassCastException e) { // ClassCastException
				//System.out.println("DecimalCalculator: ClassCastException");				
			} finally {
				if ((int)operand2 == 0) {
					result = (int) operand1;
				}
			}
		} else if (operation == "ModuloDivision") {
			try {
				result = (int) operand1 % (int) operand2;
			} catch (Exception e) {
				System.out.println("NumericCalculator: ModuloDivision by 0");
			} finally {
				if ((int)operand2 == 0) {
					result = (int) operand1;
				}
			}
		}
		System.out.println("NumericCalculator: Result: " + result);		
	}
}


class DecimalCalculator implements ICalculator {
	double result;
	
	public void doOperation(Object operand1, Object operand2, String operation) {
		if (operation == "Add") {
			result = (double) operand1 + (double) operand2;
		} else if (operation == "Subtract") {
			result = (double) operand1 - (double) operand2;
		} else if (operation == "Multiply") {
			result = (double) operand1 * (double) operand2;
		} else if (operation == "Divide") {
				try {
					 operand1 = (double)operand1;
					 operand2 = (double)operand2;
				} catch (ClassCastException e) { // ClassCastException
					System.out.println("DecimalCalculator: ClassCastException");				
					System.exit(0);
				}	
			try {
				result = (double) operand1 / (double) operand2;
			} catch (Exception e) { // ClassCastException
				System.out.println("DecimalCalculator: Division by 0");
			} finally {
				if ((double)operand2 == 0) { // Is it accurate?
					result = (double) operand1;
				}
			}
		}
		System.out.println("DecimalCalculator: Result: " + result);	
	}
}

class Calculator {
	public static void main(String[] args) {
		NumericCalculator nCalculator = new NumericCalculator();
		nCalculator.doOperation(5,5,"Add");
		nCalculator.doOperation(7,4,"Subtract");
		nCalculator.doOperation(4,7,"Subtract");
		nCalculator.doOperation(7,8,"Multiply");
		nCalculator.doOperation(10,2,"Divide");
		nCalculator.doOperation(563,3,"ModuloDivision");
		//nCalculator.doOperation(5.6,5.6,"Divide");
		
		DecimalCalculator dCalculator = new DecimalCalculator();
		dCalculator.doOperation(5.6,6.5,"Add");
		dCalculator.doOperation(7.6,4.2,"Subtract");
		dCalculator.doOperation(4.5,7.2,"Subtract");
		dCalculator.doOperation(7.6,8.9,"Multiply");
		dCalculator.doOperation(10.6,2.0,"Divide");		
		dCalculator.doOperation(50,5,"Divide");		
	}
}