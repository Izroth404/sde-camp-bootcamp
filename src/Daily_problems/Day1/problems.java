package Daily_problems.Day1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class problems {
    public static void main(String[] args) {

        System.out.println("--Q1--");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        int n = sc.nextInt();
        System.out.println("Entered: "+n);

        System.out.println("\n--Q2--");
        System.out.println("Check for <18 or >18");
        p1(sc.nextInt());

        System.out.println("\n--Q3--");
        p2(1);

        System.out.println("\n--Q4--");
        System.out.println("a.addition\nb.subtraction");
        String c1=sc.next();
        p3(c1.charAt(0));

        System.out.println("\n--Q5--");
        System.out.println("Check for even or Odd");
        int n1 = sc.nextInt();
        p5(n1);

        System.out.println("\n--Q6--");
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        p6(a,b,c);


        System.out.println("\n--Q7--");
        System.out.println("Sum of n natural numbers:\nValue of n:");
        p7(sc.nextInt());


        System.out.println("\n--Q8--");
        System.out.println("Vowel or Consonant\nCharacter: ");
        String x= sc.next();
        p8(x.charAt(0));

        System.out.println("\n--Q9--");
        p9();

        System.out.println("\n--Q10--");
        System.out.println("Factorial\nValue of n:");
        int n2 = sc.nextInt();
        p10(n2);
    }
    static void p1(int n){
        System.out.println(n>18?">18":"<18");
    }

    static int p2(int n){
        if(n==100) {
            System.out.println(100);
            return 100;
        }
        System.out.println(n);
        return (p2(n+1));
    }

    static  void p3(char c){
        switch (c){
            case 'a':
                System.out.println("addition: "+ (1+1));
                break;
            case  'b':
                System.out.println("subtraction: "+ (1-1));
                break;
            default:
                System.out.println("Fall Through");
        }
    }

    static  void p5(int n){
        System.out.println(n%2==0?"Even":"Odd");
    }

    static  void p6(int a ,int b,int c){
        System.out.println(Math.max(a,Math.max(b,c)));
    }

    static int p7(int n){
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s+=i;
        }
        System.out.println("Sum: ");
        return s;
    }

    static void p8(char c){
        List<Character> ch =new ArrayList<>();
        ch.addAll(Arrays.asList('a','e','i','o','u'));
        c = Character.toLowerCase(c);
        System.out.println(ch.contains(c)?"Vowel":"Consonant");
    }

    static void p9(){
        int a = 10;
        double b= a;
        int  c=  (int)089.09;

        System.out.println(a+" "+c);
    }

    static void p10(int n){
        int f=1;
        for (int i = 1; i <= n; i++) {
            f*=i;
        }
        System.out.println("Factorial: "+f);
    }
}
