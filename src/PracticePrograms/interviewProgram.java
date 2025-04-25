package PracticePrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class interviewProgram {

    public void reArrangeNums(int[] intArray, int num){
        int intArrayLen = intArray.length;
        int counter=0;
        int tempCounter=0;
        int tempListNum=0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<intArrayLen;i++){
            list.add(intArray[i]);
        }

        for(int j=0;j<intArrayLen;j++){
            counter+=1;
            if(intArray[j] == num){
                tempCounter = counter;
                for(int k=0;k<intArrayLen-counter;k++){
                    intArray[k] = list.get(tempCounter);
                    tempCounter+=1;
                }
                for(int l=intArrayLen-counter;l<intArrayLen;l++){
                    intArray[l] = list.get(tempListNum);
                    tempListNum+=1;
                }
                break;
            }
        }
        System.out.println(Arrays.toString(intArray));

    }

    public static void main(String[] args){
        interviewProgram obj = new interviewProgram();
        int[] intArray = {2,56,24,78,3,5,67,34,1,56,80,34,52,46};
        obj.reArrangeNums(intArray, 5);
    }
}
