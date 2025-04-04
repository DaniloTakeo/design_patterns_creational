package factory_method.example1;

public class Moto implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega realizada de moto.");
    }
}