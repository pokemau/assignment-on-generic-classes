package Arithmetic;

public class ArithmeticMain {
    public static void main(String[] args) {

        Arithmetic<Double, Integer> t = new Arithmetic<>(5.2, 9);

        System.out.println(t.add());

    }
}
