package CoffeeMachine;

import static CoffeeMachine.CleanMachine.statusClean;

public class Resources {
    static Integer coffeeBeans = 1000;
    static Integer milk = 1000;
    static Integer water = 1000;
    static Integer syrup = 700;

    public void addCoffeeBeans(Integer add) {
        coffeeBeans = coffeeBeans + add;
    }
    public void addMilk(Integer add) {
        milk = milk + add;
    }
    public void addWater(Integer add) {
        water = water + add;
    }
    public void addSyrup(Integer add) {
        syrup = syrup + add;
    }

    public void amountRes() {
        System.out.println("Количество кофе - " + coffeeBeans + "мл");
        System.out.println("Количество молока - " + milk + "мл");
        System.out.println("Количество воды - " + water + "мл");
        System.out.println("Количество сиропа - " + syrup + "мл");
        System.out.println("Чистота кофе-машины - " + statusClean + "%");
    }
}
