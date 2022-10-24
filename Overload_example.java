class Overload_example{
    public static void main (String[] args){
        double inches = 24d;
        System.out.println(calcFeetAndInchesToCentimeters(inches));
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){
        System.out.println(feet +"a"+ inches);
        if (feet >= 0 && (inches >= 0 && inches <= 12)){
            double centimeters = inches * 2.54 + feet * 12 * 2.54;
            return centimeters;
        }else{
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet = Math.floor(inches / 12);
            inches -= feet * 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        }else{
            return -1;
        }
    }
}