package src.practice.arraynandstring;

public class Demo001 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int len_of_arr = arr.length;

        for(int i=0; i<len_of_arr; i++){
            System.out.println("Index : " + i + " Item : " + arr[i]);
        }
    }
}
