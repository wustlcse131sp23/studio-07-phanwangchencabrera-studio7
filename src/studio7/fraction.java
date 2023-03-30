package studio7;

public class fraction {
	
	private int numerator;
	private int denominator;
	
	public fraction(int theNumerator, int theDenominator) {
		numerator = theNumerator;
		denominator = theDenominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public fraction sum(fraction otherFraction) {
		int sumNumerator = (numerator * otherFraction.getDenominator())+(denominator * otherFraction.getNumerator());
		int sumDenominator = (denominator * otherFraction.getDenominator());
		
		fraction newFraction = new fraction(sumNumerator, sumDenominator);
		return newFraction;
	}
	
	public String toString() {
		return (numerator + "/" + denominator);
	}

	public static void main(String[] args) {
		fraction f1 = new fraction (1,2);
		fraction f2 = new fraction(1, 3);
		System.out.println(f1.sum(f2));
		
	}

}
