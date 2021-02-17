public class selection_sort {
    public static void main(String[] args){
        int data[] = {5,1,3,7,4,6,2};
        int n = data.length;
        
        System.out.println("Sebelum Sorting");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
        
        for(int i=0; i<n; i++){
            int min = data[i];
            for(int j=i; j<n; j++){
                if(data[j] < min ){
                    min = data[j];
                    data[j] = data[i];
                    data[i] = min;
                }
            }
            
        }

        System.out.println("Sesudah Sorting");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        
}
}
