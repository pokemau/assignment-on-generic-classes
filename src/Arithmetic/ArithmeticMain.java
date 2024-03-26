package Arithmetic;

public class ArithmeticMain {
    public static void main(String[] args) {

        Arithmetic<Double, Integer> t = new Arithmetic<>(5.2, 9);

        System.out.println("ADD: " + t.add());
        System.out.println("SUB: " + t.subtract());
        System.out.println("MUL: " + t.multiply());
        System.out.println("DIV: " + t.divide());
        System.out.println("MIN: " + t.getMin());
        System.out.println("MAX: " + t.getMax());

    }
}
