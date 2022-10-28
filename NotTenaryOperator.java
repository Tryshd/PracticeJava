class NotTernaryOperator{
    public static void main(String[] args){
        boolean isHouse = false;
        if(isHouse == false){
            System.out.println("Here is School");
        }
        if(!isHouse){
            System.out.println("Here is School too.");
        }

        isHouse = false;
        isHouse = true;
        boolean wasHouse = isHouse ? true: false;

        if(wasHouse){
            System.out.println("This was House!");
        }

        int AgeofClient = 20;

        boolean IsEighteenOrOver = (AgeofClient >= 18) ? true : false; 
    }
}