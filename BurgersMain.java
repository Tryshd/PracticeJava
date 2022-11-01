class BurgersMain{
    public static void main(String[] args){
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 4.00, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Chesse", 1.12);
        System.out.println("Total price is " + hamburger.itemizeHamburger());

        System.out.println("");

        HealthyBurger healthyburger = new HealthyBurger("Bacon", 6.00);
        //healthyburger.itemizeHamburger();
        healthyburger.addHamburgerAddition1("Egg", 3);
        //healthyburger.itemizeHamburger();
        healthyburger.addHealthyAddition1("Lentils", 2);
        System.out.println("Total price is " + healthyburger.itemizeHamburger());

        System.out.println("");

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.0);
        System.out.println(db.itemizeHamburger());
    }
}