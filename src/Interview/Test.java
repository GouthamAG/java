import java.util.ArrayList;

public class Test {

    public static ArrayList<StringBuilder> demoRecursive(String[] testList, int N, int startIndex, ArrayList<StringBuilder> finalList){
        if(startIndex>=testList.length || N<=0 ){
            return finalList;
        }

        int endIndex = Math.min(startIndex+N, testList.length);
        StringBuilder tempSB = new StringBuilder();
        for(int i=startIndex; i<endIndex; i++){
            tempSB.append(testList[i]);
        }
        finalList.add(tempSB);

        return demoRecursive(testList, N, startIndex+N, finalList);
    }

    public static void main(String[] args) {

        String [] testList = {"How", "to", "use", "recursive", "method", "in", "Java"};
        int N = 3;
        int startIndex = 0;
        ArrayList<StringBuilder> finalList = new ArrayList<>();
        finalList = demoRecursive(testList, N, startIndex, finalList);
        
        for(StringBuilder indString: finalList){
            System.out.println(indString);
        }
    }
}