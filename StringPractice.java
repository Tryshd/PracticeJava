public class StringPractice{
    public static void main(String[] args){
        String myString = "Trysd ";
        System.out.println("myNameIs " + myString);
        myString = myString + " ! ";
        myString = myString + " \u00A9 2022";
        System.out.println("myNameIs " + myString);

        String numberString = "10.55";
        numberString = numberString + "5.95";
        System.out.println(numberString);
        String lastString = "1";
        int myInt = 22;
        lastString = lastString + myInt;
        System.out.println(lastString);

        double doubleNumber = 33.33d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);
    }
}