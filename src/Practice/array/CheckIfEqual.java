package src.practice.array;

import java.util.Arrays;

public class CheckIfEqual {

    public static Boolean findTwoArraysEqual(int[] arr1, int [] arr2){

        // // Method 1:
        // if(arr1.length != arr2.length){
        //     return false;
        // }

        // for(int i = 0; i < arr1.length; i++){
        //     if(arr1[i] != arr2[i]){
        //         return false;
        //     }
        // }
        // return true;

        //Method 2:
        return Arrays.equals(arr1, arr2);

    }

    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5,6};
        int arr2 [] = {1,2,3,4,5};

        Boolean isArraysEqual = findTwoArraysEqual(arr1, arr2);
        System.out.println("Result : " + isArraysEqual);
    }
    
}
