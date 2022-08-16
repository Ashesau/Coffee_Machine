package CoffeeMachine;

public class ProfilePerson {
    public String name;
    public String isLavenderRaff;
    public String isEspresso;
    public String isCappuccino;
    public int totalCups;
    public int cupsCappuccino;
    public int cupsLavenderRaff;
    public int cupsEspresso;


    ProfilePerson(String gotName, String willEspresso, String willCappuccino, String willRaff) {
        this.name = gotName;
        this.isEspresso = willEspresso;
        this.isCappuccino = willCappuccino;
        this.isLavenderRaff = willRaff;
        this.totalCups = 0;

    }

    public void getProfileCoffee() {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        System.out.println("Профиль " + name);
        if (isLavenderRaff.equals("+")) {
            coffeeFactory.lavenderRaff.makeRaff(1);
            this.totalCups += 1;
        }
        if (isCappuccino.equals("+")) {
            coffeeFactory.cappuccino.makeCappuccino(1);
            this.totalCups += 1;
        }
        if (isEspresso.equals("+")) {
            coffeeFactory.espresso.makeEspresso(1);
            this.totalCups += 1;
        }
    }
}