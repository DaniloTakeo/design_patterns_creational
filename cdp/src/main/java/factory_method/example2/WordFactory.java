package factory_method.example2;

public class WordFactory extends DocumentoFactory {
    @Override
    public Documento criarDocumento() {
        return new WordDocumento();
    }
}