package CustomMath;

public class FunctionMath {

    public static int abs(int x) {
        return Math.abs(x);
    }

    public static double abs(double x) {
        return Math.abs(x);
    }

    public static boolean isPrime(int num) {
        boolean flag = false;

        // 0 and 1 are not prime numbers
        if (num == 0 || num == 1) {
            flag = true;
        }

        for (int i = 2; i <= num / 2; ++i) {

            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag){
            System.out.println(num + " is a prime number.");
            return flag;
        }
        else{
            System.out.println(num + " is not a prime number.");
            return flag;
        }
    }

    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }
}
