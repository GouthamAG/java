package src.practice.CodingPracticeCompanies.Array;

import java.util.ArrayList;
import java.util.List;

public class SortArrayListWithoutCollection {
    
    public static void main(String[] args) {
    
    List<Integer> arrList1 = new ArrayList<>();

    arrList1.add(2);
    arrList1.add(2);
    arrList1.add(3);
    arrList1.add(1);
    arrList1.add(5);
    arrList1.add(4);

    for(int i=0; i<arrList1.size(); i++){
        for(int j=0; j<arrList1.size()-i-1; j++){
            if(arrList1.get(j) > arrList1.get(j+1)){
                int temp = arrList1.get(j);
                arrList1.set(j, arrList1.get(j+1));
                arrList1.set(j+1, temp);                
            }
        }
    }

    System.out.println("Sorted Array List : ");
    for(int i=0; i<arrList1.size(); i++){
        System.out.print(arrList1.get(i) + " ");
    }

    
    }
}