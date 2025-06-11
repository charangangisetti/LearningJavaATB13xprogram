package ex_03_Literals;

public class Lab033_Literals {
    public static void main(String[] args) {
        int age = 65; //65

        //Binary Literal
        int binary_num = 0b1010; // Decimal System -10


        // Octal base? ->8
        int octal = 0101;

        // Hexadecimal Literals - 16
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a7454
        System.out.println("Decimal Age: " + age);
        System.out.println("Binary Number: " + binary_num);
        System.out.println("Octal Number: " + octal);
        System.out.println("Hexadecimal Number: " + hex);
    }
}
