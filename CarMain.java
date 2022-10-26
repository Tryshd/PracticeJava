class CarMain{
    public static void main(String[] args){
        Car lexus = new Car();
        Car toyota = new Car();
        //if model is public: valid
        //lexus.model = "CT";
        //System.out.println(lexus.model);
        lexus.setModel("CT");
        toyota.setModel("PRIUS");
        System.out.println("getModel() is " + lexus.getModel());
        System.out.println("getModel() is " + toyota.getModel());
    }
}