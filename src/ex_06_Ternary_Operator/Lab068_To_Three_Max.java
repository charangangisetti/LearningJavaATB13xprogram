package ex_06_Ternary_Operator;

public class Lab068_To_Three_Max {
    // Find the maximum between the three numbers.
    // Now we will be using the logic building formula.
    public static void main(String[] args) {
        int x = 10;
        int y = 40;
        int z = 30;

        // Step 1 : Find inputs /outputs
        // I/O -> x,y,z - int
        // O/P -> String ->  max number

        // Step 2 - Rough Logic, Think about it.
        // x > y and x  > z -> x
        // y > z and y >  x ->  y
        // z

        // Step 3
        // int max = (x > y) ? A : B;
        int max = (x > y) ? (x > z) ? x : z : (y > z) ? y : z;
        // A -> (x > z) ? x : z
        // B -> ( y > z) ? y : z
        System.out.println(max);

    }


}
