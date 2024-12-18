//program to print a fibonacci sequence using recursion

import java.util.Scanner;
public class fibonacciseries{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp;
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
             temp=a+b;
            System.out.print(" "+ temp);
            a=b;
            b=temp;
        }
    }
}