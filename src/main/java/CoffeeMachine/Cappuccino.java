package CoffeeMachine;
public class Cappuccino {
    static Integer resCoffee = 100;
    static Integer resMilk = 250;
    static Integer resWater = 200;

    public void makeCappuccino(Integer cupsAmount) {
        if (cupsAmount > 3) {
            System.out.println("Нельзя приготовить столько чашек ╮( ˘ ､ ˘ )╭\n");
            return;
        }
        if (cupsAmount == 0) {
            System.out.println("Как можно приготовить ничего?? (・・ ) ?\n");
            return;
        }
        if (
                Resources.coffeeBeans < 100 * cupsAmount ||
                Resources.milk < 250 * cupsAmount ||
                Resources.water < 200 * cupsAmount ||
                CleanMachine.statusClean < 20 * cupsAmount
        ) {
            System.out.println("Не хватает ресурсов для приготовления или требуется очистка машины! ╮( ˘ ､ ˘ )╭\n");
            return;
        }
        if (Resources.coffeeBeans >= cupsAmount * resCoffee && Resources.milk >= cupsAmount * resMilk
            && Resources.water >= cupsAmount * resWater && CleanMachine.statusClean >= 0) {
            Resources.coffeeBeans -= resCoffee * cupsAmount;
            Resources.milk -= resMilk * cupsAmount;
            Resources.water -= resWater * cupsAmount;
            CleanMachine.statusClean -= 10 * cupsAmount;
            return;
        }
    }
}