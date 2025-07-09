package ex_06_Ternary_Operator;

public class Lab065_TO {
    public static void main(String[] args) {
        // The maximum number between two numbers by using ternary operator.
        int x = 10;
        int y = 20;
//        System.out.println(Math.max(x,y));

        int max = x > y ? x : y;//we need to use "int" for A number or for calculation
        System.out.println(max);

    }
}
