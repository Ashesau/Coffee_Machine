package CoffeeMachine;

public class LavenderRaff {
    static Integer resCoffee = 100;
    static Integer resMilk = 250;
    static Integer resWater = 200;
    static Integer resSyrup = 100;

    public void makeRaff(Integer cupsAmount) {
        if (cupsAmount > 3) {
            System.out.println("Нельзя приготовить столько чашек ╮( ˘ ､ ˘ )╭\n");
            return;
        } if (cupsAmount == 0) {
            System.out.println("Как можно приготовить ничего?? (・・ ) ?\n");
            return;
        }
        if (
                Resources.coffeeBeans < 100 ||
                Resources.milk < 250 ||
                Resources.water < 200 ||
                Resources.syrup < 100
        ) {
            System.out.println("Не хватает ресурсов для приготовления или требуется очистка машины! ╮( ˘ ､ ˘ )╭\n");
            return;
        }
        if (Resources.coffeeBeans >= cupsAmount * resCoffee && Resources.milk >= cupsAmount * resMilk &&
            Resources.water >= cupsAmount * resWater && Resources.syrup >= cupsAmount * resSyrup &&
            CleanMachine.statusClean >= 0) {
            Resources.coffeeBeans -= resCoffee * cupsAmount;
            Resources.milk -= resMilk * cupsAmount;
            Resources.water -= resWater * cupsAmount;
            Resources.syrup -= resSyrup * cupsAmount;
            CleanMachine.statusClean -= 15 * cupsAmount;
            return;
        }
    }
}