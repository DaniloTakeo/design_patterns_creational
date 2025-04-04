package factory_method.example1;

public class MotoFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new Moto();
    }
}