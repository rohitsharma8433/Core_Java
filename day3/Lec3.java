 /*  Relational Opretors Example  */
 import java.util.Scanner;
 
 class Lec3 {
    public static void main(String[] args) {
        int a,b;
        System.err.println("Enter two number :");

        Scanner sc=new Scanner(System.in);
        a=sc.nextInt(); //greater 
        b=sc.nextInt(); //lessar

        System.out.println("True / False : " +(a<b));
        System.out.println("True / False : " +(a>b));
        System.out.println("True / False : " +(a<=b));
        System.out.println("True / False : " +(a>=b));
        System.out.println("True / False : " +(a!=b));
        System.out.println("True / False : " +(a==b));
    }
}
