
import java.util.Scanner;

public class functionoverloading {

    public int multiply(int  a,int  b){
        return a+b;
        
    }
    public int multiply(int  a,int b,int c){
        return a+b+c;
        
    }
    
    public static void main(String[] args) {
        
        System.out.print("How many numbers you want to multiply(2/3) :");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a,b,c;


        if (n == 3){
            System.out.print("Enter number a:");
            a=sc.nextInt();
            System.out.print("Enter number b:");
            b=sc.nextInt();
            System.out.print("Enter number c:");
            c=sc.nextInt();
            

            
            
        }
        else if (n==2){
            System.out.print("Enter number a:");
            a=sc.sc.nextInt();
            System.out.print("Enter number b:");
            b=sc.sc.nextInt();
            multiply(a, b);
           
            

        }else{
            System.out.println("Invalid..");
        }
    }
}
