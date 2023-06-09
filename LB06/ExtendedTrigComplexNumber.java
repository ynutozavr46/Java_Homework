package LB06;

public class ExtendedTrigComplexNumber extends TrigComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ExtendedTrigComplexNumber(double modulus, double argument, double realPart, double imaginaryPart) {
        super(modulus, argument);
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }


    public void printNumber() {
 
        System.out.println();
    }
}
