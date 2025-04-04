package factory_method.example2;

public class Main {
    public static void main(String[] args) {
        DocumentoFactory factory;

        factory = new PdfFactory();
        Documento docPdf = factory.criarDocumento();
        docPdf.gerar("Relatório financeiro do mês");

        factory = new WordFactory();
        Documento docWord = factory.criarDocumento();
        docWord.gerar("Ata de reunião");

        factory = new ExcelFactory();
        Documento docExcel = factory.criarDocumento();
        docExcel.gerar("Planilha de gastos");
    }
}