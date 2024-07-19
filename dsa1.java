public class dsa1 {
    public static void function1(int planth[]) {

        for (int i=1;i<planth.length-1;i++){

            if ((planth[i] > planth[i-1]) &(planth[i] > planth[i+1]) ){

                System.out.println("plant height is greater :"+planth[i]);

            }

        }
        System.out.println("end");
        
    }

    public static void printarr(int planth[]){

        for (int i=0;i<planth.length;i++){
            System.out.print(planth[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        
        int planth[] = {1,2,1,5,4,5,1,3,6,7,7,4,52,4,34};

        

        printarr(planth);
        function1(planth);

        
    }
}

