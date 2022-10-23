class KiloToMile{
    public static void main(String[] args){
        double kilo = 20;
        result(kilo);
    }
    public static long toMiles(double kilometers){
        if (kilometers < 0 ){
            return -1;
        }else if (kilometers >= 0){
            long miles = Math.round(kilometers * 0.62137119223733);
            return miles;
        }
        return -1;
    }
    public static void result(double kilometers){
        long miles = toMiles(kilometers);
        if (miles == -1){
            System.out.println("Invalid Value");
        }else{
        System.out.println( kilometers +" km = "+ miles +" mi");
        }
    }
}