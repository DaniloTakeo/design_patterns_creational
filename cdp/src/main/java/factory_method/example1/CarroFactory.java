package factory_method.example1;

public class CarroFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new Carro();
    }
}