import java.util.Scanner;

public class MinimumElementReturnMain{
    public static void main(String[] args){
        int InputNum = readInputNumber();
        int[] myIntArray = readIntegers(InputNum);
        int myMinElement = findMin(myIntArray);
        System.out.println("MIN NUMBER IS " + myMinElement);
    }

    public  static int readInputNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number Of inputs ");
        return scan.nextInt();
    }

    public static int[] readIntegers(int readableNum){
        Scanner scan = new Scanner(System.in);
        int[] myIntArray = new int[readableNum];
        System.out.println("Enter " + readableNum +"Integers");
        for(int i=0; i<myIntArray.length;i++){
            myIntArray[i] = scan.nextInt();
        }
        return myIntArray;
    }

    public static int findMin(int[] myArray){
        int minElement = Integer.MAX_VALUE;
        for(int i = 0; i < myArray.length; i++){
            if(minElement > myArray[i]){
                minElement = myArray[i];
            }
        }
        return minElement;
    }


}

