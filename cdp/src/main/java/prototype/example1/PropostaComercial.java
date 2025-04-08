package prototype.example1;

public class PropostaComercial implements PrototipoDocumento {
    private String cliente;
    private String conteudo;
    private double valor;

    public PropostaComercial(String cliente, String conteudo, double valor) {
        this.cliente = cliente;
        this.conteudo = conteudo;
        this.valor = valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Valor: R$ " + valor);
        System.out.println("-------------");
    }

    @Override
    public PrototipoDocumento clonar() {
        return new PropostaComercial(cliente, conteudo, valor);
    }
}