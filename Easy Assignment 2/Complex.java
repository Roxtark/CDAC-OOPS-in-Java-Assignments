
class Complex {
    float real;
    float imaginary;

    Complex(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void sum(Complex c) {
        float realPart = real + c.real;
        float imaginaryPart = imaginary + c.imaginary;

        System.out.println("Sum = " + realPart + " + " + imaginaryPart + "i");
    }

    void difference(Complex c) {
        float realPart = real - c.real;
        float imaginaryPart = imaginary - c.imaginary;

        System.out.println("Difference = " + realPart + " + " + imaginaryPart + "i");
    }

    void product(Complex c) {
        float realPart = (real * c.real) - (imaginary * c.imaginary);
        float imaginaryPart = (real * c.imaginary) + (imaginary * c.real);

        System.out.println("Product = " + realPart + " + " + imaginaryPart + "i");
    }

    public static void main(String[] args) {

        System.out.println("Enter real part of first complex number:");
        float real1 = ConsoleInput.getFloat();

        System.out.println("Enter imaginary part of first complex number:");
        float imaginary1 = ConsoleInput.getFloat();

        System.out.println("Enter real part of second complex number:");
        float real2 = ConsoleInput.getFloat();

        System.out.println("Enter imaginary part of second complex number:");
        float imaginary2 = ConsoleInput.getFloat();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        c1.sum(c2);
        c1.difference(c2);
        c1.product(c2);
    }
}

