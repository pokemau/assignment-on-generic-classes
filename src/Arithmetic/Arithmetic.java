package Arithmetic;

/*
The Arithmetic class has a constructor that will take two Numbers --
    wherein a double, float, int, short, long are considered numbers.
    These numbers may not be of the same data type.

In storing them in the class, they should keep their original data types as how they were declared to be
i.e. do not typecast them to float or double upon assignment. You may typecast them in operations.

Example:
Accepted use of constructors:
- (int, float)
- (int, int)
- (short, long)
- (double, short)
- and others
Not accepted:
- (char, int)
- (short, boolean)
- or any data type that is not a number

The operations are as follows wherein they would perform the operations on those two numbers
and return the result:
- add()
- subtract()
- multiply()
- divide()
- getMin()
- getMax()
 */
public class Arithmetic<T extends Number, E extends Number> {

    T m;
    E n;

    public Arithmetic(T m, E n) {
        this.m = m;
        this.n = n;
    }

    public Number add() {
        double sum;
        sum = m.doubleValue() + n.doubleValue();
        return sum;
    }

    public Number subtract() {
        double sum;
        sum = m.doubleValue() - n.doubleValue();
        return sum;
    }

    public Number multiply() {
        double sum;
        sum = m.doubleValue() * n.doubleValue();
        return sum;
    }

    public Number divide() {
        double sum = 0.0;
        try {
            sum = m.doubleValue() / n.doubleValue();
        } catch (ArithmeticException e) {
            System.out.println("CANNOT DIVIDE BY ZERO");
        }
        return sum;
    }

    public Number getMax() {
        return Math.max(m.doubleValue(), n.doubleValue());
    }

    public Number getMin() {
        return Math.min(m.doubleValue(), n.doubleValue());
    }
}
