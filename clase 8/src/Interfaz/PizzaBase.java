package Interfaz;


public class PizzaBase implements ipreparable {
    private String nombre;
    private double precio;

    public PizzaBase(String nombre, double precio){
        this.nombre= nombre ;
        this.precio= precio;

    }
    @Override
    public void prepare(){
        System.out.println("La pizza se esta preparando");
    }
}
