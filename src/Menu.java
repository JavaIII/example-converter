import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu implements ActionListener {

	// Creates components of menu
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton binToDec = new JButton("Bin to Dec");
	private JButton binToHex = new JButton("Bin to Hex");
	private JButton decToBin = new JButton("Dec to Bin");
	private JButton decToHex = new JButton("Dec to Hex");
	private JButton hexToBin = new JButton("Hex to Bin");
	private JButton hexToDec = new JButton("Hex to Dec");

	// Objects will be used to make number conversions
	private Decimal decimal;
	private Binary binary;
	private Hexadecimal hexadecimal;

	/**
	 * Make copies of objects for security reasons
	 * 
	 * @param binary
	 * @param hexadecimal
	 * @param decimal
	 */
	public Menu(Binary binary, Hexadecimal hexadecimal, Decimal decimal) {
		this.decimal = decimal;
		this.binary = binary;
		this.hexadecimal = hexadecimal;
	}

	/**
	 * Displays the menu
	 */
	public void display() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Number Systems");
		frame.add(panel);
		panel.add(binToDec);// adds button to convert from binary to decimal
		panel.add(binToHex);// adds button to convert from binary to hexadecimal
		panel.add(decToBin);// adds button to convert from decimal to binary
		panel.add(decToHex);// adds button to convert from decimal to hexadecimal
		panel.add(hexToBin);// adds button to convert from hexadecimal to binary
		panel.add(hexToDec);// adds button to convert from hexadecimal to decimal
		frame.pack();
		binToDec.addActionListener(this);
		binToHex.addActionListener(this);
		decToBin.addActionListener(this);
		decToHex.addActionListener(this);
		hexToBin.addActionListener(this);
		hexToDec.addActionListener(this);

	}

	/**
	 * Connects each button to an action which will perform the requested conversion
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == binToDec) {
			binary.convertToDecimal();
		} else if (e.getSource() == binToHex) {
			binary.convertToHexadecimal();
		} else if (e.getSource() == decToBin) {
			decimal.convertToBinary();
		} else if (e.getSource() == decToHex) {
			decimal.convertToHexadecimal();
		} else if (e.getSource() == hexToBin) {
			hexadecimal.convertToBinary();
		} else if (e.getSource() == hexToDec) {
			hexadecimal.convertToDecimal();
		}
	}
}
