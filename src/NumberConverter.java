
public class NumberConverter {
	public static void main(String[] args) {
		Decimal dec = new Decimal();
		Binary bin = new Binary();
		Hexadecimal hex = new Hexadecimal();
		Menu menu = new Menu(bin, hex, dec);
		menu.display();
	}
}
