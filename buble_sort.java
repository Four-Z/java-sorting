public class buble_sort {
    public static void main(String[] args){
        int data[] = {5,1,3,7,4,6,2};
        int n = data.length;
        int temp;

        System.out.println("Sebelum Sorting");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }

        for(int i=0; i<n; i++){
            for(int j=n-1; j>=1; j--){
                if(data[j] < data[j-1]){
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp; 
                 }
                 
                }
                System.out.println();
                for(int m=0; m<data.length; m++){
                    System.out.print(data[m]+" ");
            }
            
        }
        
        // System.out.println("\nSesudah Sorting");
        // for(int i=0; i<data.length; i++){
        //     System.out.print(data[i]+" ");
        // }


    }
}
