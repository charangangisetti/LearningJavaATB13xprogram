package ex_07_Increment_Decrement_Op;

import java.util.Scanner;

public class Lab082_if_Else {
    public static void main(String[] args) {
        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        // int age = Integer.parseInt(args[0]);

        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

//        int a = 10;

        if(age <= 18){
            System.out.println("Allowed to vote!");
        }else{
            System.out.println("Not Allowed to vote");
        }


    }
}
