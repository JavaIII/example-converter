import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Hexadecimal {
	private static Map<String, String> hexBinMap = new HashMap<>();

	static {
		hexBinMap.put("0", "0000");
		hexBinMap.put("1", "0001");
		hexBinMap.put("2", "0010");
		hexBinMap.put("3", "0011");
		hexBinMap.put("4", "0100");
		hexBinMap.put("5", "0101");
		hexBinMap.put("6", "0110");
		hexBinMap.put("7", "0111");
		hexBinMap.put("8", "1000");
		hexBinMap.put("9", "1001");
		hexBinMap.put("A", "1010");
		hexBinMap.put("B", "1011");
		hexBinMap.put("C", "1100");
		hexBinMap.put("D", "1101");
		hexBinMap.put("E", "1110");
		hexBinMap.put("F", "1111");
	}

	/**
	 * This method converts from a hex string to a decimal number
	 */
	public void convertToDecimal() {

		String hexString = JOptionPane.showInputDialog("Enter a hexadecimal number");// Prompts user for number

		int decimal = hexToDecimalConversion(hexString);// Calls method to convert from hex string to decimal number

		JOptionPane.showMessageDialog(null, "The decimal equivalent is " + decimal);// Shows user resulting number
	}

	/**
	 * This method converts a hex string to a binary string in two steps.
	 */
	public void convertToBinary() {

		String hexString = JOptionPane.showInputDialog("Enter a hexadecimal number");// Prompts user for number

		String binary = hexToBinConversion(hexString);// Calls method to convert hex number to binary string

		JOptionPane.showMessageDialog(null, "The binary equivalent is " + binary);// Shows user resulting number

	}

	/**
	 * This method does actual conversion from hex string to decimal number.
	 * 
	 * @param hexString
	 * @return
	 */
	public int hexToDecimalConversion(String hexString) {

		String digits = "0123456789ABCDEF";
		hexString = hexString.toUpperCase();
		int decimal = 0;
		for (int i = 0; i < hexString.length(); i++) {
			char c = hexString.charAt(i);
			int d = digits.indexOf(c);
			decimal = 16 * decimal + d;
		}
		return decimal;
	}

	public String hexToBinConversion(String s) {
		char[] hex = s.toUpperCase().toCharArray();
		String binaryString = "";
		for (char h : hex) {
			binaryString = binaryString + hexBinMap.get(String.valueOf(h));
		}
		return binaryString;
	}

}