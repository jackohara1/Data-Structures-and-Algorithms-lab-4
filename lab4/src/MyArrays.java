public class MyArrays {
    public static int linearSearch(int [] a, int currentSize, int searchKey){

        boolean found= false;
        int index = 0;

        while (!found&&index<currentSize){
            if (a[index]==searchKey){
                found=true;
            }
            else{
                index++;
            }
        }
        if (found){
            return index;
        }
        else{
            return -1;
        }
    }
    public static int[] merge(int []a1, int left1, int right1, int []a2, int left2, int right2){
        int i = left1, j = left2, k=0;
        int[] a3 = new int[100];

        while(i<=right1&&j<=right2){
            if(a1[i]<=a2[j]){
                a3[k]=a1[i];
                i++;
                k++;
            }
            else if (a1[i] > a2[j])
            {
                a3[k]=a2[j];
                i++;
                k++;
            }
        }
        if(i<= right1){
            int m=k;
            for(int l=i; l<=right1; l++){
                a3[m]=a1[l];
                m++;
            }
        }
        if(j<= right2){
            int m=k;
            for(int l=i; l<=right2; l++){
                a3[m]=a1[l];
                m++;
            }

        }
        return a3;
    }

}
