import java.lang.System;
import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(a+b);
        sc.close();

    }
}