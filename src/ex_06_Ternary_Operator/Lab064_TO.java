package ex_06_Ternary_Operator;

public class Lab064_TO {
    public static void main(String[] args) {
        // Find Min number between two numbers by using ternary operator
        int x = 15;
        int y = 20;
//        System.out.println(Math.max(x,y));

        int min = x < y ? x : y;
        System.out.println(min);
    }
}
