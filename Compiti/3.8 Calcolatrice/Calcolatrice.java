/**
 ES 3.8
 creare una calcolatrice


 @author huynh anh nguyen
 @version 10.02.2025

 **/


public class Calcolatrice {
    public static void main(String[] args){
        int primoNumero = Integer.parseInt(args[0]);
        int secondoNumero = Integer.parseInt(args[1]);
        String segno = args[2];
        if (segno.equals("+")){
            System.out.println(primoNumero + secondoNumero);
        } else if (segno.equals("-")) {
            System.out.println(primoNumero - secondoNumero);
        } else if (segno.equals("*")) {
            System.out.println(primoNumero * secondoNumero);
        } else if (segno.equals("/")) {
            System.out.println(primoNumero / secondoNumero);
        }
    }
}
