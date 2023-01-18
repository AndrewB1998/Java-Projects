

public class Paikka extends Etaisyys {
	private char x;
	private String y;
	
	/**
	 * @pre x isUppercase && x isLetter
	 * 		y != null &&  y >= 00 && y <= 99 && y length == 2 */
	public Paikka(char x, String y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * @pre true
	 * @post RESULT == x */
	public char getX() {
			return x;
			}
	/**
	 * @pre true
	 * @post getX().equals(x) */
	public void setX(char x) {
		if (Character.isUpperCase(x) == true && Character.isLetter(x)) {
		this.x = x;}
		else {System.out.println("Arvo ei vastaa ehtoja");
		}}
	/**
	 * @pre true
	 * @post RESULT == y */
	public String getY() {
			return y;
		}
	/**
	 * @pre true
	 * @post getY().equals(y) */
	public void setY(String y) {
		if (Integer.valueOf(y) >= 0 && Integer.valueOf(y) <= 99 && y != null) {
		this.y = y;}
		else {System.out.println("Arvo ei vastaa ehtoja");
	}
		
	}

	
}
