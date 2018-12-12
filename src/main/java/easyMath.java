import java.sql.SQLOutput;
import java.util.Scanner;

public class easyMath {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //double is better than int because if a <  b than we get correct result

        double result;   // I need it for print result
        System.out.println("\nIn this class I playing with mathematics... \n");
        System.out.println("Give me first number what is your mind...");
        int a =scanner.nextInt();
        System.out.println("Give me second number what is in your mind...");
        int b= scanner.nextInt();
        System.out.println("\n basic arithmetic...'\n");

        result=a+b;
        System.out.println("Sum of "+a+ "+"+b+"="+result);
        System.out.println("And some more easy math :)");
        result=a-b;
        System.out.println(a+"-"+b+"="+result);
        result=a*b;
        System.out.println(a+"*"+b+"="+result);
        result=a/b;
        System.out.println(a+"/"+b+"="+result);




    }
}
