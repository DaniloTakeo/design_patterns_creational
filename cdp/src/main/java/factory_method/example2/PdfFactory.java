package factory_method.example2;

public class PdfFactory extends DocumentoFactory {
    @Override
    public Documento criarDocumento() {
        return new PdfDocumento();
    }
}