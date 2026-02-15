package Dec13;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sub = calc.sub(10, 6);
        System.out.println(sub);

        int add = calc.sum(10, 7);
        System.out.println(add);

        int div = calc.div(5, 0);
        System.out.println(div);

        int div2 = calc.div(10, 5);
        System.out.println(div2);

        int mul = calc.mul(4, 5);
        System.out.println(mul);
    }
}
