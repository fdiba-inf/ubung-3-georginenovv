package exercise3;

import java.util.Scanner;

public class NumberCounter  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Positivenumbers =0;
        int Negativenumbers = 0;
        float sum = 0;
        int number = input.nextInt();
        while (number != 0){
          if(number > 0){
          Positivenumbers  ++;
          }else {Negativenumbers++;}
          sum += number;
          number =input.nextInt();
        }
        float average =(sum/Positivenumbers+ Negativenumbers);
        System.out.println("Positive numbers" + Positivenumbers);
        System.out.println("Negative numbers" + Negativenumbers);
        System.out.println("sum"+ sum );
        System.out.println("average" + average);
    }
}          
