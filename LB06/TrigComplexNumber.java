package LB06;
public class TrigComplexNumber {
    private double modulus;
    private double argument;

    public TrigComplexNumber(double modulus, double argument) {
        this.modulus = modulus;
        this.argument = argument;
    }

    public void inputNumber(double modulus, double argument) {
        this.modulus = modulus;
        this.argument = argument;
    }

    public void displayNumber() {
        System.out.println(modulus + " × [cos(" + argument + ") + i × sin(" + argument + ")]");
    }

    public TrigComplexNumber power(int exponent) {
        double newModulus = Math.pow(modulus, exponent);
        double newArgument = argument * exponent;

        return new TrigComplexNumber(newModulus, newArgument);
    }
}
