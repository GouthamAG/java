package src.practice.CodingPracticeCompanies.Array;

public class RemoveDuplicatesInUnSortedArray {
    
    public static int [] getSortedArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static int findUniqueElements(int[] arr){
        int index = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                index++;
                arr[index] = arr[i];
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int [] arr = {9,2,2,4,7,1,8,9,1,5};

        arr = getSortedArray(arr);
        System.out.println("Sorted Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        int index = findUniqueElements(arr);

        System.out.println("Unique Elemments : ");
        for(int i=0; i<index+1; i++){
            System.out.print(arr[i] + " ");
        }
    }    
}
