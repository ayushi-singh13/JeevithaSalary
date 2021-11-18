package com.thoughtworksProgram;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int[] weekHours = new int[7];

        for(int i=0;i<7;i++)
            weekHours[i]=scanner.nextInt() ;

        int salary = 0,totalHours=0;

        salary+=weekHours[0]*150;
        salary+=weekHours[6]*125;

        for(int i = 1 ; i < 6 ;i++) {
            salary+=weekHours[i]*100;
            if(weekHours[i] > 8) {
                salary+=(weekHours[i]-8)*15;
            }


            totalHours+=weekHours[i];
        }
        if(totalHours > 40) {
            salary += (totalHours - 40) * 25;
        }

        System.out.println("Total Salary is: " + salary);

    }
}
