package oop_challenge;

public class HealthyBurger extends Hamburger{
    public HealthyBurger(String meatForBurger, double burgerBasicPrice) {
        super("HealthyBurger", "brown rye", meatForBurger, burgerBasicPrice);
        numberOfAdditionsAllowed = 6;
    }

    public HealthyBurger() {
        super("HealthyBurger", "brown rye", "beef", 30d);
        numberOfAdditionsAllowed = 6;
    }
}
