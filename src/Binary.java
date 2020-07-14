
import javax.swing.JOptionPane;

public class Binary {

	/**
	 * This method prompts user for number, converts a binary string to a
	 * hexadecimal string, and displays it The conversion is done in two steps: from
	 * binary to decimal, from decimal to hex string
	 **/
	public void convertToHexadecimal() {
		String str = JOptionPane.showInputDialog("Enter a binary number");// Prompts user for number
		String hexNum = binToHex(str);// Calls method to first convert from binary string to decimal
		JOptionPane.showMessageDialog(null, "The hexadecimal equivalent is " + hexNum);// Shows user resulting number
	}

	/**
	 * This method prompts user for number, converts a binary string to a decimal
	 * number, and displays it
	 * 
	 * @param binaryString
	 */
	public void convertToDecimal() {
		String binaryString = JOptionPane.showInputDialog("Enter a binary number");// Prompts user for number
		double decimal = binToDecimalConversion(binaryString);// Calls method that converts binary string to decimal
		JOptionPane.showMessageDialog(null, "The decimal equivalent is " + (int) decimal);// Shows user resulting number
	}

	private static double binToDecimalConversion(String str) {
		int decimal = 0;
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) == '1') {
				decimal = decimal + (int) Math.pow(2, str.length() - 1 - i);
			}
		return decimal;
	}

	public static String binToHex(String bin) {
		char[] hexCharacters = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int[] pow2 = { 1, 2, 4, 8 };
		int len = bin.length();
		char[] result = new char[(int) Math.ceil(len * 1D / 4)];
		int pos = result.length - 1;
		int hexval = 0;
		for (int i = 0; i < len; i++) {
			hexval += (bin.charAt(len - i - 1) - hexCharacters[0]) * pow2[i % 4];
			if ((i + 1) % 4 == 0) {
				result[pos--] = hexCharacters[hexval];
				hexval = 0;
			}
		}
		if (pos == 0) {
			result[0] = hexCharacters[hexval];
		}
		return new String(result);
	}

}
