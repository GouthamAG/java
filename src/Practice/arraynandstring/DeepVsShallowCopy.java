package src.practice.arraynandstring;

public class DeepVsShallowCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int [] arr2 = arr1;

        System.out.println("Shallow Copy Example : Before Changing element : " + arr1[0]);
        System.out.println("Shallow Copy Example : Before Changing element : " + arr2[0]);
        arr1[0] = 90;

        System.out.println("Shallow Copy Example : After Changing element : " + arr1[0]);
        System.out.println("Shallow Copy Example : After Changing element : " + arr2[0]);



        int[] arr3 = {1,2,3};
        int [] arr4 = arr3.clone();

        System.out.println("Deep Copy Example : Before Changing element : " + arr3[0]);
        System.out.println("Deep Copy Example : Before Changing element : " + arr4[0]);
        arr3[0] = 90;

        System.out.println("Deep Copy Example : After Changing element : " + arr3[0]);
        System.out.println("Deep Copy Example : After Changing element : " + arr4[0]);

    }
}


/*
OUTPUT

Shallow Copy Example : Before Changing element : 1
Shallow Copy Example : Before Changing element : 1
Shallow Copy Example : After Changing element : 90
Shallow Copy Example : After Changing element : 90
Deep Copy Example : Before Changing element : 1
Deep Copy Example : Before Changing element : 1
Deep Copy Example : After Changing element : 90
Deep Copy Example : After Changing element : 1
 */