package exercise3;

import java.util.Scanner;

public class NumberCounter  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int posCount =0;
        int negCount = 0;
        float sum = 0;
        int number = input.nextInt();
        while (number != 0){
          if(number > 0){
            posCount++;
          }else {negCount++;}
          sum += number;
          number =input.nextInt();
        }
        float average =(sum/(posCount+ negCount));
        System.out.println("posCount" + posCount);
        System.out.println("negCount" + negCount);
        System.out.println("sum"+ sum );
        System.out.println("average" + average);
    }
}          
