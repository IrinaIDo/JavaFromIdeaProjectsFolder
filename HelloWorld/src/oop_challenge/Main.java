package oop_challenge;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IncorrectFileNameException {

        /*
        Standard data to be used in order to test our implementation.
        Different scenarios are taken into account.
         */
        // Hamburger with valid additions and prices
//        ArrayList<String> validBasicBurgerAdditions = new ArrayList<String>(List.of(new String[]{"lettuce", "tomatoes", "carrots", "special sous"}));
        String[] validBasicBurgerAdditions = {"lettuce", "tomatoes", "carrots", "special sous"};
        Double[] validBasicBurgerAdditionsPrice = {1.5, 2.5, 2.0, 2.1};
        // Hamburger with valid additions and invalid prices
        Double[] basicBurgerAdditionsInvalidPrice = {1.5, 2.5, 0.0, -1.0};
        // Hamburger with invalid additions and valid prices
        String[] invalidBasicBurgerAdditions = {"lettuce", "tomatoes", "carrots", ""};

        /*
        Call all classes, one by one.
         */
        int orderType = burgerTypeToOrder();

        switch(orderType){
            case -1:
                System.out.println("No valid option has been chosen.");
                break;
            case 1:
                orderBurgerFromHamburgerClass(
                        validBasicBurgerAdditions, validBasicBurgerAdditionsPrice,
                        basicBurgerAdditionsInvalidPrice, invalidBasicBurgerAdditions);
                break;
            case 2:
                orderBurgerFromHealthyBurgerClass(
                        validBasicBurgerAdditions, validBasicBurgerAdditionsPrice,
                        basicBurgerAdditionsInvalidPrice, invalidBasicBurgerAdditions);
                break;
            case 3:
                orderBurgerFromDeluxeBurgerClass(
                        validBasicBurgerAdditions, validBasicBurgerAdditionsPrice,
                        basicBurgerAdditionsInvalidPrice, invalidBasicBurgerAdditions);
                break;

        }

    }

    private static int burgerTypeToOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which type of burger would you like to have? [1-basic; 2-healthy; 3-deluxe]");
        boolean userResponseIsReceived = scanner.hasNextInt();
        int userResponse = -1;

        if (userResponseIsReceived) {
            userResponse = scanner.nextInt();
            scanner.nextLine();
            scanner.close();
            if (userResponse < 1 || userResponse > 3){
                userResponse = -1;
            }
        }
        return userResponse;
    }

    public static void orderBurgerFromHamburgerClass(
            String @NotNull [] validBasicBurgerAdditions, Double @NotNull [] validBasicBurgerAdditionsPrice,
            Double @NotNull [] basicBurgerAdditionsInvalidPrice, String @NotNull [] invalidBasicBurgerAdditions) throws IncorrectFileNameException {
        Hamburger basicBurger = new Hamburger();
        orderBasicBurger(basicBurger, validBasicBurgerAdditions, validBasicBurgerAdditionsPrice);
        orderBasicBurger(basicBurger, validBasicBurgerAdditions, basicBurgerAdditionsInvalidPrice);
        orderBasicBurger(basicBurger, invalidBasicBurgerAdditions, validBasicBurgerAdditionsPrice);
        orderBasicBurger(basicBurger, invalidBasicBurgerAdditions, basicBurgerAdditionsInvalidPrice);
    }

    private static void orderBasicBurger(
            @NotNull Hamburger hamburger, String[] burgerAdditions, Double[] burgerAdditionsPrices) throws IncorrectFileNameException {
/*
        Force the exception to be thrown.
        String[] resultingNameArray = addTwoMoreAdditions(burgerAdditions);
        Double[] resultingPriceArray = addTwoMoreAdditionsPrices(burgerAdditionsPrices);
        hamburger.addOptionsToBurger(resultingNameArray, resultingPriceArray);
*/
        hamburger.addOptionsToBurger(burgerAdditions, burgerAdditionsPrices);
        hamburger.getBurgerPrice();
    }

    public static void orderBurgerFromHealthyBurgerClass(
            String @NotNull [] validBasicBurgerAdditions, Double @NotNull [] validBasicBurgerAdditionsPrice,
            Double @NotNull [] basicBurgerAdditionsInvalidPrice, String @NotNull [] invalidBasicBurgerAdditions) throws IncorrectFileNameException {
        HealthyBurger healthyBurger = new HealthyBurger();
        orderHealthyBurger(healthyBurger, validBasicBurgerAdditions, validBasicBurgerAdditionsPrice);
        orderHealthyBurger(healthyBurger, validBasicBurgerAdditions, basicBurgerAdditionsInvalidPrice);
        orderHealthyBurger(healthyBurger, invalidBasicBurgerAdditions, validBasicBurgerAdditionsPrice);
        orderHealthyBurger(healthyBurger, invalidBasicBurgerAdditions, basicBurgerAdditionsInvalidPrice);
    }

    private static void orderHealthyBurger(
            HealthyBurger healthyBurger, String[] burgerAdditions, Double[] burgerAdditionsPrices) throws IncorrectFileNameException {
        String[] resultingNameArray = addTwoMoreAdditions(burgerAdditions);
        Double[] resultingPriceArray = addTwoMoreAdditionsPrices(burgerAdditionsPrices);
        healthyBurger.addOptionsToBurger(resultingNameArray, resultingPriceArray);
        healthyBurger.getBurgerPrice();
    }

    public static String[] addTwoMoreAdditions(String[] burgerAdditions){
        int finalLength = burgerAdditions.length+2;
        String[] resultingStringArray = new String[finalLength];
        String[] additionalArray = new String[]{"chilli", "quinoa"};
        for (int i=0; i<finalLength; i++){
            if (i<burgerAdditions.length){
                resultingStringArray[i] = burgerAdditions[i];
            }else{
                resultingStringArray[i] = additionalArray[i-burgerAdditions.length];
            }
        }
        return resultingStringArray;
    }

    private static Double[] addTwoMoreAdditionsPrices(Double [] burgerAdditionsPrices){
        int finalLength = burgerAdditionsPrices.length+2;
        Double[] resultingPriceString = new Double[finalLength];
        Double[] additionalArray = new Double[]{1.7, 2.1};
        for (int i=0; i<finalLength; i++){
            if (i<burgerAdditionsPrices.length){
                resultingPriceString[i] = burgerAdditionsPrices[i];
            }else{
                resultingPriceString[i] = additionalArray[i-burgerAdditionsPrices.length];
            }
        }
        return resultingPriceString;
    }

    public static void orderBurgerFromDeluxeBurgerClass(
            String @NotNull [] validBasicBurgerAdditions, Double @NotNull [] validBasicBurgerAdditionsPrice,
            Double @NotNull [] basicBurgerAdditionsInvalidPrice, String @NotNull [] invalidBasicBurgerAdditions) throws IncorrectFileNameException {
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.deluxeBurgerOptionsPrice = new Double[]{1.7, 2.1};
        orderDeluxeBurger(deluxeBurger, validBasicBurgerAdditions, validBasicBurgerAdditionsPrice);
        orderDeluxeBurger(deluxeBurger, validBasicBurgerAdditions, basicBurgerAdditionsInvalidPrice);
        orderDeluxeBurger(deluxeBurger, invalidBasicBurgerAdditions, validBasicBurgerAdditionsPrice);
        orderDeluxeBurger(deluxeBurger, invalidBasicBurgerAdditions, basicBurgerAdditionsInvalidPrice);
    }

    private static void orderDeluxeBurger(
            DeluxeBurger deluxeBurger, String[] burgerAdditions, Double[] burgerAdditionsPrices) throws IncorrectFileNameException {
        deluxeBurger.addOptionsToBurger(burgerAdditions, burgerAdditionsPrices);
        Boolean[] userOptions = {true, true};
        deluxeBurger.prepareDeluxeBurger(userOptions);
        deluxeBurger.getBurgerPrice();
    }

}
