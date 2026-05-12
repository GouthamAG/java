package src.practice.array;

public class MultiDArray {
    public static void main(String[] args) {
        int[][][] multi_d_arr = {
            { 
                {  1, 2, 3},
                {  4, 5, 6}
            }, 
            {
                {  7, 8, 9},
                {  10, 11, 12}
            }
        };

    int len_1d = multi_d_arr.length;
    int len_2d = multi_d_arr[0].length;
    int len_3d = multi_d_arr[0][0].length;

    for(int i = 0; i < len_1d; i++){
        for(int j = 0; j < len_2d; j++){
            for(int k = 0; k < len_3d; k++){
                System.out.print(multi_d_arr[i][j][k] + " ");
            };
            System.out.println(' ');
        };
        System.out.println(' ');
    };
};
};
