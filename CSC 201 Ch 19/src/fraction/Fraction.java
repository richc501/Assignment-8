package fraction;
import java.io.Serializable;
public class Fraction implements Serializable{
	private int numerator, denominator;
	private static char slash = '/';
	
	public Fraction()
	{
		super();
		this.slash ='/';
	}
	public Fraction(int numerator, int denominator)
	{
		super();
		this.slash = '/';
		this.setNumerator(numerator);
		this.setDenominator(denominator); 
	}
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	public static char getSlash() {
		return slash;
	}
	public static void setSlash(char slash) {
		Fraction.slash = slash;
	}
	public String toString() {
		return "Fraction [numerator=" + numerator + ", denominator="
				+ denominator + "]";
	}
}
