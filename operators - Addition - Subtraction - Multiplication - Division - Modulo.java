import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char c=sc.next().charAt(0);
        switch(c){
        case '+':
            System.out.println("Addition of two number is "+(float)(a+b));
                 break;
        case '-':
        System.out.println("Subtraction of two number is "+(float)(a-b));
                 break;
        case '/':
        System.out.println("Division of two number is "+((float)a/(float)b));
        break;
                case '*':
        System.out.println("Multiplication of two number is "+(float)a*b);
        break;
                 case '%':
        System.out.println("Modulo of two number is "+(float)a%b);
        break;
            default:System.out.println("Invalid Input");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
