public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
//        int c = calc.devide.apply(a, b);
//        calc.println.accept(c);

//        Ошибка возникает потому, что нельзя делить на ноль, решением может стать добавление исключения
//        либо добавление тернарного оператора в классе Calculator, в переменную devide, но тогда тоже выскочит ошибка
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException exception) {
            System.out.println("Делить на ноль нельзя");
        }
    }
}
