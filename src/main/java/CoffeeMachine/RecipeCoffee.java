package CoffeeMachine;
public enum RecipeCoffee {
    ESPRESSO("Эспрессо - Молотый кофе 2-3 чайные ложки, 150 мл воды, 2-3 чайные ложки сахара," +
            "1/5 часть чайной ложки соли\n"),
    CAPPUCCINO("Капучино - Молотый кофе 3 чайные ложки, 200-250 мл холодного молока," +
            "тертый шоколад (или порошок какао) или корица, сироп - по вкусу\n"),
    RAFF("Лавандовый раф - Молотый кофе 1-2 чайные ложки, 100 мл сливок 10%, 0,5 чайной ложки сухих цветков лаванды," +
            "30 мл воды, 1 чайная ложка лавандового сиропа\n");

    public String recipe;

    RecipeCoffee(String recipe) {
        this.recipe = recipe;
    }
}