package prototype.example1;

public class Main {
    public static void main(String[] args) {
        PropostaComercial propostaOriginal = new PropostaComercial(
                "Empresa XYZ", "Serviços de TI", 15000.00);

        PropostaComercial propostaCopia = (PropostaComercial) propostaOriginal.clonar();
        propostaCopia.setValor(16500.00); // novo valor ajustado

        System.out.println("Original:");
        propostaOriginal.imprimir();

        System.out.println("Cópia:");
        propostaCopia.imprimir();
    }
}