import java.util.*;

class LargeElement {
    public static void main(String args[]) {
        int arr[] = {1,3,2,4};
        int max = arr[0];
        int min = arr[0];
        int arr1[] = new int[4];
        int i;

        for ( i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    arr1[i] = arr[j];
                    break;
                    
                }
            }
        }
        for(i=0;i<arr.length;++i)
        {
        	if(arr1[i]==0)
        	{
        		arr1[i]=-1;
        	}
        }
        System.out.println(Arrays.toString(arr1));
    }
}
