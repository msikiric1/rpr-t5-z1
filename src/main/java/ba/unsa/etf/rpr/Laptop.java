package ba.unsa.etf.rpr;

public class Laptop {
    private String brend;
    private String model;
    private Double cijena;
    private Integer ram;
    private Integer hdd;
    private Integer ssd;
    private String procesor;
    private String grafickaKartica;
    private Double velicinaEkrana;

    public static class LaptopBuilder {
        private String brend;
        private String model;

        // Optional parameters
        private Double cijena;
        private Integer ram;
        private Integer hdd;
        private Integer ssd;
        private String procesor;
        private String grafickaKartica;
        private Double velicinaEkrana;

        public LaptopBuilder(String brend, String model) {
            this.brend = brend;
            this.model = model;
        }

        public LaptopBuilder setBrend(String brend) {
            this.brend = brend;
            return this;
        }

        public LaptopBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public LaptopBuilder setCijena(Double cijena) {
            this.cijena = cijena;
            return this;
        }

        public LaptopBuilder setRam(Integer ram) {
            this.ram = ram;
            return this;
        }

        public LaptopBuilder setHdd(Integer hdd) {
            this.hdd = hdd;
            return this;
        }

        public LaptopBuilder setSsd(Integer ssd) {
            this.ssd = ssd;
            return this;
        }

        public LaptopBuilder setProcesor(String procesor) {
            this.procesor = procesor;
            return this;

        }

        public LaptopBuilder setGrafickaKartica(String grafickaKartica) {
            this.grafickaKartica = grafickaKartica;
            return this;
        }

        public LaptopBuilder setVelicinaEkrana(Double velicinaEkrana) {
            this.velicinaEkrana = velicinaEkrana;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }

    private Laptop(LaptopBuilder builder) {
        this.brend = builder.brend;
        this.model = builder.model;
        this.cijena = builder.cijena;
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.ssd = builder.ssd;
        this.procesor = builder.procesor;
        this.grafickaKartica = builder.grafickaKartica;
        this.velicinaEkrana = builder.velicinaEkrana;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", cijena=" + cijena +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", ssd=" + ssd +
                ", procesor='" + procesor + '\'' +
                ", grafickaKartica='" + grafickaKartica + '\'' +
                ", velicinaEkrana=" + velicinaEkrana +
                '}';
    }
}
