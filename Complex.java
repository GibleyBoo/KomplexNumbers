/**
 * Creation of and calculation of complex numbers.
 * @author GibleyBoo
 *
 * Class Complex contains a real value and an imaginary value.
 * @see Object
 *
 */
public class Complex extends Object {
    // Class variables

    /**
     * Real and imaginary parts.
     * x axis representing Re(Z)
     * y axis representing Im(Z)
     */
    private double x, y;

    /**
     * Complex numbers used in calculations.
     * Z1: this
     * Z2: input
     * Z3: return value
     */
    private Complex Z1 = this, Z2, Z3;

    // Constructors

    /**
     * Creates the Complex number Z = re + im * i <--> (re, im)
     *
     * @param re Real part
     * @param im Imaginary part
     */
    public Complex(double re, double im) {
        this.x = re;
        this.y = im;
    }

    /**
     * Real value
     *
     * @return real         The real value of this complex number
     */
    public double Re() {
        return this.x;
    }

    /**
     * Imaginary value
     *
     * @return imag         The imaginary value of this complex number
     */
    public double Im() {
        return this.y;
    }

    /**
     * Complex number angle
     *
     * @return Angle        The angle of this complex number in radians
     */
    public double arg() {
        double alpha = Math.atan(this.Im() / this.Re());
        return alpha;
    }

    /**
     * Complex number string
     *
     * @return Expression   The String representation of this complex number
     */
    public String toString() {
        String number = this.Re() + " + " + this.Im() + "i";
        return number;
    }

    // Basic arithmetic operations

    /**
     * Complex number addition
     *
     * @param Z Addend
     * @return Sum          The sum of Z1 + Z2
     */
    public Complex add(Complex Z) {
        Z2 = Z;
        Z3 = new Complex(Z1.Re() + Z2.Re(), Z1.Im() + Z1.Im());
        return Z3;
    }

    /**
     * Complex number subtraction
     *
     * @param Z Subtrahend
     * @return Difference   The difference of Z1 - Z2
     */
    public Complex sub(Complex Z) {
        Z2 = Z;
        Z3 = new Complex(Z1.Re() - Z2.Re(), Z1.Im() - Z1.Im());
        return Z3;
    }

    /**
     * Complex number multiplication
     *
     * @param Z Multiplier
     * @return Product      The product of Z1 * Z2
     */
    public Complex mult(Complex Z) {
        Z2 = Z;
        Z3 = new Complex(Z1.Re() * Z2.Re(), Z1.Im() * Z2.Im());
        return Z3;
    }

    /**
     * Complex number division
     *
     * @param Z Divisor
     * @return Quotient     The quotient of Z1 / Z2
     */
    public Complex div(Complex Z) {
        Z2 = Z;
        Z3 = new Complex(Z1.Re() / Z2.Re(), Z1.Im() / Z2.Im());
        return Z3;
    }
}
