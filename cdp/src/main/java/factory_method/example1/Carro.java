package factory_method.example1;

public class Carro implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega realizada de carro.");
    }
}