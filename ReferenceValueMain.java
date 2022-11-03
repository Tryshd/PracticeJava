import java.rmi.StubNotFoundException;
import java.util.Arrays;

public class ReferenceValueMain{
    public static void main(String[] args){
        int myIntValue = 10;
        int anotherValue = myIntValue;
        anotherValue++;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherValue = " + anotherValue);
        
        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;
        anotherIntArray[0] = 1;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));
    }
}