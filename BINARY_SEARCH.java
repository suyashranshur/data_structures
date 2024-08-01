public class BINARY_SEARCH {

    public static void BINARY_scr(int arr[],int ele,int si,int ei){
        
            int mid =(si+ei)/2;

            if (arr[mid]==ele){
            System.out.println(arr[mid]+" position is :"+mid);
            }
            if (arr[mid]<ele){
            BINARY_scr(arr, ele, mid+1, ei);
            }
             if (arr[mid]>ele){
            BINARY_scr(arr, ele, si, mid-1);
            }
        }

    
    public static void main(String[] args) {
        
        int arr[] = {2,4,5,6,8,9,10,12,15,17,18,19};
        BINARY_scr(arr, 9, 0, arr.length);

        


    }
}
