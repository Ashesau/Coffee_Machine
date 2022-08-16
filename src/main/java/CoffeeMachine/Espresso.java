package CoffeeMachine;
public class Espresso {
    private Integer resCoffee = 100;
    private Integer resWater = 150;

    public void makeEspresso(Integer cupsAmount) {
        if (cupsAmount > 3) {
            System.out.println("Нельзя приготовить столько чашек ╮( ˘ ､ ˘ )╭\n");
            return;
        }
        if (cupsAmount == 0) {
            System.out.println("Как можно приготовить ничего?? (・・ ) ?\n");
            return;
        }
        if (
                Resources.coffeeBeans < 100 ||
                Resources.water < 150 ||
                CleanMachine.statusClean < 20 * cupsAmount
        ) {
            System.out.println("Не хватает ресурсов для приготовления или требуется очистка машины! ╮( ˘ ､ ˘ )╭\n");
            return;
        }
        if (Resources.coffeeBeans >= cupsAmount * resCoffee && Resources.water >= cupsAmount * resWater &&
            CleanMachine.statusClean >= 0) {
            Resources.water -= resWater * cupsAmount;
            Resources.coffeeBeans -= resCoffee * cupsAmount;
            CleanMachine.statusClean -= 10 * cupsAmount;
            return;
        }
    }
}