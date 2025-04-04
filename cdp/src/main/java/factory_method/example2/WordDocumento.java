package factory_method.example2;

public class WordDocumento implements Documento {
    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando Word com conteúdo: " + conteudo);
    }
}
