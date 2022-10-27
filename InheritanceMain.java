class InheritanceMain{
    public static void main(String[] args){
        InheritanceSub animal = new InheritanceSub("Animal", 1, 1);

        InheritanceSubDog dog = new InheritanceSubDog("Chihuahua", 2, 2,2, "White");
        dog.eat();

    }
}