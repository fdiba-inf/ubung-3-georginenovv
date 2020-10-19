package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 2;
        int number = input.nextInt();
        boolean prime= true;
        while (a<number){ 

        if (number % a == 0) {   
        prime = false;  
       }  
        a++; 
        } 
    System.out.println("Prime? " + prime); 
}
}