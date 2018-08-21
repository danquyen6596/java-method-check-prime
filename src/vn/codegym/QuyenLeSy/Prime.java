package vn.codegym.QuyenLeSy;

import java.util.Scanner;
import java.lang.Math;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Nhập vào số nguyên bất kỳ: ");
        num = scanner.nextInt();
        if (isPrime(num))
            System.out.println("Số vừa nhập là số nguyên tố!");
        else
            System.out.println("Số vừa nhập không phải số nguyên tố!");
        System.out.println("Các số nguyên tố nhở hơn 1000 là:");
        for (int i = 1; i <= 1000; i++)
        {
            if (isPrime(i))
                System.out.printf("%d\t",i);
        }
    }

    public static boolean isPrime(int num){
        int count = 0;
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num%i == 0){
                count++;
            }
        }

        if (count != 0)
            return false;
        else
            return true;
    }
}
