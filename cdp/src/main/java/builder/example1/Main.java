package builder.example1;

public class Main {
    public static void main(String[] args) {
        Sanduiche sanduiche1 = new Sanduiche.SanduicheBuilder("Pão francês", "Frango")
                .comQueijo()
                .comSalada()
                .build();

        Sanduiche sanduiche2 = new Sanduiche.SanduicheBuilder("Pão integral", "Carne bovina")
                .comBacon()
                .build();

        sanduiche1.mostrarPedido();
        sanduiche2.mostrarPedido();
    }
}