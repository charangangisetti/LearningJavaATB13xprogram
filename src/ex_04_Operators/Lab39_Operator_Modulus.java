package ex_04_Operators;

public class Lab39_Operator_Modulus {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;

        System.out.println(a%b);
        /*Method explain
        15 % 20
        Question: How many times can 20 go into 15?
            20 × 0 = 0 ✅
        20 × 1 = 20 ❌ (too big)
        So, the quotient is 0, and the remainder is 15*/

        System.out.println(15%8);
        /*Question: How many times can 8 go into 15?
                8 × 1 = 8 ✅
                8 × 2 = 16 ❌ (too big)
        So, the quotient is 1, and the remainder is 7*/
    }
}
