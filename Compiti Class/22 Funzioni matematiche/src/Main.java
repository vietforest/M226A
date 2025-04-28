import CustomMath.FunctionMath;

public class Main {
    public static void main(String[] args) {
        int x = FunctionMath.abs(-123);
        double y = FunctionMath.abs((double)123.132);
        double hy = FunctionMath.hypotenuse(89, 28);
        System.out.println(x);
        System.out.println(y);
        boolean prime = FunctionMath.isPrime(5);
        System.out.println(hy);
    }
}