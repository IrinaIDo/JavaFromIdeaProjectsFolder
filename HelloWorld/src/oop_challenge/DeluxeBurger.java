package oop_challenge;

import java.util.Scanner;

public class DeluxeBurger extends Hamburger{
    private final String[] deluxeBurgerOptions = {"chips", "drinks"};
    public Double[] deluxeBurgerOptionsPrice = {0.0, 0.0};

    public void setDeluxeBurgerOptionsPrice(Double[] deluxeBurgerOptionsPrice) {
        this.deluxeBurgerOptionsPrice = deluxeBurgerOptionsPrice;
    }
    private boolean[] deluxeOptionIsChosen = {false, false};
    public DeluxeBurger(String breadRollType, String meatForBurger, double burgerBasicPrice) {
        super("DeluxeBurger", breadRollType, meatForBurger, burgerBasicPrice);
        numberOfAdditionsAllowed = 4;
    }

    private boolean validateDeluxeOptionsPrice(){
        boolean deluxeOptionsPricesAreValid = false;
        for (Double aDouble : this.deluxeBurgerOptionsPrice) {
            if (!aDouble.isNaN() || aDouble>0) {
                deluxeOptionsPricesAreValid = true;
                break;
            }
        }
        return deluxeOptionsPricesAreValid;
    }

    public DeluxeBurger() {
        super("DeluxeBurger", "Deluxe bread roll", "Deluxe beef",
                40d);
        numberOfAdditionsAllowed = 4;
    }

    public boolean getCustomerResponse(String optionToChoose){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like also " + optionToChoose + " with your deluxe burger? [y/n]");
        boolean userResponseIsReceived = scanner.hasNextLine();
        boolean userWantsOption = false;

        if (userResponseIsReceived){
            String userResponse = scanner.nextLine();
            scanner.nextLine();

            if (userResponse.equalsIgnoreCase("y")){
                userWantsOption = true;
            }

            scanner.close();
        }
        return userWantsOption;
    }

    public void prepareDeluxeBurger(){
        if (validateDeluxeOptionsPrice()) {
            for (int i = 0; i < deluxeBurgerOptions.length; i++) {
                if (getCustomerResponse(deluxeBurgerOptions[i])) {
                    displayCustomerOptions(deluxeBurgerOptions[i], deluxeBurgerOptionsPrice[i]);
                    this.deluxeOptionIsChosen[i] = true;
                }
            }
        }else{
            System.out.println("Please check the prices for the options; they should be greater than zero.");
        }
    }

    public void prepareDeluxeBurger(Boolean[] chosenOptions){
        if (validateDeluxeOptionsPrice()) {
            for (int i = 0; i < deluxeBurgerOptions.length; i++) {
                this.deluxeOptionIsChosen[i] = chosenOptions[i];
            }
        }else{
            System.out.println("Please check the prices for the options; they should be greater than zero.");
        }
    }

    @Override
    public double getBurgerPrice() {
        double burgerFinalPrice = this.getBurgerBasicPrice();

        for (int i = 0; i < this.getBurgerAdditionName().length; i++) {

            boolean additionIsValid =
                    validateBurgerAdditionAndSendMessage(
                            this.getBurgerAdditionName()[i], this.getBurgerAdditionPrice()[i]);
            burgerFinalPrice += additionIsValid ? this.getBurgerAdditionPrice()[i] : 0.0;
        }
        System.out.println("Burger price without deluxe option: " + burgerFinalPrice + " RON");
        burgerFinalPrice += increasePriceForDeluxeOption();

        System.out.println("The burger: " + this.getBurgerName() + " costs: " + burgerFinalPrice + " RON.");
        return burgerFinalPrice;
    }

    public double increasePriceForDeluxeOption() {
        double deluxeOptionCost = 0d;
        for (int i = 0; i < this.deluxeOptionIsChosen.length; i++) {
            if (this.deluxeOptionIsChosen[i]) {
                deluxeOptionCost += this.deluxeBurgerOptionsPrice[i];
            }
        }
        System.out.println("The deluxe option costs " + (deluxeOptionCost) + " RON.");
        return deluxeOptionCost;
    }
}

