import java.util.Scanner;

public class StdinArray{
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int[] IntArray = getIntegers(5);
        PrintArray(IntArray);
        System.out.println("Total is " + SumArray(IntArray));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static void PrintArray(int[] array){
        System.out.println("Repeat ");
        for(int i=0; i<array.length; i++){
            System.out.println("Element "+ i +", typed value was " + array[i]);
        }
    }

    public static int SumArray(int[] array){
        int Total = 0;
        for(int i=0; i<array.length; i++){
            Total += array[i];
        }
        return Total;
    }
}