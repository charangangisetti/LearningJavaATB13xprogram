package ex_04_Operators;

public class Lab040_Relational_Operators {
    public static void main(String[] args) {

//                < Less Than
//                < = -> Less than or equal
//                > Greater
//                > = Greater or equal
//                == -> Equal to (but checking)
//                != -> Not equal

//        All of them will result boolean output

        int a = 10;
        int b = 30;
        boolean c = a > b; // 10 > 30
        System.out.println(c);

        int age_mamitha = 24;
        int age_charan = 26;
        boolean result = age_mamitha >= age_charan;
        System.out.println(result);
    }
}
