package builder.example1;

public class Sanduiche {
    private final String pao;
    private final String carne;
    private final boolean queijo;
    private final boolean salada;
    private final boolean bacon;

    private Sanduiche(SanduicheBuilder builder) {
        this.pao = builder.pao;
        this.carne = builder.carne;
        this.queijo = builder.queijo;
        this.salada = builder.salada;
        this.bacon = builder.bacon;
    }

    public void mostrarPedido() {
        System.out.println("Sanduíche com: " + pao + ", " + carne +
                (queijo ? ", queijo" : "") +
                (salada ? ", salada" : "") +
                (bacon ? ", bacon" : ""));
    }

    // Builder interno
    public static class SanduicheBuilder {
        private String pao;
        private String carne;
        private boolean queijo;
        private boolean salada;
        private boolean bacon;

        public SanduicheBuilder(String pao, String carne) {
            this.pao = pao;
            this.carne = carne;
        }

        public SanduicheBuilder comQueijo() {
            this.queijo = true;
            return this;
        }

        public SanduicheBuilder comSalada() {
            this.salada = true;
            return this;
        }

        public SanduicheBuilder comBacon() {
            this.bacon = true;
            return this;
        }

        public Sanduiche build() {
            return new Sanduiche(this);
        }
    }
}