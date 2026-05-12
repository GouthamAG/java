package src.practice.array;


public class RemoveDeuplicatedFromSortedArr {
    
    public static int removeDuplicates(int [] arr){
        int index = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                ++index;
                arr[index] = arr[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,4,4,5,5,6,7,7,7,8,9};
        int index = removeDuplicates(arr);
        System.out.println("Array with distinct elements : ");
        for(int i=0; i<=index; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
