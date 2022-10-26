import java.util.Scanner;


class InputPractice{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Input: I'm fine.");
        System.out.println("How are you ?");
         
        String a = scan.next();
        String b = scan.next();
        System.out.println("YourResponseIS " + a + b);
        System.out.println("YourFirstResponseIS " + a);

        scan.nextLine();

        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter your year of birth");
        boolean hasNextInt = scan.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scan.nextInt();
            scan.nextLine();
            int age = 2022 - yearOfBirth;
            if(age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", and you are " + age + "years old");
            }else{
                System.out.println("Invalid year of birth");
            }
        }else{
            System.out.println("Invalid type");
        }

        scan.close();

    }
}