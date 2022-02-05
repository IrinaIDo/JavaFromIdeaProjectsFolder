package oop_challenge;

import org.jetbrains.annotations.NotNull;

import java.text.DecimalFormat;

public class Hamburger {

    DecimalFormat df = new DecimalFormat("###.##");

    private final String burgerName;
    private final String breadRollType;
    private final String meatForBurger;

    public String[] burgerAdditionName;  //lettuce, tomato, carrot; max 4
    public Double[] burgerAdditionPrice;
    private final double burgerBasicPrice;
    public int numberOfAdditionsAllowed = 4;

    public String getBurgerName() {
        return burgerName;
    }
    public double getBurgerBasicPrice() {
        return burgerBasicPrice;
    }

    public void setNumberOfAdditionsAllowed(int numberOfAdditionsAllowed) {
        this.numberOfAdditionsAllowed = numberOfAdditionsAllowed;
    }

    public String[] getBurgerAdditionName() {
        return burgerAdditionName;
    }

    public Double[] getBurgerAdditionPrice() {
        return burgerAdditionPrice;
    }

    public void setBurgerAdditionName(String @NotNull [] burgerAdditionName) {
        this.burgerAdditionName = burgerAdditionName;
    }

    public void setBurgerAdditionPrice(Double @NotNull [] burgerAdditionPrice) {
        this.burgerAdditionPrice = burgerAdditionPrice;
    }

    public Hamburger(String burgerName, String breadRollType, String meatForBurger, double burgerBasicPrice) {
        this.burgerName = burgerName;
        this.breadRollType = breadRollType;
        this.meatForBurger = meatForBurger;
        this.burgerBasicPrice = burgerBasicPrice;
        displayCustomerOptions();
    }

    public Hamburger() {
        this.burgerName = "Default burger";
        this.breadRollType = "Default bread roll type";
        this.meatForBurger = "Default meat for burger";
        this.burgerBasicPrice = 30d;
        displayCustomerOptions();
    }

    private boolean validateBurgerAdditions(){
        return (this.burgerAdditionName.length <= this.numberOfAdditionsAllowed);
    }

    private boolean validateBurgerAdditionName(String burgerAdditionNameToBeValidated){
        return (!burgerAdditionNameToBeValidated.isBlank());

    }

    private boolean validateBurgerAdditionPrice(Double burgerAdditionPriceToBeValidated){
        return (burgerAdditionPriceToBeValidated>0.0);
    }

    public boolean validateBurgerAdditionAndSendMessage(
            String burgerAdditionNameToBeValidated, Double burgerAdditionPriceToBeValidated){
        boolean requestedAdditionIsValid = (validateBurgerAdditionName(burgerAdditionNameToBeValidated)
                && validateBurgerAdditionPrice(burgerAdditionPriceToBeValidated));
        displayCustomerOptions(
                burgerAdditionNameToBeValidated, burgerAdditionPriceToBeValidated, requestedAdditionIsValid);

        return requestedAdditionIsValid;
    }

    public void displayCustomerOptions(){
        System.out.println("The hamburger <" + burgerName + "> with the bread roll type <" + breadRollType +
                ">, the meat <" + meatForBurger + "> has the basic price: " + burgerBasicPrice);
    }

    public void displayCustomerOptions(String additionName, double additionPriceValue){
        System.out.println("The option: " + additionName + " which costs: " + additionPriceValue + " RON has been" +
                " added to the hamburger <" + burgerName + "> with the bread roll type <" + breadRollType +
                ">, the meat <" + meatForBurger + "> and the basic price: " + burgerBasicPrice + ". The actual " +
                "price of the burger is: " + getBurgerPrice() + " RON.");
    }

    public void displayCustomerOptions(String additionName, double additionPriceValue, boolean validAddition){
        if (validAddition) {
            System.out.println("The option: " + additionName + " which costs: " + additionPriceValue + " RON has been" +
                    " validated and, therefore, added to the hamburger <" + this.burgerName + ">.");
        }else{
            System.out.println("The option: " + additionName + " which costs: " + additionPriceValue + " RON is NOT" +
                    " valid and, therefore, it CANNOT be added to the hamburger <" + this.burgerName + ">.");
        }
    }

    public void addOptionsToBurger(String[] burgerAdditionName, Double[] burgerAdditionPrice) throws IncorrectFileNameException {
        setBurgerAdditionName(burgerAdditionName);
        setBurgerAdditionPrice(burgerAdditionPrice);
        if (!validateBurgerAdditions()){
            String error_message = String.format(
                    "More than %d additional options are chosen. The order CANNOT be validated.",
                    this.numberOfAdditionsAllowed);
            throw new IncorrectFileNameException(error_message);
/*
            System.out.println("Only 4 additional 1options are accepted to be added. The options that have been " +
                    "chosen are: " + Arrays.toString(burgerAdditionName) +
                    ". Please see below if all of them have been successfully validated or not.");
*/
        }
    }

    public double getBurgerPrice(){
        int numberOfAdditionalOptions = this.burgerAdditionName.length;
        double burgerFinalPrice = this.burgerBasicPrice;
        for (int i=0; i < numberOfAdditionalOptions; i++){
            boolean additionIsValid =
                    validateBurgerAdditionAndSendMessage(this.burgerAdditionName[i], this.burgerAdditionPrice[i]);
            burgerFinalPrice += additionIsValid ? this.burgerAdditionPrice[i] : 0d;
            System.out.println("Subtotal: " + burgerFinalPrice + " for " + this.burgerAdditionPrice[i]);
        }
        System.out.println("The burger: " + this.burgerName + " costs: " +
                df.format(burgerFinalPrice) + " RON.");
//        System.out.println("No of allowed additional: " + this.numberOfAdditionsAllowed);
        return burgerFinalPrice;
    }
}