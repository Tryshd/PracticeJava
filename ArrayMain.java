import java.net.SocketTimeoutException;
import java.util.Scanner;

public class ArrayMain{
    public static void main(String[] args){
        int [] IntArray = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(IntArray);
        System.out.println(IntArray[0]);
        System.out.println(IntArray[5]);
        System.out.println(IntArray[9]);
        System.out.println("");
        int [] IntArray1 = new int[10];
        for(int i = 0; i < 10; i++){
            IntArray1[i] = i * 2;
        }
        PrintArray(IntArray1);
        System.out.println("");
        double [] DoubleArray = new double[10];
        System.out.println(DoubleArray[5]);
        PrintArray(DoubleArray);
        System.out.println("");

    }

    public static void PrintArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void PrintArray(double[] array){
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}