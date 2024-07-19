
import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        
        int arr[] = { 9,2,5,0,1,6};

        System.out.print("Search Element :");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count=0;

        for (int i =0 ;i<arr.length;i++){
            if (num == arr[i]){
                count++;
            }
        }
        if (count>0){
            System.out.println("This number is present in array ,At position :");
        }
        else{
            System.out.println("This number is not present");
        }
        
    }
}
