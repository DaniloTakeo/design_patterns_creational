package factory_method.example2;

public class PdfDocumento implements Documento {
    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando PDF com conteúdo: " + conteudo);
    }
}