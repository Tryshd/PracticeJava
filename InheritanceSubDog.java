public class InheritanceSubDog extends InheritanceSub {
    
    private int eyes;
    private String coat;

    public InheritanceSubDog(String name,  int size, int weight, int eyes, String coat){
        super(name, 100, weight);
        this.eyes = eyes;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog chew");
    }

    @Override
    public void eat(){
        System.out.println("Dog");
        chew();
        super.eat();
    }
}
