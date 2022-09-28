package assignments;

import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Plese Input Two Numbers");

        // write a program to print whether a number is
        // even or odd, also take input from the user
//        System.out.print("Enter the name here : "  );
//        System.out.println("Hello " + input.nextLine());





//        int number = input.nextInt();
//
//        if (number % 2 == 0){
//            System.out.println( number + " is even number." );
//
//        }else{
//            System.out.println( number + " is odd number." );
//        }
//


//



//        calc();
//        System.out.println(largestnum());
//        System.out.println(fibo());
//        System.out.println(currency());
//        palindromeStr();
        armstrong();
    }

    static String assignment() {
        Scanner in = new Scanner(System.in);

//        if (a % 2 == 0) {
//            System.out.println(a + " is even");
//        } else {
//            System.out.println(a + " is odd");
//        }

        System.out.println("Enter the name ");
        String name = in.nextLine();
        System.out.print("Hello " + name);


        return name;
    }

    static void calc( ){

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        char ch = in.next().trim().charAt(0);
        int b = in.nextInt();
        int result = 0;

        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){

            if (ch == '+'){
                result = a + b;
            } else if (ch == '-') {
                result = a - b;
            } else if (ch == '*') {
                result  = a * b;
            } else if (ch == '/') {
                if (b != 0){
                    result = a / b;
                }
            } else if (ch == '%') {
                result = a % b;
            }else {
                System.out.println("invalid oprator");
            }
            System.out.println(result);
        }

    }

    static int largestnum(){

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int max = 0;

        if(a < b){
            max = b;
        }
        if (b < c){
            max = c;
        }

        if (c < d){
            max = d;
        }

        return max;
    }

    static int fibo(){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;

        int count = 2;

        while (count <= n){
            int tem = b;
            b = b + a;
            a = tem;
            count++;
        }
        return b;
    }

    static float currency(){

        Scanner in = new Scanner(System.in);
        float ruppe = in.nextLong();
        float  dollor = ruppe / 240;
        return dollor;
    }

    static void palindromeStr(){
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        String reverse = "";

        for (int i = name.length()-1; i>=0; i--) {
            reverse = reverse + name.charAt(i);
        }

        System.out.println(reverse);

    }

    static int armstrong(){
        Scanner in = new Scanner(System.in);

        int n, arm=0, rem, c;
        System.out.println("enter the number");
        n = in.nextInt();

        c = n;
        while (n > 0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }

        if (c==arm){
            System.out.println("Armstrong");
        }else {
            System.out.println("not armstrong");
        }
     return arm;
    }


}
