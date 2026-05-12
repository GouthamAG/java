package src.practice.array;

public class Demo3 {

    public static void main(String[] args) {
    
        int[] arr1 = new int[5];

        arr1 = new int[] {1,2,3,4,5};

        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();


        arr1 = new int[] {10,20,30,40,50};
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        int [] arr2 = arr1;
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        int [] arr4 = new int[6];
        arr4 = arr2;
        for(int i = 0; i < arr4.length; i++){
            System.out.print(arr4[i] + " ");
        }
        System.out.println();
        
        final int [] arr5 = arr4;
        for(int i = 0; i < arr5.length; i++){
            System.out.print(arr5[i] + " ");
        }
        System.out.println();

        arr5[4] = 1002;
        for(int i = 0; i < arr5.length; i++){
            System.out.print(arr5[i] + " ");
        }
        System.out.println();


    }
}
