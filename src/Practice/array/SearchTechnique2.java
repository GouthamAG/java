package src.practice.array;

public class SearchTechnique2 {

    public static class Result{
        Boolean result;
        Integer index;

        public Result(Boolean result, Integer index){
            this.result = result;
            this.index = index;
        }
    }

    public static Result search(Integer [] arr, Integer key){
        Boolean result = false;
        Integer index = null;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                result = true;
                index = i;
            }
        }
        return new Result(result, index);
    }
    public static void main(String[] args) {
        Integer arr[] =  {3, 5, 7, 2, 6, 10};
        Integer key = 4;
        SearchTechnique2.Result r = search(arr, key);
        System.out.println("Is " + key + " found in an array: " + r.result);
        if(r.result == true){
            System.out.println(key + " is found at index: " + r.index);
        }
    }
    
}
