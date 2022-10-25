class StringToNumber{
    public static void main(String[] args){
        String StringNum = "2022";
        int StringToInt = Integer.parseInt(StringNum);
        double StringToDouble = Double.parseDouble(StringNum);
        StringNum += 1;
        StringToInt += 1;
        StringToDouble += 1;
        System.out.println("StringNum" + StringNum);
        System.out.println("StringToInt" + StringToInt );
        System.out.println("StringToDouble" + StringToDouble );
    }
}