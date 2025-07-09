package ex_06_Ternary_Operator;

public class Lab066_TO_Even_Odd {
    public static void main(String[] args) {
        //Find even or odd numbers
//        int num = 10;
          int num = 9;
//        int num = 98;
//        int num = -12;
        String result = ( num%2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
