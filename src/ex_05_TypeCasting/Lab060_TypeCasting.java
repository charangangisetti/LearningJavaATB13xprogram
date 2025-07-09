package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone = 987654324l;
//        short s = phone; // Implicit Narrow?
        short s1 = (short)phone;
        System.out.println(s1); // Explicit Narrow?
    }
}
