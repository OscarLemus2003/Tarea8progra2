package base;

public class PizzaItaliana extends PIzza {
    private String salsa;

    public PizzaItaliana(String name, double price, String salsa, Topping... toppings) {
        super(name, price, toppings);
        this.salsa = salsa;

    }

    public String getSalsa() {
        return salsa;
    }
}
