package studio7;

public class Complex {
	private double real;       // Real part
    private double imaginary;  // Imaginary part

    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add another complex number
    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // Method to multiply by another complex number
    public Complex multiply(Complex other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(newReal, newImaginary);
    }

    // Method to represent the complex number as a string
    public String toString() {
        // Format: a + bi
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";	// so that we don't print a double negative
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(3, 4); // 3 + 4i
        Complex c2 = new Complex(1, 2); // 1 + 2i

        // Adding complex numbers
        Complex sum = c1.add(c2);
        System.out.println("Sum: " + sum); // Outputs: Sum: 4.0 + 6.0i

        // Multiplying complex numbers
        Complex product = c1.multiply(c2);
        System.out.println("Product: " + product); // Outputs: Product: -5.0 + 10.0i

	}

}
