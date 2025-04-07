package builder.example2;

import java.util.List;

public class Email {
    private final String para;
    private final String assunto;
    private final String corpo;
    private final List<String> cc;
    private final List<String> anexos;
    private final boolean formatoHtml;

    private Email(Builder builder) {
        this.para = builder.para;
        this.assunto = builder.assunto;
        this.corpo = builder.corpo;
        this.cc = builder.cc;
        this.anexos = builder.anexos;
        this.formatoHtml = builder.formatoHtml;
    }

    public void enviar() {
        System.out.println("Enviando e-mail para: " + para);
        System.out.println("Assunto: " + assunto);
        System.out.println("Corpo: " + corpo);
        if (cc != null && !cc.isEmpty()) System.out.println("Com cópia para: " + cc);
        if (anexos != null && !anexos.isEmpty()) System.out.println("Anexos: " + anexos);
        System.out.println("Formato HTML: " + formatoHtml);
    }

    public static class Builder {
        private final String para;
        private final String assunto;
        private String corpo;
        private List<String> cc;
        private List<String> anexos;
        private boolean formatoHtml;

        public Builder(String para, String assunto) {
            this.para = para;
            this.assunto = assunto;
        }

        public Builder corpo(String corpo) {
            this.corpo = corpo;
            return this;
        }

        public Builder cc(List<String> cc) {
            this.cc = cc;
            return this;
        }

        public Builder anexos(List<String> anexos) {
            this.anexos = anexos;
            return this;
        }

        public Builder formatoHtml(boolean formatoHtml) {
            this.formatoHtml = formatoHtml;
            return this;
        }

        public Email build() {
            return new Email(this);
        }
    }
}