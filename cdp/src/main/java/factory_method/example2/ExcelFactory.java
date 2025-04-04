package factory_method.example2;

public class ExcelFactory extends DocumentoFactory {
    @Override
    public Documento criarDocumento() {
        return new ExcelDocumento();
    }
}