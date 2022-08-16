package CoffeeMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CurrentStateOfMachine {

    static Scanner scan = new Scanner(System.in);
    static List<ProfilePerson> objList = new ArrayList<>();
    static Resources resources = new Resources();
    static Menu menu = new Menu();

    public static void main(String[] args) {
        System.out.println("Привет! (≧▽≦)/\n" +
        "Чтобы включить кофе-машину, нажмите 0:");
        Integer menuButton = scan.nextInt();
        switch (menuButton) {
            case 0:
                menu.menuCoffeeMachine();
            default:
                System.out.println("Bye-bye! ( ◡﹏◡)ノﾞ\n");
                break;
        }
    }
}