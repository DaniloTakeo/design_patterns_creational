package factory_method.example2;

public class ExcelDocumento implements Documento {
    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando Excel com conteúdo: " + conteudo);
    }
}