package factory_method.example1;

public class Main {
    public static void main(String[] args) {
        TransporteFactory factory;

        // Podemos trocar a factory aqui dinamicamente
        factory = new CarroFactory();
        Transporte transporte1 = factory.criarTransporte();
        transporte1.entregar();

        factory = new MotoFactory();
        Transporte transporte2 = factory.criarTransporte();
        transporte2.entregar();
    }
}