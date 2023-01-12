public class Main {
    public static void main(String[] args) {
        Complex num1 = new Complex(5, 4);
        Complex num2 = new Complex(4, 2);
        Complex.printComplex(Complex.sum(num1, num2));
        Complex.printComplex(Complex.diff(num1, num2));
        Complex.printComplex(Complex.product(num1, num2));
    }
}

class Complex {
    int real;
    int imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    static Complex sum (Complex num1, Complex num2) {
        return new Complex(num1.real + num2.real, num1.imaginary + num2.imaginary);
    }

    static Complex diff (Complex num1, Complex num2) {
        return new Complex(num1.real - num2.real, num1.imaginary - num2.imaginary);
    }

    static Complex product (Complex num1, Complex num2) {
        return new Complex((num1.real*num2.real) - (num2.imaginary* num1.imaginary), num1.imaginary* num2.real + num2.imaginary*num1.real);
    }

    static void printComplex(Complex ans) {
        System.out.print(ans.real);
        if(ans.imaginary > 0) {
            System.out.println(" + " + ans.imaginary+"i");
        }
        if(ans.imaginary < 0) {
            System.out.println(" - " + ans.imaginary+"i");
        }
    }
}
