package builder.example2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Email email = new Email.Builder("cliente@empresa.com", "Orçamento do Projeto")
                .corpo("Segue em anexo o orçamento.")
                .cc(Arrays.asList("gerente@empresa.com", "financeiro@empresa.com"))
                .anexos(Arrays.asList("orcamento.pdf"))
                .formatoHtml(true)
                .build();

        email.enviar();
    }
}