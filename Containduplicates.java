public class Containduplicates {


    public static void ContainDuplicates(int arr[]){
        int small = arr[0];
        int big =0;

        for (int i=0;i<arr.length;i++){

            for (int j =i+1 ;j<arr.length;j++){

                

                if (small >arr[j]){
                    small = arr[j];
                }
                if (big<arr[j]){
                    big = arr[j];
                }
            }

        }
        System.out.println("Small :"+small +" Big :" +big);
    }
    public static void main(String[] args) {
        
        int arr [] = {6,2,8,4,5};
        ContainDuplicates(arr);


    }

}
