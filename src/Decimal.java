import javax.swing.JOptionPane;

public class Decimal {

	/**
	 * 
	 * This method prompts user for a number, converts a decimal number to a
	 * hexadecimal string, and displays it The conversion is done in two steps:
	 * decimal string to decimal number, then decimal to hex string
	 **/
	public void convertToHexadecimal() {
		String str = JOptionPane.showInputDialog("Enter a decimal number");// Prompts user for number
		int decimal = Integer.parseInt(str);// Calls method to convert decimal string to a number
		String hexNum = decToHexString(decimal);// Calls method to convert from decimal number to hex string
		JOptionPane.showMessageDialog(null, "The hexadecimal equivalent is " + hexNum);// Shows user resulting number
	}

	/**
	 * This method prompts user for number, converts a decimal number to a binary
	 * string, and displays it The conversion is done in two steps: decimal string
	 * to decimal number, then decimal to binary string
	 */
	public void convertToBinary() {
		String str = JOptionPane.showInputDialog("Enter a decimal number");// Prompts user for number
		int decimal = Integer.parseInt(str);// Calls method to convert decimal string to a number
		String binary = decToBinaryString(decimal);// Calls method to convert from decimal number to binary string
		JOptionPane.showMessageDialog(null, "The binary equivalent is " + binary);// Shows user resulting number
	}

	/**
	 * This method converts a decimal number to a hex string.
	 * 
	 * @param decimal
	 * @return
	 */
	public static String decToHexString(int decimal) {
		int rem;
		String hexNum = " ";
		char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		while (decimal > 0) {
			rem = decimal % 16;
			hexNum = hex[rem] + hexNum;
			decimal = decimal / 16;
		}
		return hexNum;
	}

	/**
	 * This method does actual conversion of a decimal number to a binary string The
	 * algorithm was derived from the decimal to hex string method above
	 * 
	 * @param decimal
	 * @return
	 */
	public static String decToBinaryString(int decimal) {
		int rem;
		String binNum = " ";
		while (decimal > 0) {
			// This is the algorithm which provides us with the conversion.
			rem = decimal % 2;
			binNum = rem + binNum;
			decimal = decimal / 2;
		}
		return binNum;

	}

}
