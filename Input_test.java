import java.util.Scanner;
class Input_test{
    public static void main(String[] args){
        int count = 0;
        Scanner scan = new Scanner(System.in);       
        while(count < 5){
            System.out.println("Enter number #" + count);

            boolean CheckInt = scan.hasNextInt();

            if(CheckInt ){
                int Input_Number = scan.nextInt();
                scan.nextLine();
                if (Input_Number == count){
                    System.out.println("Great!");
                }
            }else{
                System.out.println("Invalid Number");
                break;
            }
            count += 1;
        }
        scan.close();
    }
}