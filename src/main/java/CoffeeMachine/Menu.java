package CoffeeMachine;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static CoffeeMachine.CurrentStateOfMachine.*;

public class Menu {

    public void menuCoffeeMachine() {
        int select;
        int cups;
        try {
            while (true) {
                System.out.println("МЕНЮ (o˘◡˘o)\n" +
                        "(1) - Приготовить Эспрессо\n" +
                        "(2) - Приготовить Капучино\n" +
                        "(3) - Приготовить Лавандовый раф\n" +
                        "(4) - Подключить свой профиль\n" +
                        "(5) - Вывести количество ресурсов\n" +
                        "(6) - Заполнить ресурсы\n" +
                        "(7) - Очистить кофе-машину\n" +
                        "(8) - Выключить кофе-машину");

                select = scan.nextInt();
                switch (select) {
                    case 1:
                        Espresso espresso = new Espresso();
                        System.out.println("Введите число чашек, которое хотите приготовить (1-3):");
                        cups = scan.nextInt();
                        Utils.timer(2);
                        espresso.makeEspresso(cups);
                        System.out.println("Приготовлено чашек Эспрессо - " + cups);
                        resources.amountRes();
                        System.out.println("Посмотреть рецепт:");
                        String s = " ";
                        coffeeRecipe();
                        break;
                    case 2:
                        Cappuccino cappuccino = new Cappuccino();
                        System.out.println("Введите число чашек, которое хотите приготовить (1-3):");
                        cups = scan.nextInt();
                        Utils.timer(2);
                        cappuccino.makeCappuccino(cups);
                        System.out.println("Приготовлено чашек Капучино - " + cups + "\n");
                        resources.amountRes();
                        System.out.println("Посмотреть рецепт:");
                        String s1 = " ";
                        coffeeRecipe();
                        break;
                    case 3:
                        LavenderRaff lavenderRaff = new LavenderRaff();
                        System.out.println("Введите число чашек, которое хотите приготовить (1-3):");
                        cups = scan.nextInt();
                        Utils.timer(2);
                        lavenderRaff.makeRaff(cups);
                        System.out.println("Приготовлено чашек Лавандового рафа - " + cups + "\n");
                        resources.amountRes();
                        System.out.println("Посмотреть рецепт:");
                        String s2 = " ";
                        coffeeRecipe();
                        break;
                    case 4:
                        System.out.println("( ˘▽˘)っ♨\n" +
                        "Напишите свое имя:");
                        String gotName = scan.next();
                        System.out.println("Хотите Эспрессо?\n" +
                                "(+) Да\n" +
                                "(-) Нет");
                        String willEspresso = scan.next();

                        System.out.println("Хотите Капучино?\n" +
                                "(+) Да\n" +
                                "(-) Нет");

                        String willCappuccino = scan.next();
                        System.out.println("Хотите Лавандовый раф?\n" +
                                "(+) Да\n" +
                                "(-) Нет");
                        String willRaff = scan.next();

                        ProfilePerson profile = new ProfilePerson(gotName, willEspresso, willCappuccino, willRaff);
                        objList.add(profile);
                        ProfilePerson prof;
                            for (int i = 0; i < objList.size(); i++) {
                                prof = objList.get(i);
                                System.out.println(i + " " + prof.name);
                            }
                            int num = scan.nextInt();
                        ProfilePerson currentProfile = objList.get(num);
                        currentProfile.getProfileCoffee();
                        resources.amountRes();
                        break;
                    case 5:
                        resources.amountRes();
                        break;
                    case 6:
                        System.out.println("Добавить молока (мл):");
                        Integer milk = scan.nextInt();
                        System.out.println("｡ﾟ･..буль-буль..･ﾟ｡");
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (milk > 1000 - Resources.milk) {
                            System.out.println("Молока достаточно! Больше не нужно");
                        } else if (milk <= 1000 - Resources.milk) {
                            resources.addMilk(milk);
                        }
                        System.out.println("Сейчас " + resources.milk + "мл молока");

                        System.out.println("\n" + "Добавить воды (мл):");
                        Integer water = scan.nextInt();
                        System.out.println("｡ﾟ･..буль-буль..･ﾟ｡");
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (water > 1000 - Resources.water) {
                            System.out.println("Воды достаточно! Больше не нужно");
                        } else if (water <= 1000 - Resources.water) {
                            resources.addWater(water);
                        }
                        System.out.println("Сейчас " + resources.water + "мл воды");

                        System.out.println("\n" + "Засыпать кофейные зёрна (мг):");
                        Integer coffee = scan.nextInt();
                        System.out.println("｡ﾟ･..засыпаем зёрна..･ﾟ｡");
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (coffee > 1000 - Resources.coffeeBeans) {
                            System.out.println("Кофейных зёрен достаточно! Больше не нужно");
                        } else if (coffee <= 1000 - Resources.coffeeBeans) {
                            resources.addCoffeeBeans(coffee);
                        }
                        System.out.println("Сейчас " + resources.coffeeBeans + "мг кофе");

                        System.out.println("\n" + "Добавить сироп (мл):");
                        Integer syrup = scan.nextInt();
                        System.out.println("｡ﾟ･..бульк..･ﾟ｡");
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (syrup > 700 - Resources.syrup) {
                            System.out.println("Сиропа достаточно! Больше не нужно");
                        } else if (syrup <= 700 - Resources.syrup) {
                            resources.addSyrup(syrup);
                        }
                        System.out.println("Сейчас " + resources.syrup + "мл сиропа\n");
                        break;
                    case 7:
                        System.out.println("...Проверка кофе-машины...");
                        if (CleanMachine.statusClean < 40) {
                            System.out.println("\n" + "...Очистка кофе-машины...");
                            try {
                                TimeUnit.SECONDS.sleep(2);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            CleanMachine.cleaner();
                            System.out.println("Кофе-машина очищена ﾟ✧\n");
                        } else {
                            System.out.println("\n" + "Очистка не требуется! ☆\n");
                        }
                        break;
                    case 8:
                        System.out.println("Кофе-машина выключена (－.－)...Zzz\n");
                        return;
                    default:
                        break;
                }
            }
        } catch (Throwable error) {
            System.out.println("ERROR!(×﹏×)\n" +
            "Не надо ломать кофе-машинку\n" +
            error + "\n");
            menuCoffeeMachine();
        }
    }

    public void coffeeRecipe() {
        System.out.println(
                "(1) - Лавандовый раф\n" +
                "(2) - Капучино\n" +
                "(3) - Эспрессо\n" +
                "(4) - назад в Меню");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        if (name.equals("1")) {
            System.out.println(RecipeCoffee.RAFF.recipe);
        } else if (name.equals("2")) {
            System.out.println(RecipeCoffee.CAPPUCCINO.recipe);
        } else if (name.equals("3")) {
            System.out.println(RecipeCoffee.ESPRESSO.recipe);
        } else if (name.equals("4")) {
            menuCoffeeMachine();
        }
    }
}
